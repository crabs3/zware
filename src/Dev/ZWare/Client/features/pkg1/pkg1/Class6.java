package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

public class Class6 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1514 = 1.0E-4;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class6.Inner1> field_1515 = this.a("Mode", Class6.Inner1.Flatten);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_1516 = this.a("Block", Blocks.field_10540);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1517 = this.a("Center First", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1518 = this.a("Rotation Block Fix", true).method_683("Litematica");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1519 = this.a("Openable Handling", true).method_683("Litematica");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1520 = this.a("Render", true);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1521 = this.a("Fade Time", 0.2, 0.0, 1.0);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class6.Inner2> field_1522 = this.a("Shape Mode", Class6.Inner2.Both);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1523 = this.a("Side Color", 85, 0, 255, 40);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1524 = this.a("Line Color", 255, 255, 255, 60);
   // $VF: renamed from: z java.util.Map
   private final Map<BlockPos, Long> field_1525 = new HashMap<>();
   // $VF: renamed from: A boolean
   private boolean field_1526;
   // $VF: renamed from: B java.lang.reflect.Method
   private Method field_1527;

   public Class6() {
      super("Filler", "fills shit prints shit flattens shit", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
      this.field_1516.method_709(var1 -> this.field_1515.method_671() != Class6.Inner1.AntiCrystal && this.field_1515.method_671() != Class6.Inner1.Litematica);
      this.field_1518.method_709(var1 -> this.field_1515.method_671() == Class6.Inner1.Litematica);
      this.field_1519.method_709(var1 -> this.field_1515.method_671() == Class6.Inner1.Litematica);
      this.field_1522.method_709(var1 -> this.field_1520.method_671());
      this.field_1523.method_709(var1 -> this.field_1520.method_671() && this.field_1522.method_671().method_1114());
      this.field_1524.method_709(var1 -> this.field_1520.method_671() && this.field_1522.method_671().method_1113());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1525.clear();
      this.field_1526 = false;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1525.clear();
      this.field_1526 = false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2115(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null) {
         if (this.field_1515.method_671() == Class6.Inner1.Litematica) {
            this.method_2118();
         } else {
            Block var2 = this.method_2116();
            if (var2 != null && var2 != Blocks.field_10124) {
               Object var3 = this.method_2117();
               if (!var3.isEmpty()) {
                  int var4 = Dev.ZWare.Client.Class1.field_301.method_932();
                  if (var4 > 0) {
                     if (var3.size() > var4) {
                        var3 = new ArrayList(var3.subList(0, var4));
                     }

                     if (Dev.ZWare.Client.Class1.field_301.method_916((List<BlockPos>)var3, var2.method_8389())) {
                        long var5 = System.currentTimeMillis();

                        try {
                           for (BlockPos var8 : var3) {
                              if (Dev.ZWare.Client.Class1.field_301.method_918(var2.method_8389(), var8)) {
                                 this.field_1525.put(var8.method_10062(), var5);
                              }
                           }
                        } finally {
                           Dev.ZWare.Client.Class1.field_301.method_929();
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
      if (this.field_1520.method_671()) {
         this.method_2127(event);
      }
   }

   // $VF: renamed from: a () net.minecraft.block.Block
   private Block method_2116() {
      return this.field_1515.method_671() == Class6.Inner1.AntiCrystal ? Blocks.field_22423 : this.field_1516.method_671();
   }

   // $VF: renamed from: b () java.util.List
   private List<BlockPos> method_2117() {
      BlockPos var1 = this.method_2130();

      return switch ((Class6.Inner1)this.field_1515.method_671()) {
         case Flatten -> this.method_2119(var1.method_10264() - 1);
         case Filler -> this.method_2120(var1.method_10264() - 1);
         case AntiCrystal -> this.method_2121(var1.method_10264());
         case SourceFill -> this.method_2122();
         case Litematica -> List.of();
      };
   }

   // $VF: renamed from: n () void
   private void method_2118() {
      if (!FabricLoader.getInstance().isModLoaded("litematica")) {
         if (!this.field_1526) {
            this.field_1526 = true;
            Dev.ZWare.Client.features.pkg2.Class1.method_1647("You need litematica dumbass");
         }

         this.k();
      } else {
         this.field_1526 = false;
         List var1 = this.method_2124();
         if (!var1.isEmpty()) {
            int var2 = Dev.ZWare.Client.Class1.field_301.method_932();
            if (var2 > 0) {
               long var3 = System.currentTimeMillis();
               int var5 = 0;

               for (Class6.Inner3 var7 : var1) {
                  if (var5 >= var2) {
                     break;
                  }

                  BlockState var8 = var7.method_1517();
                  BlockState var9 = c.field_1687.method_8320(var7.method_1516());
                  if (!var9.equals(var8)) {
                     if (var7.method_1518() == Class6.Inner4.OPENABLE_INTERACT) {
                        if (this.method_2136(var9, var8) && Dev.ZWare.Client.Class1.field_301.method_927(var7.method_1516(), Hand.field_5808, true)) {
                           this.field_1525.put(var7.method_1516().method_10062(), var3);
                           var5++;
                        }
                     } else {
                        Block var10 = var8.method_26204();
                        if (var10 != null && var10 != Blocks.field_10124) {
                           Item var11 = var10.method_8389();
                           if (var11 != null) {
                              BlockPos var12 = var7.method_1516();
                              if (Dev.ZWare.Client.Class1.field_301.method_914(var12, var9, var11)) {
                                 try {
                                    boolean var13 = Dev.ZWare.Client.Class1.field_301
                                       .method_923(var11, var12, var9, Hand.field_5808, true, this.field_1518.method_671() ? var8 : null);
                                    if (var13 && this.field_1519.method_671() && this.method_2137(var8)) {
                                       Dev.ZWare.Client.Class1.field_301.method_927(var12, Hand.field_5808, true);
                                    }

                                    if (var13) {
                                       this.field_1525.put(var12.method_10062(), var3);
                                       var5++;
                                    }
                                 } finally {
                                    Dev.ZWare.Client.Class1.field_301.method_929();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int) java.util.List
   private List<BlockPos> method_2119(int var1) {
      ArrayList var2 = new ArrayList();
      double var3 = this.method_2133();
      double var5 = var3 * var3;
      int var7 = MathHelper.method_15384(var3);
      BlockPos var8 = this.method_2130();
      double var9 = c.field_1724.method_23317();
      double var11 = c.field_1724.method_23321();

      for (int var13 = -var7; var13 <= var7; var13++) {
         for (int var14 = -var7; var14 <= var7; var14++) {
            int var15 = var8.method_10263() + var13;
            int var16 = var8.method_10260() + var14;
            double var17 = var15 + 0.5;
            double var19 = var16 + 0.5;
            if (!(this.method_2131(var9, var11, var17, var19) > var5)) {
               BlockPos var21 = new BlockPos(var15, var1, var16);
               if (this.method_2126(var21)) {
                  var2.add(var21);
               }
            }
         }
      }

      this.method_2125(var2, var9, var11);
      return var2;
   }

   // $VF: renamed from: b (int) java.util.List
   private List<BlockPos> method_2120(int var1) {
      List var2 = this.method_2119(var1);
      LinkedHashSet var3 = new LinkedHashSet();
      int var4 = c.field_1687.method_31607();

      for (BlockPos var6 : var2) {
         ArrayList var7 = new ArrayList();

         for (BlockPos var8 = var6.method_10074(); var8.method_10264() >= var4 && this.method_2126(var8); var8 = var8.method_10074()) {
            var7.add(var8.method_10062());
         }

         var7.sort(Comparator.comparingInt(Vec3i::method_10264));
         var3.addAll(var7);
         var3.add(var6.method_10062());
      }

      return new ArrayList<>(var3);
   }

   // $VF: renamed from: c (int) java.util.List
   private List<BlockPos> method_2121(int var1) {
      ArrayList var2 = new ArrayList();
      double var3 = this.method_2133();
      double var5 = var3 * var3;
      int var7 = MathHelper.method_15384(var3);
      BlockPos var8 = this.method_2130();
      double var9 = c.field_1724.method_23317();
      double var11 = c.field_1724.method_23321();

      for (int var13 = -var7; var13 <= var7; var13++) {
         for (int var14 = -var7; var14 <= var7; var14++) {
            int var15 = var8.method_10263() + var13;
            int var16 = var8.method_10260() + var14;
            double var17 = var15 + 0.5;
            double var19 = var16 + 0.5;
            if (!(this.method_2131(var9, var11, var17, var19) > var5)) {
               BlockPos var21 = new BlockPos(var15, var1, var16);
               if (this.method_2126(var21)) {
                  BlockState var22 = c.field_1687.method_8320(var21.method_10074());
                  if (var22.method_27852(Blocks.field_10540) || var22.method_27852(Blocks.field_9987)) {
                     var2.add(var21);
                  }
               }
            }
         }
      }

      this.method_2125(var2, var9, var11);
      return var2;
   }

   // $VF: renamed from: c () java.util.List
   private List<BlockPos> method_2122() {
      ArrayList var1 = new ArrayList();
      double var2 = this.method_2133();
      double var4 = var2 * var2;
      int var6 = MathHelper.method_15384(var2);
      BlockPos var7 = c.field_1724.method_24515();
      double var8 = c.field_1724.method_23317();
      double var10 = c.field_1724.method_23318();
      double var12 = c.field_1724.method_23321();

      for (int var14 = -var6; var14 <= var6; var14++) {
         for (int var15 = -var6; var15 <= var6; var15++) {
            for (int var16 = -var6; var16 <= var6; var16++) {
               BlockPos var17 = var7.method_10069(var14, var15, var16);
               double var18 = var17.method_10263() + 0.5;
               double var20 = var17.method_10264() + 0.5;
               double var22 = var17.method_10260() + 0.5;
               if (!(this.method_2132(var8, var10, var12, var18, var20, var22) > var4)) {
                  BlockState var24 = c.field_1687.method_8320(var17);
                  FluidState var25 = var24.method_26227();
                  if (this.method_2123(var25)) {
                     var1.add(var17.method_10062());
                  }
               }
            }
         }
      }

      var1.sort(
         Comparator.comparingDouble(
            var7x -> this.method_2132(var8, var10, var12, var7x.method_10263() + 0.5, var7x.method_10264() + 0.5, var7x.method_10260() + 0.5)
         )
      );
      return var1;
   }

   // $VF: renamed from: a (net.minecraft.fluid.FluidState) boolean
   private boolean method_2123(FluidState var1) {
      return var1 != null && var1.method_15771() && (var1.method_39360(Fluids.field_15910) || var1.method_39360(Fluids.field_15908));
   }

   // $VF: renamed from: d () java.util.List
   private List<Class6.Inner3> method_2124() {
      Object var1 = this.method_2134();
      if (var1 == null) {
         return List.of();
      } else {
         ArrayList var2 = new ArrayList();
         double var3 = this.method_2133();
         double var5 = var3 * var3;
         int var7 = MathHelper.method_15384(var3);
         BlockPos var8 = c.field_1724.method_24515();
         double var9 = c.field_1724.method_23317();
         double var11 = c.field_1724.method_23318();
         double var13 = c.field_1724.method_23321();

         for (int var15 = -var7; var15 <= var7; var15++) {
            for (int var16 = -var7; var16 <= var7; var16++) {
               for (int var17 = -var7; var17 <= var7; var17++) {
                  BlockPos var18 = var8.method_10069(var15, var16, var17);
                  double var19 = var18.method_10263() + 0.5;
                  double var21 = var18.method_10264() + 0.5;
                  double var23 = var18.method_10260() + 0.5;
                  double var25 = this.method_2132(var9, var11, var13, var19, var21, var23);
                  if (!(var25 > var5)) {
                     BlockState var27 = this.method_2135(var1, var18);
                     if (var27 != null && !var27.method_26215()) {
                        BlockState var28 = c.field_1687.method_8320(var18);
                        if (!var28.equals(var27)) {
                           if (this.field_1519.method_671() && this.method_2136(var28, var27)) {
                              var2.add(new Class6.Inner3(var18.method_10062(), var27, Class6.Inner4.OPENABLE_INTERACT));
                           } else if (var28.method_26215() || var28.method_45474()) {
                              Block var29 = var27.method_26204();
                              if (var29 != null && var29 != Blocks.field_10124) {
                                 var2.add(new Class6.Inner3(var18.method_10062(), var27, Class6.Inner4.PLACE));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         var2.sort(
            Comparator.<Class6.Inner3>comparingInt(var0 -> var0.method_1516().method_10264())
               .thenComparingDouble(var5x -> this.method_2131(var9, var13, var5x.method_1516().method_10263() + 0.5, var5x.method_1516().method_10260() + 0.5))
         );
         return var2;
      }
   }

   // $VF: renamed from: a (java.util.List, double, double) void
   private void method_2125(List<BlockPos> var1, double var2, double var4) {
      if (this.field_1517.method_671()) {
         var1.sort(Comparator.comparingDouble(var5 -> this.method_2131(var2, var4, var5.method_10263() + 0.5, var5.method_10260() + 0.5)));
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2126(BlockPos var1) {
      BlockState var2 = c.field_1687.method_8320(var1);
      return var2.method_26215() || var2.method_45474();
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   private void method_2127(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      long var2 = System.currentTimeMillis();
      long var4 = Math.max(1L, (long)(this.field_1521.method_671() * 1000.0));
      Iterator var6 = this.field_1525.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         long var8 = var2 - (Long)var7.getValue();
         if (var8 > var4) {
            var6.remove();
         } else {
            double var10 = 1.0 - MathHelper.method_15350((double)var8 / var4, 0.0, 1.0);
            this.method_2128(
               var1, (BlockPos)var7.getKey(), this.method_2129(this.field_1523.method_671(), var10), this.method_2129(this.field_1524.method_671(), var10)
            );
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.BlockPos, java.awt.Color, java.awt.Color) void
   private void method_2128(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, BlockPos var2, Color var3, Color var4) {
      Box var5 = new Box(var2);
      if (this.field_1522.method_671().method_1114()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var5, var3);
      }

      if (this.field_1522.method_671().method_1113()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var5, var4, 1.0);
      }
   }

   // $VF: renamed from: a (java.awt.Color, double) java.awt.Color
   private Color method_2129(Color var1, double var2) {
      int var4 = MathHelper.method_15340((int)Math.round(var1.getAlpha() * var2), 0, 255);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var4);
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   private BlockPos method_2130() {
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

   // $VF: renamed from: a (double, double, double, double) double
   private double method_2131(double var1, double var3, double var5, double var7) {
      double var9 = var1 - var5;
      double var11 = var3 - var7;
      return var9 * var9 + var11 * var11;
   }

   // $VF: renamed from: a (double, double, double, double, double, double) double
   private double method_2132(double var1, double var3, double var5, double var7, double var9, double var11) {
      double var13 = var1 - var7;
      double var15 = var3 - var9;
      double var17 = var5 - var11;
      return var13 * var13 + var15 * var15 + var17 * var17;
   }

   // $VF: renamed from: a () double
   private double method_2133() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   // $VF: renamed from: a () java.lang.Object
   private Object method_2134() {
      try {
         if (this.field_1527 == null) {
            Class var1 = Class.forName("fi.dy.masa.litematica.world.SchematicWorldHandler");
            this.field_1527 = var1.getMethod("getSchematicWorld");
         }

         return this.field_1527.invoke(null);
      } catch (Throwable var2) {
         return null;
      }
   }

   // $VF: renamed from: a (java.lang.Object, net.minecraft.util.math.BlockPos) net.minecraft.block.BlockState
   private BlockState method_2135(Object var1, BlockPos var2) {
      if (var1 instanceof World var3 && var2 != null) {
         try {
            return var3.method_8320(var2);
         } catch (Throwable var5) {
            return null;
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.block.BlockState) boolean
   private boolean method_2136(BlockState var1, BlockState var2) {
      return var1 != null
         && var2 != null
         && var1.method_26204() == var2.method_26204()
         && var1.method_28498(Properties.field_12537)
         && var2.method_28498(Properties.field_12537)
         && var1.method_11654(Properties.field_12537) != var2.method_11654(Properties.field_12537);
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) boolean
   private boolean method_2137(BlockState var1) {
      return var1 != null && var1.method_28498(Properties.field_12537) && (Boolean)var1.method_11654(Properties.field_12537);
   }

   public static enum Inner1 {
      Flatten,
      Filler,
      AntiCrystal,
      SourceFill,
      Litematica;
   }

   public static enum Inner2 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1113() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1114() {
         return this == Sides || this == Both;
      }
   }

   private record Inner3(BlockPos b6, BlockState b7, Class6.Inner4 b8) {
      // $VF: renamed from: b6 net.minecraft.util.math.BlockPos
      private final BlockPos field_985;
      // $VF: renamed from: b7 net.minecraft.block.BlockState
      private final BlockState field_986;
      // $VF: renamed from: b8 Dev.ZWare.Client.features.pkg1.pkg1.Class6$Inner4
      private final Class6.Inner4 field_987;

      private Inner3(BlockPos b6, BlockState b7, Class6.Inner4 b8) {
         this.field_985 = b6;
         this.field_986 = b7;
         this.field_987 = b8;
      }

      // $VF: renamed from: b6 () net.minecraft.util.math.BlockPos
      public BlockPos method_1516() {
         return this.field_985;
      }

      // $VF: renamed from: b7 () net.minecraft.block.BlockState
      public BlockState method_1517() {
         return this.field_986;
      }

      // $VF: renamed from: b8 () Dev.ZWare.Client.features.pkg1.pkg1.Class6$Inner4
      public Class6.Inner4 method_1518() {
         return this.field_987;
      }
   }

   private static enum Inner4 {
      PLACE,
      OPENABLE_INTERACT;
   }
}
