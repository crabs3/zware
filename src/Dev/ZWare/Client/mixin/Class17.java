package Dev.ZWare.Client.mixin;

import net.minecraft.client.Mouse;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Mouse.class})
public class Class17 {
   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseButton(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      Dev.ZWare.Client.pkg2.pkg1.Class1 var7 = new Dev.ZWare.Client.pkg2.pkg1.Class1(var3, var4);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var7);
      if (var7.a()) {
         var6.cancel();
      }
   }

   @Redirect(
      method = {"updateMouse"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;changeLookDirection(DD)V"
      )
   )
   private void redirectFreecamLook(ClientPlayerEntity var1, double var2, double var4) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      if (var6 == null || !var6.method_2148(var2, var4)) {
         if (var6 == null || !var6.method_2160(var2, var4)) {
            var1.method_5872(var2, var4);
         }
      }
   }
}
