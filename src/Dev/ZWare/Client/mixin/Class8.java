package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.state.BipedEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ArmorFeatureRenderer.class})
public abstract class Class8 {
   @Inject(
      method = {"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/BipedEntityRenderState;FF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelArmorRender(
      MatrixStack var1, VertexConsumerProvider var2, int var3, BipedEntityRenderState var4, float var5, float var6, CallbackInfo var7
   ) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var8 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var8 != null && var8.method_2781()) {
         var7.cancel();
      }
   }
}
