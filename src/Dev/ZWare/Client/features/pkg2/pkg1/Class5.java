package Dev.ZWare.Client.features.pkg2.pkg1;

public class Class5 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class5() {
      super("prefix", new String[]{"<char>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (commands.length == 0) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("{green} Current prefix is %s ", Dev.ZWare.Client.Class1.field_309.method_1619());
      } else {
         Dev.ZWare.Client.Class1.field_309.method_1620(commands[0]);
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("Prefix changed to {gray} %s", commands[0]);
      }
   }
}
