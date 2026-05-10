package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.Locale;

public class Class1 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F java.lang.String[]
   private static final String[] field_3079 = new String[]{"Potions", "TPS", "Ping", "NewPing", "FPS", "Speed", "NewSpeed"};
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3080 = this.a("Shadow", true);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3081 = this.a("LabelColor", new Color(175, 175, 175, 255));
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3082 = this.a("ValueColor", new Color(255, 255, 255, 255));

   public Class1() {
      super("NewSpeed", "Shows your speed in km/h.", 90.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      double var2 = 0.0;
      if (!g()) {
         double var4 = c.field_1724.method_23317() - c.field_1724.field_6014;
         double var6 = c.field_1724.method_23321() - c.field_1724.field_5969;
         var2 = Math.sqrt(var4 * var4 + var6 * var6) * 20.0 * 3.6;
      }

      String var10 = Dev.ZWare.Client.pkg1.Class6.method_200("speed") + " ";
      String var5 = String.format(Locale.US, "%.1fkm/h", var2);
      float var11 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var10) + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5);
      float var7 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
      this.a(var11, var7, field_3079);
      super.method_3643(event);
      float var8 = this.a(var11);
      float var9 = this.f();
      this.method_3786(event, var10, var8, var9, this.field_3081.method_671());
      this.method_3786(event, var5, var8 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var10), var9, this.field_3082.method_671());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.lang.String, float, float, java.awt.Color) void
   private void method_3786(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, String var2, float var3, float var4, Color var5) {
      if (this.field_3080.method_671()) {
         this.b(var1.method_1053(), var2, var3, var4, var5.getRGB());
      } else {
         this.a(var1.method_1053(), var2, var3, var4, var5.getRGB());
      }
   }
}
