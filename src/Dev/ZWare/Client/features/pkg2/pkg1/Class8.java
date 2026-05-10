package Dev.ZWare.Client.features.pkg2.pkg1;

public class Class8 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class8() {
      super("toggle", new String[]{"<module>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] var1) {
      if (var1.length >= 1 && var1[0] != null) {
         Dev.ZWare.Client.features.pkg1.Class1 var2 = Dev.ZWare.Client.Class1.field_316.method_509(var1[0]);
         if (var2 == null) {
            this.method_1664();
         } else {
            var2.method_1905();
         }
      } else {
         this.method_1664();
      }
   }

   // $VF: renamed from: c () void
   private void method_1664() {
      a("Module is not found.", new Object[0]);
   }
}
