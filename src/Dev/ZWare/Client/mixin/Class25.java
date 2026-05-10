package Dev.ZWare.Client.mixin;

import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ChatScreen.class})
public abstract class Class25 extends Screen {
   @Shadow
   protected TextFieldWidget field_2382;
   @Unique
   private String zware$completionSeed;
   @Unique
   private String zware$lastAppliedCompletion;
   @Unique
   private List<Dev.ZWare.Client.pkg4.Class23.Inner1> zware$completionSuggestions = List.of();
   @Unique
   private int zware$completionIndex;
   @Unique
   private long zware$openedAt;

   protected Class25(Text title) {
      super(title);
   }

   @Inject(
      method = {"init"},
      at = {@At("HEAD")}
   )
   private void zware$onInit(CallbackInfo var1) {
      this.zware$openedAt = System.currentTimeMillis();
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void zware$preRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      long var6 = System.currentTimeMillis() - this.zware$openedAt;
      float var8 = Math.min(1.0F, (float)var6 / 300.0F);
      float var9 = 1.0F - (float)Math.pow(1.0F - var8, 3.0);
      int var10 = (int)(16.0F * (1.0F - var9));
      var1.method_51448().method_22903();
      var1.method_51448().method_46416(0.0F, var10, 0.0F);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void zware$postRender(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      var1.method_51448().method_22909();
   }

   @Inject(
      method = {"keyPressed"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void zware$handleCommandTabComplete(int var1, int var2, int var3, CallbackInfoReturnable<Boolean> var4) {
      if (var1 == 258 && this.field_2382 != null && Dev.ZWare.Client.Class1.field_309 != null) {
         String var5 = this.field_2382.method_1882();
         List var6;
         if (this.zware$canContinueCompletionCycle(var5)) {
            var6 = this.zware$completionSuggestions;
            this.zware$completionIndex = (this.zware$completionIndex + 1) % var6.size();
         } else {
            var6 = Dev.ZWare.Client.Class1.field_309.method_1621(var5);
            if (var6.isEmpty()) {
               this.zware$clearCompletionCycle();
               return;
            }

            this.zware$completionSeed = var5;
            this.zware$completionSuggestions = var6;
            this.zware$completionIndex = 0;
         }

         Dev.ZWare.Client.pkg4.Class23.Inner1 var7 = (Dev.ZWare.Client.pkg4.Class23.Inner1)var6.get(this.zware$completionIndex);
         this.zware$lastAppliedCompletion = var7.method_1332();
         this.field_2382.method_1852(var7.method_1332());
         this.field_2382.method_1872(false);
         this.field_2382.method_1875(this.field_2382.method_1881());
         var4.setReturnValue(true);
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void zware$renderCommandSuggestions(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.field_2382 != null && Dev.ZWare.Client.Class1.field_309 != null) {
         String var6 = this.field_2382.method_1882();
         List var7 = this.zware$getVisibleSuggestions(var6);
         if (var7.isEmpty()) {
            if (!this.zware$canContinueCompletionCycle(var6)) {
               this.zware$clearCompletionCycle();
            }
         } else {
            int var8 = this.zware$canContinueCompletionCycle(var6) ? this.zware$completionIndex : 0;
            int var9 = 9 + 2;
            int var10 = var7.stream().map(Dev.ZWare.Client.pkg4.Class23.Inner1::cR).mapToInt(this.field_22793::method_1727).max().orElse(0) + 8;
            int var11 = var7.size() * var9 + 4;
            int var12 = this.field_2382.method_46426();
            int var13 = this.field_2382.method_46427() - var11 - 4;
            if (var13 < 2) {
               var13 = this.field_2382.method_46427() + this.field_2382.method_25364() + 4;
            }

            var1.method_25294(var12, var13, var12 + var10, var13 + var11, -1342177280);
            var1.method_25294(var12, var13, var12 + var10, var13 + 1, -10855846);
            var1.method_25294(var12, var13 + var11 - 1, var12 + var10, var13 + var11, -10855846);
            var1.method_25294(var12, var13, var12 + 1, var13 + var11, -10855846);
            var1.method_25294(var12 + var10 - 1, var13, var12 + var10, var13 + var11, -10855846);

            for (int var14 = 0; var14 < var7.size(); var14++) {
               int var15 = var13 + 2 + var14 * var9;
               if (var14 == var8) {
                  var1.method_25294(var12 + 1, var15 - 1, var12 + var10 - 1, var15 + 9 + 1, 1347987199);
               }

               var1.method_25303(this.field_22793, ((Dev.ZWare.Client.pkg4.Class23.Inner1)var7.get(var14)).method_1331(), var12 + 4, var15, -1);
            }
         }
      }
   }

   @Unique
   private List<Dev.ZWare.Client.pkg4.Class23.Inner1> zware$getVisibleSuggestions(String var1) {
      return this.zware$canContinueCompletionCycle(var1) ? this.zware$completionSuggestions : Dev.ZWare.Client.Class1.field_309.method_1621(var1);
   }

   @Unique
   private boolean zware$canContinueCompletionCycle(String var1) {
      return this.zware$completionSeed != null
         && this.zware$lastAppliedCompletion != null
         && Objects.equals(var1, this.zware$lastAppliedCompletion)
         && this.zware$completionSuggestions != null
         && !this.zware$completionSuggestions.isEmpty();
   }

   @Unique
   private void zware$clearCompletionCycle() {
      this.zware$completionSeed = null;
      this.zware$lastAppliedCompletion = null;
      this.zware$completionSuggestions = List.of();
      this.zware$completionIndex = 0;
   }
}
