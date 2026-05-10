package Dev.ZWare.Client.features.pkg2.pkg1;

public class Class7 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class7() {
      super("fakeplayer", new String[]{"<spawn/despawn/name/copyinventory/health/fallspeed/pop/fall/death/status>", "<value>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      Dev.ZWare.Client.pkg4.Class3 var2 = Dev.ZWare.Client.Class1.field_303;
      if (var2 == null) {
         a("FakePlayer manager is not available.", new Object[0]);
      } else if (commands.length == 0) {
         a(
            "Usage: %sfakeplayer spawn, %sfakeplayer despawn, %sfakeplayer name <name>, %sfakeplayer copyinventory <true/false>, %sfakeplayer health <1-100>, %sfakeplayer fallspeed <0.05-5>, %sfakeplayer pop, %sfakeplayer fall, %sfakeplayer death, %sfakeplayer status",
            new Object[]{
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619()
            }
         );
      } else {
         String var3 = commands[0].toLowerCase();
         switch (var3) {
            case "spawn":
               if (commands.length >= 2) {
                  var2.method_1595(commands[1]);
               }

               if (var2.method_1604()) {
                  a("Spawned fake player %s.", new Object[]{var2.method_1594()});
               }
               break;
            case "despawn":
            case "remove":
               var2.method_1605();
               a("Despawned fake player.", new Object[0]);
               break;
            case "name":
               if (commands.length < 2) {
                  a("Usage: %sfakeplayer name <name>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
                  return;
               }

               var2.method_1595(commands[1]);
               a("Fake player name set to %s.", new Object[]{var2.method_1594()});
               break;
            case "copyinventory":
               if (commands.length < 2) {
                  a("Usage: %sfakeplayer copyinventory <true/false>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
                  return;
               }

               boolean var10 = Boolean.parseBoolean(commands[1]);
               var2.method_1597(var10);
               a("Fake player copyInventory set to %s.", new Object[]{var10});
               break;
            case "health":
               if (commands.length < 2) {
                  a("Usage: %sfakeplayer health <1-100>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
                  return;
               }

               try {
                  int var9 = Integer.parseInt(commands[1]);
                  var2.method_1599(var9);
                  a("Fake player health set to %s.", new Object[]{var2.method_1598()});
               } catch (NumberFormatException var8) {
                  a("Health must be a number.", new Object[0]);
               }
               break;
            case "fallspeed":
               if (commands.length < 2) {
                  a("Usage: %sfakeplayer fallspeed <0.05-5>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
                  return;
               }

               try {
                  double var5 = Double.parseDouble(commands[1]);
                  var2.method_1601(var5);
                  a("Fake player fallSpeed set to %s.", new Object[]{var2.method_1600()});
               } catch (NumberFormatException var7) {
                  a("FallSpeed must be a number.", new Object[0]);
               }
               break;
            case "pop":
               var2.method_1607();
               break;
            case "fall":
               var2.method_1608();
               break;
            case "death":
               var2.method_1609();
               break;
            case "status":
               a("FakePlayer: %s", new Object[]{var2.method_1603()});
               break;
            default:
               a("Unknown fakeplayer command.", new Object[0]);
         }
      }
   }
}
