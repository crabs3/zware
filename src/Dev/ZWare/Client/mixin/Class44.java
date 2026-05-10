package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.entity.EndCrystalEntityRenderer;
import net.minecraft.client.render.entity.model.EndCrystalEntityModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EndCrystalEntityModel.class})
public abstract class Class44 {
   @ModifyConstant(
      method = {"setAngles(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;)V"},
      constant = {@Constant(
         floatValue = 3.0F
      )}
   )
   private float modifyCrystalSpin(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class11 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class11.method_2686();
      return var2 == null ? var1 : var1 * var2.method_2687();
   }

   @Redirect(
      method = {"setAngles(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/EndCrystalEntityRenderer;getYOffset(F)F"
      )
   )
   private float modifyCrystalBounce(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class11 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class11.method_2686();
      return var2 != null && !var2.method_2688() ? EndCrystalEntityRenderer.method_23155(0.0F) : EndCrystalEntityRenderer.method_23155(var1);
   }
}
