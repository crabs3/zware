package Dev.ZWare.Client.features.pkg1.pkg6;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;

public class Class12 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg6.Class12
   private static Class12 field_1842;
   // $VF: renamed from: p double
   private static final double field_1843 = 90.0;
   // $VF: renamed from: q float
   private static final float field_1844 = 45.0F;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class12.Inner1> field_1845 = this.a("Mode", Class12.Inner1.Normal);

   public Class12() {
      super("Sprint", "why does this need a description :sob::v:", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, true, false, false);
      field_1842 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class12
   public static Class12 method_2435() {
      return field_1842;
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      if (!g()) {
         if (this.method_2437()) {
            c.field_1724.method_5728(true);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_2436(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g()) {
         if (this.field_1845.method_671() == Class12.Inner1.Pitch45 && !this.method_2438()) {
            Dev.ZWare.Client.Class1.field_298
               .method_325(c.field_1724.method_36454(), 45.0F, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("Sprint", 90.0));
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_2437() {
      if (c.field_1724 == null || c.field_1724.method_5715()) {
         return false;
      } else if (c.field_1724.method_5799() || c.field_1724.method_5869()) {
         return false;
      } else if (c.field_1724.method_6115()) {
         return false;
      } else if (c.field_1724.method_6128()) {
         return false;
      } else {
         return c.field_1724.field_6250 <= 0.0F && c.field_1724.field_6212 == 0.0F && !Class4.method_3548()
            ? false
            : c.field_1724.method_7344().method_7586() > 6 || c.field_1724.method_31549().field_7478;
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_2438() {
      return c.field_1724.method_6128() || c.field_1724.method_31549().field_7479;
   }

   // $VF: renamed from: c () boolean
   public boolean method_2439() {
      return this.d() && this.field_1845.method_671() == Class12.Inner1.Pitch45 && !g() && !this.method_2438();
   }

   // $VF: renamed from: a () float
   public float method_2440() {
      return 45.0F;
   }

   private static enum Inner1 {
      Normal,
      Pitch45;
   }
}
