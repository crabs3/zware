package Dev.ZWare.Client.pkg4;

import java.awt.Color;

public class Class13 {
   // $VF: renamed from: a java.awt.Color
   private Color field_262 = new Color(0, 0, 255, 180);

   // $VF: renamed from: a () void
   public void method_491() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      this.method_493(var1.field_1340.method_671());
   }

   // $VF: renamed from: a () java.awt.Color
   public Color method_492() {
      return this.field_262;
   }

   // $VF: renamed from: a (java.awt.Color) void
   public void method_493(Color color) {
      this.field_262 = color;
   }

   // $VF: renamed from: a () int
   public int method_494() {
      return Dev.ZWare.Client.pkg1.Class8.method_669(this.field_262);
   }

   // $VF: renamed from: b () int
   public int method_495() {
      return Dev.ZWare.Client.pkg1.Class8.method_669(new Color(this.field_262.getRed(), this.field_262.getGreen(), this.field_262.getBlue(), 255));
   }

   // $VF: renamed from: a (int) int
   public int method_496(int alpha) {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995().field_1365.method_671()
         ? Dev.ZWare.Client.pkg1.Class8.method_666(
               Dev.ZWare.Client.features.gui.Class1.field_1061[0] * Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995().field_1366.method_671()
            )
            .getRGB()
         : new Color(this.field_262.getRed(), this.field_262.getGreen(), this.field_262.getBlue(), alpha).getRGB();
   }

   // $VF: renamed from: b () java.awt.Color
   public Color method_497() {
      return this.method_501(this.field_262.getAlpha());
   }

   // $VF: renamed from: c () int
   public int method_498() {
      return Dev.ZWare.Client.pkg1.Class8.method_669(this.method_497());
   }

   // $VF: renamed from: d () int
   public int method_499() {
      return Dev.ZWare.Client.pkg1.Class8.method_669(this.method_501(255));
   }

   // $VF: renamed from: b (int) int
   public int method_500(int alpha) {
      return this.method_501(alpha).getRGB();
   }

   // $VF: renamed from: a (int) java.awt.Color
   private Color method_501(int var1) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class2 var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class2.method_2695();
      if (var2 != null && var2.method_2705()) {
         double var3 = Math.ceil((System.currentTimeMillis() + var2.method_2706()) / 20.0);
         Color var5 = Color.getHSBColor((float)(var3 % 360.0 / 360.0), var2.method_2708() / 255.0F, var2.method_2707() / 255.0F);
         return new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), var1);
      } else {
         return new Color(this.field_262.getRed(), this.field_262.getGreen(), this.field_262.getBlue(), var1);
      }
   }
}
