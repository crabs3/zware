package Dev.ZWare.Client.pkg1.pkg2.pkg1;

import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;

public final class Class4 {
   // $VF: renamed from: a java.lang.String
   public static final String field_188 = "image";
   // $VF: renamed from: b java.lang.String
   public static final String field_189 = "image/";
   // $VF: renamed from: c java.util.List
   private static final List<String> field_190 = List.of(".png", ".jpg", ".jpeg", ".bmp", ".tga", ".gif");

   private Class4() {
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient) java.util.List
   public static List<String> method_398(MinecraftClient client) {
      if (client == null) {
         return List.of();
      } else {
         TreeSet var1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
         Map var2 = client.method_1478().method_14488("image", var0 -> "oyvey".equals(var0.method_12836()) && method_403(var0.method_12832()));

         for (Identifier var4 : var2.keySet()) {
            String var5 = method_405(var4);
            if (!var5.isBlank()) {
               var1.add(var5);
            }
         }

         return List.copyOf(var1);
      }
   }

   // $VF: renamed from: a (java.lang.String) java.util.List
   public static List<Identifier> method_399(String source) {
      if (source != null && !source.isBlank()) {
         String var1 = method_406(source);
         if (var1.isBlank()) {
            return List.of();
         } else {
            LinkedHashSet var2 = new LinkedHashSet();
            method_404(var2, var1);
            if (!method_407(var1)) {
               for (String var4 : field_190) {
                  method_404(var2, var1 + var4);
               }
            }

            return List.copyOf(var2);
         }
      } else {
         return List.of();
      }
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public static String method_400(String source) {
      if (source != null && !source.isBlank()) {
         Identifier var1 = Identifier.method_12829(source.trim());
         if (var1 != null && "oyvey".equals(var1.method_12836()) && method_403(var1.method_12832())) {
            return method_405(var1);
         } else {
            String var2 = source.trim().replace('\\', '/');
            if (var2.startsWith("image/")) {
               return var2.substring("image/".length());
            } else {
               int var3 = var2.lastIndexOf(47);
               if (var3 >= 0 && var3 + 1 < var2.length()) {
                  return var2.substring(var3 + 1);
               } else {
                  try {
                     Path var4 = Path.of(var2);
                     Path var5 = var4.getFileName();
                     if (var5 != null) {
                        return var5.toString();
                     }
                  } catch (Exception var6) {
                  }

                  return var2;
               }
            }
         }
      } else {
         return "None";
      }
   }

   // $VF: renamed from: a (java.lang.String) boolean
   public static boolean method_401(String source) {
      if (source != null && !source.isBlank()) {
         Identifier var1 = Identifier.method_12829(source.trim());
         return var1 == null ? !method_399(source).isEmpty() : "oyvey".equals(var1.method_12836()) && method_403(var1.method_12832());
      } else {
         return false;
      }
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   public static String method_402(String source) {
      if (source != null && !source.isBlank()) {
         Identifier var1 = Identifier.method_12829(source.trim());
         return var1 != null && "oyvey".equals(var1.method_12836()) && method_403(var1.method_12832())
            ? method_405(var1).toLowerCase(Locale.ROOT)
            : method_406(source).toLowerCase(Locale.ROOT);
      } else {
         return "";
      }
   }

   // $VF: renamed from: b (java.lang.String) boolean
   public static boolean method_403(String path) {
      if (path != null && !path.isBlank()) {
         String var1 = path.toLowerCase(Locale.ROOT);
         if (!var1.startsWith("image/")) {
            return false;
         } else {
            for (String var3 : field_190) {
               if (var1.endsWith(var3)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (java.util.LinkedHashSet, java.lang.String) void
   private static void method_404(LinkedHashSet<Identifier> var0, String var1) {
      if (!var1.isBlank()) {
         Identifier var2 = Identifier.method_12829("oyvey:image/" + var1);
         if (var2 != null) {
            var0.add(var2);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.Identifier) java.lang.String
   private static String method_405(Identifier var0) {
      String var1 = var0.method_12832();
      return var1.startsWith("image/") ? var1.substring("image/".length()) : var1;
   }

   // $VF: renamed from: c (java.lang.String) java.lang.String
   private static String method_406(String var0) {
      String var1 = var0.trim().replace('\\', '/');
      Identifier var2 = Identifier.method_12829(var1);
      if (var2 != null && "oyvey".equals(var2.method_12836())) {
         var1 = var2.method_12832();
      }

      if (var1.startsWith("image/")) {
         var1 = var1.substring("image/".length());
      }

      while (var1.startsWith("/")) {
         var1 = var1.substring(1);
      }

      return var1;
   }

   // $VF: renamed from: c (java.lang.String) boolean
   private static boolean method_407(String var0) {
      String var1 = var0.toLowerCase(Locale.ROOT);

      for (String var3 : field_190) {
         if (var1.endsWith(var3)) {
            return true;
         }
      }

      return false;
   }
}
