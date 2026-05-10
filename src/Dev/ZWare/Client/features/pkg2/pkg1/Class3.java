package Dev.ZWare.Client.features.pkg2.pkg1;

import java.nio.file.Path;
import java.util.List;

public class Class3 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class3() {
      super("notebot", new String[]{"<load/preview/play/pause/stop/random/list/folder/status>", "<file>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      Dev.ZWare.Client.features.pkg1.pkg1.Class9 var2 = Dev.ZWare.Client.Class1.field_316 != null
         ? Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg1.Class9.class)
         : Dev.ZWare.Client.features.pkg1.pkg1.Class9.method_1960();
      if (var2 == null) {
         a("Notebot module is not available.", new Object[0]);
      } else if (commands.length == 0) {
         a(
            "Usage: %snotebot load <file>, %snotebot preview <file>, %snotebot play, %snotebot pause, %snotebot stop, %snotebot random, %snotebot list, %snotebot folder",
            new Object[]{
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
         a("Status: %s", new Object[]{var2.method_1962()});
      } else {
         String var3 = commands[0].toLowerCase();
         switch (var3) {
            case "load":
               if (commands.length < 2) {
                  a("Usage: %snotebot load <file>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
                  return;
               }

               var2.method_1963(commands[1]);
               break;
            case "preview":
               if (commands.length < 2) {
                  a("Usage: %snotebot preview <file>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
                  return;
               }

               var2.method_1964(commands[1]);
               break;
            case "play":
               var2.method_1965();
               break;
            case "pause":
               var2.method_1966();
               break;
            case "stop":
               var2.method_1967();
               break;
            case "random":
               var2.method_1969();
               break;
            case "list":
               List var6 = var2.method_1970();
               if (var6.isEmpty()) {
                  a("No songs found in %s", new Object[]{Dev.ZWare.Client.features.pkg1.pkg1.Class9.method_1961()});
                  return;
               }

               a("Songs: %s", new Object[]{String.join(", ", var6)});
               break;
            case "folder":
               Path var5 = Dev.ZWare.Client.features.pkg1.pkg1.Class9.method_1961();
               a("Song folder: %s", new Object[]{var5.toAbsolutePath()});
               break;
            case "status":
               a("Status: %s", new Object[]{var2.method_1962()});
               break;
            default:
               a("Unknown notebot command.", new Object[0]);
         }
      }
   }
}
