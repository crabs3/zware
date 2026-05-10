package Dev.ZWare.Client.mixin;

import java.awt.Color;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LightningEntityRenderer;
import net.minecraft.client.render.entity.state.LightningEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LightningEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LightningEntityRenderer.class})
public abstract class Class21 {
   @Unique
   private static final ThreadLocal<Color> oyvey$currentLightningColor = new ThreadLocal<>();

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/entity/LightningEntity;Lnet/minecraft/client/render/entity/state/LightningEntityRenderState;F)V"},
      at = {@At("TAIL")}
   )
   private void markDeathEffectLightning(LightningEntity var1, LightningEntityRenderState var2, float var3, CallbackInfo var4) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class5 var5 = Dev.ZWare.Client.features.pkg1.pkg5.Class5.method_2038();
      boolean var6 = var5 != null && var5.method_2040(var1);
      ((Dev.ZWare.Client.pkg1.pkg2.Class7)var2).oyvey$setDeathEffectLightning(var6);
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/LightningEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("HEAD")}
   )
   private void captureLightningColor(LightningEntityRenderState var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class5 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class5.method_2038();
      if (var6 != null && var6.method_2041() && ((Dev.ZWare.Client.pkg1.pkg2.Class7)var1).oyvey$isDeathEffectLightning()) {
         oyvey$currentLightningColor.set(var6.method_2042());
      } else {
         oyvey$currentLightningColor.remove();
      }
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/LightningEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("RETURN")}
   )
   private void clearLightningColor(LightningEntityRenderState var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      oyvey$currentLightningColor.remove();
   }

   @Redirect(
      method = {"drawBranch(Lorg/joml/Matrix4f;Lnet/minecraft/client/render/VertexConsumer;FFIFFFFFFFZZZZ)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/VertexConsumer;color(FFFF)Lnet/minecraft/client/render/VertexConsumer;"
      )
   )
   private static VertexConsumer tintDeathEffectLightning(VertexConsumer var0, float var1, float var2, float var3, float var4) {
      Color var5 = oyvey$currentLightningColor.get();
      return var5 == null
         ? var0.method_22915(var1, var2, var3, var4)
         : var0.method_22915(var5.getRed() / 255.0F, var5.getGreen() / 255.0F, var5.getBlue() / 255.0F, var4);
   }
}
