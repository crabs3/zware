package Dev.ZWare.Client.mixin;

import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerPosition;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRotationS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientPlayNetworkHandler.class})
public class Class7 {
   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChatMessageHook(String var1, CallbackInfo var2) {
      Dev.ZWare.Client.pkg2.pkg1.Class11 var3 = new Dev.ZWare.Client.pkg2.pkg1.Class11(var1);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var3);
      if (var3.a()) {
         var2.cancel();
      }
   }

   @Redirect(
      method = {"onExplosion"},
      at = @At(
         value = "INVOKE",
         target = "Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V"
      )
   )
   private void onExplosionApplyKnockback(Optional<Vec3d> var1, Consumer<Vec3d> var2, ExplosionS2CPacket var3) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var4 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var4 != null && !var4.e() && var4.field_2138.method_671() && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null) {
         var1.ifPresent(var1x -> {
            Vec3d var2x = var4.method_2766(var1x);
            if (var2x != null) {
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_5762(var2x.field_1352, var2x.field_1351, var2x.field_1350);
            }
         });
      } else {
         var1.ifPresent(var2);
      }
   }

   @Inject(
      method = {"onEntityVelocityUpdate"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V",
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   private void onEntityVelocityUpdateHook(EntityVelocityUpdateS2CPacket var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var3 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var3 != null && var3.d()) {
         var3.method_2765(var1, var2);
      }
   }

   @Inject(
      method = {"onPlayerPositionLook"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V",
         shift = Shift.AFTER
      )}
   )
   private void onPlayerPositionLookHook(PlayerPositionLookS2CPacket var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var3 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var3 != null && var3.d()) {
         var3.method_2764();
      }
   }

   @Inject(
      method = {"onEntityDamage"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/util/thread/ThreadExecutor;)V",
         shift = Shift.AFTER
      )}
   )
   private void onEntityDamageHook(EntityDamageS2CPacket var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class2 var3 = Dev.ZWare.Client.features.pkg1.pkg6.Class2.method_2762();
      if (var3 != null && var3.d()) {
         var3.method_2767(var1);
      }
   }

   @Redirect(
      method = {"onEntityStatus"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/world/ClientWorld;playSoundClient(DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FFZ)V"
      )
   )
   private void redirectTotemUseSound(
      ClientWorld var1,
      double var2,
      double var4,
      double var6,
      SoundEvent var8,
      SoundCategory var9,
      float var10,
      float var11,
      boolean var12,
      EntityStatusS2CPacket var13
   ) {
      if (var13.method_11470() == 35) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class4 var14 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
         if (var14 != null && var14.method_1949()) {
            return;
         }
      }

      var1.method_8486(var2, var4, var6, var8, var9, var10, var11, var12);
   }

   @Redirect(
      method = {"onPlayerPositionLook"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;change()Lnet/minecraft/entity/player/PlayerPosition;"
      )
   )
   private PlayerPosition keepRotationOnPositionLook(PlayerPositionLookS2CPacket var1) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class5 var2 = Dev.ZWare.Client.features.pkg1.pkg6.Class5.method_1957();
      if (var2 != null && var2.method_1958() && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null) {
         PlayerPosition var3 = var1.comp_3228();
         return new PlayerPosition(
            var3.comp_3148(),
            var3.comp_3149(),
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36454(),
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36455()
         );
      } else {
         return var1.comp_3228();
      }
   }

   @Redirect(
      method = {"onPlayerPositionLook"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;relatives()Ljava/util/Set;"
      )
   )
   private Set<PositionFlag> stripRotationFlagsOnPositionLook(PlayerPositionLookS2CPacket var1) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class5 var2 = Dev.ZWare.Client.features.pkg1.pkg6.Class5.method_1957();
      if (var2 != null && var2.method_1958()) {
         EnumSet var3 = EnumSet.noneOf(PositionFlag.class);
         var3.addAll(var1.comp_3229());
         var3.remove(PositionFlag.field_12401);
         var3.remove(PositionFlag.field_12397);
         return var3;
      } else {
         return var1.comp_3229();
      }
   }

   @Redirect(
      method = {"onPlayerRotation"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/packet/s2c/play/PlayerRotationS2CPacket;yRot()F"
      )
   )
   private float keepYawOnPlayerRotation(PlayerRotationS2CPacket var1) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class5 var2 = Dev.ZWare.Client.features.pkg1.pkg6.Class5.method_1957();
      ClientPlayerEntity var3 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724;
      return var2 != null && var2.method_1959() && var3 != null ? var3.method_36454() : var1.comp_3230();
   }

   @Redirect(
      method = {"onPlayerRotation"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/packet/s2c/play/PlayerRotationS2CPacket;xRot()F"
      )
   )
   private float keepPitchOnPlayerRotation(PlayerRotationS2CPacket var1) {
      Dev.ZWare.Client.features.pkg1.pkg6.Class5 var2 = Dev.ZWare.Client.features.pkg1.pkg6.Class5.method_1957();
      ClientPlayerEntity var3 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724;
      return var2 != null && var2.method_1959() && var3 != null ? var3.method_36455() : var1.comp_3231();
   }
}
