package Dev.ZWare.Client.mixin;

import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({EntityVelocityUpdateS2CPacket.class})
public interface Class57 {
   @Mutable
   @Accessor("velocityX")
   void setX(int var1);

   @Mutable
   @Accessor("velocityY")
   void setY(int var1);

   @Mutable
   @Accessor("velocityZ")
   void setZ(int var1);
}
