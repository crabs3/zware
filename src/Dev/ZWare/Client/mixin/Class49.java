package Dev.ZWare.Client.mixin;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DrawContext.class})
public class Class49 {
   @Inject(
      method = {"drawItemTooltip(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;II)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawTooltipPreview(TextRenderer var1, ItemStack var2, int var3, int var4, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class14 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class14.method_2972();
      if (var6 != null && var6.method_2973((DrawContext)this, var1, var2, var3, var4)) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"drawStackOverlay(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V"},
      at = {@At("TAIL")}
   )
   private void onDrawStackOverlay(TextRenderer var1, ItemStack var2, int var3, int var4, String var5, CallbackInfo var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class14 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class14.method_2972();
      if (var7 != null) {
         var7.method_2974((DrawContext)this, var1, var2, var3, var4);
      }
   }

   @Inject(
      method = {"drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawTextWithShadow(TextRenderer var1, String var2, int var3, int var4, int var5, CallbackInfoReturnable<Integer> var6) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838(var1)) {
         var6.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_818((DrawContext)this, var2, var3, var4, var5, true));
      }
   }

   @Inject(
      method = {"drawText(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;IIIZ)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawText(TextRenderer var1, String var2, int var3, int var4, int var5, boolean var6, CallbackInfoReturnable<Integer> var7) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838(var1)) {
         var7.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_818((DrawContext)this, var2, var3, var4, var5, var6));
      }
   }

   @Inject(
      method = {"drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/OrderedText;III)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawTextWithShadow(TextRenderer var1, OrderedText var2, int var3, int var4, int var5, CallbackInfoReturnable<Integer> var6) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838(var1)) {
         var6.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_821((DrawContext)this, var2, var3, var4, var5, true));
      }
   }

   @Inject(
      method = {"drawText(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/OrderedText;IIIZ)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawText(TextRenderer var1, OrderedText var2, int var3, int var4, int var5, boolean var6, CallbackInfoReturnable<Integer> var7) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838(var1)) {
         var7.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_821((DrawContext)this, var2, var3, var4, var5, var6));
      }
   }

   @Inject(
      method = {"drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;III)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawTextWithShadow(TextRenderer var1, Text var2, int var3, int var4, int var5, CallbackInfoReturnable<Integer> var6) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838(var1)) {
         var6.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_823((DrawContext)this, var2, var3, var4, var5, true));
      }
   }

   @Inject(
      method = {"drawText(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;IIIZ)I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawText(TextRenderer var1, Text var2, int var3, int var4, int var5, boolean var6, CallbackInfoReturnable<Integer> var7) {
      if (Dev.ZWare.Client.Class1.field_297 != null && Dev.ZWare.Client.Class1.field_297.method_838(var1)) {
         var7.setReturnValue(Dev.ZWare.Client.Class1.field_297.method_823((DrawContext)this, var2, var3, var4, var5, var6));
      }
   }
}
