package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({LightmapTextureManager.class})
public class Class48 {
   @ModifyArgs(
      method = {"update"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/RenderPass;setUniform(Ljava/lang/String;[F)V"
      )
   )
   private void zware$applyFullBrightGamma(Args var1) {
      Object var2 = var1.get(0);
      if ("BrightnessFactor".equals(var2)) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class9 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class9.method_2540();
         if (var3 != null && var3.method_2541()) {
            var1.set(1, new float[]{var3.method_2542()});
         }
      }
   }
}
