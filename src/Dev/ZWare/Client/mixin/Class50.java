package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({LivingEntityRenderer.class})
public interface Class50 {
   @Invoker("setupTransforms")
   void invokeSetupTransforms(LivingEntityRenderState var1, MatrixStack var2, float var3, float var4);

   @Invoker("scale")
   void invokeScale(LivingEntityRenderState var1, MatrixStack var2);

   @Invoker("getRenderLayer")
   RenderLayer invokeGetRenderLayer(LivingEntityRenderState var1, boolean var2, boolean var3, boolean var4);
}
