package Dev.ZWare.Client.features.pkg1.pkg3;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.Handler;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.InteractType;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.InteractTypeHandler;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class17 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1656 = 90.0;
   // $VF: renamed from: p int
   private static final int field_1657 = -1;
   // $VF: renamed from: q long
   private static final long field_1658 = 300L;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1659 = this.a("Rotate", true).method_683("General");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1660 = this.a("PauseEat", true).method_683("General");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1661 = this.a("EatingBreak", false).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1662 = this.a("Fire", true).method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1663 = this.a("SelfGround", true).method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1664 = this.a("MovingPause", true).method_683("General");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1665 = this.a("TargetRange", 4.5, 1.0, 8.0).method_683("General");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1666 = this.a("BreakRange", 5.0, 1.0, 8.0).method_683("General");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1667 = this.a("MinDamage", 6.0, 0.0, 20.0).method_683("Damage");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1668 = this.a("MaxSelfDamage", 8.0, 0.0, 20.0).method_683("Damage");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1669 = this.a("PistonDelay", 100, 0, 500).method_683("Timing");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1670 = this.a("CrystalDelay", 100, 0, 500).method_683("Timing");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1671 = this.a("RedstoneDelay", 100, 0, 500).method_683("Timing");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1672 = this.a("BreakDelay", 100, 0, 500).method_683("Timing");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1673 = this.a("Debug", false).method_683("Misc");
   // $VF: renamed from: G Dev.ZWare.Client.pkg1.pkg1.Class1
   private final Dev.ZWare.Client.pkg1.pkg1.Class1 field_1674 = new Dev.ZWare.Client.pkg1.pkg1.Class1();
   // $VF: renamed from: H net.minecraft.entity.player.PlayerEntity
   private PlayerEntity field_1675;
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
   private Class17.Inner6 field_1676;
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
   private Class17.Inner6 field_1677;
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner8
   private Class17.Inner8 field_1678;
   // $VF: renamed from: L net.minecraft.util.math.BlockPos
   private BlockPos field_1679;
   // $VF: renamed from: M long
   private long field_1680;
   // $VF: renamed from: N net.minecraft.util.math.BlockPos
   private BlockPos field_1681;
   // $VF: renamed from: O long
   private long field_1682;

   public Class17() {
      super("Piston Crystal", "Ni hao nigger", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2310();
      this.field_1674.method_618();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2310();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_1675 == null ? null : this.field_1675.method_5477().getString();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2254(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (var1.method_1045() instanceof BlockUpdateS2CPacket var2 && c.field_1687 != null) {
         if (this.field_1679 != null && this.field_1679.equals(var2.method_11309())) {
            if (var2.method_11308().method_26204() instanceof PistonBlock) {
               this.method_2301();
            } else if (var2.method_11308().method_26215()) {
               this.field_1680 = 0L;
            }
         }

         if (this.field_1681 != null && this.field_1681.equals(var2.method_11309())) {
            if (var2.method_11308().method_27852(Blocks.field_10002)) {
               this.method_2302();
            } else if (var2.method_11308().method_26215()) {
               this.field_1682 = 0L;
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner2) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_2255(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2 var1) {
      this.field_1677 = null;
      this.field_1678 = null;
      if (!g() && c.method_1562() != null && Dev.ZWare.Client.Class1.field_301 != null) {
         this.field_1675 = this.method_2259();
         if (this.field_1675 != null) {
            if (!this.field_1663.method_671() || c.field_1724.method_24828()) {
               if (!this.field_1664.method_671() || !this.method_2297()) {
                  boolean var2 = this.field_1660.method_671() && this.method_2304();
                  Class17.Inner3 var3 = null;
                  if (!var2) {
                     this.field_1677 = this.method_2264(this.field_1675);
                     if (this.field_1677 != null) {
                        var3 = this.method_2265(this.field_1677);
                        if (var3 != null) {
                           this.field_1678 = var3.method_242();
                        }
                     }
                  }

                  Class17.Inner1 var4 = null;
                  boolean var5 = !var2 && this.field_1677 != null && this.method_2299(this.field_1677);
                  if (var3 == null && !var5 && (!var2 || this.field_1661.method_671())) {
                     var4 = this.method_2261(this.field_1675);
                     if (var4 != null) {
                        this.field_1678 = Class17.Inner8.BreakCrystal;
                     }
                  }

                  if (var3 != null) {
                     if (this.field_1674.method_614(this.method_2298(var3.method_242()))) {
                        Class17.Inner3 var7 = var3;
                        this.method_2256(var7.method_242(), var7.method_243(), () -> this.method_2257(var7));
                     }
                  } else if (var4 != null) {
                     if (this.field_1674.method_614(this.method_2298(Class17.Inner8.BreakCrystal))) {
                        Class17.Inner1 var6 = var4;
                        this.method_2256(this.field_1678, var6.method_68(), () -> this.method_2258(var6));
                     }
                  } else if (var2 || this.field_1677 == null) {
                     ;
                  }
               }
            }
         }
      } else {
         this.field_1675 = null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner8, net.minecraft.util.math.Vec3d, java.lang.Runnable) void
   private void method_2256(Class17.Inner8 var1, Vec3d var2, Runnable var3) {
      if (var3 != null) {
         if (var1 == Class17.Inner8.PlacePiston) {
            var3.run();
         } else if (this.field_1659.method_671() && var2 != null) {
            Dev.ZWare.Client.Class1.field_298.method_316(var2, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("PistonCrystal", 90.0), var3);
         } else {
            var3.run();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner3) void
   private void method_2257(Class17.Inner3 var1) {
      if (this.d() && !g() && var1 != null) {
         boolean var2 = switch (var1.method_242()) {
            case PlacePiston -> this.method_2266(var1.method_241());
            case PlaceCrystal -> this.method_2269(var1.method_241().method_1003());
            case PlaceRedstone -> this.method_2267(var1.method_241());
            case PlaceFire -> this.method_2270(var1.method_241().method_1000());
            case BreakCrystal -> false;
         };
         if (var2) {
            if (var1.method_241() != null) {
               this.field_1676 = var1.method_241();
            }

            if (this.field_1673.method_671()) {
               Dev.ZWare.Client.features.pkg2.Class1.method_1647("PistonCrystal action: %s", var1.method_242().name());
            }

            this.field_1674.method_618();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner1) boolean
   private boolean method_2258(Class17.Inner1 var1) {
      if (var1 != null && var1.method_66() != null && c.method_1562() != null) {
         this.method_2308(var1.method_66().method_5628());
         c.method_1562().method_52787(new HandSwingC2SPacket(Hand.field_5808));
         this.field_1674.method_618();
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_2259() {
      PlayerEntity var1 = null;
      double var2 = Double.POSITIVE_INFINITY;
      double var4 = this.field_1665.method_671() * this.field_1665.method_671();

      for (PlayerEntity var7 : c.field_1687.method_18456()) {
         if (this.method_2260(var7)) {
            double var8 = c.field_1724.method_5858(var7);
            if (!(var8 > var4) && !(var8 >= var2)) {
               var2 = var8;
               var1 = var7;
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2260(PlayerEntity var1) {
      if (var1 == null || var1 == c.field_1724 || var1 == c.field_1719) {
         return false;
      } else {
         return var1.method_5805() && !var1.method_31481() && !var1.method_7325() && !var1.method_68878()
            ? Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var1)
            : false;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner1
   private Class17.Inner1 method_2261(PlayerEntity var1) {
      Box var2 = var1.method_5829().method_1014(3.0);
      Class17.Inner1 var3 = null;

      for (EndCrystalEntity var5 : c.field_1687.method_8390(EndCrystalEntity.class, var2, var0 -> true)) {
         if (this.method_2262(var1, var5.method_24515())) {
            Vec3d var6 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
            if (!(Dev.ZWare.Client.pkg1.Class7.method_121(var6, var5.method_5829()) > this.field_1666.method_671() * this.field_1666.method_671())) {
               double var7 = this.method_2295(var1, var5.method_19538());
               if (!(var7 < this.field_1667.method_671())) {
                  double var9 = this.method_2295(c.field_1724, var5.method_19538());
                  if (!this.method_2296(var9) && (var3 == null || var7 > var3.method_67())) {
                     Vec3d var11 = Dev.ZWare.Client.pkg1.Class3.method_590(c.field_1724, var5.method_5829());
                     Vec3d var12 = Dev.ZWare.Client.pkg1.Class3.method_591(var5.method_5829(), var11);
                     var3 = new Class17.Inner1(var5, var7, var12);
                  }
               }
            }
         }
      }

      return var3;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2262(PlayerEntity var1, BlockPos var2) {
      BlockPos var3 = var1.method_24515();

      for (Direction var5 : this.method_2309()) {
         if (var2.equals(var3.method_10084().method_10093(var5)) || var2.equals(var3.method_10086(2).method_10093(var5))) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
   private Class17.Inner6 method_2263(PlayerEntity var1) {
      Item var2 = this.method_2281();
      boolean var3 = this.method_2280(Blocks.field_10002);
      boolean var4 = this.method_2274(var0 -> var0.method_31574(Items.field_8301)) != null;
      Class17.Inner6 var5 = null;
      double var6 = Double.NEGATIVE_INFINITY;

      for (BlockPos var9 : this.method_2282(var1)) {
         for (Direction var11 : this.method_2309()) {
            BlockPos var12 = var9.method_10093(var11).method_10062();
            if (this.method_2289(var12, var4)) {
               double var13 = this.method_2295(var1, this.method_2294(var12));
               if (!(var13 < this.field_1667.method_671())) {
                  double var15 = this.method_2295(c.field_1724, this.method_2294(var12));
                  if (!this.method_2296(var15)) {
                     for (BlockPos var18 : this.method_2283(var9, var11)) {
                        boolean var19 = this.method_2291(var18, var11);
                        if (var19 || var2 != null && this.method_2275(var2, var18)) {
                           BlockPos var20 = this.method_2284(var18, var11, var12, var3, var19);
                           if (var20 != null) {
                              BlockPos var21 = this.field_1662.method_671() ? this.method_2286(var9, var11) : null;
                              Vec3d var22 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
                              double var23 = var13 - var15 * 0.35 - var22.method_1025(var18.method_46558()) * 0.01;
                              if (var19) {
                                 var23 += 0.5;
                              }

                              if (this.method_2290(var12)) {
                                 var23 += 0.4;
                              }

                              if (this.method_2292(var18, var11, var12)) {
                                 var23 += 0.3;
                              }

                              if (var5 == null || var23 > var6) {
                                 var6 = var23;
                                 var5 = new Class17.Inner6(
                                    var1.method_5628(), var9.method_10062(), var12, var18.method_10062(), var20.method_10062(), var11, var21, var13, var15
                                 );
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var5;
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
   private Class17.Inner6 method_2264(PlayerEntity var1) {
      if (this.method_2303(this.field_1676, var1)) {
         return this.field_1676;
      } else {
         this.field_1676 = null;
         return this.method_2263(var1);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner3
   private Class17.Inner3 method_2265(Class17.Inner6 var1) {
      if (this.method_2300(this.field_1679, var1.method_997(), this.field_1680)) {
         return null;
      } else {
         if (this.field_1679 != null && this.field_1679.equals(var1.method_997())) {
            this.method_2301();
         }

         if (!this.method_2291(var1.method_997(), var1.method_999())) {
            return new Class17.Inner3(var1, Class17.Inner8.PlacePiston, this.method_2293(var1));
         } else if (!this.method_2290(var1.method_996()) && this.method_2288(var1.method_1003())) {
            return new Class17.Inner3(var1, Class17.Inner8.PlaceCrystal, var1.method_1003().method_46558());
         } else if (this.method_2300(this.field_1681, var1.method_998(), this.field_1682)) {
            return null;
         } else {
            if (this.field_1681 != null && this.field_1681.equals(var1.method_998())) {
               this.method_2302();
            }

            if (!this.method_2292(var1.method_997(), var1.method_999(), var1.method_996())) {
               BlockPos var2 = this.method_2285(var1);
               if (var2 == null) {
                  this.field_1676 = null;
                  return null;
               } else {
                  Class17.Inner6 var3 = var2.equals(var1.method_998()) ? var1 : var1.method_1004(var2);
                  return new Class17.Inner3(var3, Class17.Inner8.PlaceRedstone, var2.method_46558());
               }
            } else {
               return this.field_1662.method_671() && var1.method_1000() != null && c.field_1687.method_8320(var1.method_1000()).method_26215()
                  ? new Class17.Inner3(var1, Class17.Inner8.PlaceFire, var1.method_1000().method_10074().method_46558())
                  : null;
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6) boolean
   private boolean method_2266(Class17.Inner6 var1) {
      Item var2 = this.method_2281();
      if (var2 != null && var1 != null && c.field_1687 != null) {
         if (this.field_1659.method_671()
            && !Dev.ZWare.Client.Class1.field_298
               .method_310(this.method_2293(var1), Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("PistonCrystal", 90.0))) {
            return false;
         } else {
            BlockState var3 = c.field_1687.method_8320(var1.method_997());
            if (!Dev.ZWare.Client.Class1.field_301.method_914(var1.method_997(), var3, var2)) {
               return false;
            } else {
               boolean var5;
               try {
                  boolean var4 = Dev.ZWare.Client.Class1.field_301.method_922(var2, var1.method_997(), var3, Hand.field_5808, false);
                  if (var4) {
                     this.field_1679 = var1.method_997().method_10062();
                     this.field_1680 = System.currentTimeMillis();
                  }

                  var5 = var4;
               } finally {
                  Dev.ZWare.Client.Class1.field_301.method_929();
               }

               return var5;
            }
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6) boolean
   private boolean method_2267(Class17.Inner6 var1) {
      BlockPos var2 = this.method_2285(var1);
      if (var2 == null) {
         this.field_1676 = null;
         return false;
      } else if (c.field_1687.method_8320(var2).method_27852(Blocks.field_10002)) {
         return false;
      } else {
         boolean var3 = this.method_2268(Blocks.field_10002.method_8389(), var2);
         if (var3 && this.field_1676 != null && this.field_1676.method_994() == var1.method_994()) {
            this.field_1676 = var1.method_1004(var2);
            this.field_1681 = var2.method_10062();
            this.field_1682 = System.currentTimeMillis();
         }

         return var3;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2268(Item var1, BlockPos var2) {
      if (var1 != null && var2 != null && c.field_1687 != null) {
         BlockState var3 = c.field_1687.method_8320(var2);
         if (!Dev.ZWare.Client.Class1.field_301.method_914(var2, var3, var1)) {
            return false;
         } else {
            boolean var4;
            try {
               var4 = Dev.ZWare.Client.Class1.field_301.method_922(var1, var2, var3, Hand.field_5808, true);
            } finally {
               Dev.ZWare.Client.Class1.field_301.method_929();
            }

            return var4;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2269(BlockPos var1) {
      if (var1 != null && this.method_2288(var1)) {
         Class17.Inner2 var2 = this.method_2306();
         if (var2 == null) {
            return false;
         } else {
            boolean var5;
            try {
               BlockHitResult var3 = Dev.ZWare.Client.pkg1.Class14.method_507(var1, this.method_2279());
               if (var3 == null) {
                  var3 = new BlockHitResult(var1.method_46558().method_1031(0.0, 0.5, 0.0), Direction.field_11036, var1, false);
               }

               int var4 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
               c.method_1562().method_52787(new PlayerInteractBlockC2SPacket(var2.method_443(), var3, var4));
               c.field_1724.method_6104(var2.method_443());
               var5 = true;
            } finally {
               this.method_2307(var2);
            }

            return var5;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2270(BlockPos var1) {
      if (var1 != null && this.method_2287(var1)) {
         Class17.Inner7 var2 = this.method_2274(var0 -> var0.method_31574(Items.field_8884) || var0.method_31574(Items.field_8814));
         if (var2 == null) {
            return false;
         } else {
            BlockHitResult var3 = new BlockHitResult(
               var1.method_10074().method_46558().method_1031(0.0, 0.5, 0.0), Direction.field_11036, var1.method_10074(), false
            );
            if (var2.method_3792() == Hand.field_5810) {
               return this.method_2271(var2.method_3792(), var3);
            } else {
               Class17.Inner5 var4 = this.method_2272(var2.method_3793());
               if (var4 == null) {
                  return false;
               } else {
                  boolean var5;
                  try {
                     var5 = this.method_2271(Hand.field_5808, var3);
                  } finally {
                     this.method_2273(var4);
                  }

                  return var5;
               }
            }
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.Hand, net.minecraft.util.hit.BlockHitResult) boolean
   private boolean method_2271(Hand var1, BlockHitResult var2) {
      if (var1 != null && var2 != null && c.method_1562() != null && c.field_1687 != null) {
         c.method_1562()
            .method_52787(new PlayerInteractBlockC2SPacket(var1, var2, ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942()));
         c.method_1562().method_52787(new HandSwingC2SPacket(var1));
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner5
   private Class17.Inner5 method_2272(int var1) {
      if (var1 == -1) {
         return new Class17.Inner5(null, -1, -1);
      } else {
         Dev.ZWare.Client.pkg1.Class9.Inner1 var2 = Dev.ZWare.Client.pkg1.Class9.method_147(var1);
         if (var2 != null) {
            return new Class17.Inner5(var2, -1, -1);
         } else {
            int var3 = c.field_1724.method_31548().method_67532();
            return !Dev.ZWare.Client.pkg1.Class9.method_145(var1) ? null : new Class17.Inner5(null, var3, var1 > 8 ? var1 : -1);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner5) void
   private void method_2273(Class17.Inner5 var1) {
      if (var1 != null) {
         if (var1.method_101() != null) {
            Dev.ZWare.Client.pkg1.Class9.method_149(var1.method_101());
         } else {
            if (var1.method_103() != -1) {
               Dev.ZWare.Client.pkg1.Class9.method_145(var1.method_103());
            }

            if (var1.method_102() != -1) {
               Dev.ZWare.Client.pkg1.Class9.method_151(var1.method_102());
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.function.Predicate) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner7
   private Class17.Inner7 method_2274(Predicate<ItemStack> var1) {
      if (var1.test(c.field_1724.method_6079())) {
         return new Class17.Inner7(Hand.field_5810, -1);
      } else if (var1.test(c.field_1724.method_6047())) {
         return new Class17.Inner7(Hand.field_5808, -1);
      } else {
         int var2 = Dev.ZWare.Client.pkg1.Class9.method_140(var1, 0, 35);
         return var2 == -1 ? null : new Class17.Inner7(Hand.field_5808, var2);
      }
   }

   // $VF: renamed from: b (net.minecraft.item.Item, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2275(Item var1, BlockPos var2) {
      return var1 != null && var2 != null && this.method_2278(var2) && Dev.ZWare.Client.Class1.field_301.method_928(var1, var2, c.field_1687.method_8320(var2));
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos, boolean) boolean
   private boolean method_2276(BlockPos var1, BlockPos var2, boolean var3) {
      if (var1 != null && var2 != null && this.method_2278(var1)) {
         BlockState var4 = c.field_1687.method_8320(var1);
         if (!var4.method_45474()) {
            return false;
         } else {
            return this.method_2275(Blocks.field_10002.method_8389(), var1) ? true : !var3 && this.method_2277(var1, var2);
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2277(BlockPos var1, BlockPos var2) {
      return World.method_25953(var1) && var1.method_19455(var2) == 1
         ? c.field_1687.method_8628(Blocks.field_10002.method_9564(), var1, ShapeContext.method_16194())
         : false;
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2278(BlockPos var1) {
      double var2 = this.method_2279();
      Vec3d var4 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
      return Dev.ZWare.Client.pkg1.Class7.method_121(var4, new Box(var1)) <= var2 * var2;
   }

   // $VF: renamed from: a () double
   private double method_2279() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   // $VF: renamed from: a (net.minecraft.block.Block) boolean
   private boolean method_2280(Block var1) {
      return Dev.ZWare.Client.pkg1.Class9.method_140(var1x -> var1x.method_31574(var1.method_8389()), 0, 35) != -1;
   }

   // $VF: renamed from: a () net.minecraft.item.Item
   private Item method_2281() {
      int var1 = Dev.ZWare.Client.pkg1.Class9.method_140(
         var0 -> !var0.method_7960() && var0.method_7909() instanceof BlockItem var1x ? var1x.method_7711() instanceof PistonBlock : false, 0, 35
      );
      return var1 == -1 ? null : c.field_1724.method_31548().method_5438(var1).method_7909();
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) java.util.List
   private List<BlockPos> method_2282(PlayerEntity var1) {
      ArrayList var2 = new ArrayList(2);
      BlockPos var3 = var1.method_24515();
      var2.add(var3.method_10084().method_10062());
      var2.add(var3.method_10086(2).method_10062());
      return var2;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction) java.util.List
   private List<BlockPos> method_2283(BlockPos var1, Direction var2) {
      ArrayList var3 = new ArrayList(1);
      var3.add(var1.method_10079(var2, 2).method_10062());
      return var3;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, net.minecraft.util.math.BlockPos, boolean, boolean) net.minecraft.util.math.BlockPos
   private BlockPos method_2284(BlockPos var1, Direction var2, BlockPos var3, boolean var4, boolean var5) {
      BlockPos var6 = null;
      double var7 = Double.POSITIVE_INFINITY;

      for (Direction var12 : Direction.values()) {
         if (var12 != var2.method_10153()) {
            BlockPos var13 = var1.method_10093(var12);
            if (!var13.equals(var3)) {
               if (c.field_1687.method_8320(var13).method_27852(Blocks.field_10002)) {
                  return var13.method_10062();
               }

               if (var4 && this.method_2276(var13, var1, var5)) {
                  Vec3d var14 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
                  double var15 = var14.method_1025(var13.method_46558());
                  if (var15 < var7) {
                     var7 = var15;
                     var6 = var13.method_10062();
                  }
               }
            }
         }
      }

      return var6;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6) net.minecraft.util.math.BlockPos
   private BlockPos method_2285(Class17.Inner6 var1) {
      if (var1 == null) {
         return null;
      } else if (c.field_1687.method_8320(var1.method_998()).method_27852(Blocks.field_10002)) {
         return var1.method_998();
      } else {
         return this.method_2275(Blocks.field_10002.method_8389(), var1.method_998())
            ? var1.method_998()
            : this.method_2284(var1.method_997(), var1.method_999(), var1.method_996(), this.method_2280(Blocks.field_10002), true);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction) net.minecraft.util.math.BlockPos
   private BlockPos method_2286(BlockPos var1, Direction var2) {
      if (!this.field_1662.method_671()) {
         return null;
      } else {
         int[] var3 = new int[]{0, var2.method_10165(), -var2.method_10165()};
         int[] var4 = new int[]{0, 1};
         int[] var5 = new int[]{0, var2.method_10148(), -var2.method_10148()};

         for (int var9 : var3) {
            for (int var13 : var4) {
               for (int var17 : var5) {
                  BlockPos var18 = var1.method_10069(var9, var13, var17);
                  if (c.field_1687.method_8320(var18).method_27852(Blocks.field_10036)) {
                     return null;
                  }
               }
            }
         }

         for (int var22 : var3) {
            for (int var26 : var4) {
               for (int var30 : var5) {
                  BlockPos var31 = var1.method_10069(var22, var26, var30).method_10062();
                  if (this.method_2287(var31)) {
                     return var31;
                  }
               }
            }
         }

         return null;
      }
   }

   // $VF: renamed from: d (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2287(BlockPos var1) {
      if (var1 == null || !this.method_2278(var1)) {
         return false;
      } else if (!c.field_1687.method_8320(var1).method_26215()) {
         return false;
      } else {
         BlockPos var2 = var1.method_10074();
         BlockState var3 = c.field_1687.method_8320(var2);
         return !var3.method_26215() && !var3.method_45474();
      }
   }

   // $VF: renamed from: e (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2288(BlockPos var1) {
      if (var1 != null && this.method_2278(var1)) {
         Block var2 = c.field_1687.method_8320(var1).method_26204();
         return var2 != Blocks.field_10540 && var2 != Blocks.field_9987 ? false : this.method_2289(var1.method_10084(), true);
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, boolean) boolean
   private boolean method_2289(BlockPos var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         BlockPos var3 = var1.method_10074();
         Block var4 = c.field_1687.method_8320(var3).method_26204();
         if (var4 != Blocks.field_10540 && var4 != Blocks.field_9987) {
            return false;
         } else if (!this.method_2278(var3)) {
            return false;
         } else if (this.method_2290(var1)) {
            return true;
         } else if (!var2) {
            return false;
         } else {
            BlockState var5 = c.field_1687.method_8320(var1);
            if (!var5.method_26215() && !var5.method_27852(Blocks.field_10036)) {
               return false;
            } else if (!c.field_1687.method_8320(var1.method_10084()).method_26215()) {
               return false;
            } else {
               Box var6 = new Box(
                  var1.method_10263(),
                  var1.method_10264(),
                  var1.method_10260(),
                  var1.method_10263() + 1.0,
                  var1.method_10264() + 2.0,
                  var1.method_10260() + 1.0
               );

               for (Entity var8 : c.field_1687.method_8335(null, var6)) {
                  if (!(var8 instanceof EndCrystalEntity)) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   // $VF: renamed from: f (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2290(BlockPos var1) {
      Box var2 = new Box(
         var1.method_10263(), var1.method_10264(), var1.method_10260(), var1.method_10263() + 1.0, var1.method_10264() + 2.0, var1.method_10260() + 1.0
      );

      for (EndCrystalEntity var4 : c.field_1687.method_8390(EndCrystalEntity.class, var2, var0 -> true)) {
         if (var4.method_24515().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction) boolean
   private boolean method_2291(BlockPos var1, Direction var2) {
      BlockState var3 = c.field_1687.method_8320(var1);
      return !(var3.method_26204() instanceof PistonBlock) ? false : ((Direction)var3.method_11654(FacingBlock.field_10927)).method_10153() == var2;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2292(BlockPos var1, Direction var2, BlockPos var3) {
      BlockState var4 = c.field_1687.method_8320(var1);
      if (var4.method_26204() instanceof PistonBlock && (Boolean)var4.method_11654(PistonBlock.field_12191)) {
         return true;
      } else {
         for (Direction var8 : Direction.values()) {
            if (var8 != var2.method_10153()) {
               BlockPos var9 = var1.method_10093(var8);
               if (!var9.equals(var3) && c.field_1687.method_8320(var9).method_27852(Blocks.field_10002)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6) net.minecraft.util.math.Vec3d
   private Vec3d method_2293(Class17.Inner6 var1) {
      Vec3d var2 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
      return var2.method_1031(var1.method_999().method_10148() * 6.0, 0.0, var1.method_999().method_10165() * 6.0);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.Vec3d
   private Vec3d method_2294(BlockPos var1) {
      return new Vec3d(var1.method_10263() + 0.5, var1.method_10264(), var1.method_10260() + 0.5);
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Vec3d) double
   private double method_2295(PlayerEntity var1, Vec3d var2) {
      return Dev.ZWare.Client.pkg1.Class17.method_292(var1, var1.method_5829(), var2, Set.of());
   }

   // $VF: renamed from: a (double) boolean
   private boolean method_2296(double var1) {
      return var1 > this.field_1668.method_671() ? true : var1 + 1.0 >= c.field_1724.method_6032() + c.field_1724.method_6067();
   }

   // $VF: renamed from: a () boolean
   private boolean method_2297() {
      return Math.abs(c.field_1724.field_3913.method_3128().field_1342) > 0.001
         || Math.abs(c.field_1724.field_3913.method_3128().field_1343) > 0.001
         || c.field_1724.method_18798().method_37268() > 0.0025;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner8) int
   private int method_2298(Class17.Inner8 var1) {
      return switch (var1) {
         case PlacePiston -> this.field_1669.method_671();
         case PlaceCrystal -> this.field_1670.method_671();
         case PlaceRedstone, PlaceFire -> this.field_1671.method_671();
         case BreakCrystal -> this.field_1672.method_671();
      };
   }

   // $VF: renamed from: c (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6) boolean
   private boolean method_2299(Class17.Inner6 var1) {
      if (var1 == null) {
         return false;
      } else if (!this.method_2291(var1.method_997(), var1.method_999())) {
         return true;
      } else if (!this.method_2290(var1.method_996()) && this.method_2288(var1.method_1003())) {
         return true;
      } else {
         return !this.method_2292(var1.method_997(), var1.method_999(), var1.method_996())
            ? true
            : this.field_1662.method_671() && var1.method_1000() != null && c.field_1687.method_8320(var1.method_1000()).method_26215();
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos, long) boolean
   private boolean method_2300(BlockPos var1, BlockPos var2, long var3) {
      return var1 != null && var2 != null && var1.equals(var2) && System.currentTimeMillis() - var3 < 300L;
   }

   // $VF: renamed from: n () void
   private void method_2301() {
      this.field_1679 = null;
      this.field_1680 = 0L;
   }

   // $VF: renamed from: o () void
   private void method_2302() {
      this.field_1681 = null;
      this.field_1682 = 0L;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6, net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2303(Class17.Inner6 var1, PlayerEntity var2) {
      if (var1 != null && var2 != null && var2.method_5628() == var1.method_994()) {
         boolean var3 = false;

         for (BlockPos var5 : this.method_2282(var2)) {
            if (var5.equals(var1.method_995())) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            return false;
         } else {
            BlockState var6 = c.field_1687.method_8320(var1.method_997());
            return var6.method_26204() instanceof PistonBlock ? true : this.method_2275(this.method_2281(), var1.method_997());
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_2304() {
      if (c.field_1724 == null) {
         return false;
      } else if (c.field_1724.method_6115() && this.method_2305(c.field_1724.method_6030())) {
         return true;
      } else {
         return !c.field_1690.field_1904.method_1434() ? false : this.method_2305(c.field_1724.method_6047()) || this.method_2305(c.field_1724.method_6079());
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2305(ItemStack var1) {
      if (var1 != null && !var1.method_7960()) {
         UseAction var2 = var1.method_7976();
         return var2 == UseAction.field_8950 || var2 == UseAction.field_8946;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner2
   private Class17.Inner2 method_2306() {
      if (c.field_1724.method_6047().method_31574(Items.field_8301)) {
         return new Class17.Inner2(null, -1, -1, Hand.field_5808, false);
      } else {
         int var1 = Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Items.field_8301), 0, 35);
         if (var1 == -1) {
            return null;
         } else {
            Dev.ZWare.Client.pkg1.Class9.Inner1 var2 = Dev.ZWare.Client.pkg1.Class9.method_147(var1);
            return var2 == null ? null : new Class17.Inner2(var2, -1, -1, Hand.field_5808, false);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner2) void
   private void method_2307(Class17.Inner2 var1) {
      if (var1 != null) {
         if (var1.method_440() != null) {
            Dev.ZWare.Client.pkg1.Class9.method_149(var1.method_440());
         } else if (var1.method_444()) {
            if (var1.method_442() != -1) {
               Dev.ZWare.Client.pkg1.Class9.method_145(var1.method_442());
            }

            if (var1.method_441() >= 0) {
               Dev.ZWare.Client.pkg1.Class9.method_151(var1.method_441());
            }
         }
      }
   }

   // $VF: renamed from: b (int) void
   private void method_2308(int var1) {
      InteractTypeHandler var2 = new InteractTypeHandler() {
         public InteractType method_34211() {
            return InteractType.field_29172;
         }

         public void method_34213(Handler handler) {
            handler.method_34218();
         }

         public void method_34212(PacketByteBuf buf) {
         }
      };
      c.method_1562().method_52787(Dev.ZWare.Client.mixin.Class10.invokeInit(var1, c.field_1724.method_5715(), var2));
   }

   // $VF: renamed from: a () java.lang.Iterable
   private Iterable<Direction> method_2309() {
      return EnumSet.of(Direction.field_11043, Direction.field_11035, Direction.field_11034, Direction.field_11039);
   }

   // $VF: renamed from: p () void
   private void method_2310() {
      this.field_1675 = null;
      this.field_1676 = null;
      this.field_1677 = null;
      this.field_1678 = null;
      this.method_2301();
      this.method_2302();
   }

   static class Inner1 {
      // $VF: renamed from: a net.minecraft.entity.decoration.EndCrystalEntity
      final EndCrystalEntity field_23;
      // $VF: renamed from: b double
      final double field_24;
      // $VF: renamed from: c net.minecraft.util.math.Vec3d
      final Vec3d field_25;

      Inner1(EndCrystalEntity var1, double var2, Vec3d var4) {
         this.field_23 = var1;
         this.field_24 = var2;
         this.field_25 = var4;
      }

      // $VF: renamed from: a () net.minecraft.entity.decoration.EndCrystalEntity
      EndCrystalEntity method_66() {
         return this.field_23;
      }

      // $VF: renamed from: a () double
      double method_67() {
         return this.field_24;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      Vec3d method_68() {
         return this.field_25;
      }
   }

   static class Inner2 {
      // $VF: renamed from: a Dev.ZWare.Client.pkg1.Class9$Inner1
      final Dev.ZWare.Client.pkg1.Class9.Inner1 field_217;
      // $VF: renamed from: b int
      final int field_218;
      // $VF: renamed from: c int
      final int field_219;
      // $VF: renamed from: d net.minecraft.util.Hand
      final Hand field_220;
      // $VF: renamed from: e boolean
      final boolean field_221;

      Inner2(Dev.ZWare.Client.pkg1.Class9.Inner1 var1, int var2, int var3, Hand var4, boolean var5) {
         this.field_217 = var1;
         this.field_218 = var2;
         this.field_219 = var3;
         this.field_220 = var4;
         this.field_221 = var5;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.pkg1.Class9$Inner1
      Dev.ZWare.Client.pkg1.Class9.Inner1 method_440() {
         return this.field_217;
      }

      // $VF: renamed from: a () int
      int method_441() {
         return this.field_218;
      }

      // $VF: renamed from: b () int
      int method_442() {
         return this.field_219;
      }

      // $VF: renamed from: a () net.minecraft.util.Hand
      Hand method_443() {
         return this.field_220;
      }

      // $VF: renamed from: a () boolean
      boolean method_444() {
         return this.field_221;
      }
   }

   static class Inner3 {
      // $VF: renamed from: a Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
      final Class17.Inner6 field_108;
      // $VF: renamed from: b Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner8
      final Class17.Inner8 field_109;
      // $VF: renamed from: c net.minecraft.util.math.Vec3d
      final Vec3d field_110;

      Inner3(Class17.Inner6 var1, Class17.Inner8 var2, Vec3d var3) {
         this.field_108 = var1;
         this.field_109 = var2;
         this.field_110 = var3;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
      Class17.Inner6 method_241() {
         return this.field_108;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner8
      Class17.Inner8 method_242() {
         return this.field_109;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      Vec3d method_243() {
         return this.field_110;
      }
   }

   static class Inner5 {
      // $VF: renamed from: a Dev.ZWare.Client.pkg1.Class9$Inner1
      final Dev.ZWare.Client.pkg1.Class9.Inner1 field_41;
      // $VF: renamed from: b int
      final int field_42;
      // $VF: renamed from: c int
      final int field_43;

      Inner5(Dev.ZWare.Client.pkg1.Class9.Inner1 var1, int var2, int var3) {
         this.field_41 = var1;
         this.field_42 = var2;
         this.field_43 = var3;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.pkg1.Class9$Inner1
      Dev.ZWare.Client.pkg1.Class9.Inner1 method_101() {
         return this.field_41;
      }

      // $VF: renamed from: a () int
      int method_102() {
         return this.field_42;
      }

      // $VF: renamed from: b () int
      int method_103() {
         return this.field_43;
      }
   }

   static class Inner6 {
      // $VF: renamed from: a int
      final int field_516;
      // $VF: renamed from: b net.minecraft.util.math.BlockPos
      final BlockPos field_517;
      // $VF: renamed from: c net.minecraft.util.math.BlockPos
      final BlockPos field_518;
      // $VF: renamed from: d net.minecraft.util.math.BlockPos
      final BlockPos field_519;
      // $VF: renamed from: e net.minecraft.util.math.BlockPos
      final BlockPos field_520;
      // $VF: renamed from: f net.minecraft.util.math.Direction
      final Direction field_521;
      // $VF: renamed from: g net.minecraft.util.math.BlockPos
      final BlockPos field_522;
      // $VF: renamed from: h double
      final double field_523;
      // $VF: renamed from: i double
      final double field_524;

      Inner6(int var1, BlockPos var2, BlockPos var3, BlockPos var4, BlockPos var5, Direction var6, BlockPos var7, double var8, double var10) {
         this.field_516 = var1;
         this.field_517 = var2;
         this.field_518 = var3;
         this.field_519 = var4;
         this.field_520 = var5;
         this.field_521 = var6;
         this.field_522 = var7;
         this.field_523 = var8;
         this.field_524 = var10;
      }

      // $VF: renamed from: a () int
      int method_994() {
         return this.field_516;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_995() {
         return this.field_517;
      }

      // $VF: renamed from: b () net.minecraft.util.math.BlockPos
      BlockPos method_996() {
         return this.field_518;
      }

      // $VF: renamed from: c () net.minecraft.util.math.BlockPos
      BlockPos method_997() {
         return this.field_519;
      }

      // $VF: renamed from: d () net.minecraft.util.math.BlockPos
      BlockPos method_998() {
         return this.field_520;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Direction
      Direction method_999() {
         return this.field_521;
      }

      // $VF: renamed from: e () net.minecraft.util.math.BlockPos
      BlockPos method_1000() {
         return this.field_522;
      }

      // $VF: renamed from: a () double
      double method_1001() {
         return this.field_523;
      }

      // $VF: renamed from: b () double
      double method_1002() {
         return this.field_524;
      }

      // $VF: renamed from: f () net.minecraft.util.math.BlockPos
      BlockPos method_1003() {
         return this.field_518.method_10074();
      }

      // $VF: renamed from: a (net.minecraft.util.math.BlockPos) Dev.ZWare.Client.features.pkg1.pkg3.Class17$Inner6
      Class17.Inner6 method_1004(BlockPos var1) {
         return new Class17.Inner6(
            this.field_516, this.field_517, this.field_518, this.field_519, var1, this.field_521, this.field_522, this.field_523, this.field_524
         );
      }
   }

   static class Inner7 {
      // $VF: renamed from: a net.minecraft.util.Hand
      final Hand field_3087;
      // $VF: renamed from: b int
      final int field_3088;

      Inner7(Hand var1, int var2) {
         this.field_3087 = var1;
         this.field_3088 = var2;
      }

      // $VF: renamed from: a () net.minecraft.util.Hand
      Hand method_3792() {
         return this.field_3087;
      }

      // $VF: renamed from: a () int
      int method_3793() {
         return this.field_3088;
      }
   }

   static enum Inner8 {
      PlacePiston,
      PlaceCrystal,
      PlaceRedstone,
      PlaceFire,
      BreakCrystal;
   }
}
