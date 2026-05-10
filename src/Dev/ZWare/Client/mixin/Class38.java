package Dev.ZWare.Client.mixin;

import net.minecraft.client.model.ModelPart.Cuboid;
import net.minecraft.client.model.ModelPart.Quad;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({Cuboid.class})
public interface Class38 {
   @Accessor("sides")
   Quad[] oyvey$getSides();
}
