package Dev.ZWare.Client.pkg4;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;

final class Class17 {
   // $VF: renamed from: a java.lang.String
   private static final String field_183 = "/zware-default-profile.json";

   private Class17() {
   }

   // $VF: renamed from: a () void
   static void method_381() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         method_382();
         method_383();
         method_384();
         method_386();
      }
   }

   // $VF: renamed from: b () void
   private static void method_382() {
      if (Dev.ZWare.Client.Class1.field_310 != null) {
         Dev.ZWare.Client.Class1.field_310.method_380().clear();
      }

      if (Dev.ZWare.Client.Class1.field_311 != null) {
         Dev.ZWare.Client.Class1.field_311.method_212().clear();
      }
   }

   // $VF: renamed from: c () void
   private static void method_383() {
      for (Dev.ZWare.Client.features.pkg1.Class1 var1 : Dev.ZWare.Client.Class1.field_316.field_270) {
         var1.method_1904();
         var1.a();
      }
   }

   // $VF: renamed from: d () void
   private static void method_384() {
      JsonObject var0 = method_385();
      if (var0 != null) {
         JsonObject var1 = new JsonObject();

         for (Entry var3 : var0.entrySet()) {
            if (var3.getValue() != null && !((JsonElement)var3.getValue()).isJsonNull() && ((JsonElement)var3.getValue()).isJsonObject()) {
               Dev.ZWare.Client.features.pkg1.Class1 var4 = Dev.ZWare.Client.Class1.field_316.method_509((String)var3.getKey());
               if (var4 == null) {
                  Dev.ZWare.Client.Class1.field_294.warn("Bundled default preset skipped missing module {}", var3.getKey());
               } else if (var4.method_1910() != Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS) {
                  JsonObject var5 = ((JsonElement)var3.getValue()).getAsJsonObject().deepCopy();
                  var5.remove("Enabled");
                  var5.remove("Keybind");
                  var1.add((String)var3.getKey(), var5);
               }
            }
         }

         Dev.ZWare.Client.Class1.field_316.fromJson(var1);
      }
   }

   // $VF: renamed from: a () com.google.gson.JsonObject
   private static JsonObject method_385() {
      try {
         JsonObject var3;
         try (InputStream var0 = Class17.class.getResourceAsStream("/zware-default-profile.json")) {
            if (var0 == null) {
               Dev.ZWare.Client.Class1.field_294.error("Bundled default preset resource {} is missing", "/zware-default-profile.json");
               return null;
            }

            String var1 = new String(var0.readAllBytes(), StandardCharsets.UTF_8);
            JsonElement var2 = JsonParser.parseString(var1);
            if (!var2.isJsonObject()) {
               Dev.ZWare.Client.Class1.field_294.error("Bundled default preset resource {} is not a JSON object", "/zware-default-profile.json");
               return null;
            }

            var3 = var2.getAsJsonObject();
         }

         return var3;
      } catch (IOException var6) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to read bundled default preset resource {}", "/zware-default-profile.json", var6);
         return null;
      } catch (Throwable var7) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to parse bundled default preset resource {}", "/zware-default-profile.json", var7);
         return null;
      }
   }

   // $VF: renamed from: e () void
   private static void method_386() {
      if (Dev.ZWare.Client.Class1.field_309 != null) {
         Dev.ZWare.Client.features.pkg1.Class1 var0 = Dev.ZWare.Client.Class1.field_316.method_509("Client");
         if (var0 == null) {
            Dev.ZWare.Client.Class1.field_309.method_1620(";");
         } else {
            Dev.ZWare.Client.features.pkg3.Class8 var1 = var0.a("Prefix");
            if (var1 != null && var1.method_671() instanceof String var2) {
               Dev.ZWare.Client.Class1.field_309.method_1620(var2);
            } else {
               Dev.ZWare.Client.Class1.field_309.method_1620(";");
            }
         }
      }
   }
}
