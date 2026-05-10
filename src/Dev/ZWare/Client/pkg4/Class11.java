package Dev.ZWare.Client.pkg4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.joml.Vector2f;

public class Class11 {
   // $VF: renamed from: a java.nio.file.Path
   private static final Path field_70 = FabricLoader.getInstance().getGameDir().resolve("oyvey");
   // $VF: renamed from: b java.nio.file.Path
   private static final Path field_71 = field_70.resolve("configs");
   // $VF: renamed from: c java.nio.file.Path
   private static final Path field_72 = field_70.resolve("current_profile.txt");
   // $VF: renamed from: d java.lang.String
   private static final String field_73 = "default";
   // $VF: renamed from: e java.util.regex.Pattern
   private static final Pattern field_74 = Pattern.compile("[A-Za-z0-9._-]+");
   // $VF: renamed from: f com.google.gson.Gson
   private static final Gson field_75 = new GsonBuilder().setPrettyPrinting().create();
   // $VF: renamed from: g java.util.List
   private final List<Dev.ZWare.Client.pkg1.pkg5.Class2> field_76 = List.of(
      Dev.ZWare.Client.Class1.field_310,
      Dev.ZWare.Client.Class1.field_311,
      Dev.ZWare.Client.Class1.field_312,
      Dev.ZWare.Client.Class1.field_313,
      Dev.ZWare.Client.Class1.field_315,
      Dev.ZWare.Client.Class1.field_316,
      Dev.ZWare.Client.Class1.field_309
   );
   // $VF: renamed from: h java.lang.String
   private String field_77 = "default";

   // $VF: renamed from: a (Dev.ZWare.Client.features.Class1, Dev.ZWare.Client.features.pkg3.Class8, com.google.gson.JsonElement) void
   public static void method_169(Dev.ZWare.Client.features.Class1 feature, Dev.ZWare.Client.features.pkg3.Class8 setting, JsonElement element) {
      if (element != null && !element.isJsonNull()) {
         String var4 = setting.method_691();
         switch (var4) {
            case "Boolean":
               setting.method_672(element.getAsBoolean());
               break;
            case "Double":
               setting.method_672(element.getAsDouble());
               break;
            case "Float":
               setting.method_672(element.getAsFloat());
               break;
            case "Integer":
               setting.method_672(element.getAsInt());
               break;
            case "String":
               String var3 = element.getAsString();
               setting.method_672(var3.replace("_", " "));
               break;
            case "Targets":
               try {
                  setting.method_672(Dev.ZWare.Client.features.pkg3.Class3.method_718(element.getAsString()));
               } catch (Exception var20) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing targets for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "MultiSelect":
               try {
                  setting.method_672(Dev.ZWare.Client.features.pkg3.Class6.method_727(element.getAsString()));
               } catch (Exception var19) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing multi select for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "BlockList":
               try {
                  setting.method_672(Dev.ZWare.Client.features.pkg3.Class7.method_732(element.getAsString()));
               } catch (Exception var18) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing block list for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "ItemList":
               try {
                  setting.method_672(Dev.ZWare.Client.features.pkg3.Class1.method_713(element.getAsString()));
               } catch (Exception var17) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing item list for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "Bind":
               setting.method_672(Dev.ZWare.Client.features.pkg3.Class4.method_435(element));
               break;
            case "Color":
               try {
                  String var24 = element.getAsString();
                  String[] var26 = var24.split(",");
                  if (var26.length == 4) {
                     int var27 = Integer.parseInt(var26[0]);
                     int var28 = Integer.parseInt(var26[1]);
                     int var10 = Integer.parseInt(var26[2]);
                     int var11 = Integer.parseInt(var26[3]);
                     setting.method_672(new Color(var27, var28, var10, var11));
                  }
               } catch (Exception var16) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing color for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "Block":
               try {
                  Identifier var23 = Identifier.method_12829(element.getAsString());
                  if (var23 != null && Registries.field_41175.method_10250(var23)) {
                     setting.method_672((Block)Registries.field_41175.method_63535(var23));
                  }
               } catch (Exception var15) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing block for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "Item":
               try {
                  Identifier var22 = Identifier.method_12829(element.getAsString());
                  if (var22 != null && Registries.field_41178.method_10250(var22)) {
                     setting.method_672((Item)Registries.field_41178.method_63535(var22));
                  }
               } catch (Exception var14) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing item for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "Pos":
               try {
                  String var21 = element.getAsString();
                  String[] var25 = var21.split(",");
                  if (var25.length == 2) {
                     float var8 = Float.parseFloat(var25[0]);
                     float var9 = Float.parseFloat(var25[1]);
                     setting.method_672(new Vector2f(var8, var9));
                  }
               } catch (Exception var13) {
                  Dev.ZWare.Client.Class1.field_294.error("Error parsing position for: {} : {}", feature.method_1555(), setting.method_670());
               }
               break;
            case "Enum":
               try {
                  Dev.ZWare.Client.features.pkg3.Class2 var6 = new Dev.ZWare.Client.features.pkg3.Class2((Class<? extends Enum>)setting.method_671().getClass());
                  Enum var7 = var6.method_3818(element);
                  if (var7 != null) {
                     setting.method_672(var7);
                  }
               } catch (Exception var12) {
               }
               break;
            default:
               Dev.ZWare.Client.Class1.field_294.error("Unknown Setting type for: {} : {}", feature.method_1555(), setting.method_670());
         }
      }
   }

   // $VF: renamed from: a () void
   public void method_170() {
      this.method_180();
      this.method_181();
      String var1 = this.method_184();
      Path var2 = this.method_182(var1);
      if (!Files.isDirectory(var2)) {
         var1 = "default";
         var2 = this.method_182("default");
      }

      this.field_77 = var1;
      boolean var3 = this.method_178(var2);
      if (!var3 && !"default".equalsIgnoreCase(this.field_77)) {
         this.field_77 = "default";
         this.method_178(this.method_182("default"));
      }

      this.method_185();
   }

   // $VF: renamed from: b () void
   public void method_171() {
      this.method_180();
      if (this.method_179(this.method_182(this.field_77))) {
         this.method_185();
      }
   }

   // $VF: renamed from: a (java.lang.String) boolean
   public boolean method_172(String profileName) {
      String var2 = this.method_183(profileName);
      if (var2 == null) {
         return false;
      } else {
         this.method_180();
         Path var3 = this.method_182(var2);
         if (!Files.exists(var3)) {
            return false;
         } else {
            boolean var4 = this.method_178(var3);
            if (var4) {
               this.field_77 = var2;
               this.method_185();
            }

            return var4;
         }
      }
   }

   // $VF: renamed from: b (java.lang.String) boolean
   public boolean method_173(String profileName) {
      String var2 = this.method_183(profileName);
      if (var2 == null) {
         return false;
      } else {
         this.method_180();
         boolean var3 = this.method_179(this.method_182(var2));
         if (var3) {
            this.field_77 = var2;
            this.method_185();
         }

         return var3;
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_174() {
      this.method_180();
      Class17.method_381();
      if (Dev.ZWare.Client.Class1.field_296 != null) {
         Dev.ZWare.Client.Class1.field_296.method_491();
      }

      boolean var1 = this.method_179(this.method_182(this.field_77));
      if (var1) {
         this.method_185();
      }

      return var1;
   }

   // $VF: renamed from: b () boolean
   public boolean method_175() {
      this.method_180();
      Class17.method_381();
      if (Dev.ZWare.Client.Class1.field_296 != null) {
         Dev.ZWare.Client.Class1.field_296.method_491();
      }

      this.field_77 = "default";
      boolean var1 = this.method_179(this.method_182("default"));
      if (var1) {
         this.method_185();
      }

      return var1;
   }

   // $VF: renamed from: a () java.util.List
   public List<String> method_176() {
      this.method_180();
      ArrayList var1 = new ArrayList();
      var1.add("default");
      if (!Files.isDirectory(field_71)) {
         return var1;
      } else {
         try (Stream var2 = Files.list(field_71)) {
            var2.filter(var0 -> Files.isDirectory(var0))
               .map(var0 -> var0.getFileName().toString())
               .filter(var0 -> !"default".equalsIgnoreCase(var0))
               .sorted(String.CASE_INSENSITIVE_ORDER)
               .forEach(var1::add);
         } catch (IOException var7) {
            Dev.ZWare.Client.Class1.field_294.error("Failed to list configs", var7);
         }

         return var1;
      }
   }

   // $VF: renamed from: a () java.lang.String
   public String method_177() {
      return this.field_77;
   }

   // $VF: renamed from: a (java.nio.file.Path) boolean
   private boolean method_178(Path var1) {
      boolean var2 = false;

      for (Dev.ZWare.Client.pkg1.pkg5.Class2 var4 : this.field_76) {
         try {
            Path var5 = var1.resolve(var4.getFileName());
            if (Files.exists(var5)) {
               String var6 = Files.readString(var5);
               var4.fromJson(JsonParser.parseString(var6));
               var2 = true;
            }
         } catch (Throwable var7) {
            Dev.ZWare.Client.Class1.field_294.error("Failed to load config file {}", var4.getFileName(), var7);
         }
      }

      if (var2 && Dev.ZWare.Client.Class1.field_296 != null) {
         Dev.ZWare.Client.Class1.field_296.method_491();
      }

      return var2;
   }

   // $VF: renamed from: b (java.nio.file.Path) boolean
   private boolean method_179(Path var1) {
      boolean var2 = true;

      try {
         Files.createDirectories(var1);
      } catch (IOException var10) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to create config directory {}", var1, var10);
         return false;
      }

      for (Dev.ZWare.Client.pkg1.pkg5.Class2 var4 : this.field_76) {
         try {
            JsonElement var5 = var4.toJson();
            Path var12 = var1.resolve(var4.getFileName());
            Path var7 = var12.resolveSibling(var12.getFileName() + ".tmp");
            Files.writeString(var7, field_75.toJson(var5));

            try {
               Files.move(var7, var12, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            } catch (AtomicMoveNotSupportedException var9) {
               Files.move(var7, var12, StandardCopyOption.REPLACE_EXISTING);
            }
         } catch (Throwable var11) {
            var2 = false;
            if (var11 instanceof IOException var6) {
               Dev.ZWare.Client.Class1.field_294.error("Failed to save config file {}", var4.getFileName(), var6);
            } else {
               Dev.ZWare.Client.Class1.field_294.error("Failed to save config file {}", var4.getFileName(), var11);
            }
         }
      }

      return var2;
   }

   // $VF: renamed from: c () void
   private void method_180() {
      try {
         Files.createDirectories(field_70);
         Files.createDirectories(field_71);
      } catch (IOException var2) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to create config directories", var2);
      }
   }

   // $VF: renamed from: d () void
   private void method_181() {
      Path var1 = this.method_182("default");
      boolean var2 = this.field_76.stream().map(var1x -> var1.resolve(var1x.getFileName())).anyMatch(var0 -> Files.exists(var0));
      if (!var2) {
         Class17.method_381();
         if (!this.method_179(var1)) {
            Dev.ZWare.Client.Class1.field_294.error("Failed to seed bundled default profile");
         }
      }
   }

   // $VF: renamed from: a (java.lang.String) java.nio.file.Path
   private Path method_182(String var1) {
      return "default".equalsIgnoreCase(var1) ? field_70 : field_71.resolve(var1);
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_183(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.trim();
         if (var2.isEmpty()) {
            return null;
         } else if ("default".equalsIgnoreCase(var2)) {
            return "default";
         } else {
            return field_74.matcher(var2).matches() ? var2 : null;
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   private String method_184() {
      try {
         if (!Files.exists(field_72)) {
            return "default";
         } else {
            String var1 = this.method_183(Files.readString(field_72));
            return var1 != null ? var1 : "default";
         }
      } catch (IOException var2) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to read current profile selection", var2);
         return "default";
      }
   }

   // $VF: renamed from: e () void
   private void method_185() {
      try {
         Files.writeString(field_72, this.field_77);
      } catch (IOException var2) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to save current profile selection", var2);
      }
   }
}
