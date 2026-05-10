package Dev.ZWare.Client.pkg1.pkg4;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.time.Instant;
import java.util.Base64;

public final class Class1 {
   private Class1() {
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) Dev.ZWare.Client.pkg1.pkg4.Class1$Inner1
   public static Class1.Inner1 method_231(String token, String publicKeyPem) throws Exception {
      if (token == null || token.isBlank()) {
         throw new IllegalArgumentException("Missing session token.");
      } else if (publicKeyPem != null && !publicKeyPem.isBlank()) {
         String[] var2 = token.split("\\.");
         if (var2.length != 2) {
            throw new IllegalArgumentException("Invalid token format.");
         } else {
            byte[] var3 = Base64.getUrlDecoder().decode(var2[0]);
            byte[] var4 = Base64.getUrlDecoder().decode(var2[1]);
            Signature var5 = Signature.getInstance("SHA256withECDSA");
            var5.initVerify(method_232(publicKeyPem));
            var5.update(var3);
            if (!var5.verify(var4)) {
               throw new IllegalArgumentException("Invalid session signature.");
            } else {
               JsonObject var6 = JsonParser.parseString(new String(var3, StandardCharsets.UTF_8)).getAsJsonObject();
               long var7 = method_234(var6, "iat");
               long var9 = method_234(var6, "exp");
               if (var9 > 0L && Instant.now().getEpochSecond() >= var9) {
                  throw new IllegalArgumentException("Session token expired.");
               } else {
                  return new Class1.Inner1(method_233(var6, "sub"), method_233(var6, "hwid"), var7, var9);
               }
            }
         }
      } else {
         throw new IllegalArgumentException("Missing auth public key.");
      }
   }

   // $VF: renamed from: a (java.lang.String) java.security.PublicKey
   private static PublicKey method_232(String var0) throws Exception {
      String var1 = var0.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\\s+", "");
      byte[] var2 = Base64.getDecoder().decode(var1);
      X509EncodedKeySpec var3 = new X509EncodedKeySpec(var2);
      return KeyFactory.getInstance("EC").generatePublic(var3);
   }

   // $VF: renamed from: a (com.google.gson.JsonObject, java.lang.String) java.lang.String
   private static String method_233(JsonObject var0, String var1) {
      return var0.has(var1) && !var0.get(var1).isJsonNull() ? var0.get(var1).getAsString() : "";
   }

   // $VF: renamed from: a (com.google.gson.JsonObject, java.lang.String) long
   private static long method_234(JsonObject var0, String var1) {
      return var0.has(var1) && !var0.get(var1).isJsonNull() ? var0.get(var1).getAsLong() : 0L;
   }

   public record Inner1(String db, String dc, long dd, long de) {
      // $VF: renamed from: db java.lang.String
      private final String field_742;
      // $VF: renamed from: dc java.lang.String
      private final String field_743;
      // $VF: renamed from: dd long
      private final long field_744;
      // $VF: renamed from: de long
      private final long field_745;

      public Inner1(String db, String dc, long dd, long de) {
         this.field_742 = db;
         this.field_743 = dc;
         this.field_744 = dd;
         this.field_745 = de;
      }

      // $VF: renamed from: db () java.lang.String
      public String method_1256() {
         return this.field_742;
      }

      // $VF: renamed from: dc () java.lang.String
      public String method_1257() {
         return this.field_743;
      }

      // $VF: renamed from: dd () long
      public long method_1258() {
         return this.field_744;
      }

      // $VF: renamed from: de () long
      public long method_1259() {
         return this.field_745;
      }
   }
}
