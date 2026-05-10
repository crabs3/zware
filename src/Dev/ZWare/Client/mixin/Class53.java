package Dev.ZWare.Client.mixin;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.PacketCallbacks;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.PlayerInput;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientConnection.class})
public class Class53 {
   @Shadow
   private Channel field_11651;
   @Shadow
   @Final
   private NetworkSide field_11643;

   @Inject(
      method = {"channelRead0"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void channelRead0(ChannelHandlerContext chc, Packet<?> packet, CallbackInfo ci) {
      if (this.field_11651.isOpen() && packet != null) {
         try {
            Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var4 = new Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1(packet);
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var4);
            if (var4.method_1023()) {
               ci.cancel();
            }
         } catch (Exception var5) {
         }
      }
   }

   @Inject(
      method = {"sendImmediately"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendImmediately(Packet<?> var1, PacketCallbacks var2, boolean var3, CallbackInfo var4) {
      if (this.field_11643 == NetworkSide.field_11942) {
         try {
            Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var5 = new Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3(var1);
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var5);
            if (var5.method_1023()) {
               var4.cancel();
            }
         } catch (Exception var6) {
         }
      }
   }

   @ModifyVariable(
      method = {"sendImmediately"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private Packet<?> modifyOutgoingPacket(Packet<?> var1) {
      if (var1 instanceof PlayerInputC2SPacket var2 && Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3580()) {
         PlayerInput var3 = var2.comp_3139();
         var1 = new PlayerInputC2SPacket(
            new PlayerInput(var3.comp_3159(), var3.comp_3160(), var3.comp_3161(), var3.comp_3162(), var3.comp_3163(), var3.comp_3164(), true)
         );
      }

      if (var1 instanceof ClientTickEndC2SPacket) {
         Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3583();
      }

      return (Packet<?>)var1;
   }

   @Inject(
      method = {"sendImmediately"},
      at = {@At("TAIL")}
   )
   private void sendImmediatelyTail(Packet<?> var1, PacketCallbacks var2, boolean var3, CallbackInfo var4) {
      if (this.field_11643 == NetworkSide.field_11942) {
         try {
            if (var1 instanceof PlayerMoveC2SPacket var5) {
               Dev.ZWare.Client.features.pkg1.pkg6.Class8.method_3582(var5);
            }

            Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(new Dev.ZWare.Client.pkg2.pkg1.Class16.Inner2(var1));
         } catch (Exception var6) {
         }
      }
   }

   @Inject(
      method = {"handleDisconnection"},
      at = {@At("HEAD")}
   )
   private void handleDisconnection(CallbackInfo var1) {
      Dev.ZWare.Client.features.pkg1.pkg2.Class2 var2 = Dev.ZWare.Client.features.pkg1.pkg2.Class2.method_2250();
      if (var2 != null) {
         var2.method_2252();
      }

      if (Dev.ZWare.Client.Class1.field_303 != null) {
         Dev.ZWare.Client.Class1.field_303.method_1606();
      }
   }
}
