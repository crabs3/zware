package Dev.ZWare.Client.mixin;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil.Key;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({KeyBinding.class})
public interface Class34 {
   @Accessor("boundKey")
   Key zware$getBoundKey();
}
