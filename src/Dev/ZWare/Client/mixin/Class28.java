package Dev.ZWare.Client.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientPlayerInteractionManager.class})
public class Class28 {
   @Inject(
      method = {"attackBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAttackBlock(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      Dev.ZWare.Client.pkg2.pkg1.Class15 var4 = new Dev.ZWare.Client.pkg2.pkg1.Class15(var1, var2);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var4);
      if (var4.a()) {
         var3.setReturnValue(false);
      }
   }

   @Inject(
      method = {"updateBlockBreakingProgress"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onUpdateBlockBreakingProgress(BlockPos var1, Direction var2, CallbackInfoReturnable<Boolean> var3) {
      Dev.ZWare.Client.pkg2.pkg1.Class15 var4 = new Dev.ZWare.Client.pkg2.pkg1.Class15(var1, var2);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var4);
      if (var4.a()) {
         var3.setReturnValue(false);
      }
   }

   @Inject(
      method = {"breakBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onBreakBlock(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      if (this.isPacketMineEnabled()) {
         var2.setReturnValue(false);
      }
   }

   @Inject(
      method = {"clickSlot"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onClickSlot(int var1, int var2, int var3, SlotActionType var4, PlayerEntity var5, CallbackInfo var6) {
      if (Dev.ZWare.Client.Class1.field_302 != null) {
         if (!Dev.ZWare.Client.Class1.field_302.method_254(var3, var4)) {
            var6.cancel();
         }
      }
   }

   private boolean isPacketMineEnabled() {
      if (Dev.ZWare.Client.Class1.field_316 == null) {
         return false;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg3.Class1 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg3.Class1.class);
         return var1 != null && var1.d();
      }
   }
}
