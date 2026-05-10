package Dev.ZWare.Client.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({Camera.class})
public abstract class Class47 {
   @Shadow
   protected abstract void method_19322(Vec3d var1);

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @ModifyExpressionValue(
      method = {"update"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;clipToSpace(F)F"
      )}
   )
   private float modifyThirdPersonDistance(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      return var2 != null && var2.method_2139() ? var2.method_2140() : var1;
   }

   @ModifyArgs(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
      )
   )
   private void modifyCameraRotation(Args var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      if (var2 != null && var2.method_2157()) {
         var1.set(0, var2.method_2158());
         var1.set(1, var2.method_2159());
      }
   }

   @Inject(
      method = {"update"},
      at = {@At("TAIL")}
   )
   private void applyCameraTweaksOverride(BlockView var1, Entity var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      if (var7 != null) {
         if (var7.method_2141() && var7.method_2142() != null) {
            this.method_19325(var7.method_2144(), var7.method_2145());
            this.method_19322(var7.method_2143().method_35590(var7.method_2142(), var5));
         }
      }
   }
}
