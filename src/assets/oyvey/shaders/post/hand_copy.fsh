#version 150

uniform sampler2D InSampler;

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
    vec4 color = texture(InSampler, texCoord);
    fragColor = vec4(color.rgb, clamp(color.a + keeper, 0.0, 1.0));
}
