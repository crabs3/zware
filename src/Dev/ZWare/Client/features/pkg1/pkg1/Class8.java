package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.client.gui.screen.DeathScreen;

public class Class8 extends Dev.ZWare.Client.features.pkg1.Class1 {
   public Class8() {
      super("Auto Respawn", "Automatically respawns you after death.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3791(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.field_1755 != null) {
         if (c.field_1755 instanceof DeathScreen) {
            c.field_1724.method_7331();
            c.method_1507(null);
         }
      }
   }
}
