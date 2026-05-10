package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class4 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F float
   private static final float field_2965 = 16.0F;

   public Class4() {
      super("TotemCount", "Displays your totem count as an item icon.", 16.0F, 16.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      super.method_3643(e);
      this.a(16.0F, 16.0F);
      int var2 = this.n() && g() ? 3 : this.method_3696();
      float var3 = this.e();
      float var4 = this.f();
      int var5 = Math.round(var3);
      int var6 = Math.round(var4);
      ItemStack var7 = Items.field_8288.method_7854();
      e.method_1053().method_51427(var7, var5, var6);
      if (var2 > 0) {
         e.method_1053().method_51432(c.field_1772, var7, var5, var6, Integer.toString(var2));
      } else {
         int var8 = c.field_1772.method_1727("0");
         e.method_1053().method_51433(c.field_1772, "0", var5 + 19 - 2 - var8, var6 + 9, 16777215, true);
      }
   }

   // $VF: renamed from: c () int
   private int method_3696() {
      if (g()) {
         return 0;
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 <= 35; var2++) {
            ItemStack var3 = c.field_1724.method_31548().method_5438(var2);
            if (var3.method_31574(Items.field_8288)) {
               var1 += var3.method_7947();
            }
         }

         if (c.field_1724.method_6079().method_31574(Items.field_8288)) {
            var1 += c.field_1724.method_6079().method_7947();
         }

         return var1;
      }
   }
}
