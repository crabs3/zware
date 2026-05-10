package Dev.ZWare.Client.features.pkg1.pkg5;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;

public class Class15 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<Color> field_2925 = this.a("Color", 255, 0, 0, 255);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<Float> field_2926 = this.a("Line Width", 1.0F, 0.1F, 5.0F);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2927 = this.a("Slide", false);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<Double> field_2928 = this.a("Slide Time", 0.2, 0.01, 1.0);
   // $VF: renamed from: s net.minecraft.util.math.Box
   private Box field_2929;
   // $VF: renamed from: t net.minecraft.util.math.Box
   private Box field_2930;
   // $VF: renamed from: u long
   private long field_2931;

   public Class15() {
      super("Highlight", "makes like a outline on the block you look at", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      this.field_2928.method_709(var1 -> this.field_2927.method_671());
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3633();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      long var2 = System.currentTimeMillis();
      Box var4 = this.method_3630();
      if (var4 == null) {
         this.method_3633();
      } else {
         this.method_3631(var4, var2);
         Box var5 = this.method_3632(var2);
         if (var5 != null) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(event.method_1055(), var5, this.field_2925.method_671(), this.field_2926.method_671().floatValue());
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.util.math.Box
   private Box method_3630() {
      if (c.field_1765 instanceof BlockHitResult var1 && c.field_1687 != null) {
         VoxelShape var3 = c.field_1687.method_8320(var1.method_17777()).method_26218(c.field_1687, var1.method_17777());
         return var3.method_1110() ? null : var3.method_1107().method_996(var1.method_17777());
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, long) void
   private void method_3631(Box var1, long var2) {
      if (var1 == null) {
         this.method_3633();
      } else if (!this.field_2927.method_671() || this.field_2930 == null) {
         this.field_2929 = var1;
         this.field_2930 = var1;
         this.field_2931 = 0L;
      } else if (!var1.equals(this.field_2930)) {
         Box var4 = this.method_3632(var2);
         if (var4 != null && !var4.equals(var1)) {
            this.field_2929 = var4;
            this.field_2930 = var1;
            this.field_2931 = var2;
         } else {
            this.field_2929 = var1;
            this.field_2930 = var1;
            this.field_2931 = 0L;
         }
      }
   }

   // $VF: renamed from: a (long) net.minecraft.util.math.Box
   private Box method_3632(long var1) {
      if (this.field_2930 == null) {
         return null;
      } else if (this.field_2927.method_671() && this.field_2929 != null && this.field_2931 > 0L) {
         double var3 = Math.max(0.01, this.field_2928.method_671()) * 1000.0;
         double var5 = MathHelper.method_15350((var1 - this.field_2931) / var3, 0.0, 1.0);
         if (var5 >= 1.0) {
            this.field_2929 = this.field_2930;
            this.field_2931 = 0L;
            return this.field_2930;
         } else {
            return method_3634(this.field_2929, this.field_2930, var5);
         }
      } else {
         return this.field_2930;
      }
   }

   // $VF: renamed from: n () void
   private void method_3633() {
      this.field_2929 = null;
      this.field_2930 = null;
      this.field_2931 = 0L;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, net.minecraft.util.math.Box, double) net.minecraft.util.math.Box
   private static Box method_3634(Box var0, Box var1, double var2) {
      double var4 = MathHelper.method_15350(var2, 0.0, 1.0);
      return new Box(
         MathHelper.method_16436(var4, var0.field_1323, var1.field_1323),
         MathHelper.method_16436(var4, var0.field_1322, var1.field_1322),
         MathHelper.method_16436(var4, var0.field_1321, var1.field_1321),
         MathHelper.method_16436(var4, var0.field_1320, var1.field_1320),
         MathHelper.method_16436(var4, var0.field_1325, var1.field_1325),
         MathHelper.method_16436(var4, var0.field_1324, var1.field_1324)
      );
   }
}
