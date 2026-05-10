package Dev.ZWare.Client.features.pkg1.pkg6;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class7 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o float
   private static final float field_1822 = 0.35F;
   // $VF: renamed from: p double
   private static final double field_1823 = 25.0;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg1.pkg6.Class7
   private static Class7 field_1824;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner2> field_1825 = this.a("Mode", Class7.Inner2.Snap);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_1826 = this.a("Idle Mode", Class7.Inner1.Controller);
   // $VF: renamed from: t int
   private int field_1827;
   // $VF: renamed from: u boolean
   private boolean field_1828;
   // $VF: renamed from: v float
   private float field_1829;
   // $VF: renamed from: w float
   private float field_1830;
   // $VF: renamed from: x boolean
   private boolean field_1831;
   // $VF: renamed from: y float
   private float field_1832;
   // $VF: renamed from: z float
   private float field_1833;
   // $VF: renamed from: A float
   private float field_1834;
   // $VF: renamed from: B boolean
   private boolean field_1835;
   // $VF: renamed from: C float
   private float field_1836;
   // $VF: renamed from: D float
   private float field_1837;

   public Class7() {
      super(
         "Elytra Control",
         "Steers your glide from movement keys and toggles Elytra alongside the controller.",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT,
         true,
         false,
         false
      );
      field_1824 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class7
   public static Class7 method_2418() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Class7 var0 = Dev.ZWare.Client.Class1.field_316.method_510(Class7.class);
         if (var0 != null) {
            field_1824 = var0;
         }
      }

      return field_1824;
   }

   // $VF: renamed from: a () net.minecraft.util.math.Vec3d
   public static Vec3d method_2419() {
      Class7 var0 = method_2418();
      if (var0 == null || var0.e() || !var0.field_1835 || c.field_1724 == null || !c.field_1724.method_6128()) {
         return null;
      } else {
         return !c.field_1724.method_5799() && !c.field_1724.method_5869() ? method_2429(var0.field_1836, var0.field_1837) : null;
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2423();
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Class6 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Class6.class);
         if (var1 != null && var1.e()) {
            var1.j();
         }
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2423();
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Class6 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Class6.class);
         if (var1 != null && var1.d()) {
            var1.k();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_2420(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.field_1690 != null && c.field_1724.method_6128() && !c.field_1724.method_5799() && !c.field_1724.method_5869()) {
         boolean var2 = c.field_1690.field_1903.method_1434();
         boolean var3 = c.field_1690.field_1832.method_1434();
         boolean var4 = c.field_1690.field_1894.method_1434();
         boolean var5 = c.field_1690.field_1913.method_1434();
         boolean var6 = c.field_1690.field_1881.method_1434();
         boolean var7 = c.field_1690.field_1849.method_1434();
         boolean var8 = var2 || var3 || var4 || var5 || var6 || var7;
         float var9 = c.field_1724.method_36454();
         float var10 = 0.0F;
         float var11 = 0.0F;
         if (var4) {
            var11++;
         }

         if (var6) {
            var11--;
         }

         if (var5) {
            var10--;
         }

         if (var7) {
            var10++;
         }

         boolean var12 = var10 != 0.0F || var11 != 0.0F;
         if (!var8) {
            if (this.field_1826.method_671() == Class7.Inner1.StopMotion) {
               this.method_2424();
               this.field_1827 = 0;
               this.field_1828 = false;
               this.field_1835 = false;
               this.method_2428();
            } else {
               boolean var16 = this.field_1827++ % 2 == 1;
               float var17 = var16 ? MathHelper.method_15393(var9 + 180.0F) : var9;
               this.field_1828 = false;
               this.method_2422(var17, -1.0F);
            }
         } else {
            this.method_2425();
            this.field_1827 = 0;
            float var13;
            if (var2) {
               var13 = var12 ? -45.0F : -90.0F;
            } else if (var3) {
               var13 = var12 ? 45.0F : 90.0F;
            } else {
               var13 = -1.0F;
            }

            float var14 = var9;
            if (var12) {
               float var15 = (float)Math.toDegrees(Math.atan2(var10, var11));
               var14 = MathHelper.method_15393(var9 + var15);
            }

            if (this.field_1825.method_671() == Class7.Inner2.Smooth) {
               if (!this.field_1828) {
                  this.field_1829 = Dev.ZWare.Client.Class1.field_298 != null ? Dev.ZWare.Client.Class1.field_298.method_355() : c.field_1724.method_36454();
                  this.field_1830 = Dev.ZWare.Client.Class1.field_298 != null ? Dev.ZWare.Client.Class1.field_298.method_356() : c.field_1724.method_36455();
                  this.field_1828 = true;
               }

               this.field_1829 = MathHelper.method_15393(this.field_1829 + MathHelper.method_15393(var14 - this.field_1829) * 0.35F);
               this.field_1830 = MathHelper.method_15363(this.field_1830 + (var13 - this.field_1830) * 0.35F, -90.0F, 90.0F);
               var14 = this.field_1829;
               var13 = this.field_1830;
            } else {
               this.field_1828 = false;
               this.field_1829 = var14;
               this.field_1830 = var13;
            }

            this.method_2422(var14, var13);
         }
      } else {
         this.method_2423();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner1) void
   @iFT13zrx_wTXP(
      a = -200
   )
   private void method_2421(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner1 var1) {
      this.method_2428();
   }

   // $VF: renamed from: a (float, float) void
   private void method_2422(float var1, float var2) {
      this.field_1836 = MathHelper.method_15393(var1);
      this.field_1837 = MathHelper.method_15363(var2, -90.0F, 90.0F);
      if (Dev.ZWare.Client.Class1.field_298 == null) {
         this.field_1835 = false;
         this.method_2428();
      } else {
         boolean var3 = Dev.ZWare.Client.Class1.field_298
            .method_325(this.field_1836, this.field_1837, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("Elytra", 25.0));
         this.field_1835 = var3;
         if (!var3) {
            this.method_2428();
         } else {
            if (this.method_2426()) {
               this.method_2427(this.field_1836, this.field_1837);
            } else {
               this.method_2428();
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2423() {
      this.method_2425();
      this.field_1827 = 0;
      this.field_1828 = false;
      this.field_1835 = false;
      this.method_2428();
   }

   // $VF: renamed from: o () void
   private void method_2424() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Class9 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Class9.class);
         if (var1 != null) {
            var1.method_3396(var1.method_3495());
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2425() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Class9 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Class9.class);
         if (var1 != null) {
            var1.method_3397();
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_2426() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3369();
      return var1 != null && var1.method_3372();
   }

   // $VF: renamed from: b (float, float) void
   private void method_2427(float var1, float var2) {
      if (c.field_1724 != null) {
         if (!this.field_1831) {
            this.field_1832 = c.field_1724.method_36454();
            this.field_1833 = c.field_1724.field_6241;
            this.field_1834 = c.field_1724.method_36455();
         }

         this.field_1831 = true;
         c.field_1724.method_36456(var1);
         c.field_1724.field_6241 = var1;
         c.field_1724.method_36457(var2);
      }
   }

   // $VF: renamed from: q () void
   private void method_2428() {
      if (this.field_1831 && c.field_1724 != null) {
         c.field_1724.method_36456(this.field_1832);
         c.field_1724.field_6241 = this.field_1833;
         c.field_1724.method_36457(this.field_1834);
         this.field_1831 = false;
      }
   }

   // $VF: renamed from: a (float, float) net.minecraft.util.math.Vec3d
   private static Vec3d method_2429(float var0, float var1) {
      float var2 = var1 * (float) (Math.PI / 180.0);
      float var3 = -var0 * (float) (Math.PI / 180.0);
      float var4 = MathHelper.method_15362(var3);
      float var5 = MathHelper.method_15374(var3);
      float var6 = MathHelper.method_15362(var2);
      float var7 = MathHelper.method_15374(var2);
      return new Vec3d(var5 * var6, -var7, var4 * var6);
   }

   public static enum Inner1 {
      Controller,
      StopMotion;
   }

   public static enum Inner2 {
      Smooth,
      Snap;
   }
}
