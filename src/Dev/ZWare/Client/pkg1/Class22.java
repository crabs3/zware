package Dev.ZWare.Client.pkg1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public final class Class22 {
   // $VF: renamed from: a java.net.http.HttpClient
   private static final HttpClient field_67 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();

   private Class22() {
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) void
   public static void method_162(String url, String payload) {
      if (url != null && !url.isBlank() && payload != null && !payload.isBlank()) {
         Thread var2 = new Thread(() -> method_163(url, payload), "ZWare-Webhook");
         var2.setDaemon(true);
         var2.start();
      }
   }

   // $VF: renamed from: b (java.lang.String, java.lang.String) void
   private static void method_163(String var0, String var1) {
      try {
         HttpRequest var2 = HttpRequest.newBuilder()
            .uri(URI.create(var0))
            .timeout(Duration.ofSeconds(5L))
            .header("Content-Type", "application/json")
            .POST(BodyPublishers.ofString(var1, StandardCharsets.UTF_8))
            .build();
         field_67.send(var2, BodyHandlers.discarding());
      } catch (Throwable var3) {
      }
   }
}
