package Dev.ZWare.Client.mixin;

import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.InteractTypeHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({PlayerInteractEntityC2SPacket.class})
public interface Class10 {
   @Invoker("<init>")
   static PlayerInteractEntityC2SPacket invokeInit(int entityId, boolean playerSneaking, InteractTypeHandler type) {
      throw new AssertionError();
   }
}
