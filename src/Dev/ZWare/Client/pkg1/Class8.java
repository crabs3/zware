package Dev.ZWare.Client.pkg1;

import java.awt.Color;

public class Class8 {
   // $VF: renamed from: a (int, int, int, int) int
   public static int method_662(int r, int g, int b, int a) {
      return new Color(r, g, b, a).getRGB();
   }

   // $VF: renamed from: a (int, int, int) int
   public static int method_663(int r, int g, int b) {
      return method_664(r, g, b, 255);
   }

   // $VF: renamed from: b (int, int, int, int) int
   public static int method_664(int r, int g, int b, int a) {
      return (r << 16) + (g << 8) + b + (a << 24);
   }

   // $VF: renamed from: a (float, float, float, float) int
   public static int method_665(float r, float g, float b, float a) {
      return method_664((int)(r * 255.0F), (int)(g * 255.0F), (int)(b * 255.0F), (int)(a * 255.0F));
   }

   // $VF: renamed from: a (int) java.awt.Color
   public static Color method_666(int delay) {
      double var1 = Math.ceil((System.currentTimeMillis() + delay) / 20.0);
      double var3;
      return Color.getHSBColor(
         (float)((var3 = var1 % 360.0) / 360.0),
         Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995().field_1368.method_671() / 255.0F,
         Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995().field_1367.method_671() / 255.0F
      );
   }

   // $VF: renamed from: a (float[]) int
   public static int method_667(float[] colors) {
      if (colors.length != 4) {
         throw new IllegalArgumentException("colors[] must have a length of 4!");
      } else {
         return method_665(colors[0], colors[1], colors[2], colors[3]);
      }
   }

   // $VF: renamed from: a (double[]) int
   public static int method_668(double[] colors) {
      if (colors.length != 4) {
         throw new IllegalArgumentException("colors[] must have a length of 4!");
      } else {
         return method_665((float)colors[0], (float)colors[1], (float)colors[2], (float)colors[3]);
      }
   }

   // $VF: renamed from: a (java.awt.Color) int
   public static int method_669(Color color) {
      return method_664(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
   }
}
