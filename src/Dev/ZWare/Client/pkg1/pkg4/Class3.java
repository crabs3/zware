package Dev.ZWare.Client.pkg1.pkg4;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public final class Class3 {
   private Class3() {
   }

   // $VF: renamed from: a () java.lang.String
   public static String method_115() {
      ArrayList var0 = new ArrayList();
      method_116(var0, System.getProperty("os.name"));
      method_116(var0, System.getProperty("os.arch"));
      method_116(var0, System.getProperty("user.name"));
      method_116(var0, System.getenv("COMPUTERNAME"));
      method_116(var0, System.getenv("PROCESSOR_IDENTIFIER"));
      method_116(var0, method_117("/etc/machine-id"));
      method_116(var0, method_117("/var/lib/dbus/machine-id"));
      method_116(var0, method_118());
      var0.addAll(method_119());
      return method_120(String.join("|", var0));
   }

   // $VF: renamed from: a (java.util.List, java.lang.String) void
   private static void method_116(List<String> var0, String var1) {
      if (var1 != null && !var1.isBlank()) {
         var0.add(var1.trim());
      }
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private static String method_117(String var0) {
      try {
         Path var1 = Path.of(var0);
         if (Files.isRegularFile(var1)) {
            return Files.readString(var1, StandardCharsets.UTF_8).trim();
         }
      } catch (Exception var2) {
      }

      return "";
   }

   // $VF: renamed from: b () java.lang.String
   private static String method_118() {
      try {
         return InetAddress.getLocalHost().getHostName();
      } catch (Exception var1) {
         return "";
      }
   }

   // $VF: renamed from: a () java.util.List
   private static List<String> method_119() {
      ArrayList var0 = new ArrayList();

      try {
         Enumeration var1 = NetworkInterface.getNetworkInterfaces();
         if (var1 == null) {
            return var0;
         }

         while (var1.hasMoreElements()) {
            NetworkInterface var2 = (NetworkInterface)var1.nextElement();
            if (var2 != null && !var2.isLoopback() && !var2.isVirtual()) {
               byte[] var3 = var2.getHardwareAddress();
               if (var3 != null && var3.length != 0) {
                  StringBuilder var4 = new StringBuilder();

                  for (byte var8 : var3) {
                     if (var4.length() > 0) {
                        var4.append(':');
                     }

                     var4.append(String.format("%02x", var8));
                  }

                  var0.add(var4.toString());
               }
            }
         }
      } catch (Exception var9) {
      }

      Collections.sort(var0);
      return var0;
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   private static String method_120(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         byte[] var2 = var1.digest(var0.getBytes(StandardCharsets.UTF_8));
         StringBuilder var3 = new StringBuilder(var2.length * 2);

         for (byte var7 : var2) {
            var3.append(String.format("%02x", var7));
         }

         return var3.toString();
      } catch (Exception var8) {
         return Integer.toHexString(var0.hashCode());
      }
   }
}
