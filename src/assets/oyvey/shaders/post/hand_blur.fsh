#version 150

uniform sampler2D InSampler;
uniform vec2 InSize;
uniform vec2 BlurDir;

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

float gaussian(float x, float sigma) {
    return exp(-(x * x) / (2.0 * sigma * sigma));
}

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
    float radius = max(1.0, u_BloomRadius);
    float sigma = max(radius * 0.65, 1.0);
    vec2 sampleStep = BlurDir / InSize;

    vec4 blurred = vec4(0.0);
    float weightSum = 0.0;
    for (int i = -10; i <= 10; i++) {
        float offset = float(i);
        if (abs(offset) > radius) {
            continue;
        }

        float weight = gaussian(offset, sigma);
        blurred += texture(InSampler, texCoord + sampleStep * offset) * weight;
        weightSum += weight;
    }

    fragColor = blurred / max(weightSum, 0.0001);
    fragColor.a = clamp(fragColor.a + keeper, 0.0, 1.0);
}
