package Dev.ZWare.Client.features.pkg2.pkg1;

import java.util.stream.Collectors;

public class Class10 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class10() {
      super("kit", new String[]{"<save/load/delete/list>", "<name>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (Dev.ZWare.Client.Class1.field_312 == null) {
         a("Kit manager unavailable.", new Object[0]);
      } else if (commands.length == 0) {
         String var4 = Dev.ZWare.Client.Class1.field_312.getLoadedKitName();
         if (var4 != null) {
            a("Loaded kit: {gray}%s", new Object[]{var4});
         } else {
            a("No kit loaded.", new Object[0]);
         }

         a("Usage: kit save/load/delete/list <name>", new Object[0]);
      } else {
         String var2 = commands[0].toLowerCase();
         switch (var2) {
            case "save":
               this.method_1656(commands);
               break;
            case "load":
               this.method_1657(commands);
               break;
            case "delete":
            case "del":
            case "remove":
               this.method_1658(commands);
               break;
            case "list":
               this.method_1659();
               break;
            default:
               a("Unknown kit command.", new Object[0]);
         }
      }
   }

   // $VF: renamed from: b (java.lang.String[]) void
   private void method_1656(String[] var1) {
      if (var1.length < 2) {
         a("Usage: kit save <name>", new Object[0]);
      } else if (g()) {
         a("Join a world before saving kits.", new Object[0]);
      } else {
         String var2 = var1[1];
         boolean var3 = Dev.ZWare.Client.Class1.field_312.hasKit(var2);
         if (!Dev.ZWare.Client.Class1.field_312.saveKit(var2)) {
            a("Failed to save kit.", new Object[0]);
         } else {
            this.method_1660();
            a(var3 ? "Overwrote kit {gray}%s" : "Saved kit {gray}%s", new Object[]{var2});
         }
      }
   }

   // $VF: renamed from: c (java.lang.String[]) void
   private void method_1657(String[] var1) {
      if (var1.length < 2) {
         a("Usage: kit load <name>", new Object[0]);
      } else {
         String var2 = var1[1];
         if (!Dev.ZWare.Client.Class1.field_312.loadKit(var2)) {
            a("Unknown kit {gray}%s", new Object[]{var2});
         } else {
            this.method_1660();
            a("Loaded kit {gray}%s", new Object[]{Dev.ZWare.Client.Class1.field_312.getLoadedKitName()});
         }
      }
   }

   // $VF: renamed from: d (java.lang.String[]) void
   private void method_1658(String[] var1) {
      if (var1.length < 2) {
         a("Usage: kit delete <name>", new Object[0]);
      } else {
         String var2 = var1[1];
         if (!Dev.ZWare.Client.Class1.field_312.deleteKit(var2)) {
            a("Unknown kit {gray}%s", new Object[]{var2});
         } else {
            this.method_1660();
            a("Deleted kit {gray}%s", new Object[]{var2});
         }
      }
   }

   // $VF: renamed from: c () void
   private void method_1659() {
      if (Dev.ZWare.Client.Class1.field_312.getKitNames().isEmpty()) {
         a("No kits saved.", new Object[0]);
      } else {
         String var1 = Dev.ZWare.Client.Class1.field_312.getLoadedKitName();
         String var2 = Dev.ZWare.Client.Class1.field_312
            .getKitNames()
            .stream()
            .map(var1x -> var1 != null && var1.equalsIgnoreCase(var1x) ? var1x + " [loaded]" : var1x)
            .collect(Collectors.joining(", "));
         a("Kits: {gray}%s", new Object[]{var2});
      }
   }

   // $VF: renamed from: d () void
   private void method_1660() {
      if (Dev.ZWare.Client.Class1.field_317 != null) {
         Dev.ZWare.Client.Class1.field_317.method_171();
      }
   }
}
