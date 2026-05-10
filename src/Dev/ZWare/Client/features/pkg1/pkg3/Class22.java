package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class22 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_2873 = 800;
   // $VF: renamed from: p int
   private static final int field_2874 = 400;
   // $VF: renamed from: q double
   private static final double field_2875 = 3.5;
   // $VF: renamed from: r double
   private static final double field_2876 = 3.0;
   // $VF: renamed from: s double
   private static final double field_2877 = 0.35;
   // $VF: renamed from: t double
   private static final double field_2878 = 0.1;
   // $VF: renamed from: u double
   private static final double field_2879 = Math.pow(0.99, 0.1);
   // $VF: renamed from: v double
   private static final double field_2880 = 0.003;
   // $VF: renamed from: w long
   private static final long field_2881 = 30000L;
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2882 = this.a("Pearls", true);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2883 = this.a("Shulkers", true);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2884 = this.a("Ignore Own Shulkers", true);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2885 = this.a("Offset Distance", 2.0, 0.5, 5.0);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2886 = this.a("Pause While Eatting", true);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2887 = this.a("Ignore Phase", true);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2888 = this.a("Render", true);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2889 = this.a("Fade Time", 0.3, 0.0, 1.0);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class22.Inner1> field_2890 = this.a("Render Mode", Class22.Inner1.Both);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2891 = this.a("Side Color", new Color(197, 137, 232, 10));
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2892 = this.a("Line Color", new Color(197, 137, 232, 255));
   // $VF: renamed from: I java.util.Map
   private final Map<Integer, BlockPos> field_2893 = new HashMap<>();
   // $VF: renamed from: J java.util.Map
   private final Map<BlockPos, Long> field_2894 = new HashMap<>();
   // $VF: renamed from: K java.util.Map
   private final Map<BlockPos, Long> field_2895 = new HashMap<>();
   // $VF: renamed from: L int
   private int field_2896;

   public Class22() {
      super("Blocker", "blocks niggas pearling at you or pigs tryna get a regear", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2884.method_709(var1 -> this.field_2883.method_671());
      this.field_2885.method_709(var1 -> this.field_2882.method_671());
      this.field_2887.method_709(var1 -> this.field_2882.method_671());
      this.field_2891.method_709(var1 -> this.field_2888.method_671() && this.field_2890.method_671().method_1184());
      this.field_2892.method_709(var1 -> this.field_2888.method_671() && this.field_2890.method_671().method_1185());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2893.clear();
      this.field_2894.clear();
      this.field_2895.clear();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2893.clear();
      this.field_2894.clear();
      this.field_2895.clear();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3597(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null) {
         if (!this.field_2886.method_671() || !c.field_1724.method_6115()) {
            this.method_3607();
            this.field_2896 = 0;
            if (this.field_2883.method_671() && this.field_2896 < 1) {
               this.method_3601();
            }

            if (this.field_2882.method_671() && this.field_2896 < 1) {
               this.method_3600();
            }

            this.field_2893.entrySet().removeIf(var0 -> {
               Entity var1x = c.field_1687.method_8469(var0.getKey());
               return var1x == null || var1x.method_31481() || var1x.method_7325();
            });
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_3598(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var1) {
      if (!g() && this.field_2884.method_671()) {
         if (var1.method_1045() instanceof PlayerInteractBlockC2SPacket var2) {
            ItemStack var9 = var2.method_12546() == Hand.field_5810 ? c.field_1724.method_6079() : c.field_1724.method_6047();
            if (var9.method_7909() instanceof BlockItem var4 && var4.method_7711() instanceof ShulkerBoxBlock) {
               BlockHitResult var10 = var2.method_12543();
               BlockPos var6 = var10.method_17777();
               BlockState var7 = c.field_1687.method_8320(var6);
               BlockPos var8 = var7.method_45474() ? var6.method_10062() : var6.method_10093(var10.method_17780()).method_10062();
               this.field_2895.put(var8, System.currentTimeMillis());
            }
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   private void method_3599(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      if (this.field_2888.method_671()) {
         double var2 = this.field_2889.method_671();
         long var4 = System.currentTimeMillis();
         long var6 = Math.max(1L, (long)(var2 * 1000.0));
         Iterator var8 = this.field_2894.entrySet().iterator();

         while (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            long var10 = var4 - (Long)var9.getValue();
            if (var10 > var6) {
               var8.remove();
            } else {
               double var12 = MathHelper.method_15350((double)var10 / var6, 0.0, 1.0);
               double var14 = 1.0 - var12 * var12;
               Box var16 = new Box((BlockPos)var9.getKey());
               if (this.field_2890.method_671().method_1184()) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var16, this.method_3609(this.field_2891.method_671(), var14));
               }

               if (this.field_2890.method_671().method_1185()) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var16, this.method_3609(this.field_2892.method_671(), var14), 1.0);
               }
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_3600() {
      for (Entity var2 : c.field_1687.method_18112()) {
         if (this.field_2896 >= 1) {
            break;
         }

         if (var2 instanceof EnderPearlEntity var3 && !var3.method_7325()) {
            Entity var4 = var3.method_24921();
            if (var4 instanceof PlayerEntity var5
               && var4 != c.field_1724
               && (Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var5))) {
               int var6 = var3.method_5628();
               if (!this.field_2893.containsKey(var6)) {
                  if (this.field_2887.method_671() && this.method_3605(var3, var5)) {
                     this.field_2893.put(var6, var5.method_24515().method_10062());
                  } else {
                     BlockPos var7 = this.method_3603(var3, var5);
                     if (var7 != null) {
                        if (this.method_3602(var7)) {
                           this.field_2893.put(var6, var7);
                           this.field_2894.put(var7.method_10062(), System.currentTimeMillis());
                           this.field_2896++;
                        } else if (!c.field_1687.method_8320(var7).method_26215()) {
                           this.field_2893.put(var6, var7);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_3601() {
      for (PlayerEntity var2 : c.field_1687.method_18456()) {
         if (this.field_2896 >= 1) {
            break;
         }

         if (var2 != c.field_1724
            && var2.method_5805()
            && !var2.method_7325()
            && (Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var2))) {
            BlockPos var3 = this.method_3604(var2);
            if (var3 != null && this.method_3602(var3)) {
               this.field_2894.put(var3.method_10062(), System.currentTimeMillis());
               this.field_2896++;
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3602(BlockPos var1) {
      if (!Dev.ZWare.Client.Class1.field_301.method_914(var1, c.field_1687.method_8320(var1), Items.field_8281)) {
         return false;
      } else {
         boolean var2;
         try {
            var2 = Dev.ZWare.Client.Class1.field_301.method_918(Items.field_8281, var1);
         } finally {
            Dev.ZWare.Client.Class1.field_301.method_929();
         }

         return var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.projectile.thrown.EnderPearlEntity, net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.BlockPos
   private BlockPos method_3603(EnderPearlEntity var1, PlayerEntity var2) {
      Vec3d var3 = var1.method_19538();
      Vec3d var4 = var1.method_18798();
      boolean var5 = var2.method_5739(c.field_1724) <= 7.0F;

      for (int var6 = 0; var6 < 400; var6++) {
         BlockPos var7 = BlockPos.method_49638(var3);
         double var8 = this.method_3608();
         boolean var10 = Dev.ZWare.Client.pkg1.Class7.method_121(c.field_1724.method_33571(), new Box(var7)) <= var8 * var8;
         if (var10 && Dev.ZWare.Client.Class1.field_301.method_926(Items.field_8281, var7)) {
            if (!var5) {
               return var7.method_10062();
            }

            Vec3d var11 = var4.method_1027() > 1.0E-6 ? var4.method_1029() : Vec3d.field_1353;
            BlockPos var12 = BlockPos.method_49638(var3.method_1019(var11.method_1021(this.field_2885.method_671())));
            if (Dev.ZWare.Client.Class1.field_301.method_926(Items.field_8281, var12)) {
               return var12.method_10062();
            }

            return var7.method_10062();
         }

         if (!c.field_1687.method_8320(var7).method_26215()) {
            break;
         }

         var3 = var3.method_1019(var4.method_1021(0.1));
         var4 = new Vec3d(var4.field_1352 * field_2879, var4.field_1351 * field_2879 - 0.003, var4.field_1350 * field_2879);
         if (var3.field_1351 < c.field_1687.method_31607() - 5) {
            break;
         }
      }

      return null;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.BlockPos
   private BlockPos method_3604(PlayerEntity var1) {
      BlockPos var2 = var1.method_24515();
      BlockPos var3 = var2.method_10069(-2, -1, -2);
      BlockPos var4 = var2.method_10069(2, 1, 2);

      for (BlockPos var6 : BlockPos.method_10097(var3, var4)) {
         BlockState var7 = c.field_1687.method_8320(var6);
         if (var7.method_26204() instanceof ShulkerBoxBlock) {
            BlockPos var8 = var6.method_10062();
            if (!this.field_2884.method_671() || !this.field_2895.containsKey(var8)) {
               BlockPos var9 = var6.method_10093((Direction)var7.method_11654(ShulkerBoxBlock.field_11496)).method_10062();
               double var10 = this.method_3608();
               if (!(Dev.ZWare.Client.pkg1.Class7.method_121(c.field_1724.method_33571(), new Box(var9)) > var10 * var10)
                  && Dev.ZWare.Client.Class1.field_301.method_926(Items.field_8281, var9)) {
                  return var9;
               }
            }
         }
      }

      return null;
   }

   // $VF: renamed from: a (net.minecraft.entity.projectile.thrown.EnderPearlEntity, net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_3605(EnderPearlEntity var1, PlayerEntity var2) {
      Class22.Inner2 var3 = this.method_3606(var1);
      if (var3 == null) {
         return false;
      } else if (var1.method_19538().method_1022(var3.method_487()) > 3.5) {
         return false;
      } else {
         return var2.method_19538().method_1022(var3.method_487()) > 3.0 ? false : var2.method_5829().method_1014(0.35).method_994(new Box(var3.method_488()));
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.projectile.thrown.EnderPearlEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class22$Inner2
   private Class22.Inner2 method_3606(EnderPearlEntity var1) {
      Vec3d var2 = var1.method_19538();
      Vec3d var3 = var1.method_18798();

      for (int var4 = 0; var4 < 800; var4++) {
         BlockPos var5 = BlockPos.method_49638(var2);
         if (!c.field_1687.method_8320(var5).method_26215()) {
            return new Class22.Inner2(var2, var5.method_10062());
         }

         var2 = var2.method_1019(var3.method_1021(0.1));
         var3 = new Vec3d(var3.field_1352 * field_2879, var3.field_1351 * field_2879 - 0.003, var3.field_1350 * field_2879);
         if (var2.field_1351 < c.field_1687.method_31607() - 5) {
            break;
         }
      }

      return null;
   }

   // $VF: renamed from: p () void
   private void method_3607() {
      long var1 = System.currentTimeMillis();
      this.field_2895
         .entrySet()
         .removeIf(var2 -> var1 - var2.getValue() > 30000L || !(c.field_1687.method_8320(var2.getKey()).method_26204() instanceof ShulkerBoxBlock));
   }

   // $VF: renamed from: a () double
   private double method_3608() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   // $VF: renamed from: a (java.awt.Color, double) java.awt.Color
   private Color method_3609(Color var1, double var2) {
      int var4 = Math.max(0, Math.min(255, (int)Math.round(var1.getAlpha() * var2)));
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var4);
   }

   static enum Inner1 {
      Both,
      Sides,
      Lines;

      // $VF: renamed from: a () boolean
      boolean method_1184() {
         return this == Both || this == Sides;
      }

      // $VF: renamed from: b () boolean
      boolean method_1185() {
         return this == Both || this == Lines;
      }
   }

   static class Inner2 {
      // $VF: renamed from: a net.minecraft.util.math.Vec3d
      final Vec3d field_258;
      // $VF: renamed from: b net.minecraft.util.math.BlockPos
      final BlockPos field_259;

      Inner2(Vec3d var1, BlockPos var2) {
         this.field_258 = var1;
         this.field_259 = var2;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      Vec3d method_487() {
         return this.field_258;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_488() {
         return this.field_259;
      }
   }
}
