package Dev.ZWare.Client.features.pkg1.pkg3;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public interface Class8 {
   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, double) void
   void method_17(BlockPos var1, double var2);

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, double) void
   void method_18(BlockPos var1, Direction var2, double var3);

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, double, boolean) void
   default void method_19(BlockPos pos, Direction direction, double priority, boolean allowClientInstantFinish) {
      this.method_18(pos, direction, priority);
   }

   // $VF: renamed from: a () boolean
   boolean method_20();

   // $VF: renamed from: b () boolean
   boolean method_21();

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   BlockPos method_22();

   // $VF: renamed from: a () double
   double method_23();

   // $VF: renamed from: b () net.minecraft.util.math.BlockPos
   BlockPos method_24();

   // $VF: renamed from: b () double
   double method_25();

   // $VF: renamed from: c () boolean
   boolean method_26();

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   boolean method_27(BlockPos var1);

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   boolean method_28(BlockPos var1);

   // $VF: renamed from: a (boolean) void
   void method_29(boolean var1);

   // $VF: renamed from: d () boolean
   boolean method_30();

   // $VF: renamed from: e () boolean
   boolean method_31();

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class8
   static Class8 method_32() {
      return Dev.ZWare.Client.Class1.field_316 == null ? null : Dev.ZWare.Client.Class1.field_316.method_510(Class1.class);
   }
}
