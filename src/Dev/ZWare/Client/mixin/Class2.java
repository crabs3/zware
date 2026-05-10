package Dev.ZWare.Client.mixin;

import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InputUtil.class})
public abstract class Class2 {
   @Inject(
      method = {"setCursorParameters"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void oyvey$avoidWaylandCursorWarp(long var0, int var2, double var3, double var5, CallbackInfo var7) {
      if (isWaylandSession()) {
         GLFW.glfwSetInputMode(var0, 208897, var2);
         var7.cancel();
      }
   }

   private static boolean isWaylandSession() {
      String var0 = System.getenv("WAYLAND_DISPLAY");
      if (var0 != null && !var0.isBlank()) {
         return true;
      } else {
         String var1 = System.getenv("XDG_SESSION_TYPE");
         return var1 != null && var1.equalsIgnoreCase("wayland");
      }
   }
}
