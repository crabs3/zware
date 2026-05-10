package Dev.ZWare.Client.features;

import Dev.ZWare.Client.features.pkg3.Class5;
import Dev.ZWare.Client.features.pkg3.Class8;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;

public class Class1 implements Dev.ZWare.Client.pkg1.pkg5.Class1, Class5 {
   // $VF: renamed from: c net.minecraft.client.MinecraftClient
   public static final MinecraftClient field_1019 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0;
   // $VF: renamed from: d java.util.List
   public List<Class8<?>> field_1020 = new ArrayList<>();
   // $VF: renamed from: e java.lang.String
   private String field_1021;

   public Class1() {
   }

   public Class1(String name) {
      this.field_1021 = name;
   }

   // $VF: renamed from: f () boolean
   public static boolean method_1553() {
      return field_1019.field_1724 == null;
   }

   // $VF: renamed from: g () boolean
   public static boolean method_1554() {
      return field_1019.field_1724 == null || field_1019.field_1687 == null;
   }

   // $VF: renamed from: a () java.lang.String
   public String method_1555() {
      return this.field_1021;
   }

   // $VF: renamed from: a () java.util.List
   public List<Class8<?>> method_1556() {
      return this.field_1020;
   }

   // $VF: renamed from: h () boolean
   public boolean method_1557() {
      return !this.field_1020.isEmpty();
   }

   // $VF: renamed from: i () boolean
   public boolean method_1558() {
      return false;
   }

   // $VF: renamed from: j () boolean
   public boolean method_1559() {
      return !this.method_1558();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) Dev.ZWare.Client.features.pkg3.Class8
   @Override
   public <T extends Class8<?>> T method_2(T setting) {
      setting.method_684(this);
      this.field_1020.add(setting);
      return (T)setting;
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.features.pkg3.Class8
   public Class8<?> method_1560(String name) {
      for (Class8 var3 : this.field_1020) {
         if (var3.method_670().equalsIgnoreCase(name)) {
            return var3;
         }
      }

      return null;
   }

   // $VF: renamed from: a () void
   public void method_1561() {
      for (Class8 var2 : this.field_1020) {
         var2.method_673();
      }
   }

   // $VF: renamed from: b () void
   public void method_1562() {
      this.field_1020 = new ArrayList<>();
   }
}
