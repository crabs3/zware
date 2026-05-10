package Dev.ZWare.Client.features.pkg1.pkg2;

import Dev.ZWare.Client.features.pkg3.Class8;
import Dev.ZWare.Client.pkg1.Class9;
import Dev.ZWare.Client.pkg2.pkg1.Class7;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.Set;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;

public class Class3 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class1
   private final Dev.ZWare.Client.features.pkg3.Class1 field_1500 = (Dev.ZWare.Client.features.pkg3.Class1)this.a(
      new Dev.ZWare.Client.features.pkg3.Class1("Items").a("Targets")
   );
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Integer> field_1501 = this.a("Delay", 2, 0, 20).method_683("General");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Integer> field_1502 = this.a("Drops Per Tick", 8, 1, 39).method_683("General");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1503 = this.a("Hotbar", true).method_683("General");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1504 = this.a("Closed Hotbar", false).method_683("General");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1505 = this.a("Held Slot", false).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1506 = this.a("Pause Use", true).method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1507 = this.a("Auto Disable", false).method_683("General");
   // $VF: renamed from: w int
   private int field_1508;

   public Class3() {
      super("Inventory Cleaner", "Throws selected item stacks out of your inventory.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1508 = 0;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      int var1 = this.method_2108();
      return var1 > 0 ? Integer.toString(var1) : null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2105(Class7.Inner2 var1) {
      if (!g() && c.field_1761 != null) {
         if (!((Set)this.field_1500.a()).isEmpty()) {
            boolean var2 = c.field_1755 instanceof InventoryScreen;
            if (c.field_1755 == null || var2) {
               if (!this.field_1506.method_671() || !c.field_1724.method_6115()) {
                  if (c.field_1724.field_7512.method_34255().method_7960()) {
                     if (this.field_1508 > 0) {
                        this.field_1508--;
                     } else {
                        int var3 = this.method_2106();
                        if (var3 > 0) {
                           boolean var4;
                           for (var4 = false; var3 > 0; var3--) {
                              int var5 = this.method_2107(var2);
                              if (var5 == -1 || !Class9.method_153(var5, 1, SlotActionType.field_7795)) {
                                 break;
                              }

                              var4 = true;
                           }

                           if (var4) {
                              this.field_1508 = this.field_1501.method_671();
                           } else {
                              if (this.method_2107(var2) == -1 && this.field_1507.method_671()) {
                                 this.k();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a () int
   private int method_2106() {
      int var1 = this.field_1502.method_671();
      if (Dev.ZWare.Client.Class1.field_302 != null) {
         var1 = Math.min(var1, Dev.ZWare.Client.Class1.field_302.method_251(Dev.ZWare.Client.pkg4.Class1.Inner1.ClickSlot));
      }

      return Math.max(0, var1);
   }

   // $VF: renamed from: a (boolean) int
   private int method_2107(boolean var1) {
      int var2 = c.field_1724.method_31548().method_67532();

      for (int var3 = 9; var3 <= 35; var3++) {
         if (this.method_2109(c.field_1724.method_31548().method_5438(var3))) {
            return var3;
         }
      }

      if (this.field_1503.method_671() && (var1 || this.field_1504.method_671())) {
         for (int var4 = 0; var4 <= 8; var4++) {
            if ((this.field_1505.method_671() || var4 != var2) && this.method_2109(c.field_1724.method_31548().method_5438(var4))) {
               return var4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   // $VF: renamed from: b () int
   private int method_2108() {
      if (c.field_1724 != null && !((Set)this.field_1500.a()).isEmpty()) {
         int var1 = 0;
         int var2 = c.field_1724.method_31548().method_67532();

         for (int var3 = 9; var3 <= 35; var3++) {
            if (this.method_2109(c.field_1724.method_31548().method_5438(var3))) {
               var1++;
            }
         }

         if (!this.field_1503.method_671()) {
            return var1;
         } else {
            for (int var4 = 0; var4 <= 8; var4++) {
               if ((this.field_1505.method_671() || var4 != var2) && this.method_2109(c.field_1724.method_31548().method_5438(var4))) {
                  var1++;
               }
            }

            return var1;
         }
      } else {
         return 0;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2109(ItemStack var1) {
      if (var1 != null && !var1.method_7960()) {
         Item var2 = var1.method_7909();
         return this.field_1500.method_711(var2);
      } else {
         return false;
      }
   }
}
