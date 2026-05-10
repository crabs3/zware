package Dev.ZWare.Client.mixin;

import java.util.ArrayList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(
   targets = {"baritone.cache.CachedWorld"},
   remap = false
)
public abstract class Class29 {
   @Inject(
      method = {"queueForPacking"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private void oyvey$skipQueueForPacking(WorldChunk var1, CallbackInfo var2) {
      if (Dev.ZWare.Client.pkg1.Class4.method_227()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"tryLoadFromDisk"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private void oyvey$skipTryLoadFromDisk(int var1, int var2, CallbackInfo var3) {
      if (Dev.ZWare.Client.pkg1.Class4.method_227()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"reloadAllFromDisk"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private void oyvey$skipReloadAllFromDisk(CallbackInfo var1) {
      if (Dev.ZWare.Client.pkg1.Class4.method_227()) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"getLocationsOf"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private void oyvey$skipCacheLookup(String var1, int var2, int var3, int var4, int var5, CallbackInfoReturnable<ArrayList<BlockPos>> var6) {
      if (Dev.ZWare.Client.pkg1.Class4.method_227()) {
         var6.setReturnValue(new ArrayList());
      }
   }

   @Inject(
      method = {"save"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private void oyvey$skipSave(CallbackInfo var1) {
      if (Dev.ZWare.Client.pkg1.Class4.method_227()) {
         var1.cancel();
      }
   }
}
