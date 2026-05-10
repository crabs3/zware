package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class Class19 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1457 = 1.5;
   // $VF: renamed from: p double
   private static final double field_1458 = 0.25;
   // $VF: renamed from: q double
   private static final double field_1459 = Math.pow(0.99, 0.25);
   // $VF: renamed from: r double
   private static final double field_1460 = 0.0075;
   // $VF: renamed from: s int
   private static final int field_1461 = 180;
   // $VF: renamed from: t int
   private static final int field_1462 = 45;
   // $VF: renamed from: u float
   private static final float field_1463 = 60.0F;
   // $VF: renamed from: v float
   private static final float field_1464 = 70.0F;
   // $VF: renamed from: w float
   private static final float field_1465 = 6.0F;
   // $VF: renamed from: x float
   private static final float field_1466 = 5.0F;
   // $VF: renamed from: y float
   private static final float field_1467 = 8.0F;
   // $VF: renamed from: z float
   private static final float field_1468 = 1.0F;
   // $VF: renamed from: A double
   private static final double field_1469 = 0.31;
   // $VF: renamed from: B double
   private static final double field_1470 = 0.03;
   // $VF: renamed from: C double
   private static final double field_1471 = 0.25;
   // $VF: renamed from: D int
   private static final int field_1472 = 12;
   // $VF: renamed from: E double
   private static final double field_1473 = 0.45;
   // $VF: renamed from: F double
   private static final double field_1474 = 0.018;
   // $VF: renamed from: G double
   private static final double field_1475 = 0.35;
   // $VF: renamed from: H double
   private static final double field_1476 = 0.12;
   // $VF: renamed from: I double
   private static final double field_1477 = 0.2;
   // $VF: renamed from: J double
   private static final double field_1478 = 2.5;
   // $VF: renamed from: K float
   private static final float field_1479 = 12.0F;
   // $VF: renamed from: L float
   private static final float field_1480 = 12.0F;
   // $VF: renamed from: M float
   private static final float field_1481 = 2.0F;
   // $VF: renamed from: N float
   private static final float field_1482 = 4.0F;
   // $VF: renamed from: O float
   private static final float field_1483 = 1.0F;
   // $VF: renamed from: P int
   private static final int field_1484 = 2;
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1485 = this.a("Target Range", 14.0, 1.0, 32.0).method_683("General");
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1486 = this.a("Update Interval", 2, 1, 10).method_683("General");
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1487 = this.a("Prefer Crosshair", true).method_683("General");
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1488 = this.a("Require Pearl", false).method_683("General");
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1489 = this.a("Predict Target", true).method_683("General");
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1490 = this.a("Render Path", true).method_683("Render");
   // $VF: renamed from: W Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class19.Inner4> field_1491 = this.a("Shape Mode", Class19.Inner4.Both).method_683("Render");
   // $VF: renamed from: X Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1492 = this.a("Line Width", 1.5, 0.1, 5.0).method_683("Render");
   // $VF: renamed from: Y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1493 = this.a("Path Color", 80, 255, 186, 255).method_683("Render");
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1494 = this.a("Impact Color", 255, 170, 70, 255).method_683("Render");
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1495 = this.a("Landing Side Color", 85, 170, 255, 35).method_683("Render");
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1496 = this.a("Landing Line Color", 85, 170, 255, 255).method_683("Render");
   // $VF: renamed from: ac net.minecraft.entity.player.PlayerEntity
   private PlayerEntity field_1497;
   // $VF: renamed from: ad Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner1
   private Class19.Inner1 field_1498;
   // $VF: renamed from: ae int
   private int field_1499;

   public Class19() {
      super("Marker", "Shows the best pearl spot to close the gap on a target.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_1492.method_709(var1 -> this.field_1490.method_671() || this.field_1491.method_671().method_1091());
      this.field_1493.method_709(var1 -> this.field_1490.method_671());
      this.field_1495.method_709(var1 -> this.field_1491.method_671().method_1090());
      this.field_1496.method_709(var1 -> this.field_1491.method_671().method_1091());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2083();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2083();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_1497 != null ? this.field_1497.method_5477().getString() : null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2082(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         this.method_2083();
      } else {
         PlayerEntity var2 = this.method_2084();
         if (var2 != null && (!this.field_1488.method_671() || this.method_2086())) {
            if (var2 != this.field_1497) {
               this.field_1497 = var2;
               this.field_1499 = 0;
            }

            if (this.field_1499 > 0 && this.field_1498 != null) {
               this.field_1499--;
            } else {
               this.field_1498 = this.method_2087(this.field_1497);
               this.field_1499 = Math.max(1, this.field_1486.method_671()) - 1;
            }
         } else {
            this.method_2083();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (!g() && this.field_1498 != null) {
         if (this.field_1490.method_671()) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_784(
               event.method_1055(), this.field_1498.method_1268(), this.field_1493.method_671(), this.field_1492.method_671()
            );
         }

         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(
            event.method_1055(), this.field_1498.method_1266(), this.field_1494.method_671(), Math.max(1.0, this.field_1492.method_671())
         );
         if (this.field_1491.method_671().method_1090()) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(event.method_1055(), this.field_1498.method_1267(), this.field_1495.method_671());
         }

         if (this.field_1491.method_671().method_1091()) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(
               event.method_1055(), this.field_1498.method_1267(), this.field_1496.method_671(), Math.max(1.0, this.field_1492.method_671())
            );
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2083() {
      this.field_1497 = null;
      this.field_1498 = null;
      this.field_1499 = 0;
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_2084() {
      double var1 = this.field_1485.method_671() * this.field_1485.method_671();
      if (this.field_1487.method_671()
         && c.field_1765 instanceof EntityHitResult var3
         && var3.method_17782() instanceof PlayerEntity var4
         && this.method_2085(var4)
         && c.field_1724.method_5858(var4) <= var1) {
         return var4;
      } else {
         PlayerEntity var10 = null;
         double var11 = Double.POSITIVE_INFINITY;

         for (PlayerEntity var7 : c.field_1687.method_18456()) {
            if (this.method_2085(var7)) {
               double var8 = c.field_1724.method_5858(var7);
               if (!(var8 > var1) && !(var8 >= var11)) {
                  var10 = var7;
                  var11 = var8;
               }
            }
         }

         return var10;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2085(PlayerEntity var1) {
      if (var1 == null || var1 == c.field_1724 || var1.method_31481() || !var1.method_5805() || var1.method_7325()) {
         return false;
      } else {
         return var1.method_68878() ? false : Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var1);
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_2086() {
      if (!c.field_1724.method_6047().method_31574(Items.field_8634) && !c.field_1724.method_6079().method_31574(Items.field_8634)) {
         for (int var1 = 0; var1 < c.field_1724.method_31548().method_5439(); var1++) {
            if (c.field_1724.method_31548().method_5438(var1).method_31574(Items.field_8634)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner1
   private Class19.Inner1 method_2087(PlayerEntity var1) {
      if (var1 == null) {
         return null;
      } else {
         Class19.Inner3 var2 = this.method_2094(var1);
         Class19.Inner5 var3 = this.method_2088(var1, var2);
         if (var3 != null) {
            return this.method_2093(var3, var2);
         } else {
            float[] var4 = Dev.ZWare.Client.Class1.field_298.method_332(var1.method_5829().method_1005());
            Class19.Inner5 var5 = this.method_2090(var4[0], var4[1], 60.0F, 70.0F, 6.0F, 5.0F, var2);
            if (var5 == null) {
               return null;
            } else {
               Class19.Inner5 var6 = this.method_2090(var5.method_1464(), var5.method_1465(), 8.0F, 8.0F, 1.0F, 1.0F, var2);
               Class19.Inner5 var7 = this.method_2089(var5, var6);
               return this.method_2093(var7, var2);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner3) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5
   private Class19.Inner5 method_2088(PlayerEntity var1, Class19.Inner3 var2) {
      if (this.field_1498 != null && var1 != null && var1.method_5667().equals(this.field_1498.method_1260())) {
         Class19.Inner5 var3 = this.method_2091(this.field_1498.method_1261(), this.field_1498.method_1262(), var2, false);
         Class19.Inner5 var4 = this.method_2090(this.field_1498.method_1261(), this.field_1498.method_1262(), 12.0F, 12.0F, 2.0F, 2.0F, var2);
         Class19.Inner5 var5 = var4 != null ? this.method_2090(var4.method_1464(), var4.method_1465(), 4.0F, 4.0F, 1.0F, 1.0F, var2) : null;
         return this.method_2089(var3, this.method_2089(var4, var5));
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5, Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5
   private Class19.Inner5 method_2089(Class19.Inner5 var1, Class19.Inner5 var2) {
      if (var1 == null) {
         return var2;
      } else if (var2 == null) {
         return var1;
      } else {
         return var2.method_1469() <= var1.method_1469() ? var2 : var1;
      }
   }

   // $VF: renamed from: a (float, float, float, float, float, float, Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner3) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5
   private Class19.Inner5 method_2090(float var1, float var2, float var3, float var4, float var5, float var6, Class19.Inner3 var7) {
      Class19.Inner5 var8 = null;
      float var9 = -var3;

      while (var9 <= var3 + 0.001F) {
         float var10 = MathHelper.method_15393(var1 + var9);
         float var11 = -var4;

         while (var11 <= var4 + 0.001F) {
            float var12 = MathHelper.method_15363(var2 + var11, -85.0F, 85.0F);
            Class19.Inner5 var13 = this.method_2091(var10, var12, var7, false);
            if (var13 != null && (var8 == null || var13.method_1469() < var8.method_1469())) {
               var8 = var13;
            }

            var11 += var6;
         }

         var9 += var5;
      }

      return var8;
   }

   // $VF: renamed from: a (float, float, Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner3, boolean) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5
   private Class19.Inner5 method_2091(float var1, float var2, Class19.Inner3 var3, boolean var4) {
      Vec3d var5 = c.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
      Vec3d var6 = this.method_2096(var1, var2);
      Object var7 = var4 ? new ArrayList() : List.of();
      if (var4) {
         var7.add(var5);
      }

      for (int var8 = 0; var8 < 180; var8++) {
         Vec3d var9 = var5.method_1019(var6.method_1021(0.25));
         BlockHitResult var10 = c.field_1687.method_17742(new RaycastContext(var5, var9, ShapeType.field_17558, FluidHandling.field_1348, c.field_1724));
         if (var10.method_17783() != Type.field_1333) {
            int var11 = Math.min(45, Math.max(0, (int)Math.ceil((var8 + 1) * 0.25)));
            Box var12 = var3.method_1246()[var11];
            Class19.Inner2 var13 = this.method_2098(var10.method_17784(), var10.method_17780());
            if (var13 == null) {
               return null;
            }

            double var14 = this.method_2101(var13, var12, var11);
            if (Dev.ZWare.Client.pkg1.Class7.method_121(var13.method_1551(), var12) > 6.25) {
               var14++;
            }

            if (var4) {
               var7.add(var10.method_17784());
            }

            return new Class19.Inner5(var1, var2, var10.method_17784(), var13.method_1551(), var11, var14, (List<Vec3d>)var7);
         }

         var5 = var9;
         var6 = this.method_2097(var6);
         if (var4 && (var8 + 1) % 2 == 0) {
            var7.add(var9);
         }

         if (var9.field_1351 < c.field_1687.method_31607() - 5) {
            break;
         }
      }

      return null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner1
   private Class19.Inner1 method_2092(Class19.Inner5 var1) {
      return this.field_1497 == null ? null : this.method_2093(var1, this.method_2094(this.field_1497));
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner5, Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner3) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner1
   private Class19.Inner1 method_2093(Class19.Inner5 var1, Class19.Inner3 var2) {
      if (var1 != null && this.field_1497 != null && var2 != null) {
         Class19.Inner5 var3 = this.method_2091(var1.method_1464(), var1.method_1465(), var2, true);
         if (var3 == null) {
            return null;
         } else {
            Box var4 = c.field_1724.method_18377(EntityPose.field_18076).method_30757(var3.method_1467());
            Box var5 = new Box(
               var3.method_1466().field_1352 - 0.12,
               var3.method_1466().field_1351 - 0.12,
               var3.method_1466().field_1350 - 0.12,
               var3.method_1466().field_1352 + 0.12,
               var3.method_1466().field_1351 + 0.12,
               var3.method_1466().field_1350 + 0.12
            );
            return new Class19.Inner1(
               this.field_1497.method_5667(),
               var3.method_1464(),
               var3.method_1465(),
               var3.method_1466(),
               var3.method_1467(),
               var3.method_1468(),
               var5,
               var4,
               List.copyOf(var3.method_1470())
            );
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner3
   private Class19.Inner3 method_2094(PlayerEntity var1) {
      Box[] var2 = new Box[46];
      Vec3d var3 = var1.method_19538();
      Box var4 = var1.method_5829();

      for (int var5 = 0; var5 <= 45; var5++) {
         Vec3d var6 = this.method_2095(var1, var5);
         var2[var5] = var4.method_997(var6.method_1020(var3)).method_1009(0.2, 0.0, 0.2);
      }

      return new Class19.Inner3(var1.method_5667(), var2);
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, int) net.minecraft.util.math.Vec3d
   private Vec3d method_2095(PlayerEntity var1, int var2) {
      if (!this.field_1489.method_671() || var2 <= 0) {
         return var1.method_19538();
      } else if (var1.method_6128()) {
         return Dev.ZWare.Client.pkg1.Class18.method_214(var1, var2);
      } else if (Dev.ZWare.Client.pkg1.Class18.method_222(var1, c.field_1687)) {
         return var1.method_19538();
      } else {
         return var1.method_24828() ? Dev.ZWare.Client.pkg1.Class18.method_213(var1, c.field_1687, var2) : Dev.ZWare.Client.pkg1.Class18.method_216(var1, var2);
      }
   }

   // $VF: renamed from: a (float, float) net.minecraft.util.math.Vec3d
   private Vec3d method_2096(float var1, float var2) {
      float var3 = var1 * (float) (Math.PI / 180.0);
      float var4 = var2 * (float) (Math.PI / 180.0);
      Vec3d var5 = new Vec3d(
            -MathHelper.method_15374(var3) * MathHelper.method_15362(var4),
            -MathHelper.method_15374(var4),
            MathHelper.method_15362(var3) * MathHelper.method_15362(var4)
         )
         .method_1029()
         .method_1021(1.5);
      Vec3d var6 = c.field_1724.method_18798();
      return var5.method_1031(var6.field_1352, c.field_1724.method_24828() ? 0.0 : var6.field_1351, var6.field_1350);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_2097(Vec3d var1) {
      return new Vec3d(var1.field_1352 * field_1459, var1.field_1351 * field_1459 - 0.0075, var1.field_1350 * field_1459);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Direction) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner2
   private Class19.Inner2 method_2098(Vec3d var1, Direction var2) {
      Vec3d var3 = new Vec3d(var2.method_10148(), var2.method_10164(), var2.method_10165());
      double var4 = var2.method_10166().method_10178() ? 0.03 : 0.31;
      Vec3d var6 = var1.method_1019(var3.method_1021(var4));
      ArrayList var7 = new ArrayList(4);
      var7.add(var6);
      var7.add(var1);
      var7.add(var6.method_1031(0.25, 0.0, 0.0));
      var7.add(var6.method_1031(0.0, 0.0, 0.25));
      double[] var8 = new double[]{0.0, 0.28, -0.28};

      for (Vec3d var10 : var7) {
         for (double var14 : var8) {
            for (double var19 : var8) {
               Class19.Inner2 var21 = this.method_2099(var10.method_1031(var14, 0.0, var19));
               if (var21 != null) {
                  return var21;
               }
            }
         }
      }

      return null;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner2
   private Class19.Inner2 method_2099(Vec3d var1) {
      Class19.Inner2 var2 = this.method_2100(var1);
      if (var2 != null && var2.method_1552()) {
         return var2;
      } else {
         for (int var3 = 1; var3 <= 12; var3++) {
            Class19.Inner2 var4 = this.method_2100(var1.method_1023(0.0, 0.25 * var3, 0.0));
            if (var4 != null && var4.method_1552()) {
               return var4;
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d) Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner2
   private Class19.Inner2 method_2100(Vec3d var1) {
      Box var2 = c.field_1724.method_18377(EntityPose.field_18076).method_30757(var1);
      if (!c.field_1687.method_8587(c.field_1724, var2)) {
         return null;
      } else {
         BlockPos var3 = BlockPos.method_49637(var1.field_1352, var1.field_1351 - 0.05, var1.field_1350);
         boolean var4 = !c.field_1687.method_8320(var3).method_45474();
         return new Class19.Inner2(var1, var4);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class19$Inner2, net.minecraft.util.math.Box, int) double
   private double method_2101(Class19.Inner2 var1, Box var2, int var3) {
      double var4 = this.method_2102(var1.method_1551(), var2);
      double var6 = this.method_2103(var1.method_1551().field_1351, var2);
      double var8 = var4 + var6 * var6 * 0.45;
      var8 += var3 * 0.018;
      if (!var1.method_1552()) {
         var8 += 0.35;
      }

      return var8;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Box) double
   private double method_2102(Vec3d var1, Box var2) {
      double var3 = this.method_2104(var1.field_1352, var2.field_1323, var2.field_1320);
      double var5 = this.method_2104(var1.field_1350, var2.field_1321, var2.field_1324);
      return var3 * var3 + var5 * var5;
   }

   // $VF: renamed from: a (double, net.minecraft.util.math.Box) double
   private double method_2103(double var1, Box var3) {
      return this.method_2104(var1, var3.field_1322, var3.field_1325);
   }

   // $VF: renamed from: a (double, double, double) double
   private double method_2104(double var1, double var3, double var5) {
      if (var1 < var3) {
         return var3 - var1;
      } else {
         return var1 > var5 ? var1 - var5 : 0.0;
      }
   }

   private record Inner1(UUID bi, float bj, float bk, Vec3d bl, Vec3d bm, int bn, Box bo, Box bp, List<Vec3d> bq) {
      // $VF: renamed from: bi java.util.UUID
      private final UUID field_746;
      // $VF: renamed from: bj float
      private final float field_747;
      // $VF: renamed from: bk float
      private final float field_748;
      // $VF: renamed from: bl net.minecraft.util.math.Vec3d
      private final Vec3d field_749;
      // $VF: renamed from: bm net.minecraft.util.math.Vec3d
      private final Vec3d field_750;
      // $VF: renamed from: bn int
      private final int field_751;
      // $VF: renamed from: bo net.minecraft.util.math.Box
      private final Box field_752;
      // $VF: renamed from: bp net.minecraft.util.math.Box
      private final Box field_753;
      // $VF: renamed from: bq java.util.List
      private final List<Vec3d> field_754;

      private Inner1(UUID bi, float bj, float bk, Vec3d bl, Vec3d bm, int bn, Box bo, Box bp, List<Vec3d> bq) {
         this.field_746 = bi;
         this.field_747 = bj;
         this.field_748 = bk;
         this.field_749 = bl;
         this.field_750 = bm;
         this.field_751 = bn;
         this.field_752 = bo;
         this.field_753 = bp;
         this.field_754 = bq;
      }

      // $VF: renamed from: bi () java.util.UUID
      public UUID method_1260() {
         return this.field_746;
      }

      // $VF: renamed from: bj () float
      public float method_1261() {
         return this.field_747;
      }

      // $VF: renamed from: bk () float
      public float method_1262() {
         return this.field_748;
      }

      // $VF: renamed from: bl () net.minecraft.util.math.Vec3d
      public Vec3d method_1263() {
         return this.field_749;
      }

      // $VF: renamed from: bm () net.minecraft.util.math.Vec3d
      public Vec3d method_1264() {
         return this.field_750;
      }

      // $VF: renamed from: bn () int
      public int method_1265() {
         return this.field_751;
      }

      // $VF: renamed from: bo () net.minecraft.util.math.Box
      public Box method_1266() {
         return this.field_752;
      }

      // $VF: renamed from: bp () net.minecraft.util.math.Box
      public Box method_1267() {
         return this.field_753;
      }

      // $VF: renamed from: bq () java.util.List
      public List<Vec3d> method_1268() {
         return this.field_754;
      }
   }

   private record Inner2(Vec3d a_, boolean ba) {
      // $VF: renamed from: a_ net.minecraft.util.math.Vec3d
      private final Vec3d field_1016;
      // $VF: renamed from: ba boolean
      private final boolean field_1017;

      private Inner2(Vec3d a_, boolean ba) {
         this.field_1016 = a_;
         this.field_1017 = ba;
      }

      // $VF: renamed from: a_ () net.minecraft.util.math.Vec3d
      public Vec3d method_1551() {
         return this.field_1016;
      }

      // $VF: renamed from: ba () boolean
      public boolean method_1552() {
         return this.field_1017;
      }
   }

   private record Inner3(UUID br, Box[] bs) {
      // $VF: renamed from: br java.util.UUID
      private final UUID field_731;
      // $VF: renamed from: bs net.minecraft.util.math.Box[]
      private final Box[] field_732;

      private Inner3(UUID br, Box[] bs) {
         this.field_731 = br;
         this.field_732 = bs;
      }

      // $VF: renamed from: br () java.util.UUID
      public UUID method_1245() {
         return this.field_731;
      }

      // $VF: renamed from: bs () net.minecraft.util.math.Box[]
      public Box[] method_1246() {
         return this.field_732;
      }
   }

   private static enum Inner4 {
      Both,
      Sides,
      Lines;

      // $VF: renamed from: a () boolean
      boolean method_1090() {
         return this == Both || this == Sides;
      }

      // $VF: renamed from: b () boolean
      boolean method_1091() {
         return this == Both || this == Lines;
      }
   }

   private record Inner5(float bb, float bc, Vec3d bd, Vec3d be, int bf, double bg, List<Vec3d> bh) {
      // $VF: renamed from: bb float
      private final float field_934;
      // $VF: renamed from: bc float
      private final float field_935;
      // $VF: renamed from: bd net.minecraft.util.math.Vec3d
      private final Vec3d field_936;
      // $VF: renamed from: be net.minecraft.util.math.Vec3d
      private final Vec3d field_937;
      // $VF: renamed from: bf int
      private final int field_938;
      // $VF: renamed from: bg double
      private final double field_939;
      // $VF: renamed from: bh java.util.List
      private final List<Vec3d> field_940;

      private Inner5(float bb, float bc, Vec3d bd, Vec3d be, int bf, double bg, List<Vec3d> bh) {
         this.field_934 = bb;
         this.field_935 = bc;
         this.field_936 = bd;
         this.field_937 = be;
         this.field_938 = bf;
         this.field_939 = bg;
         this.field_940 = bh;
      }

      // $VF: renamed from: bb () float
      public float method_1464() {
         return this.field_934;
      }

      // $VF: renamed from: bc () float
      public float method_1465() {
         return this.field_935;
      }

      // $VF: renamed from: bd () net.minecraft.util.math.Vec3d
      public Vec3d method_1466() {
         return this.field_936;
      }

      // $VF: renamed from: be () net.minecraft.util.math.Vec3d
      public Vec3d method_1467() {
         return this.field_937;
      }

      // $VF: renamed from: bf () int
      public int method_1468() {
         return this.field_938;
      }

      // $VF: renamed from: bg () double
      public double method_1469() {
         return this.field_939;
      }

      // $VF: renamed from: bh () java.util.List
      public List<Vec3d> method_1470() {
         return this.field_940;
      }
   }
}
