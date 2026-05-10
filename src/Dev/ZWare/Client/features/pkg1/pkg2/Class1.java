package Dev.ZWare.Client.features.pkg1.pkg2;

import Dev.ZWare.Client.features.pkg3.Class8;
import Dev.ZWare.Client.pkg1.Class9;
import Dev.ZWare.Client.pkg2.pkg1.Class7;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;

public class Class1 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Integer> field_2060 = this.a("Threshold", 16, 1, 63);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Integer> field_2061 = this.a("Delay", 2, 0, 20);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_2062 = this.a("Selected", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_2063 = this.a("Pause Use", true);
   // $VF: renamed from: s int
   private int field_2064;

   public Class1() {
      super("Hotbar Refill", "replenishes low items yo", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2064 = 0;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2690(Class7.Inner2 var1) {
      if (!g() && c.field_1755 == null && c.field_1761 != null) {
         if (!this.field_2063.method_671() || !c.field_1724.method_6115()) {
            if (c.field_1724.field_7512.method_34255().method_7960()) {
               if (this.field_2064 > 0) {
                  this.field_2064--;
               } else {
                  if (this.method_2691()) {
                     this.field_2064 = this.field_2061.method_671();
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_2691() {
      int var1 = c.field_1724.method_31548().method_67532();

      for (int var2 = 0; var2 <= 8; var2++) {
         if (this.field_2062.method_671() || var2 != var1) {
            ItemStack var3 = c.field_1724.method_31548().method_5438(var2);
            if (this.method_2692(var3)) {
               int var4 = this.method_2693(var3);
               if (var4 != -1) {
                  this.method_2694(var4);
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2692(ItemStack var1) {
      return var1 != null
         && !var1.method_7960()
         && var1.method_7914() > 1
         && var1.method_7947() <= this.field_2060.method_671()
         && var1.method_7947() < var1.method_7914();
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) int
   private int method_2693(ItemStack var1) {
      for (int var2 = 9; var2 <= 35; var2++) {
         ItemStack var3 = c.field_1724.method_31548().method_5438(var2);
         if (!var3.method_7960() && ItemStack.method_31577(var3, var1)) {
            return var2;
         }
      }

      return -1;
   }

   // $VF: renamed from: b (int) void
   private void method_2694(int var1) {
      Class9.method_153(var1, 0, SlotActionType.field_7794);
   }
}
