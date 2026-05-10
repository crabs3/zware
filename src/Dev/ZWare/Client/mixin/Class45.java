package Dev.ZWare.Client.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientPlayerEntity.class})
public class Class45 {
   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void tickHookPre(CallbackInfo var1) {
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2());
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void tickHook(CallbackInfo var1) {
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1());
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class4());
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/AbstractClientPlayerEntity;tick()V",
         shift = Shift.AFTER
      )}
   )
   private void tickHook2(CallbackInfo var1) {
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class17(Dev.ZWare.Client.pkg2.Class2.field_654));
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2());
   }

   @Inject(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;sendMovementPackets()V",
         shift = Shift.AFTER
      )}
   )
   private void tickHook3(CallbackInfo var1) {
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class17(Dev.ZWare.Client.pkg2.Class2.POST));
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class5.Inner1());
   }

   @ModifyVariable(
      method = {"move"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private Vec3d moveHook(Vec3d var1, MovementType var2) {
      Dev.ZWare.Client.pkg2.pkg1.Class9 var3 = new Dev.ZWare.Client.pkg2.pkg1.Class9(var2, var1);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var3);
      return var3.method_1030();
   }

   @Inject(
      method = {"tickMovement"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/input/Input;tick()V",
         shift = Shift.AFTER
      )}
   )
   private void freecamInputTickHook(CallbackInfo var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class13 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class13.method_2138();
      if (var2 != null && var2.method_2141()) {
         ClientPlayerEntity var3 = (ClientPlayerEntity)this;
         var3.field_3913.field_54155 = new PlayerInput(false, false, false, false, false, false, false);
         if (var3.field_3913 instanceof Class18 var4) {
            var4.zware$setMovementVector(Vec2f.field_1340);
         }
      }
   }

   @Inject(
      method = {"shouldSlowDown"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void shouldSlowDownHook(CallbackInfoReturnable<Boolean> var1) {
      if (Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3578((ClientPlayerEntity)this)) {
         var1.setReturnValue(false);
      }
   }

   @Inject(
      method = {"pushOutOfBlocks"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pushOutOfBlocksHook(double var1, double var3, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var6 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var6 != null && var6.d() && var6.field_2146.method_671()) {
         var5.cancel();
      }
   }

   @ModifyArg(
      method = {"sendMovementPackets"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayNetworkHandler;sendPacket(Lnet/minecraft/network/packet/Packet;)V"
      ),
      index = 0
   )
   private Packet<?> forceNoSlowFullMovementPacket(Packet<?> var1) {
      if (var1 instanceof PlayerMoveC2SPacket var2) {
         if (var2 instanceof Full) {
            Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3581(var2);
            return var2;
         } else if (!Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3579()) {
            Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3581(var2);
            return var2;
         } else if (var2.method_36171() && var2.method_12273()) {
            ClientPlayerEntity var3 = (ClientPlayerEntity)this;
            Full var4 = new Full(
               var2.method_12269(var3.method_23317()),
               var2.method_12268(var3.method_23318()),
               var2.method_12274(var3.method_23321()),
               var2.method_12271(var3.method_36454()),
               var2.method_12270(var3.method_36455()),
               var2.method_12273(),
               var3.field_5976
            );
            Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3581(var4);
            return var4;
         } else {
            Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3581(var2);
            return var2;
         }
      } else {
         return var1;
      }
   }
}
