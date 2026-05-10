package Dev.ZWare.Client.pkg4;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Formatting;

public class Class23 extends Dev.ZWare.Client.features.Class1 implements Dev.ZWare.Client.pkg1.pkg5.Class2 {
   // $VF: renamed from: f int
   private static final int field_1044 = 8;
   // $VF: renamed from: g java.util.List
   private final List<Dev.ZWare.Client.features.pkg2.Class1> field_1045 = new ArrayList<>();
   // $VF: renamed from: h java.lang.String
   private String field_1046 = "<ZWare>";
   // $VF: renamed from: i java.lang.String
   private String field_1047 = ".";

   public Class23() {
      super("Command");
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class8());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class6());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class2());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class11());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class10());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class4());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class5());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class1());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class9());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class9("default"));
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class3());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class7());
      this.field_1045.add(new Dev.ZWare.Client.features.pkg2.pkg1.Class12());
   }

   // $VF: renamed from: a (java.lang.String[], int) java.lang.String[]
   public static String[] method_1612(String[] input, int indexToDelete) {
      LinkedList var2 = new LinkedList();

      for (int var3 = 0; var3 < input.length; var3++) {
         if (var3 != indexToDelete) {
            var2.add(input[var3]);
         }
      }

      return var2.toArray(String[]::new);
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   private static String method_1613(String var0, String var1) {
      return var0.startsWith(var1) && var0.endsWith(var1) ? var0.substring(var1.length(), var0.length() - var1.length()) : var0;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_1614(String command) {
      String[] var2 = command.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
      String var3 = var2[0].substring(1);
      String[] var4 = method_1612(var2, 0);

      for (int var5 = 0; var5 < var4.length; var5++) {
         if (var4[var5] != null) {
            var4[var5] = method_1613(var4[var5], "\"");
         }
      }

      for (Dev.ZWare.Client.features.pkg2.Class1 var6 : this.field_1045) {
         if (var6.method_1555().equalsIgnoreCase(var3)) {
            var6.method_1651(var4);
            return;
         }
      }

      Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1080 + "Command not found, type 'help' for the commands list.");
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.features.pkg2.Class1
   public Dev.ZWare.Client.features.pkg2.Class1 method_1615(String name) {
      for (Dev.ZWare.Client.features.pkg2.Class1 var3 : this.field_1045) {
         if (var3.method_1555().equalsIgnoreCase(name)) {
            return var3;
         }
      }

      return null;
   }

   // $VF: renamed from: b () java.util.List
   public List<Dev.ZWare.Client.features.pkg2.Class1> method_1616() {
      return this.field_1045;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_1617() {
      return this.field_1046;
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_1618(String clientMessage) {
      this.field_1046 = clientMessage;
   }

   // $VF: renamed from: c () java.lang.String
   public String method_1619() {
      return this.field_1047;
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_1620(String prefix) {
      this.field_1047 = prefix;
   }

   // $VF: renamed from: a (java.lang.String) java.util.List
   public List<Class23.Inner1> method_1621(String input) {
      if (input != null && this.field_1047 != null && !this.field_1047.isEmpty() && input.startsWith(this.field_1047)) {
         String var2 = input.substring(this.field_1047.length());
         List var3 = this.method_1629(var2);
         if (var3.isEmpty()) {
            return List.of();
         } else {
            int var4 = var3.size() - 1;
            String var5 = (String)var3.get(var4);
            if (var4 == 0) {
               return this.method_1628(var3, var4, this.method_1630(), var5, true);
            } else {
               String var6 = ((String)var3.getFirst()).toLowerCase(Locale.ROOT);

               return switch (var6) {
                  case "toggle", "bind" -> this.method_1628(var3, var4, this.method_1631(), var5, true);
                  case "friend" -> this.method_1622(var3, var4, var5, true);
                  case "enemy" -> this.method_1622(var3, var4, var5, false);
                  case "config" -> this.method_1623(var3, var4, var5);
                  case "kit" -> this.method_1624(var3, var4, var5);
                  case "module" -> this.method_1625(var3, var4, var5);
                  case "notebot" -> this.method_1626(var3, var4, var5);
                  case "fakeplayer" -> this.method_1627(var3, var4, var5);
                  case "prefix" -> this.method_1628(var3, var4, List.of(".", ";", ","), var5, false);
                  default -> List.of();
               };
            }
         }
      } else {
         return List.of();
      }
   }

   // $VF: renamed from: a (java.util.List, int, java.lang.String, boolean) java.util.List
   private List<Class23.Inner1> method_1622(List<String> var1, int var2, String var3, boolean var4) {
      if (var2 == 1) {
         LinkedHashSet var6 = new LinkedHashSet();
         var6.add("add");
         var6.add("del");
         var6.add("remove");
         var6.add("clear");
         var6.add("reset");
         var6.addAll(var4 ? Dev.ZWare.Client.Class1.field_310.method_380() : Dev.ZWare.Client.Class1.field_311.method_212());
         var6.addAll(this.method_1634());
         return this.method_1628(var1, var2, var6, var3, true);
      } else {
         if (var2 == 2) {
            String var5 = ((String)var1.get(1)).toLowerCase(Locale.ROOT);
            if ("add".equals(var5)) {
               return this.method_1628(var1, var2, this.method_1634(), var3, false);
            }

            if ("del".equals(var5) || "remove".equals(var5)) {
               return this.method_1628(
                  var1, var2, var4 ? Dev.ZWare.Client.Class1.field_310.method_380() : Dev.ZWare.Client.Class1.field_311.method_212(), var3, false
               );
            }
         }

         return List.of();
      }
   }

   // $VF: renamed from: a (java.util.List, int, java.lang.String) java.util.List
   private List<Class23.Inner1> method_1623(List<String> var1, int var2, String var3) {
      if (var2 == 1) {
         return this.method_1628(var1, var2, List.of("save", "load", "list"), var3, true);
      } else {
         if (var2 == 2) {
            String var4 = ((String)var1.get(1)).toLowerCase(Locale.ROOT);
            if ("save".equals(var4) || "load".equals(var4)) {
               return this.method_1628(
                  var1, var2, Dev.ZWare.Client.Class1.field_317 != null ? Dev.ZWare.Client.Class1.field_317.method_176() : List.of(), var3, false
               );
            }
         }

         return List.of();
      }
   }

   // $VF: renamed from: b (java.util.List, int, java.lang.String) java.util.List
   private List<Class23.Inner1> method_1624(List<String> var1, int var2, String var3) {
      if (var2 == 1) {
         return this.method_1628(var1, var2, List.of("save", "load", "delete", "del", "remove", "list"), var3, true);
      } else {
         if (var2 == 2) {
            String var4 = ((String)var1.get(1)).toLowerCase(Locale.ROOT);
            if ("load".equals(var4) || "delete".equals(var4) || "del".equals(var4) || "remove".equals(var4) || "save".equals(var4)) {
               return this.method_1628(
                  var1, var2, Dev.ZWare.Client.Class1.field_312 != null ? Dev.ZWare.Client.Class1.field_312.getKitNames() : List.of(), var3, false
               );
            }
         }

         return List.of();
      }
   }

   // $VF: renamed from: c (java.util.List, int, java.lang.String) java.util.List
   private List<Class23.Inner1> method_1625(List<String> var1, int var2, String var3) {
      if (var2 == 1) {
         return this.method_1628(var1, var2, this.method_1631(), var3, true);
      } else {
         Dev.ZWare.Client.features.pkg1.Class1 var4 = var1.size() > 1 ? Dev.ZWare.Client.Class1.field_316.method_509((String)var1.get(1)) : null;
         if (var2 == 2) {
            return this.method_1628(var1, var2, List.of("set", "reset"), var3, true);
         } else if (var4 == null || var1.size() <= 2 || !"set".equalsIgnoreCase((String)var1.get(2))) {
            return List.of();
         } else if (var2 == 3) {
            return this.method_1628(var1, var2, this.method_1632(var4), var3, true);
         } else if (var2 == 4) {
            Dev.ZWare.Client.features.pkg3.Class8 var5 = var4.a((String)var1.get(3));
            return var5 == null ? List.of() : this.method_1628(var1, var2, this.method_1633(var5), var3, false);
         } else {
            return List.of();
         }
      }
   }

   // $VF: renamed from: d (java.util.List, int, java.lang.String) java.util.List
   private List<Class23.Inner1> method_1626(List<String> var1, int var2, String var3) {
      return var2 == 1
         ? this.method_1628(var1, var2, List.of("load", "preview", "play", "pause", "stop", "random", "list", "folder", "status"), var3, true)
         : List.of();
   }

   // $VF: renamed from: e (java.util.List, int, java.lang.String) java.util.List
   private List<Class23.Inner1> method_1627(List<String> var1, int var2, String var3) {
      if (var2 == 1) {
         return this.method_1628(
            var1, var2, List.of("spawn", "despawn", "name", "copyinventory", "health", "fallspeed", "pop", "fall", "death", "status"), var3, true
         );
      } else {
         return var2 == 2 && var1.size() > 1 && "copyinventory".equalsIgnoreCase((String)var1.get(1))
            ? this.method_1628(var1, var2, List.of("true", "false"), var3, false)
            : List.of();
      }
   }

   // $VF: renamed from: a (java.util.List, int, java.util.Collection, java.lang.String, boolean) java.util.List
   private List<Class23.Inner1> method_1628(List<String> var1, int var2, Collection<String> var3, String var4, boolean var5) {
      if (var3 != null && !var3.isEmpty()) {
         String var6 = var4 == null ? "" : var4.trim();
         ArrayList var7 = new ArrayList();

         for (String var9 : var3.stream().filter(var0 -> var0 != null && !var0.isBlank()).sorted(String.CASE_INSENSITIVE_ORDER).toList()) {
            if (this.method_1635(var9, var6)) {
               ArrayList var10 = new ArrayList(var1.subList(0, var2));
               var10.add(var9);
               String var11 = this.field_1047 + String.join(" ", var10);
               if (var5) {
                  var11 = var11 + " ";
               }

               var7.add(new Class23.Inner1(var9, var11));
               if (var7.size() >= 8) {
                  break;
               }
            }
         }

         return var7;
      } else {
         return List.of();
      }
   }

   // $VF: renamed from: b (java.lang.String) java.util.List
   private List<String> method_1629(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         String var2 = var1.stripLeading();
         if (var2.isEmpty()) {
            return new ArrayList<>(List.of(""));
         } else {
            ArrayList var3 = new ArrayList<>(List.of(var2.split("\\s+")));
            if (Character.isWhitespace(var1.charAt(var1.length() - 1))) {
               var3.add("");
            }

            return var3;
         }
      } else {
         return new ArrayList<>(List.of(""));
      }
   }

   // $VF: renamed from: c () java.util.List
   private List<String> method_1630() {
      return this.field_1045.stream().<String>map(Dev.ZWare.Client.features.pkg2.Class1::a).sorted(String.CASE_INSENSITIVE_ORDER).toList();
   }

   // $VF: renamed from: d () java.util.List
   private List<String> method_1631() {
      return Dev.ZWare.Client.Class1.field_316 == null
         ? List.of()
         : Dev.ZWare.Client.Class1.field_316.field_270.stream().<String>map(Dev.ZWare.Client.features.Class1::a).sorted(String.CASE_INSENSITIVE_ORDER).toList();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.Class1) java.util.List
   private List<String> method_1632(Dev.ZWare.Client.features.pkg1.Class1 var1) {
      return var1.a()
         .stream()
         .filter(Dev.ZWare.Client.features.pkg3.Class8::n)
         .<String>map(Dev.ZWare.Client.features.pkg3.Class8::a)
         .filter(var0 -> !"Enabled".equalsIgnoreCase(var0))
         .sorted(String.CASE_INSENSITIVE_ORDER)
         .toList();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) java.util.List
   private List<String> method_1633(Dev.ZWare.Client.features.pkg3.Class8<?> var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      String var3 = var1.method_691();
      switch (var3) {
         case "Boolean":
            var2.add("true");
            var2.add("false");
            break;
         case "Enum":
            if (var1.method_671() instanceof Enum var18) {
               for (Enum var10 : (Enum[])var18.getClass().getEnumConstants()) {
                  var2.add(var10.name());
               }
            }
            break;
         case "Block":
            if (var1.method_671() instanceof Block var12) {
               var2.add(Registries.field_41175.method_10221(var12).toString());
            }

            if (var1.method_706() instanceof Block var13) {
               var2.add(Registries.field_41175.method_10221(var13).toString());
            }
            break;
         case "Item":
            if (var1.method_671() instanceof Item var5) {
               var2.add(Registries.field_41178.method_10221(var5).toString());
            }

            if (var1.method_706() instanceof Item var11) {
               var2.add(Registries.field_41178.method_10221(var11).toString());
            }
            break;
         default:
            var2.add(var1.method_707());
            if (var1.method_706() != null) {
               var2.add(var1.method_706().toString());
            }

            if (var1.method_708()) {
               if (var1.method_676() != null) {
                  var2.add(var1.method_676().toString());
               }

               if (var1.method_678() != null) {
                  var2.add(var1.method_678().toString());
               }
            }
      }

      return new ArrayList<>(var2);
   }

   // $VF: renamed from: e () java.util.List
   private List<String> method_1634() {
      return c != null && c.field_1687 != null
         ? c.field_1687
            .method_18456()
            .stream()
            .<GameProfile>map(PlayerEntity::method_7334)
            .map(var0 -> var0.getName())
            .filter(var0 -> var0 != null && !var0.isBlank())
            .sorted(Comparator.comparing(String::toLowerCase))
            .toList()
         : List.of();
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) boolean
   private boolean method_1635(String var1, String var2) {
      return var2 != null && !var2.isEmpty() ? var1.regionMatches(true, 0, var2, 0, var2.length()) : true;
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("prefix", this.field_1047);
      return var1;
   }

   @Override
   public void fromJson(JsonElement element) {
      this.method_1620(element.getAsJsonObject().get("prefix").getAsString());
   }

   @Override
   public String getFileName() {
      return "commands.json";
   }

   public record Inner1(String cR, String cS) {
      // $VF: renamed from: cR java.lang.String
      private final String field_814;
      // $VF: renamed from: cS java.lang.String
      private final String field_815;

      public Inner1(String cR, String cS) {
         this.field_814 = cR;
         this.field_815 = cS;
      }

      // $VF: renamed from: cR () java.lang.String
      public String method_1331() {
         return this.field_814;
      }

      // $VF: renamed from: cS () java.lang.String
      public String method_1332() {
         return this.field_815;
      }
   }
}
