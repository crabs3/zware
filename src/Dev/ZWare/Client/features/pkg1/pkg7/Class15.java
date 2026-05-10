package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Class15 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3010 = this.a("TextShadow", true);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3011 = this.a("ModuleColor", new Color(255, 255, 255, 255));
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3012 = this.a("OnColor", new Color(25, 225, 25, 255));
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3013 = this.a("OffColor", new Color(225, 25, 25, 255));
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3014 = this.a("BindColor", new Color(150, 150, 150, 255));
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3015 = this.a("InfoColor", new Color(200, 200, 200, 255));
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3016 = this.a("ShowBind", true);
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class15.Inner1> field_3017 = this.a("Alignment", Class15.Inner1.Auto);
   // $VF: renamed from: N java.util.List
   private List<Dev.ZWare.Client.features.pkg1.Class1> field_3018 = List.of();

   public Class15() {
      super("ModuleInfos", "Displays if selected modules are enabled or disabled.", 110.0F, 60.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      this.field_3018 = this.method_3728();
      if (this.field_3018.isEmpty()) {
         float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(Dev.ZWare.Client.pkg1.Class6.method_200("module_info"));
         float var10 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
         this.d(var9, var10);
         super.method_3643(event);
         this.method_3735(event, Dev.ZWare.Client.pkg1.Class6.method_200("module_info"), this.a(var9), this.f(), this.field_3011.method_671());
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;

         for (int var4 = 0; var4 < this.field_3018.size(); var4++) {
            var2 = Math.max(var2, this.method_3730(this.field_3018.get(var4)));
            var3 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
            if (var4 > 0) {
               var3 += 2.0F;
            }
         }

         this.d(var2, var3);
         super.method_3643(event);
         float var11 = this.f();

         for (Dev.ZWare.Client.features.pkg1.Class1 var6 : this.field_3018) {
            float var7 = this.method_3730(var6);
            float var8 = this.method_3734(var7);
            this.method_3731(event, var6, var8, var11);
            var11 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_134() + 2.0F;
         }
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<Dev.ZWare.Client.features.pkg1.Class1> method_3728() {
      if (Dev.ZWare.Client.Class1.field_316 == null) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList();
         this.method_3729(var1, Dev.ZWare.Client.features.pkg1.pkg3.Class18.class);
         this.method_3729(var1, Dev.ZWare.Client.features.pkg1.pkg3.Class15.class);
         this.method_3729(var1, Dev.ZWare.Client.features.pkg1.pkg3.Class21.class);
         this.method_3729(var1, Dev.ZWare.Client.features.pkg1.pkg3.Class7.class);
         this.method_3729(var1, Dev.ZWare.Client.features.pkg1.pkg3.Class5.class);
         this.method_3729(var1, Dev.ZWare.Client.features.pkg1.pkg6.Class6.class);
         return var1;
      }
   }

   // $VF: renamed from: a (java.util.List, java.lang.Class) void
   private void method_3729(List<Dev.ZWare.Client.features.pkg1.Class1> var1, Class<? extends Dev.ZWare.Client.features.pkg1.Class1> var2) {
      Dev.ZWare.Client.features.pkg1.Class1 var3 = Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(var2) : null;
      if (var3 != null) {
         var1.add(var3);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.Class1) float
   private float method_3730(Dev.ZWare.Client.features.pkg1.Class1 var1) {
      String var2 = var1.method_1907();
      String var3 = this.method_3732(var1);
      String var4 = this.method_3733(var1);
      if (this.field_3016.method_671()) {
         return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2)
            + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3)
            + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4);
      } else {
         String var5 = var1.method_1899() ? Dev.ZWare.Client.pkg1.Class6.method_200("on") : Dev.ZWare.Client.pkg1.Class6.method_200("off");
         return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2)
            + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(" ")
            + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, Dev.ZWare.Client.features.pkg1.Class1, float, float) void
   private void method_3731(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, Dev.ZWare.Client.features.pkg1.Class1 var2, float var3, float var4) {
      String var5 = var2.method_1907();
      if (this.field_3016.method_671()) {
         Color var7 = var2.method_1899() ? this.field_3012.method_671() : this.field_3011.method_671();
         float var11 = this.method_3735(var1, var5, var3, var4, var7);
         String var8 = this.method_3732(var2);
         if (!var8.isEmpty()) {
            var11 = this.method_3735(var1, var8, var11, var4, this.field_3015.method_671());
         }

         String var9 = this.method_3733(var2);
         if (!var9.isEmpty()) {
            this.method_3735(var1, var9, var11, var4, this.field_3014.method_671());
         }
      } else {
         float var6 = this.method_3735(var1, var5, var3, var4, this.field_3011.method_671());
         var6 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(" ");
         this.method_3735(
            var1,
            var2.method_1899() ? Dev.ZWare.Client.pkg1.Class6.method_200("on") : Dev.ZWare.Client.pkg1.Class6.method_200("off"),
            var6,
            var4,
            var2.method_1899() ? this.field_3012.method_671() : this.field_3013.method_671()
         );
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.Class1) java.lang.String
   private String method_3732(Dev.ZWare.Client.features.pkg1.Class1 var1) {
      if (!var1.method_1899()) {
         return "";
      } else {
         String var2 = var1.method_1898();
         return var2 != null && !var2.isBlank() ? " (" + var2 + ")" : "";
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.Class1) java.lang.String
   private String method_3733(Dev.ZWare.Client.features.pkg1.Class1 var1) {
      Dev.ZWare.Client.features.pkg3.Class4 var2 = var1.method_1912();
      return var2 != null && !var2.method_432() ? " [" + var2 + "]" : "";
   }

   // $VF: renamed from: d (float) float
   private float method_3734(float var1) {
      boolean var2 = switch ((Class15.Inner1)this.field_3017.method_671()) {
         case Auto -> this.b();
         case Left -> false;
         case Right -> true;
      };
      return var2 ? this.e() + this.c() - var1 : this.e();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.lang.String, float, float, java.awt.Color) float
   private float method_3735(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, String var2, float var3, float var4, Color var5) {
      if (this.field_3010.method_671()) {
         this.b(var1.method_1053(), var2, var3, var4, var5.getRGB());
      } else {
         this.a(var1.method_1053(), var2, var3, var4, var5.getRGB());
      }

      return var3 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
   }

   private static enum Inner1 {
      Auto,
      Left,
      Right;
   }
}
