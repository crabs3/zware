package Dev.ZWare.Client.features.pkg1.pkg3;

import com.mojang.blaze3d.systems.RenderSystem;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Type;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class Class15 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2020 = -1000.0;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2021 = this.a("Range", 6.5, 0.0, 7.0).method_683("General");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class15.Inner4> field_2022 = this.a("Target Priority", Class15.Inner4.ClosestAngle)
      .method_683("General");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2023 = this.a("Ignore Nakeds", true).method_683("General");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class15.Inner7> field_2024 = this.a("Extend Break Mode", Class15.Inner7.None).method_683("General");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class15.Inner6> field_2025 = this.a("Logic", Class15.Inner6.NewLogic).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class15.Inner10> field_2026 = this.a("Anti Swim Mode", Class15.Inner10.OnMineAndSwim)
      .method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class15.Inner1> field_2027 = this.a("Anti Surround Mode", Class15.Inner1.Auto).method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2028 = this.a("Pause Crystals While Eatting", true).method_683("General");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2029 = this.a("Anti Surround Inner Snap", true).method_683("General");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2030 = this.a("Anti Surround Outer Snap", true).method_683("General");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2031 = this.a("Anti Surround Outer Cooldown", 0.1, 0.0, 1.0).method_683("General");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2032 = this.a("Break Indicators Sync", true).method_683("General");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2033 = this.a("Break Indicators Sync Only With Friends", false).method_683("General");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2034 = this.a("Break Indicators Sync Penalty", 8.5, 0.0, 25.0).method_683("General");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2035 = this.a("Glass Place", false).method_683("General");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2036 = this.a("Glass Placement Delay", 10, 0, 20).method_683("General");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2037 = this.a("Glass Placement Spam Packets", 3, 1, 10).method_683("General");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2038 = this.a("Glass Placement Post Spam Ticks", 4, 0, 20).method_683("General");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2039 = this.a("Render Debug Priority Scores", false).method_683("Render");
   // $VF: renamed from: I org.joml.Matrix4f
   private final Matrix4f field_2040 = new Matrix4f();
   // $VF: renamed from: J org.joml.Matrix4f
   private final Matrix4f field_2041 = new Matrix4f();
   // $VF: renamed from: K org.joml.Vector4f
   private final Vector4f field_2042 = new Vector4f();
   // $VF: renamed from: L java.util.List
   private final List<Class15.Inner5> field_2043 = new ArrayList<>();
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg1.pkg3.Class8
   private Class8 field_2044;
   // $VF: renamed from: N net.minecraft.entity.player.PlayerEntity
   private PlayerEntity field_2045;
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner8
   private Class15.Inner8 field_2046;
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner8
   private Class15.Inner8 field_2047;
   // $VF: renamed from: Q net.minecraft.util.math.BlockPos
   private BlockPos field_2048;
   // $VF: renamed from: R net.minecraft.util.math.BlockPos
   private BlockPos field_2049;
   // $VF: renamed from: S boolean
   private boolean field_2050;
   // $VF: renamed from: T boolean
   private boolean field_2051;
   // $VF: renamed from: U int
   private int field_2052;
   // $VF: renamed from: V int
   private int field_2053 = -1;
   // $VF: renamed from: W long
   private long field_2054;
   // $VF: renamed from: X boolean
   private boolean field_2055;

   public Class15() {
      super(
         "Auto Mine",
         "mines blocks around niggas needs doublemine enabled to work tho",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT,
         true,
         false,
         false
      );
      this.field_2028.method_709(var1 -> !this.method_2682() && this.field_2027.method_671() != Class15.Inner1.None);
      this.field_2029.method_709(var1 -> this.field_2027.method_671() == Class15.Inner1.Auto || this.field_2027.method_671() == Class15.Inner1.Inner);
      this.field_2030.method_709(var1 -> this.field_2027.method_671() == Class15.Inner1.Auto || this.field_2027.method_671() == Class15.Inner1.Outer);
      this.field_2031.method_709(var1 -> this.field_2027.method_671() == Class15.Inner1.Auto || this.field_2027.method_671() == Class15.Inner1.Outer);
      this.field_2033.method_709(var1 -> this.field_2032.method_671());
      this.field_2034.method_709(var1 -> this.field_2032.method_671());
      this.field_2036.method_709(var1 -> this.field_2035.method_671());
      this.field_2037.method_709(var1 -> this.field_2035.method_671());
      this.field_2038.method_709(var1 -> this.field_2035.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2044 = Class8.method_32();
      this.method_2685();
      this.method_2655();
      this.field_2054 = 0L;
      this.field_2055 = false;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2685();
      this.method_2655();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2643(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         this.method_2685();
      } else {
         if (this.field_2044 == null) {
            this.field_2044 = Class8.method_32();
         }

         this.method_2650();
         this.method_2653();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class2$Inner1) void
   @iFT13zrx_wTXP
   private void method_2644(Dev.ZWare.Client.pkg2.pkg1.Class2.Inner1 var1) {
      if (this.method_2682()) {
         this.method_2646(var1.a());
      } else {
         this.method_2647(var1.a());
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class2$Inner2) void
   @iFT13zrx_wTXP
   private void method_2645(Dev.ZWare.Client.pkg2.pkg1.Class2.Inner2 var1) {
      if (!this.method_2682()) {
         this.method_2647(var1.a());
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   private void method_2646(BlockPos var1) {
      if (!g() && this.field_2045 != null && var1 != null) {
         Class18 var2 = this.method_2676();
         if (var2 != null && !var2.e()) {
            Class15.Inner1 var3 = this.field_2027.method_671();
            if (var3 != Class15.Inner1.None) {
               if (var3 == Class15.Inner1.Auto || var3 == Class15.Inner1.Outer) {
                  for (Direction var5 : Type.field_11062) {
                     BlockPos var6 = this.field_2045.method_24515().method_10093(var5);
                     if (var1.equals(var6)) {
                        boolean var7 = System.currentTimeMillis() - this.field_2054 > this.field_2031.method_671() * 1000.0;
                        if (!var7) {
                           return;
                        }

                        Box var8 = new Box(var6).method_1009(0.75, 1.0, 0.75);
                        Box var9 = new Box(var6);

                        for (BlockPos var11 : BlockPos.method_10094(
                           (int)Math.floor(var8.field_1323),
                           (int)Math.floor(var8.field_1322),
                           (int)Math.floor(var8.field_1321),
                           (int)Math.floor(var8.field_1320),
                           (int)Math.floor(var8.field_1325),
                           (int)Math.floor(var8.field_1324)
                        )) {
                           BlockPos var12 = var11.method_10062();
                           if (c.field_1687.method_22347(var12)) {
                              BlockState var13 = c.field_1687.method_8320(var12.method_10074());
                              if (var13.method_27852(Blocks.field_10540) || var13.method_27852(Blocks.field_9987)) {
                                 Box var14 = new Box(
                                    var12.method_10263(),
                                    var12.method_10264(),
                                    var12.method_10260(),
                                    var12.method_10263() + 1.0,
                                    var12.method_10264() + 2.0,
                                    var12.method_10260() + 1.0
                                 );
                                 if (!var2.method_2857(var14, false)) {
                                    Vec3d var15 = new Vec3d(var12.method_10263() + 0.5, var12.method_10264(), var12.method_10260() + 0.5);
                                    Box var16 = new Box(
                                       var15.field_1352 - 1.0,
                                       var15.field_1351,
                                       var15.field_1350 - 1.0,
                                       var15.field_1352 + 1.0,
                                       var15.field_1351 + 2.0,
                                       var15.field_1350 + 1.0
                                    );
                                    if (var16.method_994(var9)) {
                                       var2.method_2854(var12, this.field_2030.method_671());
                                       this.field_2054 = System.currentTimeMillis();
                                       return;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               if (var3 == Class15.Inner1.Auto || var3 == Class15.Inner1.Inner) {
                  for (Direction var18 : Type.field_11062) {
                     BlockPos var19 = this.field_2045.method_24515().method_10093(var18);
                     if (var19.equals(var1)) {
                        var2.method_2854(var19, this.field_2029.method_671());
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) void
   private void method_2647(BlockPos var1) {
      if (!g() && this.field_2045 != null && var1 != null) {
         Class18 var2 = this.method_2676();
         if (var2 != null && !var2.e()) {
            if (!this.field_2028.method_671() || !c.field_1724.method_6115()) {
               BlockState var3 = c.field_1687.method_8320(this.field_2045.method_24515());
               if (!var3.method_27852(Blocks.field_9987)) {
                  Class15.Inner1 var4 = this.field_2027.method_671();
                  if (var4 != Class15.Inner1.None) {
                     if (var4 == Class15.Inner1.Auto || var4 == Class15.Inner1.Outer) {
                        for (Direction var6 : Type.field_11062) {
                           BlockPos var7 = this.field_2045.method_24515().method_10093(var6);
                           if (var1.equals(var7)) {
                              boolean var8 = System.currentTimeMillis() - this.field_2054 > this.field_2031.method_671() * 1000.0;
                              if (!var8) {
                                 return;
                              }

                              Box var9 = new Box(var7);

                              for (Direction var13 : Direction.values()) {
                                 BlockPos var14 = var1.method_10093(var13);
                                 if (c.field_1687.method_22347(var14)) {
                                    BlockState var15 = c.field_1687.method_8320(var14.method_10074());
                                    if (var15.method_27852(Blocks.field_10540) || var15.method_27852(Blocks.field_9987)) {
                                       Box var16 = new Box(
                                          var14.method_10263(),
                                          var14.method_10264(),
                                          var14.method_10260(),
                                          var14.method_10263() + 1.0,
                                          var14.method_10264() + 2.0,
                                          var14.method_10260() + 1.0
                                       );
                                       if (!var2.method_2857(var16, false)) {
                                          Vec3d var17 = new Vec3d(var14.method_10263() + 0.5, var14.method_10264(), var14.method_10260() + 0.5);
                                          Box var18 = new Box(
                                             var17.field_1352 - 1.0,
                                             var17.field_1351,
                                             var17.field_1350 - 1.0,
                                             var17.field_1352 + 1.0,
                                             var17.field_1351 + 2.0,
                                             var17.field_1350 + 1.0
                                          );
                                          if (var18.method_994(var9)) {
                                             var2.method_2854(var14, this.field_2030.method_671());
                                             this.field_2054 = System.currentTimeMillis();
                                             return;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (var4 == Class15.Inner1.Auto || var4 == Class15.Inner1.Inner) {
                        for (Direction var20 : Type.field_11062) {
                           BlockPos var21 = this.field_2045.method_24515().method_10093(var20);
                           if (var21.equals(var1)) {
                              var2.method_2854(var21, this.field_2029.method_671());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2039.method_671() && !g()) {
         this.method_2683(event);
      } else {
         this.field_2043.clear();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (this.field_2039.method_671() && !this.field_2043.isEmpty()) {
         for (Class15.Inner5 var3 : this.field_2043) {
            String var4 = String.format("%.1f", var3.method_164());
            float var5 = (float)var3.method_165().field_1352 - Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4) / 2.0F;
            float var6 = (float)var3.method_165().field_1351;
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(event.method_1053(), var4, var5, var6, Color.WHITE.getRGB());
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2045 == null ? null : this.field_2045.method_5477().getString();
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   public boolean method_2648(BlockPos blockPos) {
      return this.field_2046 != null && this.field_2046.field_26.equals(blockPos) || this.field_2047 != null && this.field_2047.field_26.equals(blockPos);
   }

   // $VF: renamed from: a () boolean
   public boolean method_2649() {
      return this.field_2046 != null && this.field_2047 != null;
   }

   // $VF: renamed from: n () void
   private void method_2650() {
      if (this.field_2044 != null && !this.field_2044.method_31()) {
         BlockPos var1 = c.field_1724.method_24515();
         BlockPos var2 = var1.method_10084();
         BlockState var3 = c.field_1687.method_8320(var1);
         BlockState var4 = c.field_1687.method_8320(var2);
         boolean var5 = Dev.ZWare.Client.pkg1.Class13.method_414(var2, var4)
            && (var4.method_27852(Blocks.field_10540) || var4.method_27852(Blocks.field_22423));
         boolean var6 = false;
         if (this.field_2026.method_671() == Class15.Inner10.Always && var5) {
            this.field_2044.method_17(var2, 10.0);
            var6 = true;
         }

         if (this.field_2026.method_671() == Class15.Inner10.OnMineAndSwim && c.field_1724.method_20448() && var5) {
            this.field_2044.method_17(var2, 30.0);
            var6 = true;
         }

         if ((this.field_2026.method_671() == Class15.Inner10.OnMine || this.field_2026.method_671() == Class15.Inner10.OnMineAndSwim) && var5) {
            Dev.ZWare.Client.features.pkg1.pkg5.Class10 var7 = this.method_2675();
            if (var7 != null && var7.method_2605(var1)) {
               this.field_2044.method_17(var2, 20.0);
               var6 = true;
            }
         }

         this.field_2045 = this.method_2677();
         if (this.field_2045 == null) {
            this.method_2685();
         } else {
            if ((!this.field_2044.method_20() || !var4.method_27852(Blocks.field_10540) || !var3.method_26215() || !var2.equals(this.field_2044.method_24()))
               && !var6) {
               this.method_2658();
               if (this.method_2682()) {
                  this.method_2651();
               } else {
                  this.method_2652();
               }
            }
         }
      } else {
         this.method_2685();
         this.method_2655();
      }
   }

   // $VF: renamed from: o () void
   private void method_2651() {
      BlockPos var1 = this.field_2044.method_24();
      boolean var2 = this.field_2046 != null && this.field_2046.field_28 || this.field_2047 != null && this.field_2047.field_28;
      if (var2 || (this.field_2046 == null || !this.field_2046.field_26.equals(var1)) && (this.field_2047 == null || !this.field_2047.field_26.equals(var1))) {
         boolean var3 = this.field_2044.method_20() && this.field_2044.method_21() && !this.field_2044.method_26();
         if (!var3) {
            LinkedList var4 = new LinkedList();
            if (this.field_2046 != null) {
               var4.add(this.field_2046.field_26);
            }

            if (this.field_2047 != null) {
               var4.add(this.field_2047.field_26);
            }

            if (!var4.isEmpty() && this.field_2044.method_20()) {
               this.field_2044.method_17((BlockPos)var4.remove(), 20.0);
            }

            if (!var4.isEmpty() && (!this.field_2044.method_21() || this.field_2044.method_26())) {
               this.field_2044.method_17((BlockPos)var4.remove(), 20.0);
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2652() {
      int var1 = 0;
      if (!this.field_2044.method_20()) {
         var1++;
      }

      if (!this.field_2044.method_21() || this.field_2044.method_26()) {
         var1++;
      }

      if (var1 != 0) {
         LinkedList var2 = new LinkedList();
         if (this.field_2046 != null && !this.field_2044.method_28(this.field_2046.field_26)) {
            var2.add(this.field_2046.field_26);
         }

         if (this.field_2047 != null && !this.field_2044.method_28(this.field_2047.field_26)) {
            var2.add(this.field_2047.field_26);
         }

         for (int var3 = 0; !var2.isEmpty() && var3 < var1; var3++) {
            this.field_2044.method_17((BlockPos)var2.remove(), 20.0);
         }
      }
   }

   // $VF: renamed from: q () void
   private void method_2653() {
      if (!this.field_2035.method_671() || g() || this.field_2044 == null || this.field_2044.method_31() || this.field_2045 == null) {
         this.method_2655();
      } else if (!this.field_2044.method_26()) {
         this.method_2655();
      } else {
         BlockPos var1 = this.field_2044.method_24();
         if (var1 == null) {
            this.method_2655();
         } else {
            boolean var2 = this.field_2049 != null && this.field_2049.equals(var1);
            if (!var2 && !this.method_2648(var1)) {
               this.method_2655();
            } else {
               if (!var2) {
                  this.field_2049 = var1.method_10062();
                  this.field_2050 = false;
                  this.field_2051 = false;
                  this.field_2052 = 0;
                  this.field_2053 = -1;
               }

               BlockState var3 = c.field_1687.method_8320(var1);
               if (this.field_2050) {
                  if (var3.method_27852(Blocks.field_10033)) {
                     if (this.field_2053 > 0) {
                        this.field_2053--;
                        if (this.field_2053 > 0) {
                           return;
                        }
                     }

                     this.method_2654(var1);
                  } else if (var3.method_26215()) {
                     if (!this.field_2051) {
                        this.field_2051 = true;
                        this.field_2052 = this.field_2038.method_671();
                     }

                     if (this.field_2052 > 0) {
                        this.method_2654(var1);
                        this.field_2052--;
                     }
                  } else {
                     this.field_2050 = false;
                     this.field_2051 = false;
                     this.field_2052 = 0;
                     this.field_2053 = -1;
                  }
               } else if (var3.method_26215()) {
                  double var4 = this.method_2656();
                  double var6 = var4 * var4;
                  if (!(c.field_1724.method_33571().method_1025(Vec3d.method_24953(var1)) > var6)) {
                     if (Dev.ZWare.Client.Class1.field_301.method_914(var1, var3, Blocks.field_10033.method_8389())) {
                        boolean var8 = false;

                        try {
                           var8 = Dev.ZWare.Client.Class1.field_301.method_920(Blocks.field_10033.method_8389(), var1, var3);
                        } finally {
                           Dev.ZWare.Client.Class1.field_301.method_929();
                        }

                        if (var8) {
                           this.field_2050 = true;
                           this.field_2051 = false;
                           this.field_2052 = 0;
                           this.field_2053 = this.field_2036.method_671();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) void
   private void method_2654(BlockPos var1) {
      Class18 var2 = this.method_2676();
      if (var2 != null && !var2.e()) {
         var2.method_2856(var1, this.field_2037.method_671());
      }
   }

   // $VF: renamed from: r () void
   private void method_2655() {
      this.field_2049 = null;
      this.field_2050 = false;
      this.field_2051 = false;
      this.field_2052 = 0;
      this.field_2053 = -1;
   }

   // $VF: renamed from: a () double
   private double method_2656() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   public boolean method_2657(BlockPos pos) {
      if (!this.field_2035.method_671() || g() || pos == null || this.field_2045 == null) {
         return false;
      } else if (this.field_2049 != null && this.field_2049.equals(pos)) {
         BlockState var2 = c.field_1687.method_8320(pos);
         return var2.method_26215() ? true : this.field_2050 && var2.method_27852(Blocks.field_10033) && this.field_2053 > 0;
      } else {
         return false;
      }
   }

   // $VF: renamed from: s () void
   private void method_2658() {
      if (this.method_2682()) {
         this.field_2046 = this.method_2659(null);
         this.field_2048 = this.field_2046 != null ? this.field_2046.field_26 : null;
         this.field_2047 = this.method_2659(this.field_2046 != null ? this.field_2046.field_26 : null);
      } else {
         this.field_2046 = null;
         this.field_2047 = null;
         this.field_2048 = null;
         Class15.Inner8 var1 = this.method_2659(null);
         if (var1 == null) {
            return;
         }

         if (var1.field_29 == Class15.Inner9.TerrainBase) {
            this.field_2046 = var1;
            this.field_2048 = this.field_2046.field_26;
            this.field_2047 = new Class15.Inner8();
            this.field_2047.field_26 = var1.field_26.method_10084();
            this.field_2047.field_27 = var1.field_27 - 10.0;
            this.field_2047.field_29 = Class15.Inner9.Surround;
         } else {
            this.field_2046 = var1;
            this.field_2048 = this.field_2046.field_26;
            this.field_2047 = this.method_2659(this.field_2046 != null ? this.field_2046.field_26 : null);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner8
   private Class15.Inner8 method_2659(BlockPos var1) {
      if (this.field_2045 != null && this.field_2044 != null) {
         if (this.method_2682()) {
            Class15.Inner8 var17 = new Class15.Inner8();
            List var18 = this.method_2670(this.field_2045);
            boolean var19 = this.method_2671(var18);

            for (Class15.Inner3 var24 : this.method_2660(var19, var18)) {
               if (var1 == null || !var24.field_403.equals(var1)) {
                  Class15.Inner2 var27 = this.method_2663(var24, var19, var18);
                  if (var27 != null && !(var27.field_567 <= var17.field_27)) {
                     var17.field_26 = var27.field_566;
                     var17.field_27 = var27.field_567;
                     var17.field_28 = this.method_2667(var27.field_566, var18);
                     var17.field_29 = var24.field_404;
                  }
               }
            }

            return var17.field_26 != null ? var17 : null;
         } else {
            Class15.Inner8 var2 = new Class15.Inner8();
            var2.field_27 = -1000.0;
            List var3 = this.method_2670(this.field_2045);
            boolean var4 = this.method_2671(var3);
            boolean var5 = false;
            this.field_2055 = false;
            if (!var4) {
               boolean var6 = false;
               HashSet var7 = new HashSet();

               for (BlockPos var9 : var3) {
                  for (Direction var11 : Type.field_11062) {
                     BlockPos var12 = var9.method_10093(var11);
                     if (!var3.contains(var12)) {
                        var7.add(var12);
                     }
                  }
               }

               for (BlockPos var28 : var7) {
                  if (this.method_2672(var28.method_10074())) {
                     var6 = true;
                     break;
                  }
               }

               this.field_2055 = !var6;
            }

            for (Class15.Inner3 var26 : this.method_2660(var4, var3)) {
               if (var1 == null || !var26.field_403.equals(var1)) {
                  BlockState var29 = c.field_1687.method_8320(var26.field_403);
                  boolean var30 = false;
                  if (this.field_2044.method_26() && var26.field_403.equals(this.field_2044.method_24())) {
                     if (var4) {
                        var30 = true;
                     } else {
                        var30 = !var26.field_403.equals(this.field_2045.method_24515()) && !var3.contains(var26.field_403) && this.method_2664(var26.field_403);
                     }
                  }

                  if (!var29.method_26215() || var30) {
                     boolean var31 = var3.contains(var26.field_403);
                     if ((Dev.ZWare.Client.pkg1.Class13.method_414(var26.field_403, var29) || var30) && this.field_2044.method_27(var26.field_403)) {
                        double var32 = var4 ? this.method_2666(var26, var3) : this.method_2665(var26);
                        if (var32 != -1000.0) {
                           if (var30) {
                              boolean var14 = true;
                              if (!var4) {
                                 Class18 var15 = this.method_2676();
                                 if (var15 != null) {
                                    float var16 = var15.method_2855(var26.field_403);
                                    if (var16 < 5.0F) {
                                       var14 = false;
                                    }
                                 }
                              }

                              if (var14) {
                                 if (var4 && var29.method_26215()) {
                                    var32 += 10.0;
                                 } else {
                                    var32 += 40.0;
                                 }
                              }
                           } else {
                              var32 -= this.method_2674(var26.field_403);
                           }

                           if (var32 > var2.field_27) {
                              var2.field_26 = var26.field_403;
                              var2.field_27 = var32;
                              var2.field_28 = var31;
                              var2.field_29 = var26.field_404;
                              var5 = true;
                           }
                        }
                     }
                  }
               }
            }

            return var5 ? var2 : null;
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (boolean, java.util.List) java.util.Set
   private Set<Class15.Inner3> method_2660(boolean var1, List<BlockPos> var2) {
      HashSet var3 = new HashSet();
      if (var1) {
         this.method_2662(var3, var2);
      } else {
         this.method_2661(var3, var2);
      }

      return var3;
   }

   // $VF: renamed from: a (java.util.Set, java.util.List) void
   private void method_2661(Set<Class15.Inner3> var1, List<BlockPos> var2) {
      if (this.method_2682()) {
         for (BlockPos var15 : var2) {
            var1.add(new Class15.Inner3(var15, Class15.Inner9.Feet));
         }

         for (BlockPos var16 : var2) {
            for (Direction var20 : Type.field_11062) {
               BlockPos var21 = var16.method_10093(var20);
               if (!var2.contains(var21)) {
                  var1.add(new Class15.Inner3(var21, Class15.Inner9.Surround));
               }
            }
         }

         if (var2.size() <= 1) {
            for (Direction var17 : Type.field_11062) {
               if (this.field_2024.method_671() == Class15.Inner7.Long) {
                  var1.add(new Class15.Inner3(this.field_2045.method_24515().method_10079(var17, 2), Class15.Inner9.Extend));
               } else if (this.field_2024.method_671() == Class15.Inner7.Corner) {
                  Direction var19 = this.method_2681(var17);
                  if (var19 != null) {
                     var1.add(new Class15.Inner3(this.field_2045.method_24515().method_10093(var17).method_10093(var19), Class15.Inner9.Extend));
                  }
               }
            }
         }
      } else {
         for (BlockPos var4 : var2) {
            var1.add(new Class15.Inner3(var4, Class15.Inner9.Feet));
         }

         for (BlockPos var14 : var2) {
            for (Direction var6 : Type.field_11062) {
               BlockPos var7 = var14.method_10093(var6);
               if (!var2.contains(var7)) {
                  var1.add(new Class15.Inner3(var7, Class15.Inner9.Surround));
                  BlockPos var8 = var7.method_10074();
                  if (Dev.ZWare.Client.pkg1.Class13.method_414(var8, c.field_1687.method_8320(var8))) {
                     var1.add(new Class15.Inner3(var8, Class15.Inner9.TerrainBase));
                  }

                  if (this.field_2024.method_671() == Class15.Inner7.Long) {
                     var1.add(new Class15.Inner3(var7.method_10093(var6), Class15.Inner9.Extend));
                  } else if (this.field_2024.method_671() == Class15.Inner7.Corner) {
                     Direction var9 = this.method_2681(var6);
                     if (var9 != null) {
                        var1.add(new Class15.Inner3(var7.method_10093(var9), Class15.Inner9.Extend));
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b (java.util.Set, java.util.List) void
   private void method_2662(Set<Class15.Inner3> var1, List<BlockPos> var2) {
      if (this.method_2682()) {
         boolean var16 = true;

         for (BlockPos var19 : var2) {
            if (c.field_1687.method_8320(var19.method_10074()).method_27852(Blocks.field_9987)) {
               var16 = false;
               break;
            }
         }

         boolean var18 = true;

         for (BlockPos var22 : var2) {
            if (c.field_1687.method_8320(var22.method_10086(2)).method_27852(Blocks.field_9987)) {
               var18 = false;
               break;
            }
         }

         for (BlockPos var23 : var2) {
            if (var16) {
               var1.add(new Class15.Inner3(var23.method_10074(), Class15.Inner9.Below));
            }

            if (var18) {
               var1.add(new Class15.Inner3(var23.method_10086(2), Class15.Inner9.Head));
            }

            var1.add(new Class15.Inner3(var23.method_10084(), Class15.Inner9.FacePlace));

            for (Direction var26 : Type.field_11062) {
               var1.add(new Class15.Inner3(var23.method_10084().method_10093(var26), Class15.Inner9.FacePlace));
            }

            var1.add(new Class15.Inner3(var23, Class15.Inner9.Surround));

            for (Direction var27 : Type.field_11062) {
               var1.add(new Class15.Inner3(var23.method_10093(var27), Class15.Inner9.Surround));
            }
         }
      } else {
         boolean var3 = this.field_2045.method_20448();

         for (BlockPos var5 : var2) {
            BlockPos var6 = var3 ? var5 : var5.method_10084();
            BlockPos var7 = var6.method_10084();
            boolean var8 = Dev.ZWare.Client.pkg1.Class13.method_414(var6, c.field_1687.method_8320(var6));
            boolean var9 = Dev.ZWare.Client.pkg1.Class13.method_414(var7, c.field_1687.method_8320(var7));
            if (var8) {
               var1.add(new Class15.Inner3(var6, Class15.Inner9.FacePlace));
            } else if (var9) {
               var1.add(new Class15.Inner3(var7, Class15.Inner9.Head));
            }

            if (!c.field_1687.method_8320(var5.method_10074()).method_27852(Blocks.field_9987)) {
               BlockPos var10 = var5.method_10074();
               boolean var11 = false;

               for (Direction var13 : Type.field_11062) {
                  BlockPos var14 = var10.method_10093(var13);
                  BlockState var15 = c.field_1687.method_8320(var14);
                  if (Dev.ZWare.Client.pkg1.Class13.method_414(var14, var15)) {
                     var1.add(new Class15.Inner3(var14, Class15.Inner9.Below));
                     var11 = true;
                  }
               }

               if (!var11 && Dev.ZWare.Client.pkg1.Class13.method_414(var10, c.field_1687.method_8320(var10))) {
                  var1.add(new Class15.Inner3(var10, Class15.Inner9.Below));
               }
            }

            var1.add(new Class15.Inner3(var5, Class15.Inner9.Surround));

            for (Direction var29 : Type.field_11062) {
               if (!var2.contains(var5.method_10093(var29))) {
                  var1.add(new Class15.Inner3(var5.method_10093(var29), Class15.Inner9.Surround));
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner3, boolean, java.util.List) Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner2
   private Class15.Inner2 method_2663(Class15.Inner3 var1, boolean var2, List<BlockPos> var3) {
      if (this.field_2044 == null) {
         return null;
      } else {
         BlockPos var4 = var1.field_403;
         BlockState var5 = c.field_1687.method_8320(var4);
         boolean var6 = false;
         if (this.field_2044.method_26() && var4.equals(this.field_2044.method_24())) {
            if (var2) {
               if (this.method_2682()) {
                  boolean var7 = false;

                  for (Direction var11 : Direction.values()) {
                     if (this.field_2045.method_24515().method_10084().method_10093(var11).equals(var4)) {
                        var7 = true;
                        break;
                     }
                  }

                  boolean var13 = c.field_1687.method_8320(this.field_2045.method_24515().method_10084()).method_26215();
                  var6 = var3.size() == 1 && (var4.equals(this.field_2045.method_24515().method_10086(2)) || var7 && var13);
               } else {
                  var6 = true;
               }
            } else {
               var6 = !var4.equals(this.field_2045.method_24515()) && !this.method_2667(var4, var3) && this.method_2664(var4);
            }
         }

         if (var5.method_26215() && !var6) {
            return null;
         } else if (!Dev.ZWare.Client.pkg1.Class13.method_414(var4, var5) && !var6) {
            return null;
         } else if (!this.field_2044.method_27(var4)) {
            return null;
         } else {
            double var12 = var2 ? this.method_2666(var1, var3) : this.method_2665(var1);
            if (var12 == -1000.0) {
               return null;
            } else {
               if (var6) {
                  if (this.method_2682()) {
                     var12 += 40.0;
                  } else {
                     boolean var14 = true;
                     if (!var2) {
                        Class18 var15 = this.method_2676();
                        if (var15 != null) {
                           float var16 = var15.method_2855(var4);
                           if (var16 < 5.0F) {
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        if (var2 && var5.method_26215()) {
                           var12 += 10.0;
                        } else {
                           var12 += 40.0;
                        }
                     }
                  }
               } else {
                  var12 -= this.method_2674(var4);
               }

               return new Class15.Inner2(var4.method_10062(), var12);
            }
         }
      }
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2664(BlockPos var1) {
      if (this.method_2682()) {
         for (Direction var5 : Direction.values()) {
            BlockPos var6 = this.field_2045.method_24515().method_10093(var5);
            if (var6.equals(var1) && this.method_2672(var6.method_10074())) {
               return true;
            }
         }
      } else {
         for (Direction var8 : Type.field_11062) {
            BlockPos var9 = this.field_2045.method_24515().method_10093(var8);
            if (var9.equals(var1) && this.method_2672(var9.method_10074())) {
               return true;
            }
         }
      }

      return false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner3) double
   private double method_2665(Class15.Inner3 var1) {
      if (this.field_2045 == null) {
         return -1000.0;
      } else {
         BlockPos var2 = var1.field_403;
         double var3 = 0.0;
         BlockState var5 = c.field_1687.method_8320(var2);
         if (this.method_2682()) {
            boolean var18 = this.method_2668(var2);
            if (var18) {
               BlockState var19 = c.field_1687.method_8320(var2.method_10084());
               if (var19.method_27852(Blocks.field_10540)) {
                  var3 += 100.0;
               } else {
                  if (var5.method_27852(Blocks.field_10343)) {
                     return -1000.0;
                  }

                  var3 += 50.0;
               }

               if (this.method_2669(var2)) {
                  var3 += 35.0;
               }
            } else {
               BlockState var20 = c.field_1687.method_8320(c.field_1724.method_24515().method_10084());
               if (var2.equals(c.field_1724.method_24515()) && (var20.method_27852(Blocks.field_10540) || var20.method_27852(Blocks.field_9987))) {
                  return -1000.0;
               }

               if (var1.field_404 == Class15.Inner9.Surround) {
                  var3 += 3.0;
                  boolean var23 = false;

                  for (Direction var27 : Type.field_11062) {
                     if (this.field_2045.method_24515().method_10093(var27).equals(var2)) {
                        BlockPos var29 = this.field_2045.method_24515().method_10079(var27, 2);
                        BlockState var12 = this.method_2673(var29);
                        if (var12 != null && var12.method_26215() && this.method_2672(var29.method_10074())) {
                           var23 = true;
                           break;
                        }

                        Direction var13 = this.method_2681(var27);
                        if (var13 != null) {
                           BlockPos var14 = this.field_2045.method_24515().method_10093(var27).method_10093(var13);
                           BlockState var15 = this.method_2673(var14);
                           if (var15 != null && var15.method_26215() && this.method_2672(var14.method_10074())) {
                              var23 = true;
                              break;
                           }
                        }
                     }
                  }

                  if (var23) {
                     var3 += 25.0;
                  }
               }

               if (var1.field_404 == Class15.Inner9.Extend) {
                  var3 += 20.0;
               }
            }

            double var21 = this.field_2045.method_19538().method_1022(Vec3d.method_24953(var2));
            return var21 <= 0.0 ? var3 : var3 + 10.0 / var21;
         } else {
            if (var1.field_404 == Class15.Inner9.Feet) {
               BlockState var6 = c.field_1687.method_8320(var2.method_10084());
               if (var6.method_27852(Blocks.field_10540)) {
                  var3 += 100.0;
               } else {
                  if (var5.method_27852(Blocks.field_10343)) {
                     return -1000.0;
                  }

                  var3 += 50.0;
               }

               if (this.method_2669(var2)) {
                  var3 += 35.0;
               }
            } else {
               BlockState var16 = c.field_1687.method_8320(c.field_1724.method_24515().method_10084());
               if (var2.equals(c.field_1724.method_24515()) && (var16.method_27852(Blocks.field_10540) || var16.method_27852(Blocks.field_9987))) {
                  return -1000.0;
               }

               if (var1.field_404 == Class15.Inner9.Surround) {
                  if (c.field_1687.method_8320(var2.method_10074()).method_26215()) {
                     var3 += 35.0;
                  } else if (!this.method_2672(var2.method_10074())) {
                     var3 += 10.0;
                  } else {
                     var3 += 55.0;
                     boolean var7 = false;

                     for (Direction var9 : Type.field_11062) {
                        if (this.field_2045.method_5707(Vec3d.method_24953(var2)) < 4.0) {
                           BlockPos var10 = var2.method_10093(var9);
                           BlockState var11 = this.method_2673(var10);
                           if (var11 != null && var11.method_26215() && this.method_2672(var10.method_10074())) {
                              var7 = true;
                              break;
                           }
                        }
                     }

                     if (var7) {
                        var3 += 25.0;
                     }
                  }
               }

               if (var1.field_404 == Class15.Inner9.Extend) {
                  var3 += 20.0;
               }

               if (var1.field_404 == Class15.Inner9.TerrainBase) {
                  if (this.field_2055) {
                     var3 += 30.0;
                  } else {
                     var3++;
                  }
               }
            }

            double var17 = this.field_2045.method_19538().method_1022(Vec3d.method_24953(var2));
            if (var17 > 0.0) {
               var3 += 10.0 / var17;
            }

            Vec3d var22 = this.field_2045.method_18798();
            if (var22.method_37268() > 0.001) {
               Vec3d var24 = new Vec3d(var22.field_1352, 0.0, var22.field_1350).method_1029();
               Vec3d var26 = Vec3d.method_24953(var2).method_1020(this.field_2045.method_19538()).method_1029();
               double var28 = var24.method_1026(var26);
               if (var28 > 0.0) {
                  var3 += var28 * 5.0;
               }
            }

            return var3;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner3, java.util.List) double
   private double method_2666(Class15.Inner3 var1, List<BlockPos> var2) {
      if (this.field_2045 == null) {
         return -1000.0;
      } else {
         BlockPos var3 = var1.field_403;
         double var4 = 0.0;
         if (var3.method_10264() == this.field_2045.method_24515().method_10264() + 2
            || var3.method_10264() == this.field_2045.method_24515().method_10264() - 1) {
            var4 += 10.0;
         }

         if (var2.size() == 1) {
            boolean var6 = !c.field_1687.method_8320(this.field_2045.method_24515().method_10084()).method_27852(Blocks.field_9987);
            if (var6) {
               if (var3.equals(this.field_2045.method_24515().method_10084())) {
                  var4 += 20.0;
               } else {
                  boolean var7 = false;
                  if (this.method_2682()) {
                     for (Direction var11 : Direction.values()) {
                        if (this.field_2045.method_24515().method_10084().method_10093(var11).equals(var3)) {
                           var7 = true;
                           break;
                        }
                     }
                  } else {
                     for (Direction var9 : Type.field_11062) {
                        if (this.field_2045.method_24515().method_10084().method_10093(var9).equals(var3)) {
                           var7 = true;
                           break;
                        }
                     }
                  }

                  if (var7) {
                     var4 += 7.5;
                  }
               }
            }
         }

         if (!this.method_2682() && var1.field_404 == Class15.Inner9.Below) {
            if (var3.equals(this.field_2045.method_24515().method_10074())) {
               var4 += 25.0;
            } else {
               var4 += 30.0;
            }
         }

         double var12 = this.field_2045.method_19538().method_1022(Vec3d.method_24953(var3));
         return var12 <= 0.0 ? var4 : var4 + 10.0 / var12;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, java.util.List) boolean
   private boolean method_2667(BlockPos var1, List<BlockPos> var2) {
      return var2.contains(var1);
   }

   // $VF: renamed from: d (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2668(BlockPos var1) {
      return this.field_2045 != null && this.method_2667(var1, this.method_2670(this.field_2045));
   }

   // $VF: renamed from: e (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2669(BlockPos var1) {
      if (this.field_2045 == null) {
         return false;
      } else {
         List var2 = this.method_2670(this.field_2045);
         return var2.size() > 1 && var2.contains(var1) && !var1.equals(this.field_2045.method_24515());
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) java.util.List
   private List<BlockPos> method_2670(PlayerEntity var1) {
      ArrayList var2 = new ArrayList();
      Box var3 = var1.method_5829().method_1009(0.01, 0.1, 0.01);
      double var4 = var1.method_23318();
      Box var6 = new Box(var3.field_1323, var4, var3.field_1321, var3.field_1320, var4 + 0.1, var3.field_1324);

      for (BlockPos var8 : BlockPos.method_10094(
         (int)Math.floor(var6.field_1323),
         (int)Math.floor(var6.field_1322),
         (int)Math.floor(var6.field_1321),
         (int)Math.floor(var6.field_1320),
         (int)Math.floor(var6.field_1325),
         (int)Math.floor(var6.field_1324)
      )) {
         var2.add(var8.method_10062());
      }

      return var2;
   }

   // $VF: renamed from: a (java.util.List) boolean
   private boolean method_2671(List<BlockPos> var1) {
      for (BlockPos var3 : var1) {
         if (c.field_1687.method_8320(var3).method_27852(Blocks.field_9987)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: f (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2672(BlockPos var1) {
      BlockState var2 = c.field_1687.method_8320(var1);
      return var2.method_27852(Blocks.field_10540) || var2.method_27852(Blocks.field_9987);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.block.BlockState
   private BlockState method_2673(BlockPos var1) {
      if (var1 == null) {
         return null;
      } else {
         return var1.equals(this.field_2048) ? Blocks.field_10124.method_9564() : c.field_1687.method_8320(var1);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) double
   private double method_2674(BlockPos var1) {
      if (!this.field_2032.method_671()) {
         return 0.0;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg5.Class10 var2 = this.method_2675();
         if (var2 != null && var2.method_2606(var1)) {
            PlayerEntity var3 = var2.method_2607(var1);
            return !this.field_2033.method_671()
                  || Dev.ZWare.Client.Class1.field_310 != null && var3 != null && Dev.ZWare.Client.Class1.field_310.method_377(var3)
               ? this.field_2034.method_671()
               : 0.0;
         } else {
            return 0.0;
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class10
   private Dev.ZWare.Client.features.pkg1.pkg5.Class10 method_2675() {
      return Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg5.Class10.class) : null;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class18
   private Class18 method_2676() {
      return Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Class18.class) : null;
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_2677() {
      PlayerEntity var1 = null;
      double var2 = Double.POSITIVE_INFINITY;

      for (PlayerEntity var5 : c.field_1687.method_18456()) {
         if (this.method_2678(var5)) {
            double var6 = this.method_2680(var5);
            if (var6 < var2) {
               var2 = var6;
               var1 = var5;
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2678(PlayerEntity var1) {
      if (var1 == null || var1 == c.field_1724 || var1 == c.field_1719) {
         return false;
      } else if (!var1.method_5805() || var1.method_31481() || var1.method_7325() || var1.method_68878()) {
         return false;
      } else if (Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_377(var1)) {
         return false;
      } else {
         return this.field_2023.method_671() && this.method_2679(var1)
            ? false
            : c.field_1724.method_33571().method_1025(var1.method_19538()) <= this.field_2021.method_671() * this.field_2021.method_671();
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2679(PlayerEntity var1) {
      return var1.method_6118(EquipmentSlot.field_6169).method_7960()
         && var1.method_6118(EquipmentSlot.field_6174).method_7960()
         && var1.method_6118(EquipmentSlot.field_6172).method_7960()
         && var1.method_6118(EquipmentSlot.field_6166).method_7960();
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) double
   private double method_2680(PlayerEntity var1) {
      return switch ((Class15.Inner4)this.field_2022.method_671()) {
         case ClosestAngle -> {
            float[] var2 = Dev.ZWare.Client.Class1.field_298.method_332(var1.method_33571());
            double var3 = Math.abs(MathHelper.method_15393(var2[0] - c.field_1724.method_36454()));
            double var5 = Math.abs(var2[1] - c.field_1724.method_36455());
            yield var3 + var5 * 0.5 + c.field_1724.method_5858(var1) * 0.01;
         }
         case ClosestDistance -> c.field_1724.method_5858(var1);
      };
   }

   // $VF: renamed from: a (net.minecraft.util.math.Direction) net.minecraft.util.math.Direction
   private Direction method_2681(Direction var1) {
      if (var1 == Direction.field_11043) {
         return Direction.field_11034;
      } else if (var1 == Direction.field_11035) {
         return Direction.field_11039;
      } else if (var1 == Direction.field_11034) {
         return Direction.field_11043;
      } else {
         return var1 == Direction.field_11039 ? Direction.field_11035 : null;
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_2682() {
      return this.field_2025.method_671() == Class15.Inner6.OldLogic;
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   private void method_2683(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      this.field_2043.clear();
      if (this.field_2045 != null && this.field_2044 != null) {
         this.field_2040.set(var1.method_1055().method_23760().method_23761());
         this.field_2041.set(RenderSystem.getProjectionMatrix());
         List var2 = this.method_2670(this.field_2045);
         boolean var3 = this.method_2671(var2);
         Set var4 = this.method_2660(var3, var2);
         double var5 = 0.0;
         ArrayList var7 = new ArrayList();

         for (Class15.Inner3 var9 : var4) {
            Class15.Inner2 var10 = this.method_2663(var9, var3, var2);
            if (var10 != null) {
               var7.add(var10);
               if (var10.field_567 > var5) {
                  var5 = var10.field_567;
               }
            }
         }

         for (Class15.Inner2 var15 : var7) {
            double var16 = var5 <= 0.0 ? 0.25 : var15.field_567 / var5 / 4.0;
            int var12 = MathHelper.method_15340((int)Math.round(255.0 * var16), 0, 255);
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), new Box(var15.field_566), new Color(255, 0, 0, var12));
            Vec3d var13 = this.method_2684(Vec3d.method_24953(var15.field_566));
            if (var13 != null) {
               this.field_2043.add(new Class15.Inner5(var15.field_567, var13));
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_2684(Vec3d var1) {
      Vec3d var2 = c.field_1773.method_19418().method_19326();
      this.field_2042
         .set((float)(var1.field_1352 - var2.field_1352), (float)(var1.field_1351 - var2.field_1351), (float)(var1.field_1350 - var2.field_1350), 1.0F);
      this.field_2042.mul(this.field_2040);
      this.field_2042.mul(this.field_2041);
      if (this.field_2042.w <= 0.0F) {
         return null;
      } else {
         float var3 = 1.0F / this.field_2042.w;
         float var4 = this.field_2042.x * var3;
         float var5 = this.field_2042.y * var3;
         float var6 = this.field_2042.z * var3;
         double var7 = (var4 * 0.5 + 0.5) * c.method_22683().method_4489();
         double var9 = (1.0 - (var5 * 0.5 + 0.5)) * c.method_22683().method_4506();
         double var11 = var7 / c.method_22683().method_4495();
         double var13 = var9 / c.method_22683().method_4495();
         return !Double.isNaN(var11) && !Double.isNaN(var13) && !Double.isInfinite(var11) && !Double.isInfinite(var13) ? new Vec3d(var11, var13, var6) : null;
      }
   }

   // $VF: renamed from: t () void
   private void method_2685() {
      this.field_2045 = null;
      this.field_2046 = null;
      this.field_2047 = null;
      this.field_2048 = null;
      this.field_2055 = false;
      this.field_2043.clear();
   }

   public static enum Inner1 {
      None,
      Inner,
      Outer,
      Auto;
   }

   public static enum Inner10 {
      None,
      Always,
      OnMine,
      OnMineAndSwim;
   }

   static class Inner2 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      final BlockPos field_566;
      // $VF: renamed from: b double
      final double field_567;

      Inner2(BlockPos var1, double var2) {
         this.field_566 = var1.method_10062();
         this.field_567 = var2;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_1068() {
         return this.field_566;
      }

      // $VF: renamed from: a () double
      double method_1069() {
         return this.field_567;
      }
   }

   static class Inner3 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      final BlockPos field_403;
      // $VF: renamed from: b Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner9
      final Class15.Inner9 field_404;

      Inner3(BlockPos var1, Class15.Inner9 var2) {
         this.field_403 = var1.method_10062();
         this.field_404 = var2;
      }

      @Override
      public int hashCode() {
         return this.field_403.hashCode();
      }

      @Override
      public boolean equals(Object obj) {
         if (this == obj) {
            return true;
         } else {
            return obj instanceof Class15.Inner3 var2 ? this.field_403.equals(var2.field_403) : false;
         }
      }
   }

   public static enum Inner4 {
      ClosestAngle,
      ClosestDistance;
   }

   static class Inner5 {
      // $VF: renamed from: a double
      final double field_68;
      // $VF: renamed from: b net.minecraft.util.math.Vec3d
      final Vec3d field_69;

      Inner5(double var1, Vec3d var3) {
         this.field_68 = var1;
         this.field_69 = var3;
      }

      // $VF: renamed from: a () double
      double method_164() {
         return this.field_68;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      Vec3d method_165() {
         return this.field_69;
      }
   }

   public static enum Inner6 {
      OldLogic,
      NewLogic;
   }

   public static enum Inner7 {
      None,
      Long,
      Corner;
   }

   static class Inner8 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      BlockPos field_26;
      // $VF: renamed from: b double
      double field_27;
      // $VF: renamed from: c boolean
      boolean field_28;
      // $VF: renamed from: d Dev.ZWare.Client.features.pkg1.pkg3.Class15$Inner9
      Class15.Inner9 field_29;
   }

   public static enum Inner9 {
      Feet,
      Surround,
      Extend,
      FacePlace,
      Head,
      Below,
      TerrainBase;
   }
}
