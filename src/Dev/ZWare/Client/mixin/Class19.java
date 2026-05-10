package Dev.ZWare.Client.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderPass;
import java.awt.Color;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.OutlineVertexConsumerProvider;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.profiler.Profiler;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WorldRenderer.class})
public abstract class Class19 {
   @Unique
   private boolean oyvey$customEntityOutlineThisFrame;

   @Shadow
   private void method_22977(Entity var1, double var2, double var4, double var6, float var8, MatrixStack var9, VertexConsumerProvider var10) {
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void resetChamsOutlineState(
      ObjectAllocator var1, RenderTickCounter var2, boolean var3, Camera var4, GameRenderer var5, Matrix4f var6, Matrix4f var7, CallbackInfo var8
   ) {
      this.oyvey$customEntityOutlineThisFrame = false;
      if (Dev.ZWare.Client.Class1.field_306 != null) {
         Dev.ZWare.Client.Class1.field_306.method_791();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void render(
      ObjectAllocator var1,
      RenderTickCounter var2,
      boolean var3,
      Camera var4,
      GameRenderer var5,
      Matrix4f var6,
      Matrix4f var7,
      CallbackInfo var8,
      @Local Profiler var9
   ) {
      MatrixStack var10 = new MatrixStack();
      var10.method_22903();
      var10.method_22907(RotationAxis.field_40714.rotationDegrees(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1773.method_19418().method_19329()));
      var10.method_22907(RotationAxis.field_40716.rotationDegrees(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1773.method_19418().method_19330() + 180.0F));
      var9.method_15396("oyvey-render-3d");
      Dev.ZWare.Client.pkg2.pkg1.Class14 var11 = new Dev.ZWare.Client.pkg2.pkg1.Class14(var10, var2.method_60637(true));
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var11);
      var10.method_22909();
      if (Dev.ZWare.Client.Class1.field_306 != null) {
         Dev.ZWare.Client.Class1.field_306.method_798(var2.method_60637(true));
      }

      var9.method_15407();
   }

   @ModifyArg(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gl/ShaderLoader;loadPostEffect(Lnet/minecraft/util/Identifier;Ljava/util/Set;)Lnet/minecraft/client/gl/PostEffectProcessor;",
         ordinal = 0
      ),
      index = 0
   )
   private Identifier useChamsWorldOutlineEffect(Identifier var1) {
      return this.oyvey$customEntityOutlineThisFrame ? Dev.ZWare.Client.pkg1.pkg2.pkg1.Class2.method_982() : var1;
   }

   @ModifyArg(
      method = {"render"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gl/PostEffectProcessor;render(Lnet/minecraft/client/render/FrameGraphBuilder;IILnet/minecraft/client/gl/PostEffectProcessor$FramebufferSet;Ljava/util/function/Consumer;)V",
         ordinal = 0
      ),
      index = 4
   )
   private Consumer<RenderPass> useChamsWorldOutlineUniforms(Consumer<RenderPass> var1) {
      return this.oyvey$customEntityOutlineThisFrame ? Dev.ZWare.Client.pkg1.pkg2.pkg1.Class2.method_983() : var1;
   }

   @Redirect(
      method = {"renderEntities"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;getTeamColorValue()I"
      )
   )
   private int getChamsOutlineColor(Entity var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class7 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class7.method_2201();
      if (var2 != null && var2.method_2215() && var2.method_2217(var1)) {
         this.oyvey$customEntityOutlineThisFrame = true;
         return var2.method_2222().getRGB();
      } else {
         return var1.method_22861();
      }
   }

   @Redirect(
      method = {"renderEntities"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/WorldRenderer;renderEntity(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"
      )
   )
   private void renderChamsCapturedEntity(
      WorldRenderer var1,
      Entity var2,
      double var3,
      double var5,
      double var7,
      float var9,
      MatrixStack var10,
      VertexConsumerProvider var11,
      MatrixStack var12,
      Immediate var13,
      Camera var14,
      RenderTickCounter var15,
      List<Entity> var16
   ) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class7 var17 = Dev.ZWare.Client.features.pkg1.pkg5.Class7.method_2201();
      if (var17 == null) {
         this.method_22977(var2, var3, var5, var7, var9, var10, var11);
      } else {
         boolean var18 = var17.method_2219(var2);
         boolean var19 = Dev.ZWare.Client.Class1.field_306 != null && var17.method_2218(var2);
         if (!var18 && !var19) {
            this.method_22977(var2, var3, var5, var7, var9, var10, var11);
         } else {
            this.method_22977(var2, var3, var5, var7, var9, var10, var11);
            var13.method_22993();
            if (!var19) {
               if (var18) {
                  this.oyvey$renderLegacyEntityThroughWalls(var2, var3, var5, var7, var9, var10, var13, var17);
               }
            } else if (Dev.ZWare.Client.Class1.field_306.method_792()) {
               boolean var20 = (Boolean)Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1690.method_42435().method_41753();
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1561().method_3948(false);
               if (var18) {
                  GlStateManager._disableDepthTest();
                  GlStateManager._depthMask(false);
               }

               try {
                  this.method_22977(var2, var3, var5, var7, var9, var10, var13);
                  var13.method_22993();
               } finally {
                  if (var18) {
                     GlStateManager._depthMask(true);
                     GlStateManager._enableDepthTest();
                  }

                  Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1561().method_3948(var20);
                  Dev.ZWare.Client.Class1.field_306.method_795();
               }
            }
         }
      }
   }

   @Unique
   private void oyvey$renderLegacyEntityThroughWalls(
      Entity var1, double var2, double var4, double var6, float var8, MatrixStack var9, Immediate var10, Dev.ZWare.Client.features.pkg1.pkg5.Class7 var11
   ) {
      OutlineVertexConsumerProvider var12 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_22940().method_23003();
      Color var13 = var11.method_2222();
      var12.method_23286(var13.getRed(), var13.getGreen(), var13.getBlue(), var13.getAlpha());
      boolean var14 = (Boolean)Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1690.method_42435().method_41753();
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1561().method_3948(false);
      GlStateManager._disableDepthTest();
      GlStateManager._depthMask(false);

      try {
         this.method_22977(var1, var2, var4, var6, var8, var9, var12);
         var10.method_22993();
         var12.method_23285();
      } finally {
         GlStateManager._depthMask(true);
         GlStateManager._enableDepthTest();
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1561().method_3948(var14);
      }
   }
}
