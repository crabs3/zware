package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class10 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F float
   private static final float field_3007 = 0.66F;
   // $VF: renamed from: G net.minecraft.entity.EquipmentSlot[]
   private static final EquipmentSlot[] field_3008 = new EquipmentSlot[]{
      EquipmentSlot.field_6166, EquipmentSlot.field_6172, EquipmentSlot.field_6174, EquipmentSlot.field_6169
   };
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3009 = this.a("Percent", true);

   public Class10() {
      super("Armor", "Displays your armor slots.", 75.0F, 25.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      this.e(75.0F, this.field_3009.method_671() ? 25.0F : 20.0F);
      super.method_3643(e);
      if (!g()) {
         byte var2 = 19;
         float var3 = this.e();
         float var4 = this.f();

         for (EquipmentSlot var8 : field_3008) {
            ItemStack var9 = c.field_1724.method_6118(var8);
            if (!var9.method_7960()) {
               int var10 = this.field_3009.method_671() ? 8 : 3;
               int var11 = Math.round(var3 + this.c() - var2);
               int var12 = Math.round(var4 + var10);
               e.method_1053().method_51427(var9, var11, var12);
               e.method_1053().method_51431(c.field_1772, var9, var11, var12);
               if (this.field_3009.method_671()) {
                  float var13 = this.method_3726(var9);
                  String var14 = Integer.toString((int)(var13 * 100.0F));
                  float var15 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var14, 0.66F);
                  float var16 = var3 + this.c() - var2 + 8.0F - var15 / 2.0F;
                  this.a(e.method_1053(), var8.method_5923(), var14, var16, var4 + 1.0F, this.method_3727(var13), 0.66F);
               }

               var2 += 18;
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) float
   private float method_3726(ItemStack var1) {
      if (var1.method_7963() && var1.method_7936() > 0) {
         int var2 = var1.method_7936() - var1.method_7919();
         return Math.clamp((float)var2 / var1.method_7936(), 0.0F, 1.0F);
      } else {
         return var1.method_31574(Items.field_8833) ? 1.0F : 1.0F;
      }
   }

   // $VF: renamed from: a (float) int
   private int method_3727(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F) / 3.0F;
      return Color.HSBtoRGB(var2, 1.0F, 1.0F);
   }
}
