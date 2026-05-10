package Dev.ZWare.Client.features.pkg2.pkg1;

import Dev.ZWare.Client.pkg1.Class20;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.util.Formatting;

public class Class6 extends Dev.ZWare.Client.features.pkg2.Class1 {
   // $VF: renamed from: h boolean
   private boolean field_1057;
   // $VF: renamed from: i Dev.ZWare.Client.features.pkg1.Class1
   private Dev.ZWare.Client.features.pkg1.Class1 field_1058;

   public Class6() {
      super("bind", new String[]{"<module>"});
      b.a(this);
   }

   // $VF: renamed from: a (java.lang.String[]) void
   @Override
   public void method_1651(String[] commands) {
      if (commands.length == 0) {
         a("Please specify a module.", new Object[0]);
      } else {
         String var2 = commands[0];
         Dev.ZWare.Client.features.pkg1.Class1 var3 = Dev.ZWare.Client.Class1.field_316.method_509(var2);
         if (var3 == null) {
            a("Unknown module '%s'!", new Object[]{var2});
         } else {
            a("{gray} Press a key or mouse button.", new Object[0]);
            this.field_1057 = true;
            this.field_1058 = var3;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class8) void
   @iFT13zrx_wTXP
   private void method_1653(Dev.ZWare.Client.pkg2.pkg1.Class8 var1) {
      if (!f() && this.field_1057) {
         this.field_1057 = false;
         if (var1.method_1044() == 256) {
            a(Formatting.field_1080 + "Operation cancelled.", new Object[0]);
         } else {
            this.method_1655(new Dev.ZWare.Client.features.pkg3.Class4(var1.method_1044()));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class1) void
   @iFT13zrx_wTXP
   private void method_1654(Dev.ZWare.Client.pkg2.pkg1.Class1 var1) {
      if (!f() && this.field_1057 && var1.method_1043() == 1) {
         if (Dev.ZWare.Client.features.pkg3.Class4.method_429(var1.method_1042())) {
            this.method_1655(Dev.ZWare.Client.features.pkg3.Class4.method_428(var1.method_1042()));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class4) void
   private void method_1655(Dev.ZWare.Client.features.pkg3.Class4 var1) {
      this.field_1057 = false;
      String var2 = Class20.method_288(var1.method_430());
      a("Bind for {green} %s {} set to {gray} %s", new Object[]{this.field_1058.a(), var2});
      this.field_1058.method_1913(var1.method_430());
   }
}
