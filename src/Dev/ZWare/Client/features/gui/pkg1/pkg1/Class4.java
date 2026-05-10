package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Formatting;

public class Class4 extends Class11 {
   // $VF: renamed from: n Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_1103;
   // $VF: renamed from: o boolean
   public boolean field_1104;

   public Class4(Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> setting) {
      super(setting.method_670());
      this.field_1103 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.a(context, this.method_1723() ? this.c(this.a(mouseX, mouseY)) : this.b(this.a(mouseX, mouseY)));
      if (this.field_1104) {
         this.a("Press a Key/Button...", -1);
      } else {
         String var5 = this.field_1103.method_671().toString().toUpperCase();
         this.a(this.field_1103.method_670() + " " + Formatting.field_1080 + var5, this.e());
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1103.method_710());
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (this.field_1104) {
         if (Dev.ZWare.Client.features.pkg3.Class4.method_429(mouseButton)) {
            this.method_1760(Dev.ZWare.Client.features.pkg3.Class4.method_428(mouseButton));
         }
      } else {
         super.method_1702(mouseX, mouseY, mouseButton);
         if (this.a(mouseX, mouseY)) {
            this.f();
         }
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1104) {
         Dev.ZWare.Client.features.pkg3.Class4 var2 = new Dev.ZWare.Client.features.pkg3.Class4(key);
         if (key == 261 || key == 259 || key == 256) {
            var2 = Dev.ZWare.Client.features.pkg3.Class4.method_427();
         }

         this.method_1760(var2);
      }
   }

   // $VF: renamed from: e () void
   @Override
   public void method_1722() {
      this.field_1104 = !this.field_1104;
   }

   // $VF: renamed from: c () boolean
   @Override
   public boolean method_1723() {
      return !this.field_1104;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      if (this.field_1104) {
         return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Press a Key/Button...") + 8;
      } else {
         String var1 = this.field_1103.method_671().toString().toUpperCase();
         return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1103.method_670() + " " + Formatting.field_1080 + var1) + 8;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class4) void
   private void method_1760(Dev.ZWare.Client.features.pkg3.Class4 var1) {
      if (this.field_1103.method_681() instanceof Dev.ZWare.Client.features.pkg1.Class1 var2 && var2.a("Keybind") == this.field_1103) {
         var2.method_1913(var1.method_430());
      } else {
         this.field_1103.method_672(var1);
         if (Dev.ZWare.Client.Class1.field_317 != null) {
            Dev.ZWare.Client.Class1.field_317.method_171();
         }
      }

      this.d();
   }
}
