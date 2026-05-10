package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.math.Direction.Type;

public class Class5 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_2470 = 40;
   // $VF: renamed from: p double
   private static final double field_2471 = 3.5;
   // $VF: renamed from: q double
   private static final double field_2472 = 9.0;
   // $VF: renamed from: r double
   private static final double field_2473 = 1.5;
   // $VF: renamed from: s int
   private static final int field_2474 = 2;
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_2475 = this.a("Block", Blocks.field_10540).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class5.Inner5> field_2476 = this.a("Target Priority", Class5.Inner5.ClosestAngle).method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2477 = this.a("Target Range", 14.0, 1.0, 32.0).method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2478 = this.a("Pause While Eatting", true).method_683("General");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2479 = this.a("Trap Swimmers", true).method_683("General");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2480 = this.a("Trap Elytra", true).method_683("General");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class5.Inner1> field_2481 = this.a("Trap Mode", Class5.Inner1.Compact).method_683("General");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2482 = this.a("Face First", true).method_683("General");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2483 = this.a("Face Front Lead Blocks", 2, 0, 6).method_683("General");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2484 = this.a("Trap Logout Spots", false).method_683("Logout");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2485 = this.a("Mine Logout Obstructions", true).method_683("Logout");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2486 = this.a("Render", true).method_683("Render");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class5.Inner6> field_2487 = this.a("Shape Mode", Class5.Inner6.Both).method_683("Render");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2488 = this.a("Placement Color", 0, 200, 255, 35).method_683("Render");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2489 = this.a("Predict Color", 255, 140, 0, 35).method_683("Render");
   // $VF: renamed from: I java.util.Map
   private final Map<UUID, Integer> field_2490 = new HashMap<>();
   // $VF: renamed from: J java.util.List
   private final List<BlockPos> field_2491 = new ArrayList<>();
   // $VF: renamed from: K boolean
   private boolean field_2492 = true;
   // $VF: renamed from: L long
   private long field_2493;
   // $VF: renamed from: M net.minecraft.util.math.BlockPos
   private BlockPos field_2494;
   // $VF: renamed from: N net.minecraft.util.math.Direction.Axis
   private Axis field_2495;
   // $VF: renamed from: O net.minecraft.util.math.Direction.Axis
   private Axis field_2496;
   // $VF: renamed from: P net.minecraft.util.math.Direction.Axis
   private Axis field_2497;
   // $VF: renamed from: Q int
   private int field_2498;
   // $VF: renamed from: R int
   private int field_2499;
   // $VF: renamed from: S int
   private int field_2500;
   // $VF: renamed from: T java.util.UUID
   private UUID field_2501;
   // $VF: renamed from: U net.minecraft.entity.player.PlayerEntity
   private PlayerEntity field_2502;
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg1.pkg3.Class5$Inner3
   private Class5.Inner3 field_2503;
   // $VF: renamed from: W net.minecraft.util.math.Vec3d
   private Vec3d field_2504;

   public Class5() {
      super("Auto Trap", "Traps players in a box to stop move.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2483.method_709(var1 -> this.field_2482.method_671());
      this.field_2485.method_709(var1 -> this.field_2484.method_671());
      this.field_2487.method_709(var1 -> this.field_2486.method_671());
      this.field_2488.method_709(var1 -> this.field_2486.method_671());
      this.field_2489.method_709(var1 -> this.field_2486.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2502 = null;
      this.field_2503 = null;
      this.field_2491.clear();
      this.field_2504 = null;
      this.field_2490.clear();
      this.method_3152();
      this.field_2493 = System.currentTimeMillis();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2502 = null;
      this.field_2503 = null;
      this.field_2491.clear();
      this.field_2504 = null;
      this.field_2490.clear();
      this.method_3152();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3150(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g()) {
         if (var1.method_1045() instanceof PlaySoundS2CPacket var2) {
            if (var2.method_11894().comp_349() == SoundEvents.field_14702) {
               Vec3d var6 = new Vec3d(var2.method_11890(), var2.method_11889(), var2.method_11893());

               for (PlayerEntity var5 : c.field_1687.method_18456()) {
                  if (var5 != null && var5.method_5805() && !var5.method_31481() && var5.method_19538().method_1025(var6) < 9.0) {
                     this.field_2490.put(var5.method_5667(), 40);
                     break;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3151(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         this.field_2502 = null;
         this.field_2503 = null;
         this.field_2491.clear();
         this.field_2504 = null;
         this.field_2490.clear();
         this.method_3152();
      } else {
         this.method_3153();
         this.field_2491.clear();
         this.field_2504 = null;
         if (this.field_2502 != null && this.method_3156(this.field_2502)) {
            this.field_2502 = null;
            this.method_3152();
         }

         if (this.field_2502 == null) {
            this.field_2502 = this.method_3154();
            if (this.field_2502 != null) {
               this.field_2503 = null;
               this.method_3152();
            }
         }

         if (this.field_2502 == null) {
            this.method_3152();
            this.field_2503 = this.field_2484.method_671() ? this.method_3155() : null;
            if (this.field_2503 != null) {
               if (!this.field_2478.method_671() || !c.field_1724.method_6115()) {
                  this.method_3165(this.field_2503);
               }
            }
         } else {
            this.field_2503 = null;
            if (this.field_2501 != null && !this.field_2501.equals(this.field_2502.method_5667())) {
               this.method_3152();
            }

            if (!this.field_2480.method_671() && this.field_2501 != null) {
               this.method_3152();
            }

            if (this.field_2480.method_671() && !this.field_2502.method_6128() && this.field_2501 != null) {
               this.method_3152();
            }

            if (!this.field_2478.method_671() || !c.field_1724.method_6115()) {
               Set var2;
               if (this.field_2480.method_671() && this.field_2502.method_6128()) {
                  if (!this.field_2492 && System.currentTimeMillis() - this.field_2493 > 500L) {
                     this.method_3152();
                  }

                  var2 = this.method_3172(this.field_2502);
               } else if (this.field_2479.method_671() && this.field_2502.method_5681()) {
                  var2 = this.method_3171(this.field_2502);
               } else if (this.field_2502.method_20448()) {
                  var2 = this.method_3170(this.field_2502);
               } else {
                  var2 = this.method_3169(this.field_2502);
               }

               ArrayList var3 = new ArrayList();
               double var4 = this.method_3191();
               double var6 = var4 * var4;
               Vec3d var8 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);

               for (BlockPos var10 : var2) {
                  if (var8.method_1025(Vec3d.method_24953(var10)) <= var6) {
                     var3.add(var10.method_10062());
                  }
               }

               if (!var3.isEmpty()) {
                  this.field_2491.addAll(var3);
                  Vec3d var11 = this.method_3173(this.field_2502);
                  this.field_2504 = var11;
                  if (this.field_2502.method_6128()) {
                     var3.sort(Comparator.comparingDouble(var1x -> Vec3d.method_24953(var1x).method_1025(var11)));
                  } else if (this.field_2502.method_5681()) {
                     var3.sort(Comparator.comparingDouble(var1x -> Vec3d.method_24953(var1x).method_1025(var11)));
                  } else {
                     this.method_3181(this.field_2502, var3, var11);
                  }

                  if (this.field_2482.method_671() && this.field_2502.method_6128()) {
                     BlockPos var12 = this.method_3183(this.field_2502, var3);
                     if (var12 != null && var3.remove(var12)) {
                        var3.add(0, var12);
                     }
                  }

                  if (this.field_2502.method_6128() && var8.method_1025(var11) > 12.25) {
                     if (this.field_2492) {
                        this.method_3152();
                     }
                  } else {
                     if (this.field_2502.method_6128()) {
                        this.field_2492 = false;
                     }

                     this.method_3162(var3);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2486.method_671() && !g() && (this.field_2502 != null || this.field_2503 != null)) {
         if (this.field_2502 != null && this.field_2504 != null) {
            Box var2 = new Box(
               this.field_2504.field_1352 - 0.1,
               this.field_2504.field_1351 - 0.1,
               this.field_2504.field_1350 - 0.1,
               this.field_2504.field_1352 + 0.1,
               this.field_2504.field_1351 + 0.1,
               this.field_2504.field_1350 + 0.1
            );
            this.method_3190(event, var2, this.field_2489.method_671());
         }

         for (BlockPos var3 : this.field_2491) {
            if (this.method_3163(var3)) {
               this.method_3190(event, new Box(var3), this.field_2488.method_671());
            }
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_2502 != null) {
         return this.field_2502.method_5477().getString();
      } else {
         return this.field_2503 == null ? null : this.field_2503.method_1410() + " [Logout]";
      }
   }

   // $VF: renamed from: n () void
   private void method_3152() {
      this.field_2492 = true;
      this.field_2494 = null;
      this.field_2495 = null;
      this.field_2496 = null;
      this.field_2497 = null;
      this.field_2498 = 0;
      this.field_2499 = 0;
      this.field_2500 = 0;
      this.field_2501 = null;
   }

   // $VF: renamed from: o () void
   private void method_3153() {
      if (!this.field_2490.isEmpty()) {
         this.field_2490.entrySet().removeIf(var0 -> var0.getValue() == null || var0.getValue() <= 1);

         for (Entry var2 : this.field_2490.entrySet()) {
            var2.setValue((Integer)var2.getValue() - 1);
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_3154() {
      PlayerEntity var1 = null;
      double var2 = Double.POSITIVE_INFINITY;

      for (PlayerEntity var5 : c.field_1687.method_18456()) {
         if (this.method_3158(var5)) {
            double var6 = this.method_3159(var5);
            if (var6 < var2) {
               var2 = var6;
               var1 = var5;
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class5$Inner3
   private Class5.Inner3 method_3155() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class16 var1 = Dev.ZWare.Client.Class1.field_316 == null
         ? null
         : Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg5.Class16.class);
      if (var1 != null && !var1.e()) {
         Class5.Inner3 var2 = null;
         double var3 = Double.POSITIVE_INFINITY;

         for (Dev.ZWare.Client.features.pkg1.pkg5.Class16.Inner1 var6 : var1.method_2712()) {
            if (this.method_3157(var6)) {
               double var7 = this.method_3160(var6.method_1546());
               if (var7 < var3) {
                  var3 = var7;
                  var2 = new Class5.Inner3(var6.method_1544(), var6.method_1545(), var6.method_1546(), var6.method_1547(), var6.method_1548());
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_3156(PlayerEntity var1) {
      return !this.method_3158(var1);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner1) boolean
   private boolean method_3157(Dev.ZWare.Client.features.pkg1.pkg5.Class16.Inner1 var1) {
      if (var1 != null && var1.method_1546() != null) {
         if (var1.method_1545() != null && Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_376(var1.method_1545())) {
            return false;
         } else {
            double var2 = this.field_2477.method_671() * this.field_2477.method_671();
            Vec3d var4 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
            return var4.method_1025(var1.method_1546()) <= var2;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_3158(PlayerEntity var1) {
      if (var1 == null || var1 == c.field_1724 || var1 == c.field_1719) {
         return false;
      } else if (!var1.method_5805() || var1.method_31481() || var1.method_7325() || var1.method_68878()) {
         return false;
      } else if (Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_377(var1)) {
         return false;
      } else {
         double var2 = this.field_2477.method_671() * this.field_2477.method_671();
         Vec3d var4 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
         return var4.method_1025(var1.method_19538()) <= var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) double
   private double method_3159(PlayerEntity var1) {
      return switch ((Class5.Inner5)this.field_2476.method_671()) {
         case ClosestAngle -> {
            float[] var2 = Dev.ZWare.Client.Class1.field_298.method_332(var1.method_33571());
            double var3 = Math.abs(MathHelper.method_15393(var2[0] - c.field_1724.method_36454()));
            double var5 = Math.abs(var2[1] - c.field_1724.method_36455());
            yield var3 + var5 * 0.5 + c.field_1724.method_5858(var1) * 0.01;
         }
         case ClosestDistance -> c.field_1724.method_5858(var1);
      };
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) double
   private double method_3160(Vec3d var1) {
      if (var1 == null) {
         return Double.POSITIVE_INFINITY;
      } else {
         return switch ((Class5.Inner5)this.field_2476.method_671()) {
            case ClosestAngle -> {
               float[] var8 = Dev.ZWare.Client.Class1.field_298.method_332(var1);
               double var3 = Math.abs(MathHelper.method_15393(var8[0] - c.field_1724.method_36454()));
               double var5 = Math.abs(var8[1] - c.field_1724.method_36455());
               Vec3d var7 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
               yield var3 + var5 * 0.5 + var7.method_1025(var1) * 0.01;
            }
            case ClosestDistance -> {
               Vec3d var2 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
               yield var2.method_1025(var1);
            }
         };
      }
   }

   // $VF: renamed from: a () net.minecraft.block.Block
   private Block method_3161() {
      Block var1 = this.field_2475.method_671();
      return var1 != null && var1 != Blocks.field_10124 ? var1 : null;
   }

   // $VF: renamed from: a (java.util.List) void
   private void method_3162(List<BlockPos> var1) {
      if (!var1.isEmpty() && Dev.ZWare.Client.Class1.field_301 != null) {
         Block var2 = this.method_3161();
         if (var2 != null) {
            ArrayList var3 = new ArrayList();

            for (BlockPos var5 : var1) {
               if (this.method_3164(var2, var5)) {
                  var3.add(var5.method_10062());
               }
            }

            if (!var3.isEmpty()) {
               if (Dev.ZWare.Client.Class1.field_301.method_916(var3, var2.method_8389())) {
                  int var10 = 0;

                  try {
                     for (BlockPos var6 : var3) {
                        if (Dev.ZWare.Client.Class1.field_301.method_919(var2, var6)) {
                           var10++;
                        }
                     }
                  } finally {
                     Dev.ZWare.Client.Class1.field_301.method_929();
                  }

                  if (var10 > 0) {
                     this.field_2493 = System.currentTimeMillis();
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3163(BlockPos var1) {
      Block var2 = this.method_3161();
      return var2 != null && this.method_3164(var2, var1);
   }

   // $VF: renamed from: a (net.minecraft.block.Block, net.minecraft.util.math.BlockPos) boolean
   private boolean method_3164(Block var1, BlockPos var2) {
      if (var1 == null || var2 == null || g()) {
         return false;
      } else if (!Dev.ZWare.Client.pkg1.Class13.method_415(var2, true)) {
         return false;
      } else {
         double var3 = this.method_3191();
         Vec3d var5 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
         return var5.method_1025(Vec3d.method_24953(var2)) > var3 * var3
            ? false
            : Dev.ZWare.Client.Class1.field_301 != null && Dev.ZWare.Client.Class1.field_301.method_926(var1.method_8389(), var2);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class5$Inner3) void
   private void method_3165(Class5.Inner3 var1) {
      Class5.Inner4 var2 = this.method_3166(var1);
      if (var2 != null) {
         this.field_2491.addAll(var2.method_1286());
         if (this.field_2485.method_671()) {
            this.method_3167(var2.method_1287());
         }

         if (!var2.method_1288().isEmpty()) {
            this.method_3162(var2.method_1288());
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class5$Inner3) Dev.ZWare.Client.features.pkg1.pkg3.Class5$Inner4
   private Class5.Inner4 method_3166(Class5.Inner3 var1) {
      if (var1 != null && c.field_1687 != null) {
         BlockPos var2 = BlockPos.method_49638(var1.method_1411());
         int var3 = var2.method_10263();
         int var4 = var2.method_10264();
         int var5 = var2.method_10260();
         int var6 = var1.method_1412() >= 2.5 ? 3 : 2;
         LinkedHashSet var7 = new LinkedHashSet();
         LinkedHashSet var8 = new LinkedHashSet();

         for (int var9 = -1; var9 <= 1; var9++) {
            for (int var10 = -1; var10 <= 1; var10++) {
               var7.add(new BlockPos(var3 + var9, var4 - 1, var5 + var10));
            }
         }

         for (int var16 = 0; var16 < var6; var16++) {
            for (int var18 = -2; var18 <= 2; var18++) {
               for (int var11 = -2; var11 <= 2; var11++) {
                  int var12 = Math.max(Math.abs(var18), Math.abs(var11));
                  if (var12 == 2 && (Math.abs(var18) != 2 || Math.abs(var11) != 2)) {
                     var7.add(new BlockPos(var3 + var18, var4 + var16, var5 + var11));
                  }
               }
            }
         }

         int var17 = var4 + var6;

         for (int var19 = -1; var19 <= 1; var19++) {
            for (int var22 = -1; var22 <= 1; var22++) {
               var7.add(new BlockPos(var3 + var19, var17, var5 + var22));
            }
         }

         for (int var20 = 0; var20 < var6; var20++) {
            for (int var23 = -1; var23 <= 1; var23++) {
               for (int var25 = -1; var25 <= 1; var25++) {
                  var8.add(new BlockPos(var3 + var23, var4 + var20, var5 + var25));
               }
            }
         }

         LinkedHashSet var21 = new LinkedHashSet();
         ArrayList var24 = new ArrayList();
         ArrayList var26 = new ArrayList();

         for (BlockPos var14 : var7) {
            var26.add(var14.method_10062());
            BlockState var15 = c.field_1687.method_8320(var14);
            if (!var15.method_26215() && !var15.method_45474()) {
               if (!this.method_3168(var15) && Dev.ZWare.Client.pkg1.Class13.method_414(var14, var15)) {
                  var21.add(var14.method_10062());
               }
            } else if (this.method_3163(var14)) {
               var24.add(var14.method_10062());
            }
         }

         for (BlockPos var28 : var8) {
            BlockState var29 = c.field_1687.method_8320(var28);
            if (!var29.method_26215() && !var29.method_45474() && Dev.ZWare.Client.pkg1.Class13.method_414(var28, var29)) {
               var21.add(var28.method_10062());
            }
         }

         return new Class5.Inner4(List.copyOf(var26), new ArrayList<>(var21), var24);
      } else {
         return null;
      }
   }

   // $VF: renamed from: b (java.util.List) void
   private void method_3167(List<BlockPos> var1) {
      if (!var1.isEmpty()) {
         Class8 var2 = Class8.method_32();
         if (var2 != null && !var2.method_31()) {
            if (!var2.method_20()) {
               if (!var2.method_21() || var2.method_26()) {
                  int var3 = 0;

                  for (BlockPos var5 : var1) {
                     if (var3 >= 2) {
                        break;
                     }

                     if (!var2.method_28(var5) && var2.method_27(var5)) {
                        BlockState var6 = c.field_1687.method_8320(var5);
                        if (!var6.method_26215() && !var6.method_45474() && Dev.ZWare.Client.pkg1.Class13.method_414(var5, var6)) {
                           var2.method_17(var5, 20.0);
                           var3++;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) boolean
   private boolean method_3168(BlockState var1) {
      Block var2 = this.method_3161();
      return var1 != null
         && !var1.method_26215()
         && (
            var1.method_27852(Blocks.field_9987)
               || var1.method_27852(Blocks.field_10540)
               || var1.method_27852(Blocks.field_22423)
               || var2 != null && var1.method_27852(var2)
         );
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) java.util.Set
   private Set<BlockPos> method_3169(PlayerEntity var1) {
      return this.method_3176(var1, this.method_3180(var1));
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) java.util.Set
   private Set<BlockPos> method_3170(PlayerEntity var1) {
      return this.method_3176(var1, this.method_3180(var1));
   }

   // $VF: renamed from: c (net.minecraft.entity.player.PlayerEntity) java.util.Set
   private Set<BlockPos> method_3171(PlayerEntity var1) {
      if (c.field_1687 != null && var1 != null) {
         Vec3d var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2046() ? this.method_3184(var1) : var1.method_19538();
         LinkedHashSet var3 = new LinkedHashSet();
         double var4 = var1.method_17681();
         double var6 = var1.method_17682();
         Box var8 = new Box(
               var2.field_1352 - var4 / 2.0,
               var2.field_1351,
               var2.field_1350 - var4 / 2.0,
               var2.field_1352 + var4 / 2.0,
               var2.field_1351 + var6,
               var2.field_1350 + var4 / 2.0
            )
            .method_1009(0.05, 0.1, 0.05);
         int var9 = (int)Math.floor(var8.field_1323 - 1.0);
         int var10 = (int)Math.ceil(var8.field_1320);
         int var11 = (int)Math.floor(var8.field_1322 - 1.0);
         int var12 = (int)Math.ceil(var8.field_1325);
         int var13 = (int)Math.floor(var8.field_1321 - 1.0);
         int var14 = (int)Math.ceil(var8.field_1324);

         for (int var15 = var9; var15 <= var10; var15++) {
            for (int var16 = var11; var16 <= var12; var16++) {
               for (int var17 = var13; var17 <= var14; var17++) {
                  boolean var18 = var15 >= var8.field_1323
                     && var15 < var8.field_1320
                     && var16 >= var8.field_1322
                     && var16 < var8.field_1325
                     && var17 >= var8.field_1321
                     && var17 < var8.field_1324;
                  if (!var18) {
                     BlockPos var19 = new BlockPos(var15, var16, var17);
                     if (this.method_3163(var19)) {
                        var3.add(var19);
                     }
                  }
               }
            }
         }

         return var3;
      } else {
         return new LinkedHashSet<>();
      }
   }

   // $VF: renamed from: d (net.minecraft.entity.player.PlayerEntity) java.util.Set
   private Set<BlockPos> method_3172(PlayerEntity var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      if (this.field_2492) {
         Vec3d var3 = Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2046() ? this.method_3174(var1) : var1.method_19538();
         this.field_2494 = BlockPos.method_49638(var3);
         this.field_2501 = var1.method_5667();
         Vec3d var4 = var1.method_18798();
         ArrayList var5 = new ArrayList<>(List.of(Axis.values()));
         var5.sort(Comparator.<Axis>comparingDouble(var2x -> Math.abs(this.method_3186(var4, var2x))).reversed());
         this.field_2495 = (Axis)var5.get(0);
         this.field_2496 = (Axis)var5.get(1);
         this.field_2497 = (Axis)var5.get(2);
         this.field_2498 = this.method_3188(var4, this.field_2495);
         this.field_2499 = this.method_3188(var4, this.field_2496);
         this.field_2500 = this.method_3188(var4, this.field_2497);

         for (int var6 = 0; var6 < 2; var6++) {
            for (int var7 = 0; var7 < 2; var7++) {
               var2.add(
                  this.method_3189(
                        this.method_3189(this.method_3189(this.field_2494, this.field_2495, this.field_2498), this.field_2496, var6 * this.field_2499),
                        this.field_2497,
                        var7 * this.field_2500
                     )
                     .method_10062()
               );
            }
         }

         for (int var21 = 0; var21 < 2; var21++) {
            var2.add(
               this.method_3189(this.method_3189(this.field_2494, this.field_2496, 2 * this.field_2499), this.field_2497, var21 * this.field_2500)
                  .method_10062()
            );
            var2.add(
               this.method_3189(this.method_3189(this.field_2494, this.field_2497, 2 * this.field_2500), this.field_2496, var21 * this.field_2499)
                  .method_10062()
            );
         }
      } else {
         Box var18 = var1.method_5829().method_1009(0.01, 0.1, 0.01);
         int var19 = var1.method_24515().method_10264();
         int var20 = (int)Math.floor(var18.field_1323);
         int var22 = this.method_3187(var18.field_1320);
         int var23 = (int)Math.floor(var18.field_1321);
         int var8 = this.method_3187(var18.field_1324);

         for (int var9 = var20; var9 <= var22; var9++) {
            for (int var10 = var23; var10 <= var8; var10++) {
               BlockPos var11 = new BlockPos(var9, var19, var10);

               for (int var12 = -1; var12 <= 1; var12++) {
                  for (int var13 = -1; var13 <= 1; var13++) {
                     if (Math.abs(var12) + Math.abs(var13) == 1) {
                        BlockPos var14 = var11.method_10069(var12, 0, var13);
                        BlockState var15 = c.field_1687.method_8320(var14);
                        if (var15.method_26215() || var15.method_45474()) {
                           var2.add(var14.method_10062());
                        }

                        BlockPos var16 = var14.method_10084();
                        BlockState var17 = c.field_1687.method_8320(var16);
                        if (var17.method_26215() || var17.method_45474()) {
                           var2.add(var16.method_10062());
                        }
                     }
                  }
               }

               BlockPos var24 = var11.method_10074();
               BlockState var25 = c.field_1687.method_8320(var24);
               if (var25.method_26215() || var25.method_45474()) {
                  var2.add(var24.method_10062());
               }

               BlockPos var26 = var11.method_10086(2);
               BlockState var27 = c.field_1687.method_8320(var26);
               if (var27.method_26215() || var27.method_45474()) {
                  var2.add(var26.method_10062());
               }
            }
         }
      }

      return var2;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d
   private Vec3d method_3173(PlayerEntity var1) {
      if (!this.field_2492) {
         return var1.method_19538();
      } else if (!Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2046()) {
         return var1.method_19538();
      } else {
         return var1.method_6128() ? this.method_3174(var1) : this.method_3180(var1);
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d
   private Vec3d method_3174(PlayerEntity var1) {
      UUID var2 = var1.method_5667();
      int var3 = Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2048();
      return this.field_2490.containsKey(var2) ? Dev.ZWare.Client.pkg1.Class18.method_215(var1, var3) : Dev.ZWare.Client.pkg1.Class18.method_214(var1, var3);
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Vec3d) java.util.Set
   private Set<BlockPos> method_3175(PlayerEntity var1, Vec3d var2) {
      Set var3 = this.method_3178(var1, var2);
      LinkedHashSet var4 = new LinkedHashSet();
      Direction var5 = this.method_3185(var1, var2);

      for (BlockPos var7 : var3) {
         var4.add(var7.method_10074().method_10062());
         var4.add(var7.method_10086(2).method_10062());

         for (Direction var9 : Type.field_11062) {
            if (!var3.contains(var7.method_10093(var9))) {
               if (this.field_2481.method_671() == Class5.Inner1.Full && var9 != var5) {
                  var4.add(var7.method_10093(var9).method_10062());
               }

               var4.add(var7.method_10084().method_10093(var9).method_10062());
            }
         }

         if (!var3.contains(var7.method_10093(var5))) {
            var4.add(var7.method_10074().method_10093(var5).method_10062());
         }
      }

      return var4;
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Vec3d) java.util.Set
   private Set<BlockPos> method_3176(PlayerEntity var1, Vec3d var2) {
      Set var3 = this.method_3175(var1, var2);
      if (var1 == null) {
         return var3;
      } else {
         Set var4 = this.method_3178(var1, var2);
         if (var4.isEmpty()) {
            return var3;
         } else {
            Direction var5 = this.method_3185(var1, var2);
            this.method_3177(var3, var4, var5);
            if (this.field_2481.method_671() == Class5.Inner1.Compact) {
               this.method_3177(var3, var4, Dev.ZWare.Client.pkg1.Class13.method_425(var5));
               this.method_3177(var3, var4, Dev.ZWare.Client.pkg1.Class13.method_424(var5));
            }

            return var3;
         }
      }
   }

   // $VF: renamed from: a (java.util.Set, java.util.Set, net.minecraft.util.math.Direction) void
   private void method_3177(Set<BlockPos> var1, Set<BlockPos> var2, Direction var3) {
      if (var1 != null && var2 != null && !var2.isEmpty() && var3 != null) {
         for (BlockPos var5 : var2) {
            if (!var2.contains(var5.method_10093(var3))) {
               var1.add(var5.method_10093(var3).method_10062());
               var1.add(var5.method_10084().method_10093(var3).method_10062());
            }
         }
      }
   }

   // $VF: renamed from: c (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Vec3d) java.util.Set
   private Set<BlockPos> method_3178(PlayerEntity var1, Vec3d var2) {
      Set var3 = this.method_3179(var1 != null ? var1.method_19538() : var2, var1);
      if (var1 != null && !var3.isEmpty()) {
         BlockPos var4 = BlockPos.method_49638(var1.method_19538());
         BlockPos var5 = BlockPos.method_49638(var2);
         int var6 = var5.method_10263() - var4.method_10263();
         int var7 = var5.method_10264() - var4.method_10264();
         int var8 = var5.method_10260() - var4.method_10260();
         if (var6 == 0 && var7 == 0 && var8 == 0) {
            return var3;
         } else {
            LinkedHashSet var9 = new LinkedHashSet();

            for (BlockPos var11 : var3) {
               var9.add(var11.method_10069(var6, var7, var8).method_10062());
            }

            return var9;
         }
      } else {
         return var3;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.entity.player.PlayerEntity) java.util.Set
   private Set<BlockPos> method_3179(Vec3d var1, PlayerEntity var2) {
      LinkedHashSet var3 = new LinkedHashSet();
      if (var2 == null) {
         return var3;
      } else {
         int var4 = BlockPos.method_49638(var1).method_10264();
         double var5 = var2.method_17681();
         Box var7 = new Box(
            var1.field_1352 - var5 / 2.0,
            var1.field_1351,
            var1.field_1350 - var5 / 2.0,
            var1.field_1352 + var5 / 2.0,
            var1.field_1351 + 0.1,
            var1.field_1350 + var5 / 2.0
         );
         int var8 = (int)Math.floor(var7.field_1323);
         int var9 = this.method_3187(var7.field_1320);
         int var10 = (int)Math.floor(var7.field_1321);
         int var11 = this.method_3187(var7.field_1324);

         for (int var12 = var8; var12 <= var9; var12++) {
            for (int var13 = var10; var13 <= var11; var13++) {
               var3.add(new BlockPos(var12, var4, var13).method_10062());
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: c (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d
   private Vec3d method_3180(PlayerEntity var1) {
      if (!Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2046()) {
         return var1.method_19538();
      } else {
         Vec3d var2 = this.method_3184(var1);
         Vec3d var3 = var1.method_19538();
         double var4 = var2.field_1352 - var3.field_1352;
         double var6 = var2.field_1350 - var3.field_1350;
         double var8 = var4 * var4 + var6 * var6;
         double var10 = 2.25;
         if (var8 > var10) {
            double var12 = Math.sqrt(var8);
            if (var12 <= 1.0E-6) {
               return var3;
            } else {
               double var14 = 1.5 / var12;
               return new Vec3d(var3.field_1352 + var4 * var14, var2.field_1351, var3.field_1350 + var6 * var14);
            }
         } else {
            return var2;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, java.util.List, net.minecraft.util.math.Vec3d) void
   private void method_3181(PlayerEntity var1, List<BlockPos> var2, Vec3d var3) {
      if (var1 != null && var2 != null && !var2.isEmpty()) {
         Vec3d var4 = var3 != null ? var3 : this.method_3180(var1);
         Set var5 = this.method_3178(var1, var4);
         Direction var6 = this.method_3185(var1, var4);
         Vec3d var7 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
         var2.sort(
            Comparator.<BlockPos>comparingInt(var3x -> this.method_3182(var3x, var5, var6))
               .thenComparingDouble(var1x -> Vec3d.method_24953(var1x).method_1025(var4))
               .thenComparingDouble(var1x -> var7.method_1025(Vec3d.method_24953(var1x)))
         );
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, java.util.Set, net.minecraft.util.math.Direction) int
   private int method_3182(BlockPos var1, Set<BlockPos> var2, Direction var3) {
      if (var1 != null && var2 != null && !var2.isEmpty() && var3 != null) {
         Direction var4 = Dev.ZWare.Client.pkg1.Class13.method_425(var3);
         Direction var5 = Dev.ZWare.Client.pkg1.Class13.method_424(var3);
         Direction var6 = var3.method_10153();
         int var7 = this.field_2482.method_671() ? 0 : 2;
         int var8 = this.field_2482.method_671() ? 1 : 3;
         byte var9 = 2;
         byte var10 = 3;
         byte var11 = 4;
         byte var12 = 5;
         byte var13 = 6;
         byte var14 = 7;
         byte var15 = 8;
         int var16 = Integer.MAX_VALUE;

         for (BlockPos var18 : var2) {
            if (var1.equals(var18.method_10093(var3))) {
               var16 = Math.min(var16, var7);
            }

            if (var1.equals(var18.method_10084().method_10093(var3))) {
               var16 = Math.min(var16, var8);
            }

            if (var1.equals(var18.method_10093(var4)) || var1.equals(var18.method_10093(var5))) {
               var16 = Math.min(var16, var9);
            }

            if (var1.equals(var18.method_10084().method_10093(var4)) || var1.equals(var18.method_10084().method_10093(var5))) {
               var16 = Math.min(var16, var10);
            }

            if (var1.equals(var18.method_10093(var6))) {
               var16 = Math.min(var16, var11);
            }

            if (var1.equals(var18.method_10084().method_10093(var6))) {
               var16 = Math.min(var16, var12);
            }

            if (var1.equals(var18.method_10086(2))) {
               var16 = Math.min(var16, var13);
            }

            if (var1.equals(var18.method_10074())) {
               var16 = Math.min(var16, var14);
            }

            if (var1.equals(var18.method_10074().method_10093(var3))) {
               var16 = Math.min(var16, var15);
            }
         }

         return var16 == Integer.MAX_VALUE ? 9 : var16;
      } else {
         return Integer.MAX_VALUE;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, java.util.List) net.minecraft.util.math.BlockPos
   private BlockPos method_3183(PlayerEntity var1, List<BlockPos> var2) {
      if (var1 != null && !var2.isEmpty()) {
         Vec3d var3 = this.method_3180(var1);
         Direction var4 = var1.method_6128() ? var1.method_5735() : this.method_3185(var1, var3);
         int var5 = Math.max(1, this.field_2483.method_671());
         if (var1.method_6128()) {
            BlockPos var19 = var1.method_24515();
            if (Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2046()) {
               var19 = BlockPos.method_49638(this.method_3174(var1));
            }

            for (int var20 = var5; var20 >= 1; var20--) {
               BlockPos var8 = var19.method_10084().method_10079(var4, var20);
               double var21 = this.method_3191();
               if (var2.contains(var8)
                  && c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0).method_1025(Vec3d.method_24953(var8)) <= var21 * var21) {
                  return var8.method_10062();
               }
            }

            return null;
         } else {
            BlockPos var6 = null;
            double var7 = Double.POSITIVE_INFINITY;
            Set var9 = this.method_3178(var1, var3);

            for (BlockPos var11 : var9) {
               if (!var9.contains(var11.method_10093(var4))) {
                  for (int var12 = var5; var12 >= 1; var12--) {
                     BlockPos var13 = var11.method_10084().method_10079(var4, var12);
                     if (var2.contains(var13)) {
                        Vec3d var14 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
                        double var15 = var14.method_1025(Vec3d.method_24953(var13));
                        double var17 = this.method_3191();
                        if (var15 <= var17 * var17 && var15 < var7) {
                           var7 = var15;
                           var6 = var13.method_10062();
                        }
                     }
                  }
               }
            }

            return var6;
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: d (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d
   public Vec3d method_3184(PlayerEntity player) {
      if (player == null) {
         return Vec3d.field_1353;
      } else if (Dev.ZWare.Client.pkg1.Class18.method_222(player, c.field_1687)) {
         return player.method_19538();
      } else {
         int var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2047();
         if (var2 <= 0) {
            return player.method_19538();
         } else {
            return Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2049()
               ? Dev.ZWare.Client.pkg1.Class18.method_213(player, c.field_1687, var2)
               : Dev.ZWare.Client.pkg1.Class18.method_216(player, var2);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Vec3d) net.minecraft.util.math.Direction
   private Direction method_3185(PlayerEntity var1, Vec3d var2) {
      if (var1 == null) {
         return Direction.field_11043;
      } else {
         double var3 = var2.field_1352 - var1.method_23317();
         double var5 = var2.field_1350 - var1.method_23321();
         if (var3 * var3 + var5 * var5 < 1.0E-4) {
            var3 = var1.method_23317() - var1.field_6014;
            var5 = var1.method_23321() - var1.field_5969;
         }

         if (var3 * var3 + var5 * var5 < 1.0E-4) {
            var3 = var1.method_18798().field_1352;
            var5 = var1.method_18798().field_1350;
         }

         if (var3 * var3 + var5 * var5 < 1.0E-4) {
            return var1.method_5735();
         } else {
            return Math.abs(var3) > Math.abs(var5)
               ? (var3 > 0.0 ? Direction.field_11034 : Direction.field_11039)
               : (var5 > 0.0 ? Direction.field_11035 : Direction.field_11043);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Direction.Axis) double
   private double method_3186(Vec3d var1, Axis var2) {
      return switch (var2) {
         case field_11048 -> var1.field_1352;
         case field_11052 -> var1.field_1351;
         case field_11051 -> var1.field_1350;
         default -> throw new MatchException(null, null);
      };
   }

   // $VF: renamed from: a (double) int
   private int method_3187(double var1) {
      return (int)Math.floor(var1 - 1.0E-4);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Direction.Axis) int
   private int method_3188(Vec3d var1, Axis var2) {
      int var3 = (int)Math.signum(this.method_3186(var1, var2));
      return var3 == 0 ? 1 : var3;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction.Axis, int) net.minecraft.util.math.BlockPos
   private BlockPos method_3189(BlockPos var1, Axis var2, int var3) {
      return switch (var2) {
         case field_11048 -> var1.method_10069(var3, 0, 0);
         case field_11052 -> var1.method_10069(0, var3, 0);
         case field_11051 -> var1.method_10069(0, 0, var3);
         default -> throw new MatchException(null, null);
      };
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, java.awt.Color) void
   private void method_3190(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, Color var3) {
      if (this.field_2487.method_671().method_1154()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var2, var3);
      }

      if (this.field_2487.method_671().method_1153()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var2, var3, 1.0);
      }
   }

   // $VF: renamed from: a () double
   private double method_3191() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   public static enum Inner1 {
      Compact,
      Full;
   }

   private record Inner3(UUID am, String an, Vec3d ao, double ap, long aq) {
      // $VF: renamed from: am java.util.UUID
      private final UUID field_882;
      // $VF: renamed from: an java.lang.String
      private final String field_883;
      // $VF: renamed from: ao net.minecraft.util.math.Vec3d
      private final Vec3d field_884;
      // $VF: renamed from: ap double
      private final double field_885;
      // $VF: renamed from: aq long
      private final long field_886;

      private Inner3(UUID am, String an, Vec3d ao, double ap, long aq) {
         this.field_882 = am;
         this.field_883 = an;
         this.field_884 = ao;
         this.field_885 = ap;
         this.field_886 = aq;
      }

      // $VF: renamed from: am () java.util.UUID
      public UUID method_1409() {
         return this.field_882;
      }

      // $VF: renamed from: an () java.lang.String
      public String method_1410() {
         return this.field_883;
      }

      // $VF: renamed from: ao () net.minecraft.util.math.Vec3d
      public Vec3d method_1411() {
         return this.field_884;
      }

      // $VF: renamed from: ap () double
      public double method_1412() {
         return this.field_885;
      }

      // $VF: renamed from: aq () long
      public long method_1413() {
         return this.field_886;
      }
   }

   private record Inner4(List<BlockPos> ar, List<BlockPos> as, List<BlockPos> at) {
      // $VF: renamed from: ar java.util.List
      private final List<BlockPos> field_772;
      // $VF: renamed from: as java.util.List
      private final List<BlockPos> field_773;
      // $VF: renamed from: at java.util.List
      private final List<BlockPos> field_774;

      private Inner4(List<BlockPos> ar, List<BlockPos> as, List<BlockPos> at) {
         this.field_772 = ar;
         this.field_773 = as;
         this.field_774 = at;
      }

      // $VF: renamed from: ar () java.util.List
      public List<BlockPos> method_1286() {
         return this.field_772;
      }

      // $VF: renamed from: as () java.util.List
      public List<BlockPos> method_1287() {
         return this.field_773;
      }

      // $VF: renamed from: at () java.util.List
      public List<BlockPos> method_1288() {
         return this.field_774;
      }
   }

   public static enum Inner5 {
      ClosestAngle,
      ClosestDistance;
   }

   public static enum Inner6 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1153() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1154() {
         return this == Sides || this == Both;
      }
   }
}
