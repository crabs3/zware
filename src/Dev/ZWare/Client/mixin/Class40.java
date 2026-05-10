package Dev.ZWare.Client.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameHud.class})
public class Class40 {
   @Shadow
   private int field_2040;
   @Shadow
   private ItemStack field_2031;

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   public void render(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
      if (!MinecraftClient.method_1551().field_1705.method_53531().method_53536()) {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         Dev.ZWare.Client.pkg2.pkg1.Class3 var4 = new Dev.ZWare.Client.pkg2.pkg1.Class3(context, tickCounter.method_60637(true));
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var4);
      }
   }

   @Inject(
      method = {"renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideScoreboard(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var4 != null && var4.method_2784()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderTitleAndSubtitle"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideTitle(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var4 != null && var4.method_2785()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderStatusEffectOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hidePotionIcons(DrawContext var1, RenderTickCounter var2, CallbackInfo var3) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var4 != null && var4.method_2787()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderHeldItemTooltip"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideHeldItemName(DrawContext var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 != null && var3.method_2786()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"renderPortalOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hidePortalOverlay(DrawContext var1, float var2, CallbackInfo var3) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var4 != null && var4.method_2795()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void hideDoubleMineSwitchVisuals(boolean var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg3.Class1 var3 = oyvey$getDoubleMine();
      if (var3 != null && var3.method_3326()) {
         this.field_2031 = var3.method_3328();
         if (var3.method_3330()) {
            this.field_2040 = 0;
         }
      }
   }

   @Redirect(
      method = {"renderHotbar"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerInventory;getSelectedSlot()I"
      )
   )
   private int getVisualSelectedSlot(PlayerInventory var1) {
      Dev.ZWare.Client.features.pkg1.pkg3.Class1 var2 = oyvey$getDoubleMine();
      return var2 != null && var2.method_3326() ? var2.method_3327() : var1.method_67532();
   }

   @Redirect(
      method = {"renderHotbar"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerInventory;getStack(I)Lnet/minecraft/item/ItemStack;"
      )
   )
   private ItemStack getVisualHotbarStack(PlayerInventory var1, int var2) {
      Dev.ZWare.Client.features.pkg1.pkg3.Class1 var3 = oyvey$getDoubleMine();
      return var3 != null && var3.method_3326() ? var3.method_3329(var2) : var1.method_5438(var2);
   }

   @Unique
   private static Dev.ZWare.Client.features.pkg1.pkg3.Class1 oyvey$getDoubleMine() {
      return Dev.ZWare.Client.Class1.field_316 == null ? null : Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg3.Class1.class);
   }
}
