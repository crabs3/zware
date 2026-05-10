package Dev.ZWare.Client.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameRenderer.class})
public abstract class Class14 {
   @Shadow
   @Final
   private MinecraftClient field_4015;
   @Shadow
   @Final
   private BufferBuilderStorage field_20948;
   @Unique
   private boolean oyvey$capturingChams;

   @Shadow
   protected abstract void method_3186(MatrixStack var1, float var2);

   @Redirect(
      method = {"renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/GameRenderer;bobView(Lnet/minecraft/client/util/math/MatrixStack;F)V"
      )
   )
   private void skipHandBob(GameRenderer var1, MatrixStack var2, float var3) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class8 var4 = Dev.ZWare.Client.features.pkg1.pkg5.Class8.method_2548();
      if (var4 == null || !var4.method_2551()) {
         this.method_3186(var2, var3);
      }
   }

   @Redirect(
      method = {"renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"
      )
   )
   private void renderChamsHandOverlay(HeldItemRenderer var1, float var2, MatrixStack var3, Immediate var4, ClientPlayerEntity var5, int var6) {
      MatrixStack var7 = this.oyvey$copyPositionMatrix(var3);
      var1.method_22976(var2, var3, var4, var5, var6);
      var4.method_22993();
      if (Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_790()) {
         this.oyvey$capturingChams = true;

         try {
            var1.method_22976(var2, var7, var4, var5, var6);
            var4.method_22993();
            Dev.ZWare.Client.Class1.field_306.method_799(var2);
         } finally {
            this.oyvey$capturingChams = false;
         }
      }
   }

   @Inject(
      method = {"renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V"},
      at = {@At("RETURN")}
   )
   private void resetChamsCapture(Camera var1, float var2, Matrix4f var3, CallbackInfo var4) {
      this.oyvey$capturingChams = false;
   }

   @Inject(
      method = {"showFloatingItem"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideTotemAnimation(ItemStack var1, CallbackInfo var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class4 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class4.method_2780();
      if (var3 != null && var3.method_2796() && var1 != null && var1.method_31574(Items.field_8288)) {
         var2.cancel();
      }
   }

   @Unique
   private MatrixStack oyvey$copyPositionMatrix(MatrixStack var1) {
      MatrixStack var2 = new MatrixStack();
      var2.method_34426();
      var2.method_34425(var1.method_23760().method_23761());
      return var2;
   }
}
