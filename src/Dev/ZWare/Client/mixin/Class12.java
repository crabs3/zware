package Dev.ZWare.Client.mixin;

import net.minecraft.client.particle.Particle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Particle.class})
public class Class12 {
   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void recolorParticleEveryTick(CallbackInfo var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class12 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class12.method_2595();
      if (var2 != null) {
         var2.method_2597((Particle)this);
      }
   }
}
