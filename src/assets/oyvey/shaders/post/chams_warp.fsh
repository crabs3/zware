#version 150

uniform sampler2D DiffuseSampler;

uniform int glowThickness;
uniform int innerGlowEnabled;
uniform int innerGlowThickness;
uniform int glowSampleStep;
uniform int lineWidth;
uniform int preserveMaskAlpha;

uniform float glowIntensityScale;
uniform vec4 fillColor;
uniform vec4 outlineColor;
uniform int shaderFill;
uniform vec2 texelSize;
uniform vec2 resolution;
uniform float time;
uniform float warpScale;
uniform float warpBumpFactor;
uniform int onlyFill;

in vec2 texCoord;

out vec4 fragColor;

vec4 selectBestOpaqueColor(inout vec4 bestOpaqueColor, vec4 texel) {
    bestOpaqueColor = texel.a != 0.0 ? texel : bestOpaqueColor;
    return texel;
}

float computeGlowCoverageForThickness(int thickness, inout vec4 bestOpaqueColor);

float computeGlowCoverage(inout vec4 bestOpaqueColor) {
    return computeGlowCoverageForThickness(glowThickness, bestOpaqueColor);
}

float computeGlowCoverageForThickness(int thickness, inout vec4 bestOpaqueColor) {
    if (thickness <= 0) {
        return 0.0;
    }

    int glowSampleRadius = glowSampleStep * thickness;
    vec2 neighborOffsets[8] = vec2[](
        vec2(glowSampleRadius, 0),
        vec2(-glowSampleRadius, 0),
        vec2(0, glowSampleRadius),
        vec2(0, -glowSampleRadius),
        vec2(glowSampleRadius, -glowSampleRadius),
        vec2(-glowSampleRadius, glowSampleRadius),
        vec2(glowSampleRadius, glowSampleRadius),
        vec2(-glowSampleRadius, -glowSampleRadius)
    );

    float accumulatedGlow = 0.0;
    for (int i = 0; i < 8; i++) {
        accumulatedGlow += sign(selectBestOpaqueColor(bestOpaqueColor, texture(DiffuseSampler, texCoord + texelSize * neighborOffsets[i])).a);
    }

    float glowContributionWeight = float((thickness * thickness) + thickness) * 4.0;
    for (int x = -glowSampleRadius; x <= glowSampleRadius; x += glowSampleStep) {
        for (int y = -glowSampleRadius; y <= glowSampleRadius; y += glowSampleStep) {
            if (x == 0 && y == 0) continue;
            if ((abs(x) == glowSampleRadius && abs(y) == glowSampleRadius) ||
                (abs(x) == glowSampleRadius && y == 0) ||
                (abs(y) == 0 && x == 0)) {
                continue;
            }

            accumulatedGlow += sign(selectBestOpaqueColor(bestOpaqueColor, texture(DiffuseSampler, texCoord + texelSize * vec2(x, y))).a);
        }
    }

    return clamp(accumulatedGlow / glowContributionWeight, 0.0, 1.0);
}

float computeGlowIntensity(inout vec4 bestOpaqueColor) {
    return glowIntensityScale * computeGlowCoverage(bestOpaqueColor);
}

float computeInnerGlowIntensity(inout vec4 bestOpaqueColor) {
    return glowIntensityScale * clamp(1.0 - computeGlowCoverageForThickness(innerGlowThickness, bestOpaqueColor), 0.0, 1.0);
}

float boostGlow(float glowIntensity) {
    return clamp(pow(glowIntensity, 0.72) * 1.35, 0.0, 1.0);
}

float computeInnerEdgeMask() {
    int edgeRadius = max(1, lineWidth + min(innerGlowThickness, 2));
    float transparentSamples = 0.0;
    float totalSamples = 0.0;

    for (int x = -edgeRadius; x <= edgeRadius; x++) {
        for (int y = -edgeRadius; y <= edgeRadius; y++) {
            if (x == 0 && y == 0) continue;

            float alpha = texture(DiffuseSampler, texCoord + texelSize * vec2(x, y)).a;
            transparentSamples += 1.0 - step(0.001, alpha);
            totalSamples += 1.0;
        }
    }

    if (totalSamples == 0.0) {
        return 0.0;
    }

    return clamp(transparentSamples / totalSamples, 0.0, 1.0);
}

vec2 warp(vec2 p) {
    p = (p + 3.0) * (4.0 * warpScale);

    float t = time * 0.5;
    for (int i = 0; i < 3; i++) {
        p += cos(p.yx * 3.0 + vec2(t, 1.57)) / 3.0;
        p += sin(p.yx + t + vec2(1.57, 0.0)) / 2.0;
        p *= 1.3;
    }

    p += fract(sin(p + vec2(13.0, 7.0)) * 500000.0) * 0.03 - 0.015;
    return mod(p, 2.0) - 1.0;
}

float bumpFunc(vec2 p) {
    return length(warp(p)) * 0.7071;
}

vec3 smoothFract(vec3 x) {
    x = fract(x);
    return min(x, x * (1.0 - x) * 12.0);
}

vec3 computeWarpMaterial() {
    vec2 fragCoord = texCoord * resolution;
    vec2 uv = (fragCoord - resolution * 0.5) / max(resolution.y, 1.0);

    vec3 sp = vec3(uv, 0.0);
    vec3 rd = normalize(vec3(uv, 1.0));
    vec3 lp = vec3(cos(time) * 0.5, sin(time) * 0.2, -1.0);
    vec3 sn = vec3(0.0, 0.0, -1.0);

    vec2 eps = vec2(4.0 / max(resolution.y, 1.0), 0.0);

    float f = bumpFunc(sp.xy);
    float fx = bumpFunc(sp.xy - eps.xy);
    float fy = bumpFunc(sp.xy - eps.yx);

    fx = (fx - f) / eps.x;
    fy = (fy - f) / eps.x;
    sn = normalize(sn + vec3(fx, fy, 0.0) * warpBumpFactor);

    vec3 ld = lp - sp;
    float lDist = max(length(ld), 0.0001);
    ld /= lDist;

    float atten = 1.0 / (1.0 + lDist * lDist * 0.15);
    atten *= f * 0.9 + 0.1;

    float diff = max(dot(sn, ld), 0.0);
    diff = pow(diff, 4.0) * 0.66 + pow(diff, 8.0) * 0.34;
    float spec = pow(max(dot(reflect(-ld, sn), -rd), 0.0), 12.0);

    vec3 texCol = smoothFract(warp(sp.xy).xyy) * 0.1 + 0.2;
    texCol = smoothstep(0.05, 0.75, pow(texCol, vec3(0.75, 0.8, 0.85)));

    vec3 col = (texCol * (diff * vec3(1.0, 0.97, 0.92) * 2.0 + 0.5) + vec3(1.0, 0.6, 0.2) * spec * 2.0) * atten;

    float ref = max(dot(reflect(rd, sn), vec3(1.0)), 0.0);
    col += col * pow(ref, 4.0) * vec3(0.25, 0.5, 1.0) * 3.0;

    col = sqrt(clamp(col, 0.0, 1.0));
    vec3 tint = mix(vec3(1.0), max(outlineColor.rgb, vec3(0.05)) * 1.25, 0.75);
    return clamp(col * tint, 0.0, 1.0);
}

vec4 calculateInnerGlow() {
    vec4 centerTexel = texture(DiffuseSampler, texCoord);
    vec3 surfaceColor = computeWarpMaterial();
    vec3 filledRgb = shaderFill != 0 ? surfaceColor : fillColor.rgb;
    if (innerGlowEnabled != 0 && innerGlowThickness != 0) {
        vec4 bestOpaqueColor = vec4(filledRgb, centerTexel.a);
        float innerCoverage = computeInnerGlowIntensity(bestOpaqueColor);
        float innerEdge = computeInnerEdgeMask();
        float innerGlow = clamp(pow(max(innerCoverage, innerEdge), 0.35) * 1.9, 0.0, 1.0);
        filledRgb = mix(filledRgb, shaderFill != 0 ? surfaceColor : fillColor.rgb, clamp(innerGlow * (0.55 + fillColor.a * 0.75), 0.0, 1.0));
    }
    float alpha = preserveMaskAlpha != 0 ? centerTexel.a : centerTexel.a * fillColor.a;
    return vec4(filledRgb, alpha);
}

vec4 calculateOuterOutline(vec4 color) {
    for (int x = -lineWidth; x <= lineWidth; x++) {
        for (int y = -lineWidth; y <= lineWidth; y++) {
            vec4 sampledTexel = texture(DiffuseSampler, texCoord + texelSize * vec2(x, y));
            if (sampledTexel.a > 0.0) {
                color = vec4(color.rgb, sampledTexel.a * outlineColor.a);
            }
        }
    }
    return color;
}

vec4 calculateOuterGlow(vec4 color) {
    if (glowThickness != 0 && color.a == 0.0) {
        vec4 bestOpaqueColor = vec4(color.rgb, 0.0);
        float glowIntensity = boostGlow(computeGlowIntensity(bestOpaqueColor));
        color = vec4(color.rgb, glowIntensity * outlineColor.a * clamp(bestOpaqueColor.a, 0.0, 1.0));
    }
    return color;
}

void main() {
    vec4 centerTexel = texture(DiffuseSampler, texCoord);
    vec3 surfaceColor = computeWarpMaterial();
    vec3 outlineRgb = onlyFill != 0 ? outlineColor.rgb : surfaceColor;
    vec4 color = vec4(surfaceColor, centerTexel.a);

    if (color.a != 0.0) {
        color = calculateInnerGlow();
    } else {
        color = calculateOuterGlow(calculateOuterOutline(vec4(outlineRgb, 0.0)));
    }

    fragColor = color;
}
