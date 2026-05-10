package Dev.ZWare.Client.pkg2.pkg1;

import net.minecraft.util.math.BlockPos;

public abstract class Class2 extends Dev.ZWare.Client.pkg2.Class1 {
   // $VF: renamed from: b net.minecraft.util.math.BlockPos
   private final BlockPos field_550;
   // $VF: renamed from: c boolean
   private final boolean field_551;

   protected Class2(BlockPos blockPos, boolean rebreak) {
      this.field_550 = blockPos;
      this.field_551 = rebreak;
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   public BlockPos method_1040() {
      return this.field_550;
   }

   // $VF: renamed from: b () boolean
   public boolean method_1041() {
      return this.field_551;
   }

   public static class Inner1 extends Class2 {
      public Inner1(BlockPos blockPos, boolean rebreak) {
         super(blockPos, rebreak);
      }
   }

   public static class Inner2 extends Class2 {
      public Inner2(BlockPos blockPos, boolean rebreak) {
         super(blockPos, rebreak);
      }
   }
}
