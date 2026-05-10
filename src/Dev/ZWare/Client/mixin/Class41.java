package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({TitleScreen.class})
public class Class41 {
   private static boolean firstInit = true;

   @Inject(
      method = {"init"},
      at = {@At("HEAD")}
   )
   private void onInit(CallbackInfo var1) {
      if (firstInit) {
         firstInit = false;
         MinecraftClient var2 = MinecraftClient.method_1551();
         if (var2 != null && var2.method_1483() != null) {
            var2.method_1483().method_4873(PositionedSoundInstance.method_4758(SoundEvent.method_47908(Identifier.method_60655("oyvey", "boot")), 1.0F));
         }
      }
   }
}
