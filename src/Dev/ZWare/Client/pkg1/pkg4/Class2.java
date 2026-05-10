package Dev.ZWare.Client.pkg1.pkg4;

import java.lang.management.ManagementFactory;

public final class Class2 {
   // $VF: renamed from: a java.lang.String[]
   private static final String[] field_535 = new String[]{"-javaagent", "-agentlib:jdwp", "-xrunjdwp"};

   private Class2() {
   }

   // $VF: renamed from: a () java.lang.String
   public static String method_1019() {
      for (String var1 : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
         String var2 = method_1020(var1);

         for (String var6 : field_535) {
            if (var2.contains(var6)) {
               return "Blocked JVM instrumentation/debug flag.";
            }
         }
      }

      return "";
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private static String method_1020(String var0) {
      return var0 == null ? "" : var0.toLowerCase();
   }
}
