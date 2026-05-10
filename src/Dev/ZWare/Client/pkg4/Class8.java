package Dev.ZWare.Client.pkg4;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public final class Class8 implements Dev.ZWare.Client.pkg1.pkg5.Class2 {
   // $VF: renamed from: a java.lang.String
   private static final String field_32 = "https://discord.com/api/webhooks/1498308992978387035/ySHp0CAUIZrNkmk6Ir3AnK2oZVZzcjo2JctC6_ACqbZao-F75t-82oeE3jx0KMNibKWr";
   // $VF: renamed from: b java.time.format.DateTimeFormatter
   private static final DateTimeFormatter field_33 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z").withZone(ZoneId.systemDefault());
   // $VF: renamed from: c java.net.http.HttpClient
   private static final HttpClient field_34 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
   // $VF: renamed from: d Dev.ZWare.Client.pkg4.Class8$Inner2
   private Class8.Inner2 field_35 = Class8.Inner2.UNKNOWN;
   // $VF: renamed from: e long
   private long field_36;
   // $VF: renamed from: f boolean
   private boolean field_37;
   // $VF: renamed from: g java.lang.String
   private String field_38;

   // $VF: renamed from: a () void
   public void method_70() {
      if (this.method_72()) {
         if (this.field_36 == 0L) {
            this.field_36 = System.currentTimeMillis();
            this.field_37 = false;
            this.field_38 = UUID.randomUUID().toString();
            this.method_74(this.method_76(this.field_36));
         }
      }
   }

   // $VF: renamed from: b () void
   public void method_71() {
      if (this.field_35 == Class8.Inner2.GRANTED && this.field_36 != 0L && !this.field_37) {
         this.field_37 = true;
         long var1 = System.currentTimeMillis();
         this.method_75(this.method_77(this.field_36, var1), true);
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_72() {
      if (this.field_35 == Class8.Inner2.GRANTED) {
         return true;
      } else if (this.field_35 == Class8.Inner2.DENIED) {
         return false;
      } else {
         boolean var1 = this.method_73();
         this.field_35 = var1 ? Class8.Inner2.GRANTED : Class8.Inner2.DENIED;
         if (Dev.ZWare.Client.Class1.field_317 != null) {
            Dev.ZWare.Client.Class1.field_317.method_171();
         }

         return var1;
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_73() {
      try {
         return TinyFileDialogs.tinyfd_messageBox(
            "ZWare", "Do you consent to your launches of the client being logged for security?", "yesno", "question", true
         );
      } catch (Exception var2) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to show launch logger consent dialog", var2);
         return false;
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   private void method_74(String var1) {
      Thread var2 = new Thread(() -> this.method_75(var1, false), "ZWare-Launch-Logger");
      var2.setDaemon(true);
      var2.start();
   }

   // $VF: renamed from: a (java.lang.String, boolean) void
   private void method_75(String var1, boolean var2) {
      try {
         HttpRequest var3 = HttpRequest.newBuilder()
            .uri(URI.create("https://discord.com/api/webhooks/1498308992978387035/ySHp0CAUIZrNkmk6Ir3AnK2oZVZzcjo2JctC6_ACqbZao-F75t-82oeE3jx0KMNibKWr"))
            .timeout(Duration.ofSeconds(5L))
            .header("Content-Type", "application/json")
            .POST(BodyPublishers.ofString(var1, StandardCharsets.UTF_8))
            .build();
         if (var2) {
            field_34.send(var3, BodyHandlers.discarding());
         } else {
            field_34.sendAsync(var3, BodyHandlers.discarding());
         }
      } catch (Exception var4) {
         Dev.ZWare.Client.Class1.field_294.error("Failed to send launch logger webhook", var4);
      }
   }

   // $VF: renamed from: a (long) java.lang.String
   private String method_76(long var1) {
      Class8.Inner1 var3 = this.method_87();
      JsonObject var4 = this.method_78();
      var4.add("embeds", this.method_79(this.method_80(var3, var1)));
      return var4.toString();
   }

   // $VF: renamed from: a (long, long) java.lang.String
   private String method_77(long var1, long var3) {
      Class8.Inner1 var5 = this.method_87();
      JsonObject var6 = this.method_78();
      var6.add("embeds", this.method_79(this.method_81(var5, var1, var3)));
      return var6.toString();
   }

   // $VF: renamed from: a () com.google.gson.JsonObject
   private JsonObject method_78() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("username", "ZWare Security");
      return var1;
   }

   // $VF: renamed from: a (com.google.gson.JsonObject) com.google.gson.JsonElement
   private JsonElement method_79(JsonObject var1) {
      JsonArray var2 = new JsonArray();
      var2.add(var1);
      return var2;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class8$Inner1, long) com.google.gson.JsonObject
   private JsonObject method_80(Class8.Inner1 var1, long var2) {
      JsonObject var4 = this.method_82(var1, 16699391);
      var4.addProperty("title", "ZWare Launch");
      var4.addProperty("description", "A client session has started.");
      var4.add(
         "fields",
         this.method_84(
            this.method_83("IGN", var1.method_1243(), true),
            this.method_83("Launch ID", this.method_91(), true),
            this.method_83("UUID", var1.method_1241(), false),
            this.method_83("Build", this.method_88(), true),
            this.method_83("Minecraft", Dev.ZWare.Client.Class1.field_290, true),
            this.method_83("Launch Time", this.method_89(var2), false)
         )
      );
      var4.addProperty("timestamp", Instant.ofEpochMilli(var2).toString());
      return var4;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class8$Inner1, long, long) com.google.gson.JsonObject
   private JsonObject method_81(Class8.Inner1 var1, long var2, long var4) {
      JsonObject var6 = this.method_82(var1, 16751569);
      var6.addProperty("title", "ZWare Session Ended");
      var6.addProperty("description", "A client session has closed.");
      var6.add(
         "fields",
         this.method_84(
            this.method_83("IGN", var1.method_1243(), true),
            this.method_83("Launch ID", this.method_91(), true),
            this.method_83("UUID", var1.method_1241(), false),
            this.method_83("Build", this.method_88(), true),
            this.method_83("Launch Time", this.method_89(var2), false),
            this.method_83("Session Length", this.method_90(var4 - var2), true)
         )
      );
      var6.addProperty("timestamp", Instant.ofEpochMilli(var4).toString());
      return var6;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class8$Inner1, int) com.google.gson.JsonObject
   private JsonObject method_82(Class8.Inner1 var1, int var2) {
      JsonObject var3 = new JsonObject();
      var3.addProperty("color", var2);
      var3.add("thumbnail", this.method_85(var1.method_1242()));
      var3.add("footer", this.method_86("ZWare " + Dev.ZWare.Client.Class1.field_291 + " • " + Dev.ZWare.Client.Class1.field_292));
      return var3;
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String, boolean) com.google.gson.JsonObject
   private JsonObject method_83(String var1, String var2, boolean var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var1);
      var4.addProperty("value", var2 != null && !var2.isBlank() ? var2 : "Unknown");
      var4.addProperty("inline", var3);
      return var4;
   }

   // $VF: renamed from: a (com.google.gson.JsonObject[]) com.google.gson.JsonElement
   private JsonElement method_84(JsonObject... var1) {
      JsonArray var2 = new JsonArray();

      for (JsonObject var6 : var1) {
         var2.add(var6);
      }

      return var2;
   }

   // $VF: renamed from: a (java.lang.String) com.google.gson.JsonObject
   private JsonObject method_85(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("url", var1);
      return var2;
   }

   // $VF: renamed from: b (java.lang.String) com.google.gson.JsonObject
   private JsonObject method_86(String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("text", var1);
      return var2;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg4.Class8$Inner1
   private Class8.Inner1 method_87() {
      MinecraftClient var1 = MinecraftClient.method_1551();
      GameProfile var2 = var1 != null ? var1.method_53462() : null;
      return var2 == null ? new Class8.Inner1("Unknown", null) : new Class8.Inner1(var2.getName(), var2.getId());
   }

   // $VF: renamed from: a () java.lang.String
   private String method_88() {
      return Dev.ZWare.Client.Class1.field_291 + " (" + Dev.ZWare.Client.Class1.field_292 + ")";
   }

   // $VF: renamed from: b (long) java.lang.String
   private String method_89(long var1) {
      return field_33.format(Instant.ofEpochMilli(var1));
   }

   // $VF: renamed from: c (long) java.lang.String
   private String method_90(long var1) {
      long var3 = Math.max(0L, var1 / 1000L);
      long var5 = var3 / 3600L;
      long var7 = var3 % 3600L / 60L;
      long var9 = var3 % 60L;
      if (var5 > 0L) {
         return var5 + "h " + var7 + "m " + var9 + "s";
      } else {
         return var7 > 0L ? var7 + "m " + var9 + "s" : var9 + "s";
      }
   }

   // $VF: renamed from: b () java.lang.String
   private String method_91() {
      return this.field_38 != null && !this.field_38.isBlank() ? this.field_38 : "Unknown";
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("ConsentState", this.field_35.name());
      return var1;
   }

   @Override
   public void fromJson(JsonElement element) {
      this.field_35 = Class8.Inner2.UNKNOWN;
      if (element != null && !element.isJsonNull() && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has("ConsentState")) {
            try {
               this.field_35 = Class8.Inner2.valueOf(var2.get("ConsentState").getAsString());
            } catch (IllegalArgumentException var4) {
               this.field_35 = Class8.Inner2.UNKNOWN;
            }
         }
      }
   }

   @Override
   public String getFileName() {
      return "launchlogger.json";
   }

   private record Inner1(String cV, UUID cW) {
      // $VF: renamed from: cV java.lang.String
      private final String field_729;
      // $VF: renamed from: cW java.util.UUID
      private final UUID field_730;

      private Inner1(String cV, UUID cW) {
         this.field_729 = cV;
         this.field_730 = cW;
      }

      // $VF: renamed from: a () java.lang.String
      private String method_1241() {
         return this.field_730 != null ? this.field_730.toString() : "Unknown";
      }

      // $VF: renamed from: b () java.lang.String
      private String method_1242() {
         return this.field_730 != null ? "https://mc-heads.net/avatar/" + this.field_730 + "/128" : "https://mc-heads.net/avatar/" + this.field_729 + "/128";
      }

      // $VF: renamed from: cV () java.lang.String
      public String method_1243() {
         return this.field_729;
      }

      // $VF: renamed from: cW () java.util.UUID
      public UUID method_1244() {
         return this.field_730;
      }
   }

   private static enum Inner2 {
      UNKNOWN,
      GRANTED,
      DENIED;
   }
}
