package Dev.ZWare.Client.pkg1;

import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class Class14 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c double[]
   private static final double[] field_268 = new double[]{0.05, 0.95};
   // $VF: renamed from: d double[]
   private static final double[] field_269 = new double[]{0.05, 0.95, 0.99};

   private Class14() {
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, double) net.minecraft.util.hit.BlockHitResult
   public static BlockHitResult method_507(BlockPos blockPos, double range) {
      if (a.field_1724 != null && a.field_1687 != null && blockPos != null) {
         Vec3d var3 = a.field_1724.method_33571();
         Direction var4 = Direction.field_11036;
         double var5 = Double.MAX_VALUE;

         for (double var10 : field_268) {
            for (double var15 : field_269) {
               for (double var20 : field_268) {
                  Vec3d var22 = new Vec3d(blockPos.method_10263() + var10, blockPos.method_10264() + var15, blockPos.method_10260() + var20);
                  if (!(var3.method_1025(var22) > range * range)) {
                     BlockHitResult var23 = a.field_1687
                        .method_17742(new RaycastContext(var3, var22, ShapeType.field_17558, FluidHandling.field_1348, a.field_1724));
                     if (var23.method_17783() == Type.field_1332 && var23.method_17777().equals(blockPos)) {
                        double var24 = var3.method_1025(var23.method_17784());
                        if (var24 < var5) {
                           var5 = var24;
                           var4 = var23.method_17780();
                        }
                     }
                  }
               }
            }
         }

         Vec3d var26 = blockPos.method_46558().method_1031(var4.method_10148() * 0.5, var4.method_10164() * 0.5, var4.method_10165() * 0.5);
         return new BlockHitResult(var26, var4, blockPos, false);
      } else {
         return null;
      }
   }
}
