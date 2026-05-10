package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WeatherRendering;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.ParticlesMode;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WeatherRendering.class})
public class Class23 {
   @Inject(
      method = {"renderPrecipitation"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideWeather(World var1, VertexConsumerProvider var2, int var3, float var4, Vec3d var5, CallbackInfo var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var7 != null && var7.method_2788()) {
         var6.cancel();
      }
   }

   @Inject(
      method = {"addParticlesAndSound"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideWeatherParticlesAndSound(ClientWorld var1, Camera var2, int var3, ParticlesMode var4, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var6 != null && var6.method_2788()) {
         var5.cancel();
      }
   }
}
