package Dev.ZWare.Client.features.pkg1.pkg6;

import Dev.ZWare.Client.mixin.Class18;
import Dev.ZWare.Client.pkg2.pkg1.Class16;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.block.BlockState;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public class Class1 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg6.Class1
   private static Class1 field_2580;
   // $VF: renamed from: p double
   private static final double field_2581 = Dev.ZWare.Client.features.pkg1.pkg4.Class7.Inner1.field_608.method_1120();
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2582 = this.a("Auto Jump", true).method_683("Movement");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2583 = this.a("Restart", true).method_683("Movement");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2584 = this.a("Restart Delay", 7, 0, 20).method_683("Movement");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2585 = this.a("Sprint", true).method_683("Movement");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2586 = this.a("Y Motion", false).method_683("Movement");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2587 = this.a("Y Motion Value", 0.08, -0.5, 0.5).method_683("Movement");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2588 = this.a("Y Motion Start BPS", 20.0, 0.0, 80.0).method_683("Movement");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class1.Inner1> field_2589 = this.a("Yaw Lock", Class1.Inner1.Smart).method_683("Rotation");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2590 = this.a("Pitch", 85.0, 0.0, 90.0).method_683("Rotation");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2591 = this.a("Yaw", 0.0, 0.0, 360.0).method_683("Rotation");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2592 = this.a("Obstacle Pass", true).method_683("Obstacle");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2593 = this.a("Obstacle Look ahead", 2, 1, 4).method_683("Obstacle");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2594 = this.a("Obstacle Pass Ticks", 8, 2, 20).method_683("Obstacle");
   // $VF: renamed from: D boolean
   private boolean field_2595;
   // $VF: renamed from: E int
   private int field_2596;
   // $VF: renamed from: F double
   private double field_2597;
   // $VF: renamed from: G boolean
   private boolean field_2598;
   // $VF: renamed from: H boolean
   private boolean field_2599;
   // $VF: renamed from: I boolean
   private boolean field_2600;
   // $VF: renamed from: J boolean
   private boolean field_2601;
   // $VF: renamed from: K boolean
   private boolean field_2602;
   // $VF: renamed from: L boolean
   private boolean field_2603;
   // $VF: renamed from: M boolean
   private boolean field_2604;
   // $VF: renamed from: N int
   private int field_2605;
   // $VF: renamed from: O int
   private int field_2606;
   // $VF: renamed from: P boolean
   private boolean field_2607;
   // $VF: renamed from: Q float
   private float field_2608;
   // $VF: renamed from: R float
   private float field_2609;
   // $VF: renamed from: S float
   private float field_2610;

   public Class1() {
      super("Bounce", "boing boing boing", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, true, false, false);
      field_2580 = this;
      this.field_2584.method_709(var1 -> this.field_2583.method_671());
      this.field_2587.method_709(var1 -> this.field_2586.method_671());
      this.field_2588.method_709(var1 -> this.field_2586.method_671());
      this.field_2591.method_709(var1 -> this.field_2589.method_671() == Class1.Inner1.Simple);
      this.field_2593.method_709(var1 -> this.field_2592.method_671());
      this.field_2594.method_709(var1 -> this.field_2592.method_671());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class1
   public static Class1 method_3257() {
      Class1 var0 = field_2580;
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         var0 = Dev.ZWare.Client.Class1.field_316.method_510(Class1.class);
      }

      return var0 != null && var0.d() ? var0 : null;
   }

   // $VF: renamed from: a () boolean
   public static boolean method_3258() {
      Class1 var0 = method_3257();
      return var0 != null && var0.method_3266();
   }

   // $VF: renamed from: n () void
   public static void method_3259() {
      Class1 var0 = method_3257();
      if (var0 != null) {
         var0.method_3267();
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2595 = false;
      this.field_2596 = this.field_2584.method_671();
      this.field_2598 = false;
      this.field_2597 = (Double)c.field_1690.method_42454().method_41753();
      this.field_2604 = false;
      this.field_2605 = 0;
      this.field_2606 = 0;
      this.field_2607 = false;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2595 = false;
      this.field_2596 = this.field_2584.method_671();
      this.method_3289();
      this.method_3290();
      this.method_3298();
      this.method_3273();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3260(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         this.field_2595 = false;
         this.field_2596 = this.field_2584.method_671();
         this.method_3290();
         this.method_3298();
         this.method_3273();
      } else {
         this.field_2607 = false;
         if (!this.method_3265()) {
            this.field_2595 = false;
            this.field_2596 = this.field_2584.method_671();
            this.method_3289();
            this.method_3290();
            this.method_3298();
            this.method_3273();
         } else {
            float var2 = this.method_3274();
            if (this.field_2585.method_671()) {
               c.field_1724.method_5728(true);
               this.method_3295(true);
            } else if (this.field_2603) {
               this.method_3295(false);
            }

            if (this.method_3275(var2)) {
               this.method_3276(var2);
            } else {
               if (c.field_1690.field_1903.method_1434() && !c.field_1724.method_6128()) {
                  this.method_3264();
               }

               if (!this.field_2583.method_671() && this.field_2595 && c.field_1724.method_6128()) {
                  this.field_2595 = false;
                  this.field_2596 = this.field_2584.method_671();
               }

               if (!this.field_2595) {
                  if (!this.field_2585.method_671() && !this.field_2598 && this.field_2597 != 0.0) {
                     c.field_1690.method_42454().method_41748(0.0);
                     this.field_2598 = true;
                  }

                  if (this.field_2585.method_671()) {
                     this.method_3298();
                  }

                  if (this.field_2582.method_671()) {
                     this.method_3292(true);
                  } else if (this.field_2600) {
                     this.method_3292(false);
                  }

                  this.method_3291(true);
                  this.method_3270(var2, this.field_2590.method_671().floatValue());
                  this.method_3269();
               } else {
                  if (this.field_2600) {
                     this.method_3292(false);
                  }

                  if (this.field_2599) {
                     this.method_3291(false);
                  }
               }

               if (!this.field_2585.method_671()) {
                  c.field_1724.method_5728(!c.field_1724.method_6128() || c.field_1724.method_24828());
               }

               if (this.field_2595 && this.field_2583.method_671()) {
                  if (this.field_2596 > 0) {
                     this.field_2596--;
                  } else {
                     this.method_3264();
                     this.field_2595 = false;
                     this.field_2596 = this.field_2584.method_671();
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3261(Class16.Inner1 var1) {
      if (!g()) {
         if (var1.method_1045() instanceof PlayerPositionLookS2CPacket) {
            this.field_2595 = true;
            this.field_2596 = this.field_2584.method_671();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner1) void
   @iFT13zrx_wTXP(
      a = -200
   )
   private void method_3262(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner1 var1) {
      this.method_3273();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_3263(Class16.Inner3 var1) {
      if (!g() && !this.field_2585.method_671()) {
         if (var1.method_1045() instanceof ClientCommandC2SPacket var2 && var2.method_12365() == Mode.field_12982) {
            c.field_1724.method_5728(true);
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_3264() {
      if (c.method_1562() != null && c.field_1724 != null) {
         c.method_1562().method_52787(new ClientCommandC2SPacket(c.field_1724, Mode.field_12982));
         c.field_1724.method_23669();
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_3265() {
      ItemStack var1 = c.field_1724.method_6118(EquipmentSlot.field_6174);
      return !c.field_1724.method_31549().field_7479
         && !c.field_1724.method_5765()
         && !c.field_1724.method_6101()
         && var1.method_31574(Items.field_8833)
         && var1.method_7919() < var1.method_7936() - 1;
   }

   // $VF: renamed from: c () boolean
   private boolean method_3266() {
      return !g() && this.method_3265();
   }

   // $VF: renamed from: p () void
   private void method_3267() {
      if (this.method_3266() && c.field_1724 != null && c.field_1724.field_3913 != null) {
         boolean var1 = this.field_2599;
         boolean var2 = false;
         boolean var3 = this.field_2601;
         boolean var4 = this.field_2602;
         boolean var5 = this.field_2600;
         boolean var6 = false;
         boolean var7 = this.field_2603;
         c.field_1724.field_3913.field_54155 = new PlayerInput(var1, var2, var3, var4, var5, var6, var7);
         float var8 = method_3297(var3, var4);
         float var9 = method_3297(var1, var2);
         float var10 = MathHelper.method_15355(var8 * var8 + var9 * var9);
         ((Class18)c.field_1724.field_3913).zware$setMovementVector(var10 > 0.001F ? new Vec2f(var8 / var10, var9 / var10) : Vec2f.field_1340);
      }
   }

   // $VF: renamed from: a (float) void
   private void method_3268(float var1) {
      c.field_1724.method_36456(var1);
      c.field_1724.field_6241 = var1;
   }

   // $VF: renamed from: q () void
   private void method_3269() {
      if (this.field_2586.method_671() && c.field_1724 != null && c.field_1724.method_6128() && !c.field_1724.method_24828()) {
         Vec3d var1 = c.field_1724.method_18798();
         double var2 = Math.hypot(var1.field_1352, var1.field_1350) * 20.0;
         if (!(var2 < this.field_2588.method_671())) {
            double var4 = this.field_2587.method_671();
            if (!(var1.field_1351 >= var4)) {
               c.field_1724.method_18800(var1.field_1352, var4, var1.field_1350);
            }
         }
      }
   }

   // $VF: renamed from: a (float, float) void
   private void method_3270(float var1, float var2) {
      if (!this.method_3271()) {
         this.method_3268(var1);
         c.field_1724.method_36457(var2);
         this.method_3273();
      } else {
         this.method_3272(var1, var2);
         Dev.ZWare.Client.Class1.field_298.method_325(var1, var2, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("Bounce", field_2581));
      }
   }

   // $VF: renamed from: n () boolean
   private boolean method_3271() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3369();
      return var1 != null && var1.method_3372();
   }

   // $VF: renamed from: b (float, float) void
   private void method_3272(float var1, float var2) {
      if (!this.field_2607) {
         this.field_2608 = c.field_1724.method_36454();
         this.field_2609 = c.field_1724.field_6241;
         this.field_2610 = c.field_1724.method_36455();
      }

      this.field_2607 = true;
      this.method_3268(var1);
      c.field_1724.method_36457(var2);
   }

   // $VF: renamed from: r () void
   private void method_3273() {
      if (this.field_2607 && c.field_1724 != null) {
         c.field_1724.method_36456(this.field_2608);
         c.field_1724.field_6241 = this.field_2609;
         c.field_1724.method_36457(this.field_2610);
         this.field_2607 = false;
      }
   }

   // $VF: renamed from: a () float
   private float method_3274() {
      return switch ((Class1.Inner1)this.field_2589.method_671()) {
         case Smart -> Math.round((c.field_1724.method_36454() + 1.0F) / 45.0F) * 45.0F;
         case Simple -> this.field_2591.method_671().floatValue();
         case None -> c.field_1724.method_36454();
      };
   }

   // $VF: renamed from: a (float) boolean
   private boolean method_3275(float var1) {
      if (!this.field_2592.method_671()) {
         this.method_3289();
         return false;
      } else if (!c.field_1724.method_24828() && !c.field_1724.field_5976 && !this.field_2604) {
         return false;
      } else {
         int[] var2 = this.method_3282(var1);
         if (var2[0] == 0 && var2[1] == 0) {
            this.method_3289();
            return false;
         } else {
            BlockPos var3 = this.method_3284();
            boolean var4 = this.method_3277(var3, var2[0], var2[1]);
            if (!this.field_2604) {
               if (!var4) {
                  return false;
               } else {
                  int var6 = this.method_3278(var3, var2[0], var2[1]);
                  if (var6 == 0) {
                     return false;
                  } else {
                     this.field_2604 = true;
                     this.field_2606 = var6;
                     this.field_2605 = this.field_2594.method_671();
                     this.field_2595 = false;
                     this.field_2596 = this.field_2584.method_671();
                     return true;
                  }
               }
            } else if (!var4) {
               this.method_3289();
               return false;
            } else {
               this.field_2605--;
               if (this.field_2605 <= 0 || !this.method_3280(var3, var2[0], var2[1], this.field_2606)) {
                  int var5 = this.method_3278(var3, var2[0], var2[1]);
                  if (var5 == 0) {
                     this.method_3289();
                     return false;
                  }

                  this.field_2606 = var5;
                  this.field_2605 = this.field_2594.method_671();
               }

               return true;
            }
         }
      }
   }

   // $VF: renamed from: b (float) void
   private void method_3276(float var1) {
      if (this.field_2600) {
         this.method_3292(false);
      }

      if (this.field_2599) {
         this.method_3291(false);
      }

      if (this.field_2601) {
         this.method_3293(false);
      }

      if (this.field_2602) {
         this.method_3294(false);
      }

      this.method_3270(var1, 0.0F);
      int[] var2 = this.method_3282(var1);
      BlockPos var3 = this.method_3284();
      boolean var4 = this.method_3281(var3, var2[0], var2[1], this.field_2606);
      if (this.field_2606 < 0) {
         this.method_3293(true);
      } else if (this.field_2606 > 0) {
         this.method_3294(true);
      }

      if (var4) {
         this.method_3291(true);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, int, int) boolean
   private boolean method_3277(BlockPos var1, int var2, int var3) {
      for (int var4 = 1; var4 <= this.field_2593.method_671(); var4++) {
         if (!this.method_3285(var1.method_10069(var2 * var4, 0, var3 * var4))) {
            return true;
         }
      }

      return c.field_1724.field_5976;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, int, int) int
   private int method_3278(BlockPos var1, int var2, int var3) {
      int var4 = this.method_3279(var1, var2, var3, -1);
      int var5 = this.method_3279(var1, var2, var3, 1);
      if (var4 <= 0 && var5 <= 0) {
         return 0;
      } else {
         boolean var6 = var4 >= var5;
         if (var6 && var4 > 0) {
            return -1;
         } else if (var5 > 0) {
            return 1;
         } else {
            return var4 > 0 ? -1 : 0;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, int, int, int) int
   private int method_3279(BlockPos var1, int var2, int var3, int var4) {
      int[] var5 = this.method_3283(var2, var3, var4);
      BlockPos var6 = var1.method_10069(var5[0], 0, var5[1]);
      if (!this.method_3285(var6)) {
         return -1;
      } else {
         byte var7 = 3;

         for (int var8 = 1; var8 <= this.field_2593.method_671(); var8++) {
            BlockPos var9 = var1.method_10069(var5[0] + var2 * var8, 0, var5[1] + var3 * var8);
            if (!this.method_3285(var9)) {
               break;
            }

            var7 += 2;
         }

         return var7;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, int, int, int) boolean
   private boolean method_3280(BlockPos var1, int var2, int var3, int var4) {
      int[] var5 = this.method_3283(var2, var3, var4);
      return this.method_3285(var1.method_10069(var5[0], 0, var5[1]));
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos, int, int, int) boolean
   private boolean method_3281(BlockPos var1, int var2, int var3, int var4) {
      int[] var5 = this.method_3283(var2, var3, var4);
      return this.method_3285(var1.method_10069(var5[0] + var2, 0, var5[1] + var3));
   }

   // $VF: renamed from: a (float) int[]
   private int[] method_3282(float var1) {
      int var2 = (int)Math.floor(this.method_3288(var1) * 8.0F / 360.0F + 0.5) & 7;

      return switch (var2) {
         case 0 -> new int[]{0, 1};
         case 1 -> new int[]{-1, 1};
         case 2 -> new int[]{-1, 0};
         case 3 -> new int[]{-1, -1};
         case 4 -> new int[]{0, -1};
         case 5 -> new int[]{1, -1};
         case 6 -> new int[]{1, 0};
         case 7 -> new int[]{1, 1};
         default -> new int[]{0, 0};
      };
   }

   // $VF: renamed from: a (int, int, int) int[]
   private int[] method_3283(int var1, int var2, int var3) {
      int var5 = -var1;
      return var3 < 0 ? new int[]{var2, var5} : new int[]{-var2, -var5};
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   private BlockPos method_3284() {
      return BlockPos.method_49637(c.field_1724.method_23317(), c.field_1724.method_5829().field_1322 + 0.05, c.field_1724.method_23321());
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3285(BlockPos var1) {
      return this.method_3286(var1) && this.method_3286(var1.method_10084()) && this.method_3287(var1.method_10074());
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3286(BlockPos var1) {
      BlockState var2 = c.field_1687.method_8320(var1);
      return var2.method_26220(c.field_1687, var1).method_1110();
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3287(BlockPos var1) {
      BlockState var2 = c.field_1687.method_8320(var1);
      return !var2.method_26220(c.field_1687, var1).method_1110();
   }

   // $VF: renamed from: a (float) float
   private float method_3288(float var1) {
      float var2 = var1 % 360.0F;
      if (var2 >= 180.0F) {
         var2 -= 360.0F;
      }

      if (var2 < -180.0F) {
         var2 += 360.0F;
      }

      return var2;
   }

   // $VF: renamed from: s () void
   private void method_3289() {
      this.field_2604 = false;
      this.field_2605 = 0;
      this.field_2606 = 0;
      if (this.field_2601) {
         this.method_3293(false);
      }

      if (this.field_2602) {
         this.method_3294(false);
      }

      if (this.field_2603) {
         this.method_3295(false);
      }
   }

   // $VF: renamed from: t () void
   private void method_3290() {
      if (this.field_2599) {
         this.method_3291(false);
      }

      if (this.field_2600) {
         this.method_3292(false);
      }

      if (this.field_2601) {
         this.method_3293(false);
      }

      if (this.field_2602) {
         this.method_3294(false);
      }

      if (this.field_2603) {
         this.method_3295(false);
      }
   }

   // $VF: renamed from: a (boolean) void
   private void method_3291(boolean var1) {
      this.method_3296(c.field_1690.field_1894, var1);
      this.field_2599 = var1;
   }

   // $VF: renamed from: d (boolean) void
   private void method_3292(boolean var1) {
      this.method_3296(c.field_1690.field_1903, var1);
      this.field_2600 = var1;
   }

   // $VF: renamed from: e (boolean) void
   private void method_3293(boolean var1) {
      this.method_3296(c.field_1690.field_1913, var1);
      this.field_2601 = var1;
   }

   // $VF: renamed from: f (boolean) void
   private void method_3294(boolean var1) {
      this.method_3296(c.field_1690.field_1849, var1);
      this.field_2602 = var1;
   }

   // $VF: renamed from: g (boolean) void
   private void method_3295(boolean var1) {
      this.method_3296(c.field_1690.field_1867, var1);
      this.field_2603 = var1;
   }

   // $VF: renamed from: a (net.minecraft.client.option.KeyBinding, boolean) void
   private void method_3296(KeyBinding var1, boolean var2) {
      var1.method_23481(var2);
   }

   // $VF: renamed from: a (boolean, boolean) float
   private static float method_3297(boolean var0, boolean var1) {
      return (var0 ? 1.0F : 0.0F) - (var1 ? 1.0F : 0.0F);
   }

   // $VF: renamed from: u () void
   private void method_3298() {
      if (this.field_2598) {
         c.field_1690.method_42454().method_41748(this.field_2597);
         this.field_2598 = false;
      }
   }

   private static enum Inner1 {
      Smart,
      Simple,
      None;
   }
}
