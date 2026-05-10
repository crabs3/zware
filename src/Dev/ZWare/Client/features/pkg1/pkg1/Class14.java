package Dev.ZWare.Client.features.pkg1.pkg1;

import com.mojang.blaze3d.opengl.GlStateManager;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.VaultBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.VaultBlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.WorldChunk;

public class Class14 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_2611 = 400L;
   // $VF: renamed from: p int
   private static final int field_2612 = 12;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2613 = this.a("Range", 96.0F, 8.0F, 256.0F);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2614 = this.a("Through Walls", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2615 = this.a("Side Color", new Color(90, 220, 255, 45));
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2616 = this.a("Line Color", new Color(90, 220, 255, 255));
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2617 = this.a("Line Width", 1.5F, 0.1F, 5.0F);
   // $VF: renamed from: v java.util.Set
   private final Set<BlockPos> field_2618 = new LinkedHashSet<>();
   // $VF: renamed from: w java.util.Set
   private final Set<BlockPos> field_2619 = new LinkedHashSet<>();
   // $VF: renamed from: x java.util.Set
   private final Set<Long> field_2620 = new HashSet<>();
   // $VF: renamed from: y java.util.ArrayDeque
   private final ArrayDeque<ChunkPos> field_2621 = new ArrayDeque<>();
   // $VF: renamed from: z long
   private long field_2622;
   // $VF: renamed from: A int
   private int field_2623 = Integer.MIN_VALUE;
   // $VF: renamed from: B int
   private int field_2624 = Integer.MIN_VALUE;
   // $VF: renamed from: C int
   private int field_2625 = Integer.MIN_VALUE;
   // $VF: renamed from: D java.lang.String
   private String field_2626;

   public Class14() {
      super("Vault ESP", "highlights nearby vaults until you use them", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3308();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3308();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2618.isEmpty() ? null : Integer.toString(this.field_2618.size());
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      if (g()) {
         this.method_3307();
      } else {
         this.method_3300();
         long var1 = System.currentTimeMillis();
         if (this.method_3301(var1)) {
            this.method_3302(var1);
         }

         if (!this.field_2621.isEmpty()) {
            this.method_3303();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (!g() && !this.field_2618.isEmpty()) {
         boolean var2 = this.field_2614.method_671();
         if (var2) {
            GlStateManager._disableDepthTest();
            GlStateManager._depthMask(false);
         }

         try {
            Color var3 = this.field_2615.method_671();
            Color var4 = this.field_2616.method_671();

            for (BlockPos var6 : this.field_2618) {
               BlockState var7 = c.field_1687.method_8320(var6);
               if (this.method_3304(var7)) {
                  Box var8 = this.method_3306(var6, var7);
                  if (var3.getAlpha() > 0) {
                     Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(event.method_1055(), var8, var3);
                  }

                  if (var4.getAlpha() > 0) {
                     Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(event.method_1055(), var8, var4, this.field_2617.method_671().floatValue());
                  }
               }
            }
         } finally {
            if (var2) {
               GlStateManager._depthMask(true);
               GlStateManager._enableDepthTest();
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_3299(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var1) {
      if (!g() && var1.method_1045() instanceof PlayerInteractBlockC2SPacket var2) {
         BlockPos var6 = var2.method_12543().method_17777().method_10062();
         BlockState var4 = c.field_1687.method_8320(var6);
         if (this.method_3304(var4)) {
            ItemStack var5 = var2.method_12546() == Hand.field_5810 ? c.field_1724.method_6079() : c.field_1724.method_6047();
            if (this.method_3305(var5, var4)) {
               this.field_2620.add(var6.method_10063());
               this.field_2618.remove(var6);
               this.field_2619.remove(var6);
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_3300() {
      if (c.field_1687 != null) {
         String var1 = c.field_1687.method_27983().method_29177().toString();
         if (!Objects.equals(this.field_2626, var1)) {
            this.method_3308();
            this.field_2626 = var1;
         }
      }
   }

   // $VF: renamed from: a (long) boolean
   private boolean method_3301(long var1) {
      if (c.field_1724 == null) {
         return true;
      } else {
         int var3 = c.field_1724.method_31476().field_9181;
         int var4 = c.field_1724.method_31476().field_9180;
         int var5 = Float.floatToIntBits(this.field_2613.method_671());
         return var3 == this.field_2623 && var4 == this.field_2624 && var5 == this.field_2625 ? this.field_2621.isEmpty() && var1 >= this.field_2622 : true;
      }
   }

   // $VF: renamed from: a (long) void
   private void method_3302(long var1) {
      if (c.field_1724 != null && c.field_1687 != null) {
         this.field_2621.clear();
         this.field_2619.clear();
         this.field_2622 = var1 + 400L;
         this.field_2623 = c.field_1724.method_31476().field_9181;
         this.field_2624 = c.field_1724.method_31476().field_9180;
         this.field_2625 = Float.floatToIntBits(this.field_2613.method_671());
         int var3 = Math.max(1, MathHelper.method_15386(this.field_2613.method_671() / 16.0F));

         for (int var4 = this.field_2623 - var3; var4 <= this.field_2623 + var3; var4++) {
            for (int var5 = this.field_2624 - var3; var5 <= this.field_2624 + var3; var5++) {
               this.field_2621.addLast(new ChunkPos(var4, var5));
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_3303() {
      if (c.field_1724 != null && c.field_1687 != null) {
         double var1 = this.field_2613.method_671() * this.field_2613.method_671();

         for (int var3 = 0; var3 < 12 && !this.field_2621.isEmpty(); var3++) {
            ChunkPos var4 = this.field_2621.pollFirst();
            if (var4 == null) {
               break;
            }

            WorldChunk var5 = c.field_1687.method_2935().method_2857(var4.field_9181, var4.field_9180, ChunkStatus.field_12803, false);
            if (var5 != null) {
               for (BlockEntity var7 : var5.method_12214().values()) {
                  if (var7 instanceof VaultBlockEntity && !var7.method_11015()) {
                     BlockPos var8 = var7.method_11016().method_10062();
                     if (!this.field_2620.contains(var8.method_10063())
                        && !(c.field_1724.method_5649(var8.method_10263() + 0.5, var8.method_10264() + 0.5, var8.method_10260() + 0.5) > var1)) {
                        BlockState var9 = c.field_1687.method_8320(var8);
                        if (this.method_3304(var9)) {
                           this.field_2619.add(var8);
                        }
                     }
                  }
               }
            }
         }

         if (this.field_2621.isEmpty()) {
            this.field_2618.clear();
            this.field_2618.addAll(this.field_2619);
            this.field_2619.clear();
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) boolean
   private boolean method_3304(BlockState var1) {
      return var1 != null && var1.method_26204() == Blocks.field_48851;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack, net.minecraft.block.BlockState) boolean
   private boolean method_3305(ItemStack var1, BlockState var2) {
      if (var1 != null && !var1.method_7960()) {
         Item var3 = var2.method_11654(VaultBlock.field_50171) ? Items.field_50139 : Items.field_47315;
         return var1.method_31574(var3);
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) net.minecraft.util.math.Box
   private Box method_3306(BlockPos var1, BlockState var2) {
      VoxelShape var3 = var2.method_26218(c.field_1687, var1);
      Box var4 = var3.method_1110() ? new Box(var1) : var3.method_1107().method_996(var1);
      return var4.method_1014(0.002);
   }

   // $VF: renamed from: p () void
   private void method_3307() {
      this.field_2618.clear();
      this.field_2619.clear();
      this.field_2621.clear();
      this.field_2622 = 0L;
      this.field_2623 = Integer.MIN_VALUE;
      this.field_2624 = Integer.MIN_VALUE;
      this.field_2625 = Integer.MIN_VALUE;
      this.field_2626 = null;
   }

   // $VF: renamed from: q () void
   private void method_3308() {
      this.method_3307();
      this.field_2620.clear();
   }
}
