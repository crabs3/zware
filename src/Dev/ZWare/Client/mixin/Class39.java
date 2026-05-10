package Dev.ZWare.Client.mixin;

import net.minecraft.client.particle.AnimatedParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({AnimatedParticle.class})
public interface Class39 {
   @Accessor("targetRed")
   void oyvey$setTargetRed(float var1);

   @Accessor("targetGreen")
   void oyvey$setTargetGreen(float var1);

   @Accessor("targetBlue")
   void oyvey$setTargetBlue(float var1);

   @Accessor("changesColor")
   void oyvey$setChangesColor(boolean var1);
}
