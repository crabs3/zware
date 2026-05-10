package Dev.ZWare.Client.features.pkg2.pkg1;

public class Class2 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class2() {
      super("friend", new String[]{"<add/del/name/clear>", "<name>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (commands.length != 0) {
         if (commands.length == 1) {
            if (!commands[0].equalsIgnoreCase("reset") && !commands[0].equalsIgnoreCase("clear")) {
               a(commands[0] + (Dev.ZWare.Client.Class1.field_310.method_376(commands[0]) ? " is friended." : " isn't friended."), new Object[0]);
            } else {
               Dev.ZWare.Client.Class1.field_310.method_380().clear();
               a("Friends got reset.", new Object[0]);
            }
         } else {
            if (commands.length >= 2) {
               String var7 = commands[0];
               switch (var7) {
                  case "add":
                     Dev.ZWare.Client.Class1.field_311.method_211(commands[1]);
                     Dev.ZWare.Client.Class1.field_310.method_378(commands[1]);
                     a("{aqua} %s has been friended", new Object[]{commands[1]});
                     return;
                  case "del":
                  case "remove":
                     Dev.ZWare.Client.Class1.field_310.method_379(commands[1]);
                     a("{red} %s has been unfriended", new Object[]{commands[1]});
                     return;
                  default:
                     a("Unknown Command, try friend add/del (name)", new Object[0]);
               }
            }
         }
      } else {
         if (Dev.ZWare.Client.Class1.field_310.method_380().isEmpty()) {
            a("Friend list empty D:.", new Object[0]);
         } else {
            StringBuilder var2 = new StringBuilder("Friends: ");

            for (String var4 : Dev.ZWare.Client.Class1.field_310.method_380()) {
               try {
                  var2.append(var4).append(", ");
               } catch (Exception var6) {
               }
            }

            a(var2.toString(), new Object[0]);
         }
      }
   }
}
