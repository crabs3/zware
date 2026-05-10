package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.entity.state.LightningEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({LightningEntityRenderState.class})
public class Class3 implements Dev.ZWare.Client.pkg1.pkg2.Class7 {
   @Unique
   private boolean oyvey$deathEffectLightning;

   @Override
   public void oyvey$setDeathEffectLightning(boolean deathEffectLightning) {
      this.oyvey$deathEffectLightning = deathEffectLightning;
   }

   @Override
   public boolean oyvey$isDeathEffectLightning() {
      return this.oyvey$deathEffectLightning;
   }
}
