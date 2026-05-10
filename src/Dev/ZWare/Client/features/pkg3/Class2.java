package Dev.ZWare.Client.features.pkg3;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class Class2 extends Converter<Enum, JsonElement> {
   // $VF: renamed from: a java.lang.Class
   private final Class<? extends Enum> field_3123;

   public Class2(Class<? extends Enum> clazz) {
      this.field_3123 = clazz;
   }

   // $VF: renamed from: a (java.lang.Enum) int
   public static int method_3814(Enum clazz) {
      for (int var1 = 0; var1 < clazz.getDeclaringClass().getEnumConstants().length; var1++) {
         Enum var2 = (Enum)clazz.getDeclaringClass().getEnumConstants()[var1];
         if (var2.name().equalsIgnoreCase(clazz.name())) {
            return var1;
         }
      }

      return -1;
   }

   // $VF: renamed from: a (java.lang.Enum) java.lang.Enum
   public static Enum method_3815(Enum clazz) {
      int var1 = method_3814(clazz);

      for (int var2 = 0; var2 < clazz.getDeclaringClass().getEnumConstants().length; var2++) {
         Enum var3 = (Enum)clazz.getDeclaringClass().getEnumConstants()[var2];
         if (var2 == var1 + 1) {
            return var3;
         }
      }

      return (Enum)clazz.getDeclaringClass().getEnumConstants()[0];
   }

   // $VF: renamed from: a (java.lang.Enum) java.lang.String
   public static String method_3816(Enum clazz) {
      if (clazz.name().equals("DelayDraw")) {
         return "Clean";
      } else if (clazz.name().equals("SilentHotbar")) {
         return "SilentHotbar";
      } else {
         return clazz.name().equals("SilentSwap") ? "SilentSwap" : Character.toUpperCase(clazz.name().charAt(0)) + clazz.name().toLowerCase().substring(1);
      }
   }

   // $VF: renamed from: a (java.lang.Enum) com.google.gson.JsonElement
   public JsonElement method_3817(Enum anEnum) {
      return new JsonPrimitive(anEnum.toString());
   }

   // $VF: renamed from: a (com.google.gson.JsonElement) java.lang.Enum
   public Enum method_3818(JsonElement jsonElement) {
      String var2 = jsonElement.getAsString();

      for (Enum var6 : this.field_3123.getEnumConstants()) {
         if (var6.name().equalsIgnoreCase(var2)) {
            return var6;
         }
      }

      Enum var7 = this.method_3819(var2);
      return var7 != null ? var7 : this.field_3123.getEnumConstants()[0];
   }

   // $VF: renamed from: a (java.lang.String) java.lang.Enum
   private Enum method_3819(String var1) {
      if (this.field_3123
         .getName()
         .equals(
            "Dev.ZWare.Client.features.irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.gGaevoDpkpENTmz_m1xn26YTrQgT3$r4Z9oSwvEod_ZuJjrQhjGWzcOln1ee_o"
         )) {
         String var2 = var1.replace("_", "").replace("-", "").toLowerCase();

         return switch (var2) {
            case "both" -> Enum.valueOf(this.field_3123, "Auto");
            case "hotbar" -> Enum.valueOf(this.field_3123, "SilentHotbar");
            case "inventory" -> Enum.valueOf(this.field_3123, "SilentSwap");
            default -> null;
         };
      } else {
         return null;
      }
   }
}
