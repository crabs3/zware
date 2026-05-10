package Dev.ZWare.Client.pkg2.pkg1;

import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;

public class Class9 extends Dev.ZWare.Client.pkg2.Class1 {
   // $VF: renamed from: b net.minecraft.entity.MovementType
   private final MovementType field_537;
   // $VF: renamed from: c double
   private double field_538;
   // $VF: renamed from: d double
   private double field_539;
   // $VF: renamed from: e double
   private double field_540;

   public Class9(MovementType movementType, Vec3d movement) {
      this.field_537 = movementType;
      this.field_538 = movement.field_1352;
      this.field_539 = movement.field_1351;
      this.field_540 = movement.field_1350;
   }

   // $VF: renamed from: a () net.minecraft.entity.MovementType
   public MovementType method_1024() {
      return this.field_537;
   }

   // $VF: renamed from: a () double
   public double method_1025() {
      return this.field_538;
   }

   // $VF: renamed from: b () double
   public double method_1026() {
      return this.field_539;
   }

   // $VF: renamed from: c () double
   public double method_1027() {
      return this.field_540;
   }

   // $VF: renamed from: a (double, double, double) void
   public void method_1028(double x, double y, double z) {
      this.field_538 = x;
      this.field_539 = y;
      this.field_540 = z;
   }

   // $VF: renamed from: a (double, double) void
   public void method_1029(double x, double z) {
      this.field_538 = x;
      this.field_540 = z;
   }

   // $VF: renamed from: a () net.minecraft.util.math.Vec3d
   public Vec3d method_1030() {
      return new Vec3d(this.field_538, this.field_539, this.field_540);
   }
}
