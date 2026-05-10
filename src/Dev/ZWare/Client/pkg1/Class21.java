package Dev.ZWare.Client.pkg1;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.DamageUtil;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public final class Class21 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c float
   public static final float field_19 = 5.0F;
   // $VF: renamed from: d float
   private static final float field_20 = 10.0F;

   private Class21() {
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.entity.LivingEntity) double
   public static double method_58(BlockPos pos, LivingEntity entity) {
      return a.field_1687 != null && entity != null && pos != null ? method_59(pos.method_46558(), entity) : 0.0;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.entity.LivingEntity) double
   public static double method_59(Vec3d explosionPos, LivingEntity entity) {
      if (a.field_1687 != null && entity != null && explosionPos != null) {
         if (a.field_1687.method_8407() == Difficulty.field_5801 && entity instanceof PlayerEntity) {
            return 0.0;
         } else {
            double var2 = Math.sqrt(Class7.method_121(explosionPos, entity.method_5829()));
            double var4 = var2 / 10.0;
            if (var4 > 1.0) {
               return 0.0;
            } else {
               double var6 = method_63(explosionPos, entity);
               double var8 = (1.0 - var4) * var6;
               if (var8 <= 0.0) {
                  return 0.0;
               } else {
                  float var10 = (float)((var8 * var8 + var8) / 2.0 * 7.0 * 10.0 + 1.0);
                  var10 = method_60(var10, entity);
                  DamageSource var11 = a.field_1687.method_48963().method_48808(explosionPos);
                  var10 = DamageUtil.method_5496(entity, var10, var11, entity.method_6096(), (float)entity.method_45325(EntityAttributes.field_23725));
                  var10 = method_61(var10, entity);
                  var10 = method_62(var10, entity);
                  var10 -= entity.method_6067();
                  return Math.max(0.0, (double)var10);
               }
            }
         }
      } else {
         return 0.0;
      }
   }

   // $VF: renamed from: a (float, net.minecraft.entity.LivingEntity) float
   private static float method_60(float var0, LivingEntity var1) {
      if (var1 instanceof PlayerEntity && a.field_1687 != null) {
         return switch (a.field_1687.method_8407()) {
            case field_5801 -> 0.0F;
            case field_5805 -> Math.min(var0 * 0.5F + 1.0F, var0);
            case field_5807 -> var0 * 1.5F;
            default -> var0;
         };
      } else {
         return var0;
      }
   }

   // $VF: renamed from: b (float, net.minecraft.entity.LivingEntity) float
   private static float method_61(float var0, LivingEntity var1) {
      if (!var1.method_6059(StatusEffects.field_5907)) {
         return var0;
      } else {
         int var2 = var1.method_6112(StatusEffects.field_5907).method_5578() + 1;
         int var3 = 25 - var2 * 5;
         return var0 * Math.max(0.0F, var3 / 25.0F);
      }
   }

   // $VF: renamed from: c (float, net.minecraft.entity.LivingEntity) float
   private static float method_62(float var0, LivingEntity var1) {
      int var2 = 0;
      int var3 = 0;

      for (EquipmentSlot var7 : EquipmentSlot.values()) {
         var2 += Class19.method_409(Enchantments.field_9111, var7, var1);
         var3 += Class19.method_409(Enchantments.field_9107, var7, var1);
      }

      int var8 = Math.min(20, var2 + var3 * 2);
      return var0 * (1.0F - var8 / 25.0F);
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d, net.minecraft.entity.LivingEntity) double
   private static double method_63(Vec3d var0, LivingEntity var1) {
      Box var2 = var1.method_5829();
      double var3 = 1.0 / ((var2.field_1320 - var2.field_1323) * 2.0 + 1.0);
      double var5 = 1.0 / ((var2.field_1325 - var2.field_1322) * 2.0 + 1.0);
      double var7 = 1.0 / ((var2.field_1324 - var2.field_1321) * 2.0 + 1.0);
      if (!(var3 <= 0.0) && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         int var9 = 0;
         int var10 = 0;

         for (double var11 = 0.0; var11 <= 1.0; var11 += var3) {
            double var13 = MathHelper.method_16436(var11, var2.field_1323, var2.field_1320);

            for (double var15 = 0.0; var15 <= 1.0; var15 += var5) {
               double var17 = MathHelper.method_16436(var15, var2.field_1322, var2.field_1325);

               for (double var19 = 0.0; var19 <= 1.0; var19 += var7) {
                  double var21 = MathHelper.method_16436(var19, var2.field_1321, var2.field_1324);
                  Vec3d var23 = new Vec3d(var13, var17, var21);
                  BlockHitResult var24 = a.field_1687.method_17742(new RaycastContext(var23, var0, ShapeType.field_17558, FluidHandling.field_1348, var1));
                  if (var24.method_17783() == Type.field_1333) {
                     var10++;
                  }

                  var9++;
               }
            }
         }

         return var9 <= 0 ? 0.0 : (double)var10 / var9;
      } else {
         return 0.0;
      }
   }
}
