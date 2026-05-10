package Dev.ZWare.Client.gui;

import Dev.ZWare.Client.features.pkg1.pkg4.Class8;
import Dev.ZWare.Client.pkg1.pkg2.Class2;
import java.awt.Color;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;

public class ShulkerPeekScreen extends Screen {
   // $VF: renamed from: a int
   private static final int field_3092 = 16;
   // $VF: renamed from: b int
   private static final int field_3093 = 9;
   // $VF: renamed from: c int
   private static final int field_3094 = 3;
   // $VF: renamed from: d int
   private static final int field_3095 = 150;
   // $VF: renamed from: e int
   private static final int field_3096 = 13;
   // $VF: renamed from: f int
   private static final int field_3097 = 55;
   // $VF: renamed from: g int
   private static final int field_3098 = 13;
   // $VF: renamed from: h net.minecraft.util.collection.DefaultedList
   private final DefaultedList<ItemStack> field_3099;
   // $VF: renamed from: i net.minecraft.text.Text
   private final Text field_3100;
   // $VF: renamed from: j int
   private int field_3101;
   // $VF: renamed from: k int
   private int field_3102;

   public ShulkerPeekScreen(ItemStack shulkerStack) {
      super(Text.method_43470("Shulker Peek"));
      this.field_3100 = shulkerStack.method_7964();
      this.field_3099 = DefaultedList.method_10213(27, ItemStack.field_8037);
      ContainerComponent var2 = (ContainerComponent)shulkerStack.method_58694(DataComponentTypes.field_49622);
      if (var2 != null) {
         var2.method_57492(this.field_3099);
      }
   }

   protected void method_25426() {
      this.field_3101 = (this.field_22789 - 150) / 2;
      this.field_3102 = (this.field_22790 - 68) / 2;
   }

   public void method_25420(DrawContext context, int mouseX, int mouseY, float delta) {
      context.method_25296(0, 0, this.field_22789, this.field_22790, -1609560048, -1609560048);
   }

   public void method_25394(DrawContext context, int mouseX, int mouseY, float delta) {
      super.method_25394(context, mouseX, mouseY, delta);
      int var5 = this.field_3102 + 13;
      int var6 = this.field_3101 + 150;
      int var7 = var5 + 55;
      Class2.method_773(context.method_51448(), this.field_3101, this.field_3102, var6, this.field_3102 + 13, this.method_3798());
      Class2.method_773(context.method_51448(), this.field_3101, var5, var6, var7, 1996488704);
      Class2.method_767(context.method_51448(), this.field_3101, this.field_3102, var6, var7, this.method_3799(), 1.0F);
      context.method_44379(this.field_3101 + 1, this.field_3102 + 1, var6 - 1, this.field_3102 + 13 - 1);
      context.method_27535(this.field_22793, this.field_3100, this.field_3101 + 3, this.field_3102 + 3, -1);
      context.method_44380();

      for (int var8 = 0; var8 < this.field_3099.size(); var8++) {
         ItemStack var9 = (ItemStack)this.field_3099.get(var8);
         if (!var9.method_7960()) {
            int var10 = var8 % 9;
            int var11 = var8 / 9;
            int var12 = this.field_3101 + 1 + var10 * 16;
            int var13 = var5 + 2 + var11 * 16;
            context.method_51427(var9, var12, var13);
            context.method_51431(this.field_22793, var9, var12, var13);
         }
      }

      int var14 = this.method_3797(mouseX, mouseY);
      if (var14 >= 0 && var14 < this.field_3099.size()) {
         ItemStack var15 = (ItemStack)this.field_3099.get(var14);
         if (!var15.method_7960()) {
            context.method_51446(this.field_22793, var15, mouseX, mouseY);
         }
      }
   }

   // $VF: renamed from: a (int, int) int
   private int method_3797(int var1, int var2) {
      int var3 = this.field_3101 + 1;
      int var4 = this.field_3102 + 13 + 2;
      int var5 = var1 - var3;
      int var6 = var2 - var4;
      if (var5 >= 0 && var6 >= 0) {
         int var7 = var5 / 16;
         int var8 = var6 / 16;
         return var7 < 9 && var8 < 3 ? var8 * 9 + var7 : -1;
      } else {
         return -1;
      }
   }

   public boolean method_25402(double mouseX, double mouseY, int button) {
      int var6 = this.field_3102 + 13 + 55;
      if (!(mouseX < this.field_3101) && !(mouseX > this.field_3101 + 150) && !(mouseY < this.field_3102) && !(mouseY > var6)) {
         return super.method_25402(mouseX, mouseY, button);
      } else {
         this.method_25419();
         return true;
      }
   }

   public boolean method_25404(int keyCode, int scanCode, int modifiers) {
      if (keyCode != 256 && (this.field_22787 == null || !this.field_22787.field_1690.field_1822.method_1417(keyCode, scanCode))) {
         return super.method_25404(keyCode, scanCode, modifiers);
      } else {
         this.method_25419();
         return true;
      }
   }

   public boolean method_25421() {
      return false;
   }

   public static boolean isShulker(ItemStack stack) {
      return stack != null && !stack.method_7960() && stack.method_7909() instanceof BlockItem var1 && var1.method_7711() instanceof ShulkerBoxBlock;
   }

   // $VF: renamed from: a () int
   private int method_3798() {
      Class8 var1 = Class8.method_1995();
      Color var2 = var1 == null ? new Color(40, 40, 40, 170) : var1.field_1341.method_671();
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), 170).getRGB();
   }

   // $VF: renamed from: b () int
   private int method_3799() {
      Class8 var1 = Class8.method_1995();
      Color var2 = var1 == null ? new Color(18, 18, 18, 225) : var1.field_1342.method_671();
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), 225).getRGB();
   }
}
