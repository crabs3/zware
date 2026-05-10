package Dev.ZWare.Client.features.pkg1.pkg3;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.List;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;

public class Class1 extends Dev.ZWare.Client.features.pkg1.Class1 implements Class8 {
   // $VF: renamed from: o long
   private static final long field_2634 = System.nanoTime();
   // $VF: renamed from: p boolean
   private static final boolean field_2635 = true;
   // $VF: renamed from: q boolean
   private static final boolean field_2636 = true;
   // $VF: renamed from: r int
   private static final int field_2637 = 20;
   // $VF: renamed from: s boolean
   private static final boolean field_2638 = true;
   // $VF: renamed from: t boolean
   private static final boolean field_2639 = true;
   // $VF: renamed from: u double
   private static final double field_2640 = 0.35;
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2641 = this.a("Range", 5.14, 0.0, 7.0);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2642 = this.a("Pause While Eatting", true);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2643 = this.a("Simulate", true);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2644 = this.a("Simulate Full Silent", true);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2645 = this.a("Simulate Instant Selected Slot", false);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2646 = this.a("Hide Switch", false);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2647 = this.a("Render", true).method_683("Render");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2648 = this.a("Render Block", true).method_683("Render");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2649 = this.a("Dynamic Scaling", true).method_683("Render");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class1.Inner2> field_2650 = this.a("Render Mode", Class1.Inner2.State).method_683("Render");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2651 = this.a("Dynamic Color", true).method_683("Render");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2652 = this.a("Start Color", 255, 255, 0, 60).method_683("Render");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2653 = this.a("End Color", 255, 0, 0, 60).method_683("Render");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class1.Inner6> field_2654 = this.a("Shape Mode", Class1.Inner6.Both).method_683("Render");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2655 = this.a("Side Color", 255, 180, 255, 15).method_683("Render");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2656 = this.a("Line Color", 255, 255, 255, 60).method_683("Render");
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2657 = this.a("Debug Render Primary", false).method_683("Render");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner4
   private Class1.Inner4 field_2658;
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner4
   private Class1.Inner4 field_2659;
   // $VF: renamed from: O net.minecraft.util.math.BlockPos
   private BlockPos field_2660;
   // $VF: renamed from: P double
   private double field_2661;
   // $VF: renamed from: Q boolean
   private boolean field_2662;
   // $VF: renamed from: R boolean
   private boolean field_2663 = true;
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
   private Class1.Inner1 field_2664;
   // $VF: renamed from: T long
   private long field_2665 = Long.MIN_VALUE;
   // $VF: renamed from: U long
   private long field_2666 = Long.MIN_VALUE;

   public Class1() {
      super("Double Mine", "Allows you to mine blocks without holding a pickaxe.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2648.method_709(var1 -> this.field_2647.method_671());
      this.field_2644.method_709(var1 -> this.field_2643.method_671());
      this.field_2645.method_709(var1 -> this.field_2643.method_671() && !this.field_2644.method_671());
      this.field_2649.method_709(var1 -> this.field_2647.method_671() && this.field_2648.method_671());
      this.field_2650.method_709(var1 -> this.field_2647.method_671() && this.field_2648.method_671());
      this.field_2651.method_709(var1 -> this.field_2647.method_671() && this.field_2648.method_671());
      this.field_2652.method_709(var1 -> this.field_2647.method_671() && this.field_2648.method_671() && this.field_2651.method_671());
      this.field_2653.method_709(var1 -> this.field_2647.method_671() && this.field_2648.method_671() && this.field_2651.method_671());
      this.field_2654.method_709(var1 -> this.field_2647.method_671() && this.field_2648.method_671());
      this.field_2655
         .method_709(
            var1 -> this.field_2647.method_671() && this.field_2648.method_671() && !this.field_2651.method_671() && this.field_2654.method_671().method_1178()
         );
      this.field_2656
         .method_709(
            var1 -> this.field_2647.method_671() && this.field_2648.method_671() && !this.field_2651.method_671() && this.field_2654.method_671().method_1177()
         );
      this.field_2657.method_709(var1 -> this.field_2647.method_671());
      this.field_2661 = method_3342();
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3364();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      if (this.field_2659 != null) {
         this.field_2659.method_450();
      }

      if (this.field_2658 != null) {
         this.field_2658.method_450();
      }

      this.method_3354();
      this.method_3364();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_3321(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.field_1687 != null && c.field_1724 != null) {
         this.field_2661 = method_3342();
         if (!this.method_3362()) {
            if (this.method_20()) {
               this.field_2660 = this.field_2659.field_222;
            } else {
               this.field_2660 = null;
            }

            if (this.method_20() && this.method_3334(this.field_2659.field_222)) {
               b.a(new Dev.ZWare.Client.pkg2.pkg1.Class2.Inner2(this.field_2659.field_222, false));
               this.field_2659 = null;
            }

            if (this.field_2658 != null && this.method_3334(this.field_2658.field_222)) {
               this.field_2658.field_229 = true;
               if (!this.field_2663) {
                  this.field_2658 = null;
               }
            }

            if (this.method_21() && this.field_2658.field_227 > 10 && !this.method_26()) {
               this.field_2658.method_450();
               this.field_2658 = null;
            }

            this.method_3331();
            this.method_3332();
            this.method_3333();
            boolean var2 = !this.method_20() || !this.field_2659.method_445();
            if (this.field_2662 && var2) {
               this.method_3354();
            }
         }
      } else {
         this.method_3354();
         this.method_3364();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class15) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_3322(Dev.ZWare.Client.pkg2.pkg1.Class15 var1) {
      if (!this.method_3362()) {
         var1.a();
         this.method_18(var1.method_1033(), var1.method_1034(), 100.0);
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   private void method_3323(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      if (this.field_2647.method_671() && this.field_2648.method_671() && !g()) {
         double var2 = this.field_2661 + var1.method_1056();
         if (this.field_2658 != null) {
            this.field_2658.method_455(var1, var2, true);
         }

         if (this.field_2659 != null) {
            this.field_2659.method_455(var1, var2, false);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_3324(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var1) {
      if (var1.method_1045() instanceof PlayerActionC2SPacket var2) {
         if (var2.method_12363() == Action.field_12973) {
            BlockPos var5 = this.method_22();
            BlockPos var4 = this.method_24();
            if (var5 != null && var2.method_12362().equals(var5) || var4 != null && var2.method_12362().equals(var4)) {
               c.method_1562().method_52787(new PlayerActionC2SPacket(Action.field_12971, var2.method_12362(), var2.method_12360()));
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, double) void
   @Override
   public void method_17(BlockPos pos, double priority) {
      this.method_18(pos, Direction.field_11036, priority);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, double) void
   @Override
   public void method_18(BlockPos blockPos, Direction direction, double priority) {
      this.method_19(blockPos, direction, priority, true);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, double, boolean) void
   @Override
   public void method_19(BlockPos blockPos, Direction direction, double priority, boolean allowClientInstantFinish) {
      if (this.d() && !g() && blockPos != null) {
         if (!this.method_3362()) {
            if (!this.method_28(blockPos)) {
               BlockState var6 = c.field_1687.method_8320(blockPos);
               if (Dev.ZWare.Client.pkg1.Class13.method_414(blockPos, var6)) {
                  if (this.method_27(blockPos)) {
                     Class1.Inner8 var7 = allowClientInstantFinish ? this.method_3359(var6, blockPos, false) : null;
                     boolean var8 = var7 != null && !this.method_3345();
                     if (var8 && this.method_3346(blockPos, direction, var7)) {
                        this.field_2665 = this.method_3343();
                     } else if (!this.method_3344()) {
                        if (!this.method_20()) {
                           boolean var9 = this.field_2658 != null && !this.method_26();
                           if (var9 && this.field_2658.field_224 < priority) {
                              return;
                           }

                           this.field_2661 -= 0.1;
                           this.field_2659 = new Class1.Inner4(blockPos, direction, priority, false);
                           this.field_2659.method_446(true);
                           this.field_2666 = this.method_3343();
                           if (var9) {
                              this.field_2658.method_446(false);
                           }
                        }

                        if (!this.method_28(blockPos)) {
                           if (this.field_2658 != null
                              && this.field_2659 != null
                              && (priority >= this.field_2658.field_224 || this.method_26())
                              && this.field_2659.method_452() <= 0.8) {
                              this.field_2658 = null;
                           }

                           if (this.field_2658 == null) {
                              this.field_2658 = new Class1.Inner4(blockPos, direction, priority, true);
                              this.field_2658.method_446(false);
                              this.field_2666 = this.method_3343();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a () boolean
   @Override
   public boolean method_20() {
      return this.field_2659 != null;
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_21() {
      return this.field_2658 != null && !this.field_2658.field_229;
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   @Override
   public BlockPos method_22() {
      return this.field_2659 != null ? this.field_2659.field_222 : null;
   }

   // $VF: renamed from: c () net.minecraft.util.math.BlockPos
   public BlockPos method_3325() {
      return this.field_2660;
   }

   // $VF: renamed from: n () boolean
   public boolean method_3326() {
      return this.d() && this.field_2646.method_671() && c.field_1724 != null && this.field_2662 && this.field_2664 != null && !this.field_2664.method_1363();
   }

   // $VF: renamed from: a () int
   public int method_3327() {
      if (c.field_1724 == null) {
         return 0;
      } else if (!this.method_3326()) {
         return c.field_1724.method_31548().method_67532();
      } else {
         Dev.ZWare.Client.pkg1.Class9.Inner1 var1 = this.field_2664.method_1361();
         return var1 != null ? var1.method_1432() : this.field_2664.method_1362();
      }
   }

   // $VF: renamed from: a () net.minecraft.item.ItemStack
   public ItemStack method_3328() {
      if (c.field_1724 == null) {
         return ItemStack.field_8037;
      } else if (!this.method_3326()) {
         return c.field_1724.method_6047();
      } else {
         Dev.ZWare.Client.pkg1.Class9.Inner1 var1 = this.field_2664.method_1361();
         if (var1 != null) {
            return c.field_1724.method_31548().method_5438(var1.method_1431());
         } else {
            int var2 = this.field_2664.method_1362();
            return var2 >= 0 && var2 <= 8 ? c.field_1724.method_31548().method_5438(var2) : c.field_1724.method_6047();
         }
      }
   }

   // $VF: renamed from: a (int) net.minecraft.item.ItemStack
   public ItemStack method_3329(int slot) {
      if (c.field_1724 == null) {
         return ItemStack.field_8037;
      } else if (!this.method_3326() || slot < 0 || slot > 8) {
         return c.field_1724.method_31548().method_5438(slot);
      } else {
         return slot == this.method_3327() ? this.method_3328() : c.field_1724.method_31548().method_5438(slot);
      }
   }

   // $VF: renamed from: o () boolean
   public boolean method_3330() {
      return this.method_3326() && c.field_1724 != null && !ItemStack.method_7973(c.field_1724.method_6047(), this.method_3328());
   }

   // $VF: renamed from: a () double
   @Override
   public double method_23() {
      return this.field_2659 != null ? this.field_2659.method_452() : 0.0;
   }

   // $VF: renamed from: b () net.minecraft.util.math.BlockPos
   @Override
   public BlockPos method_24() {
      return this.field_2658 != null ? this.field_2658.field_222 : null;
   }

   // $VF: renamed from: b () double
   @Override
   public double method_25() {
      return this.field_2658 != null ? this.field_2658.method_452() : 0.0;
   }

   // $VF: renamed from: c () boolean
   @Override
   public boolean method_26() {
      return this.field_2658 != null && this.field_2658.field_229;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   @Override
   public boolean method_27(BlockPos blockPos) {
      if (!g() && blockPos != null) {
         Vec3d var2 = c.field_1724.method_33571();
         double var3 = this.field_2641.method_671() * this.field_2641.method_671();
         return var2.method_1025(this.method_3341(new Box(blockPos), var2)) <= var3;
      } else {
         return false;
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   @Override
   public boolean method_28(BlockPos blockPos) {
      return this.field_2658 != null && blockPos.equals(this.field_2658.field_222) || this.field_2659 != null && blockPos.equals(this.field_2659.field_222);
   }

   // $VF: renamed from: a (boolean) void
   @Override
   public void method_29(boolean allowRebreakLoop) {
      this.field_2663 = allowRebreakLoop;
      if (!allowRebreakLoop && this.field_2658 != null && this.field_2658.field_229) {
         this.field_2658 = null;
      }
   }

   // $VF: renamed from: n () void
   private void method_3331() {
      if (this.method_20() && this.field_2659.field_228 <= 20) {
         if (!this.field_2659.method_451()) {
            BlockState var1 = c.field_1687.method_8320(this.field_2659.field_222);
            if (this.field_2659.method_445()) {
               int var2 = this.method_3335(var1, this.field_2659.field_222);
               int var3 = c.field_1724.method_31548().method_67532();
               if (var2 != -1 && var2 != var3 && !this.field_2662) {
                  Class1.Inner7 var4 = this.method_3350(var1, this.field_2659.field_222, false);
                  if (var4 != null) {
                     var2 = var4.method_1354();
                  }

                  Class1.Inner1 var5 = var4 != null ? var4.method_1355() : null;
                  if (var5 != null && !var5.method_1363()) {
                     this.field_2664 = var5;
                     this.field_2662 = true;
                  }
               }

               if (var2 == -1 || this.method_3355(var2)) {
                  this.field_2659.field_228++;
               }
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_3332() {
      if (this.field_2658 != null) {
         BlockState var1 = c.field_1687.method_8320(this.field_2658.field_222);
         if (this.field_2658.method_445()) {
            if (!this.method_27(this.field_2658.field_222)) {
               this.field_2658 = null;
            } else {
               b.a(new Dev.ZWare.Client.pkg2.pkg1.Class2.Inner1(this.field_2658.field_222, true));
               Class1.Inner1 var2 = Class1.Inner1.method_1358();
               var2 = this.method_3351(var1);

               try {
                  this.field_2658.method_449();
               } finally {
                  this.method_3353(var2);
               }

               if (this.method_26()) {
                  c.field_1687.method_8501(this.field_2658.field_222, Blocks.field_10124.method_9564());
               }
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_3333() {
      if (this.method_20() && this.field_2659.field_228 > 20) {
         if (this.method_27(this.field_2659.field_222)) {
            this.field_2659.method_446(true);
         } else {
            this.field_2659.method_450();
            this.field_2659 = null;
         }
      }
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3334(BlockPos var1) {
      BlockState var2 = c.field_1687.method_8320(var1);
      return var2.method_26215() || !Dev.ZWare.Client.pkg1.Class13.method_414(var1, var2);
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos) int
   private int method_3335(BlockState var1, BlockPos var2) {
      int var3 = -1;
      double var4 = 0.0;

      for (int var6 = 0; var6 <= 35; var6++) {
         ItemStack var7 = c.field_1724.method_31548().method_5438(var6);
         if (!var7.method_7960()) {
            double var8 = this.method_3339(var6, var1, var2);
            if (var8 > var4) {
               var4 = var8;
               var3 = var6;
            }
         }
      }

      return var3;
   }

   // $VF: renamed from: b (net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos) int
   private int method_3336(BlockState var1, BlockPos var2) {
      int var3 = -1;
      double var4 = 0.0;

      for (int var6 = 0; var6 <= 8; var6++) {
         ItemStack var7 = c.field_1724.method_31548().method_5438(var6);
         if (!var7.method_7960()) {
            double var8 = this.method_3339(var6, var1, var2);
            if (var8 > var4) {
               var4 = var8;
               var3 = var6;
            }
         }
      }

      return var3;
   }

   // $VF: renamed from: a (int, net.minecraft.block.BlockState) double
   private double method_3337(int var1, BlockState var2) {
      double var3 = this.method_3338(var1, var2);
      if (!c.field_1724.method_24828()) {
         var3 /= 5.0;
      }

      return var3;
   }

   // $VF: renamed from: b (int, net.minecraft.block.BlockState) double
   private double method_3338(int var1, BlockState var2) {
      double var3 = c.field_1724.method_31548().method_5438(var1).method_7924(var2);
      if (var3 > 1.0) {
         ItemStack var5 = c.field_1724.method_31548().method_5438(var1);
         int var6 = Dev.ZWare.Client.pkg1.Class19.method_408(Enchantments.field_9131, var5);
         if (var6 > 0 && !var5.method_7960()) {
            var3 += var6 * var6 + 1;
         }
      }

      if (StatusEffectUtil.method_5576(c.field_1724)) {
         var3 *= 1.0F + (StatusEffectUtil.method_5575(c.field_1724) + 1) * 0.2F;
      }

      if (c.field_1724.method_6059(StatusEffects.field_5901)) {
         float var7 = switch (c.field_1724.method_6112(StatusEffects.field_5901).method_5578()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         var3 *= var7;
      }

      if (c.field_1724.method_5777(FluidTags.field_15517) && Dev.ZWare.Client.pkg1.Class19.method_413(Enchantments.field_9105, EquipmentSlot.field_6169)) {
         var3 /= 5.0;
      }

      return var3;
   }

   // $VF: renamed from: a (int, net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos) double
   private double method_3339(int var1, BlockState var2, BlockPos var3) {
      return this.method_3340(var1, var2, var3, c.field_1724.method_24828());
   }

   // $VF: renamed from: a (int, net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos, boolean) double
   private double method_3340(int var1, BlockState var2, BlockPos var3, boolean var4) {
      float var5 = var2.method_26214(c.field_1687, var3);
      if (var5 == -1.0F) {
         return 0.0;
      } else {
         ItemStack var6 = c.field_1724.method_31548().method_5438(var1);
         int var7 = var2.method_29291() && !var6.method_7951(var2) ? 100 : 30;
         double var8 = this.method_3338(var1, var2);
         if (!var4) {
            var8 /= 5.0;
         }

         return var8 / var5 / var7;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_3341(Box var1, Vec3d var2) {
      return new Vec3d(
         MathHelper.method_15350(var2.field_1352, var1.field_1323, var1.field_1320),
         MathHelper.method_15350(var2.field_1351, var1.field_1322, var1.field_1325),
         MathHelper.method_15350(var2.field_1350, var1.field_1321, var1.field_1324)
      );
   }

   // $VF: renamed from: c () double
   private static double method_3342() {
      return (System.nanoTime() - field_2634) / 5.0E7;
   }

   // $VF: renamed from: a () long
   private long method_3343() {
      return c.field_1687 != null ? c.field_1687.method_8510() : Long.MIN_VALUE;
   }

   // $VF: renamed from: p () boolean
   private boolean method_3344() {
      long var1 = this.method_3343();
      return var1 != Long.MIN_VALUE && var1 == this.field_2665;
   }

   // $VF: renamed from: q () boolean
   private boolean method_3345() {
      long var1 = this.method_3343();
      return var1 == Long.MIN_VALUE ? false : this.method_20() || var1 == this.field_2666;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner8) boolean
   private boolean method_3346(BlockPos var1, Direction var2, Class1.Inner8 var3) {
      Class1.Inner5 var4 = this.method_3356(var3.method_1507());
      if (var4 == null) {
         return false;
      } else {
         boolean var5;
         try {
            b.a(new Dev.ZWare.Client.pkg2.pkg1.Class2.Inner1(var1, false));
            this.method_3349(var1, var2, var3.method_1508());
            c.field_1687.method_8501(var1, Blocks.field_10124.method_9564());
            b.a(new Dev.ZWare.Client.pkg2.pkg1.Class2.Inner2(var1, false));
            var5 = true;
         } finally {
            this.method_3357(var4);
         }

         return var5;
      }
   }

   // $VF: renamed from: b () int
   private int method_3347() {
      return ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action) void
   private void method_3348(BlockPos var1, Direction var2, Action var3) {
      c.method_1562().method_52787(new PlayerActionC2SPacket(var3, var1, var2, this.method_3347()));
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner3) void
   private void method_3349(BlockPos var1, Direction var2, Class1.Inner3 var3) {
      this.method_3348(var1, var2, Action.field_12973);
      this.method_3348(var1, var2, Action.field_12968);
      if (var3 == Class1.Inner3.StopStartStop) {
         this.method_3348(var1, var2, Action.field_12973);
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos, boolean) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner7
   private Class1.Inner7 method_3350(BlockState var1, BlockPos var2, boolean var3) {
      int var4 = this.method_3335(var1, var2);
      Class1.Inner1 var5 = this.method_3352(var4, var3);
      if (var5 != null) {
         return new Class1.Inner7(var4, var5);
      } else {
         int var6 = this.method_3336(var1, var2);
         if (var6 != -1 && var6 != var4) {
            Class1.Inner1 var7 = this.method_3352(var6, var3);
            return var7 != null ? new Class1.Inner7(var6, var7) : null;
         } else {
            return null;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
   private Class1.Inner1 method_3351(BlockState var1) {
      int var2 = this.method_3336(var1, this.field_2658.field_222);
      return var2 < 0 ? Class1.Inner1.method_1358() : this.method_3352(var2, true);
   }

   // $VF: renamed from: a (int, boolean) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
   private Class1.Inner1 method_3352(int var1, boolean var2) {
      if (var1 < 0) {
         return Class1.Inner1.method_1358();
      } else if (c.field_1724 != null && c.field_1761 != null && c.method_1562() != null) {
         int var3 = c.field_1724.method_31548().method_67532();
         if (var1 == var3) {
            return Class1.Inner1.method_1358();
         } else if (var1 > 8) {
            Dev.ZWare.Client.pkg1.Class9.Inner1 var4 = Dev.ZWare.Client.pkg1.Class9.method_148(var1, var2);
            return var4 == null ? null : Class1.Inner1.method_1360(var4);
         } else {
            return !Dev.ZWare.Client.pkg1.Class9.method_151(var1) ? null : Class1.Inner1.method_1359(var3);
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1) void
   private void method_3353(Class1.Inner1 var1) {
      if (var1 != null && !var1.method_1363()) {
         if (var1.method_1361() != null) {
            Dev.ZWare.Client.pkg1.Class9.method_149(var1.method_1361());
         } else {
            Dev.ZWare.Client.pkg1.Class9.method_151(var1.method_1362());
         }
      }
   }

   // $VF: renamed from: q () void
   private void method_3354() {
      if (!this.field_2662) {
         this.field_2664 = null;
      } else {
         this.method_3353(this.field_2664);
         this.field_2664 = null;
         this.field_2662 = false;
      }
   }

   // $VF: renamed from: a (int) boolean
   private boolean method_3355(int var1) {
      if (var1 < 0 || c.field_1724 == null) {
         return false;
      } else {
         return var1 <= 8 ? c.field_1724.method_31548().method_67532() == var1 : this.field_2662;
      }
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner5
   private Class1.Inner5 method_3356(int var1) {
      if (var1 >= 0 && c.field_1724 != null && c.field_1761 != null) {
         int var2 = c.field_1724.method_31548().method_67532();
         if (var1 == var2) {
            return Class1.Inner5.method_1526();
         } else if (this.field_2644.method_671()) {
            return !this.method_3358(var1, var2) ? null : Class1.Inner5.method_1529(var1, var2);
         } else if (this.field_2645.method_671() && var1 <= 8 && Dev.ZWare.Client.pkg1.Class9.method_151(var1)) {
            return Class1.Inner5.method_1528(var2);
         } else {
            Class1.Inner1 var3 = this.method_3352(var1, true);
            return var3 == null ? null : Class1.Inner5.method_1527(var3);
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner5) void
   private void method_3357(Class1.Inner5 var1) {
      if (var1 != null && !var1.method_1534()) {
         if (var1.method_1530() != null) {
            this.method_3353(var1.method_1530());
         } else if (var1.method_1533()) {
            Dev.ZWare.Client.pkg1.Class9.method_151(var1.method_1532());
         } else {
            this.method_3358(var1.method_1531(), var1.method_1532());
         }
      }
   }

   // $VF: renamed from: a (int, int) boolean
   private boolean method_3358(int var1, int var2) {
      if (c.field_1724 == null || c.field_1761 == null) {
         return false;
      } else {
         return var1 >= 0 && var1 <= 35 && var2 >= 0 && var2 <= 8 ? Dev.ZWare.Client.pkg1.Class9.method_153(var1, var2, SlotActionType.field_7791) : false;
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos, boolean) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner8
   private Class1.Inner8 method_3359(BlockState var1, BlockPos var2, boolean var3) {
      int var4 = this.method_3335(var1, var2);
      if (var4 == -1) {
         return null;
      } else {
         double var5 = this.method_3340(var4, var1, var2, this.method_3363(var3));
         return !(var5 < 0.35) && this.method_3361(var4)
            ? new Class1.Inner8(var4, this.method_3360() ? Class1.Inner3.StopStart : Class1.Inner3.StopStartStop)
            : null;
      }
   }

   // $VF: renamed from: r () boolean
   private boolean method_3360() {
      return StatusEffectUtil.method_5576(c.field_1724) && StatusEffectUtil.method_5575(c.field_1724) >= 1;
   }

   // $VF: renamed from: b (int) boolean
   private boolean method_3361(int var1) {
      return c.field_1724 != null && var1 >= 0 && var1 <= 35
         ? Dev.ZWare.Client.pkg1.Class19.method_408(Enchantments.field_9131, c.field_1724.method_31548().method_5438(var1)) >= 5
         : false;
   }

   // $VF: renamed from: s () boolean
   private boolean method_3362() {
      return this.field_2642.method_671() && c.field_1724 != null && c.field_1724.method_6115();
   }

   // $VF: renamed from: b (boolean) boolean
   private boolean method_3363(boolean var1) {
      if (c.field_1724 != null && c.field_1687 != null) {
         Box var2 = c.field_1724.method_5829();
         double var3 = var2.field_1322;
         Box var5 = new Box(var2.field_1323, var3 - 0.2, var2.field_1321, var2.field_1320, var3, var2.field_1324);
         boolean var6 = false;
         int var7 = MathHelper.method_15357(var5.field_1323);
         int var8 = MathHelper.method_15357(var5.field_1322);
         int var9 = MathHelper.method_15357(var5.field_1321);
         int var10 = MathHelper.method_15357(var5.field_1320);
         int var11 = MathHelper.method_15357(var5.field_1325);
         int var12 = MathHelper.method_15357(var5.field_1324);

         for (int var13 = var7; var13 <= var10; var13++) {
            for (int var14 = var8; var14 <= var11; var14++) {
               for (int var15 = var9; var15 <= var12; var15++) {
                  BlockPos var16 = new BlockPos(var13, var14, var15);
                  BlockState var17 = c.field_1687.method_8320(var16);
                  if (var17.method_26212(c.field_1687, var16)) {
                     double var18 = var16.method_10264() + 1.0;
                     double var20 = var3 - var18;
                     if (var20 >= 0.0 && var20 < Math.abs(c.field_1724.method_18798().field_1351 * 2.0)) {
                        var6 = true;
                     }
                  }
               }
            }
         }

         return Dev.ZWare.Client.pkg4.Class9.field_164 || var6 && !var1;
      } else {
         return false;
      }
   }

   // $VF: renamed from: r () void
   private void method_3364() {
      this.field_2658 = null;
      this.field_2659 = null;
      this.field_2660 = null;
      this.field_2661 = method_3342();
      this.field_2662 = false;
      this.field_2664 = null;
      this.field_2663 = true;
      this.field_2665 = Long.MIN_VALUE;
      this.field_2666 = Long.MIN_VALUE;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, double) net.minecraft.util.math.Box
   private Box method_3365(Box var1, double var2) {
      Vec3d var4 = var1.method_1005();
      return new Box(
         MathHelper.method_16436(var2, var4.field_1352, var1.field_1323),
         MathHelper.method_16436(var2, var4.field_1351, var1.field_1322),
         MathHelper.method_16436(var2, var4.field_1350, var1.field_1321),
         MathHelper.method_16436(var2, var4.field_1352, var1.field_1320),
         MathHelper.method_16436(var2, var4.field_1351, var1.field_1325),
         MathHelper.method_16436(var2, var4.field_1350, var1.field_1324)
      );
   }

   // $VF: renamed from: a (java.awt.Color, java.awt.Color, double) java.awt.Color
   private Color method_3366(Color var1, Color var2, double var3) {
      double var5 = MathHelper.method_15350(var3, 0.0, 1.0);
      int var7 = (int)Math.round(MathHelper.method_16436(var5, var1.getRed(), var2.getRed()));
      int var8 = (int)Math.round(MathHelper.method_16436(var5, var1.getGreen(), var2.getGreen()));
      int var9 = (int)Math.round(MathHelper.method_16436(var5, var1.getBlue(), var2.getBlue()));
      int var10 = (int)Math.round(MathHelper.method_16436(var5, var1.getAlpha(), var2.getAlpha()));
      return new Color(var7, var8, var9, var10);
   }

   // $VF: renamed from: a (java.awt.Color) java.awt.Color
   private Color method_3367(Color var1) {
      return !this.field_2651.method_671() ? this.field_2656.method_671() : new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), 255);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, java.awt.Color, java.awt.Color) void
   private void method_3368(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, Color var3, Color var4) {
      if (this.field_2654.method_671().method_1178()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var2, var3);
      }

      if (this.field_2654.method_671().method_1177()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var2, var4, 1.0);
      }
   }

   private record Inner1(Dev.ZWare.Client.pkg1.Class9.Inner1 a5, int a6, boolean a7) {
      // $VF: renamed from: a5 Dev.ZWare.Client.pkg1.Class9$Inner1
      private final Dev.ZWare.Client.pkg1.Class9.Inner1 field_842;
      // $VF: renamed from: a6 int
      private final int field_843;
      // $VF: renamed from: a7 boolean
      private final boolean field_844;

      private Inner1(Dev.ZWare.Client.pkg1.Class9.Inner1 a5, int a6, boolean a7) {
         this.field_842 = a5;
         this.field_843 = a6;
         this.field_844 = a7;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      private static Class1.Inner1 method_1358() {
         return new Class1.Inner1(null, -1, true);
      }

      // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      private static Class1.Inner1 method_1359(int var0) {
         return new Class1.Inner1(null, var0, false);
      }

      // $VF: renamed from: a (Dev.ZWare.Client.pkg1.Class9$Inner1) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      private static Class1.Inner1 method_1360(Dev.ZWare.Client.pkg1.Class9.Inner1 var0) {
         return new Class1.Inner1(var0, -1, false);
      }

      // $VF: renamed from: a5 () Dev.ZWare.Client.pkg1.Class9$Inner1
      public Dev.ZWare.Client.pkg1.Class9.Inner1 method_1361() {
         return this.field_842;
      }

      // $VF: renamed from: a6 () int
      public int method_1362() {
         return this.field_843;
      }

      // $VF: renamed from: a7 () boolean
      public boolean method_1363() {
         return this.field_844;
      }
   }

   public static enum Inner2 {
      State,
      // $VF: renamed from: Box Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner2
      field_682;
   }

   private static enum Inner3 {
      StopStart,
      StopStartStop;
   }

   private class Inner4 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      private final BlockPos field_222;
      // $VF: renamed from: b net.minecraft.util.math.Direction
      private final Direction field_223;
      // $VF: renamed from: c double
      private final double field_224;
      // $VF: renamed from: d boolean
      private final boolean field_225;
      // $VF: renamed from: e boolean
      private boolean field_226;
      // $VF: renamed from: f int
      private int field_227;
      // $VF: renamed from: g int
      private int field_228;
      // $VF: renamed from: h boolean
      private boolean field_229;
      // $VF: renamed from: i boolean
      private boolean field_230;
      // $VF: renamed from: j double
      private double field_231;
      // $VF: renamed from: k double
      private double field_232;
      // $VF: renamed from: l double
      private double field_233 = Double.NaN;

      private Inner4(BlockPos var2, Direction var3, double var4, boolean var6) {
         this.field_222 = var2;
         this.field_223 = var3;
         this.field_224 = var4;
         this.field_225 = var6;
      }

      // $VF: renamed from: a () boolean
      private boolean method_445() {
         BlockState var1 = Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8320(this.field_222);
         if (!Dev.ZWare.Client.pkg1.Class13.method_414(this.field_222, var1)) {
            return false;
         } else {
            double var2 = this.method_454();
            double var4 = this.field_225 ? 0.7 : 1.0 - var2 / 2.0;
            return this.method_452() >= var4 || this.field_227 > 0;
         }
      }

      // $VF: renamed from: a (boolean) void
      private void method_446(boolean var1) {
         BlockState var2 = Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8320(this.field_222);
         Class1.Inner8 var3 = Class1.this.field_2643.method_671() ? Class1.this.method_3359(var2, this.field_222, this.field_225) : null;
         this.field_228 = 0;
         this.field_227 = 0;
         this.field_231 = Class1.this.field_2661;
         this.field_232 = 0.0;
         this.field_233 = Double.NaN;
         this.field_230 = false;
         if (var1 && Class1.this.method_26()) {
            Class1.this.field_2658 = null;
         }

         if (var3 != null) {
            Class1.Inner5 var4 = Class1.this.method_3356(var3.method_1507());
            if (var4 != null) {
               this.field_230 = true;

               try {
                  this.method_448(var3.method_1508());
               } finally {
                  Class1.this.method_3357(var4);
               }
            } else {
               this.method_447();
            }
         } else {
            this.method_447();
         }

         this.field_226 = true;
      }

      // $VF: renamed from: a () void
      private void method_447() {
         this.method_460(Action.field_12973);
         this.method_460(Action.field_12968);
         this.method_460(Action.field_12973);
         this.method_460(Action.field_12973);
         this.method_460(Action.field_12968);
         this.method_460(Action.field_12973);
      }

      // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner3) void
      private void method_448(Class1.Inner3 var1) {
         Class1.this.method_3349(this.field_222, this.field_223, var1);
      }

      // $VF: renamed from: b () void
      private void method_449() {
         this.method_460(Action.field_12973);
         this.field_227++;
      }

      // $VF: renamed from: c () void
      private void method_450() {
         Dev.ZWare.Client.features.Class1.field_1019.method_1562().method_52787(new PlayerActionC2SPacket(Action.field_12971, this.field_222, this.field_223));
      }

      // $VF: renamed from: b () boolean
      private boolean method_451() {
         return this.field_230;
      }

      // $VF: renamed from: a () double
      private double method_452() {
         return this.method_453(Class1.this.field_2661);
      }

      // $VF: renamed from: a (double) double
      private double method_453(double var1) {
         BlockState var3 = Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8320(this.field_222);
         int var4 = Class1.this.method_3336(var3, this.field_222);
         int var5 = var4 != -1 ? var4 : Dev.ZWare.Client.features.Class1.field_1019.field_1724.method_31548().method_67532();
         boolean var6 = Class1.this.method_3363(this.field_225);
         double var7 = Class1.this.method_3340(var5, var3, this.field_222, var6);
         return Math.min(var7 * (var1 - this.field_231), 1.0);
      }

      // $VF: renamed from: b () double
      private double method_454() {
         return this.method_453(this.field_231 + 1.0);
      }

      // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, double, boolean) void
      private void method_455(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, double var2, boolean var4) {
         double var5 = MathHelper.method_15350(var4 ? this.method_453(var2) * 1.4285714285714286 : this.method_453(var2), 0.0, 1.0);
         double var7 = this.method_459(var5, var2);
         VoxelShape var9 = Dev.ZWare.Client.features.Class1.field_1019
            .field_1687
            .method_8320(this.field_222)
            .method_26218(Dev.ZWare.Client.features.Class1.field_1019.field_1687, this.field_222);
         List var10 = this.method_457(var9);
         if (var10.isEmpty()) {
            var10 = List.of(new Box(0.0, 0.0, 0.0, 1.0, 1.0, 1.0));
         }

         Color var11 = this.method_458(var4, var7);
         Color var12 = Class1.this.method_3367(var11);

         for (Box var14 : var10) {
            Class1.this.method_3368(var1, this.method_456(var14, var7).method_996(this.field_222), var11, var12);
         }
      }

      // $VF: renamed from: a (net.minecraft.util.math.Box, double) net.minecraft.util.math.Box
      private Box method_456(Box var1, double var2) {
         return Class1.this.method_3365(var1, var2);
      }

      // $VF: renamed from: a (net.minecraft.util.shape.VoxelShape) java.util.List
      private List<Box> method_457(VoxelShape var1) {
         return Class1.this.field_2650.method_671() != Class1.Inner2.field_682 && var1 != null && !var1.method_1110()
            ? var1.method_1090()
            : List.of(new Box(0.0, 0.0, 0.0, 1.0, 1.0, 1.0));
      }

      // $VF: renamed from: a (boolean, double) java.awt.Color
      private Color method_458(boolean var1, double var2) {
         if (Class1.this.field_2657.method_671() && var1) {
            return new Color(255, 165, 0, 40);
         } else {
            return Class1.this.field_2651.method_671()
               ? Class1.this.method_3366(Class1.this.field_2652.method_671(), Class1.this.field_2653.method_671(), var2)
               : Class1.this.field_2655.method_671();
         }
      }

      // $VF: renamed from: a (double, double) double
      private double method_459(double var1, double var3) {
         if (!Class1.this.field_2649.method_671()) {
            this.field_232 = var1;
            this.field_233 = var3;
            return this.field_232;
         } else if (Double.isNaN(this.field_233)) {
            this.field_232 = var1;
            this.field_233 = var3;
            return this.field_232;
         } else {
            double var5 = Math.max(0.0, var3 - this.field_233);
            this.field_233 = var3;
            if (var1 > this.field_232) {
               double var7 = 0.22;
               this.field_232 = Math.min(var1, this.field_232 + var5 * var7);
            } else {
               double var9 = 0.18;
               this.field_232 = Math.max(var1, this.field_232 - var5 * var9);
            }

            return this.field_232;
         }
      }

      // $VF: renamed from: a (net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action) void
      private void method_460(Action var1) {
         Class1.this.method_3348(this.field_222, this.field_223, var1);
      }
   }

   private record Inner5(Class1.Inner1 aY, int aZ, int a0, boolean a1, boolean a2) {
      // $VF: renamed from: aY Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      private final Class1.Inner1 field_995;
      // $VF: renamed from: aZ int
      private final int field_996;
      // $VF: renamed from: a0 int
      private final int field_997;
      // $VF: renamed from: a1 boolean
      private final boolean field_998;
      // $VF: renamed from: a2 boolean
      private final boolean field_999;

      private Inner5(Class1.Inner1 aY, int aZ, int a0, boolean a1, boolean a2) {
         this.field_995 = aY;
         this.field_996 = aZ;
         this.field_997 = a0;
         this.field_998 = a1;
         this.field_999 = a2;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner5
      private static Class1.Inner5 method_1526() {
         return new Class1.Inner5(null, -1, -1, false, true);
      }

      // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner5
      private static Class1.Inner5 method_1527(Class1.Inner1 var0) {
         return new Class1.Inner5(var0, -1, -1, false, var0.method_1363());
      }

      // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner5
      private static Class1.Inner5 method_1528(int var0) {
         return new Class1.Inner5(null, -1, var0, true, false);
      }

      // $VF: renamed from: a (int, int) Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner5
      private static Class1.Inner5 method_1529(int var0, int var1) {
         return new Class1.Inner5(null, var0, var1, false, false);
      }

      // $VF: renamed from: aY () Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      public Class1.Inner1 method_1530() {
         return this.field_995;
      }

      // $VF: renamed from: aZ () int
      public int method_1531() {
         return this.field_996;
      }

      // $VF: renamed from: a0 () int
      public int method_1532() {
         return this.field_997;
      }

      // $VF: renamed from: a1 () boolean
      public boolean method_1533() {
         return this.field_998;
      }

      // $VF: renamed from: a2 () boolean
      public boolean method_1534() {
         return this.field_999;
      }
   }

   public static enum Inner6 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1177() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1178() {
         return this == Sides || this == Both;
      }
   }

   private record Inner7(int a8, Class1.Inner1 a9) {
      // $VF: renamed from: a8 int
      private final int field_838;
      // $VF: renamed from: a9 Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      private final Class1.Inner1 field_839;

      private Inner7(int a8, Class1.Inner1 a9) {
         this.field_838 = a8;
         this.field_839 = a9;
      }

      // $VF: renamed from: a8 () int
      public int method_1354() {
         return this.field_838;
      }

      // $VF: renamed from: a9 () Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner1
      public Class1.Inner1 method_1355() {
         return this.field_839;
      }
   }

   private record Inner8(int a3, Class1.Inner3 a4) {
      // $VF: renamed from: a3 int
      private final int field_976;
      // $VF: renamed from: a4 Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner3
      private final Class1.Inner3 field_977;

      private Inner8(int a3, Class1.Inner3 a4) {
         this.field_976 = a3;
         this.field_977 = a4;
      }

      // $VF: renamed from: a3 () int
      public int method_1507() {
         return this.field_976;
      }

      // $VF: renamed from: a4 () Dev.ZWare.Client.features.pkg1.pkg3.Class1$Inner3
      public Class1.Inner3 method_1508() {
         return this.field_977;
      }
   }
}
