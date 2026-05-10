package Dev.ZWare.Client.features.pkg1.pkg5;

import java.awt.Color;
import java.util.Locale;

public class Class6 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o java.lang.String
   private static final String field_1997 = "❤";
   // $VF: renamed from: p java.awt.Color
   private static final Color field_1998 = new Color(255, 170, 0);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1999 = this.a("Scale", 1.0F, 0.5F, 3.0F);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2000 = this.a("YOffset", 16, -80, 160);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2001 = this.a("Shadow", true);

   public Class6() {
      super("Hearts", "Shows your health hearts under the crosshair.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (!g() && event.method_1053() != null && !c.field_1724.method_29504()) {
         if (c.field_1755 == null && !c.field_1690.field_1842) {
            float var2 = Math.max(0.0F, c.field_1724.method_6032()) / 2.0F;
            float var3 = Math.max(0.0F, c.field_1724.method_6067()) / 2.0F;
            boolean var4 = var3 > 0.0F;
            String var5 = this.method_2621(var2);
            String var6 = var4 ? this.method_2621(var3) : "";
            float var7 = this.field_1999.method_671();
            int var8 = Math.max(1, Math.round(var7));
            int var9 = Math.max(4, Math.round(6.0F * var7));
            int var10 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var5, var7);
            int var11 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133("❤", var7);
            int var12 = var10 + var8 + var11;
            if (var4) {
               var12 += var9 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var6, var7) + var8 + var11;
            }

            float var13 = c.method_22683().method_4486() / 2.0F - var12 / 2.0F;
            float var14 = c.method_22683().method_4502() / 2.0F + this.field_2000.method_671().intValue();
            int var15 = this.method_2620();
            var13 = this.method_2619(event, var5, var13, var14, var15, var7);
            var13 = this.method_2619(event, "❤", var13 + var8, var14, var15, var7);
            if (var4) {
               int var16 = field_1998.getRGB();
               var13 += var9;
               var13 = this.method_2619(event, var6, var13, var14, var16, var7);
               this.method_2619(event, "❤", var13 + var8, var14, var16, var7);
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.lang.String, float, float, int, float) float
   private float method_2619(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, String var2, float var3, float var4, int var5, float var6) {
      return this.field_2001.method_671()
         ? Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(var1.method_1053(), var2, var3, var4, var5, var6)
         : Dev.ZWare.Client.pkg1.pkg2.Class1.method_125(var1.method_1053(), var2, var3, var4, var5, var6);
   }

   // $VF: renamed from: a () int
   private int method_2620() {
      float var1 = c.field_1724.method_6063();
      float var2 = Math.max(0.0F, c.field_1724.method_6032());
      float var3 = var1 <= 0.0F ? 0.0F : Math.max(0.0F, Math.min(var2 / var1, 1.0F));
      return Color.HSBtoRGB(var3 * 0.33F, 0.85F, 1.0F);
   }

   // $VF: renamed from: a (float) java.lang.String
   private String method_2621(float var1) {
      float var2 = Math.round(var1 * 10.0F) / 10.0F;
      return Math.abs(var2 - Math.round(var2)) < 0.05F ? Integer.toString(Math.round(var2)) : String.format(Locale.ROOT, "%.1f", var2);
   }
}
