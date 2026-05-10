#version 150

uniform sampler2D DiffuseSampler;
uniform sampler2D ImageSampler;

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

vec3 imageColor() {
    return texture(ImageSampler, texCoord).rgb * outlineColor.rgb;
}

vec4 calculateInnerGlow() {
    vec4 centerTexel = texture(DiffuseSampler, texCoord);
    vec3 filledRgb = shaderFill != 0 ? imageColor() : fillColor.rgb;
    if (innerGlowEnabled != 0 && innerGlowThickness != 0) {
        vec4 bestOpaqueColor = vec4(filledRgb, centerTexel.a);
        float innerCoverage = computeInnerGlowIntensity(bestOpaqueColor);
        float innerEdge = computeInnerEdgeMask();
        float innerGlow = clamp(pow(max(innerCoverage, innerEdge), 0.35) * 1.9, 0.0, 1.0);
        filledRgb = mix(filledRgb, shaderFill != 0 ? imageColor() : fillColor.rgb, clamp(innerGlow * (0.55 + fillColor.a * 0.75), 0.0, 1.0));
    }
    float alpha = preserveMaskAlpha != 0 ? centerTexel.a : centerTexel.a * fillColor.a;
    return vec4(filledRgb, alpha);
}

vec4 calculateOuterOutline(vec4 color) {
    vec3 imageRgb = imageColor();
    for (int x = -lineWidth; x <= lineWidth; x++) {
        for (int y = -lineWidth; y <= lineWidth; y++) {
            vec4 sampledTexel = texture(DiffuseSampler, texCoord + texelSize * vec2(x, y));
            if (sampledTexel.a > 0.0) {
                color = vec4(imageRgb, sampledTexel.a * outlineColor.a);
            }
        }
    }
    return color;
}

vec4 calculateOuterGlow(vec4 color) {
    if (glowThickness != 0 && color.a == 0.0) {
        vec4 bestOpaqueColor = vec4(0.0);
        float glowIntensity = boostGlow(computeGlowIntensity(bestOpaqueColor));
        color = vec4(imageColor(), glowIntensity * outlineColor.a * clamp(bestOpaqueColor.a, 0.0, 1.0));
    }
    return color;
}

void main() {
    vec4 centerTexel = texture(DiffuseSampler, texCoord);
    vec4 color = centerTexel;

    if (color.a != 0.0) {
        color = calculateInnerGlow();
    } else {
        color = calculateOuterGlow(calculateOuterOutline(color));
    }

    fragColor = color;
}
