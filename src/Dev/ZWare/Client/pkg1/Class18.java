package Dev.ZWare.Client.pkg1;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Type;
import net.minecraft.world.World;

public final class Class18 {
   // $VF: renamed from: a double
   public static final double field_85 = 0.08;
   // $VF: renamed from: b double
   public static final double field_86 = 0.98;
   // $VF: renamed from: c double
   public static final double field_87 = -3.92;
   // $VF: renamed from: d double
   public static final double field_88 = -0.04;
   // $VF: renamed from: e double
   public static final double field_89 = 0.99;
   // $VF: renamed from: f double
   public static final double field_90 = 0.98;
   // $VF: renamed from: g double
   public static final double field_91 = 0.91;
   // $VF: renamed from: h double
   private static final double field_92 = 1.5;
   // $VF: renamed from: i double
   private static final double field_93 = 0.01;
   // $VF: renamed from: j double
   private static final double field_94 = 0.1;
   // $VF: renamed from: k double
   private static final double field_95 = 0.0025;
   // $VF: renamed from: l double
   private static final double field_96 = 1.0E-5;

   private Class18() {
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.world.World, int) net.minecraft.util.math.Vec3d
   public static Vec3d method_213(PlayerEntity player, World world, int ticks) {
      if (player != null && world != null) {
         Vec3d var3 = player.method_19538();
         Vec3d var4 = method_219(player);
         boolean var5 = player.method_24828();
         Box var6 = player.method_5829();
         if (method_218(player)) {
            return var3;
         } else {
            if (var5 && var4.field_1351 <= 0.05) {
               var4 = new Vec3d(var4.field_1352, 0.0, var4.field_1350);
            }

            for (int var7 = 0; var7 < ticks; var7++) {
               Vec3d var8 = var5 && var4.field_1351 <= 0.05 ? new Vec3d(var4.field_1352, 0.0, var4.field_1350) : var4;
               Vec3d var9 = Entity.method_20736(player, var8, var6, world, List.of());
               if (var9.method_1027() <= 1.0E-5) {
                  break;
               }

               var6 = var6.method_997(var9);
               var3 = method_220(var6);
               boolean var10 = Math.abs(var9.field_1352 - var8.field_1352) > 1.0E-5 || Math.abs(var9.field_1350 - var8.field_1350) > 1.0E-5;
               boolean var11 = Math.abs(var9.field_1351 - var8.field_1351) > 1.0E-5;
               if (var10) {
                  var4 = new Vec3d(0.0, var4.field_1351, 0.0);
               }

               if (var11 && var8.field_1351 < 0.0) {
                  var5 = true;
                  var4 = new Vec3d(var4.field_1352, 0.0, var4.field_1350);
               } else if (!var5) {
                  var4 = method_221(var4);
               } else {
                  var4 = new Vec3d(var4.field_1352 * 0.91, 0.0, var4.field_1350 * 0.91);
               }

               if (var4.method_1027() < 0.001) {
                  break;
               }
            }

            return var3;
         }
      } else {
         return Vec3d.field_1353;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, int) net.minecraft.util.math.Vec3d
   public static Vec3d method_214(PlayerEntity player, int ticks) {
      if (player == null) {
         return Vec3d.field_1353;
      } else {
         Vec3d var2 = player.method_19538();
         Vec3d var3 = method_219(player);
         float var4 = (float)Math.toRadians(player.method_36455());
         Vec3d var5 = player.method_5720();
         double var6 = Math.cos(var4);

         for (int var8 = 0; var8 < ticks; var8++) {
            var2 = var2.method_1019(var3);
            double var9 = Math.hypot(var3.field_1352, var3.field_1350);
            double var11 = var3.method_1033();
            double var13 = var6 * var6 * Math.min(1.0, var11 / 0.4);
            double var15 = var3.field_1351 + -0.04 + var13 * 0.06;
            if (var3.field_1351 < 0.0 && var9 > 0.0) {
               var15 += -0.1 * var3.field_1351 * var13;
            }

            Vec3d var17 = new Vec3d(var3.field_1352, var15, var3.field_1350);
            Vec3d var18 = new Vec3d(
               var5.field_1352 * 0.1 + (var5.field_1352 * 1.5 - var17.field_1352) * 0.01,
               var5.field_1351 * 0.1 + (var5.field_1351 * 1.5 - var17.field_1351) * 0.01,
               var5.field_1350 * 0.1 + (var5.field_1350 * 1.5 - var17.field_1350) * 0.01
            );
            Vec3d var19 = var17.method_1019(var18);
            var3 = new Vec3d(var19.field_1352 * 0.99, var19.field_1351 * 0.98, var19.field_1350 * 0.99);
         }

         return var2;
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity, int) net.minecraft.util.math.Vec3d
   public static Vec3d method_215(PlayerEntity player, int ticks) {
      if (player == null) {
         return Vec3d.field_1353;
      } else {
         Vec3d var2 = player.method_19538();
         Vec3d var3 = method_219(player);

         for (int var4 = 0; var4 < ticks; var4++) {
            var2 = var2.method_1019(var3);
            double var5 = Math.max(var3.field_1351, -3.92);
            var3 = new Vec3d(var3.field_1352 * 0.991, var5, var3.field_1350 * 0.991);
         }

         return var2;
      }
   }

   // $VF: renamed from: c (net.minecraft.entity.player.PlayerEntity, int) net.minecraft.util.math.Vec3d
   public static Vec3d method_216(PlayerEntity player, int ticks) {
      if (player == null) {
         return Vec3d.field_1353;
      } else {
         Vec3d var2 = player.method_19538();
         Vec3d var3 = method_219(player);
         boolean var4 = player.method_24828();
         if (method_218(player)) {
            return var2;
         } else {
            if (var4 && var3.field_1351 <= 0.05) {
               var3 = new Vec3d(var3.field_1352, 0.0, var3.field_1350);
            }

            for (int var5 = 0; var5 < ticks; var5++) {
               var2 = var2.method_1019(var3);
               if (!var4) {
                  var3 = method_221(var3);
               } else {
                  var3 = new Vec3d(var3.field_1352 * 0.91, 0.0, var3.field_1350 * 0.91);
               }
            }

            return var2;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Vec3d, int) net.minecraft.util.math.Vec3d
   public static Vec3d method_217(Vec3d position, Vec3d velocity, int ticks) {
      if (position != null && velocity != null) {
         Vec3d var3 = position;
         Vec3d var4 = velocity;

         for (int var5 = 0; var5 < ticks; var5++) {
            var3 = var3.method_1019(var4);
            var4 = method_221(var4);
         }

         return var3;
      } else {
         return Vec3d.field_1353;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private static boolean method_218(PlayerEntity var0) {
      if (var0 != null && var0.method_24828()) {
         Vec3d var1 = method_219(var0);
         return var1.field_1351 <= 0.05 && var1.field_1352 * var1.field_1352 + var1.field_1350 * var1.field_1350 <= 0.0025;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d
   private static Vec3d method_219(PlayerEntity var0) {
      if (var0 == null) {
         return Vec3d.field_1353;
      } else {
         Vec3d var1 = new Vec3d(var0.method_23317() - var0.field_6014, var0.method_23318() - var0.field_6036, var0.method_23321() - var0.field_5969);
         return Double.isFinite(var1.field_1352) && Double.isFinite(var1.field_1351) && Double.isFinite(var1.field_1350) && var1.method_1027() > 1.0E-5
            ? var1
            : var0.method_18798();
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box) net.minecraft.util.math.Vec3d
   private static Vec3d method_220(Box var0) {
      return new Vec3d((var0.field_1323 + var0.field_1320) * 0.5, var0.field_1322, (var0.field_1321 + var0.field_1324) * 0.5);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private static Vec3d method_221(Vec3d var0) {
      double var1 = (var0.field_1351 - 0.08) * 0.98;
      if (var1 < -3.92) {
         var1 = -3.92;
      }

      return new Vec3d(var0.field_1352 * 0.98, var1, var0.field_1350 * 0.98);
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.world.World) boolean
   public static boolean method_222(PlayerEntity player, World world) {
      if (player != null && world != null && !player.method_5681()) {
         BlockPos var2 = player.method_24515();
         if (world.method_8320(var2.method_10074()).method_45474()) {
            return false;
         } else {
            for (Direction var4 : Type.field_11062) {
               if (world.method_8320(var2.method_10084().method_10093(var4)).method_45474()) {
                  return false;
               }
            }

            return !world.method_8320(var2.method_10086(2)).method_45474();
         }
      } else {
         return false;
      }
   }
}
