package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.awt.Color;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;

public class Class2 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1177 = 124;
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1178;
   // $VF: renamed from: p boolean
   private boolean field_1179 = false;
   // $VF: renamed from: q boolean
   private boolean field_1180 = false;
   // $VF: renamed from: r boolean
   private boolean field_1181 = false;
   // $VF: renamed from: s boolean
   private boolean field_1182 = false;
   // $VF: renamed from: t boolean
   private boolean field_1183 = false;
   // $VF: renamed from: u boolean
   private boolean field_1184 = false;
   // $VF: renamed from: v boolean
   private boolean field_1185 = false;
   // $VF: renamed from: w boolean
   private boolean field_1186 = false;
   // $VF: renamed from: x boolean
   private boolean field_1187 = false;
   // $VF: renamed from: y boolean
   private boolean field_1188 = false;
   // $VF: renamed from: z float[]
   private float[] field_1189;

   public Class2(Dev.ZWare.Client.features.pkg3.Class8<Color> setting) {
      super(setting.method_670());
      this.field_1178 = setting;
      this.i = 15;
      this.field_1189 = Color.RGBtoHSB(
         ((Color)setting.method_671()).getRed(), ((Color)setting.method_671()).getGreen(), ((Color)setting.method_671()).getBlue(), null
      );
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      Color var5 = this.field_1178.method_671();
      Color var6 = Color.BLACK;
      Color var7 = Color.getHSBColor(this.field_1189[0], 1.0F, 1.0F);
      this.a(context, this.c(this.method_1717(mouseX, mouseY)));
      Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
         context.method_51448(),
         this.g + this.i - 12.0F,
         this.h + 3.0F,
         this.g + this.i - 3.0F,
         this.h + this.d() - 2.5F,
         new Color(var5.getRGB(), false).getRGB()
      );
      this.a(this.a(), -1);
      if (this.field_1179) {
         float var8 = this.d();
         int var9 = this.method_1846();
         float var10 = this.g + 2.0F;
         int var11 = MathHelper.method_15340(mouseX - (int)var10, 0, var9);
         int var12 = MathHelper.method_15340(mouseY - (int)(this.b() + var8), 0, var9);
         float var13 = Math.max(var9 * this.field_1189[0] - 0.5F, 1.0F);
         float var14 = Math.max(var9 * this.field_1189[1] - 1.0F, 2.0F);
         float var15 = Math.max(var9 * (1.0F - this.field_1189[2]) - 1.0F, 2.0F);
         float var16 = Math.max(var9 * (var5.getAlpha() / 255.0F) - 0.5F, 1.0F);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_774(context.method_51448(), var10, this.h + var8, var10 + var9, this.h + var8 + var9, Color.WHITE, var7);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_775(
            context.method_51448(), var10, this.h + var8, var10 + var9, this.h + var8 + var9, new Color(0, 0, 0, 0), Color.BLACK
         );
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, this.h + var8, var10 + var9, this.h + var8 + var9, var6.getRGB(), 1.0F);
         this.field_1181 = this.method_1725(mouseX, mouseY, var10, this.h + var8, var10 + var9, this.h + var8 + var9);
         if (var14 < var9 && var15 < var9) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
               context.method_51448(), var10 + var14 - 1.5F, this.h + var8 + var15 - 1.5F, var10 + var14 + 1.5F, this.h + var8 + var15 + 1.5F, var6.getRGB()
            );
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
               context.method_51448(),
               var10 + var14 - 0.5F,
               this.h + var8 + var15 - 0.5F,
               var10 + var14 + 0.5F,
               this.h + var8 + var15 + 0.5F,
               Color.WHITE.getRGB()
            );
         }

         if (this.field_1187) {
            this.field_1189[1] = (float)var11 / var9;
            this.field_1189[2] = 1.0F - (float)var12 / var9;
            this.method_1844(this.field_1189);
         }

         var8 += var9 + 2;
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_774(
            context.method_51448(),
            var10,
            this.h + var8,
            var10 + var9,
            this.h + var8 + 8.0F,
            new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), 0),
            new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), 255)
         );
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, this.h + var8, var10 + var9, this.h + var8 + 8.0F, var6.getRGB(), 1.0F);
         this.field_1182 = this.method_1725(mouseX, mouseY, var10, this.h + var8, var10 + var9, this.h + var8 + 8.0F);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
            context.method_51448(), var10 + var16 - 1.5F, this.h + var8 - 1.0F, var10 + var16 + 1.5F, this.h + var8 + 9.0F, var6.getRGB()
         );
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
            context.method_51448(), var10 + var16 - 0.5F, this.h + var8, var10 + var16 + 0.5F, this.h + var8 + 8.0F, Color.WHITE.getRGB()
         );
         if (this.field_1188) {
            this.method_1845(this.field_1189, (int)(255.0F * var11 / var9));
         }

         var8 += 10.0F;

         for (float var17 = 0.0F; var17 < var9; var17 += 0.5F) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
               context.method_51448(),
               var10 + var17,
               this.h + var8,
               var10 + var17 + 0.5F,
               this.h + var8 + 8.0F,
               Color.getHSBColor(var17 / var9, 1.0F, 1.0F).getRGB()
            );
         }

         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, this.h + var8, var10 + var9, this.h + var8 + 8.0F, var6.getRGB(), 1.0F);
         this.field_1180 = this.method_1725(mouseX, mouseY, var10, this.h + var8, var10 + var9, this.h + var8 + 8.0F);
         if (var13 < var9) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
               context.method_51448(), var10 + var13 - 1.5F, this.h + var8 - 1.0F, var10 + var13 + 1.5F, this.h + var8 + 9.0F, var6.getRGB()
            );
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
               context.method_51448(), var10 + var13 - 0.5F, this.h + var8, var10 + var13 + 0.5F, this.h + var8 + 8.0F, Color.WHITE.getRGB()
            );
         }

         if (this.field_1186) {
            this.field_1189[0] = (float)var11 / var9;
            this.method_1844(this.field_1189);
         }

         var8 += 10.0F;
         int var24 = (var9 - 2) / 3;
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
            context.method_51448(), var10, this.h + var8, var10 + var24, this.h + var8 + 14.0F, this.field_1183 ? this.b(true) : this.c(false)
         );
         this.a("Copy", var10 + var24 / 2.0F - Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Copy") / 2.0F, this.h + var8 + 2.0F, -1);
         this.field_1183 = this.method_1725(mouseX, mouseY, var10, this.h + var8, var10 + var24, this.h + var8 + 14.0F);
         float var18 = var10 + var24 + 1.0F;
         float var19 = var18 + var24;
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
            context.method_51448(), var18, this.h + var8, var19, this.h + var8 + 14.0F, this.field_1184 ? this.b(true) : this.c(false)
         );
         this.a("Paste", var18 + var24 / 2.0F - Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Paste") / 2.0F, this.h + var8 + 2.0F, -1);
         this.field_1184 = this.method_1725(mouseX, mouseY, var18, this.h + var8, var19, this.h + var8 + 14.0F);
         float var20 = var19 + 1.0F;
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_766(
            context.method_51448(), var20, this.h + var8, var10 + var9, this.h + var8 + 14.0F, this.field_1185 ? this.b(true) : this.c(false)
         );
         this.a("Sync", var20 + (var10 + var9 - var20) / 2.0F - Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Sync") / 2.0F, this.h + var8 + 2.0F, -1);
         this.field_1185 = this.method_1725(mouseX, mouseY, var20, this.h + var8, var10 + var9, this.h + var8 + 14.0F);
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (this.method_1717(mouseX, mouseY) && mouseButton == 1) {
         this.field_1179 = !this.field_1179;
         this.f();
      }

      if (mouseButton == 0) {
         if (this.field_1180) {
            this.field_1186 = true;
         }

         if (this.field_1181) {
            this.field_1187 = true;
         }

         if (this.field_1182) {
            this.field_1188 = true;
         }

         if (this.field_1183) {
            OyVeyGui.setColorClipboard(this.field_1178.method_671());
            this.f();
         }

         if (this.field_1184 && OyVeyGui.getColorClipboard() != null) {
            this.field_1178.method_672(OyVeyGui.getColorClipboard());
            this.field_1189 = Color.RGBtoHSB(
               this.field_1178.method_671().getRed(), this.field_1178.method_671().getGreen(), this.field_1178.method_671().getBlue(), null
            );
            this.f();
         }

         if (this.field_1185) {
            Color var4 = this.method_1847();
            if (var4 != null) {
               Color var5 = this.field_1178.method_671();
               this.field_1178.method_672(new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), var5.getAlpha()));
               this.field_1189 = Color.RGBtoHSB(
                  this.field_1178.method_671().getRed(), this.field_1178.method_671().getGreen(), this.field_1178.method_671().getBlue(), null
               );
               this.f();
            }
         }
      }
   }

   // $VF: renamed from: b (int, int, int) void
   @Override
   public void method_1703(int mouseX, int mouseY, int releaseButton) {
      if (releaseButton == 0) {
         this.field_1186 = false;
         this.field_1187 = false;
         this.field_1188 = false;
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1178.method_710());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      if (!this.field_1179) {
         return this.d();
      } else {
         int var1 = this.method_1846();
         return this.d() + var1 + 8 + 8 + 14 + 10;
      }
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (mouseX >= this.a() && mouseX <= this.a() + this.a() && mouseY >= this.b() && mouseY <= this.b() + this.d()) {
         return true;
      } else if (!this.field_1179) {
         return false;
      } else {
         float var6 = this.g + 2.0F;
         float var7 = this.h + this.d();
         float var5 = var7 + this.method_1711() - this.d();
         return this.method_1725(mouseX, mouseY, var6, var7, var6 + this.method_1846(), var5);
      }
   }

   // $VF: renamed from: a (int, int, float, float, float, float) boolean
   @Override
   protected boolean method_1725(int mouseX, int mouseY, float left, float top, float right, float bottom) {
      for (Dev.ZWare.Client.features.gui.Class1 var8 : OyVeyGui.getClickGui().getComponents()) {
         if (var8.field_1064) {
            return false;
         }
      }

      return left <= mouseX && top <= mouseY && right > mouseX && bottom > mouseY;
   }

   // $VF: renamed from: a (float[]) void
   private void method_1844(float[] var1) {
      this.method_1845(var1, this.field_1178.method_671().getAlpha());
   }

   // $VF: renamed from: a (float[], int) void
   private void method_1845(float[] var1, int var2) {
      Color var3 = new Color(Color.HSBtoRGB(var1[0], var1[1], var1[2]));
      this.field_1178.method_672(new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), var2));
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      return Math.max(Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.a()) + 18, this.field_1179 ? this.method_1846() + 6 : 0);
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1179;
   }

   // $VF: renamed from: j () int
   private int method_1846() {
      return Math.max(124, Class11.method_1738());
   }

   // $VF: renamed from: a () java.awt.Color
   private Color method_1847() {
      if (Dev.ZWare.Client.Class1.field_296 != null) {
         return Dev.ZWare.Client.Class1.field_296.method_492();
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
         return var1 != null && var1.field_1340 != null ? var1.field_1340.method_671() : null;
      }
   }
}
