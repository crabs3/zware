package Dev.ZWare.Client.mixin;

import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({GameOptions.class})
public abstract class Class11 {
   @ModifyArg(
      method = {"<init>"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/option/SimpleOption$ValidatingIntSliderCallbacks;<init>(II)V"
      ),
      index = 1,
      slice = @Slice(
         from = @At(
            value = "CONSTANT",
            args = {"stringValue=options.fov"}
         ),
         to = @At(
            value = "FIELD",
            target = "Lnet/minecraft/client/option/GameOptions;fov:Lnet/minecraft/client/option/SimpleOption;",
            opcode = 181
         )
      )
   )
   private int zware$expandFovSliderMax(int var1) {
      return 290;
   }
}
