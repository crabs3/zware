package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;

public class Class15 extends Class11 {
   // $VF: renamed from: n float
   private static final float field_1130 = 4.0F;
   // $VF: renamed from: o java.util.List
   private final List<Dev.ZWare.Client.features.gui.pkg1.Class1> field_1131 = new ArrayList<>();
   // $VF: renamed from: p boolean
   private boolean field_1132;

   public Class15(String name, List<Dev.ZWare.Client.features.gui.pkg1.Class1> items) {
      super(name);
      if (items != null) {
         this.field_1131.addAll(items);
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.a(context, this.b(this.method_1790(mouseX, mouseY)));
      this.a(this.a(), -1);
      this.method_1788();
      this.method_1789();
      if (this.field_1132) {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var6 : this.field_1131) {
            if (!var6.method_1713()) {
               var6.method_1701(context, mouseX, mouseY, partialTicks);
            }
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (mouseButton == 1 && this.method_1790(mouseX, mouseY)) {
         this.field_1132 = !this.field_1132;
         this.f();
      } else if (this.field_1132) {
         this.method_1788();
         this.method_1789();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var5 : this.field_1131) {
            if (!var5.method_1713()) {
               var5.method_1702(mouseX, mouseY, mouseButton);
            }
         }
      }
   }

   // $VF: renamed from: b (int, int, int) void
   @Override
   public void method_1703(int mouseX, int mouseY, int releaseButton) {
      if (this.field_1132) {
         this.method_1788();
         this.method_1789();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var5 : this.field_1131) {
            if (!var5.method_1713()) {
               var5.method_1703(mouseX, mouseY, releaseButton);
            }
         }
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1132) {
         this.method_1788();
         this.method_1789();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var4 : this.field_1131) {
            if (!var4.method_1713()) {
               var4.method_1705(typedChar, keyCode);
            }
         }
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1132) {
         this.method_1788();
         this.method_1789();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var3 : this.field_1131) {
            if (!var3.method_1713()) {
               var3.method_1706(key);
            }
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.method_1788();
      this.a(!this.method_1787());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      if (!this.field_1132) {
         return this.d();
      } else {
         float var1 = this.d();
         float var2 = Class11.method_1740();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var4 : this.field_1131) {
            if (!var4.method_1713()) {
               var1 += var4.method_1711() + var2;
            }
         }

         return Math.round(var1);
      }
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      if (this.method_1790(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1132) {
         return false;
      } else {
         this.method_1788();
         this.method_1789();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var4 : this.field_1131) {
            if (!var4.method_1713() && var4.method_1717(mouseX, mouseY)) {
               return true;
            }
         }

         return false;
      }
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      int var1 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.a()) + 8;

      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var3 : this.field_1131) {
         if (!var3.method_1713()) {
            var1 = Math.max(var1, var3.method_1718() + Math.round(4.0F));
         }
      }

      return var1;
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      if (!this.field_1132) {
         return false;
      } else {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var2 : this.field_1131) {
            if (!var2.method_1713() && var2.method_1719()) {
               return true;
            }
         }

         return false;
      }
   }

   // $VF: renamed from: d () boolean
   private boolean method_1787() {
      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var2 : this.field_1131) {
         if (!var2.method_1713()) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: g () void
   private void method_1788() {
      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var2 : this.field_1131) {
         var2.method_1704();
      }
   }

   // $VF: renamed from: h () void
   private void method_1789() {
      float var1 = this.d();
      float var2 = Class11.method_1740();

      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var4 : this.field_1131) {
         if (!var4.method_1713()) {
            var4.method_1700(this.g + 4.0F, this.h + var1);
            var4.method_1710(Math.max(0, this.i - Math.round(4.0F)));
            var1 += var4.method_1711() + var2;
         }
      }
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1790(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }
}
