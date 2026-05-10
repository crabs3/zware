package Dev.ZWare.Client.pkg1.pkg2.pkg1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

public final class Class6 {
   // $VF: renamed from: a net.minecraft.util.Identifier
   private static final Identifier field_422 = Identifier.method_60655("minecraft", "textures/misc/enchanted_glint_item.png");
   // $VF: renamed from: b net.minecraft.util.Identifier
   public static final Identifier field_423 = Identifier.method_60655("oyvey", "textures/effect/dynamic/chams_image.png");
   // $VF: renamed from: c net.minecraft.client.texture.NativeImageBackedTexture
   private NativeImageBackedTexture field_424;
   // $VF: renamed from: d java.lang.String
   private String field_425;

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient, java.lang.String) boolean
   public boolean method_854(MinecraftClient client, String source) {
      if (client == null) {
         return false;
      } else {
         Class6.Inner2 var3 = method_856(client, source);
         if (var3 == null) {
            return false;
         } else if (Objects.equals(this.field_425, var3.method_1519()) && this.field_424 != null) {
            return false;
         } else {
            this.method_855(client);

            try {
               boolean var7;
               try (InputStream var4 = var3.method_1520().method_1()) {
                  NativeImage var5 = NativeImage.method_4309(var4);
                  NativeImageBackedTexture var6 = new NativeImageBackedTexture(() -> "oyvey_chams_image", var5);
                  var6.method_65924(false);
                  var6.method_4527(true, false);
                  client.method_1531().method_4616(field_423, var6);
                  this.field_424 = var6;
                  this.field_425 = var3.method_1519();
                  var7 = true;
               }

               return var7;
            } catch (IOException var10) {
               Dev.ZWare.Client.Class1.field_294.error("Failed to load chams image {}", var3.method_1519(), var10);
               return false;
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient) void
   public void method_855(MinecraftClient client) {
      if (client != null && this.field_424 != null) {
         client.method_1531().method_4615(field_423);
         this.field_424.close();
      }

      this.field_424 = null;
      this.field_425 = null;
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient, java.lang.String) Dev.ZWare.Client.pkg1.pkg2.pkg1.Class6$Inner2
   private static Class6.Inner2 method_856(MinecraftClient var0, String var1) {
      Class6.Inner2 var2 = method_857(var0, var1);
      return var2 != null ? var2 : method_858(var0, field_422);
   }

   // $VF: renamed from: b (net.minecraft.client.MinecraftClient, java.lang.String) Dev.ZWare.Client.pkg1.pkg2.pkg1.Class6$Inner2
   private static Class6.Inner2 method_857(MinecraftClient var0, String var1) {
      Identifier var2 = method_860(var1);
      if (var2 != null) {
         return method_858(var0, var2);
      } else {
         Class6.Inner2 var3 = method_859(var0, var1);
         if (var3 != null) {
            return var3;
         } else {
            Path var4 = method_861(var0, var1);
            if (var4 != null && Files.isRegularFile(var4)) {
               String var5 = var4.toAbsolutePath().normalize().toString();
               return new Class6.Inner2(var5, () -> Files.newInputStream(var4));
            } else {
               return null;
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient, net.minecraft.util.Identifier) Dev.ZWare.Client.pkg1.pkg2.pkg1.Class6$Inner2
   private static Class6.Inner2 method_858(MinecraftClient var0, Identifier var1) {
      if (var0 != null && var1 != null) {
         Optional var2 = var0.method_1478().method_14486(var1);
         return var2.isEmpty() ? null : new Class6.Inner2(var1.toString(), ((Resource)var2.get())::method_14482);
      } else {
         return null;
      }
   }

   // $VF: renamed from: c (net.minecraft.client.MinecraftClient, java.lang.String) Dev.ZWare.Client.pkg1.pkg2.pkg1.Class6$Inner2
   private static Class6.Inner2 method_859(MinecraftClient var0, String var1) {
      if (var0 != null && var1 != null && !var1.isBlank()) {
         String var2 = var1;
         Identifier var3 = Identifier.method_12829(var1.trim());
         if (var3 != null) {
            if (!"oyvey".equals(var3.method_12836())) {
               return null;
            }

            var2 = var3.method_12832();
            if (var2.startsWith("image/")) {
               var2 = var2.substring("image/".length());
            }
         }

         for (Identifier var5 : Class4.method_399(var2)) {
            Class6.Inner2 var6 = method_858(var0, var5);
            if (var6 != null) {
               return var6;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (java.lang.String) net.minecraft.util.Identifier
   private static Identifier method_860(String var0) {
      if (var0 == null || var0.isBlank()) {
         return null;
      } else if (!var0.contains(":")) {
         return null;
      } else {
         Identifier var1 = Identifier.method_12829(var0);
         return var1 != null ? var1 : Identifier.method_12829(var0.replace(' ', '_'));
      }
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient, java.lang.String) java.nio.file.Path
   private static Path method_861(MinecraftClient var0, String var1) {
      if (var0 != null && var1 != null && !var1.isBlank()) {
         Path var2 = Path.of(var1);
         return var2.isAbsolute() ? var2 : var0.field_1697.toPath().resolve("oyvey").resolve("chams").resolve(var1);
      } else {
         return null;
      }
   }

   @FunctionalInterface
   private interface Inner1 {
      // $VF: renamed from: a () java.io.InputStream
      InputStream method_1() throws IOException;
   }

   private record Inner2(String dU, Class6.Inner1 dV) {
      // $VF: renamed from: dU java.lang.String
      private final String field_988;
      // $VF: renamed from: dV Dev.ZWare.Client.pkg1.pkg2.pkg1.Class6$Inner1
      private final Class6.Inner1 field_989;

      private Inner2(String dU, Class6.Inner1 dV) {
         this.field_988 = dU;
         this.field_989 = dV;
      }

      // $VF: renamed from: dU () java.lang.String
      public String method_1519() {
         return this.field_988;
      }

      // $VF: renamed from: dV () Dev.ZWare.Client.pkg1.pkg2.pkg1.Class6$Inner1
      public Class6.Inner1 method_1520() {
         return this.field_989;
      }
   }
}
