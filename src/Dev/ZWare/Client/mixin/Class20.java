package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.DiffuseLighting;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemRenderer.class})
public abstract class Class20 {
   @Shadow
   private ItemStack field_4047;
   @Shadow
   private ItemStack field_4048;
   @Shadow
   private float field_4043;
   @Shadow
   private float field_4053;
   @Shadow
   private float field_4052;

   @Unique
   private static void oyvey$applyFlatFirstPersonLighting() {
      DiffuseLighting.method_24210();
   }

   @Unique
   private static void oyvey$restoreFirstPersonLighting() {
      DiffuseLighting.method_1452();
   }

   @Shadow
   protected abstract void method_3224(MatrixStack var1, Arm var2, float var3);

   @Shadow
   protected abstract void method_3217(MatrixStack var1, Arm var2, float var3);

   @Redirect(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getHandSwingProgress(F)F"
      )
   )
   private float modifySwingProgress(ClientPlayerEntity var1, float var2) {
      return var1.method_6055(var2);
   }

   @Redirect(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;preferredHand:Lnet/minecraft/util/Hand;"
      )
   )
   private Hand redirectVisualSwingHand(ClientPlayerEntity var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var2 != null && var2.d()) {
         return var2.method_2559() == Dev.ZWare.Client.features.pkg1.pkg5.Class8.Inner1.Offhand ? Hand.field_5810 : Hand.field_5808;
      } else {
         return var1.field_6266;
      }
   }

   @ModifyConstant(
      method = {"updateHeldItems"},
      constant = {@Constant(
         floatValue = 0.4F
      )}
   )
   private float scaleEquipAnimationStep(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.d() ? var1 * Math.max(0.1F, var2.method_2558()) : var1;
   }

   @ModifyConstant(
      method = {"updateHeldItems"},
      constant = {@Constant(
         floatValue = -0.4F
      )}
   )
   private float scaleEquipAnimationNegativeStep(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.d() ? var1 * Math.max(0.1F, var2.method_2558()) : var1;
   }

   @Inject(
      method = {"updateHeldItems"},
      at = {@At("TAIL")}
   )
   private void lockSwapAnimations(CallbackInfo var1) {
      MinecraftClient var2 = MinecraftClient.method_1551();
      if (var2.field_1724 != null) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class8 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
         if (var3 != null) {
            if (var3.method_2556() && this.field_4043 < 1.0F) {
               this.field_4043 = 1.0F;
               this.field_4047 = var2.field_1724.method_6047();
            }

            if (var3.method_2557() && this.field_4052 < 1.0F) {
               this.field_4052 = 1.0F;
               this.field_4048 = var2.field_1724.method_6079();
            }
         }

         Dev.ZWare.Client.features.pkg1.pkg3.Class1 var4 = oyvey$getDoubleMine();
         if (var4 != null && var4.method_3326()) {
            this.field_4053 = 1.0F;
            this.field_4043 = 1.0F;
            this.field_4047 = var4.method_3328();
         }
      }
   }

   @Unique
   private static Dev.ZWare.Client.features.pkg1.pkg3.Class1 oyvey$getDoubleMine() {
      return Dev.ZWare.Client.Class1.field_316 == null ? null : Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg3.Class1.class);
   }

   @ModifyVariable(
      method = {"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private ItemStack replaceFirstPersonSword(
      ItemStack var1, LivingEntity var2, ItemStack var3, ItemDisplayContext var4, MatrixStack var5, VertexConsumerProvider var6, int var7
   ) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class1 var8 = Dev.ZWare.Client.features.pkg1.pkg5.Class1.method_2430();
      return var8 != null && var4.method_29998() && this.oyvey$isMainHandFirstPersonContext(var2, var4) && var8.method_2431(var1)
         ? Items.field_8301.method_7854()
         : var1;
   }

   @Unique
   private boolean oyvey$isMainHandFirstPersonContext(LivingEntity var1, ItemDisplayContext var2) {
      if (!(var1 instanceof PlayerEntity var3)) {
         return false;
      } else {
         Arm var4 = var3.method_6068();
         return var4 == Arm.field_6183 && var2 == ItemDisplayContext.field_4322 || var4 == Arm.field_6182 && var2 == ItemDisplayContext.field_4321;
      }
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void applyViewModelTransform(
      LivingEntity var1, ItemStack var2, ItemDisplayContext var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7
   ) {
      if (var3.method_29998() && Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_801()) {
         var7.cancel();
      } else {
         Dev.ZWare.Client.features.pkg1.pkg5.Class8 var8 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
         if (var3.method_29998() && var8 != null && var8.method_2550()) {
            oyvey$applyFlatFirstPersonLighting();
         }

         if (var8 != null && var8.d() && var3.method_29998()) {
            float var9 = var8.field_1921.method_671();
            if (var3 == ItemDisplayContext.field_4321) {
               var9 = -var9;
            }

            var4.method_46416(var9, var8.field_1922.method_671(), var8.field_1923.method_671());
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(var8.field_1924.method_671()));
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var8.field_1925.method_671()));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var8.field_1926.method_671()));
            var4.method_22905(var8.field_1927.method_671(), var8.field_1928.method_671(), var8.field_1929.method_671());
         }
      }
   }

   @Inject(
      method = {"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = {@At("RETURN")}
   )
   private void restoreFirstPersonItemLighting(
      LivingEntity var1, ItemStack var2, ItemDisplayContext var3, MatrixStack var4, VertexConsumerProvider var5, int var6, CallbackInfo var7
   ) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var8 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var3.method_29998() && var8 != null && var8.method_2550()) {
         oyvey$restoreFirstPersonLighting();
      }
   }

   @ModifyVariable(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int modifyFirstPersonSceneLight(int var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.method_2550() ? 15728880 : var1;
   }

   @ModifyVariable(
      method = {"renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int modifyFirstPersonLight(int var1, LivingEntity var2, ItemStack var3, ItemDisplayContext var4) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var5 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var5 != null && var5.method_2550() && var4.method_29998() ? 15728880 : var1;
   }

   @ModifyVariable(
      method = {"renderArm"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int modifyFirstPersonArmLight(int var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.method_2550() ? 15728880 : var1;
   }

   @ModifyVariable(
      method = {"renderArmHoldingItem"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int modifyFirstPersonArmHoldingItemLight(int var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.method_2550() ? 15728880 : var1;
   }

   @Inject(
      method = {"renderArm"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideChamsArm(MatrixStack var1, VertexConsumerProvider var2, int var3, Arm var4, CallbackInfo var5) {
      if (Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_802()) {
         var5.cancel();
      } else {
         Dev.ZWare.Client.features.pkg1.pkg5.Class8 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
         if (var6 != null && var6.method_2550()) {
            oyvey$applyFlatFirstPersonLighting();
         }
      }
   }

   @Inject(
      method = {"renderArm"},
      at = {@At("RETURN")}
   )
   private void restoreArmLighting(MatrixStack var1, VertexConsumerProvider var2, int var3, Arm var4, CallbackInfo var5) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var6 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var6 != null && var6.method_2550()) {
         oyvey$restoreFirstPersonLighting();
      }
   }

   @Inject(
      method = {"renderArmHoldingItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideChamsArmHoldingItem(MatrixStack var1, VertexConsumerProvider var2, int var3, float var4, float var5, Arm var6, CallbackInfo var7) {
      if (Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_802()) {
         var7.cancel();
      } else {
         Dev.ZWare.Client.features.pkg1.pkg5.Class8 var8 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
         if (var8 != null && var8.method_2550()) {
            oyvey$applyFlatFirstPersonLighting();
         }
      }
   }

   @Inject(
      method = {"renderArmHoldingItem"},
      at = {@At("RETURN")}
   )
   private void restoreArmHoldingItemLighting(MatrixStack var1, VertexConsumerProvider var2, int var3, float var4, float var5, Arm var6, CallbackInfo var7) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var8 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var8 != null && var8.method_2550()) {
         oyvey$restoreFirstPersonLighting();
      }
   }

   @ModifyArg(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/RotationAxis;rotationDegrees(F)Lorg/joml/Quaternionf;",
         ordinal = 0
      ),
      index = 0
   )
   private float anchorPitchSway(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.method_2551() ? 0.0F : var1;
   }

   @ModifyArg(
      method = {"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/RotationAxis;rotationDegrees(F)Lorg/joml/Quaternionf;",
         ordinal = 1
      ),
      index = 0
   )
   private float anchorYawSway(float var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      return var2 != null && var2.method_2551() ? 0.0F : var1;
   }

   @Inject(
      method = {"swingArm"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void anchorSwingArm(float var1, float var2, MatrixStack var3, int var4, Arm var5, CallbackInfo var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var7 != null && (var7.method_2553() || var7.method_2554())) {
         if (var7.method_2554()) {
            this.applyCustomSwingAnimation(var7, var1, var2, var3, var4, var5);
            var6.cancel();
         } else {
            this.applyOldSwingAnimation(var1, var2, var3, var4, var5);
            var6.cancel();
         }
      }
   }

   private void applyOldSwingAnimation(float var1, float var2, MatrixStack var3, int var4, Arm var5) {
      float var6 = MathHelper.method_15374(MathHelper.method_15355(var1) * (float) Math.PI);
      float var7 = 0.2F * MathHelper.method_15374(MathHelper.method_15355(var1) * (float) (Math.PI * 2));
      float var8 = -0.2F * MathHelper.method_15374(var1 * (float) Math.PI);
      var3.method_46416(var4 * (-0.4F * var6), var7, var8);
      this.method_3224(var3, var5, 0.0F);
      this.method_3217(var3, var5, var1);
   }

   @Inject(
      method = {"applyEatOrDrinkTransformation"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void anchorEatingAnimation(MatrixStack var1, float var2, Arm var3, ItemStack var4, PlayerEntity var5, CallbackInfo var6) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var7 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var7 != null && var7.method_2552()) {
         if (var5 != null && var3 == var5.method_6068()) {
            float var8 = var5.method_6014() - var2 + 1.0F;
            float var9 = var8 / var4.method_7935(var5);
            if (var9 < 0.8F) {
               float var10 = MathHelper.method_15379(MathHelper.method_15362(var8 / 4.0F * (float) Math.PI) * 0.008F);
               var1.method_46416(0.0F, var10, 0.0F);
            }

            float var12 = 1.0F - (float)Math.pow(var9, 18.0);
            int var11 = var3 == Arm.field_6183 ? 1 : -1;
            var1.method_46416(var11 * var12 * 0.18F, var12 * -0.12F, var12 * -0.05F);
            var1.method_22907(RotationAxis.field_40716.rotationDegrees(var11 * var12 * 18.0F));
            var1.method_22907(RotationAxis.field_40718.rotationDegrees(var11 * var12 * 10.0F));
            var1.method_22907(RotationAxis.field_40714.rotationDegrees(var12 * 6.0F));
            var6.cancel();
         }
      }
   }

   private void applyCustomSwingAnimation(Dev.ZWare.Client.features.pkg1.pkg5.Class8 var1, float var2, float var3, MatrixStack var4, int var5, Arm var6) {
      float var7 = MathHelper.method_15374(MathHelper.method_15355(var2) * (float) Math.PI);
      float var8 = MathHelper.method_15374(var2 * var2 * (float) Math.PI);
      switch (var1.method_2555()) {
         case Default:
            this.method_3224(var4, var6, var3);
            this.method_3217(var4, var6, var2);
            break;
         case field_644:
            this.method_3224(var4, var6, -0.4F * var7);
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * (45.0F + var8 * -20.0F)));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * var7 * -20.0F));
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * -45.0F));
            break;
         case field_645:
            this.method_3224(var4, var6, 0.2F * MathHelper.method_15374(MathHelper.method_15355(var2) * (float) (Math.PI * 2)));
            break;
         case Three:
            this.method_3224(var4, var6, -0.4F * var7);
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * 45.0F));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * var7 * -70.0F));
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(-70.0F));
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * -45.0F));
            break;
         case Four:
            this.method_3224(var4, var6, 0.0F);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(var2 > 0.0F ? -MathHelper.method_15374(var2 * 13.0F) * 37.0F : 0.0F));
            break;
         case Five:
            this.method_3224(var4, var6, 0.0F);
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * var7 * -20.0F));
            break;
         case field_646:
            this.method_3224(var4, var6, var3);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(var2 * (var1.field_1930 ? 360.0F : -360.0F)));
            break;
         case Seven:
            this.method_3224(var4, var6, var3);
            float var12 = -MathHelper.method_15374(var2 * 3.0F) / 2.0F + 1.0F;
            var4.method_22905(var12, var12, var12);
            break;
         case Eight:
            this.method_3224(var4, var6, var3);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(var2 * -360.0F));
            break;
         case Nine:
            this.method_3224(var4, var6, 0.0F);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(50.0F));
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * (-30.0F * (1.0F - var7) - 30.0F)));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * 110.0F));
            break;
         case field_647:
            this.method_3224(var4, var6, 0.0F);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(50.0F));
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * (-60.0F * var7 - 50.0F)));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * 110.0F));
            break;
         case Eleven:
            this.method_3224(var4, var6, 0.0F);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(50.0F));
            var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * -60.0F));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * (110.0F + 20.0F * var7)));
            break;
         case Twelve:
            this.method_3224(var4, var6, 0.0F);
            var4.method_46416(0.0F, 0.0F, -var7 / 4.0F);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(-120.0F));
            break;
         case Thirteen:
            this.method_3224(var4, var6, 0.0F);
            var4.method_22907(RotationAxis.field_40714.rotationDegrees(-MathHelper.method_15374(var2 * 3.0F) * 60.0F));
            var4.method_22907(RotationAxis.field_40718.rotationDegrees(var5 * (-60.0F * var7)));
            break;
         case Fourteen:
            if (var2 > 0.0F) {
               var4.method_46416(var5 * 0.56F, var3 * -0.2F - 0.5F, -0.7F);
               var4.method_22907(RotationAxis.field_40716.rotationDegrees(var5 * 45.0F));
               var4.method_22907(RotationAxis.field_40714.rotationDegrees(var7 * -85.0F));
               var4.method_22907(RotationAxis.field_40714.rotationDegrees(-85.0F));
            } else {
               float var9 = -0.4F * var7;
               float var10 = 0.2F * MathHelper.method_15374(MathHelper.method_15355(var2) * (float) (Math.PI * 2));
               float var11 = -0.2F * MathHelper.method_15374(var2 * (float) Math.PI);
               var4.method_46416(var9, var10, var11);
               this.method_3224(var4, var6, var3);
               this.method_3217(var4, var6, var2);
            }
      }
   }
}
