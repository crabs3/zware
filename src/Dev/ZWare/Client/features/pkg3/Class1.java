package Dev.ZWare.Client.features.pkg3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class Class1 extends Class8<Set<Item>> {
   public Class1(String name) {
      super(name, new LinkedHashSet<>());
   }

   // $VF: renamed from: a (net.minecraft.item.Item) boolean
   public boolean method_711(Item item) {
      return item != null && ((Set)this.a()).contains(item);
   }

   // $VF: renamed from: a (net.minecraft.item.Item) void
   public void method_712(Item item) {
      if (item != null && item != Items.field_8162) {
         LinkedHashSet var2 = new LinkedHashSet((Collection)this.a());
         if (!var2.remove(item)) {
            var2.add(item);
         }

         this.a(var2);
      }
   }

   // $VF: renamed from: f () java.lang.String
   @Override
   public String method_707() {
      StringBuilder var1 = new StringBuilder();

      for (Item var3 : (Set)this.a()) {
         Identifier var4 = Registries.field_41178.method_10221(var3);
         if (var4 != null) {
            if (!var1.isEmpty()) {
               var1.append(',');
            }

            var1.append(var4);
         }
      }

      return var1.toString();
   }

   // $VF: renamed from: a (java.lang.String) java.util.Set
   public static Set<Item> method_713(String value) {
      LinkedHashSet var1 = new LinkedHashSet();
      if (value != null && !value.isBlank()) {
         for (String var5 : value.split(",")) {
            String var6 = var5.trim();
            if (!var6.isEmpty()) {
               Identifier var7 = Identifier.method_12829(var6);
               if (var7 != null && Registries.field_41178.method_10250(var7)) {
                  Item var8 = (Item)Registries.field_41178.method_63535(var7);
                  if (var8 != null && var8 != Items.field_8162) {
                     var1.add(var8);
                  }
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }
}
