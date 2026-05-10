package Dev.ZWare.Client.features.gui;

import Dev.ZWare.Client.features.gui.pkg1.pkg1.Class9;
import Dev.ZWare.Client.features.pkg1.pkg4.Class11;
import Dev.ZWare.Client.features.pkg1.pkg4.Class8;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class HudEditorScreen extends Screen {
   // $VF: renamed from: a java.util.ArrayList
   private final ArrayList<Class1> field_3089 = new ArrayList<>();
   // $VF: renamed from: b Dev.ZWare.Client.features.pkg1.pkg4.Class11
   public Class11 field_3090;
   // $VF: renamed from: c boolean
   public boolean field_3091;

   public HudEditorScreen() {
      super(Text.method_43470("ZWare HUD"));
      this.method_3794();
   }

   // $VF: renamed from: a () void
   private void method_3794() {
      this.field_3089.add(new Class1("Hud", 50, 50, true) {
         // $VF: renamed from: c () void
         @Override
         public void method_1665() {
            Class1.field_1061 = new int[]{1};
            Dev.ZWare.Client.Class1.field_316.method_520(Dev.ZWare.Client.features.pkg1.Class1.Inner1.field_677).forEach(var1 -> {
               if (!var1.field_1230) {
                  this.a(new Class9(var1));
               }
            });
         }
      });
      this.field_3089.forEach(var0 -> var0.method_1691().sort(Comparator.comparing(Dev.ZWare.Client.features.Class1::a)));
   }

   public void method_25394(DrawContext context, int mouseX, int mouseY, float delta) {
      this.field_3091 = false;
      this.field_3089.forEach(var4 -> var4.method_1666(context, mouseX, mouseY, delta));
      Class8 var5 = Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Class8.class) : Class8.method_1995();
      if (var5 != null && var5.method_1996()) {
         var5.method_1999(context);
      }
   }

   public boolean method_25402(double mouseX, double mouseY, int clickedButton) {
      this.field_3089.forEach(var5 -> var5.method_1669((int)mouseX, (int)mouseY, clickedButton));
      return super.method_25402(mouseX, mouseY, clickedButton);
   }

   public boolean method_25406(double mouseX, double mouseY, int releaseButton) {
      this.field_3089.forEach(var5 -> var5.method_1670((int)mouseX, (int)mouseY, releaseButton));
      return super.method_25406(mouseX, mouseY, releaseButton);
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (verticalAmount < 0.0) {
         this.field_3089.forEach(var0 -> var0.method_1681(var0.method_1680() - 10));
      } else if (verticalAmount > 0.0) {
         this.field_3089.forEach(var0 -> var0.method_1681(var0.method_1680() + 10));
      }

      return super.method_25401(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   public boolean method_25404(int keyCode, int scanCode, int modifiers) {
      this.field_3089.forEach(var1 -> var1.method_1672(keyCode));
      return super.method_25404(keyCode, scanCode, modifiers);
   }

   public boolean method_25400(char chr, int modifiers) {
      this.field_3089.forEach(var2 -> var2.method_1671(chr, modifiers));
      return super.method_25400(chr, modifiers);
   }

   public boolean method_25421() {
      return false;
   }

   public ArrayList<Class1> getComponents() {
      return this.field_3089;
   }
}
