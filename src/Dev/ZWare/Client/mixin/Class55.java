package Dev.ZWare.Client.mixin;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({TextRenderer.class})
public class Class55 {
   @Inject(
      method = {"getWidth(Ljava/lang/String;)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getWidth(String var1, CallbackInfoReturnable<Integer> var2) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838((TextRenderer)this)) {
         var2.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_825(var1));
      }
   }

   @Inject(
      method = {"getWidth(Lnet/minecraft/text/StringVisitable;)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getWidth(StringVisitable var1, CallbackInfoReturnable<Integer> var2) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838((TextRenderer)this)) {
         var2.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_830(var1));
      }
   }

   @Inject(
      method = {"getWidth(Lnet/minecraft/text/OrderedText;)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getWidth(OrderedText var1, CallbackInfoReturnable<Integer> var2) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838((TextRenderer)this)) {
         var2.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_828(var1));
      }
   }
}
