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
    float alpha = base.a;
    if (alpha <= 0.001) {
        fragColor = vec4(0.0, 0.0, 0.0, keeper);
        return;
    }

    vec2 texel = 1.0 / InSize;
    float neighbor = 0.0;
    neighbor = max(neighbor, texture(InSampler, texCoord + vec2(texel.x, 0.0)).a);
    neighbor = max(neighbor, texture(InSampler, texCoord - vec2(texel.x, 0.0)).a);
    neighbor = max(neighbor, texture(InSampler, texCoord + vec2(0.0, texel.y)).a);
    neighbor = max(neighbor, texture(InSampler, texCoord - vec2(0.0, texel.y)).a);
    neighbor = max(neighbor, texture(InSampler, texCoord + texel).a);
    neighbor = max(neighbor, texture(InSampler, texCoord - texel).a);
    neighbor = max(neighbor, texture(InSampler, texCoord + vec2(texel.x, -texel.y)).a);
    neighbor = max(neighbor, texture(InSampler, texCoord + vec2(-texel.x, texel.y)).a);

    float edge = clamp(neighbor - alpha * 0.65, 0.0, 1.0);
    float luma = dot(base.rgb, vec3(0.299, 0.587, 0.114));
    float mask = clamp(alpha * (0.24 + luma * 0.28) + edge * 0.72, 0.0, 1.0);

    vec4 tint = mix(u_SecondaryColor, u_PrimaryColor, clamp(edge * 0.75 + alpha * 0.25, 0.0, 1.0));
    fragColor = vec4(tint.rgb, clamp(mask * tint.a + keeper, 0.0, 1.0));
}
