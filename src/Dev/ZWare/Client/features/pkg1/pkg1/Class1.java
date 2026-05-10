package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class1 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2339 = 4.5;

   public Class1() {
      super("Air Place", "places held blocks in air with block placement manager", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2978(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null && c.field_1690.field_1904.method_1434()) {
         Class1.Inner1 var2 = this.method_2979();
         if (var2 != null) {
            BlockState var3 = c.field_1687.method_8320(var2.method_1348());
            if (Dev.ZWare.Client.Class1.field_301.method_915(var2.method_1348(), var3, var2.method_1346(), var2.method_1347())) {
               try {
                  Dev.ZWare.Client.Class1.field_301.method_921(var2.method_1346(), var2.method_1348(), var3, var2.method_1347());
               } finally {
                  Dev.ZWare.Client.Class1.field_301.method_929();
               }
            }
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg1.Class1$Inner1
   private Class1.Inner1 method_2979() {
      ItemStack var1 = c.field_1724.method_6047();
      if (var1.method_7909() instanceof BlockItem) {
         return this.method_2980(var1.method_7909(), Hand.field_5808);
      } else {
         ItemStack var2 = c.field_1724.method_6079();
         return var2.method_7909() instanceof BlockItem ? this.method_2980(var2.method_7909(), Hand.field_5810) : null;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.Hand) Dev.ZWare.Client.features.pkg1.pkg1.Class1$Inner1
   private Class1.Inner1 method_2980(Item var1, Hand var2) {
      BlockPos var3 = this.method_2981();
      if (var3 == null) {
         return null;
      } else if (c.field_1724.method_33571().method_1025(Vec3d.method_24953(var3)) > 20.25) {
         return null;
      } else {
         BlockState var4 = c.field_1687.method_8320(var3);
         return !Dev.ZWare.Client.Class1.field_301.method_928(var1, var3, var4) ? null : new Class1.Inner1(var1, var2, var3.method_10062());
      }
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   private BlockPos method_2981() {
      if (c.field_1765 instanceof BlockHitResult var4) {
         BlockPos var6 = var4.method_17777();
         return c.field_1687.method_8320(var6).method_45474() ? var6 : var6.method_10093(var4.method_17780());
      } else {
         Vec3d var1 = c.field_1724.method_33571();
         Vec3d var5 = c.field_1724.method_5828(1.0F);
         Vec3d var3 = var1.method_1019(var5.method_1021(4.5));
         if (c.field_1765 != null && c.field_1765.method_17783() == Type.field_1331) {
            var3 = c.field_1765.method_17784();
         }

         return BlockPos.method_49638(var3);
      }
   }

   private record Inner1(Item bP, Hand bQ, BlockPos bR) {
      // $VF: renamed from: bP net.minecraft.item.Item
      private final Item field_829;
      // $VF: renamed from: bQ net.minecraft.util.Hand
      private final Hand field_830;
      // $VF: renamed from: bR net.minecraft.util.math.BlockPos
      private final BlockPos field_831;

      private Inner1(Item bP, Hand bQ, BlockPos bR) {
         this.field_829 = bP;
         this.field_830 = bQ;
         this.field_831 = bR;
      }

      // $VF: renamed from: bP () net.minecraft.item.Item
      public Item method_1346() {
         return this.field_829;
      }

      // $VF: renamed from: bQ () net.minecraft.util.Hand
      public Hand method_1347() {
         return this.field_830;
      }

      // $VF: renamed from: bR () net.minecraft.util.math.BlockPos
      public BlockPos method_1348() {
         return this.field_831;
      }
   }
}
