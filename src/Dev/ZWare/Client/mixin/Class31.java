package Dev.ZWare.Client.mixin;

import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({SoundManager.class})
public class Class31 {
   @Inject(
      method = {"play(Lnet/minecraft/client/sound/SoundInstance;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void suppressVanillaReplacementSounds(SoundInstance var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
      if (var3 != null && var1 != null) {
         if (var3.method_1950(var1.method_4775())) {
            var2.cancel();
         }
      }
   }
}
