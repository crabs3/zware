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
uniform vec2 mouse;

in vec2 texCoord;

out vec4 fragColor;

float Hash3d(vec3 uv) {
    float f = uv.x + uv.y * 37.0 + uv.z * 521.0;
    return fract(cos(f * 3.333) * 100003.9);
}

float mixP(float f0, float f1, float a) {
    return mix(f0, f1, a * a * (3.0 - 2.0 * a));
}

const vec2 ZERO_ONE = vec2(0.0, 1.0);
const float PI = 3.14159265;

float noise3d(vec3 uv) {
    vec3 fr = fract(uv);
    vec3 fl = floor(uv);
    float h000 = Hash3d(fl);
    float h100 = Hash3d(fl + ZERO_ONE.yxx);
    float h010 = Hash3d(fl + ZERO_ONE.xyx);
    float h110 = Hash3d(fl + ZERO_ONE.yyx);
    float h001 = Hash3d(fl + ZERO_ONE.xxy);
    float h101 = Hash3d(fl + ZERO_ONE.yxy);
    float h011 = Hash3d(fl + ZERO_ONE.xyy);
    float h111 = Hash3d(fl + ZERO_ONE.yyy);
    return mixP(
        mixP(mixP(h000, h100, fr.x), mixP(h010, h110, fr.x), fr.y),
        mixP(mixP(h001, h101, fr.x), mixP(h011, h111, fr.x), fr.y),
        fr.z
    );
}

float nebulaDensity(vec3 p) {
    float finalValue = noise3d(p * 0.06125);
    float other = noise3d(p * 0.06125 + 1234.567);
    other -= 0.5;
    finalValue -= 0.5;
    finalValue = 0.1 / abs(finalValue * finalValue * other);
    finalValue += 0.5;
    return finalValue * 0.0001;
}

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

vec3 computeNebulaMaterial() {
    vec2 fragCoord = texCoord * resolution;
    vec2 uv = fragCoord / max(resolution, vec2(1.0)) * 2.0 - 1.0;

    vec3 camUp = vec3(0.0, 1.0, 0.0);
    vec3 camLookat = vec3(0.0, 0.0, 0.0);

    float mx = mouse.x / max(resolution.x, 1.0) * PI * 2.0 + time * 0.01;
    float my = -mouse.y / max(resolution.y, 1.0) * 10.0 + sin(time * 0.03) * 0.2 + 0.2;
    vec3 camPos = vec3(cos(my) * cos(mx), sin(my), cos(my) * sin(mx)) * 200.2;

    vec3 camVec = normalize(camLookat - camPos);
    vec3 sideNorm = normalize(cross(camUp, camVec));
    vec3 upNorm = cross(camVec, sideNorm);
    vec3 worldFacing = camPos + camVec;
    vec3 worldPix = worldFacing + uv.x * sideNorm * (resolution.x / max(resolution.y, 1.0)) + uv.y * upNorm;
    vec3 relVec = normalize(worldPix - camPos);

    float t = 0.0;
    float inc = 0.02;
    float maxDepth = 70.0;
    float density = 0.0;

    for (int i = 0; i < 37; i++) {
        if (t > maxDepth) {
            break;
        }

        vec3 pos = camPos + relVec * t;
        float sampleDensity = nebulaDensity(pos);
        inc = 1.9 + sampleDensity * 0.05;
        density += sampleDensity * inc;
        t += inc;
    }

    vec3 finalColor = vec3(0.01, 0.1, 1.0) * density * 0.2;
    vec3 nebula = sqrt(clamp(finalColor, 0.0, 1.0));
    vec3 tint = mix(vec3(1.0), max(outlineColor.rgb, vec3(0.05)) * 1.35, 0.55);
    return clamp(nebula * tint * 1.25, 0.0, 1.0);
}

vec4 calculateInnerGlow() {
    vec4 centerTexel = texture(DiffuseSampler, texCoord);
    vec3 surfaceColor = computeNebulaMaterial();
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
    vec3 surfaceColor = computeNebulaMaterial();
    vec3 outlineRgb = mix(surfaceColor, outlineColor.rgb, 0.35);
    vec4 color = vec4(surfaceColor, centerTexel.a);

    if (color.a != 0.0) {
        color = calculateInnerGlow();
    } else {
        color = calculateOuterGlow(calculateOuterOutline(vec4(outlineRgb, 0.0)));
    }

    fragColor = color;
}
