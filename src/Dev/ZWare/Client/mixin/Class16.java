package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntity.class})
public abstract class Class16 {
   @Shadow
   private int field_6228;

   @Inject(
      method = {"takeKnockback"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onTakeKnockback(double var1, double var3, double var5, CallbackInfo var7) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var8 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (this == MinecraftClient.method_1551().field_1724 && var8 != null && var8.method_2768()) {
         var7.cancel();
      }
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At("HEAD")}
   )
   private void removeJumpDelay(CallbackInfo var1) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class11 var2 = Dev.ZWare.Client.features.pkg1.pkg6.Class11.method_2114();
      if (this == MinecraftClient.method_1551().field_1724 && var2 != null && var2.d()) {
         this.field_6228 = 0;
      }
   }

   @Inject(
      method = {"getHandSwingDuration"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void modifyLocalSwingDuration(CallbackInfoReturnable<Integer> var1) {
      if (this == MinecraftClient.method_1551().field_1724) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
         if (var2 != null && var2.d()) {
            float var3 = Math.max(0.1F, var2.method_2558());
            int var4 = Math.max(1, Math.round(var1.getReturnValueI() / var3));
            var1.setReturnValue(var4);
         }
      }
   }
}
