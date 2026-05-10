package Dev.ZWare.Client.pkg1;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;

public final class Class19 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   private Class19() {
      throw new IllegalArgumentException("пошел нахуй");
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey, net.minecraft.item.ItemStack) int
   public static int method_408(RegistryKey<Enchantment> key, ItemStack stack) {
      if (stack.method_7960()) {
         return 0;
      } else {
         for (Entry var3 : stack.method_58657().method_57539()) {
            if (((RegistryEntry)var3.getKey()).method_40225(key)) {
               return var3.getIntValue();
            }
         }

         return 0;
      }
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey, net.minecraft.entity.EquipmentSlot, net.minecraft.entity.LivingEntity) int
   public static int method_409(RegistryKey<Enchantment> key, EquipmentSlot slot, LivingEntity entity) {
      return method_408(key, entity.method_6118(slot));
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey, net.minecraft.entity.EquipmentSlot) int
   public static int method_410(RegistryKey<Enchantment> key, EquipmentSlot slot) {
      return method_409(key, slot, a.field_1724);
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey, net.minecraft.item.ItemStack) boolean
   public static boolean method_411(RegistryKey<Enchantment> key, ItemStack stack) {
      return method_408(key, stack) > 0;
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey, net.minecraft.entity.EquipmentSlot, net.minecraft.entity.LivingEntity) boolean
   public static boolean method_412(RegistryKey<Enchantment> key, EquipmentSlot slot, LivingEntity entity) {
      return method_409(key, slot, entity) > 0;
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey, net.minecraft.entity.EquipmentSlot) boolean
   public static boolean method_413(RegistryKey<Enchantment> key, EquipmentSlot slot) {
      return method_410(key, slot) > 0;
   }
}
