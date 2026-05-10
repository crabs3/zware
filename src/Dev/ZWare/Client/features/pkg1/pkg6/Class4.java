package Dev.ZWare.Client.features.pkg1.pkg6;

import Dev.ZWare.Client.mixin.Class18;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public class Class4 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2842 = 0.2873;
   // $VF: renamed from: p double
   private static final double field_2843 = 0.9937;
   // $VF: renamed from: q double
   private static final double field_2844 = 0.001;
   // $VF: renamed from: r double
   private static final double field_2845 = 125.0;
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg1.pkg6.Class4
   private static Class4 field_2846;
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_2847 = this.a("Mode", Class4.Inner1.GrimStrafe);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2848 = this.a("Grim 45 Diagonal", true).method_683("Grim");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2849 = this.a("Boat Speed Boost", 0.4, 0.0, 1.7).method_683("Grim");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2850 = this.a("Strict", true).method_683("NCP");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2851 = this.a("Lower Jump", true).method_683("NCP");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2852 = this.a("Auto Jump", false).method_683("NCP");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2853 = this.a("Timer Speed Boost", 1.08, 1.0, 1.1).method_683("NCP");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg1.pkg6.Class4$Inner2
   private Class4.Inner2 field_2854 = Class4.Inner2.SlowDown;
   // $VF: renamed from: B double
   private double field_2855 = 0.2873;
   // $VF: renamed from: C double
   private double field_2856;
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg1.pkg6.Class4$Inner1
   private Class4.Inner1 field_2857 = Class4.Inner1.GrimStrafe;
   // $VF: renamed from: E java.lang.Float
   private Float field_2858;

   public Class4() {
      super("Speed", "Accelerates your walking speed", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, true, false, false);
      field_2846 = this;
      this.field_2848.method_709(var1 -> this.field_2847.method_671() == Class4.Inner1.GrimStrafe);
      this.field_2849.method_709(var1 -> this.field_2847.method_671() == Class4.Inner1.GrimStrafe);
      this.field_2850.method_709(var1 -> this.field_2847.method_671() == Class4.Inner1.NcpStrafe);
      this.field_2851.method_709(var1 -> this.field_2847.method_671() == Class4.Inner1.NcpStrafe);
      this.field_2852.method_709(var1 -> this.field_2847.method_671() == Class4.Inner1.NcpStrafe);
      this.field_2853.method_709(var1 -> this.field_2847.method_671() == Class4.Inner1.NcpStrafe);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3570();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3570();
      Dev.ZWare.Client.Class1.field_293 = 1.0F;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return switch ((Class4.Inner1)this.field_2847.method_671()) {
         case GrimStrafe -> "Grim";
         case NcpStrafe -> "NCP";
      };
   }

   // $VF: renamed from: n () void
   public static void method_3547() {
      Class4 var0 = method_3572();
      if (var0 != null) {
         var0.method_3562();
      }
   }

   // $VF: renamed from: a () boolean
   public static boolean method_3548() {
      Class4 var0 = method_3572();
      return var0 != null && var0.method_3560();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3549(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         Dev.ZWare.Client.Class1.field_293 = 1.0F;
         this.method_3570();
      } else {
         if (this.field_2847.method_671() != this.field_2857) {
            this.method_3570();
            this.field_2857 = this.field_2847.method_671();
         }

         this.method_3555();
         if (this.method_3561()) {
            c.field_1724.method_5728(true);
         }

         if (this.field_2847.method_671() != Class4.Inner1.GrimStrafe || !this.method_3556()) {
            this.field_2858 = null;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3550(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2 var1) {
      if (!g()) {
         if (this.field_2847.method_671() == Class4.Inner1.GrimStrafe && this.method_3556() && this.field_2858 != null) {
            Dev.ZWare.Client.Class1.field_298
               .method_321(this.field_2858, Math.max(125.0, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("Speed", 125.0)));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class9) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3551(Dev.ZWare.Client.pkg2.pkg1.Class9 var1) {
      if (!g()) {
         if (!this.method_3556()) {
            this.method_3570();
         } else {
            switch ((Class4.Inner1)this.field_2847.method_671()) {
               case GrimStrafe:
                  this.method_3553(var1);
                  break;
               case NcpStrafe:
                  this.method_3554(var1);
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3552(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (g()) {
         this.field_2856 = 0.0;
      } else {
         this.field_2856 = this.method_3565();
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class9) void
   private void method_3553(Dev.ZWare.Client.pkg2.pkg1.Class9 var1) {
      Vec2f var2 = this.method_3557();
      if (this.method_3558(var2)) {
         double var3 = this.method_3563();
         if (!(var3 <= 0.0)) {
            double var5 = var1.method_1025();
            double var7 = var1.method_1027();
            double var9 = Math.hypot(var5, var7);
            if (!(var9 <= 0.001)) {
               var1.method_1029(var5 + var5 / var9 * var3, var7 + var7 / var9 * var3);
            }
         }
      }
   }

   // $VF: renamed from: c (Dev.ZWare.Client.pkg2.pkg1.Class9) void
   private void method_3554(Dev.ZWare.Client.pkg2.pkg1.Class9 var1) {
      Vec2f var2 = this.method_3557();
      boolean var3 = this.method_3558(var2);
      boolean var4 = this.method_3559() || this.field_2852.method_671() && var3;
      Double var5 = null;
      if (c.field_1724.method_24828() && var4) {
         this.field_2854 = Class4.Inner2.Jump;
      }

      switch (this.field_2854) {
         case Jump:
            if (c.field_1724.method_24828()) {
               var5 = this.field_2851.method_671() ? 0.4 : 0.42;
               this.field_2855 = 0.5872999999999999;
               this.field_2854 = Class4.Inner2.JumpPost;
            } else {
               this.field_2854 = Class4.Inner2.SlowDown;
            }
            break;
         case JumpPost:
            this.field_2855 = this.field_2855 * (this.field_2850.method_671() ? 0.59 : 0.62);
            this.field_2854 = Class4.Inner2.SlowDown;
            break;
         case SlowDown:
            this.field_2855 = this.field_2856 * 0.9937;
      }

      if (c.field_1724.method_24828() && !var4) {
         this.field_2855 = 0.2873;
      }

      this.field_2855 = MathHelper.method_15350(this.field_2855, 0.2873, 1.0);
      double var6;
      if (var3) {
         var6 = this.field_2855;
      } else {
         this.field_2855 = 0.2873;
         var6 = 0.0;
      }

      double[] var8 = this.method_3568(var6, c.field_1724.method_36454(), var2.field_1342, var2.field_1343);
      double var9 = var5 != null ? var5 : var1.method_1026();
      var1.method_1028(var8[0], var9, var8[1]);
      Vec3d var11 = c.field_1724.method_18798();
      c.field_1724.method_18800(var8[0], var5 != null ? var5 : var11.field_1351, var8[1]);
   }

   // $VF: renamed from: o () void
   private void method_3555() {
      if (this.field_2847.method_671() == Class4.Inner1.NcpStrafe && this.method_3556() && this.method_3558(this.method_3557())) {
         Dev.ZWare.Client.Class1.field_293 = this.field_2853.method_671().floatValue();
      } else {
         Dev.ZWare.Client.Class1.field_293 = 1.0F;
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_3556() {
      if (g()) {
         return false;
      } else if (!c.field_1724.method_31549().field_7479
         && !c.field_1724.method_6128()
         && !c.field_1724.method_5799()
         && !c.field_1724.method_5771()
         && !c.field_1724.method_5765()) {
         return switch ((Class4.Inner1)this.field_2847.method_671()) {
            case GrimStrafe -> !this.method_3569();
            case NcpStrafe -> !c.field_1724.method_5715();
         };
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () net.minecraft.util.math.Vec2f
   private Vec2f method_3557() {
      return c.field_1724 != null && c.field_1724.field_3913 != null ? c.field_1724.field_3913.method_3128() : Vec2f.field_1340;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec2f) boolean
   private boolean method_3558(Vec2f var1) {
      return Math.abs(var1.field_1343) > 0.001 || Math.abs(var1.field_1342) > 0.001;
   }

   // $VF: renamed from: c () boolean
   private boolean method_3559() {
      if (c.field_1724 == null || c.field_1724.field_3913 == null) {
         return false;
      } else {
         return c.field_1724.field_3913.field_54155 != null ? c.field_1724.field_3913.field_54155.comp_3163() : c.field_1690.field_1903.method_1434();
      }
   }

   // $VF: renamed from: n () boolean
   private boolean method_3560() {
      return this.field_2847.method_671() == Class4.Inner1.GrimStrafe && this.method_3556() && this.method_3558(this.method_3557());
   }

   // $VF: renamed from: o () boolean
   private boolean method_3561() {
      if (g() || this.field_2847.method_671() != Class4.Inner1.GrimStrafe || !this.method_3556()) {
         return false;
      } else {
         return !this.method_3558(this.method_3557())
            ? false
            : !c.field_1724.method_5715()
               && !c.field_1724.method_5799()
               && !c.field_1724.method_5869()
               && !c.field_1724.method_6128()
               && (c.field_1724.method_7344().method_7586() > 6 || c.field_1724.method_31549().field_7478);
      }
   }

   // $VF: renamed from: p () void
   private void method_3562() {
      if (!g() && this.field_2847.method_671() == Class4.Inner1.GrimStrafe && this.method_3556() && c.field_1724.field_3913 != null) {
         Vec2f var1 = this.method_3557();
         if (!this.method_3558(var1)) {
            this.field_2858 = null;
         } else {
            float var2 = this.method_3566(var1.field_1342);
            float var3 = this.method_3566(var1.field_1343);
            if (var2 == 0.0F && var3 == 0.0F) {
               this.field_2858 = null;
            } else {
               float var4 = this.method_3564(c.field_1724.method_36454(), var2, var3);
               this.field_2858 = var4;
               float var5 = MathHelper.method_15393(c.field_1724.method_36454() - var4);
               if (!(var5 * var5 < 0.001F)) {
                  float var6 = var1.field_1343;
                  float var7 = var1.field_1342;
                  if (var6 != 0.0F || var7 != 0.0F) {
                     double var8 = Math.toRadians(var5);
                     double var10 = Math.cos(var8);
                     double var12 = Math.sin(var8);
                     float var14 = (float)(var6 * var10 - var7 * var12);
                     float var15 = (float)(var6 * var12 + var7 * var10);
                     double var16 = Math.atan2(var14, var15);
                     double var18 = Math.PI / 4;
                     double var20 = Math.PI / 8;
                     boolean var22 = false;
                     boolean var23 = false;
                     boolean var24 = false;
                     boolean var25 = false;
                     if (var16 > -var20 && var16 <= var20) {
                        var22 = true;
                     } else if (var16 > var20 && var16 <= var20 + var18) {
                        var22 = true;
                        var24 = true;
                     } else if (var16 > var20 + var18 && var16 <= var20 + 2.0 * var18) {
                        var24 = true;
                     } else if (var16 > var20 + 2.0 * var18 && var16 <= var20 + 3.0 * var18) {
                        var23 = true;
                        var24 = true;
                     } else if (var16 > var20 + 3.0 * var18 || var16 <= -(var20 + 3.0 * var18)) {
                        var23 = true;
                     } else if (var16 > -(var20 + 3.0 * var18) && var16 <= -(var20 + 2.0 * var18)) {
                        var23 = true;
                        var25 = true;
                     } else if (var16 > -(var20 + 2.0 * var18) && var16 <= -(var20 + var18)) {
                        var25 = true;
                     } else if (var16 > -(var20 + var18) && var16 <= -var20) {
                        var22 = true;
                        var25 = true;
                     }

                     float var26 = var4;
                     if (var23) {
                        var26 = MathHelper.method_15393(var4 + 180.0F);
                        var23 = false;
                        var22 = true;
                        boolean var27 = var24;
                        var24 = var25;
                        var25 = var27;
                     } else if (!var22 && var24 != var25) {
                        var26 = MathHelper.method_15393(var4 + (var24 ? -90.0F : 90.0F));
                        var22 = true;
                        var24 = false;
                        var25 = false;
                     }

                     this.field_2858 = var26;
                     PlayerInput var32 = c.field_1724.field_3913.field_54155;
                     boolean var28 = this.method_3561();
                     if (var32 != null) {
                        c.field_1724.field_3913.field_54155 = new PlayerInput(var22, var23, var24, var25, var32.comp_3163(), var32.comp_3164(), var28);
                     }

                     if (var28) {
                        c.field_1724.method_5728(true);
                     }

                     float var29 = method_3571(var24, var25);
                     float var30 = method_3571(var22, var23);
                     float var31 = MathHelper.method_15355(var29 * var29 + var30 * var30);
                     ((Class18)c.field_1724.field_3913).zware$setMovementVector(var31 > 0.001 ? new Vec2f(var29 / var31, var30 / var31) : Vec2f.field_1340);
                  }
               }
            }
         }
      } else {
         this.field_2858 = null;
      }
   }

   // $VF: renamed from: a () double
   private double method_3563() {
      if (c.field_1687 != null && c.field_1724 != null && !(this.field_2849.method_671() <= 0.0)) {
         Box var1 = c.field_1724.method_5829().method_1014(4.0);
         Box var2 = c.field_1724.method_5829();
         double var3 = 0.0;

         for (AbstractBoatEntity var6 : c.field_1687
            .method_8390(AbstractBoatEntity.class, var1, var1x -> var2.method_994(var1x.method_5829().method_1014(0.01)))) {
            var3 += this.field_2849.method_671();
         }

         return var3;
      } else {
         return 0.0;
      }
   }

   // $VF: renamed from: a (float, float, float) float
   private float method_3564(float var1, float var2, float var3) {
      float var4 = this.method_3567(var1, var2, var3);
      return !this.field_2848.method_671() || var2 == 0.0F || var3 == 0.0F || this.method_3559() && c.field_1724.method_24828()
         ? var4
         : MathHelper.method_15393(var4 - 45.0F);
   }

   // $VF: renamed from: b () double
   private double method_3565() {
      double var1 = c.field_1724.method_23317() - c.field_1724.field_6014;
      double var3 = c.field_1724.method_23321() - c.field_1724.field_5969;
      return Math.hypot(var1, var3);
   }

   // $VF: renamed from: a (float) float
   private float method_3566(float var1) {
      if (var1 > 0.001) {
         return 1.0F;
      } else {
         return var1 < -0.001 ? -1.0F : 0.0F;
      }
   }

   // $VF: renamed from: b (float, float, float) float
   private float method_3567(float var1, float var2, float var3) {
      float var4 = var1;
      if (var2 > 0.0F) {
         if (var3 > 0.0F) {
            var4 = var1 - 45.0F;
         } else if (var3 < 0.0F) {
            var4 = var1 + 45.0F;
         }
      } else if (var2 < 0.0F) {
         var4 = var1 + 180.0F;
         if (var3 > 0.0F) {
            var4 += 45.0F;
         } else if (var3 < 0.0F) {
            var4 -= 45.0F;
         }
      } else if (var3 > 0.0F) {
         var4 = var1 - 90.0F;
      } else if (var3 < 0.0F) {
         var4 = var1 + 90.0F;
      }

      return MathHelper.method_15393(var4);
   }

   // $VF: renamed from: a (double, float, float, float) double[]
   private double[] method_3568(double var1, float var3, float var4, float var5) {
      if (var4 != 0.0F) {
         if (var5 > 0.0F) {
            var3 += var4 > 0.0F ? -45.0F : 45.0F;
         } else if (var5 < 0.0F) {
            var3 += var4 > 0.0F ? 45.0F : -45.0F;
         }

         var5 = 0.0F;
         var4 = var4 > 0.0F ? 1.0F : -1.0F;
      }

      double var6 = Math.sin(Math.toRadians(var3 + 90.0F));
      double var8 = Math.cos(Math.toRadians(var3 + 90.0F));
      double var10 = var4 * var1 * var8 + var5 * var1 * var6;
      double var12 = var4 * var1 * var6 - var5 * var1 * var8;
      return new double[]{var10, var12};
   }

   // $VF: renamed from: p () boolean
   private boolean method_3569() {
      try {
         Class var1 = Class.forName("baritone.api.BaritoneAPI");
         Object var2 = var1.getMethod("getProvider").invoke(null);
         Object var3 = var2.getClass().getMethod("getPrimaryBaritone").invoke(var2);
         Object var4 = var3.getClass().getMethod("getPathingBehavior").invoke(var3);
         return var4.getClass().getMethod("isPathing").invoke(var4) instanceof Boolean var6 && var6;
      } catch (Throwable var7) {
         return false;
      }
   }

   // $VF: renamed from: q () void
   private void method_3570() {
      this.field_2854 = Class4.Inner2.SlowDown;
      this.field_2855 = 0.2873;
      this.field_2856 = 0.0;
      this.field_2857 = this.field_2847.method_671();
      this.field_2858 = null;
   }

   // $VF: renamed from: a (boolean, boolean) float
   private static float method_3571(boolean var0, boolean var1) {
      return (var0 ? 1.0F : 0.0F) - (var1 ? 1.0F : 0.0F);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class4
   private static Class4 method_3572() {
      if (Dev.ZWare.Client.Class1.field_316 == null) {
         return field_2846 != null && field_2846.d() ? field_2846 : null;
      } else {
         Class4 var0 = Dev.ZWare.Client.Class1.field_316.method_510(Class4.class);
         return var0 != null && var0.d() ? var0 : null;
      }
   }

   private static enum Inner1 {
      GrimStrafe,
      NcpStrafe;
   }

   private static enum Inner2 {
      Jump,
      JumpPost,
      SlowDown;
   }
}
