package Dev.ZWare.Client.features.pkg2.pkg1;

public class Class11 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class11() {
      super("enemy", new String[]{"<add/del/name/clear>", "<name>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (commands.length != 0) {
         if (commands.length == 1) {
            if (!commands[0].equalsIgnoreCase("reset") && !commands[0].equalsIgnoreCase("clear")) {
               a(commands[0] + (Dev.ZWare.Client.Class1.field_311.method_208(commands[0]) ? " is an enemy." : " isn't an enemy."), new Object[0]);
            } else {
               Dev.ZWare.Client.Class1.field_311.method_212().clear();
               a("Enemies got reset.", new Object[0]);
            }
         } else {
            String var5 = commands[0];
            switch (var5) {
               case "add":
                  Dev.ZWare.Client.Class1.field_310.method_379(commands[1]);
                  Dev.ZWare.Client.Class1.field_311.method_210(commands[1]);
                  a("{red} %s has been marked as an enemy", new Object[]{commands[1]});
                  break;
               case "del":
               case "remove":
                  Dev.ZWare.Client.Class1.field_311.method_211(commands[1]);
                  a("{green} %s is no longer marked as an enemy", new Object[]{commands[1]});
                  break;
               default:
                  a("Unknown Command, try enemy add/del (name)", new Object[0]);
            }
         }
      } else {
         if (Dev.ZWare.Client.Class1.field_311.method_212().isEmpty()) {
            a("Enemy list empty.", new Object[0]);
         } else {
            StringBuilder var2 = new StringBuilder("Enemies: ");

            for (String var4 : Dev.ZWare.Client.Class1.field_311.method_212()) {
               var2.append(var4).append(", ");
            }

            a(var2.toString(), new Object[0]);
         }
      }
   }
}
