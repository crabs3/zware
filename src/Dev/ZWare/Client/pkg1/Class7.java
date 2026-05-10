package Dev.ZWare.Client.pkg1;

import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public final class Class7 {
   private Class7() {
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Box) double
   public static double method_121(Vec3d point, Box box) {
      if (point != null && box != null) {
         double var2 = method_122(point.field_1352, box.field_1323, box.field_1320);
         double var4 = method_122(point.field_1351, box.field_1322, box.field_1325);
         double var6 = method_122(point.field_1350, box.field_1321, box.field_1324);
         return var2 * var2 + var4 * var4 + var6 * var6;
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }

   // $VF: renamed from: a (double, double, double) double
   private static double method_122(double var0, double var2, double var4) {
      if (var0 < var2) {
         return var2 - var0;
      } else {
         return var0 > var4 ? var0 - var4 : 0.0;
      }
   }
}
