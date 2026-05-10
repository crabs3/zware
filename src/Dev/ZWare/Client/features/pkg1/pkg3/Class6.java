package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class Class6 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1972 = this.a("PauseOnEat", true);

   public Class6() {
      super("Enderchest Farmer", "i made this because i broke my fastplace", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2593(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null && Dev.ZWare.Client.Class1.field_316 != null) {
         if (!this.field_1972.method_671() || !c.field_1724.method_6115()) {
            Class8 var2 = Class8.method_32();
            if (var2 != null && !var2.method_31()) {
               BlockPos var3 = var2.method_24();
               if (var3 != null && var2.method_26()) {
                  double var4 = this.method_2594();
                  if (!(Dev.ZWare.Client.pkg1.Class7.method_121(c.field_1724.method_33571(), new Box(var3)) > var4 * var4)) {
                     if (Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Items.field_8466), 0, 35) != -1) {
                        if (Dev.ZWare.Client.Class1.field_301.method_914(var3, c.field_1687.method_8320(var3), Items.field_8466)) {
                           try {
                              Dev.ZWare.Client.Class1.field_301.method_918(Items.field_8466, var3);
                           } finally {
                              Dev.ZWare.Client.Class1.field_301.method_929();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a () double
   private double method_2594() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }
}
