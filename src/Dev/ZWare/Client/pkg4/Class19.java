package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.Direction.Type;
import org.jetbrains.annotations.Nullable;

public class Class19 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f int
   private final int field_1022 = 8;
   // $VF: renamed from: g java.util.List
   private final List<Class19.Inner1> field_1023 = new ArrayList<>();
   // $VF: renamed from: h net.minecraft.util.math.BlockPos.Mutable
   private final Mutable field_1024 = new Mutable();

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class4) void
   @iFT13zrx_wTXP
   private void method_1563(Dev.ZWare.Client.pkg2.pkg1.Class4 var1) {
      this.field_1023.clear();

      for (int var2 = -8; var2 < 8; var2++) {
         for (int var3 = -8; var3 < 8; var3++) {
            for (int var4 = -8; var4 < 8; var4++) {
               this.field_1024.method_10102(c.field_1724.method_23317() + var2, c.field_1724.method_23318() + var3, c.field_1724.method_23321() + var4);
               Class19.Inner1 var5 = this.method_1564(this.field_1024);
               if (var5 != null) {
                  this.field_1023.add(var5);
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) Dev.ZWare.Client.pkg4.Class19$Inner1
   @Nullable
   public Class19.Inner1 method_1564(BlockPos pos) {
      if (c.field_1687.method_8320(pos).method_26204() != Blocks.field_10124) {
         return null;
      } else {
         Class19.Inner2 var2 = Class19.Inner2.BEDROCK;

         for (Direction var4 : Type.field_11062) {
            Block var5 = c.field_1687.method_8320(pos.method_10093(var4)).method_26204();
            if (var5 == Blocks.field_10540) {
               var2 = Class19.Inner2.UNSAFE;
            } else if (var5 != Blocks.field_9987) {
               return null;
            }
         }

         return new Class19.Inner1(pos, var2);
      }
   }

   record Inner1(BlockPos cT, Class19.Inner2 cU) {
      // $VF: renamed from: cT net.minecraft.util.math.BlockPos
      private final BlockPos field_755;
      // $VF: renamed from: cU Dev.ZWare.Client.pkg4.Class19$Inner2
      private final Class19.Inner2 field_756;

      Inner1(BlockPos cT, Class19.Inner2 cU) {
         this.field_755 = cT;
         this.field_756 = cU;
      }

      // $VF: renamed from: cT () net.minecraft.util.math.BlockPos
      public BlockPos method_1269() {
         return this.field_755;
      }

      // $VF: renamed from: cU () Dev.ZWare.Client.pkg4.Class19$Inner2
      public Class19.Inner2 method_1270() {
         return this.field_756;
      }
   }

   private static enum Inner2 {
      BEDROCK,
      UNSAFE;
   }
}
