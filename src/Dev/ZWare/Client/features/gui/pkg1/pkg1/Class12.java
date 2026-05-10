package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;

public class Class12 extends Class11 {
   // $VF: renamed from: n java.lang.Number
   private final Number field_1172;
   // $VF: renamed from: o java.lang.Number
   private final Number field_1173;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<Number> field_1174;
   // $VF: renamed from: q boolean
   private boolean field_1175;
   // $VF: renamed from: r java.lang.String
   private String field_1176 = "";

   public Class12(Dev.ZWare.Client.features.pkg3.Class8<Number> setting) {
      super(setting.method_670());
      this.field_1174 = setting;
      this.field_1172 = (Number)setting.method_676();
      this.field_1173 = (Number)setting.method_678();
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.method_1833(mouseX, mouseY);
      this.a(context, this.c(this.method_1717(mouseX, mouseY)));
      float var5 = this.field_1174.method_671().floatValue() <= this.field_1172.floatValue() ? this.g : this.g + this.i * this.method_1839();
      if (var5 > this.g) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(context.method_51448(), this.g, this.h, var5, this.d(), this.b(this.method_1717(mouseX, mouseY)));
      }

      String var6 = this.field_1175 ? this.field_1176 + Class6.method_1819() : this.method_1842();
      this.a(this.a() + " " + Formatting.field_1080 + var6, -1);
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (this.method_1717(mouseX, mouseY)) {
         if (mouseButton == 1) {
            this.field_1175 = !this.field_1175;
            this.field_1176 = this.field_1175 ? this.method_1842() : "";
            this.f();
         } else {
            if (!this.field_1175 && mouseButton == 0) {
               this.method_1834(mouseX);
               this.f();
            }
         }
      }
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      return this.a(mouseX, mouseY, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1174.method_710());
   }

   // $VF: renamed from: b (int, int) void
   private void method_1833(int var1, int var2) {
      if (!this.field_1175) {
         if (this.method_1717(var1, var2) && GLFW.glfwGetMouseButton(c.method_22683().method_4490(), 0) == 1) {
            this.method_1834(var1);
         }
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1175 && this.method_1843(typedChar)) {
         if (typedChar != '-' || !this.field_1176.contains("-") && !(this.field_1172.doubleValue() >= 0.0) && this.field_1176.isEmpty()) {
            if (typedChar != '.' || !this.field_1176.contains(".") && !(this.field_1174.method_671() instanceof Integer)) {
               this.field_1176 = this.field_1176 + typedChar;
            }
         }
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1175) {
         switch (key) {
            case 256:
               this.field_1175 = false;
               this.field_1176 = "";
               return;
            case 257:
            case 335:
               this.method_1835();
               this.field_1175 = false;
               this.field_1176 = "";
               return;
            case 259:
               if (!this.field_1176.isEmpty()) {
                  this.field_1176 = this.field_1176.substring(0, this.field_1176.length() - 1);
               }

               return;
         }
      }
   }

   // $VF: renamed from: d (int) void
   private void method_1834(int var1) {
      float var2 = Math.max(0.0F, Math.min(1.0F, (var1 - this.g) / this.i));
      double var3 = this.field_1174.method_676().doubleValue();
      double var5 = this.field_1174.method_678().doubleValue();
      double var7 = var3 + (var5 - var3) * var2;
      this.method_1836(var7);
   }

   // $VF: renamed from: g () void
   private void method_1835() {
      if (this.field_1176 != null
         && !this.field_1176.isBlank()
         && !"-".equals(this.field_1176)
         && !".".equals(this.field_1176)
         && !"-.".equals(this.field_1176)) {
         try {
            this.method_1836(Double.parseDouble(this.field_1176));
         } catch (NumberFormatException var2) {
         }
      }
   }

   // $VF: renamed from: a (double) void
   private void method_1836(double var1) {
      double var3 = this.field_1174.method_676().doubleValue();
      double var5 = this.field_1174.method_678().doubleValue();
      var1 = Math.max(var3, Math.min(var5, var1));
      if (this.field_1174.method_671() instanceof Double) {
         this.field_1174.method_672(this.method_1841(var1, this.method_1840()));
      } else if (this.field_1174.method_671() instanceof Float) {
         this.field_1174.method_672((float)this.method_1841(var1, this.method_1840()));
      } else if (this.field_1174.method_671() instanceof Integer) {
         this.field_1174.method_672((int)Math.round(var1));
      }
   }

   // $VF: renamed from: h () float
   private float method_1837() {
      return this.field_1173.floatValue() - this.field_1172.floatValue();
   }

   // $VF: renamed from: i () float
   private float method_1838() {
      return this.field_1174.method_671().floatValue() - this.field_1172.floatValue();
   }

   // $VF: renamed from: j () float
   private float method_1839() {
      return this.method_1838() / this.method_1837();
   }

   // $VF: renamed from: j () int
   private int method_1840() {
      double var1 = Math.abs(this.field_1173.doubleValue() - this.field_1172.doubleValue());
      if (var1 <= 0.1) {
         return 4;
      } else if (var1 <= 1.0) {
         return 3;
      } else {
         return var1 <= 10.0 ? 2 : 1;
      }
   }

   // $VF: renamed from: a (double, int) double
   private double method_1841(double var1, int var3) {
      double var4 = Math.pow(10.0, var3);
      return Math.round(var1 * var4) / var4;
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1842() {
      if (this.field_1174.method_671() instanceof Integer) {
         return String.valueOf(this.field_1174.method_671().intValue());
      } else {
         return this.field_1174.method_671() instanceof Float
            ? String.valueOf(this.field_1174.method_671().floatValue())
            : String.valueOf(Double.valueOf(this.field_1174.method_671().doubleValue()));
      }
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_1843(char var1) {
      return Character.isDigit(var1) || var1 == '.' || var1 == '-';
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      String var1 = this.field_1175 ? this.field_1176 + Class6.method_1819() : this.method_1842();
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.a() + " " + Formatting.field_1080 + var1) + 8;
   }
}
