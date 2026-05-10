package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import net.minecraft.util.Formatting;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class Class3 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F java.text.DecimalFormat
   private static final DecimalFormat field_2966 = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
   // $VF: renamed from: G java.lang.String[]
   private static final String[] field_2967 = new String[]{"Potions", "TPS", "Ping", "FPS", "Speed", "EyeRange"};
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2968 = this.a("TraceRange", 128.0, 1.0, 512.0);

   public Class3() {
      super("EyeRange", "Displays eye distance to the block you are looking at.", 90.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      String var2 = Dev.ZWare.Client.pkg1.Class6.method_200("eye_range") + " " + Formatting.field_1068 + this.method_3697(e.method_1054());
      int var3 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      float var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
      this.a(var4, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134(), field_2967);
      super.method_3643(e);
      this.a(e.method_1053(), "eye-range", var2, this.a(var4), this.f(), var3);
   }

   // $VF: renamed from: a (float) java.lang.String
   private String method_3697(float var1) {
      if (g()) {
         return "--";
      } else {
         Vec3d var2 = c.field_1724.method_33571();
         Vec3d var3 = var2.method_1019(c.field_1724.method_5828(var1).method_1021(this.field_2968.method_671()));
         BlockHitResult var4 = c.field_1687.method_17742(new RaycastContext(var2, var3, ShapeType.field_17559, FluidHandling.field_1348, c.field_1724));
         return var4.method_17783() != Type.field_1332 ? "--" : field_2966.format(var2.method_1022(var4.method_17784()));
      }
   }
}
