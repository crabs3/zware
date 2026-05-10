package Dev.ZWare.Client.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({BlockItem.class})
public interface Class33 {
   @Invoker("getPlacementContext")
   ItemPlacementContext zware$getPlacementContext(ItemPlacementContext var1);

   @Invoker("getPlacementState")
   BlockState zware$getPlacementState(ItemPlacementContext var1);
}
