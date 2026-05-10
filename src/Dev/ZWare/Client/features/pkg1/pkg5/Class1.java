package Dev.ZWare.Client.features.pkg1.pkg5;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class Class1 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg5.Class1
   private static Class1 field_1838;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1839 = this.a("Sword", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1840 = this.a("Totem", false);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1841 = this.a("Require", false);

   public Class1() {
      super("Fake Item", "makes selected shit into a crystal", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_1838 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class1
   public static Class1 method_2430() {
      return field_1838;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   public boolean method_2431(ItemStack stack) {
      if (!this.d() || c.field_1724 == null || stack == null || stack.method_7960()) {
         return false;
      } else {
         return !this.method_2434(stack) ? false : !this.field_1841.method_671() || this.method_2432();
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_2432() {
      return c.field_1724.method_6047().method_31574(Items.field_8301)
         || c.field_1724.method_6079().method_31574(Items.field_8301)
         || Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Items.field_8301), 0, 35) != -1;
   }

   // $VF: renamed from: b (net.minecraft.item.ItemStack) boolean
   private boolean method_2433(ItemStack var1) {
      if (var1.method_58694(DataComponentTypes.field_55878) == null) {
         return false;
      } else {
         Identifier var2 = Registries.field_41178.method_10221(var1.method_7909());
         return var2 != null && var2.method_12832().endsWith("_sword");
      }
   }

   // $VF: renamed from: c (net.minecraft.item.ItemStack) boolean
   private boolean method_2434(ItemStack var1) {
      return this.field_1839.method_671() && this.method_2433(var1) || this.field_1840.method_671() && var1.method_31574(Items.field_8288);
   }
}
