package Dev.ZWare.Client.pkg4;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.entity.player.PlayerEntity;

public class Class2 implements Dev.ZWare.Client.pkg1.pkg5.Class2, Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c java.util.Set
   private final Set<String> field_39 = new LinkedHashSet<>();
   // $VF: renamed from: d java.util.Set
   private final Set<String> field_40 = new LinkedHashSet<>();

   // $VF: renamed from: a (java.lang.String) boolean
   public boolean method_92(String name) {
      return name != null && !name.isBlank() ? this.method_100(this.field_39, name) || this.method_100(this.field_40, name) : false;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   public boolean method_93(PlayerEntity player) {
      if (player == null) {
         return false;
      } else {
         return a != null && a.field_1724 != null && player.method_5667().equals(a.field_1724.method_5667())
            ? true
            : this.method_92(player.method_7334().getName());
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_94(String name) {
      if (name != null && !name.isBlank() && !this.method_92(name)) {
         this.field_39.add(name);
      }
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_95(String name) {
      if (name != null && !name.isBlank()) {
         this.field_39.removeIf(var1 -> var1.equalsIgnoreCase(name));
      }
   }

   // $VF: renamed from: a (java.util.Collection) void
   public void method_96(Collection<String> names) {
      this.field_40.clear();
      if (names != null) {
         for (String var3 : names) {
            if (var3 != null && !var3.isBlank()) {
               this.field_40.add(var3);
            }
         }
      }
   }

   // $VF: renamed from: a () void
   public void method_97() {
      this.field_39.clear();
      this.field_40.clear();
   }

   // $VF: renamed from: b () void
   public void method_98() {
      this.field_40.clear();
   }

   // $VF: renamed from: a () java.util.List
   public List<String> method_99() {
      LinkedHashSet var1 = new LinkedHashSet<>(this.field_39);
      var1.addAll(this.field_40);
      return new ArrayList<>(var1);
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (String var4 : this.field_39) {
         var2.add(var4);
      }

      var1.add("clientUsers", var2);
      return var1;
   }

   @Override
   public void fromJson(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonElement var2 = element.getAsJsonObject().get("clientUsers");
         if (var2 != null && var2.isJsonArray()) {
            this.field_39.clear();

            for (JsonElement var4 : var2.getAsJsonArray()) {
               if (var4 != null && var4.isJsonPrimitive()) {
                  this.method_94(var4.getAsString());
               }
            }
         }
      }
   }

   @Override
   public String getFileName() {
      return "client-users.json";
   }

   // $VF: renamed from: a (java.util.Collection, java.lang.String) boolean
   private boolean method_100(Collection<String> var1, String var2) {
      return var1.stream().anyMatch(var1x -> var1x.equalsIgnoreCase(var2));
   }
}
