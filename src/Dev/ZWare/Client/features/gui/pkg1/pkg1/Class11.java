package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvents;

public class Class11 extends Dev.ZWare.Client.features.gui.pkg1.Class1 {
   // $VF: renamed from: l boolean
   private boolean field_1083;
   // $VF: renamed from: m boolean
   protected boolean field_1084;

   public Class11(String name) {
      super(name);
      this.j = this.method_1724();
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.method_1720(mouseX, mouseY);
      this.j = this.method_1711();
      this.method_1726(context, this.method_1733(this.field_1084));
      this.method_1727(this.a(), this.method_1736());
   }

   // $VF: renamed from: a (int, int) void
   protected void method_1720(int mouseX, int mouseY) {
      boolean var3 = this.method_1717(mouseX, mouseY);
      if (var3 && !this.field_1084) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class4 var4 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
         if (var4 != null && var4.d()) {
            var4.method_1940();
         }
      }

      this.field_1084 = var3;
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (mouseButton == 0 && this.method_1717(mouseX, mouseY)) {
         this.method_1721();
      }
   }

   // $VF: renamed from: d () void
   public void method_1721() {
      this.field_1083 = !this.field_1083;
      this.method_1722();
      this.method_1728();
   }

   // $VF: renamed from: e () void
   public void method_1722() {
   }

   // $VF: renamed from: c () boolean
   public boolean method_1723() {
      return this.field_1083;
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return this.method_1724();
   }

   // $VF: renamed from: d () int
   protected int method_1724() {
      return 14;
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      return this.method_1725(mouseX, mouseY, this.a(), this.b(), this.a() + this.a(), this.b() + this.method_1724());
   }

   // $VF: renamed from: a (int, int, float, float, float, float) boolean
   protected boolean method_1725(int mouseX, int mouseY, float left, float top, float right, float bottom) {
      for (Dev.ZWare.Client.features.gui.Class1 var8 : OyVeyGui.getClickGui().getComponents()) {
         if (var8.field_1064) {
            return false;
         }
      }

      return mouseX >= left && mouseX <= right && mouseY >= top && mouseY <= bottom;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int) void
   protected void method_1726(DrawContext context, int color) {
      boolean var3 = this.method_1723();
      float var4 = 1.0F;
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var5 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      if (var5 != null && var5.field_1362.method_671() == Dev.ZWare.Client.features.pkg1.pkg4.Class8.Inner4.Slide) {
         OyVeyGui var6 = OyVeyGui.getClickGui();
         if (var6 != null && var6.getOpenedAt() > 0L) {
            long var7 = System.nanoTime() - var6.getOpenedAt();
            long var9 = 50000000L;
            long var11 = (long)(this.h * 1000000.0F);
            long var13 = var9 + var11;
            if (var7 < var13) {
               var4 = 0.0F;
            } else {
               var4 = Math.min(1.0F, (float)(var7 - var13) / 3.0E8F);
            }
         }
      }

      if (var3 && var4 < 1.0F) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(context.method_51448(), this.g, this.h, this.method_1729(), this.method_1730(), this.method_1735(false));
         float var15 = 1.0F - (float)Math.pow(1.0F - var4, 3.0);
         float var16 = this.i * var15;
         if (var16 > 0.0F) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(context.method_51448(), this.g, this.h, this.g + var16, this.method_1730(), color);
         }
      } else {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(context.method_51448(), this.g, this.h, this.method_1729(), this.method_1730(), color);
      }
   }

   // $VF: renamed from: a (java.lang.String, int) void
   protected void method_1727(String text, int color) {
      this.a(text, this.method_1731(), this.method_1732(), color);
   }

   // $VF: renamed from: f () void
   public void method_1728() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class4 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
      if (var1 != null && var1.d() && var1.field_1267.method_671() != Dev.ZWare.Client.features.pkg1.pkg4.Class4.Inner1.None) {
         var1.method_1939();
      } else {
         c.method_1483().method_4873(PositionedSoundInstance.method_47978(SoundEvents.field_15015, 1.0F));
      }
   }

   // $VF: renamed from: c () float
   protected float method_1729() {
      return this.g + this.i;
   }

   // $VF: renamed from: d () float
   protected float method_1730() {
      return this.h + this.method_1724() - 0.5F;
   }

   // $VF: renamed from: e () float
   protected float method_1731() {
      return this.g + 3.0F;
   }

   // $VF: renamed from: f () float
   protected float method_1732() {
      return this.h + Math.max(0.0F, ((float)this.method_1724() - Dev.ZWare.Client.pkg1.pkg2.Class1.method_134()) / 2.0F) - 0.5F;
   }

   // $VF: renamed from: a (boolean) int
   protected int method_1733(boolean hovering) {
      return this.method_1723() ? this.method_1734(hovering) : this.method_1735(hovering);
   }

   // $VF: renamed from: b (boolean) int
   protected int method_1734(boolean hovering) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      Color var3 = hovering ? var2.field_1341.method_671() : var2.field_1340.method_671();
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), this.method_1741()).getRGB();
   }

   // $VF: renamed from: c (boolean) int
   protected int method_1735(boolean hovering) {
      int var2 = hovering ? 85 : 65;
      return new Color(var2, var2, var2, this.method_1742()).getRGB();
   }

   // $VF: renamed from: e () int
   protected int method_1736() {
      return this.method_1723() ? -1 : -5592406;
   }

   // $VF: renamed from: a (java.lang.String, int) java.lang.String
   protected String method_1737(String text, int maxWidth) {
      if (text != null && !text.isEmpty() && maxWidth > 0 && Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(text) > maxWidth) {
         String var3 = "...";
         int var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3);
         if (var4 >= maxWidth) {
            return var3;
         } else {
            int var5 = text.length();

            while (var5 > 0 && Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(text.substring(0, var5)) + var4 > maxWidth) {
               var5--;
            }

            return text.substring(0, Math.max(0, var5)) + var3;
         }
      } else {
         return text;
      }
   }

   // $VF: renamed from: f () int
   public static int method_1738() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var0 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var0 != null && var0.field_1350 != null ? var0.field_1350.method_671() : 84;
   }

   // $VF: renamed from: g () int
   public static int method_1739() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var0 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var0 != null && var0.field_1351 != null ? var0.field_1351.method_671() : 14;
   }

   // $VF: renamed from: g () float
   public static float method_1740() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var0 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var0 != null && var0.field_1352 != null ? var0.field_1352.method_671() : 2.0F;
   }

   // $VF: renamed from: h () int
   private int method_1741() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var1 != null && var1.field_1343 != null ? var1.field_1343.method_671() : 180;
   }

   // $VF: renamed from: i () int
   private int method_1742() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var1 != null && var1.field_1344 != null ? var1.field_1344.method_671() : 70;
   }
}
