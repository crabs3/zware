package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;

public class Class13 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o byte
   private static final byte field_1799 = 35;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1800 = this.a("Totem Pops", 1, 0, 20);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1801 = this.a("Health", 10.0F, 0.0F, 36.0F);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1802 = this.a("Y Level Disconnect", false);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1803 = this.a("Y Level", 0, -64, 320);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1804 = this.a("Use Illegal Disconnect", false);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1805 = this.a("Auto Disable After Log", false);
   // $VF: renamed from: v java.util.concurrent.atomic.AtomicInteger
   private final AtomicInteger field_1806 = new AtomicInteger();
   // $VF: renamed from: w boolean
   private volatile boolean field_1807;
   // $VF: renamed from: x java.lang.String
   private volatile String field_1808;

   public Class13() {
      super("Auto Disconnect", "do i need to say? Like its in the name bro", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2405();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2405();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return String.valueOf(this.field_1806.get());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2401(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (g()) {
         this.method_2405();
      } else {
         float var2 = c.field_1724.method_6032() + c.field_1724.method_6067();
         if (this.field_1801.method_671() > 0.0F && var2 <= this.field_1801.method_671()) {
            this.method_2403("AutoDisconnect health");
         }

         if (this.field_1802.method_671() && c.field_1724.method_23318() <= this.field_1803.method_671().intValue()) {
            this.method_2403("AutoDisconnect Y level");
         }

         if (this.field_1807) {
            this.method_2404();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2402(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (var1.method_1045() instanceof EntityStatusS2CPacket var2 && var2.method_11470() == 35 && c.field_1687 != null && c.field_1724 != null) {
         Entity var5 = var2.method_11469(c.field_1687);
         if (var5 == c.field_1724) {
            int var4 = this.field_1806.incrementAndGet();
            if (this.field_1800.method_671() > 0 && var4 >= this.field_1800.method_671()) {
               c.execute(() -> this.method_2403("AutoDisconnect totem pops"));
            }
         }
      }
   }

   // $VF: renamed from: b (java.lang.String) void
   private void method_2403(String var1) {
      if (!this.field_1807) {
         this.field_1807 = true;
         this.field_1808 = var1;
      }
   }

   // $VF: renamed from: n () void
   private void method_2404() {
      String var1 = this.field_1808;
      this.method_2405();
      if (var1 != null && !g()) {
         boolean var2 = false;
         if (this.field_1804.method_671()) {
            Dev.ZWare.Client.features.pkg1.pkg1.Class13 var3 = Dev.ZWare.Client.Class1.field_316 != null
               ? Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg1.Class13.class)
               : null;
            if (var3 != null && var3.method_3017(var1)) {
               var2 = true;
            }
         }

         if (!var2) {
            Dev.ZWare.Client.pkg1.Class1.method_69(var1);
            var2 = true;
         }

         if (var2 && this.field_1805.method_671()) {
            this.k();
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2405() {
      this.field_1806.set(0);
      this.field_1807 = false;
      this.field_1808 = null;
   }
}
