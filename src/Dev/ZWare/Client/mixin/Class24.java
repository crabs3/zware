package Dev.ZWare.Client.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerEntity.class})
public abstract class Class24 {
   @Inject(
      method = {"getBlockInteractionRange"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetBlockInteractionRange(CallbackInfoReturnable<Double> var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      if (var2 != null && var2.method_2141()) {
         var1.setReturnValue(40.0);
      }
   }

   @Inject(
      method = {"getEntityInteractionRange"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetEntityInteractionRange(CallbackInfoReturnable<Double> var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      if (var2 != null && var2.method_2141()) {
         var1.setReturnValue(40.0);
      }
   }
}
