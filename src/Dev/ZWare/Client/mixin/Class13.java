package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.ChickenEntityRenderer;
import net.minecraft.client.render.entity.state.ChickenEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChickenEntityRenderer.class})
public abstract class Class13 {
   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/state/ChickenEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelChickenRender(ChickenEntityRenderState var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var6 != null && var6.method_2801()) {
         var5.cancel();
      }
   }
}
