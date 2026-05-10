package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.WorldChunk;

public class Class5 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1931 = this.a("Range", 4.5, 1.0, 6.0);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1932 = this.a("Delay Ms", 200, 0, 2000);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1933 = this.a("Break Priority", 100.0, 0.0, 500.0);
   // $VF: renamed from: r java.util.Set
   private final Set<Long> field_1934 = new HashSet<>();
   // $VF: renamed from: s java.util.Set
   private final Set<Long> field_1935 = new HashSet<>();
   // $VF: renamed from: t java.util.ArrayDeque
   private final ArrayDeque<BlockPos> field_1936 = new ArrayDeque<>();
   // $VF: renamed from: u net.minecraft.util.math.BlockPos
   private BlockPos field_1937;
   // $VF: renamed from: v long
   private long field_1938;
   // $VF: renamed from: w long
   private long field_1939;
   // $VF: renamed from: x long
   private long field_1940;

   public Class5() {
      super("Scanner", "auto-opens nearby chests and breaks the ones without shulkers", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2575();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2575();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_1937 != null) {
         return "Open";
      } else {
         return !this.field_1936.isEmpty() ? "Break" : null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2560(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.field_1761 != null) {
         long var2 = System.currentTimeMillis();
         this.method_2561(var2);
         if (var2 >= this.field_1939) {
            if (!this.method_2562(var2)) {
               if (this.field_1937 != null) {
                  long var6 = Math.max(750L, this.field_1932.method_671().longValue() * 2L + 100L);
                  if (!this.method_2573(c.field_1687.method_8320(this.field_1937))) {
                     this.field_1937 = null;
                  } else if (!(c.field_1724.field_7512 instanceof GenericContainerScreenHandler) && var2 - this.field_1938 > var6) {
                     this.field_1937 = null;
                     this.field_1939 = var2 + this.field_1932.method_671().intValue();
                  }
               } else if (c.field_1755 == null && c.field_1724.field_7512 instanceof PlayerScreenHandler) {
                  BlockPos var4 = this.method_2563();
                  if (var4 != null) {
                     if (this.method_2564(var4)) {
                        this.field_1937 = var4.method_10062();
                        this.field_1938 = var2;
                        this.field_1939 = var2 + this.field_1932.method_671().intValue();
                     }
                  }
               }
            }
         }
      } else {
         this.method_2574();
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2561(long var1) {
      if (this.field_1937 != null && c.field_1724 != null) {
         if (c.field_1724.field_7512 instanceof GenericContainerScreenHandler var3) {
            if (var1 >= this.field_1938 + this.field_1932.method_671().intValue()) {
               boolean var5 = this.method_2565(var3);
               this.method_2570(this.field_1937);
               if (var5) {
                  this.method_2571(this.field_1937);
                  this.field_1937 = null;
                  this.field_1939 = var1 + this.field_1932.method_671().intValue();
               } else {
                  this.method_2567(this.field_1937);
                  c.field_1724.method_7346();
                  this.field_1937 = null;
                  this.field_1939 = var1 + this.field_1932.method_671().intValue();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (long) boolean
   private boolean method_2562(long var1) {
      if (c.field_1687 == null) {
         this.field_1936.clear();
         return false;
      } else {
         while (!this.field_1936.isEmpty() && !this.method_2573(c.field_1687.method_8320(this.field_1936.peekFirst()))) {
            this.field_1936.pollFirst();
         }

         BlockPos var3 = this.field_1936.peekFirst();
         if (var3 == null) {
            return false;
         } else {
            Dev.ZWare.Client.features.pkg1.pkg3.Class8 var4 = Dev.ZWare.Client.features.pkg1.pkg3.Class8.method_32();
            if (var4 == null || var4.method_31()) {
               if (var1 - this.field_1940 > 2000L) {
                  Dev.ZWare.Client.features.pkg2.Class1.method_1647(String.format(Locale.ROOT, "[Scanner] Double Mine must be enabled to break empty chests."));
                  this.field_1940 = var1;
               }

               return true;
            } else if (!var4.method_27(var3)) {
               return true;
            } else {
               if (!var4.method_28(var3)) {
                  var4.method_18(var3, Direction.field_11036, this.field_1933.method_671());
               }

               this.field_1936.pollFirst();
               this.field_1939 = var1 + this.field_1932.method_671().intValue();
               return true;
            }
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.util.math.BlockPos
   private BlockPos method_2563() {
      if (c.field_1724 != null && c.field_1687 != null) {
         double var1 = this.field_1931.method_671() * this.field_1931.method_671();
         int var3 = Math.max(1, MathHelper.method_15384(this.field_1931.method_671() / 16.0));
         int var4 = c.field_1724.method_31476().field_9181;
         int var5 = c.field_1724.method_31476().field_9180;
         BlockPos var6 = null;
         double var7 = Double.MAX_VALUE;

         for (int var9 = var4 - var3; var9 <= var4 + var3; var9++) {
            for (int var10 = var5 - var3; var10 <= var5 + var3; var10++) {
               WorldChunk var11 = c.field_1687.method_2935().method_2857(var9, var10, ChunkStatus.field_12803, false);
               if (var11 != null) {
                  for (BlockEntity var13 : var11.method_12214().values()) {
                     if (var13 instanceof ChestBlockEntity) {
                        BlockPos var14 = var13.method_11016().method_10062();
                        long var15 = var14.method_10063();
                        if (!this.field_1934.contains(var15) && !this.field_1935.contains(var15) && !this.method_2569(var15)) {
                           BlockState var17 = c.field_1687.method_8320(var14);
                           if (this.method_2573(var17)) {
                              double var18 = c.field_1724.method_5649(var14.method_10263() + 0.5, var14.method_10264() + 0.5, var14.method_10260() + 0.5);
                              if (!(var18 > var1) && !(var18 >= var7)) {
                                 var6 = var14;
                                 var7 = var18;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2564(BlockPos var1) {
      if (c.field_1724 != null && c.field_1761 != null) {
         BlockHitResult var2 = new BlockHitResult(Vec3d.method_24953(var1), Direction.field_11036, var1, false);
         ActionResult var3 = c.field_1761.method_2896(c.field_1724, Hand.field_5808, var2);
         return var3.method_23665();
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.GenericContainerScreenHandler) boolean
   private boolean method_2565(GenericContainerScreenHandler var1) {
      int var2 = Math.min(var1.method_17388() * 9, var1.field_7761.size());

      for (int var3 = 0; var3 < var2; var3++) {
         ItemStack var4 = var1.method_7611(var3).method_7677();
         if (this.method_2566(var4)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2566(ItemStack var1) {
      return !var1.method_7960() && var1.method_7909() instanceof BlockItem var2 && var2.method_7711() instanceof ShulkerBoxBlock;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   private void method_2567(BlockPos var1) {
      this.method_2568(var1);
      BlockPos var2 = this.method_2572(var1);
      if (var2 != null) {
         this.method_2568(var2);
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) void
   private void method_2568(BlockPos var1) {
      if (var1 != null) {
         for (BlockPos var3 : this.field_1936) {
            if (var3.equals(var1)) {
               return;
            }
         }

         this.field_1936.addLast(var1.method_10062());
      }
   }

   // $VF: renamed from: b (long) boolean
   private boolean method_2569(long var1) {
      for (BlockPos var4 : this.field_1936) {
         if (var4.method_10063() == var1) {
            return true;
         }
      }

      return this.field_1937 != null && this.field_1937.method_10063() == var1;
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) void
   private void method_2570(BlockPos var1) {
      this.field_1934.add(var1.method_10063());
      BlockPos var2 = this.method_2572(var1);
      if (var2 != null) {
         this.field_1934.add(var2.method_10063());
      }
   }

   // $VF: renamed from: d (net.minecraft.util.math.BlockPos) void
   private void method_2571(BlockPos var1) {
      this.field_1935.add(var1.method_10063());
      BlockPos var2 = this.method_2572(var1);
      if (var2 != null) {
         this.field_1935.add(var2.method_10063());
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.BlockPos
   private BlockPos method_2572(BlockPos var1) {
      if (c.field_1687 == null) {
         return null;
      } else {
         BlockState var2 = c.field_1687.method_8320(var1);
         if (!this.method_2573(var2)) {
            return null;
         } else {
            Block var3 = var2.method_26204();

            for (Direction var7 : new Direction[]{Direction.field_11043, Direction.field_11035, Direction.field_11034, Direction.field_11039}) {
               BlockPos var8 = var1.method_10093(var7);
               if (c.field_1687.method_8320(var8).method_26204() == var3) {
                  return var8.method_10062();
               }
            }

            return null;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) boolean
   private boolean method_2573(BlockState var1) {
      Block var2 = var1.method_26204();
      return var2 instanceof ChestBlock || var2 == Blocks.field_10380;
   }

   // $VF: renamed from: n () void
   private void method_2574() {
      this.field_1937 = null;
      this.field_1938 = 0L;
      this.field_1939 = 0L;
      this.field_1940 = 0L;
      this.field_1936.clear();
   }

   // $VF: renamed from: o () void
   private void method_2575() {
      this.method_2574();
      this.field_1934.clear();
      this.field_1935.clear();
   }
}
