package Dev.ZWare.Client.mixin;

import net.minecraft.client.Keyboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Keyboard.class})
public class Class22 {
   @Inject(
      method = {"onKey"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void onKey(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (var5 == 1) {
         Dev.ZWare.Client.pkg2.pkg1.Class8 var8 = new Dev.ZWare.Client.pkg2.pkg1.Class8(var3);
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var8);
         if (var8.a()) {
            var7.cancel();
         }
      }
   }
}
