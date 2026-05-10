package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameOverlayRenderer.class})
public abstract class Class1 {
   @Shadow
   private static void method_23068(Sprite var0, MatrixStack var1, VertexConsumerProvider var2) {
   }

   @Redirect(
      method = {"renderOverlays"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/hud/InGameOverlayRenderer;renderInWallOverlay(Lnet/minecraft/client/texture/Sprite;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"
      )
   )
   private static void maybeSkipWallOverlay(Sprite var0, MatrixStack var1, VertexConsumerProvider var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 == null || !var3.method_2800()) {
         method_23068(var0, var1, var2);
      }
   }

   @Inject(
      method = {"renderUnderwaterOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void hideLiquidOverlay(MinecraftClient var0, MatrixStack var1, VertexConsumerProvider var2, CallbackInfo var3) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var4 != null && var4.method_2793()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderFireOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void hideFireOverlay(MatrixStack var0, VertexConsumerProvider var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 != null && var3.method_2794()) {
         var2.cancel();
      }
   }
}
