package Dev.ZWare.Client.pkg1;

import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class Class3 {
   private Class3() {
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) double[]
   public static double[] method_588(PlayerEntity player) {
      if (player == null) {
         return new double[0];
      } else {
         double var1 = player.method_18381(EntityPose.field_18076);
         double var3 = player.method_18381(EntityPose.field_18081);
         double var5 = player.method_18381(EntityPose.field_18079);

         return switch (player.method_18376()) {
            case field_18077, field_18080, field_18079 -> new double[]{var5, var1, var3};
            case field_18081 -> new double[]{var3, var1, var5};
            default -> new double[]{var1, var3, var5};
         };
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d[]
   public static Vec3d[] method_589(PlayerEntity player) {
      if (player == null) {
         return new Vec3d[0];
      } else {
         Vec3d var1 = player.method_19538();
         double[] var2 = method_588(player);
         Vec3d[] var3 = new Vec3d[var2.length];

         for (int var4 = 0; var4 < var2.length; var4++) {
            var3[var4] = var1.method_1031(0.0, var2[var4], 0.0);
         }

         return var3;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Box) net.minecraft.util.math.Vec3d
   public static Vec3d method_590(PlayerEntity player, Box box) {
      if (player == null) {
         return Vec3d.field_1353;
      } else if (box == null) {
         return player.method_33571();
      } else {
         Vec3d var2 = player.method_33571();
         double var3 = Class7.method_121(var2, box);

         for (Vec3d var8 : method_589(player)) {
            double var9 = Class7.method_121(var8, box);
            if (var9 < var3) {
               var3 = var9;
               var2 = var8;
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   public static Vec3d method_591(Box box, Vec3d point) {
      if (box == null) {
         return point == null ? Vec3d.field_1353 : point;
      } else {
         return point == null
            ? box.method_1005()
            : new Vec3d(
               MathHelper.method_15350(point.field_1352, box.field_1323, box.field_1320),
               MathHelper.method_15350(point.field_1351, box.field_1322, box.field_1325),
               MathHelper.method_15350(point.field_1350, box.field_1321, box.field_1324)
            );
      }
   }
}
