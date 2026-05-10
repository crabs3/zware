package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.FrogEntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LivingEntityRenderer.class})
public abstract class Class37 {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelFrogRender(LivingEntityRenderState var1, MatrixStack var2, VertexConsumerProvider var3, int var4, CallbackInfo var5) {
      if (var1 instanceof FrogEntityRenderState) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class4 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
         if (var6 != null && var6.method_2802()) {
            var5.cancel();
         }
      }
   }
}
