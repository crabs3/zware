package Dev.ZWare.Client.features.pkg1.pkg7;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

public class Class14 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F net.minecraft.util.Identifier
   private static final Identifier field_3046 = Identifier.method_60655("oyvey", "textures/gui/logo.png");
   // $VF: renamed from: G float
   private static final float field_3047 = 4.0F;
   // $VF: renamed from: H float
   private static final float field_3048 = 3.0F;
   // $VF: renamed from: I java.lang.String
   private static final String field_3049 = " - ";
   // $VF: renamed from: J java.lang.String
   private static final String field_3050 = "ZWare";
   // $VF: renamed from: K java.lang.String
   private static final String field_3051 = " v2-nightly ";
   // $VF: renamed from: L java.time.format.DateTimeFormatter
   private static final DateTimeFormatter field_3052 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner2> field_3053 = this.a("Mode", Class14.Inner2.Text);
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<String> field_3054 = this.a(
      new Dev.ZWare.Client.features.pkg3.Class8<>("Text", "ZWare", var1 -> this.field_3053.method_671() == Class14.Inner2.Text)
   );
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner1> field_3055 = this.a("VersionMode", Class14.Inner1.GameVersion);
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3056 = this.a("TextLogo", true);
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_3057 = this.a(
      new Dev.ZWare.Client.features.pkg3.Class8<>("LogoScale", 0.6F, 0.02F, 8.0F, var1 -> this.field_3053.method_671() == Class14.Inner2.Logo)
   );
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3058 = this.a("DateTimeColor", new Color(255, 255, 255, 255));
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3059 = this.a("ServerDisplay", true);
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_3060 = this.a(
      new Dev.ZWare.Client.features.pkg3.Class8<>("ServerDisplayScale", 0.65F, 0.5F, 2.5F, var1 -> this.field_3059.method_671())
   );
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3061 = this.a("ServerDisplayColor", new Color(170, 170, 170, 255));
   // $VF: renamed from: V boolean
   private boolean field_3062;
   // $VF: renamed from: W int
   private int field_3063 = 96;
   // $VF: renamed from: X int
   private int field_3064 = 32;

   public Class14() {
      super("Watermark", "Display watermark", 100.0F, 10.0F);
      this.field_3055.method_709(var1 -> this.field_3053.method_671() != Class14.Inner2.Larp);
      this.field_3056.method_709(var1 -> this.field_3053.method_671() == Class14.Inner2.Text);
      this.field_3058.method_709(var1 -> this.field_3053.method_671() == Class14.Inner2.Larp);
   }

   @Override
   public void fromJson(JsonElement element) {
      if (element != null && !element.isJsonNull()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has("LarpColor") && !var2.has("DateTimeColor")) {
            var2.add("DateTimeColor", var2.get("LarpColor").deepCopy());
         }
      }

      super.fromJson(element);
      String var3 = this.field_3054.method_671();
      if (var3 != null) {
         if (var3.equalsIgnoreCase("Fern") || var3.equalsIgnoreCase("Zware")) {
            this.field_3054.method_672("ZWare");
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      if (this.field_3053.method_671() == Class14.Inner2.Logo && this.method_3759()) {
         this.method_3758(e);
      } else {
         this.method_3757(e);
      }
   }

   // $VF: renamed from: c (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   private void method_3757(Dev.ZWare.Client.pkg2.pkg1.Class3 var1) {
      String var2 = this.method_3763();
      String var3 = this.method_3762();
      String var4 = this.method_3768();
      boolean var5 = this.method_3760();
      float var6 = this.method_3771(var2, var3, var4);
      float var7 = this.method_3772(var4);
      float var8 = 0.0F;
      float var9 = 0.0F;
      float var10 = var6;
      float var11 = var7;
      if (var5) {
         this.method_3761();
         var9 = Math.max(8.0F, this.method_3769() + 1.0F);
         var8 = Math.max(1.0F, var9 * this.field_3063 / this.field_3064);
         var10 = var6 + (var8 + 3.0F);
         var11 = Math.max(var7, var9);
      }

      this.b(var10, var11);
      super.method_3643(var1);
      float var12 = this.a(var10);
      float var13 = this.f();
      if (var5) {
         float var14 = var13 + (var11 - var9) / 2.0F;
         var1.method_1053()
            .method_25302(
               RenderLayer::method_62277,
               field_3046,
               Math.round(var12),
               Math.round(var14),
               0.0F,
               0.0F,
               Math.round(var8),
               Math.round(var9),
               this.field_3063,
               this.field_3064,
               this.field_3063,
               this.field_3064
            );
         var12 += var8 + 3.0F;
      }

      float var15 = var13 + (var11 - var7) / 2.0F;
      this.method_3776(var1, var12, var15, var2, var3, var4, var7);
   }

   // $VF: renamed from: d (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   private void method_3758(Dev.ZWare.Client.pkg2.pkg1.Class3 var1) {
      this.method_3761();
      String var2 = this.field_3054.method_671();
      String var3 = this.method_3762();
      String var4 = this.method_3768();
      float var5 = this.field_3057.method_671();
      int var6 = Math.max(1, Math.round(this.field_3063 * var5));
      int var7 = Math.max(1, Math.round(this.field_3064 * var5));
      float var8 = this.method_3771(var2, var3, var4);
      float var9 = this.method_3772(var4);
      float var10 = var6 + 4.0F + var8;
      float var11 = Math.max((float)var7, var9);
      this.b(var10, var11);
      super.method_3643(var1);
      float var12 = this.a(var10);
      float var13 = this.f();
      float var14 = var13 + (var11 - var7) / 2.0F;
      float var15 = var12 + var6 + 4.0F;
      float var16 = var13 + (var11 - var9) / 2.0F;
      var1.method_1053()
         .method_25302(
            RenderLayer::method_62277,
            field_3046,
            Math.round(var12),
            Math.round(var14),
            0.0F,
            0.0F,
            var6,
            var7,
            this.field_3063,
            this.field_3064,
            this.field_3063,
            this.field_3064
         );
      this.method_3776(var1, var15, var16, var2, var3, var4, var9);
   }

   // $VF: renamed from: q () boolean
   private boolean method_3759() {
      return c != null && c.method_1478().method_14486(field_3046).isPresent();
   }

   // $VF: renamed from: r () boolean
   private boolean method_3760() {
      return this.field_3053.method_671() == Class14.Inner2.Text && this.field_3056.method_671() && this.method_3759();
   }

   // $VF: renamed from: p () void
   private void method_3761() {
      if (!this.field_3062 && c != null) {
         this.field_3062 = true;
         Optional var1 = c.method_1478().method_14486(field_3046);
         if (!var1.isEmpty()) {
            try {
               NativeImage var2 = NativeImage.method_4309(((Resource)var1.get()).method_14482());

               try {
                  this.field_3063 = Math.max(1, var2.method_4307());
                  this.field_3064 = Math.max(1, var2.method_4323());
               } catch (Throwable var6) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                     }
                  }

                  throw var6;
               }

               if (var2 != null) {
                  var2.close();
               }
            } catch (IOException var7) {
               Dev.ZWare.Client.Class1.field_294.error("Failed to read watermark logo dimensions.", var7);
            }
         }
      }
   }

   // $VF: renamed from: g () java.lang.String
   private String method_3762() {
      if (this.field_3053.method_671() == Class14.Inner2.Larp) {
         return " v2-nightly " + this.method_3766();
      } else {
         return this.field_3055.method_671() == Class14.Inner1.ModVersion
            ? " v" + Dev.ZWare.Client.Class1.field_291 + "-" + Dev.ZWare.Client.Class1.field_292
            : " " + Dev.ZWare.Client.Class1.field_290;
      }
   }

   // $VF: renamed from: h () java.lang.String
   private String method_3763() {
      if (this.field_3053.method_671() == Class14.Inner2.Larp) {
         return "ZWare";
      } else {
         String var1 = this.field_3054.method_671();
         return var1 == null ? "ZWare" : var1;
      }
   }

   // $VF: renamed from: c () int
   private int method_3764() {
      return Dev.ZWare.Client.Class1.field_296.method_499();
   }

   // $VF: renamed from: d () int
   private int method_3765() {
      return -1;
   }

   // $VF: renamed from: i () java.lang.String
   private String method_3766() {
      return LocalDateTime.now().format(field_3052);
   }

   // $VF: renamed from: e () int
   private int method_3767() {
      return this.field_3058.method_671().getRGB();
   }

   // $VF: renamed from: j () java.lang.String
   private String method_3768() {
      if (!this.field_3059.method_671()) {
         return "";
      } else if (this.n()) {
         return "play.2b2t.org";
      } else if (c == null) {
         return "";
      } else if (c.method_1542()) {
         return Dev.ZWare.Client.pkg1.Class6.method_200("singleplayer");
      } else {
         ServerInfo var1 = c.method_1558();
         return var1 != null && var1.field_3761 != null && !var1.field_3761.isBlank() ? var1.field_3761 : "";
      }
   }

   // $VF: renamed from: n () float
   private float method_3769() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
   }

   // $VF: renamed from: o () float
   private float method_3770() {
      return this.field_3060.method_671();
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) float
   private float method_3771(String var1, String var2, String var3) {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var1 + var2) + this.method_3773(var3);
   }

   // $VF: renamed from: a (java.lang.String) float
   private float method_3772(String var1) {
      return Math.max(this.method_3769(), this.method_3774(var1));
   }

   // $VF: renamed from: b (java.lang.String) float
   private float method_3773(String var1) {
      String var2 = this.method_3775(var1);
      return var2.isEmpty() ? 0.0F : Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var2, this.method_3770());
   }

   // $VF: renamed from: c (java.lang.String) float
   private float method_3774(String var1) {
      String var2 = this.method_3775(var1);
      return var2.isEmpty() ? 0.0F : Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(this.method_3770());
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_3775(String var1) {
      return var1 != null && !var1.isEmpty() ? " - " + var1 : "";
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, float, float, java.lang.String, java.lang.String, java.lang.String, float) void
   private void method_3776(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, float var2, float var3, String var4, String var5, String var6, float var7) {
      float var8 = this.method_3769();
      float var9 = var3 + (var7 - var8) / 2.0F;
      this.b(var1.method_1053(), var4, var2, var9, this.method_3764());
      float var10 = var2 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4);
      if (this.field_3053.method_671() == Class14.Inner2.Larp) {
         String var11 = this.method_3766();
         this.b(var1.method_1053(), " v2-nightly ", var10, var9, -1);
         var10 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(" v2-nightly ");
         this.b(var1.method_1053(), var11, var10, var9, this.method_3767());
         var10 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var11);
      } else {
         this.b(var1.method_1053(), var5, var10, var9, this.method_3765());
         var10 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5);
      }

      String var17 = this.method_3775(var6);
      if (!var17.isEmpty()) {
         float var12 = this.method_3770();
         float var13 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(var12);
         float var14 = var3 + (var7 - var13) / 2.0F;
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(var1.method_1053(), var17, var10, var14, this.field_3061.method_671().getRGB(), var12);
      }
   }

   private static enum Inner1 {
      GameVersion,
      ModVersion;
   }

   private static enum Inner2 {
      Text,
      Logo,
      Larp;
   }
}
