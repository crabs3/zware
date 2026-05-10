package Dev.ZWare.Client.pkg1.pkg2;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.VertexFormats;

class Class6 {
   // $VF: renamed from: a com.mojang.blaze3d.pipeline.RenderPipeline
   static final RenderPipeline field_215 = RenderPipeline.builder(new Snippet[]{RenderPipelines.field_56860})
      .withLocation("pipeline/global_fill_pipeline")
      .withVertexFormat(VertexFormats.field_1576, DrawMode.field_27382)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withCull(false)
      .build();
   // $VF: renamed from: b com.mojang.blaze3d.pipeline.RenderPipeline
   static final RenderPipeline field_216 = RenderPipeline.builder(new Snippet[]{RenderPipelines.field_56859})
      .withLocation("pipeline/global_lines_pipeline")
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withCull(false)
      .build();
}
