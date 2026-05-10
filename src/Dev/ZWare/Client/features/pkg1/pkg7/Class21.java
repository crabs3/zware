package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.Locale;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class21 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3004 = this.a("Shadow", true);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3005 = this.a("CoordColor", new Color(255, 255, 255, 255));
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3006 = this.a("OppositeColor", new Color(120, 120, 120, 255));

   public Class21() {
      super("NewCoords", "Shows your coordinates with opposite dimension.", 140.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      Vec3d var2 = g() ? new Vec3d(-32.0, 4.0, -21.0) : c.field_1724.method_19538();
      double var3 = var2.field_1352;
      double var5 = var2.field_1351;
      double var7 = var2.field_1350;
      String var9 = String.format(Locale.US, "%.0f, %.0f, %.0f ", var3, var5, var7);
      double var10 = c.field_1687 != null && c.field_1687.method_27983() == World.field_25180 ? 8.0 : 0.125;
      String var12 = String.format(Locale.US, "[%.0f, %.0f]", var3 * var10, var7 * var10);
      float var13 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var9) + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var12);
      float var14 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
      this.c(var13, var14);
      super.method_3643(event);
      float var15 = this.a(var13);
      float var16 = this.f();
      this.method_3725(event, var9, var15, var16, this.field_3005.method_671());
      this.method_3725(event, var12, var15 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var9), var16, this.field_3006.method_671());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.lang.String, float, float, java.awt.Color) void
   private void method_3725(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, String var2, float var3, float var4, Color var5) {
      if (this.field_3004.method_671()) {
         this.b(var1.method_1053(), var2, var3, var4, var5.getRGB());
      } else {
         this.a(var1.method_1053(), var2, var3, var4, var5.getRGB());
      }
   }
}
