package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({FishingBobberEntity.class})
public abstract class Class9 {
   @Inject(
      method = {"pullHookedEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPullHookedEntity(Entity var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var3 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var1 == MinecraftClient.method_1551().field_1724 && var3 != null && var3.d() && var3.field_2148.method_671()) {
         var2.cancel();
      }
   }
}
