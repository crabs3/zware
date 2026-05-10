package Dev.ZWare.Client.pkg1;

import java.util.Iterator;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult.Success;
import net.minecraft.util.ActionResult.SwingSource;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;

public class Class13 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) boolean
   public static boolean method_414(BlockPos blockPos, BlockState state) {
      return !a.field_1724.method_68878() && state.method_26214(a.field_1687, blockPos) < 0.0F
         ? false
         : !state.method_26218(a.field_1687, blockPos).method_1110();
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, boolean) boolean
   public static boolean method_415(BlockPos pos, boolean entityCheck) {
      if (!a.field_1687.method_8320(pos).method_45474()) {
         return false;
      } else {
         Iterator var2 = a.field_1687
            .method_8390(
               Entity.class,
               new Box(pos),
               var0 -> !(var0 instanceof ExperienceBottleEntity) && !(var0 instanceof ItemEntity) && !(var0 instanceof ExperienceOrbEntity)
            )
            .iterator();
         if (var2.hasNext()) {
            Entity var3 = (Entity)var2.next();
            return var3 instanceof PlayerEntity ? false : !entityCheck;
         } else {
            return true;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   public static boolean method_416(BlockPos pos) {
      if (!method_414(pos, a.field_1687.method_8320(pos))) {
         return false;
      } else {
         BlockPos var1 = pos instanceof Mutable ? new BlockPos(pos) : pos;
         a.method_1562().method_52787(new PlayerActionC2SPacket(Action.field_12968, var1, Direction.field_11036));
         a.field_1724.method_6104(Hand.field_5808);
         a.method_1562().method_52787(new PlayerActionC2SPacket(Action.field_12973, var1, Direction.field_11036));
         a.method_1562().method_52787(new HandSwingC2SPacket(Hand.field_5808));
         return true;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   public static void method_417(BlockPos pos) {
      method_418(pos, Hand.field_5808);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.Hand) void
   public static void method_418(BlockPos pos, Hand hand) {
      if (a.field_1687 != null && a.field_1724 != null && a.field_1761 != null) {
         Direction var2 = a.field_1765 != null ? ((BlockHitResult)a.field_1765).method_17780() : Direction.field_11033;
         if (a.field_1761.method_2896(a.field_1724, hand, new BlockHitResult(Vec3d.method_24953(pos), var2, pos, false)) instanceof Success var4
            && var4.comp_2909() != SwingSource.field_52426) {
            a.field_1724.field_3944.method_52787(new HandSwingC2SPacket(hand));
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos, boolean) boolean
   public static boolean method_419(BlockPos pos, boolean airPlace) {
      return method_420(pos, airPlace, Hand.field_5808);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, boolean, net.minecraft.util.Hand) boolean
   public static boolean method_420(BlockPos pos, boolean airPlace, Hand hand) {
      if (a.field_1687 == null || a.field_1724 == null || a.field_1761 == null) {
         return false;
      } else if (!method_415(pos, false)) {
         return false;
      } else {
         Direction var3 = method_421(pos);
         if (var3 == null) {
            if (!airPlace) {
               return false;
            }

            var3 = a.field_1765 != null ? ((BlockHitResult)a.field_1765).method_17780() : Direction.field_11033;
         }

         BlockPos var4 = airPlace ? pos : pos.method_10093(var3);
         if (a.field_1761
               .method_2896(
                  a.field_1724,
                  hand,
                  new BlockHitResult(
                     airPlace ? Vec3d.method_24953(pos) : Vec3d.method_24953(pos).method_43206(var3.method_10153(), 0.5),
                     airPlace ? var3 : var3.method_10153(),
                     var4,
                     false
                  )
               ) instanceof Success var6
            && var6.comp_2909() != SwingSource.field_52426) {
            a.field_1724.field_3944.method_52787(new HandSwingC2SPacket(hand));
         }

         return true;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.Direction
   public static Direction method_421(BlockPos pos) {
      for (Direction var4 : Direction.values()) {
         if (!a.field_1687.method_8320(pos.method_10081(var4.method_62675())).method_45474()) {
            return var4;
         }
      }

      return null;
   }

   // $VF: renamed from: a (int, net.minecraft.util.math.BlockPos) double
   public static double method_422(int slot, BlockPos pos) {
      return method_423(slot, a.field_1687.method_8320(pos));
   }

   // $VF: renamed from: a (int, net.minecraft.block.BlockState) double
   public static double method_423(int slot, BlockState block) {
      double var2 = ((ItemStack)a.field_1724.method_31548().method_67533().get(slot)).method_7924(block);
      if (var2 > 1.0) {
         ItemStack var4 = a.field_1724.method_31548().method_5438(slot);
         int var5 = Class19.method_408(Enchantments.field_9131, var4);
         if (var5 > 0 && !var4.method_7960()) {
            var2 += var5 * var5 + 1;
         }
      }

      if (StatusEffectUtil.method_5576(a.field_1724)) {
         var2 *= 1.0F + (StatusEffectUtil.method_5575(a.field_1724) + 1) * 0.2F;
      }

      if (a.field_1724.method_6059(StatusEffects.field_5901)) {
         float var7 = switch (a.field_1724.method_6112(StatusEffects.field_5901).method_5578()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         var2 *= var7;
      }

      if (a.field_1724.method_5777(FluidTags.field_15517) && Class19.method_413(Enchantments.field_9105, EquipmentSlot.field_6169)) {
         var2 /= 5.0;
      }

      if (!a.field_1724.method_24828()) {
         var2 /= 5.0;
      }

      float var8 = block.method_26214(null, null);
      if (var8 == -1.0F) {
         return 0.0;
      } else {
         var2 /= var8 / (block.method_29291() && !((ItemStack)a.field_1724.method_31548().method_67533().get(slot)).method_7951(block) ? 100 : 30);
         float var9 = (float)(Math.floor(1.0 / var2) + 1.0);
         return (long)(var9 / 20.0F * 1000.0F);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Direction) net.minecraft.util.math.Direction
   public static Direction method_424(Direction direction) {
      return switch (direction) {
         case field_11034 -> Direction.field_11035;
         case field_11035 -> Direction.field_11039;
         case field_11039 -> Direction.field_11043;
         case field_11043 -> Direction.field_11034;
         default -> throw new IllegalStateException("Unexpected value: " + direction);
      };
   }

   // $VF: renamed from: b (net.minecraft.util.math.Direction) net.minecraft.util.math.Direction
   public static Direction method_425(Direction direction) {
      return switch (direction) {
         case field_11034 -> Direction.field_11043;
         case field_11035 -> Direction.field_11034;
         case field_11039 -> Direction.field_11035;
         case field_11043 -> Direction.field_11039;
         default -> throw new IllegalStateException("Unexpected value: " + direction);
      };
   }
}
