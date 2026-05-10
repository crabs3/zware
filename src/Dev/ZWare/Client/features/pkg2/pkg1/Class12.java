package Dev.ZWare.Client.features.pkg2.pkg1;

import net.minecraft.util.Formatting;

public class Class12 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class12() {
      super("help");
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      a("Commands: ", new Object[0]);

      for (Dev.ZWare.Client.features.pkg2.Class1 var3 : Dev.ZWare.Client.Class1.field_309.method_1616()) {
         StringBuilder var4 = new StringBuilder(Formatting.field_1080.toString());
         var4.append(Dev.ZWare.Client.Class1.field_309.method_1619());
         var4.append(var3.method_1555());
         var4.append(" ");

         for (String var8 : var3.method_1652()) {
            var4.append(var8);
            var4.append(" ");
         }

         a(var4.toString(), new Object[0]);
      }
   }
}
