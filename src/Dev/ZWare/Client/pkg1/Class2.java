package Dev.ZWare.Client.pkg1;

import java.util.function.Predicate;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

public final class Class2 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   private Class2() {
   }

   // $VF: renamed from: a (net.minecraft.entity.EquipmentSlot, int) boolean
   public static boolean method_190(EquipmentSlot slot, int inventorySlot) {
      return method_191(slot, inventorySlot, false);
   }

   // $VF: renamed from: a (net.minecraft.entity.EquipmentSlot, int, boolean) boolean
   public static boolean method_191(EquipmentSlot slot, int inventorySlot, boolean notifyFailure) {
      if (a.field_1724 == null || a.field_1761 == null) {
         return false;
      } else if (inventorySlot >= 0 && inventorySlot <= 35) {
         int var3 = method_196(slot);
         int var4 = method_197(var3);
         if (var4 == -1) {
            if (notifyFailure) {
               Dev.ZWare.Client.features.pkg2.Class1.method_1647("Close containers before swapping armor.");
            }

            return false;
         } else if (inventorySlot < 9) {
            method_198(var4, inventorySlot);
            return true;
         } else {
            int var5 = a.field_1724.method_31548().method_67532();
            if (!Class9.method_145(inventorySlot)) {
               return false;
            } else {
               try {
                  method_198(var4, var5);
               } finally {
                  Class9.method_145(inventorySlot);
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack, net.minecraft.entity.EquipmentSlot) boolean
   public static boolean method_192(ItemStack stack, EquipmentSlot slot) {
      if (stack != null && !stack.method_7960()) {
         EquippableComponent var2 = (EquippableComponent)stack.method_58694(DataComponentTypes.field_54196);
         return var2 != null && var2.comp_3174() == slot;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) net.minecraft.entity.EquipmentSlot
   public static EquipmentSlot method_193(ItemStack stack) {
      if (stack != null && !stack.method_7960()) {
         EquippableComponent var1 = (EquippableComponent)stack.method_58694(DataComponentTypes.field_54196);
         return var1 != null ? var1.comp_3174() : null;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.EquipmentSlot) int
   public static int method_194(EquipmentSlot slot) {
      return method_195(slot, var0 -> true);
   }

   // $VF: renamed from: a (net.minecraft.entity.EquipmentSlot, java.util.function.Predicate) int
   public static int method_195(EquipmentSlot slot, Predicate<ItemStack> predicate) {
      if (a.field_1724 == null) {
         return -1;
      } else {
         int var2 = -1;
         int var3 = Integer.MIN_VALUE;

         for (int var4 = 0; var4 <= 35; var4++) {
            ItemStack var5 = a.field_1724.method_31548().method_5438(var4);
            if (method_192(var5, slot) && predicate.test(var5)) {
               int var6 = method_199(var5);
               if (var6 > var3) {
                  var3 = var6;
                  var2 = var4;
               }
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.EquipmentSlot) int
   public static int method_196(EquipmentSlot slot) {
      return switch (slot) {
         case field_6166 -> 36;
         case field_6172 -> 37;
         case field_6174 -> 38;
         case field_6169 -> 39;
         default -> throw new IllegalArgumentException("Not an armor slot: " + slot);
      };
   }

   // $VF: renamed from: a (int) int
   public static int method_197(int inventorySlot) {
      if (a.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < a.field_1724.field_7512.field_7761.size(); var1++) {
            Slot var2 = a.field_1724.field_7512.method_7611(var1);
            if (var2.field_7871 == a.field_1724.method_31548() && var2.method_34266() == inventorySlot) {
               return var1;
            }
         }

         return -1;
      }
   }

   // $VF: renamed from: a (int, int) void
   private static void method_198(int var0, int var1) {
      Class9.method_155(a.field_1724.field_7512, var0, var1, SlotActionType.field_7791);
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) int
   private static int method_199(ItemStack var0) {
      byte var1 = 0;
      if (var0.method_31574(Items.field_22027)
         || var0.method_31574(Items.field_22028)
         || var0.method_31574(Items.field_22029)
         || var0.method_31574(Items.field_22030)) {
         var1 = 9;
      } else if (var0.method_31574(Items.field_8805)
         || var0.method_31574(Items.field_8058)
         || var0.method_31574(Items.field_8348)
         || var0.method_31574(Items.field_8285)) {
         var1 = 8;
      } else if (var0.method_31574(Items.field_8743)
         || var0.method_31574(Items.field_8523)
         || var0.method_31574(Items.field_8396)
         || var0.method_31574(Items.field_8660)) {
         var1 = 6;
      } else if (var0.method_31574(Items.field_8862)
         || var0.method_31574(Items.field_8678)
         || var0.method_31574(Items.field_8416)
         || var0.method_31574(Items.field_8753)
         || var0.method_31574(Items.field_8283)
         || var0.method_31574(Items.field_8873)
         || var0.method_31574(Items.field_8218)
         || var0.method_31574(Items.field_8313)) {
         var1 = 5;
      } else if (var0.method_31574(Items.field_8090)) {
         var1 = 4;
      } else if (var0.method_31574(Items.field_8267)
         || var0.method_31574(Items.field_8577)
         || var0.method_31574(Items.field_8570)
         || var0.method_31574(Items.field_8370)) {
         var1 = 3;
      }

      int var2 = Class19.method_408(Enchantments.field_9111, var0);
      int var3 = Class19.method_408(Enchantments.field_9107, var0);
      int var4 = Class19.method_408(Enchantments.field_9096, var0);
      int var5 = Class19.method_408(Enchantments.field_9095, var0);
      int var6 = Class19.method_408(Enchantments.field_9127, var0);
      int var7 = Class19.method_408(Enchantments.field_9129, var0);
      int var8 = Class19.method_408(Enchantments.field_9119, var0);
      int var9 = Class19.method_408(Enchantments.field_9101, var0);
      int var10 = var0.method_7963() ? var0.method_7936() - var0.method_7919() : 0;
      return var1 * 10000 + var2 * 1200 + var3 * 400 + var4 * 300 + var5 * 250 + var6 * 180 + var7 * 200 + var8 * 150 + var9 * 75 + var10;
   }
}
