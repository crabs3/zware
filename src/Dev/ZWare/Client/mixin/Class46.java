package Dev.ZWare.Client.mixin;

import Dev.ZWare.Client.gui.ShulkerPeekScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({HandledScreen.class})
public abstract class Class46<T extends ScreenHandler> {
   @Shadow
   protected T field_2797;
   @Shadow
   protected int field_2776;
   @Shadow
   protected int field_2800;
   @Shadow
   protected int field_2792;
   @Shadow
   protected Slot field_2787;
   @Shadow
   private boolean field_2783;

   @Shadow
   protected abstract Slot method_64240(double var1, double var3);

   @Inject(
      method = {"mouseDragged"},
      at = {@At("TAIL")},
      cancellable = true
   )
   private void onMouseDragged(double var1, double var3, int var5, double var6, double var8, CallbackInfoReturnable<Boolean> var10) {
      if (var5 == 0 && !this.field_2783) {
         Dev.ZWare.Client.features.pkg1.pkg1.Class11 var11 = Dev.ZWare.Client.features.pkg1.pkg1.Class11.method_3379();
         if (var11 != null && var11.d() && var11.field_2684.method_671()) {
            if (Screen.method_25442()) {
               Slot var12 = this.method_64240(var1, var3);
               if (var12 != null && var12.method_7681()) {
                  if (this.field_2797 != null) {
                     MinecraftClient var13 = MinecraftClient.method_1551();
                     if (var13.field_1761 != null && var13.field_1724 != null) {
                        var13.field_1761.method_2906(this.field_2797.field_7763, var12.field_7874, 0, SlotActionType.field_7794, var13.field_1724);
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"drawMouseoverTooltip"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void drawPreviewTooltip(DrawContext var1, int var2, int var3, CallbackInfo var4) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class14 var5 = Dev.ZWare.Client.features.pkg1.pkg5.Class14.method_2972();
      if (var5 != null && this.field_2787 != null && this.field_2787.method_7681() && this.field_2797.method_34255().method_7960()) {
         ItemStack var6 = this.field_2787.method_7677();
         if (var5.method_2973(var1, MinecraftClient.method_1551().field_1772, var6, var2, var3)) {
            var4.cancel();
         }
      }
   }

   @Inject(
      method = {"mouseClicked"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMiddleClickShulker(double var1, double var3, int var5, CallbackInfoReturnable<Boolean> var6) {
      if (var5 == 2) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class14 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class14.method_2972();
         if (var7 != null && var7.d()) {
            if (this.field_2787 != null && this.field_2787.method_7681()) {
               ItemStack var8 = this.field_2787.method_7677();
               if (ShulkerPeekScreen.isShulker(var8)) {
                  MinecraftClient var9 = MinecraftClient.method_1551();
                  var9.method_1507(new ShulkerPeekScreen(var8));
                  var6.setReturnValue(true);
               }
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void onRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg2.Class4 var6 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg2.Class4.class);
      if (var6 != null && var6.d() && var6.field_1418.method_671() && var6.method_2056(this.field_2797)) {
         byte var7 = 40;
         byte var8 = 12;
         int var9 = this.field_2776 + this.field_2792 + 4;
         int var10 = this.field_2800;
         this.drawChestStealerButton(var1, var9, var10, var7, var8, var2, var3, var6.field_1425 ? "Stop" : "Steal", var6.field_1425);
         var10 += var8 + 4;
         this.drawChestStealerButton(var1, var9, var10, var7, var8, var2, var3, var6.field_1426 ? "Stop" : "Dump", var6.field_1426);
         var10 += var8 + 4;
         this.drawChestStealerButton(var1, var9, var10, var7, var8, var2, var3, var6.field_1427 ? "Stop" : "Drop", var6.field_1427);
         var10 += var8 + 4;
         this.drawChestStealerButton(var1, var9, var10, var7, var8, var2, var3, var6.field_1428 ? "Stop" : "Refill", var6.field_1428);
      }
   }

   @Inject(
      method = {"mouseClicked"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseClickedButtons(double var1, double var3, int var5, CallbackInfoReturnable<Boolean> var6) {
      Dev.ZWare.Client.features.pkg1.pkg2.Class4 var7 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg2.Class4.class);
      if (var7 != null && var7.d() && var7.field_1418.method_671() && var7.method_2056(this.field_2797) && var5 == 0) {
         byte var8 = 40;
         byte var9 = 12;
         int var10 = this.field_2776 + this.field_2792 + 4;
         int var11 = this.field_2800;
         if (this.isChestStealerHovered(var1, var3, var10, var11, var8, var9)) {
            var7.field_1425 = !var7.field_1425;
            var7.field_1426 = false;
            var7.field_1427 = false;
            var7.field_1428 = false;
            var6.setReturnValue(true);
            return;
         }

         var11 += var9 + 4;
         if (this.isChestStealerHovered(var1, var3, var10, var11, var8, var9)) {
            var7.field_1426 = !var7.field_1426;
            var7.field_1425 = false;
            var7.field_1427 = false;
            var7.field_1428 = false;
            var6.setReturnValue(true);
            return;
         }

         var11 += var9 + 4;
         if (this.isChestStealerHovered(var1, var3, var10, var11, var8, var9)) {
            var7.field_1427 = !var7.field_1427;
            var7.field_1425 = false;
            var7.field_1426 = false;
            var7.field_1428 = false;
            var6.setReturnValue(true);
            return;
         }

         var11 += var9 + 4;
         if (this.isChestStealerHovered(var1, var3, var10, var11, var8, var9)) {
            var7.field_1428 = !var7.field_1428;
            var7.field_1425 = false;
            var7.field_1426 = false;
            var7.field_1427 = false;
            var6.setReturnValue(true);
            return;
         }
      }
   }

   private void drawChestStealerButton(DrawContext var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8, boolean var9) {
      boolean var10 = this.isChestStealerHovered(var6, var7, var2, var3, var4, var5);
      int var11 = var9 ? -11184811 : (var10 ? -12303292 : -13421773);
      int var12 = var9 ? -5592406 : -10066330;
      var1.method_25294(var2, var3, var2 + var4, var3 + var5, var11);
      Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(var1.method_51448(), var2, var3, var2 + var4, var3 + var5, var12, 1.0F);
      MinecraftClient var13 = MinecraftClient.method_1551();
      int var14 = var13.field_1772.method_1727(var8);
      var1.method_25303(var13.field_1772, var8, var2 + (var4 - var14) / 2, var3 + (var5 - 8) / 2 + 1, var9 ? -5592321 : (var10 ? -1 : -2236963));
   }

   private boolean isChestStealerHovered(double var1, double var3, int var5, int var6, int var7, int var8) {
      return var1 >= var5 && var1 <= var5 + var7 && var3 >= var6 && var3 <= var6 + var8;
   }
}
