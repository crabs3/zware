package Dev.ZWare.Client.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BossBarHud.class})
public class Class54 {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideBossBar(DrawContext var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 != null && var3.method_2783()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"shouldDarkenSky"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideBossBarDarkenSky(CallbackInfoReturnable<Boolean> var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var2 != null && var2.method_2783()) {
         var1.setReturnValue(false);
      }
   }

   @Inject(
      method = {"shouldThickenFog"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideBossBarFog(CallbackInfoReturnable<Boolean> var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var2 != null && var2.method_2783()) {
         var1.setReturnValue(false);
      }
   }
}
