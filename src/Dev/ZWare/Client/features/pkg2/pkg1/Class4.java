package Dev.ZWare.Client.features.pkg2.pkg1;

import com.google.gson.JsonParser;
import net.minecraft.util.Formatting;

public class Class4 extends Dev.ZWare.Client.features.pkg2.Class1 {
   public Class4() {
      super("module", new String[]{"<module>", "<set/reset>", "<setting>", "<value>"});
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (commands.length == 0) {
         a("Modules: ", new Object[0]);

         for (Dev.ZWare.Client.features.pkg1.Class1.Inner1 var12 : Dev.ZWare.Client.Class1.field_316.method_521()) {
            Object var14 = var12.method_1190() + ": ";

            for (Dev.ZWare.Client.features.pkg1.Class1 var7 : Dev.ZWare.Client.Class1.field_316.method_520(var12)) {
               var14 = var14 + (var7.method_1558() ? Formatting.field_1060 : Formatting.field_1061) + var7.a() + Formatting.field_1068 + ", ";
            }

            a((String)var14, new Object[0]);
         }
      } else {
         Dev.ZWare.Client.features.pkg1.Class1 var3 = Dev.ZWare.Client.Class1.field_316.method_517(commands[0]);
         if (var3 == null) {
            var3 = Dev.ZWare.Client.Class1.field_316.method_509(commands[0]);
            if (var3 == null) {
               a("This module doesnt exist.", new Object[0]);
               return;
            }
         }

         if (commands.length == 1) {
            a(var3.method_1907() + " : " + var3.method_1909(), new Object[0]);

            for (Dev.ZWare.Client.features.pkg3.Class8 var13 : var3.a()) {
               a(var13.method_670() + " : " + var13.method_671() + ", " + var13.method_693(), new Object[0]);
            }
         } else if (commands.length == 2) {
            if (commands[1].equalsIgnoreCase("set")) {
               a("Please specify a setting.", new Object[0]);
            } else if (commands[1].equalsIgnoreCase("reset")) {
               for (Dev.ZWare.Client.features.pkg3.Class8 var5 : var3.a()) {
                  var5.method_672(var5.method_706());
               }
            } else {
               a("This command doesnt exist.", new Object[0]);
            }
         } else if (commands.length == 3) {
            a("Please specify a value.", new Object[0]);
         } else {
            Dev.ZWare.Client.features.pkg3.Class8 var2;
            if (commands.length == 4 && (var2 = var3.a(commands[2])) != null) {
               JsonParser var4 = new JsonParser();
               if (var2.method_691().equalsIgnoreCase("String")) {
                  var2.method_672(commands[3]);
                  a("{dark_gray} %s %s has been set to %s.", new Object[]{var3.a(), var2.method_670(), commands[3]});
                  return;
               }

               try {
                  if (var2.method_670().equalsIgnoreCase("Enabled")) {
                     if (commands[3].equalsIgnoreCase("true")) {
                        var3.method_1903();
                     }

                     if (commands[3].equalsIgnoreCase("false")) {
                        var3.method_1904();
                     }
                  }

                  Dev.ZWare.Client.pkg4.Class11.method_169(var3, var2, var4.parse(commands[3]));
               } catch (Exception var8) {
                  a("Bad Value! This setting requires a: %s value.", new Object[]{var2.method_691()});
                  return;
               }

               a("{gray} %s %s has been set tot %s.", new Object[]{var3.a(), var2.method_670(), commands[3]});
            }
         }
      }
   }
}
