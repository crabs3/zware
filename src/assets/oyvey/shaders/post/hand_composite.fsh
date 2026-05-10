#version 150

uniform sampler2D HandsSampler;
uniform sampler2D BloomSampler;
uniform sampler2D AuraSampler;

uniform float u_BloomRadius;
uniform float u_BloomIntensity;
uniform float u_AuraIntensity;
uniform float u_OutlineIntensity;
uniform float u_OutlineWidth;
uniform vec4 u_PrimaryColor;
uniform vec4 u_SecondaryColor;
uniform vec4 u_OutlineColor;

in vec2 texCoord;

out vec4 fragColor;

float keepUniformsAlive() {
    float keep = 0.0;
    if (u_BloomRadius < 0.0) {
        keep += u_PrimaryColor.r + u_SecondaryColor.g + u_OutlineColor.b;
        keep += u_BloomIntensity + u_AuraIntensity + u_OutlineIntensity + u_OutlineWidth;
    }
    return keep;
}

void main() {
    float keeper = keepUniformsAlive() * 0.0;
    vec4 hands = texture(HandsSampler, texCoord);
    vec4 bloom = texture(BloomSampler, texCoord);
    vec4 aura = texture(AuraSampler, texCoord);

    float outlineAlpha = clamp(aura.a * u_OutlineIntensity, 0.0, 0.9);
    float bloomAlpha = clamp(bloom.a * u_BloomIntensity, 0.0, 0.78);

    vec3 auraColor = mix(aura.rgb, u_OutlineColor.rgb, 0.55);
    float effectWeight = max(outlineAlpha, bloomAlpha);
    vec3 effectColor = effectWeight > 0.0001
        ? (auraColor * outlineAlpha + bloom.rgb * bloomAlpha) / effectWeight
        : mix(u_SecondaryColor.rgb, u_PrimaryColor.rgb, 0.5);
    vec3 finalColor = effectColor;
    float finalAlpha = max(outlineAlpha, bloomAlpha);

    if (hands.a > 0.001) {
        float surfaceMix = clamp(u_AuraIntensity * 0.24 + bloomAlpha * 0.08, 0.0, 0.32);
        vec3 shadedHands = mix(mix(u_SecondaryColor.rgb, u_PrimaryColor.rgb, 0.18), mix(u_SecondaryColor.rgb, u_PrimaryColor.rgb, 0.45), surfaceMix);
        finalColor = mix(effectColor, shadedHands, 0.74 + hands.a * 0.26);
        finalAlpha = max(finalAlpha, hands.a);
    }

    fragColor = vec4(finalColor, clamp(finalAlpha + keeper, 0.0, 1.0));
}
