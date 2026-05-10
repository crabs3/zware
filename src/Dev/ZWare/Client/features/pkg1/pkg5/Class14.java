package Dev.ZWare.Client.features.pkg1.pkg5;

import java.awt.Color;
import java.util.HashMap;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;

public class Class14 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_2333 = 150;
   // $VF: renamed from: p int
   private static final int field_2334 = 13;
   // $VF: renamed from: q int
   private static final int field_2335 = 55;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg1.pkg5.Class14
   private static Class14 field_2336;
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2337 = this.a("Shulkers", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2338 = this.a("Summary Icon", false);

   public Class14() {
      super("Preview", "shulker tooltips and shit", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_2336 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class14
   public static Class14 method_2972() {
      return field_2336;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, net.minecraft.client.font.TextRenderer, net.minecraft.item.ItemStack, int, int) boolean
   public boolean method_2973(DrawContext context, TextRenderer textRenderer, ItemStack stack, int x, int y) {
      if (this.d() && this.field_2337.method_671() && stack != null && !stack.method_7960() && this.method_2975(stack)) {
         ContainerComponent var6 = (ContainerComponent)stack.method_58694(DataComponentTypes.field_49622);
         if (var6 != null && !var6.method_59712().findAny().isEmpty()) {
            DefaultedList var7 = DefaultedList.method_10213(27, ItemStack.field_8037);
            var6.method_57492(var7);
            if (var7.stream().allMatch(ItemStack::method_7960)) {
               return false;
            } else {
               int var8 = c.method_22683().method_4486();
               int var9 = c.method_22683().method_4502();
               int var10 = Math.min(x + 8, var8 - 150 - 4);
               int var11 = Math.max(4, Math.min(y - 21, var9 - 68 - 4));
               int var12 = var11 + 13;
               int var13 = var10 + 150;
               int var14 = var12 + 55;
               int var15 = this.method_2976();
               int var16 = this.method_2977();
               context.method_51448().method_22903();
               context.method_51448().method_46416(0.0F, 0.0F, 600.0F);
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_773(context.method_51448(), var10, var11, var13, var11 + 13, var15);
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_773(context.method_51448(), var10, var12, var13, var14, 1996488704);
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, var11, var13, var14, var16, 1.0F);
               context.method_44379(var10 + 1, var11 + 1, var13 - 1, var11 + 13 - 1);
               context.method_27535(textRenderer, stack.method_7964(), var10 + 3, var11 + 3, -1);
               context.method_44380();

               for (int var17 = 0; var17 < var7.size(); var17++) {
                  ItemStack var18 = (ItemStack)var7.get(var17);
                  if (!var18.method_7960()) {
                     int var19 = var10 + 1 + var17 % 9 * 16;
                     int var20 = var12 + 2 + var17 / 9 * 16;
                     context.method_51427(var18, var19, var20);
                     context.method_51431(textRenderer, var18, var19, var20);
                  }
               }

               context.method_51448().method_22909();
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, net.minecraft.client.font.TextRenderer, net.minecraft.item.ItemStack, int, int) void
   public void method_2974(DrawContext context, TextRenderer textRenderer, ItemStack stack, int x, int y) {
      if (this.d() && this.field_2338.method_671() && stack != null && !stack.method_7960() && this.method_2975(stack)) {
         ContainerComponent var6 = (ContainerComponent)stack.method_58694(DataComponentTypes.field_49622);
         if (var6 != null && !var6.method_59712().findAny().isEmpty()) {
            DefaultedList var7 = DefaultedList.method_10213(27, ItemStack.field_8037);
            var6.method_57492(var7);
            Item var8 = Items.field_8162;
            int var9 = 0;
            HashMap var10 = new HashMap();

            for (ItemStack var12 : var7) {
               if (!var12.method_7960()) {
                  int var13 = var10.getOrDefault(var12.method_7909(), 0) + var12.method_7947();
                  var10.put(var12.method_7909(), var13);
                  if (var13 > var9) {
                     var9 = var13;
                     var8 = var12.method_7909();
                  }
               }
            }

            if (var8 != Items.field_8162) {
               context.method_51448().method_22903();
               context.method_51448().method_46416(0.0F, 0.0F, 300.0F);
               ItemStack var14 = new ItemStack(var8);
               context.method_51448().method_22903();
               context.method_51448().method_46416(x, y - 1, 0.0F);
               context.method_51448().method_22905(0.5F, 0.5F, 1.0F);
               context.method_51427(var14, 0, 0);
               context.method_51448().method_22909();
               context.method_51448().method_22909();
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2975(ItemStack var1) {
      return var1.method_7909() instanceof BlockItem var2 && var2.method_7711() instanceof ShulkerBoxBlock;
   }

   // $VF: renamed from: a () int
   private int method_2976() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      Color var2 = var1 == null ? new Color(40, 40, 40, 170) : var1.field_1341.method_671();
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), 170).getRGB();
   }

   // $VF: renamed from: b () int
   private int method_2977() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      Color var2 = var1 == null ? new Color(18, 18, 18, 225) : var1.field_1342.method_671();
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), 225).getRGB();
   }
}
