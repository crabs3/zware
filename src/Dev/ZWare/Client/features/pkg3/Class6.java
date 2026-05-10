package Dev.ZWare.Client.features.pkg3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Class6 extends Class8<Set<String>> {
   // $VF: renamed from: l java.util.List
   private final List<Class6.Inner1> field_354;

   public Class6(String name, List<Class6.Inner1> options, Collection<String> defaults) {
      super(name, method_728(defaults));
      this.field_354 = List.copyOf(options);
   }

   // $VF: renamed from: a (java.lang.String) boolean
   public boolean method_722(String id) {
      return id == null ? false : ((Set)this.a()).contains(method_729(id));
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_723(String id) {
      if (id != null) {
         String var2 = method_729(id);
         LinkedHashSet var3 = new LinkedHashSet((Collection)this.a());
         if (!var3.add(var2)) {
            var3.remove(var2);
         }

         this.a(var3);
      }
   }

   // $VF: renamed from: b () int
   public int method_724() {
      return ((Set)this.a()).size();
   }

   // $VF: renamed from: a () java.util.List
   public List<Class6.Inner1> method_725() {
      return this.field_354;
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public String method_726(String id) {
      String var2 = method_729(id);

      for (Class6.Inner1 var4 : this.field_354) {
         if (var4.method_1320().equals(var2)) {
            return var4.method_1321();
         }
      }

      return var2;
   }

   // $VF: renamed from: f () java.lang.String
   @Override
   public String method_707() {
      return String.join(",", (Iterable<? extends CharSequence>)this.a());
   }

   // $VF: renamed from: a (java.lang.String) java.util.Set
   public static Set<String> method_727(String value) {
      LinkedHashSet var1 = new LinkedHashSet();
      if (value != null && !value.isBlank()) {
         for (String var5 : value.split(",")) {
            String var6 = method_729(var5);
            if (!var6.isEmpty()) {
               var1.add(var6);
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   // $VF: renamed from: a (java.util.Collection) java.util.LinkedHashSet
   private static LinkedHashSet<String> method_728(Collection<String> var0) {
      LinkedHashSet var1 = new LinkedHashSet();
      if (var0 == null) {
         return var1;
      } else {
         for (String var3 : var0) {
            String var4 = method_729(var3);
            if (!var4.isEmpty()) {
               var1.add(var4);
            }
         }

         return var1;
      }
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   private static String method_729(String var0) {
      return var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
   }

   public record Inner1(String cN, String cO) {
      // $VF: renamed from: cN java.lang.String
      private final String field_804;
      // $VF: renamed from: cO java.lang.String
      private final String field_805;

      public Inner1(String cN, String cO) {
         cN = Class6.method_729(cN);
         cO = cO != null && !cO.isBlank() ? cO : cN;
         this.field_804 = cN;
         this.field_805 = cO;
      }

      // $VF: renamed from: cN () java.lang.String
      public String method_1320() {
         return this.field_804;
      }

      // $VF: renamed from: cO () java.lang.String
      public String method_1321() {
         return this.field_805;
      }
   }
}
