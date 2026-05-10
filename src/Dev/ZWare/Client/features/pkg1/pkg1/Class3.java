package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;

public class Class3 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2519 = this.a("Timeout", 5.0, 1.0, 60.0).method_683("General");
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2520 = this.a("ActionDelay", 3.0, 0.5, 10.0).method_683("General");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2521 = this.a("Swing", true).method_683("Actions");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2522 = this.a("AutoReply", true).method_683("AutoReply");
   // $VF: renamed from: s long
   private long field_2523;
   // $VF: renamed from: t long
   private long field_2524;

   public Class3() {
      super("AntiAFK", "Prevents being kicked for AFK.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2523 = System.currentTimeMillis();
      this.field_2524 = System.currentTimeMillis();
   }

   // $VF: renamed from: h () void
   @Override
   public void method_1892() {
      if (c.field_1724 != null && c.field_1687 != null) {
         for (KeyBinding var4 : c.field_1690.field_1839) {
            if (var4.method_1434()) {
               this.field_2523 = System.currentTimeMillis();
               break;
            }
         }

         if (System.currentTimeMillis() - this.field_2523 > this.field_2519.method_671() * 1000.0
            && System.currentTimeMillis() - this.field_2524 > this.field_2520.method_671() * 1000.0) {
            this.method_3212();
            this.field_2524 = System.currentTimeMillis();
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_3212() {
      if (this.field_2521.method_671()) {
         c.field_1724.method_6104(Hand.field_5808);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   public void method_3213(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 event) {
      if (this.field_2522.method_671()) {
         if (event.method_1045() instanceof GameMessageS2CPacket var2) {
            String var13 = var2.comp_763().getString();
            String var4 = Formatting.method_539(var13);
            if (var4 == null) {
               return;
            }

            if (var4.contains(" whispers: ") || var4.contains(" whispers to you:")) {
               String[] var5 = var4.split(" whispers");
               if (var5.length > 0) {
                  String var6 = var5[0];
                  String[] var7 = var6.split(" ");
                  String var8 = var7[var7.length - 1];
                  long var9 = System.currentTimeMillis() - this.field_2523;
                  if (var9 > this.field_2519.method_671() * 1000.0) {
                     String var11 = "I am currently AFK, nya~ >.<";
                     String var12 = "msg " + var8 + " " + var11;
                     if (c.method_1562() != null) {
                        c.method_1562().method_45730(var12);
                     }
                  }
               }
            }
         }
      }
   }
}
