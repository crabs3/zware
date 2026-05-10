package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntityRenderer.class})
public abstract class Class42 {
   @Inject(
      method = {"getOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void hideDamageTint(LivingEntityRenderState var0, float var1, CallbackInfoReturnable<Integer> var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 != null && var3.method_2790()) {
         var2.setReturnValue(OverlayTexture.method_23625(OverlayTexture.method_23210(var1), OverlayTexture.method_23212(false)));
      }
   }
}
