package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;

public class Class21 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2362 = 60.0;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_2363 = this.a("Block", Blocks.field_10540);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2364 = this.a("Extend", 1, 0, 3);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2365 = this.a("Tower", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2366 = this.a("Only On Click", false);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2367 = this.a("Rotate", true);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2368 = this.a("Place Range", 4.0, 0.0, 8.0);
   // $VF: renamed from: v net.minecraft.util.math.BlockPos.Mutable
   private final Mutable field_2369 = new Mutable();

   public Class21() {
      super("Scaffold", "places blocks under you using the block placement manager", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3009(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null) {
         Block var2 = this.field_2363.method_671();
         if (var2 != null && var2 != Blocks.field_10124) {
            if (!this.field_2366.method_671() || c.field_1690.field_1904.method_1434()) {
               Item var3 = var2.method_8389();
               if (var3 != null && Dev.ZWare.Client.pkg1.Class9.method_140(var1x -> var1x.method_31574(var3), 0, 35) != -1) {
                  if (this.field_2365.method_671() || !c.field_1690.field_1903.method_1434() || !(c.field_1724.method_18798().method_37268() <= 0.01)) {
                     BlockPos var4 = this.method_3010(var3);
                     if (var4 != null) {
                        BlockState var5 = c.field_1687.method_8320(var4);
                        Runnable var6 = () -> this.method_3014(var3, var4, var5);
                        if (this.field_2367.method_671() && Dev.ZWare.Client.Class1.field_298 != null) {
                           Dev.ZWare.Client.Class1.field_298
                              .method_316(this.method_3015(var4), Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("Scaffold", 60.0), var6);
                        } else {
                           var6.run();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item) net.minecraft.util.math.BlockPos
   private BlockPos method_3010(Item var1) {
      BlockPos var2 = this.method_3011();
      if (var2 == null) {
         return null;
      } else {
         BlockState var3 = c.field_1687.method_8320(var2);
         if (!var3.method_45474()) {
            return null;
         } else if (this.method_3013(var1, var2)) {
            return var2.method_10062();
         } else {
            return Dev.ZWare.Client.pkg4.Class16.method_936(var2) != null ? null : this.method_3012(var1, var2);
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   private BlockPos method_3011() {
      Vec3d var1 = c.field_1724.method_19538().method_1019(c.field_1724.method_18798()).method_1031(0.0, -0.75, 0.0);
      Vec3d var2 = c.field_1724.method_19538();
      Vec3d var3 = this.method_3016();
      int var4 = this.field_2364.method_671();
      if (var4 > 0 && var3.method_37268() > 1.0E-6) {
         var2 = var2.method_1031(var3.field_1352 * var4, 0.0, var3.field_1350 * var4);
      }

      this.field_2369.method_10102(var2.field_1352, var1.field_1351, var2.field_1350);
      if (c.field_1690.field_1832.method_1434() && !c.field_1690.field_1903.method_1434()) {
         this.field_2369.method_33098(this.field_2369.method_10264() - 1);
      }

      if (this.field_2369.method_10264() >= c.field_1724.method_24515().method_10264()) {
         this.field_2369.method_33098(c.field_1724.method_24515().method_10264() - 1);
      }

      return this.field_2369.method_10062();
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos) net.minecraft.util.math.BlockPos
   private BlockPos method_3012(Item var1, BlockPos var2) {
      double var3 = this.field_2368.method_671();
      double var5 = var3 * var3;
      Vec3d var7 = c.field_1724.method_33571();
      int var8 = MathHelper.method_15384(var3);
      int var9 = Math.max(c.field_1687.method_31607(), var2.method_10264() - var8);
      int var10 = Math.min(c.field_1687.method_31600(), var2.method_10264() + var8);
      BlockPos var11 = null;
      double var12 = Double.MAX_VALUE;

      for (int var14 = var2.method_10263() - var8; var14 <= var2.method_10263() + var8; var14++) {
         for (int var15 = var2.method_10260() - var8; var15 <= var2.method_10260() + var8; var15++) {
            for (int var16 = var9; var16 <= var10; var16++) {
               this.field_2369.method_10103(var14, var16, var15);
               if (this.method_3013(var1, this.field_2369)) {
                  Vec3d var17 = Vec3d.method_24953(this.field_2369);
                  if (!(var7.method_1025(var17) > var5)) {
                     double var18 = this.field_2369.method_10262(var2);
                     double var20 = Math.abs(this.field_2369.method_10264() - var2.method_10264()) * 0.25;
                     double var22 = var18 + var20;
                     if (var22 < var12) {
                        var12 = var22;
                        var11 = this.field_2369.method_10062();
                     }
                  }
               }
            }
         }
      }

      return var11;
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos) boolean
   private boolean method_3013(Item var1, BlockPos var2) {
      if (var1 != null && var2 != null) {
         BlockState var3 = c.field_1687.method_8320(var2);
         return var3.method_45474() && Dev.ZWare.Client.Class1.field_301.method_928(var1, var2, var3);
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) void
   private void method_3014(Item var1, BlockPos var2, BlockState var3) {
      if (var1 != null && var2 != null && var3 != null) {
         if (Dev.ZWare.Client.Class1.field_301.method_914(var2, var3, var1)) {
            try {
               Dev.ZWare.Client.Class1.field_301.method_924(var1, var2, var3, Hand.field_5808, false, null, false);
            } finally {
               Dev.ZWare.Client.Class1.field_301.method_929();
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.Vec3d
   private Vec3d method_3015(BlockPos var1) {
      Direction var2 = Dev.ZWare.Client.pkg4.Class16.method_936(var1);
      Vec3d var3 = var1.method_46558();
      if (var2 != null) {
         var3 = var3.method_1031(var2.method_10148() * 0.5, var2.method_10164() * 0.5, var2.method_10165() * 0.5);
      }

      return var3;
   }

   // $VF: renamed from: a () net.minecraft.util.math.Vec3d
   private Vec3d method_3016() {
      Vec3d var1 = c.field_1724.method_18798();
      double var2 = var1.field_1352 * var1.field_1352 + var1.field_1350 * var1.field_1350;
      if (var2 > 1.0E-4) {
         double var20 = Math.sqrt(var2);
         return new Vec3d(var1.field_1352 / var20, 0.0, var1.field_1350 / var20);
      } else if (c.field_1724.field_3913 == null) {
         return Vec3d.field_1353;
      } else {
         Vec2f var4 = c.field_1724.field_3913.method_3128();
         float var5 = var4.field_1342;
         float var6 = var4.field_1343;
         if (Math.abs(var5) <= 0.001 && Math.abs(var6) <= 0.001) {
            return Vec3d.field_1353;
         } else {
            float var7 = c.field_1724.method_36454();
            if (var5 != 0.0F) {
               if (var6 > 0.0F) {
                  var7 += var5 > 0.0F ? -45.0F : 45.0F;
               } else if (var6 < 0.0F) {
                  var7 += var5 > 0.0F ? 45.0F : -45.0F;
               }

               var6 = 0.0F;
               var5 = var5 > 0.0F ? 1.0F : -1.0F;
            }

            double var8 = Math.sin(Math.toRadians(var7 + 90.0F));
            double var10 = Math.cos(Math.toRadians(var7 + 90.0F));
            double var12 = var5 * var10 + var6 * var8;
            double var14 = var5 * var8 - var6 * var10;
            double var16 = var12 * var12 + var14 * var14;
            if (var16 <= 1.0E-6) {
               return Vec3d.field_1353;
            } else {
               double var18 = Math.sqrt(var16);
               return new Vec3d(var12 / var18, 0.0, var14 / var18);
            }
         }
      }
   }
}
