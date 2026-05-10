package Dev.ZWare.Client.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ClientPlayerEntity.class})
public interface Class32 {
   @Accessor("lastXClient")
   void setLastXClient(double var1);

   @Accessor("lastYClient")
   void setLastYClient(double var1);

   @Accessor("lastZClient")
   void setLastZClient(double var1);

   @Accessor("lastYawClient")
   void setLastYawClient(float var1);

   @Accessor("lastPitchClient")
   void setLastPitchClient(float var1);

   @Accessor("lastOnGround")
   void setLastOnGround(boolean var1);

   @Accessor("lastHorizontalCollision")
   void setLastHorizontalCollision(boolean var1);

   @Accessor("ticksSinceLastPositionPacketSent")
   void setTicksSinceLastPositionPacketSent(int var1);
}
