package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class8 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F float
   private static final float field_2981 = 18.0F;
   // $VF: renamed from: G float
   private static final float field_2982 = 1.0F;
   // $VF: renamed from: H float
   private static final float field_2983 = 4.0F;
   // $VF: renamed from: I float
   private static final float field_2984 = 3.0F;
   // $VF: renamed from: J float
   private static final float field_2985 = 9.0F;
   // $VF: renamed from: K int
   private static final int field_2986 = 9;
   // $VF: renamed from: L int
   private static final int field_2987 = 35;
   // $VF: renamed from: M int
   private static final int field_2988 = 0;
   // $VF: renamed from: N int
   private static final int field_2989 = 8;
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2990 = this.a("Show Hotbar", false);
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2991 = this.a("Show Title", false);
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2992 = this.a("Background", true).method_683("Render");
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2993 = this.a("Slot Background", true).method_683("Render");
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2994 = this.a("Background Color", new Color(10, 10, 10, 120)).method_683("Render");
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2995 = this.a("Border Color", new Color(40, 40, 40, 180)).method_683("Render");
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2996 = this.a("Slot Color", new Color(255, 255, 255, 22)).method_683("Render");
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2997 = this.a("Title Color", new Color(235, 235, 235, 255)).method_683("Render");

   public Class8() {
      super("Inventory", "Displays your inventory as a HUD grid.", 170.0F, 62.0F);
      this.field_2994.method_709(var1 -> this.field_2992.method_671());
      this.field_2995.method_709(var1 -> this.field_2992.method_671());
      this.field_2996.method_709(var1 -> this.field_2993.method_671());
      this.field_2997.method_709(var1 -> this.field_2991.method_671());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      Class8.Inner1 var2 = this.method_3712();
      this.a(var2.method_1484(), var2.method_1485());
      super.method_3643(e);
      List var3 = this.method_3716();
      float var4 = this.e();
      float var5 = this.f();
      if (this.field_2992.method_671()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_768(
            e.method_1053().method_51448(),
            var4,
            var5,
            var4 + var2.method_1484(),
            var5 + var2.method_1485(),
            this.field_2994.method_671().getRGB(),
            this.field_2995.method_671().getRGB()
         );
      }

      float var6 = var4 + 4.0F;
      float var7 = var5 + 4.0F;
      if (this.field_2991.method_671()) {
         this.b(e.method_1053(), "Inventory", var6, var7, this.field_2997.method_671().getRGB());
         var7 += this.method_3714() + 3.0F;
      }

      this.method_3715(e, var3, var6, var7);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg7.Class8$Inner1
   private Class8.Inner1 method_3712() {
      float var1 = 162.0F;
      float var2 = this.method_3713() * 18.0F;
      float var3 = this.field_2991.method_671() ? this.method_3714() + 3.0F : 0.0F;
      return new Class8.Inner1(var1 + 8.0F, var2 + 8.0F + var3);
   }

   // $VF: renamed from: c () int
   private int method_3713() {
      return this.field_2990.method_671() ? 4 : 3;
   }

   // $VF: renamed from: n () float
   private float method_3714() {
      return c != null && c.field_1772 != null ? 9.0F : 9.0F;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.util.List, float, float) void
   private void method_3715(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, List<ItemStack> var2, float var3, float var4) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         int var6 = var5 / 9;
         int var7 = var5 % 9;
         float var8 = var3 + var7 * 18.0F;
         float var9 = var4 + var6 * 18.0F;
         if (this.field_2993.method_671()) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_768(
               var1.method_1053().method_51448(),
               var8,
               var9,
               var8 + 18.0F,
               var9 + 18.0F,
               this.field_2996.method_671().getRGB(),
               this.field_2995.method_671().getRGB()
            );
         }

         ItemStack var10 = (ItemStack)var2.get(var5);
         if (!var10.method_7960()) {
            int var11 = Math.round(var8 + 1.0F);
            int var12 = Math.round(var9 + 1.0F);
            var1.method_1053().method_51427(var10, var11, var12);
            var1.method_1053().method_51431(c.field_1772, var10, var11, var12);
         }
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<ItemStack> method_3716() {
      if (g()) {
         return this.method_3718();
      } else {
         ArrayList var1 = new ArrayList(this.method_3713() * 9);
         this.method_3717(var1, 9, 35);
         if (this.field_2990.method_671()) {
            this.method_3717(var1, 0, 8);
         }

         return var1;
      }
   }

   // $VF: renamed from: a (java.util.List, int, int) void
   private void method_3717(List<ItemStack> var1, int var2, int var3) {
      for (int var4 = var2; var4 <= var3; var4++) {
         var1.add(c.field_1724.method_31548().method_5438(var4));
      }
   }

   // $VF: renamed from: c () java.util.List
   private List<ItemStack> method_3718() {
      ArrayList var1 = new ArrayList(this.method_3713() * 9);
      var1.add(this.method_3719(Items.field_8301, 18));
      var1.add(this.method_3719(Items.field_8281, 64));
      var1.add(this.method_3719(Items.field_8287, 32));
      var1.add(this.method_3719(Items.field_8463, 12));
      var1.add(this.method_3719(Items.field_8288, 3));
      var1.add(this.method_3719(Items.field_23141, 5));
      var1.add(this.method_3719(Items.field_8801, 48));
      var1.add(this.method_3719(Items.field_8634, 16));
      var1.add(this.method_3719(Items.field_8786, 9));
      var1.add(this.method_3719(Items.field_8377, 1));
      var1.add(this.method_3719(Items.field_22022, 1));
      var1.add(this.method_3719(Items.field_8639, 27));
      var1.add(this.method_3719(Items.field_8233, 7));
      var1.add(this.method_3719(Items.field_8705, 1));
      var1.add(this.method_3719(Items.field_8367, 2));
      var1.add(this.method_3719(Items.field_8276, 24));
      var1.add(this.method_3719(Items.field_8258, 4));
      var1.add(this.method_3719(Items.field_8162, 0));
      var1.add(this.method_3719(Items.field_22019, 11));
      var1.add(this.method_3719(Items.field_8466, 6));
      var1.add(this.method_3719(Items.field_8793, 20));
      var1.add(this.method_3719(Items.field_8249, 12));
      var1.add(this.method_3719(Items.field_8537, 10));
      var1.add(this.method_3719(Items.field_8626, 15));
      var1.add(this.method_3719(Items.field_8556, 1));
      var1.add(this.method_3719(Items.field_8255, 1));
      var1.add(this.method_3719(Items.field_8162, 0));
      if (this.field_2990.method_671()) {
         var1.add(this.method_3719(Items.field_22022, 1));
         var1.add(this.method_3719(Items.field_8301, 64));
         var1.add(this.method_3719(Items.field_8281, 64));
         var1.add(this.method_3719(Items.field_8288, 1));
         var1.add(this.method_3719(Items.field_8287, 64));
         var1.add(this.method_3719(Items.field_8634, 16));
         var1.add(this.method_3719(Items.field_8399, 1));
         var1.add(this.method_3719(Items.field_8071, 32));
         var1.add(this.method_3719(Items.field_8639, 64));
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.item.Item, int) net.minecraft.item.ItemStack
   private ItemStack method_3719(Item var1, int var2) {
      if (var1 != Items.field_8162 && var2 > 0) {
         ItemStack var3 = new ItemStack(var1, Math.min(var2, var1.method_7882()));
         var3.method_7939(Math.min(var2, var3.method_7914()));
         return var3;
      } else {
         return ItemStack.field_8037;
      }
   }

   private record Inner1(float bB, float bC) {
      // $VF: renamed from: bB float
      private final float field_953;
      // $VF: renamed from: bC float
      private final float field_954;

      private Inner1(float bB, float bC) {
         this.field_953 = bB;
         this.field_954 = bC;
      }

      // $VF: renamed from: bB () float
      public float method_1484() {
         return this.field_953;
      }

      // $VF: renamed from: bC () float
      public float method_1485() {
         return this.field_954;
      }
   }
}
