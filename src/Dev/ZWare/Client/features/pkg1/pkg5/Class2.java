package Dev.ZWare.Client.features.pkg1.pkg5;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CrafterBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.HopperBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.WorldChunk;

public class Class2 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_1762 = 250L;
   // $VF: renamed from: p long
   private static final long field_1763 = 1000L;
   // $VF: renamed from: q long
   private static final long field_1764 = 1000L;
   // $VF: renamed from: r int
   private static final int field_1765 = 32;
   // $VF: renamed from: s int
   private static final int field_1766 = 6;
   // $VF: renamed from: t int
   private static final int field_1767 = 6;
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner2> field_1768 = this.a("Mode", Class2.Inner2.Storage).method_683("Targets");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1769 = this.a("Range", 128.0F, 8.0F, 512.0F).method_683("Targets");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1770 = this.a("Chests", true).method_683("Targets");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1771 = this.a("Chest Color", new Color(255, 184, 72, 220)).method_683("Targets");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1772 = this.a("Trapped Chests", true).method_683("Targets");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1773 = this.a("Trapped Chest Color", new Color(255, 96, 96, 220)).method_683("Targets");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1774 = this.a("Ender Chests", true).method_683("Targets");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1775 = this.a("Ender Chest Color", new Color(170, 96, 255, 220)).method_683("Targets");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1776 = this.a("Shulkers", true).method_683("Targets");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1777 = this.a("Shulker Color", new Color(255, 120, 222, 220)).method_683("Targets");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1778 = this.a("Storage", true).method_683("Targets");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1779 = this.a("Storage Color", new Color(96, 220, 255, 220)).method_683("Targets");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class7
   private final Dev.ZWare.Client.features.pkg3.Class7 field_1780 = (Dev.ZWare.Client.features.pkg3.Class7)this.a(
      new Dev.ZWare.Client.features.pkg3.Class7("Blocks").a("Targets")
   );
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1781 = this.a("Block Color", new Color(120, 255, 120, 220)).method_683("Targets");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1782 = this.a("Through Walls", true).method_683("Render");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1783 = this.a("Transparency", 0.35F, 0.0F, 1.0F).method_683("Render");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1784 = this.a("Glow Thickness", 2, 0, 10).method_683("Render");
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1785 = this.a("Inner Glow", false).method_683("Render");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1786 = this.a("Inner Glow Thickness", 2, 1, 16).method_683("Render");
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1787 = this.a("Glow Sample Step", 1, 1, 16).method_683("Render");
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1788 = this.a("Glow Intensity", 1.35F, 0.0F, 3.0F).method_683("Render");
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1789 = this.a("Outline Width", 2.2F, 0.5F, 6.0F).method_683("Render");
   // $VF: renamed from: Q java.util.EnumMap
   private final EnumMap<Class2.Inner1, List<Box>> field_1790 = new EnumMap<>(Class2.Inner1.class);
   // $VF: renamed from: R java.util.EnumMap
   private final EnumMap<Class2.Inner1, List<Box>> field_1791 = new EnumMap<>(Class2.Inner1.class);
   // $VF: renamed from: S java.util.ArrayDeque
   private final ArrayDeque<ChunkPos> field_1792 = new ArrayDeque<>();
   // $VF: renamed from: T long
   private long field_1793;
   // $VF: renamed from: U int
   private int field_1794 = Integer.MIN_VALUE;
   // $VF: renamed from: V int
   private int field_1795 = Integer.MIN_VALUE;
   // $VF: renamed from: W int
   private int field_1796 = Integer.MIN_VALUE;
   // $VF: renamed from: X int
   private int field_1797;
   // $VF: renamed from: Y int
   private int field_1798;

   public Class2() {
      super("Search", "highlights storage blocks with the chams-style world render", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      this.method_2398(this.field_1790);
      this.method_2398(this.field_1791);
      this.field_1770.method_709(var1 -> this.method_2393());
      this.field_1771.method_709(var1 -> this.method_2393() && this.field_1770.method_671());
      this.field_1772.method_709(var1 -> this.method_2393());
      this.field_1773.method_709(var1 -> this.method_2393() && this.field_1772.method_671());
      this.field_1774.method_709(var1 -> this.method_2393());
      this.field_1775.method_709(var1 -> this.method_2393() && this.field_1774.method_671());
      this.field_1776.method_709(var1 -> this.method_2393());
      this.field_1777.method_709(var1 -> this.method_2393() && this.field_1776.method_671());
      this.field_1778.method_709(var1 -> this.method_2393());
      this.field_1779.method_709(var1 -> this.method_2393() && this.field_1778.method_671());
      this.field_1780.a(var1 -> this.method_2394());
      this.field_1781.method_709(var1 -> this.method_2394());
      this.field_1786.method_709(var1 -> this.field_1785.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2396();
      this.method_2397();
      this.field_1793 = 0L;
      this.field_1794 = Integer.MIN_VALUE;
      this.field_1795 = Integer.MIN_VALUE;
      this.field_1796 = Integer.MIN_VALUE;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2396();
      this.method_2397();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_1797 <= 0 ? null : Integer.toString(this.field_1797);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (g()) {
         this.method_2396();
      } else {
         long var2 = System.currentTimeMillis();
         if (this.method_2377(var2)) {
            this.method_2378(var2);
         }

         if (!this.field_1792.isEmpty()) {
            this.method_2379();
         }

         if (this.field_1797 > 0) {
            for (Class2.Inner1 var7 : Class2.Inner1.values()) {
               List var8 = this.field_1790.get(var7);
               if (var8 != null && !var8.isEmpty() && this.method_2392(var7)) {
                  Color var9 = this.method_2395(var7);
                  if (var9.getAlpha() > 0) {
                     this.method_2388(event, var8, var9);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (long) boolean
   private boolean method_2377(long var1) {
      if (c.field_1724 == null) {
         return true;
      } else {
         int var3 = c.field_1724.method_31476().field_9181;
         int var4 = c.field_1724.method_31476().field_9180;
         int var5 = this.method_2382();
         if (var3 != this.field_1794 || var4 != this.field_1795) {
            return true;
         } else {
            return var5 != this.field_1796 ? true : this.field_1792.isEmpty() && var1 >= this.field_1793;
         }
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2378(long var1) {
      if (c.field_1724 != null && c.field_1687 != null) {
         double var3 = this.field_1769.method_671().floatValue();
         int var5 = Math.max(1, MathHelper.method_15384(var3 / 16.0));
         int var6 = c.field_1724.method_31476().field_9181;
         int var7 = c.field_1724.method_31476().field_9180;
         int var8 = this.method_2382();
         boolean var9 = var8 != this.field_1796;
         if (var9) {
            this.method_2396();
         }

         this.method_2397();
         this.field_1793 = var1 + this.method_2383();
         this.field_1794 = var6;
         this.field_1795 = var7;
         this.field_1796 = var8;

         for (int var10 = var6 - var5; var10 <= var6 + var5; var10++) {
            for (int var11 = var7 - var5; var11 <= var7 + var5; var11++) {
               this.field_1792.addLast(new ChunkPos(var10, var11));
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2379() {
      if (c.field_1724 != null && c.field_1687 != null) {
         double var1 = this.field_1769.method_671() * this.field_1769.method_671();
         int var3 = this.method_2384();

         for (int var4 = 0; var4 < var3 && !this.field_1792.isEmpty(); var4++) {
            ChunkPos var5 = this.field_1792.pollFirst();
            if (var5 == null) {
               break;
            }

            WorldChunk var6 = c.field_1687.method_2935().method_2857(var5.field_9181, var5.field_9180, ChunkStatus.field_12803, false);
            if (var6 != null) {
               if (this.field_1768.method_671() == Class2.Inner2.Storage) {
                  this.method_2380(var6, var1);
               } else if (this.field_1768.method_671() == Class2.Inner2.Block) {
                  this.method_2381(var6, var1);
               } else {
                  this.method_2380(var6, var1);
                  this.method_2381(var6, var1);
               }
            }
         }

         if (this.field_1792.isEmpty()) {
            this.method_2385();
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.world.chunk.WorldChunk, double) void
   private void method_2380(WorldChunk var1, double var2) {
      if (c.field_1724 != null && c.field_1687 != null) {
         for (BlockEntity var5 : var1.method_12214().values()) {
            if (var5 != null && !var5.method_11015()) {
               BlockPos var6 = var5.method_11016();
               if (!(c.field_1724.method_5649(var6.method_10263() + 0.5, var6.method_10264() + 0.5, var6.method_10260() + 0.5) > var2)) {
                  BlockState var7 = c.field_1687.method_8320(var6);
                  if (!var7.method_26215()) {
                     Class2.Inner1 var8 = this.method_2386(var7);
                     if (var8 != null) {
                        this.field_1791.get(var8).add(this.method_2387(var6, var7));
                        this.field_1798++;
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.world.chunk.WorldChunk, double) void
   private void method_2381(WorldChunk var1, double var2) {
      if (c.field_1724 != null && c.field_1687 != null) {
         Set var4 = (Set)this.field_1780.a();
         if (var4 != null && !var4.isEmpty()) {
            var1.method_51525(var1x -> !var1x.method_26215() && var4.contains(var1x.method_26204()), (var3, var4x) -> {
               if (c.field_1724 != null) {
                  if (!(c.field_1724.method_5649(var3.method_10263() + 0.5, var3.method_10264() + 0.5, var3.method_10260() + 0.5) > var2)) {
                     this.field_1791.get(Class2.Inner1.BLOCK).add(this.method_2387(var3, var4x));
                     this.field_1798++;
                  }
               }
            });
         }
      }
   }

   // $VF: renamed from: a () int
   private int method_2382() {
      int var1 = 17;
      var1 = 31 * var1 + this.field_1768.method_671().ordinal();
      var1 = 31 * var1 + Float.floatToIntBits(this.field_1769.method_671());
      if (this.method_2394()) {
         var1 = 31 * var1 + ((Set)this.field_1780.a()).hashCode();
      }

      return var1;
   }

   // $VF: renamed from: a () long
   private long method_2383() {
      return switch ((Class2.Inner2)this.field_1768.method_671()) {
         case Storage -> 250L;
         case Block -> 1000L;
         case Both -> 1000L;
      };
   }

   // $VF: renamed from: b () int
   private int method_2384() {
      return switch ((Class2.Inner2)this.field_1768.method_671()) {
         case Storage -> 32;
         case Block -> 6;
         case Both -> 6;
      };
   }

   // $VF: renamed from: o () void
   private void method_2385() {
      this.method_2396();

      for (Class2.Inner1 var4 : Class2.Inner1.values()) {
         this.field_1790.get(var4).addAll(this.field_1791.get(var4));
      }

      this.field_1797 = this.field_1798;
      this.method_2397();
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) Dev.ZWare.Client.features.pkg1.pkg5.Class2$Inner1
   private Class2.Inner1 method_2386(BlockState var1) {
      Block var2 = var1.method_26204();
      if (var2 == Blocks.field_10034) {
         return Class2.Inner1.CHEST;
      } else if (var2 == Blocks.field_10380) {
         return Class2.Inner1.TRAPPED_CHEST;
      } else if (var2 == Blocks.field_10443) {
         return Class2.Inner1.ENDER_CHEST;
      } else if (var2 instanceof ShulkerBoxBlock) {
         return Class2.Inner1.SHULKER;
      } else {
         return !(var2 instanceof BarrelBlock) && !(var2 instanceof HopperBlock) && !(var2 instanceof DispenserBlock) && !(var2 instanceof CrafterBlock)
            ? null
            : Class2.Inner1.STORAGE;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) net.minecraft.util.math.Box
   private Box method_2387(BlockPos var1, BlockState var2) {
      VoxelShape var3 = var2.method_26218(c.field_1687, var1);
      Box var4 = var3.method_1110() ? new Box(var1) : var3.method_1107().method_996(var1);
      return var4.method_1014(0.002);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, java.util.List, java.awt.Color) void
   private void method_2388(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, List<Box> var2, Color var3) {
      if (!this.method_2389(var1, var2, var3)) {
         this.method_2390(var1, var2, var3);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, java.util.List, java.awt.Color) boolean
   private boolean method_2389(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, List<Box> var2, Color var3) {
      if (Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_793(this.method_2391(var3))) {
         boolean var4 = this.field_1782.method_671();
         if (var4) {
            GlStateManager._disableDepthTest();
            GlStateManager._depthMask(false);
         }

         try {
            Color var5 = this.method_2399(var3);

            for (Box var7 : var2) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var7, var5);
            }
         } finally {
            if (var4) {
               GlStateManager._depthMask(true);
               GlStateManager._enableDepthTest();
            }

            Dev.ZWare.Client.Class1.field_306.method_796();
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14, java.util.List, java.awt.Color) void
   private void method_2390(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, List<Box> var2, Color var3) {
      boolean var4 = this.field_1782.method_671();
      if (var4) {
         GlStateManager._disableDepthTest();
         GlStateManager._depthMask(false);
      }

      try {
         Color var5 = this.method_2400(var3, this.field_1783.method_671());

         for (Box var7 : var2) {
            if (var5.getAlpha() > 0) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var7, var5);
            }

            Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var7, var3, this.field_1789.method_671().floatValue());
         }
      } finally {
         if (var4) {
            GlStateManager._depthMask(true);
            GlStateManager._enableDepthTest();
         }
      }
   }

   // $VF: renamed from: a (java.awt.Color) Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5
   private Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5 method_2391(Color var1) {
      float var2 = var1.getAlpha() / 255.0F;
      float var3 = MathHelper.method_15363(this.field_1783.method_671() * var2, 0.0F, 1.0F);
      Color var4 = this.method_2399(var1);
      return new Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5(
         Class7.Inner2.Default,
         var1,
         var4,
         false,
         var4,
         var4,
         Class7.Inner1.Vertical,
         var3,
         this.field_1784.method_671(),
         this.field_1785.method_671(),
         this.field_1786.method_671(),
         this.field_1787.method_671(),
         this.field_1788.method_671(),
         "minecraft:textures/misc/enchanted_glint_item.png",
         0.1F,
         8.0F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.05F,
         false,
         this.field_1789.method_671(),
         false
      );
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class2$Inner1) boolean
   private boolean method_2392(Class2.Inner1 var1) {
      return switch (var1) {
         case BLOCK -> this.method_2394() && this.field_1780.a() != null && !((Set)this.field_1780.a()).isEmpty();
         case CHEST -> this.field_1770.method_671();
         case TRAPPED_CHEST -> this.field_1772.method_671();
         case ENDER_CHEST -> this.field_1774.method_671();
         case SHULKER -> this.field_1776.method_671();
         case STORAGE -> this.field_1778.method_671();
      };
   }

   // $VF: renamed from: a () boolean
   private boolean method_2393() {
      return this.field_1768.method_671() != Class2.Inner2.Block;
   }

   // $VF: renamed from: b () boolean
   private boolean method_2394() {
      return this.field_1768.method_671() != Class2.Inner2.Storage;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class2$Inner1) java.awt.Color
   private Color method_2395(Class2.Inner1 var1) {
      return switch (var1) {
         case BLOCK -> (Color)this.field_1781.method_671();
         case CHEST -> (Color)this.field_1771.method_671();
         case TRAPPED_CHEST -> (Color)this.field_1773.method_671();
         case ENDER_CHEST -> (Color)this.field_1775.method_671();
         case SHULKER -> (Color)this.field_1777.method_671();
         case STORAGE -> (Color)this.field_1779.method_671();
      };
   }

   // $VF: renamed from: p () void
   private void method_2396() {
      for (List var2 : this.field_1790.values()) {
         var2.clear();
      }

      this.field_1797 = 0;
   }

   // $VF: renamed from: q () void
   private void method_2397() {
      this.field_1792.clear();

      for (List var2 : this.field_1791.values()) {
         var2.clear();
      }

      this.field_1798 = 0;
   }

   // $VF: renamed from: a (java.util.EnumMap) void
   private void method_2398(EnumMap<Class2.Inner1, List<Box>> var1) {
      for (Class2.Inner1 var5 : Class2.Inner1.values()) {
         var1.put(var5, new ArrayList());
      }
   }

   // $VF: renamed from: a (java.awt.Color) java.awt.Color
   private Color method_2399(Color var1) {
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), 255);
   }

   // $VF: renamed from: a (java.awt.Color, float) java.awt.Color
   private Color method_2400(Color var1, float var2) {
      int var3 = MathHelper.method_15340(Math.round(var1.getAlpha() * MathHelper.method_15363(var2, 0.0F, 1.0F)), 0, 255);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var3);
   }

   private static enum Inner1 {
      BLOCK,
      CHEST,
      TRAPPED_CHEST,
      ENDER_CHEST,
      SHULKER,
      STORAGE;
   }

   private static enum Inner2 {
      Storage,
      Block,
      Both;
   }
}
