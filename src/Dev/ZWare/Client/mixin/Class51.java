package Dev.ZWare.Client.mixin;

import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.BackgroundRenderer.FogType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BackgroundRenderer.class})
public class Class51 {
   @Inject(
      method = {"applyFog"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void hideFog(Camera var0, FogType var1, Vector4f var2, float var3, boolean var4, float var5, CallbackInfoReturnable<Fog> var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var7 != null && var7.method_2789()) {
         var6.setReturnValue(Fog.field_53065);
      }
   }

   @Inject(
      method = {"getFogModifier"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void hideStatusEffectFog(Entity var0, float var1, CallbackInfoReturnable<Object> var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 != null) {
         Object var4 = var2.getReturnValue();
         if (var4 != null) {
            String var5 = var4.getClass().getName();
            if (var3.method_2791() && var5.endsWith("$BlindnessFogModifier")) {
               var2.setReturnValue(null);
            } else {
               if (var3.method_2792() && var5.endsWith("$DarknessFogModifier")) {
                  var2.setReturnValue(null);
               }
            }
         }
      }
   }

   @Redirect(
      method = {"getFogColor"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z"
      )
   )
   private static boolean hideDarknessStatusCheck(LivingEntity var0, RegistryEntry<StatusEffect> var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      return var2 != null && var2.method_2792() && var1.equals(StatusEffects.field_38092) ? false : var0.method_6059(var1);
   }
}
