package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Entity.class})
public abstract class Class35 {
   @Inject(
      method = {"getRotationVector"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetRotationVector(CallbackInfoReturnable<Vec3d> var1) {
      MinecraftClient var2 = MinecraftClient.method_1551();
      if (this == var2.field_1724) {
         Vec3d var3 = Dev.ZWare.Client.features.pkg1.pkg6.Class7.method_2419();
         if (var3 != null) {
            var1.setReturnValue(var3);
         }
      }
   }

   @Inject(
      method = {"getRotationVec"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetRotationVec(float var1, CallbackInfoReturnable<Vec3d> var2) {
      MinecraftClient var3 = MinecraftClient.method_1551();
      if (this == var3.field_1724) {
         Vec3d var4 = Dev.ZWare.Client.features.pkg1.pkg6.Class7.method_2419();
         if (var4 != null) {
            var2.setReturnValue(var4);
         } else {
            Dev.ZWare.Client.features.pkg1.pkg5.Class13 var5 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
            if (var5 != null && var5.method_2141()) {
               float var6 = MathHelper.method_16439(var1, var5.method_2146(), var5.method_2144());
               float var7 = MathHelper.method_16439(var1, var5.method_2147(), var5.method_2145());
               float var8 = var7 * (float) (Math.PI / 180.0);
               float var9 = -var6 * (float) (Math.PI / 180.0);
               float var10 = MathHelper.method_15362(var9);
               float var11 = MathHelper.method_15374(var9);
               float var12 = MathHelper.method_15362(var8);
               float var13 = MathHelper.method_15374(var8);
               var2.setReturnValue(new Vec3d(var11 * var12, -var13, var10 * var12));
            }
         }
      }
   }

   @Inject(
      method = {"getCameraPosVec"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onGetCameraPosVec(float var1, CallbackInfoReturnable<Vec3d> var2) {
      MinecraftClient var3 = MinecraftClient.method_1551();
      if (this == var3.field_1724) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class13 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
         if (var4 != null && var4.method_2141()) {
            var2.setReturnValue(var4.method_2143().method_35590(var4.method_2142(), var1));
         }
      }
   }

   @Redirect(
      method = {"updateMovementInFluid"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/fluid/FluidState;getVelocity(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;"
      )
   )
   private Vec3d onUpdateMovementInFluidGetVelocity(FluidState var1, BlockView var2, BlockPos var3) {
      Vec3d var4 = var1.method_15758(var2, var3);
      MinecraftClient var5 = MinecraftClient.method_1551();
      if (this != var5.field_1724) {
         return var4;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg6.Class2 var6 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
         return var6 != null && !var6.e() && var6.field_2147.method_671() ? Vec3d.field_1353 : var4;
      }
   }

   @Redirect(
      method = {"pushAwayFrom"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/Entity;addVelocity(DDD)V"
      )
   )
   private void onPushAwayFromAddVelocity(Entity var1, double var2, double var4, double var6) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var8 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var1 != MinecraftClient.method_1551().field_1724 || var8 == null || !var8.d() || !var8.field_2145.method_671()) {
         var1.method_5762(var2, var4, var6);
      }
   }
}
