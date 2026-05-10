package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.entity.EndCrystalEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({EndCrystalEntityRenderer.class})
public abstract class Class4 {
   @ModifyConstant(
      method = {"render(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      constant = {@Constant(
         floatValue = 2.0F
      )}
   )
   private float modifyCrystalScale(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class11 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class11.method_2686();
      return var2 == null ? var1 : var1 * var2.method_2689();
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/EndCrystalEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/EndCrystalEntityRenderer;getYOffset(F)F"
      )
   )
   private float modifyBeamBounce(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class11 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class11.method_2686();
      return var2 != null && !var2.method_2688() ? EndCrystalEntityRenderer.method_23155(0.0F) : EndCrystalEntityRenderer.method_23155(var1);
   }
}
