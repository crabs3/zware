package Dev.ZWare.Client.features.pkg1.pkg5;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.BlockBreakingProgressS2CPacket;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;

public class Class10 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_1984 = System.nanoTime();
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1985 = this.a("Use Double mine Prediction", false);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1986 = this.a("Rebreak Completion Amount", 0.7, 0.0, 1.5);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1987 = this.a("Full CompletionA mount", 1.0, 0.0, 1.5);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1988 = this.a("Force Remove On Completion Amount", 1.3, 0.0, 1.5);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1989 = this.a("Ignore Friends", false);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1990 = this.a("Render", true);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class10.Inner3> field_1991 = this.a("Shape Mode", Class10.Inner3.Both);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1992 = this.a("Side Color", 255, 0, 80, 10);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1993 = this.a("Line Color", 255, 255, 255, 40);
   // $VF: renamed from: y java.util.Queue
   private final Queue<Class10.Inner1> field_1994 = new ConcurrentLinkedQueue<>();
   // $VF: renamed from: z java.util.Map
   private final Map<BlockPos, Class10.Inner1> field_1995 = new HashMap<>();
   // $VF: renamed from: A java.util.Map
   private final Map<BlockPos, Class10.Inner1> field_1996 = new HashMap<>();

   public Class10() {
      super("Break Indicators", "shows blocks that opps are mining my nigga", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      this.field_1991.method_709(var1 -> this.field_1990.method_671());
      this.field_1992.method_709(var1 -> this.field_1990.method_671() && this.field_1991.method_671().method_1118());
      this.field_1993.method_709(var1 -> this.field_1990.method_671() && this.field_1991.method_671().method_1117());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2610();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2610();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2604(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g()) {
         if (var1.method_1045() instanceof BlockBreakingProgressS2CPacket var2) {
            Entity var4 = c.field_1687.method_8469(var2.method_11280());
            this.field_1994.add(new Class10.Inner1(var2.method_11277().method_10062(), method_2614(), var4));
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   public boolean method_2605(BlockPos blockPos) {
      return this.field_1995.containsKey(blockPos);
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   public boolean method_2606(BlockPos blockPos) {
      return this.field_1996.containsKey(blockPos);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.entity.player.PlayerEntity
   public PlayerEntity method_2607(BlockPos blockPos) {
      Class10.Inner1 var2 = this.field_1996.get(blockPos);
      return var2 != null && var2.field_286 instanceof PlayerEntity var3 ? var3 : null;
   }

   // $VF: renamed from: a () java.util.Map
   public Map<BlockPos, Class10.Inner2> method_2608() {
      HashMap var1 = new HashMap();
      double var2 = method_2614();
      Map var4 = this.field_1985.method_671() ? this.field_1996 : this.field_1995;

      for (Entry var6 : var4.entrySet()) {
         Class10.Inner1 var7 = (Class10.Inner1)var6.getValue();
         PlayerEntity var8 = var7.field_286 instanceof PlayerEntity var9 ? var9 : null;
         var1.put((BlockPos)var6.getKey(), new Class10.Inner2((BlockPos)var6.getKey(), var8, Math.min(1.0, var7.method_593(var2)), var7.field_287));
      }

      return Collections.unmodifiableMap(var1);
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   private void method_2609(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      if (!g()) {
         double var2 = method_2614();
         this.method_2611();
         this.method_2612(this.field_1995, var2);
         this.method_2612(this.field_1996, var2);
         this.method_2613();
         if (this.field_1990.method_671()) {
            Map var4 = this.field_1985.method_671() ? this.field_1996 : this.field_1995;

            for (Class10.Inner1 var6 : var4.values()) {
               if (!this.field_1989.method_671()
                  || !(
                     var6.field_286 instanceof PlayerEntity var7
                        && Dev.ZWare.Client.Class1.field_310 != null
                        && Dev.ZWare.Client.Class1.field_310.method_377(var7)
                  )) {
                  var6.method_592(var1, var2);
               }
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2610() {
      this.field_1994.clear();
      this.field_1995.clear();
      this.field_1996.clear();
   }

   // $VF: renamed from: o () void
   private void method_2611() {
      Class10.Inner1 var1;
      while ((var1 = this.field_1994.poll()) != null) {
         if (var1.field_286 instanceof PlayerEntity) {
            List var3 = this.field_1995
               .values()
               .stream()
               .filter(var1x -> var1x.field_286 == var1.field_286 && !var1x.field_284.equals(var1.field_284))
               .sorted(Comparator.comparingDouble(var0 -> var0.field_285))
               .toList();
            if (var3.size() >= 2) {
               Class10.Inner1 var4 = (Class10.Inner1)var3.get(var3.size() - 1);
               this.field_1996.remove(var4.field_284);
            }
         }

         this.field_1995.putIfAbsent(var1.field_284, var1);
         this.field_1996.putIfAbsent(var1.field_284, var1);
      }
   }

   // $VF: renamed from: a (java.util.Map, double) void
   private void method_2612(Map<BlockPos, Class10.Inner1> var1, double var2) {
      Iterator var4 = var1.entrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         BlockPos var6 = (BlockPos)var5.getKey();
         Class10.Inner1 var7 = (Class10.Inner1)var5.getValue();
         BlockState var8 = c.field_1687.method_8320(var6);
         if (var8.method_26215() || !(var7.method_593(var2) <= this.field_1988.method_671()) || !this.method_2615(var6, var8)) {
            var4.remove();
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2613() {
      for (Class10.Inner1 var2 : this.field_1996.values()) {
         var2.field_287 = false;
      }

      HashMap var6 = new HashMap();

      for (Class10.Inner1 var3 : this.field_1996.values()) {
         if (var3.field_286 instanceof PlayerEntity var4) {
            var6.computeIfAbsent(var4, var0 -> new ArrayList<>()).add(var3);
         }
      }

      for (List var9 : var6.values()) {
         var9.sort(Comparator.comparingDouble(var0 -> var0.field_285));
         if (var9.size() >= 2) {
            ((Class10.Inner1)var9.get(var9.size() - 1)).field_287 = true;
         }
      }
   }

   // $VF: renamed from: a () double
   private static double method_2614() {
      return (System.nanoTime() - field_1984) / 5.0E7;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) boolean
   private boolean method_2615(BlockPos var1, BlockState var2) {
      return !c.field_1724.method_68878() && var2.method_26214(c.field_1687, var1) < 0.0F ? false : !var2.method_26218(c.field_1687, var1).method_1110();
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) int
   private int method_2616(BlockState var1) {
      int var2 = -1;
      double var3 = 0.0;

      for (int var5 = 0; var5 <= 8; var5++) {
         ItemStack var6 = c.field_1724.method_31548().method_5438(var5);
         if (!var6.method_7960()) {
            double var7 = this.method_2617(var5, var1);
            if (var7 > var3) {
               var3 = var7;
               var2 = var5;
            }
         }
      }

      return var2;
   }

   // $VF: renamed from: a (int, net.minecraft.block.BlockState) double
   private double method_2617(int var1, BlockState var2) {
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

      if (c.field_1724.method_5777(FluidTags.field_15517)) {
         var3 *= c.field_1724.method_45325(EntityAttributes.field_51576);
      }

      if (!c.field_1724.method_24828()) {
         var3 /= 5.0;
      }

      return var3;
   }

   // $VF: renamed from: a (double, net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos) double
   private double method_2618(double var1, BlockState var3, BlockPos var4) {
      float var5 = var3.method_26214(c.field_1687, var4);
      return var5 == -1.0F ? 0.0 : var1 / var5 / 30.0;
   }

   private class Inner1 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      private final BlockPos field_284;
      // $VF: renamed from: b double
      private final double field_285;
      // $VF: renamed from: c net.minecraft.entity.Entity
      private final Entity field_286;
      // $VF: renamed from: d boolean
      private boolean field_287;

      private Inner1(BlockPos var2, double var3, Entity var5) {
         this.field_284 = var2;
         this.field_285 = var3;
         this.field_286 = var5;
      }

      // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, double) void
      private void method_592(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, double var2) {
         VoxelShape var4 = Dev.ZWare.Client.features.Class1.field_1019
            .field_1687
            .method_8320(this.field_284)
            .method_26218(Dev.ZWare.Client.features.Class1.field_1019.field_1687, this.field_284);
         if (var4 != null && !var4.method_1110()) {
            double var18 = this.field_287 ? Class10.this.field_1986.method_671() : Class10.this.field_1987.method_671();
            Box var7 = var4.method_1107();
            double var8 = 1.0 - (var18 <= 0.0 ? 1.0 : MathHelper.method_15350(this.method_593(var2) * (1.0 / var18), 0.0, 1.0));
            Box var10 = var7.method_1002(var7.method_17939() * var8, var7.method_17940() * var8, var7.method_17941() * var8);
            double var11 = var7.method_17939() * var8 / 2.0;
            double var13 = var7.method_17940() * var8 / 2.0;
            double var15 = var7.method_17941() * var8 / 2.0;
            Box var17 = new Box(
               this.field_284.method_10263() + var10.field_1323 + var11,
               this.field_284.method_10264() + var10.field_1322 + var13,
               this.field_284.method_10260() + var10.field_1321 + var15,
               this.field_284.method_10263() + var10.field_1320 + var11,
               this.field_284.method_10264() + var10.field_1325 + var13,
               this.field_284.method_10260() + var10.field_1324 + var15
            );
            if (Class10.this.field_1991.method_671().method_1118()) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var17, Class10.this.field_1992.method_671());
            }

            if (Class10.this.field_1991.method_671().method_1117()) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var17, Class10.this.field_1993.method_671(), 1.0);
            }
         } else {
            Box var5 = new Box(this.field_284);
            if (Class10.this.field_1991.method_671().method_1118()) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var5, Class10.this.field_1992.method_671());
            }

            if (Class10.this.field_1991.method_671().method_1117()) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var5, Class10.this.field_1993.method_671(), 1.0);
            }
         }
      }

      // $VF: renamed from: a (double) double
      private double method_593(double var1) {
         BlockState var3 = Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8320(this.field_284);
         int var4 = Class10.this.method_2616(var3);
         int var5 = var4 != -1 ? var4 : Dev.ZWare.Client.features.Class1.field_1019.field_1724.method_31548().method_67532();
         return Class10.this.method_2618(Class10.this.method_2617(var5, var3), var3, this.field_284) * (var1 - this.field_285);
      }
   }

   public static class Inner2 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      public final BlockPos field_193;
      // $VF: renamed from: b net.minecraft.entity.player.PlayerEntity
      public final PlayerEntity field_194;
      // $VF: renamed from: c double
      public final double field_195;
      // $VF: renamed from: d boolean
      public final boolean field_196;

      public Inner2(BlockPos pos, PlayerEntity player, double progress, boolean isRebreak) {
         this.field_193 = pos;
         this.field_194 = player;
         this.field_195 = progress;
         this.field_196 = isRebreak;
      }
   }

   public static enum Inner3 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1117() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1118() {
         return this == Sides || this == Both;
      }
   }
}
