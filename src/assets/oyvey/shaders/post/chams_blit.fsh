#version 150

uniform sampler2D InSampler;
uniform sampler2D ImageSampler;

uniform int glowThickness;
uniform int glowSampleStep;
uniform int shaderFill;
uniform float glowIntensityScale;
uniform vec4 fillColor;
uniform vec4 outlineColor;
uniform vec2 texelSize;
uniform vec2 resolution;
uniform float time;
uniform float saturation;
uniform float lightness;
uniform float factor;

in vec2 texCoord;

out vec4 fragColor;

float keepUniformsAlive() {
    float keep = 0.0;
    if (glowThickness < 0) {
        keep += glowIntensityScale + fillColor.a + outlineColor.a + texelSize.x + resolution.x;
        keep += float(shaderFill);
        keep += time + saturation + lightness + factor + float(glowSampleStep);
        keep += texture(ImageSampler, texCoord).a;
    }
    return keep;
}

void main() {
    vec4 color = texture(InSampler, texCoord);
    fragColor = vec4(color.rgb, clamp(color.a + keepUniformsAlive() * 0.0, 0.0, 1.0));
}
