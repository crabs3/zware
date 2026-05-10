package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class Class5 {
   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideVanillaNameTags(EntityRenderState var1, Text var2, MatrixStack var3, VertexConsumerProvider var4, int var5, CallbackInfo var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var7 != null && var7.method_2782()) {
         var6.cancel();
      }
   }
}
