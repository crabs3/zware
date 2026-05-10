package Dev.ZWare.Client.mixin;

import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ChatHud.class})
public abstract class Class36 {
   @Unique
   private boolean isReentering = false;

   @Inject(
      method = {"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAddMessage(Text var1, MessageSignatureData var2, MessageIndicator var3, CallbackInfo var4) {
      if (!this.isReentering) {
         Dev.ZWare.Client.pkg2.pkg1.Class10 var5 = new Dev.ZWare.Client.pkg2.pkg1.Class10(var1, var2, var3);
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var5);
         if (var5.a()) {
            var4.cancel();
         } else {
            if (!var1.equals(var5.method_1049())) {
               var4.cancel();
               this.isReentering = true;

               try {
                  ((ChatHud)this).method_44811(var5.method_1049(), var2, var3);
               } finally {
                  this.isReentering = false;
               }
            }
         }
      }
   }
}
