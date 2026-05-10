package Dev.ZWare.Client.features.pkg2.pkg1;

public class Class9 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class9() {
      this("defaults");
   }

   public Class9(String name) {
      super(name);
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (Dev.ZWare.Client.Class1.field_317 == null) {
         a("Config manager is not available.", new Object[0]);
      } else {
         if (Dev.ZWare.Client.Class1.field_317.method_175()) {
            a("Loaded bundled default config.", new Object[0]);
         } else {
            a("Failed to load bundled default config.", new Object[0]);
         }
      }
   }
}
