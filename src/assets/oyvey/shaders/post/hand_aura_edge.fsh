#version 150

uniform sampler2D InSampler;
uniform vec2 InSize;

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
    vec4 base = texture(InSampler, texCoord);
    float center = base.a;
    vec2 texel = 1.0 / InSize;
    float radius = max(u_OutlineWidth, 0.5);

    float expanded = 0.0;
    vec2 offsets[8] = vec2[8](
        vec2(1.0, 0.0),
        vec2(-1.0, 0.0),
        vec2(0.0, 1.0),
        vec2(0.0, -1.0),
        normalize(vec2(1.0, 1.0)),
        normalize(vec2(-1.0, 1.0)),
        normalize(vec2(1.0, -1.0)),
        normalize(vec2(-1.0, -1.0))
    );

    for (int i = 0; i < 8; i++) {
        vec2 sampleUv = texCoord + offsets[i] * texel * radius;
        expanded = max(expanded, texture(InSampler, sampleUv).a);
    }

    float ring = smoothstep(0.02, 0.72, clamp(expanded - center, 0.0, 1.0));
    float halo = smoothstep(0.0, 0.5, expanded) * (1.0 - smoothstep(0.0, 0.9, center));
    vec4 tint = mix(u_SecondaryColor, u_OutlineColor, 0.88);
    float alpha = (ring * 0.95 + halo * 0.18) * tint.a * u_OutlineIntensity;

    fragColor = vec4(tint.rgb, clamp(alpha + keeper, 0.0, 1.0));
}
