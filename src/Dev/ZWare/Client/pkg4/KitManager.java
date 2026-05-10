package Dev.ZWare.Client.pkg4;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.StringNbtReader;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public class KitManager implements Dev.ZWare.Client.pkg1.pkg5.Class2, Dev.ZWare.Client.pkg1.pkg5.Class1 {
   public static final int INVENTORY_SLOT_COUNT = 36;
   public static final int OFFHAND_SLOT = 36;
   public static final int KIT_SLOT_COUNT = 37;
   private final Map<String, KitManager.Inner1> kits = new LinkedHashMap<>();
   private String loadedKitName;

   public boolean saveKit(String name) {
      if (a.field_1724 != null && a.field_1687 != null) {
         String var2 = this.sanitizeName(name);
         if (var2 == null) {
            return false;
         } else {
            String var3 = this.resolveName(var2);
            String var4 = var3 != null ? var3 : var2;
            this.kits.put(var4, KitManager.Inner1.method_872(a.field_1724.method_31548(), a.field_1724.method_6079(), a.field_1687.method_30349()));
            if (this.loadedKitName != null && this.loadedKitName.equalsIgnoreCase(var4)) {
               this.loadedKitName = var4;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean loadKit(String name) {
      String var2 = this.resolveName(name);
      if (var2 == null) {
         return false;
      } else {
         this.loadedKitName = var2;
         return true;
      }
   }

   public boolean deleteKit(String name) {
      String var2 = this.resolveName(name);
      if (var2 == null) {
         return false;
      } else {
         this.kits.remove(var2);
         if (this.loadedKitName != null && this.loadedKitName.equalsIgnoreCase(var2)) {
            this.loadedKitName = null;
         }

         return true;
      }
   }

   public boolean hasKit(String name) {
      return this.resolveName(name) != null;
   }

   public List<String> getKitNames() {
      return new ArrayList<>(this.kits.keySet());
   }

   public String getLoadedKitName() {
      return this.loadedKitName;
   }

   public KitManager.Inner1 getLoadedKit() {
      return this.loadedKitName == null ? null : this.kits.get(this.loadedKitName);
   }

   public KitManager.Inner1 getKit(String name) {
      String var2 = this.resolveName(name);
      return var2 != null ? this.kits.get(var2) : null;
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      if (this.loadedKitName != null) {
         var1.addProperty("loadedKit", this.loadedKitName);
      }

      JsonObject var2 = new JsonObject();

      for (Entry var4 : this.kits.entrySet()) {
         JsonArray var5 = new JsonArray();

         for (String var7 : ((KitManager.Inner1)var4.getValue()).method_875()) {
            if (var7 != null) {
               var5.add(var7);
            } else {
               var5.add(JsonNull.INSTANCE);
            }
         }

         var2.add((String)var4.getKey(), var5);
      }

      var1.add("kits", var2);
      return var1;
   }

   @Override
   public void fromJson(JsonElement element) {
      this.kits.clear();
      this.loadedKitName = null;
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         this.loadKits(var2.get("kits"));
         this.loadSelectedKit(var2.get("loadedKit"));
      }
   }

   private void loadKits(JsonElement var1) {
      if (var1 != null && var1.isJsonObject()) {
         JsonObject var2 = var1.getAsJsonObject();

         for (Entry var4 : var2.entrySet()) {
            if (var4.getValue() != null && ((JsonElement)var4.getValue()).isJsonArray()) {
               this.kits.put((String)var4.getKey(), KitManager.Inner1.method_873(((JsonElement)var4.getValue()).getAsJsonArray()));
            }
         }
      }
   }

   private void loadSelectedKit(JsonElement var1) {
      if (var1 != null && var1.isJsonPrimitive()) {
         this.loadedKitName = this.resolveName(var1.getAsString());
      }
   }

   @Override
   public String getFileName() {
      return "kits.json";
   }

   private String resolveName(String var1) {
      String var2 = this.sanitizeName(var1);
      if (var2 == null) {
         return null;
      } else {
         for (String var4 : this.kits.keySet()) {
            if (var4.equalsIgnoreCase(var2)) {
               return var4;
            }
         }

         return null;
      }
   }

   private String sanitizeName(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.trim();
         return var2.isEmpty() ? null : var2;
      }
   }

   public static final class Inner1 {
      // $VF: renamed from: a java.util.List
      private final List<String> field_444;

      private Inner1(List<String> var1) {
         this.field_444 = var1;
      }

      // $VF: renamed from: a (net.minecraft.entity.player.PlayerInventory, net.minecraft.item.ItemStack, net.minecraft.registry.RegistryWrapper.WrapperLookup) Dev.ZWare.Client.pkg4.KitManager$Inner1
      public static KitManager.Inner1 method_872(PlayerInventory inventory, ItemStack offhandStack, WrapperLookup lookup) {
         ArrayList var3 = new ArrayList(37);

         for (int var4 = 0; var4 < 36; var4++) {
            var3.add(method_876(inventory.method_5438(var4), lookup));
         }

         var3.add(method_876(offhandStack, lookup));
         return new KitManager.Inner1(var3);
      }

      // $VF: renamed from: a (com.google.gson.JsonArray) Dev.ZWare.Client.pkg4.KitManager$Inner1
      public static KitManager.Inner1 method_873(JsonArray slotsArray) {
         ArrayList var1 = new ArrayList(37);

         for (int var2 = 0; var2 < 37; var2++) {
            Object var3 = var2 < slotsArray.size() ? slotsArray.get(var2) : JsonNull.INSTANCE;
            if (var3 != null && !var3.isJsonNull()) {
               var1.add(var3.getAsString());
            } else {
               var1.add(null);
            }
         }

         return new KitManager.Inner1(var1);
      }

      // $VF: renamed from: a (net.minecraft.registry.RegistryWrapper.WrapperLookup) net.minecraft.item.ItemStack[]
      public ItemStack[] method_874(WrapperLookup lookup) {
         ItemStack[] var2 = new ItemStack[37];

         for (int var3 = 0; var3 < 37; var3++) {
            var2[var3] = method_877(this.field_444.get(var3), lookup);
         }

         return var2;
      }

      // $VF: renamed from: a () java.util.List
      private List<String> method_875() {
         return this.field_444;
      }

      // $VF: renamed from: a (net.minecraft.item.ItemStack, net.minecraft.registry.RegistryWrapper.WrapperLookup) java.lang.String
      private static String method_876(ItemStack var0, WrapperLookup var1) {
         if (var0 != null && !var0.method_7960()) {
            NbtElement var2 = var0.method_57358(var1);
            return var2 != null ? var2.toString() : null;
         } else {
            return null;
         }
      }

      // $VF: renamed from: a (java.lang.String, net.minecraft.registry.RegistryWrapper.WrapperLookup) net.minecraft.item.ItemStack
      private static ItemStack method_877(String var0, WrapperLookup var1) {
         if (var0 != null && !var0.isBlank()) {
            try {
               NbtCompound var2 = StringNbtReader.method_67315(var0);
               Optional var3 = ItemStack.method_57360(var1, var2);
               if (var3 instanceof ItemStack var8) {
                  return var8;
               }

               if (var3 instanceof Optional var4 && (var4.isPresent() ? var4.get() : ItemStack.field_8037) instanceof ItemStack var6) {
                  return var6;
               }
            } catch (Exception var7) {
               Dev.ZWare.Client.Class1.field_294.error("Failed to deserialize kit stack.", var7);
            }

            return ItemStack.field_8037;
         } else {
            return ItemStack.field_8037;
         }
      }
   }
}
