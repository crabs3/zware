package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Entity.class})
public abstract class Class43 {
   @Inject(
      method = {"getDimensions(Lnet/minecraft/entity/EntityPose;)Lnet/minecraft/entity/EntityDimensions;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetDimensions(EntityPose var1, CallbackInfoReturnable<EntityDimensions> var2) {
      MinecraftClient var3 = MinecraftClient.method_1551();
      if (this == var3.field_1724) {
         EntityDimensions var4 = Dev.ZWare.Client.features.pkg1.pkg6.Class6.method_3039(var1);
         if (var4 != null) {
            var2.setReturnValue(var4);
         }
      }
   }
}
