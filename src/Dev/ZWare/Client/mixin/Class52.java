package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({PlayerEntityRenderer.class})
public abstract class Class52 {
   @Inject(
      method = {"updateRenderState(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/client/render/entity/state/PlayerEntityRenderState;F)V"},
      at = {@At("TAIL")}
   )
   private void applySprintPitch45Render(AbstractClientPlayerEntity var1, PlayerEntityRenderState var2, float var3, CallbackInfo var4) {
      if (var1 == MinecraftClient.method_1551().field_1724) {
         if (Dev.ZWare.Client.Class1.field_298 != null && Dev.ZWare.Client.Class1.field_298.method_349(var1.field_6012)) {
            float var5 = MathHelper.method_17821(var3, Dev.ZWare.Client.pkg4.Class9.method_348(), Dev.ZWare.Client.pkg4.Class9.method_345());
            float var6 = MathHelper.method_17821(var3, Dev.ZWare.Client.pkg4.Class9.method_347(), Dev.ZWare.Client.pkg4.Class9.method_344());
            var2.field_53446 = var5;
            var2.field_53447 = MathHelper.method_15393(var6 - var5);
            if (Dev.ZWare.Client.Class1.field_298.method_350(var1.field_6012)) {
               var2.field_53448 = MathHelper.method_16439(var3, Dev.ZWare.Client.pkg4.Class9.method_346(), Dev.ZWare.Client.pkg4.Class9.method_343());
            }
         }

         Dev.ZWare.Client.features.pkg1.pkg6.Class12 var7 = Dev.ZWare.Client.features.pkg1.pkg6.Class12.method_2435();
         if (var7 != null && var7.method_2439()) {
            var2.field_53448 = var7.method_2440();
         }
      }
   }
}
