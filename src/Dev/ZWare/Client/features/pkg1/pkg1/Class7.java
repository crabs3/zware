package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;

public class Class7 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1629 = 1.0E-4;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1630 = this.a("Range", 5.0, 1.0, 7.0).method_683("Mining");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner2> field_1631 = this.a("Mode", Class7.Inner2.Flat).method_683("Mining");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner3> field_1632 = this.a("Order", Class7.Inner3.Closest).method_683("Mining");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1633 = this.a("Baritone Area", false).method_683("Mining");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1634 = this.a("Max Breaks Per Tick", 2, 1, 50).method_683("Mining");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1635 = this.a("Map Mode", false).method_683("Maps");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_1636 = this.a("Map Rate Mode", Class7.Inner1.PerTick).method_683("Maps");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1637 = this.a("Map Breaks Per Tick", 12, 1, 50).method_683("Maps");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1638 = this.a("Paper Maps Per Window", 12, 1, 200).method_683("Maps");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1639 = this.a("Paper Window Ms", 1000, 1, 10000).method_683("Maps");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1640 = this.a("Under Place", false).method_683("Placement");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_1641 = this.a("Under Place Block", Blocks.field_10540).method_683("Placement");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1642 = this.a("Whitelist", false).method_683("Whitelist");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class7
   private final Dev.ZWare.Client.features.pkg3.Class7 field_1643 = (Dev.ZWare.Client.features.pkg3.Class7)this.a(
      new Dev.ZWare.Client.features.pkg3.Class7("WhitelistBlocks").a("Whitelist")
   );
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1644 = this.a("RequeueDelay", 0, 0, 2000).method_683("Mining");
   // $VF: renamed from: E net.minecraft.util.math.BlockPos.Mutable
   private final Mutable field_1645 = new Mutable();
   // $VF: renamed from: F java.util.Set
   private final Set<Integer> field_1646 = new HashSet<>();
   // $VF: renamed from: G java.util.Deque
   private final Deque<Long> field_1647 = new ArrayDeque<>();
   // $VF: renamed from: H long
   private long field_1648 = 0L;
   // $VF: renamed from: I long
   private long field_1649 = Long.MIN_VALUE;
   // $VF: renamed from: J int
   private int field_1650 = 0;

   public Class7() {
      super("Nuker", "nukes shit", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false);
      this.field_1636.method_709(var1 -> this.field_1635.method_671());
      this.field_1637.method_709(var1 -> this.field_1635.method_671() && this.field_1636.method_671() == Class7.Inner1.PerTick);
      this.field_1638.method_709(var1 -> this.field_1635.method_671() && this.field_1636.method_671() == Class7.Inner1.PaperMC);
      this.field_1639.method_709(var1 -> this.field_1635.method_671() && this.field_1636.method_671() == Class7.Inner1.PaperMC);
      this.field_1641.method_709(var1 -> this.field_1640.method_671());
      this.field_1643.a(var1 -> this.field_1642.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1646.clear();
      this.field_1647.clear();
      this.field_1648 = 0L;
      this.field_1649 = Long.MIN_VALUE;
      this.field_1650 = 0;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1646.clear();
      this.field_1647.clear();
      this.field_1649 = Long.MIN_VALUE;
      this.field_1650 = 0;
      Dev.ZWare.Client.features.pkg1.pkg3.Class8 var1 = this.method_2230();
      if (var1 != null) {
         var1.method_29(true);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2223(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g()) {
         this.method_2229();
         this.method_2236();
         List var2 = this.method_2225();
         if (var2 != null) {
            if (this.field_1635.method_671()) {
               this.method_2232(var2);
            } else {
               this.method_2247();
               Dev.ZWare.Client.features.pkg1.pkg3.Class8 var3 = this.method_2230();
               if (var3 != null && !var3.method_31()) {
                  var3.method_29(false);
                  if (this.field_1648 > 0L && this.field_1644.method_671() > 0) {
                     if (System.currentTimeMillis() - this.field_1648 >= this.field_1644.method_671().intValue()) {
                        this.field_1648 = 0L;
                        this.method_2227(var3, var2);
                     }
                  } else {
                     this.method_2227(var3, var2);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class2$Inner2) void
   @iFT13zrx_wTXP
   private void method_2224(Dev.ZWare.Client.pkg2.pkg1.Class2.Inner2 var1) {
      if (!g() && this.d() && !this.field_1635.method_671() && var1 != null && !var1.b()) {
         this.method_2229();
         Dev.ZWare.Client.features.pkg1.pkg3.Class8 var2 = this.method_2230();
         if (var2 != null && !var2.method_31()) {
            var2.method_29(false);
            this.field_1648 = System.currentTimeMillis();
            if (this.field_1644.method_671() <= 0) {
               List var3 = this.method_2225();
               if (var3 != null) {
                  this.method_2227(var2, var3);
               }
            }
         }
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<Dev.ZWare.Client.pkg1.Class5.Inner1> method_2225() {
      if (!this.field_1633.method_671()) {
         return List.of();
      } else {
         List var1 = Dev.ZWare.Client.pkg1.Class5.method_166();
         return var1.isEmpty() ? null : var1;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class8, java.util.List) void
   private void method_2226(Dev.ZWare.Client.features.pkg1.pkg3.Class8 var1, List<Dev.ZWare.Client.pkg1.Class5.Inner1> var2) {
      if (var1 != null) {
         BlockPos var3 = this.method_2231(var1, null, var2);
         if (var3 != null) {
            this.method_2228(var1, var3);
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg3.Class8, java.util.List) void
   private void method_2227(Dev.ZWare.Client.features.pkg1.pkg3.Class8 var1, List<Dev.ZWare.Client.pkg1.Class5.Inner1> var2) {
      if (var1 != null) {
         this.method_2229();
         if (this.field_1650 < this.field_1634.method_671()) {
            if (!var1.method_20()) {
               boolean var3 = var1.method_20() && var1.method_21() && !var1.method_26();
               if (!var3) {
                  HashSet var4 = new HashSet();
                  if (var1.method_22() != null) {
                     var4.add(var1.method_22().method_10062());
                  }

                  if (var1.method_24() != null) {
                     var4.add(var1.method_24().method_10062());
                  }

                  if (!var1.method_20()) {
                     BlockPos var5 = this.method_2231(var1, var4, var2);
                     if (var5 != null) {
                        if (!this.method_2228(var1, var5)) {
                           return;
                        }

                        var4.add(var5.method_10062());
                     }
                  }

                  if (!var1.method_21() || var1.method_26()) {
                     BlockPos var6 = this.method_2231(var1, var4, var2);
                     if (var6 != null) {
                        this.method_2228(var1, var6);
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class8, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2228(Dev.ZWare.Client.features.pkg1.pkg3.Class8 var1, BlockPos var2) {
      if (var1 != null && var2 != null) {
         this.method_2229();
         if (this.field_1650 >= this.field_1634.method_671()) {
            return false;
         } else {
            this.field_1650++;
            var1.method_19(var2, this.method_2246(var2), 100.0, true);
            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: n () void
   private void method_2229() {
      if (c.field_1687 == null) {
         this.field_1649 = Long.MIN_VALUE;
         this.field_1650 = 0;
      } else {
         long var1 = c.field_1687.method_8510();
         if (var1 != this.field_1649) {
            this.field_1649 = var1;
            this.field_1650 = 0;
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class8
   private Dev.ZWare.Client.features.pkg1.pkg3.Class8 method_2230() {
      return Dev.ZWare.Client.features.pkg1.pkg3.Class8.method_32();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class8, java.util.Set, java.util.List) net.minecraft.util.math.BlockPos
   private BlockPos method_2231(Dev.ZWare.Client.features.pkg1.pkg3.Class8 var1, Set<BlockPos> var2, List<Dev.ZWare.Client.pkg1.Class5.Inner1> var3) {
      Vec3d var4 = c.field_1724.method_33571();
      BlockPos var5 = c.field_1724.method_24515();
      int var6 = var5.method_10264();
      double var7 = this.field_1630.method_671();
      double var9 = var7 * var7;
      int var11 = MathHelper.method_15384(var7);
      BlockPos var12 = null;
      double var13 = 0.0;
      int var15 = Integer.MIN_VALUE;

      for (int var16 = -var11; var16 <= var11; var16++) {
         for (int var17 = -var11; var17 <= var11; var17++) {
            for (int var18 = -var11; var18 <= var11; var18++) {
               this.field_1645.method_10103(var5.method_10263() + var16, var5.method_10264() + var17, var5.method_10260() + var18);
               if (this.method_2243(this.field_1645.method_10264(), var6)
                  && (var3.isEmpty() || this.method_2242(this.field_1645, var3))
                  && (var2 == null || !var2.contains(this.field_1645))) {
                  BlockState var19 = c.field_1687.method_8320(this.field_1645);
                  if (!var19.method_26215()
                     && !this.method_2244(var19)
                     && Dev.ZWare.Client.pkg1.Class13.method_414(this.field_1645, var19)
                     && var1.method_27(this.field_1645)
                     && !var1.method_28(this.field_1645)) {
                     double var20 = Dev.ZWare.Client.pkg1.Class7.method_121(var4, new Box(this.field_1645));
                     if (!(var20 > var9) && this.method_2245(this.field_1645, var20, var12, var13, var15)) {
                        var12 = this.field_1645.method_10062();
                        var13 = var20;
                        var15 = this.field_1645.method_10264();
                     }
                  }
               }
            }
         }
      }

      return var12;
   }

   // $VF: renamed from: a (java.util.List) void
   private void method_2232(List<Dev.ZWare.Client.pkg1.Class5.Inner1> var1) {
      if (c.field_1761 != null) {
         List var2 = this.method_2233(var1);
         if (!var2.isEmpty()) {
            long var3 = System.currentTimeMillis();
            int var5 = this.method_2240();
            if (var5 > 0) {
               Vec3d var6 = c.field_1724.method_33571();
               var2.sort((var2x, var3x) -> this.method_2241(var2x, var3x, var6));

               for (ItemFrameEntity var8 : var2) {
                  if (var5 <= 0) {
                     break;
                  }

                  if (!this.method_2234(var8) && this.field_1646.contains(var8.method_5628())) {
                     this.method_2235(var8, 1);
                     var5--;
                  }
               }

               for (ItemFrameEntity var13 : var2) {
                  if (var5 <= 0) {
                     break;
                  }

                  if (this.method_2234(var13) && this.field_1646.contains(var13.method_5628())) {
                     int var9 = Math.min(var5, 2);
                     this.method_2235(var13, var9);
                     var5 -= var9;
                  }
               }

               int var12 = this.method_2237(var3);
               if (var12 > 0 && var5 > 0) {
                  for (ItemFrameEntity var15 : var2) {
                     if (var12 <= 0 || var5 <= 0) {
                        break;
                     }

                     if (this.method_2234(var15) && !this.field_1646.contains(var15.method_5628())) {
                        int var10 = Math.min(var5, 2);
                        this.method_2235(var15, var10);
                        var5 -= var10;
                        var12--;
                        this.method_2238(var3);
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List) java.util.List
   private List<ItemFrameEntity> method_2233(List<Dev.ZWare.Client.pkg1.Class5.Inner1> var1) {
      Vec3d var2 = c.field_1724.method_33571();
      double var3 = this.field_1630.method_671() * this.field_1630.method_671();
      ArrayList var5 = new ArrayList();

      for (Entity var7 : c.field_1687.method_18112()) {
         if (var7 instanceof ItemFrameEntity var8
            && var8.method_5805()
            && (this.method_2234(var8) || this.field_1646.contains(var8.method_5628()))
            && (var1.isEmpty() || this.method_2242(var8.method_24515(), var1))) {
            double var9 = Dev.ZWare.Client.pkg1.Class7.method_121(var2, var8.method_5829());
            if (!(var9 > var3)) {
               var5.add(var8);
            }
         }
      }

      return var5;
   }

   // $VF: renamed from: a (net.minecraft.entity.decoration.ItemFrameEntity) boolean
   private boolean method_2234(ItemFrameEntity var1) {
      return var1.method_6940().method_31574(Items.field_8204) || var1.method_6940().method_31574(Items.field_8895);
   }

   // $VF: renamed from: a (net.minecraft.entity.decoration.ItemFrameEntity, int) void
   private void method_2235(ItemFrameEntity var1, int var2) {
      if (var2 > 0 && c.field_1761 != null) {
         this.field_1646.add(var1.method_5628());
         c.field_1761.method_2918(c.field_1724, var1);
         if (var2 > 1 && !var1.method_6940().method_7960()) {
            c.field_1761.method_2918(c.field_1724, var1);
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2236() {
      if (!this.field_1646.isEmpty()) {
         this.field_1646.removeIf(var0 -> !(c.field_1687.method_8469(var0) instanceof ItemFrameEntity));
      }
   }

   // $VF: renamed from: a (long) int
   private int method_2237(long var1) {
      if (this.field_1636.method_671() == Class7.Inner1.PerTick) {
         return this.field_1637.method_671();
      } else {
         this.method_2239(var1);
         return Math.max(0, this.field_1638.method_671() - this.field_1647.size());
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2238(long var1) {
      if (this.field_1636.method_671() == Class7.Inner1.PaperMC) {
         this.method_2239(var1);
         this.field_1647.addLast(var1);
      }
   }

   // $VF: renamed from: b (long) void
   private void method_2239(long var1) {
      long var3 = Math.max(1L, (long)this.field_1639.method_671().intValue());

      while (true) {
         Long var5 = this.field_1647.peekFirst();
         if (var5 == null || var1 - var5 < var3) {
            return;
         }

         this.field_1647.removeFirst();
      }
   }

   // $VF: renamed from: a () int
   private int method_2240() {
      return Integer.MAX_VALUE;
   }

   // $VF: renamed from: a (net.minecraft.entity.decoration.ItemFrameEntity, net.minecraft.entity.decoration.ItemFrameEntity, net.minecraft.util.math.Vec3d) int
   private int method_2241(ItemFrameEntity var1, ItemFrameEntity var2, Vec3d var3) {
      double var4 = Dev.ZWare.Client.pkg1.Class7.method_121(var3, var1.method_5829());
      double var6 = Dev.ZWare.Client.pkg1.Class7.method_121(var3, var2.method_5829());
      int var8 = var1.method_31478();
      int var9 = var2.method_31478();

      return switch ((Class7.Inner3)this.field_1632.method_671()) {
         case Closest -> Double.compare(var4, var6);
         case ClosestUp -> var8 != var9 ? Integer.compare(var9, var8) : Double.compare(var4, var6);
         case Furthest -> Double.compare(var6, var4);
         case FurthestUp -> var8 != var9 ? Integer.compare(var9, var8) : Double.compare(var6, var4);
      };
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, java.util.List) boolean
   private boolean method_2242(BlockPos var1, List<Dev.ZWare.Client.pkg1.Class5.Inner1> var2) {
      if (var1 != null && var2 != null && !var2.isEmpty()) {
         for (Dev.ZWare.Client.pkg1.Class5.Inner1 var4 : var2) {
            if (var4 != null && var4.method_1473(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (int, int) boolean
   private boolean method_2243(int var1, int var2) {
      return switch ((Class7.Inner2)this.field_1631.method_671()) {
         case Flat -> var1 >= var2;
         case field_664 -> true;
         case Below -> var1 < var2;
      };
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) boolean
   private boolean method_2244(BlockState var1) {
      if (var1.method_26204() instanceof AbstractFireBlock) {
         return true;
      } else {
         return this.field_1642.method_671() && !((Set)this.field_1643.a()).isEmpty() ? !this.field_1643.method_730(var1.method_26204()) : false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, double, net.minecraft.util.math.BlockPos, double, int) boolean
   private boolean method_2245(BlockPos var1, double var2, BlockPos var4, double var5, int var7) {
      int var8 = var1.method_10264();
      if (var4 == null) {
         return true;
      } else {
         return switch ((Class7.Inner3)this.field_1632.method_671()) {
            case Closest -> var2 < var5;
            case ClosestUp -> var8 > var7 || var8 == var7 && var2 < var5;
            case Furthest -> var2 > var5;
            case FurthestUp -> var8 > var7 || var8 == var7 && var2 > var5;
         };
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.Direction
   private Direction method_2246(BlockPos var1) {
      Vec3d var2 = c.field_1724.method_33571();
      Vec3d var3 = Vec3d.method_24953(var1);
      Vec3d var4 = var3.method_1020(var2);
      return Direction.method_10142(var4.field_1352, var4.field_1351, var4.field_1350);
   }

   // $VF: renamed from: p () void
   private void method_2247() {
      if (this.field_1640.method_671() && Dev.ZWare.Client.Class1.field_301 != null) {
         Block var1 = this.field_1641.method_671();
         if (var1 != Blocks.field_10124) {
            Object var2 = this.method_2248();
            if (!var2.isEmpty()) {
               int var3 = Dev.ZWare.Client.Class1.field_301.method_932();
               if (var3 > 0) {
                  if (var2.size() > var3) {
                     var2 = new ArrayList(var2.subList(0, var3));
                  }

                  Dev.ZWare.Client.Class1.field_301.method_933((List<BlockPos>)var2, var1);
               }
            }
         }
      }
   }

   // $VF: renamed from: c () java.util.List
   private List<BlockPos> method_2248() {
      BlockPos var1 = this.method_2249();
      BlockPos var2 = var1.method_10087(2);
      BlockState var3 = c.field_1687.method_8320(var2);
      return !var3.method_26215() && !var3.method_45474() ? List.of() : List.of(var2.method_10062());
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   private BlockPos method_2249() {
      int var1 = c.field_1724.method_24515().method_10264();
      Box var2 = c.field_1724.method_5829().method_35580(1.0E-4, 0.0, 1.0E-4);
      int var3 = MathHelper.method_15357(var2.field_1323);
      int var4 = MathHelper.method_15357(var2.field_1320);
      int var5 = MathHelper.method_15357(var2.field_1321);
      int var6 = MathHelper.method_15357(var2.field_1324);
      BlockPos var7 = null;
      double var8 = -1.0;
      double var10 = Double.POSITIVE_INFINITY;

      for (int var12 = var3; var12 <= var4; var12++) {
         for (int var13 = var5; var13 <= var6; var13++) {
            double var14 = Math.min(var2.field_1320, var12 + 1.0) - Math.max(var2.field_1323, (double)var12);
            double var16 = Math.min(var2.field_1324, var13 + 1.0) - Math.max(var2.field_1321, (double)var13);
            if (!(var14 <= 0.0) && !(var16 <= 0.0)) {
               double var18 = var14 * var16;
               double var20 = c.field_1724.method_23317() - (var12 + 0.5);
               double var22 = c.field_1724.method_23321() - (var13 + 0.5);
               double var24 = var20 * var20 + var22 * var22;
               if (var18 > var8 || Math.abs(var18 - var8) <= 1.0E-6 && var24 < var10) {
                  var7 = new BlockPos(var12, var1, var13);
                  var8 = var18;
                  var10 = var24;
               }
            }
         }
      }

      return var7 != null ? var7 : c.field_1724.method_24515();
   }

   public static enum Inner1 {
      PerTick,
      PaperMC;
   }

   public static enum Inner2 {
      Flat,
      // $VF: renamed from: All Dev.ZWare.Client.features.pkg1.pkg1.Class7$Inner2
      field_664,
      Below;
   }

   public static enum Inner3 {
      Closest,
      ClosestUp,
      Furthest,
      FurthestUp;
   }
}
