package Dev.ZWare.Client.mixin;

import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ParticleManager.class})
public class Class27 {
   @Inject(
      method = {"addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)Lnet/minecraft/client/particle/Particle;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideParticles(
      ParticleEffect var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable<Particle> var14
   ) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var15 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var15 != null && var1 != null) {
         if (!var15.method_2797()
            || var1.method_10295() != ParticleTypes.field_11245
               && var1.method_10295() != ParticleTypes.field_11226
               && var1.method_10295() != ParticleTypes.field_11213) {
            if (var15.method_2803() && (var1.method_10295() == ParticleTypes.field_11236 || var1.method_10295() == ParticleTypes.field_11221)) {
               var14.setReturnValue(null);
            }
         } else {
            var14.setReturnValue(null);
         }
      }
   }

   @Inject(
      method = {"addParticle(Lnet/minecraft/client/particle/Particle;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleParticles(Particle var1, CallbackInfo var2) {
      if (var1 != null) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
         if (var3 != null) {
            if (var3.method_2799() && Dev.ZWare.Client.features.pkg1.pkg5.Class12.method_2600(var1)) {
               var2.cancel();
               return;
            }

            if (var3.method_2798() && Dev.ZWare.Client.features.pkg1.pkg5.Class12.method_2601(var1)) {
               var2.cancel();
               return;
            }
         }

         Dev.ZWare.Client.features.pkg1.pkg5.Class12 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class12.method_2595();
         if (var4 != null) {
            var4.method_2597(var1);
         }
      }
   }

   @Inject(
      method = {"tickParticle"},
      at = {@At("TAIL")}
   )
   private void recolorParticleAfterTick(Particle var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class12 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class12.method_2595();
      if (var3 != null) {
         var3.method_2597(var1);
      }
   }
}
