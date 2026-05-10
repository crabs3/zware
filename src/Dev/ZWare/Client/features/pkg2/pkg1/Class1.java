package Dev.ZWare.Client.features.pkg2.pkg1;

import java.util.List;

public class Class1 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class1() {
      super("config", new String[]{"<save/load/list>", "<name>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (Dev.ZWare.Client.Class1.field_317 == null) {
         a("Config manager is not available.", new Object[0]);
      } else if (commands.length == 0) {
         a("Current config: %s", new Object[]{Dev.ZWare.Client.Class1.field_317.method_177()});
         a(
            "Usage: %sconfig save <name>, %sconfig load <name>, %sconfig list",
            new Object[]{
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619(),
               Dev.ZWare.Client.Class1.field_309.method_1619()
            }
         );
      } else {
         String var2 = commands[0].toLowerCase();
         switch (var2) {
            case "list":
               this.method_1661();
               break;
            case "save":
               this.method_1662(commands);
               break;
            case "load":
               this.method_1663(commands);
               break;
            default:
               a("Unknown config command. Use save, load, or list.", new Object[0]);
         }
      }
   }

   // $VF: renamed from: c () void
   private void method_1661() {
      List var1 = Dev.ZWare.Client.Class1.field_317.method_176();
      a("Configs: %s", new Object[]{String.join(", ", var1)});
   }

   // $VF: renamed from: b (java.lang.String[]) void
   private void method_1662(String[] var1) {
      if (var1.length < 2) {
         a("Usage: %sconfig save <name>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
      } else {
         if (Dev.ZWare.Client.Class1.field_317.method_173(var1[1])) {
            a("Saved config %s", new Object[]{var1[1]});
         } else {
            a("Failed to save config %s. Use only letters, numbers, '.', '_' or '-'.", new Object[]{var1[1]});
         }
      }
   }

   // $VF: renamed from: c (java.lang.String[]) void
   private void method_1663(String[] var1) {
      if (var1.length < 2) {
         a("Usage: %sconfig load <name>", new Object[]{Dev.ZWare.Client.Class1.field_309.method_1619()});
      } else {
         if (Dev.ZWare.Client.Class1.field_317.method_172(var1[1])) {
            a("Loaded config %s", new Object[]{var1[1]});
         } else {
            a("Failed to load config %s.", new Object[]{var1[1]});
         }
      }
   }
}
