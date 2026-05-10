package Dev.ZWare.Client.pkg1.pkg2;

import Dev.ZWare.Client.mixin.Class38;
import Dev.ZWare.Client.mixin.Class50;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPart.Cuboid;
import net.minecraft.client.model.ModelPart.Quad;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.Layering;
import net.minecraft.client.render.RenderPhase.LineWidth;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class Class3 {
   // $VF: renamed from: a net.minecraft.client.util.math.MatrixStack
   private static final MatrixStack field_132 = new MatrixStack();
   // $VF: renamed from: b org.joml.Vector4f
   private static final Vector4f field_133 = new Vector4f();
   // $VF: renamed from: c org.joml.Vector4f
   private static final Vector4f field_134 = new Vector4f();
   // $VF: renamed from: d org.joml.Vector4f
   private static final Vector4f field_135 = new Vector4f();
   // $VF: renamed from: e org.joml.Vector4f
   private static final Vector4f field_136 = new Vector4f();
   // $VF: renamed from: f com.mojang.blaze3d.pipeline.RenderPipeline
   private static final RenderPipeline field_137 = RenderPipeline.builder(new Snippet[]{RenderPipelines.field_56860})
      .withLocation("pipeline/wireframe_entity_quads_no_depth")
      .withVertexFormat(VertexFormats.field_1576, DrawMode.field_27382)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withCull(false)
      .build();
   // $VF: renamed from: g com.mojang.blaze3d.pipeline.RenderPipeline
   private static final RenderPipeline field_138 = RenderPipeline.builder(new Snippet[]{RenderPipelines.field_56860})
      .withLocation("pipeline/wireframe_entity_quads_depth")
      .withVertexFormat(VertexFormats.field_1576, DrawMode.field_27382)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withCull(false)
      .build();
   // $VF: renamed from: h com.mojang.blaze3d.pipeline.RenderPipeline
   private static final RenderPipeline field_139 = RenderPipeline.builder(new Snippet[]{RenderPipelines.field_56859})
      .withLocation("pipeline/wireframe_entity_lines_no_depth")
      .withVertexFormat(VertexFormats.field_29337, DrawMode.field_27377)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withCull(false)
      .build();
   // $VF: renamed from: i com.mojang.blaze3d.pipeline.RenderPipeline
   private static final RenderPipeline field_140 = RenderPipeline.builder(new Snippet[]{RenderPipelines.field_56859})
      .withLocation("pipeline/wireframe_entity_lines_depth")
      .withVertexFormat(VertexFormats.field_29337, DrawMode.field_27377)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withDepthWrite(false)
      .withCull(false)
      .build();
   // $VF: renamed from: j java.util.function.Function
   private static final Function<Boolean, RenderLayer> field_141 = Util.method_34866(
      var0 -> RenderLayer.method_24048(
         var0 ? "wireframe_entity_quads_no_depth" : "wireframe_entity_quads_depth",
         1536,
         var0 ? field_137 : field_138,
         MultiPhaseParameters.method_23598().method_23617(false)
      )
   );
   // $VF: renamed from: k net.minecraft.client.render.RenderPhase.Layering
   private static final Layering field_142 = new Layering("wireframe_entity_line_offset", () -> {
      GlStateManager._enablePolygonOffset();
      GlStateManager._polygonOffset(-1.0F, -10.0F);
   }, () -> {
      GlStateManager._polygonOffset(0.0F, 0.0F);
      GlStateManager._disablePolygonOffset();
   });
   // $VF: renamed from: l java.util.function.Function
   private static final Function<Class3.Inner1, RenderLayer> field_143 = Util.method_34866(
      var0 -> RenderLayer.method_24048(
         var0.field_865 ? "wireframe_entity_lines_no_depth" : "wireframe_entity_lines_depth",
         1536,
         var0.field_865 ? field_139 : field_140,
         MultiPhaseParameters.method_23598()
            .method_23609(new LineWidth(OptionalDouble.of(var0.field_864)))
            .method_23607(var0.field_865 ? new Layering("wireframe_entity_no_line_offset", () -> {}, () -> {}) : field_142)
            .method_23617(false)
      )
   );

   private Class3() {
   }

   // $VF: renamed from: a (net.minecraft.client.network.AbstractClientPlayerEntity, float) Dev.ZWare.Client.pkg1.pkg2.Class3$Inner2
   public static Class3.Inner2 method_280(AbstractClientPlayerEntity player, float tickDelta) {
      if (player == null) {
         return Class3.Inner2.field_837;
      } else {
         MinecraftClient var2 = MinecraftClient.method_1551();
         if (var2 != null && var2.method_1561().method_3953(player) instanceof PlayerEntityRenderer var3) {
            PlayerEntityRenderState var7 = var3.method_62608();
            var3.method_62604(player, var7, tickDelta);
            var7.field_53462 = false;
            Vec3d var5 = var3.method_23206(var7);
            Vec3d var6 = new Vec3d(var7.field_53325 + var5.field_1352, var7.field_53326 + var5.field_1351, var7.field_53327 + var5.field_1350);
            return new Class3.Inner2(method_281(var3, var7), var6);
         } else {
            return Class3.Inner2.field_837;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.render.entity.PlayerEntityRenderer, net.minecraft.client.render.entity.state.PlayerEntityRenderState) java.util.List
   public static List<Class3.Inner4> method_281(PlayerEntityRenderer renderer, PlayerEntityRenderState state) {
      ArrayList var2 = new ArrayList();
      field_132.method_22903();

      try {
         if (state.method_62613(EntityPose.field_18078) && state.field_53463 != null) {
            float var3 = state.field_53331 - 0.1F;
            field_132.method_46416(-state.field_53463.method_10148() * var3, 0.0F, -state.field_53463.method_10165() * var3);
         }

         field_132.method_22905(state.field_53453, state.field_53453, state.field_53453);
         Class50 var8 = (Class50)renderer;
         var8.invokeSetupTransforms(state, field_132, state.field_53446, state.field_53453);
         field_132.method_22905(-1.0F, -1.0F, 1.0F);
         var8.invokeScale(state, field_132);
         field_132.method_46416(0.0F, -1.501F, 0.0F);
         PlayerEntityModel var4 = (PlayerEntityModel)renderer.method_4038();
         var4.method_62110(state);
         method_282(var2, var4.field_3398);
         method_282(var2, var4.field_3394);
         method_282(var2, var4.field_3391);
         method_282(var2, var4.field_3483);
         method_282(var2, var4.field_27433);
         method_282(var2, var4.field_3484);
         method_282(var2, var4.field_3401);
         method_282(var2, var4.field_3486);
         method_282(var2, var4.field_3397);
         method_282(var2, var4.field_3482);
         method_282(var2, var4.field_3392);
         method_282(var2, var4.field_3479);
      } finally {
         field_132.method_22909();
      }

      return var2;
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.client.model.ModelPart) void
   private static void method_282(List<Class3.Inner4> var0, ModelPart var1) {
      if (var1.field_3665 && !var1.method_32087()) {
         var1.method_35745(field_132, (var1x, var2, var3, var4) -> var0.add(new Class3.Inner4(new Matrix4f(var1x.method_23761()), var4)));
      }
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Vec3d, java.util.List, double, java.awt.Color, java.awt.Color, Dev.ZWare.Client.pkg1.pkg2.Class3$Inner5, float, boolean) void
   public static void method_283(
      MatrixStack matrices,
      Vec3d offset,
      List<Class3.Inner4> parts,
      double scale,
      Color sideColor,
      Color lineColor,
      Class3.Inner5 shapeMode,
      float lineWidth,
      boolean throughWalls
   ) {
      boolean var10 = shapeMode.method_1111() && sideColor.getAlpha() > 0;
      boolean var11 = shapeMode.method_1110() && lineColor.getAlpha() > 0 && lineWidth > 0.0F;
      if (var10 || var11) {
         BufferBuilder var12 = var10 ? Tessellator.method_1348().method_60827(DrawMode.field_27382, VertexFormats.field_1576) : null;
         BufferBuilder var13 = var11 ? Tessellator.method_1348().method_60827(DrawMode.field_27377, VertexFormats.field_29337) : null;
         HashSet var14 = var11 ? new HashSet() : null;
         matrices.method_22903();

         try {
            matrices.method_22904(offset.field_1352, offset.field_1351, offset.field_1350);
            matrices.method_22905((float)scale, (float)scale, (float)scale);

            for (Class3.Inner4 var16 : parts) {
               matrices.method_22903();
               matrices.method_34425(var16.field_81);
               method_284(matrices.method_23760().method_23761(), var16.field_82, var12, var13, var14, sideColor, lineColor);
               matrices.method_22909();
            }
         } finally {
            matrices.method_22909();
         }

         if (var12 != null) {
            field_141.apply(throughWalls).method_60895(var12.method_60800());
         }

         if (var13 != null) {
            field_143.apply(new Class3.Inner1(lineWidth, throughWalls)).method_60895(var13.method_60800());
         }
      }
   }

   // $VF: renamed from: a (org.joml.Matrix4f, net.minecraft.client.model.ModelPart.Cuboid, net.minecraft.client.render.BufferBuilder, net.minecraft.client.render.BufferBuilder, java.util.Set, java.awt.Color, java.awt.Color) void
   private static void method_284(Matrix4f var0, Cuboid var1, BufferBuilder var2, BufferBuilder var3, Set<Class3.Inner3> var4, Color var5, Color var6) {
      for (Quad var10 : ((Class38)var1).oyvey$getSides()) {
         method_285(var10.comp_3184()[0].comp_3186(), var0, field_133);
         method_285(var10.comp_3184()[1].comp_3186(), var0, field_134);
         method_285(var10.comp_3184()[2].comp_3186(), var0, field_135);
         method_285(var10.comp_3184()[3].comp_3186(), var0, field_136);
         if (var2 != null) {
            method_286(var2, field_133, var5);
            method_286(var2, field_134, var5);
            method_286(var2, field_135, var5);
            method_286(var2, field_136, var5);
         }

         if (var3 != null) {
            method_287(var3, var4, field_133, field_134, var6);
            method_287(var3, var4, field_134, field_135, var6);
            method_287(var3, var4, field_135, field_136, var6);
            method_287(var3, var4, field_136, field_133, var6);
         }
      }
   }

   // $VF: renamed from: a (org.joml.Vector3f, org.joml.Matrix4f, org.joml.Vector4f) void
   private static void method_285(Vector3f var0, Matrix4f var1, Vector4f var2) {
      var2.set(var0.x() / 16.0F, var0.y() / 16.0F, var0.z() / 16.0F, 1.0F);
      var2.mul(var1);
   }

   // $VF: renamed from: a (net.minecraft.client.render.BufferBuilder, org.joml.Vector4f, java.awt.Color) void
   private static void method_286(BufferBuilder var0, Vector4f var1, Color var2) {
      var0.method_22912(var1.x, var1.y, var1.z).method_39415(var2.getRGB());
   }

   // $VF: renamed from: a (net.minecraft.client.render.BufferBuilder, java.util.Set, org.joml.Vector4f, org.joml.Vector4f, java.awt.Color) void
   private static void method_287(BufferBuilder var0, Set<Class3.Inner3> var1, Vector4f var2, Vector4f var3, Color var4) {
      if (var1 == null || var1.add(Class3.Inner3.method_1388(var2, var3))) {
         float var5 = var3.x - var2.x;
         float var6 = var3.y - var2.y;
         float var7 = var3.z - var2.z;
         float var8 = MathHelper.method_15355(var5 * var5 + var6 * var6 + var7 * var7);
         float var9 = var8 > 1.0E-5F ? var5 / var8 : 0.0F;
         float var10 = var8 > 1.0E-5F ? var6 / var8 : 0.0F;
         float var11 = var8 > 1.0E-5F ? var7 / var8 : 0.0F;
         var0.method_22912(var2.x, var2.y, var2.z).method_39415(var4.getRGB()).method_22914(var9, var10, var11);
         var0.method_22912(var3.x, var3.y, var3.z).method_39415(var4.getRGB()).method_22914(var9, var10, var11);
      }
   }

   private record Inner1(float dQ, boolean dR) {
      // $VF: renamed from: dQ float
      private final float field_864;
      // $VF: renamed from: dR boolean
      private final boolean field_865;

      private Inner1(float dQ, boolean dR) {
         this.field_864 = dQ;
         this.field_865 = dR;
      }

      // $VF: renamed from: dQ () float
      public float method_1386() {
         return this.field_864;
      }

      // $VF: renamed from: dR () boolean
      public boolean method_1387() {
         return this.field_865;
      }
   }

   public record Inner2(List<Class3.Inner4> dS, Vec3d dT) {
      // $VF: renamed from: dS java.util.List
      private final List<Class3.Inner4> field_835;
      // $VF: renamed from: dT net.minecraft.util.math.Vec3d
      private final Vec3d field_836;
      // $VF: renamed from: a Dev.ZWare.Client.pkg1.pkg2.Class3$Inner2
      private static final Class3.Inner2 field_837 = new Class3.Inner2(List.of(), null);

      public Inner2(List<Class3.Inner4> dS, Vec3d dT) {
         this.field_835 = dS;
         this.field_836 = dT;
      }

      // $VF: renamed from: dS () java.util.List
      public List<Class3.Inner4> method_1352() {
         return this.field_835;
      }

      // $VF: renamed from: dT () net.minecraft.util.math.Vec3d
      public Vec3d method_1353() {
         return this.field_836;
      }
   }

   private record Inner3(int dK, int dL, int dM, int dN, int dO, int dP) {
      // $VF: renamed from: dK int
      private final int field_866;
      // $VF: renamed from: dL int
      private final int field_867;
      // $VF: renamed from: dM int
      private final int field_868;
      // $VF: renamed from: dN int
      private final int field_869;
      // $VF: renamed from: dO int
      private final int field_870;
      // $VF: renamed from: dP int
      private final int field_871;
      // $VF: renamed from: a float
      private static final float field_872 = 10000.0F;

      private Inner3(int dK, int dL, int dM, int dN, int dO, int dP) {
         this.field_866 = dK;
         this.field_867 = dL;
         this.field_868 = dM;
         this.field_869 = dN;
         this.field_870 = dO;
         this.field_871 = dP;
      }

      // $VF: renamed from: a (org.joml.Vector4f, org.joml.Vector4f) Dev.ZWare.Client.pkg1.pkg2.Class3$Inner3
      private static Class3.Inner3 method_1388(Vector4f var0, Vector4f var1) {
         int var2 = method_1389(var0.x);
         int var3 = method_1389(var0.y);
         int var4 = method_1389(var0.z);
         int var5 = method_1389(var1.x);
         int var6 = method_1389(var1.y);
         int var7 = method_1389(var1.z);
         return method_1390(var2, var3, var4, var5, var6, var7) <= 0
            ? new Class3.Inner3(var2, var3, var4, var5, var6, var7)
            : new Class3.Inner3(var5, var6, var7, var2, var3, var4);
      }

      // $VF: renamed from: a (float) int
      private static int method_1389(float var0) {
         return Math.round(var0 * 10000.0F);
      }

      // $VF: renamed from: a (int, int, int, int, int, int) int
      private static int method_1390(int var0, int var1, int var2, int var3, int var4, int var5) {
         if (var0 != var3) {
            return Integer.compare(var0, var3);
         } else if (var1 != var4) {
            return Integer.compare(var1, var4);
         } else {
            return var2 != var5 ? Integer.compare(var2, var5) : 0;
         }
      }

      // $VF: renamed from: dK () int
      public int method_1391() {
         return this.field_866;
      }

      // $VF: renamed from: dL () int
      public int method_1392() {
         return this.field_867;
      }

      // $VF: renamed from: dM () int
      public int method_1393() {
         return this.field_868;
      }

      // $VF: renamed from: dN () int
      public int method_1394() {
         return this.field_869;
      }

      // $VF: renamed from: dO () int
      public int method_1395() {
         return this.field_870;
      }

      // $VF: renamed from: dP () int
      public int method_1396() {
         return this.field_871;
      }
   }

   public static final class Inner4 {
      // $VF: renamed from: a org.joml.Matrix4f
      private final Matrix4f field_81;
      // $VF: renamed from: b net.minecraft.client.model.ModelPart.Cuboid
      private final Cuboid field_82;

      private Inner4(Matrix4f var1, Cuboid var2) {
         this.field_81 = var1;
         this.field_82 = var2;
      }
   }

   public static enum Inner5 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1110() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1111() {
         return this == Sides || this == Both;
      }
   }
}
