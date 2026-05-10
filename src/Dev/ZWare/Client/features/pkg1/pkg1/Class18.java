package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;

public class Class18 extends Dev.ZWare.Client.features.pkg1.Class1 {
   public Class18() {
      super(
         "Anti Screen Close",
         "cancels server close-screen packets for the screen you currently have open",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC,
         true,
         false,
         false
      );
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2642(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g() && var1.method_1045() instanceof CloseScreenS2CPacket var2) {
         if (c.field_1755 instanceof HandledScreen) {
            if (c.field_1724.field_7512 != null && c.field_1724.field_7498 != c.field_1724.field_7512) {
               if (var2.method_36148() == c.field_1724.field_7512.field_7763) {
                  var1.method_1048();
               }
            }
         }
      }
   }
}
