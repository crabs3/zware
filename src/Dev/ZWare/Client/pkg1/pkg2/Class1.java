package Dev.ZWare.Client.pkg1.pkg2;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public final class Class1 {
   private Class1() {
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int) int
   public static int method_123(DrawContext context, String text, float x, float y, int color) {
      return method_131(context, text, x, y, color, false);
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int) int
   public static int method_124(DrawContext context, String text, float x, float y, int color) {
      return method_131(context, text, x, y, color, true);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, float) int
   public static int method_125(DrawContext context, String text, float x, float y, int color, float scale) {
      return method_138(context, text, x, y, color, false, scale);
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, float) int
   public static int method_126(DrawContext context, String text, float x, float y, int color, float scale) {
      return method_138(context, text, x, y, color, true, scale);
   }

   // $VF: renamed from: c (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int) int
   public static int method_127(DrawContext context, String text, float x, float y, int color) {
      return method_136(context, text, x, y, color, false);
   }

   // $VF: renamed from: d (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int) int
   public static int method_128(DrawContext context, String text, float x, float y, int color) {
      return method_136(context, text, x, y, color, true);
   }

   // $VF: renamed from: c (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, float) int
   public static int method_129(DrawContext context, String text, float x, float y, int color, float scale) {
      return method_137(context, text, x, y, color, false, scale);
   }

   // $VF: renamed from: d (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, float) int
   public static int method_130(DrawContext context, String text, float x, float y, int color, float scale) {
      return method_137(context, text, x, y, color, true, scale);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, boolean) int
   public static int method_131(DrawContext context, String text, float x, float y, int color, boolean shadow) {
      if (context == null || text == null) {
         return 0;
      } else if (Dev.ZWare.Client.Class1.field_297 == null) {
         int var6 = Math.round(x);
         int var7 = Math.round(y);
         return shadow
            ? context.method_25303(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772, text, var6, var7, color)
            : context.method_51433(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772, text, var6, var7, color, false);
      } else {
         return Dev.ZWare.Client.Class1.field_297.method_817(context, text, x, y, color, shadow);
      }
   }

   // $VF: renamed from: a (java.lang.String) int
   public static int method_132(String text) {
      if (text != null && !text.isEmpty()) {
         return Dev.ZWare.Client.Class1.field_297 != null
            ? Dev.ZWare.Client.Class1.field_297.method_824(text)
            : Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772.method_1727(text);
      } else {
         return 0;
      }
   }

   // $VF: renamed from: a (java.lang.String, float) int
   public static int method_133(String text, float scale) {
      if (text != null && !text.isEmpty()) {
         return Dev.ZWare.Client.Class1.field_297 != null
            ? Dev.ZWare.Client.Class1.field_297.method_826(text, scale)
            : Math.round(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772.method_1727(text) * scale);
      } else {
         return 0;
      }
   }

   // $VF: renamed from: a () int
   public static int method_134() {
      return Dev.ZWare.Client.Class1.field_297 != null ? Dev.ZWare.Client.Class1.field_297.method_833() : 9;
   }

   // $VF: renamed from: a (float) int
   public static int method_135(float scale) {
      return Dev.ZWare.Client.Class1.field_297 != null ? Dev.ZWare.Client.Class1.field_297.method_834(scale) : Math.round(9.0F * scale);
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, boolean) int
   private static int method_136(DrawContext var0, String var1, float var2, float var3, int var4, boolean var5) {
      return method_137(var0, var1, var2, var3, var4, var5, 1.0F);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, boolean, float) int
   private static int method_137(DrawContext var0, String var1, float var2, float var3, int var4, boolean var5, float var6) {
      if (var0 != null && var1 != null) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class2 var7 = Dev.ZWare.Client.features.pkg1.pkg4.Class2.method_2695();
         if (var7 != null && var7.method_2704()) {
            int var8 = var7.method_2709();
            float var9 = var7.method_2710();
            int var10 = method_139(var4, var9);

            for (int var11 = -var8; var11 <= var8; var11++) {
               for (int var12 = -var8; var12 <= var8; var12++) {
                  if ((var11 != 0 || var12 != 0) && var11 * var11 + var12 * var12 <= var8 * var8) {
                     method_138(var0, var1, var2 + var11 * 0.5F * var6, var3 + var12 * 0.5F * var6, var10, false, var6);
                  }
               }
            }
         }

         return method_138(var0, var1, var2, var3, var4, var5, var6);
      } else {
         return 0;
      }
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, boolean, float) int
   private static int method_138(DrawContext var0, String var1, float var2, float var3, int var4, boolean var5, float var6) {
      if (var0 == null || var1 == null) {
         return 0;
      } else if (Dev.ZWare.Client.Class1.field_297 == null) {
         if (Math.abs(var6 - 1.0F) <= 0.001F) {
            int var9 = Math.round(var2);
            int var10 = Math.round(var3);
            return var5
               ? var0.method_25303(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772, var1, var9, var10, var4)
               : var0.method_51433(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772, var1, var9, var10, var4, false);
         } else {
            MatrixStack var7 = var0.method_51448();
            var7.method_22903();
            var7.method_46416(var2, var3, 0.0F);
            var7.method_22905(var6, var6, 1.0F);
            int var8 = var5
               ? var0.method_25303(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772, var1, 0, 0, var4)
               : var0.method_51433(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1772, var1, 0, 0, var4, false);
            var7.method_22909();
            return Math.round(var2 + var8 * var6);
         }
      } else {
         return Dev.ZWare.Client.Class1.field_297.method_819(var0, var1, var2, var3, var4, var5, var6);
      }
   }

   // $VF: renamed from: a (int, float) int
   private static int method_139(int var0, float var1) {
      int var2 = var0 >>> 24 & 0xFF;
      int var3 = Math.clamp((long)Math.round(var2 * var1), 0, 255);
      return var0 & 16777215 | var3 << 24;
   }
}
