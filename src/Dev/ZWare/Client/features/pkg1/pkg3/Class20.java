package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Type;

public class Class20 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_2685 = this.a("Block", Blocks.field_10540).method_683("General");
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class20.Inner2> field_2686 = this.a("Target Priority", Class20.Inner2.ClosestDistance)
      .method_683("General");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2687 = this.a("Target Range", 14.0, 1.0, 32.0).method_683("General");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2688 = this.a("Pause While Eatting", true).method_683("General");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2689 = this.a("Floor Block", true).method_683("General");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2690 = this.a("Face Blocks", true).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2691 = this.a("Fall Threshold", 0.1, 0.0, 1.0).method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2692 = this.a("Trap Digging", true).method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2693 = this.a("Render", true).method_683("Render");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class20.Inner1> field_2694 = this.a("Shape Mode", Class20.Inner1.Both).method_683("Render");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2695 = this.a("Placement Color", 0, 200, 255, 35).method_683("Render");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2696 = this.a("Predict Color", 255, 140, 0, 35).method_683("Render");
   // $VF: renamed from: A net.minecraft.entity.player.PlayerEntity
   private PlayerEntity field_2697;
   // $VF: renamed from: B java.util.List
   private final List<BlockPos> field_2698 = new ArrayList<>();
   // $VF: renamed from: C net.minecraft.util.math.Vec3d
   private Vec3d field_2699;

   public Class20() {
      super(
         "Fall Blocker",
         "stops chinks like nigga3sb from macing or people who think they playing grim from digging down",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT,
         true,
         false,
         false
      );
      this.field_2694.method_709(var1 -> this.field_2693.method_671());
      this.field_2695.method_709(var1 -> this.field_2693.method_671());
      this.field_2696.method_709(var1 -> this.field_2693.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2697 = null;
      this.field_2698.clear();
      this.field_2699 = null;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2697 = null;
      this.field_2698.clear();
      this.field_2699 = null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3380(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         this.field_2697 = null;
         this.field_2698.clear();
         this.field_2699 = null;
      } else {
         this.field_2698.clear();
         this.field_2699 = null;
         if (this.field_2697 == null || !this.method_3382(this.field_2697)) {
            this.field_2697 = this.method_3381();
            if (this.field_2697 == null) {
               return;
            }
         }

         if (!this.method_3382(this.field_2697)) {
            this.field_2697 = null;
         } else if (this.method_3384(this.field_2697)) {
            if (!this.field_2688.method_671() || !c.field_1724.method_6115()) {
               Vec3d var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2046() ? this.method_3386(this.field_2697) : this.field_2697.method_19538();
               this.field_2699 = var2;
               ArrayList var3 = new ArrayList<>(this.method_3385(this.field_2697, var2));
               if (this.method_3388(var3)) {
                  this.field_2698.addAll(var3);
                  var3.sort(Comparator.comparingDouble(var1x -> Vec3d.method_24953(var1x).method_1025(var2)));
                  this.method_3387(var3);
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2693.method_671() && !g() && this.field_2697 != null) {
         if (this.field_2699 != null) {
            Box var2 = new Box(
               this.field_2699.field_1352 - 0.1,
               this.field_2699.field_1351 - 0.1,
               this.field_2699.field_1350 - 0.1,
               this.field_2699.field_1352 + 0.1,
               this.field_2699.field_1351 + 0.1,
               this.field_2699.field_1350 + 0.1
            );
            this.method_3392(event, var2, this.field_2696.method_671());
         }

         for (BlockPos var3 : this.field_2698) {
            if (this.method_3389(var3)) {
               this.method_3392(event, new Box(var3), this.field_2695.method_671());
            }
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2697 == null ? null : this.field_2697.method_5477().getString();
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_3381() {
      PlayerEntity var1 = null;
      double var2 = Double.POSITIVE_INFINITY;

      for (PlayerEntity var5 : c.field_1687.method_18456()) {
         if (this.method_3382(var5)) {
            double var6 = this.method_3383(var5);
            if (var6 < var2) {
               var2 = var6;
               var1 = var5;
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_3382(PlayerEntity var1) {
      if (var1 == null || var1 == c.field_1724 || var1 == c.field_1719) {
         return false;
      } else if (!var1.method_5805() || var1.method_31481() || var1.method_7325() || var1.method_68878()) {
         return false;
      } else if (Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_377(var1)) {
         return false;
      } else {
         double var2 = this.field_2687.method_671() * this.field_2687.method_671();
         return c.field_1724.method_33571().method_1025(var1.method_19538()) <= var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) double
   private double method_3383(PlayerEntity var1) {
      return switch ((Class20.Inner2)this.field_2686.method_671()) {
         case ClosestAngle -> {
            float[] var2 = Dev.ZWare.Client.Class1.field_298.method_332(var1.method_33571());
            double var3 = Math.abs(MathHelper.method_15393(var2[0] - c.field_1724.method_36454()));
            double var5 = Math.abs(var2[1] - c.field_1724.method_36455());
            yield var3 + var5 * 0.5 + c.field_1724.method_5858(var1) * 0.01;
         }
         case ClosestDistance -> c.field_1724.method_5858(var1);
      };
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_3384(PlayerEntity var1) {
      if (var1 == null) {
         return false;
      } else if (!var1.method_24828() && var1.method_18798().field_1351 < -this.field_2691.method_671()) {
         return true;
      } else {
         if (this.field_2692.method_671()) {
            BlockPos var2 = var1.method_24515().method_10074();
            BlockState var3 = c.field_1687.method_8320(var2);
            if (!var3.method_26215() && !var3.method_45474() && var1.method_24828() && var1.method_18798().field_1351 <= 0.0 && var1.method_36455() > 45.0F) {
               return true;
            }
         }

         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Vec3d) java.util.Set
   private Set<BlockPos> method_3385(PlayerEntity var1, Vec3d var2) {
      LinkedHashSet var3 = new LinkedHashSet();
      BlockPos var4 = BlockPos.method_49638(var2);
      if (this.field_2689.method_671()) {
         var3.add(var4.method_10074().method_10062());
      }

      if (this.field_2690.method_671()) {
         BlockPos var5 = var4.method_10084();

         for (Direction var7 : Type.field_11062) {
            var3.add(var5.method_10093(var7).method_10062());
         }
      }

      return var3;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) net.minecraft.util.math.Vec3d
   private Vec3d method_3386(PlayerEntity var1) {
      if (Dev.ZWare.Client.pkg1.Class18.method_222(var1, c.field_1687)) {
         return var1.method_19538();
      } else {
         int var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2047();
         if (var2 <= 0) {
            return var1.method_19538();
         } else {
            return Dev.ZWare.Client.features.pkg1.pkg4.Class12.method_2049()
               ? Dev.ZWare.Client.pkg1.Class18.method_213(var1, c.field_1687, var2)
               : Dev.ZWare.Client.pkg1.Class18.method_216(var1, var2);
         }
      }
   }

   // $VF: renamed from: a (java.util.List) void
   private void method_3387(List<BlockPos> var1) {
      if (!var1.isEmpty() && Dev.ZWare.Client.Class1.field_301 != null) {
         Block var2 = this.field_2685.method_671();
         if (var2 != null && var2 != Blocks.field_10124) {
            if (Dev.ZWare.Client.Class1.field_301.method_916(var1, var2.method_8389())) {
               try {
                  for (BlockPos var4 : var1) {
                     Dev.ZWare.Client.Class1.field_301.method_919(var2, var4);
                  }
               } finally {
                  Dev.ZWare.Client.Class1.field_301.method_929();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List) boolean
   private boolean method_3388(List<BlockPos> var1) {
      if (!var1.isEmpty() && Dev.ZWare.Client.Class1.field_301 != null) {
         Block var2 = this.field_2685.method_671();
         if (var2 != null && var2 != Blocks.field_10124) {
            if (var1.size() > Dev.ZWare.Client.Class1.field_301.method_932()) {
               return false;
            } else {
               for (BlockPos var4 : var1) {
                  if (!this.method_3390(var2, var4)) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3389(BlockPos var1) {
      Block var2 = this.field_2685.method_671();
      return var2 != null && var2 != Blocks.field_10124 && this.method_3390(var2, var1);
   }

   // $VF: renamed from: a (net.minecraft.block.Block, net.minecraft.util.math.BlockPos) boolean
   private boolean method_3390(Block var1, BlockPos var2) {
      if (var1 == null || var2 == null || g()) {
         return false;
      } else if (!Dev.ZWare.Client.pkg1.Class13.method_415(var2, true)) {
         return false;
      } else {
         double var3 = this.method_3391();
         return c.field_1724.method_33571().method_1025(Vec3d.method_24953(var2)) > var3 * var3
            ? false
            : Dev.ZWare.Client.Class1.field_301 != null && Dev.ZWare.Client.Class1.field_301.method_926(var1.method_8389(), var2);
      }
   }

   // $VF: renamed from: a () double
   private double method_3391() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, java.awt.Color) void
   private void method_3392(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, Color var3) {
      if (this.field_2694.method_671().method_1188()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var2, var3);
      }

      if (this.field_2694.method_671().method_1187()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var2, var3, 1.0);
      }
   }

   public static enum Inner1 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1187() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1188() {
         return this == Sides || this == Both;
      }
   }

   public static enum Inner2 {
      ClosestAngle,
      ClosestDistance;
   }
}
