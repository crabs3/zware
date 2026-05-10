package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;

public class Class9 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1217 = 3;
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.Class1
   private final Dev.ZWare.Client.features.pkg1.Class1 field_1218;
   // $VF: renamed from: p java.util.List
   private List<Dev.ZWare.Client.features.gui.pkg1.Class1> field_1219 = new ArrayList<>();
   // $VF: renamed from: q boolean
   private boolean field_1220;
   // $VF: renamed from: r float
   private float field_1221;
   // $VF: renamed from: s long
   private long field_1222 = System.nanoTime();

   public Class9(Dev.ZWare.Client.features.pkg1.Class1 module) {
      super(module.a());
      this.field_1218 = module;
      this.method_1874();
   }

   // $VF: renamed from: g () void
   public void method_1874() {
      ArrayList var1 = new ArrayList();
      String var2 = null;
      ArrayList var3 = new ArrayList();
      if (!this.field_1218.a().isEmpty()) {
         for (Dev.ZWare.Client.features.pkg3.Class8 var5 : this.field_1218.a()) {
            if (this.method_1876(var5)) {
               String var6 = var5.method_682();
               Dev.ZWare.Client.features.gui.pkg1.Class1 var7 = this.method_1875(var5);
               if (var7 != null) {
                  if (var6 != null && !var6.isBlank()) {
                     if (!Objects.equals(var6, var2)) {
                        if (var2 != null && !var3.isEmpty()) {
                           var1.add(new Class15(var2, var3));
                           var3 = new ArrayList();
                        }

                        var2 = var6;
                     }

                     var3.add(var7);
                  } else {
                     if (var2 != null && !var3.isEmpty()) {
                        var1.add(new Class15(var2, var3));
                        var3 = new ArrayList();
                     }

                     var2 = null;
                     var1.add(var7);
                  }
               }
            }
         }

         if (var2 != null && !var3.isEmpty()) {
            var1.add(new Class15(var2, var3));
         }
      }

      var1.add(new Class4(this.field_1218.a("Keybind")));
      this.field_1219 = var1;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) Dev.ZWare.Client.features.gui.pkg1.Class1
   private Dev.ZWare.Client.features.gui.pkg1.Class1 method_1875(Dev.ZWare.Client.features.pkg3.Class8<?> var1) {
      if (this.field_1218 instanceof Dev.ZWare.Client.features.pkg1.pkg4.Class8 var2 && var1 == var2.field_1370) {
         return new Class13(var1);
      } else if (var1.method_671() instanceof Boolean && !var1.method_670().equals("Enabled")) {
         return new Class5(var1);
      } else if (var1.method_671() instanceof Dev.ZWare.Client.features.pkg3.Class4
         && !var1.method_670().equalsIgnoreCase("Keybind")
         && !this.field_1218.a().equalsIgnoreCase("Hud")) {
         return new Class4(var1);
      } else if (var1 instanceof Dev.ZWare.Client.features.pkg3.Class3 var6) {
         return new Class7(var6);
      } else if (var1 instanceof Dev.ZWare.Client.features.pkg3.Class6 var5) {
         return new Class17(var5);
      } else if (var1 instanceof Dev.ZWare.Client.features.pkg3.Class7 var4) {
         return new Class8(var4);
      } else if (this.method_1877(var1)) {
         return new Class14(var1);
      } else if ((var1.method_671() instanceof String || var1.method_671() instanceof Character) && !var1.method_670().equalsIgnoreCase("displayName")) {
         return new Class6(var1);
      } else if (var1.method_699()) {
         return new Class1(var1);
      } else if (var1.method_700()) {
         return new Class16(var1);
      } else if (var1.method_698()) {
         return new Class2(var1);
      } else if (var1.method_694() && var1.method_708()) {
         return new Class12(var1);
      } else {
         return var1.method_695() ? new Class10(var1) : null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) boolean
   private boolean method_1876(Dev.ZWare.Client.features.pkg3.Class8<?> var1) {
      if (var1 == null) {
         return false;
      } else if (var1.method_671() instanceof Boolean && !var1.method_670().equals("Enabled")) {
         return true;
      } else if (var1.method_671() instanceof Dev.ZWare.Client.features.pkg3.Class4
         && !var1.method_670().equalsIgnoreCase("Keybind")
         && !this.field_1218.a().equalsIgnoreCase("Hud")) {
         return true;
      } else if (!(var1 instanceof Dev.ZWare.Client.features.pkg3.Class3)
         && !(var1 instanceof Dev.ZWare.Client.features.pkg3.Class6)
         && !(var1 instanceof Dev.ZWare.Client.features.pkg3.Class7)) {
         if ((var1.method_671() instanceof String || var1.method_671() instanceof Character) && !var1.method_670().equalsIgnoreCase("displayName")) {
            return true;
         } else if (var1.method_699() || var1.method_700() || var1.method_698()) {
            return true;
         } else {
            return var1.method_694() && var1.method_708() ? true : var1.method_695();
         }
      } else {
         return true;
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg3.Class8) boolean
   private boolean method_1877(Dev.ZWare.Client.features.pkg3.Class8<?> var1) {
      if (!(var1.method_671() instanceof String)) {
         return false;
      } else {
         String var2 = var1.method_670();
         return var2 == null ? false : var2.equalsIgnoreCase("Image") || var2.equalsIgnoreCase("Shader Image");
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.j = this.method_1711();
      this.a(context, this.a(this.a(mouseX, mouseY)));
      this.a(this.field_1218.method_1907(), this.e());
      if (this.method_1886() && this.a(mouseX, mouseY)) {
         OyVeyGui.getClickGui().queueDescriptionTooltip(this, mouseX, mouseY);
      }

      this.method_1879();
      float var5 = this.method_1880();
      if (!this.field_1219.isEmpty() && var5 > 0.5F) {
         float var6 = this.method_1724();
         float var7 = Class11.method_1740();
         int var8 = Math.round(this.g);
         int var9 = Math.round(this.h + var6);
         int var10 = Math.round(this.g + this.i);
         int var11 = Math.round(this.h + var6 + var5);
         context.method_44379(var8, var9, var10, var11);

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var13 : this.field_1219) {
            Dev.ZWare.Client.features.gui.Class1.field_1061[0]++;
            if (!var13.method_1713()) {
               var13.method_1700(this.g + 1.0F, this.h + var6);
               var13.method_1710(Math.max(0, this.i - 2));
               boolean var14 = var13.method_1719() || var13.method_1717(mouseX, mouseY);
               if (var14) {
                  context.method_44380();
               }

               var13.method_1701(context, mouseX, mouseY, partialTicks);
               if (var14) {
                  context.method_44379(var8, var9, var10, var11);
               }

               var6 += var13.method_1711() + var7;
            }
         }

         context.method_44380();
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      super.method_1702(mouseX, mouseY, mouseButton);
      if (!this.field_1219.isEmpty()) {
         if (mouseButton == 1 && this.a(mouseX, mouseY)) {
            this.field_1220 = !this.field_1220;
            Dev.ZWare.Client.features.pkg1.pkg4.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
            if (var4 != null && var4.d() && var4.field_1267.method_671() != Dev.ZWare.Client.features.pkg1.pkg4.Class4.Inner1.None) {
               var4.method_1939();
            } else {
               this.f();
            }
         }

         if (this.field_1220) {
            for (Dev.ZWare.Client.features.gui.pkg1.Class1 var5 : this.field_1219) {
               if (!var5.method_1713()) {
                  var5.method_1702(mouseX, mouseY, mouseButton);
               }
            }
         }
      }
   }

   // $VF: renamed from: b (int, int, int) void
   @Override
   public void method_1703(int mouseX, int mouseY, int releaseButton) {
      super.b(mouseX, mouseY, releaseButton);
      if (!this.field_1219.isEmpty() && this.field_1220) {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var5 : this.field_1219) {
            if (!var5.method_1713()) {
               var5.method_1703(mouseX, mouseY, releaseButton);
            }
         }
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      super.a(typedChar, keyCode);
      if (!this.field_1219.isEmpty() && this.field_1220) {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var4 : this.field_1219) {
            if (!var4.method_1713()) {
               var4.method_1705(typedChar, keyCode);
            }
         }
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      super.a(key);
      if (!this.field_1219.isEmpty() && this.field_1220) {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var3 : this.field_1219) {
            if (!var3.method_1713()) {
               var3.method_1706(key);
            }
         }
      }
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      this.method_1879();
      float var1 = this.method_1880();
      return var1 > 0.5F ? Math.round(this.method_1724() + var1 + 2.0F) : this.method_1724();
   }

   // $VF: renamed from: d () int
   @Override
   protected int method_1724() {
      return Class11.method_1739();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.Class1
   public Dev.ZWare.Client.features.pkg1.Class1 method_1878() {
      return this.field_1218;
   }

   // $VF: renamed from: e () void
   @Override
   public void method_1722() {
      this.field_1218.method_1905();
   }

   // $VF: renamed from: c () boolean
   @Override
   public boolean method_1723() {
      return this.field_1218.method_1558();
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      this.method_1879();
      int var1 = Math.max(Class11.method_1738(), Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1218.method_1907()) + 8);
      if (!this.field_1220) {
         return var1;
      } else {
         int var2 = 0;

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var4 : this.field_1219) {
            if (!var4.method_1713()) {
               var2 = Math.max(var2, var4.method_1718());
            }
         }

         return Math.max(var1, var2 + 2);
      }
   }

   // $VF: renamed from: h () void
   private void method_1879() {
      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var2 : this.field_1219) {
         var2.method_1704();
      }
   }

   // $VF: renamed from: h () float
   private float method_1880() {
      float var1 = this.field_1220 ? this.method_1881() : 0.0F;
      long var2 = System.nanoTime();
      float var4 = this.method_1883(var2, this.method_1884());
      this.field_1221 = this.method_1882(this.field_1221, var1, var4);
      this.field_1222 = var2;
      return this.field_1221;
   }

   // $VF: renamed from: i () float
   private float method_1881() {
      float var1 = 0.0F;

      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var3 : this.field_1219) {
         if (!var3.method_1713()) {
            var1 += var3.method_1711() + Class11.method_1740();
         }
      }

      return var1;
   }

   // $VF: renamed from: a (float, float, float) float
   private float method_1882(float var1, float var2, float var3) {
      return Math.abs(var2 - var1) <= 0.5F ? var2 : var1 + (var2 - var1) * var3;
   }

   // $VF: renamed from: a (long, float) float
   private float method_1883(long var1, float var3) {
      if (var3 >= 1.0F) {
         return 1.0F;
      } else {
         float var4 = Math.max(0.0F, (float)(var1 - this.field_1222) / 1.0E9F);
         float var5 = Math.max(1.0F, var4 * 60.0F);
         float var6 = Math.max(0.05F, Math.min(0.99F, var3));
         return 1.0F - (float)Math.pow(1.0F - var6, var5);
      }
   }

   // $VF: renamed from: j () float
   private float method_1884() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var1 != null && var1.field_1361 != null ? var1.field_1361.method_671() : 0.35F;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int) void
   public void method_1885(DrawContext context, int mouseX, int mouseY) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var4 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      String var5 = this.field_1218.method_1909();
      float var6 = var4 != null && var4.field_1354 != null ? var4.field_1354.method_671() : 0.9F;
      int var7 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var5, var6);
      int var8 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(var6);
      int var9 = var7 + 6;
      int var10 = var8 + 6;
      int var11 = context.method_51421();
      int var12 = context.method_51443();
      float var13 = var4 != null && var4.field_1355 != null ? var4.field_1355.method_671() : 12.0F;
      float var14 = var4 != null && var4.field_1356 != null ? var4.field_1356.method_671() : 6.0F;
      int var15 = Math.round(mouseX + var13);
      int var16 = Math.round(mouseY + var14);
      if (var15 + var9 > var11 - 2) {
         var15 = Math.round(mouseX - var13) - var9;
      }

      var15 = Math.max(2, Math.min(var15, var11 - var9 - 2));
      if (var16 + var10 > var12 - 2) {
         var16 = Math.round(mouseY - var14) - var10;
      }

      var16 = Math.max(2, Math.min(var16, var12 - var10 - 2));
      int var17 = var4 != null && var4.field_1358 != null ? var4.field_1358.method_671().getRGB() : new Color(0, 0, 0, 210).getRGB();
      int var18 = var4 != null && var4.field_1359 != null ? var4.field_1359.method_671().getRGB() : new Color(24, 24, 24, 235).getRGB();
      int var19 = var4 != null && var4.field_1357 != null ? var4.field_1357.method_671().getRGB() : -1;
      context.method_25294(var15, var16, var15 + var9, var16 + var10, var17);
      context.method_25294(var15 - 1, var16 - 1, var15 + var9 + 1, var16, var18);
      context.method_25294(var15 - 1, var16 + var10, var15 + var9 + 1, var16 + var10 + 1, var18);
      context.method_25294(var15 - 1, var16, var15, var16 + var10, var18);
      context.method_25294(var15 + var9, var16, var15 + var9 + 1, var16 + var10, var18);
      Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(context, var5, var15 + 3, var16 + 3, var19, var6);
   }

   // $VF: renamed from: d () boolean
   private boolean method_1886() {
      if (this.field_1218 == null) {
         return false;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
         String var2 = this.field_1218.method_1909();
         return var1 != null && var1.field_1337 != null && var1.field_1337.method_671() && var2 != null && !var2.isBlank();
      }
   }
}
