package Dev.ZWare.Client.pkg4;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.player.PlayerEntity;

public class Class21 implements Dev.ZWare.Client.pkg1.pkg5.Class2 {
   // $VF: renamed from: a java.util.List
   private final List<String> field_84 = new ArrayList<>();

   // $VF: renamed from: a (java.lang.String) boolean
   public boolean method_208(String name) {
      return this.field_84.stream().anyMatch(var1 -> var1.equalsIgnoreCase(name));
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   public boolean method_209(PlayerEntity player) {
      return player != null && this.method_208(player.method_7334().getName());
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_210(String name) {
      if (name != null && !name.isBlank() && !this.method_208(name)) {
         this.field_84.add(name);
      }
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_211(String name) {
      this.field_84.removeIf(var1 -> var1.equalsIgnoreCase(name));
   }

   // $VF: renamed from: a () java.util.List
   public List<String> method_212() {
      return this.field_84;
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (String var4 : this.field_84) {
         var2.add(var4);
      }

      var1.add("enemies", var2);
      return var1;
   }

   @Override
   public void fromJson(JsonElement element) {
      this.field_84.clear();
      if (element != null && !element.isJsonNull() && element.getAsJsonObject().has("enemies")) {
         for (JsonElement var3 : element.getAsJsonObject().get("enemies").getAsJsonArray()) {
            this.method_210(var3.getAsString());
         }
      }
   }

   @Override
   public String getFileName() {
      return "enemies.json";
   }
}
