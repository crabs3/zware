package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.RenderTickCounter.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Dynamic.class})
public class Class30 {
   @Shadow
   private float field_51958;

   @Inject(
      method = {"beginRenderTick(J)I"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/client/render/RenderTickCounter$Dynamic;lastTimeMillis:J"
      )}
   )
   public void beginRenderTick(long timeMillis, CallbackInfoReturnable<Integer> cir) {
      this.field_51958 = this.field_51958 * Dev.ZWare.Client.Class1.field_293;
   }
}
