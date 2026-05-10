package Dev.ZWare.Client.features.pkg1.pkg1;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class Class15 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg1.Class15
   private static Class15 field_2859;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_2860 = this.a("Block", Blocks.field_10540);

   public Class15() {
      super("Fast Place", "places shit fast", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, false, false, false);
      field_2859 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg1.Class15
   public static Class15 method_3573() {
      return field_2859;
   }

   // $VF: renamed from: a () boolean
   public boolean method_3574() {
      if (this.d() && !g()) {
         Block var1 = this.field_2860.method_671();
         return var1 != null && var1 != Blocks.field_10124
            ? this.method_3575(c.field_1724.method_6047(), var1) || this.method_3575(c.field_1724.method_6079(), var1)
            : false;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack, net.minecraft.block.Block) boolean
   private boolean method_3575(ItemStack var1, Block var2) {
      return var1 != null && !var1.method_7960() && var1.method_7909() instanceof BlockItem var3 && var3.method_7711() == var2;
   }
}
