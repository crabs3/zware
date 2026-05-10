package Dev.ZWare.Client.mixin;

import net.minecraft.client.input.Input;
import net.minecraft.util.math.Vec2f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Input.class})
public interface Class18 {
   @Accessor("movementVector")
   void zware$setMovementVector(Vec2f var1);
}
