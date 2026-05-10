package Dev.ZWare.Client.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.DamageUtil;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class Class17 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c net.minecraft.client.MinecraftClient
   public static final MinecraftClient field_146 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0;
   // $VF: renamed from: d float
   private static final float field_147 = 6.0F;
   // $VF: renamed from: e float
   private static final float field_148 = 12.0F;

   private Class17() {
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Box, net.minecraft.util.math.Vec3d, java.util.Set) double
   public static double method_292(PlayerEntity player, Box boundingBox, Vec3d crystalPos, Set<BlockPos> ignorePos) {
      return method_293(player, boundingBox, crystalPos, ignorePos, null);
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Box, net.minecraft.util.math.Vec3d, java.util.Set, java.util.Map) double
   public static double method_293(PlayerEntity player, Box boundingBox, Vec3d crystalPos, Set<BlockPos> ignorePos, Map<BlockPos, BlockState> overrides) {
      if (field_146.field_1687 != null && player != null && boundingBox != null && crystalPos != null) {
         if (field_146.field_1687.method_8407() != Difficulty.field_5801 && !player.method_7325() && !player.method_68878()) {
            if (ignorePos != null && ignorePos.isEmpty()) {
               ignorePos = null;
            }

            if (overrides != null && overrides.isEmpty()) {
               overrides = null;
            }

            Vec3d var5 = new Vec3d(
               (boundingBox.field_1323 + boundingBox.field_1320) * 0.5, boundingBox.field_1322, (boundingBox.field_1321 + boundingBox.field_1324) * 0.5
            );
            double var6 = Math.sqrt(var5.method_1025(crystalPos));
            if (var6 > 12.0) {
               return 0.0;
            } else {
               double var8 = method_294(crystalPos, player, boundingBox, ignorePos, overrides);
               double var10 = (1.0 - var6 / 12.0) * var8;
               if (var10 <= 0.0) {
                  return 0.0;
               } else {
                  double var12 = (var10 * var10 + var10) * 0.5 * 7.0 * 12.0 + 1.0;
                  var12 = method_297(var12);
                  DamageSource var14 = field_146.field_1687.method_48963().method_48808(crystalPos);
                  var12 = DamageUtil.method_5496(player, (float)var12, var14, player.method_6096(), (float)player.method_45325(EntityAttributes.field_23725));
                  var12 = method_298(player, var12);
                  var12 = method_299(player, var12);
                  return Math.max(0.0, var12);
               }
            }
         } else {
            return 0.0;
         }
      } else {
         return 0.0;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Box, java.util.Set, java.util.Map) double
   private static double method_294(Vec3d var0, PlayerEntity var1, Box var2, Set<BlockPos> var3, Map<BlockPos, BlockState> var4) {
      return method_295(var0, var1, var2, var3, var4).method_1074();
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.entity.player.PlayerEntity, net.minecraft.util.math.Box, java.util.Set, java.util.Map) Dev.ZWare.Client.pkg1.Class17$Inner2
   public static Class17.Inner2 method_295(Vec3d source, PlayerEntity player, Box box, Set<BlockPos> ignorePos, Map<BlockPos, BlockState> overrides) {
      if (field_146.field_1687 != null && player != null && box != null && source != null) {
         if (ignorePos != null && ignorePos.isEmpty()) {
            ignorePos = null;
         }

         if (overrides != null && overrides.isEmpty()) {
            overrides = null;
         }

         double var5 = 1.0 / ((box.field_1320 - box.field_1323) * 2.0 + 1.0);
         double var7 = 1.0 / ((box.field_1325 - box.field_1322) * 2.0 + 1.0);
         double var9 = 1.0 / ((box.field_1324 - box.field_1321) * 2.0 + 1.0);
         double var11 = (1.0 - Math.floor(1.0 / var5) * var5) * 0.5;
         double var13 = (1.0 - Math.floor(1.0 / var9) * var9) * 0.5;
         if (!(var5 <= 0.0) && !(var7 <= 0.0) && !(var9 <= 0.0)) {
            int var15 = 0;
            int var16 = 0;
            ArrayList var17 = new ArrayList();

            for (double var18 = 0.0; var18 <= 1.0; var18 += var5) {
               for (double var20 = 0.0; var20 <= 1.0; var20 += var7) {
                  for (double var22 = 0.0; var22 <= 1.0; var22 += var9) {
                     Vec3d var24 = new Vec3d(
                        MathHelper.method_16436(var18, box.field_1323, box.field_1320) + var11,
                        MathHelper.method_16436(var20, box.field_1322, box.field_1325),
                        MathHelper.method_16436(var22, box.field_1321, box.field_1324) + var13
                     );
                     BlockHitResult var25 = method_296(
                        new RaycastContext(var24, source, ShapeType.field_17558, FluidHandling.field_1348, player), ignorePos, overrides
                     );
                     boolean var26 = var25.method_17783() == Type.field_1333;
                     if (var26) {
                        var15++;
                     }

                     var17.add(new Class17.Inner3(var24, source, var25.method_17784(), var26 ? null : var25.method_17777().method_10062(), var26));
                     var16++;
                  }
               }
            }

            return new Class17.Inner2(var17, var15, var16);
         } else {
            return Class17.Inner2.field_568;
         }
      } else {
         return Class17.Inner2.field_568;
      }
   }

   // $VF: renamed from: a (net.minecraft.world.RaycastContext, java.util.Set, java.util.Map) net.minecraft.util.hit.BlockHitResult
   private static BlockHitResult method_296(RaycastContext var0, Set<BlockPos> var1, Map<BlockPos, BlockState> var2) {
      return (BlockHitResult)BlockView.method_17744(
         var0.method_17750(),
         var0.method_17747(),
         var0,
         (var2x, var3) -> {
            BlockState var4;
            if (var1 != null && var1.contains(var3)) {
               var4 = Blocks.field_10124.method_9564();
            } else if (var2 != null && var2.containsKey(var3)) {
               var4 = (BlockState)var2.get(var3);
            } else {
               var4 = field_146.field_1687.method_8320(var3);
            }

            Vec3d var5 = var2x.method_17750();
            Vec3d var6 = var2x.method_17747();
            VoxelShape var7 = var2x.method_17748(var4, field_146.field_1687, var3);
            BlockHitResult var8 = field_146.field_1687.method_17745(var5, var6, var3, var7, var4);
            BlockHitResult var9 = VoxelShapes.method_1073().method_1092(var5, var6, var3);
            double var10 = var8 == null ? Double.MAX_VALUE : var5.method_1025(var8.method_17784());
            double var12 = var9 == null ? Double.MAX_VALUE : var5.method_1025(var9.method_17784());
            return var10 <= var12 ? var8 : var9;
         },
         var0x -> {
            Vec3d var1x = var0x.method_17750().method_1020(var0x.method_17747());
            return BlockHitResult.method_17778(
               var0x.method_17747(), Direction.method_10142(var1x.field_1352, var1x.field_1351, var1x.field_1350), BlockPos.method_49638(var0x.method_17747())
            );
         }
      );
   }

   // $VF: renamed from: a (double) double
   private static double method_297(double var0) {
      if (field_146.field_1687 == null) {
         return var0;
      } else {
         return switch (field_146.field_1687.method_8407()) {
            case field_5801 -> 0.0;
            case field_5805 -> Math.min(var0 * 0.5 + 1.0, var0);
            case field_5807 -> var0 * 1.5;
            default -> var0;
         };
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, double) double
   private static double method_298(PlayerEntity var0, double var1) {
      if (!var0.method_6059(StatusEffects.field_5907)) {
         return var1;
      } else {
         int var3 = var0.method_6112(StatusEffects.field_5907).method_5578() + 1;
         return Math.max(0.0, var1 * Math.max(0.0, 1.0 - var3 * 0.2));
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity, double) double
   private static double method_299(PlayerEntity var0, double var1) {
      int var3 = 0;
      int var4 = 0;

      for (EquipmentSlot var8 : EquipmentSlot.values()) {
         var3 += Class19.method_409(Enchantments.field_9111, var8, var0);
         var4 += Class19.method_409(Enchantments.field_9107, var8, var0);
      }

      int var9 = Math.min(20, var3 + var4 * 2);
      return Math.max(0.0, var1 * (1.0 - var9 / 25.0));
   }

   public static final class Inner2 {
      // $VF: renamed from: a Dev.ZWare.Client.pkg1.Class17$Inner2
      private static final Class17.Inner2 field_568 = new Class17.Inner2(List.of(), 0, 0);
      // $VF: renamed from: b java.util.List
      private final List<Class17.Inner3> field_569;
      // $VF: renamed from: c int
      private final int field_570;
      // $VF: renamed from: d int
      private final int field_571;

      private Inner2(List<Class17.Inner3> var1, int var2, int var3) {
         this.field_569 = Collections.unmodifiableList(var1);
         this.field_570 = var2;
         this.field_571 = var3;
      }

      // $VF: renamed from: a () java.util.List
      public List<Class17.Inner3> method_1070() {
         return this.field_569;
      }

      // $VF: renamed from: a () int
      public int method_1071() {
         return this.field_570;
      }

      // $VF: renamed from: b () int
      public int method_1072() {
         return Math.max(0, this.field_571 - this.field_570);
      }

      // $VF: renamed from: c () int
      public int method_1073() {
         return this.field_571;
      }

      // $VF: renamed from: a () double
      public double method_1074() {
         return this.field_571 == 0 ? 0.0 : (double)this.field_570 / this.field_571;
      }
   }

   public static final class Inner3 {
      // $VF: renamed from: a net.minecraft.util.math.Vec3d
      private final Vec3d field_334;
      // $VF: renamed from: b net.minecraft.util.math.Vec3d
      private final Vec3d field_335;
      // $VF: renamed from: c net.minecraft.util.math.Vec3d
      private final Vec3d field_336;
      // $VF: renamed from: d net.minecraft.util.math.BlockPos
      private final BlockPos field_337;
      // $VF: renamed from: e boolean
      private final boolean field_338;

      private Inner3(Vec3d var1, Vec3d var2, Vec3d var3, BlockPos var4, boolean var5) {
         this.field_334 = var1;
         this.field_335 = var2;
         this.field_336 = var3;
         this.field_337 = var4;
         this.field_338 = var5;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      public Vec3d method_630() {
         return this.field_334;
      }

      // $VF: renamed from: b () net.minecraft.util.math.Vec3d
      public Vec3d method_631() {
         return this.field_335;
      }

      // $VF: renamed from: c () net.minecraft.util.math.Vec3d
      public Vec3d method_632() {
         return this.field_336;
      }

      // $VF: renamed from: d () net.minecraft.util.math.Vec3d
      public Vec3d method_633() {
         return this.field_338 ? this.field_334 : this.field_336;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      public BlockPos method_634() {
         return this.field_337;
      }

      // $VF: renamed from: a () boolean
      public boolean method_635() {
         return this.field_338;
      }
   }
}
