package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({MinecraftClient.class})
public abstract class Class15 {
   @Shadow
   private int field_1752;

   @Inject(
      method = {"getFramebuffer"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getChamsFramebuffer(CallbackInfoReturnable<Framebuffer> var1) {
      if (Dev.ZWare.Client.Class1.field_306 != null) {
         Framebuffer var2 = Dev.ZWare.Client.Class1.field_306.method_800();
         if (var2 != null) {
            var1.setReturnValue(var2);
         }
      }
   }

   @Inject(
      method = {"hasOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hasChamsOutline(Entity var1, CallbackInfoReturnable<Boolean> var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class7 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class7.method_2201();
      if (var3 != null && var3.method_2215() && var3.method_2217(var1)) {
         var2.setReturnValue(true);
      }
   }

   @Inject(
      method = {"handleInputEvents"},
      at = {@At("HEAD")}
   )
   private void fastPlaceSelectedBlock(CallbackInfo var1) {
      Dev.ZWare.Client.features.pkg1.pkg1.Class15 var2 = Dev.ZWare.Client.features.pkg1.pkg1.Class15.method_3573();
      if (var2 != null && var2.method_3574()) {
         this.field_1752 = 0;
      }

      Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3584();
      Dev.ZWare.Client.features.pkg1.pkg6.Class4.method_3547();
      Dev.ZWare.Client.features.pkg1.pkg6.Class1.method_3259();
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void zware$authTick(CallbackInfo var1) {
      if (Dev.ZWare.Client.Class1.field_314 != null) {
         Dev.ZWare.Client.Class1.field_314.method_36();
      }
   }
}
