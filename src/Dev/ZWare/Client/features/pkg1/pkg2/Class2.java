package Dev.ZWare.Client.features.pkg1.pkg2;

import Dev.ZWare.Client.features.pkg3.Class8;
import Dev.ZWare.Client.pkg2.pkg1.Class7;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.util.math.BlockPos;

public class Class2 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg2.Class2
   private static Class2 field_1651;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1652 = this.a("Include Dimension", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1653 = this.a("Include Facing", false);
   // $VF: renamed from: r java.lang.String
   private String field_1654;
   // $VF: renamed from: s boolean
   private boolean field_1655;

   public Class2() {
      super("Logger", "copies your coords to clipboard when you logout", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false);
      field_1651 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg2.Class2
   public static Class2 method_2250() {
      return field_1651;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1655 = false;
      this.method_2253();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1655 = false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2251(Class7.Inner2 var1) {
      this.field_1655 = false;
      this.method_2253();
   }

   // $VF: renamed from: n () void
   public void method_2252() {
      if (!this.e() && !this.field_1655 && this.field_1654 != null && !this.field_1654.isBlank() && c.field_1774 != null) {
         c.field_1774.method_1455(this.field_1654);
         this.field_1655 = true;
      }
   }

   // $VF: renamed from: o () void
   private void method_2253() {
      if (!g()) {
         BlockPos var1 = c.field_1724.method_24515();
         StringBuilder var2 = new StringBuilder().append(var1.method_10263()).append(", ").append(var1.method_10264()).append(", ").append(var1.method_10260());
         if (this.field_1652.method_671()) {
            var2.append(" [").append(c.field_1687.method_27983().method_29177()).append("]");
         }

         if (this.field_1653.method_671()) {
            var2.append(" ").append(c.field_1724.method_5735().method_15434());
         }

         this.field_1654 = var2.toString();
      }
   }
}
