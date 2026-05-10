package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PositionAndOnGround;

public class Class10 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f double
   private double field_1028;
   // $VF: renamed from: g double
   private double field_1029;
   // $VF: renamed from: h double
   private double field_1030;
   // $VF: renamed from: i boolean
   private boolean field_1031;
   // $VF: renamed from: j double
   private double field_1032;

   public Class10() {
      b.a(this);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class17) void
   @iFT13zrx_wTXP
   public void method_1570(Dev.ZWare.Client.pkg2.pkg1.Class17 event) {
      if (event.method_1035() != Dev.ZWare.Client.pkg2.Class2.POST) {
         double var2 = c.field_1724.field_6036 - c.field_1724.method_23318();
         if (!c.field_1724.method_24828() && !(var2 <= 0.0)) {
            this.field_1032 += var2;
         } else {
            this.field_1032 = 0.0;
         }
      }
   }

   // $VF: renamed from: c () void
   public void method_1571() {
      this.field_1028 = c.field_1724.method_23317();
      this.field_1029 = c.field_1724.method_23318();
      this.field_1030 = c.field_1724.method_23321();
      this.field_1031 = c.field_1724.method_24828();
   }

   // $VF: renamed from: d () void
   public void method_1572() {
      c.field_1724.method_5814(this.field_1028, this.field_1029, this.field_1030);
      c.field_1724.method_24830(this.field_1031);
   }

   // $VF: renamed from: a (double, double, double) void
   public void method_1573(double x, double y, double z) {
      c.field_1724.method_5814(x, y, z);
   }

   // $VF: renamed from: a (double, double, double, boolean) void
   public void method_1574(double x, double y, double z, boolean onground) {
      c.field_1724.method_5814(x, y, z);
      c.field_1724.method_24830(onground);
   }

   // $VF: renamed from: a (double, double, double, boolean, boolean, boolean) void
   public void method_1575(double x, double y, double z, boolean onGround, boolean setPos, boolean noLagBack) {
      boolean var10 = c.field_1724.field_5976;
      c.field_1724.field_3944.method_52787(new PositionAndOnGround(x, y, z, onGround, var10));
      if (setPos) {
         c.field_1724.method_5814(x, y, z);
         if (noLagBack) {
            this.method_1571();
         }
      }
   }

   // $VF: renamed from: a () double
   public double method_1576() {
      return this.field_1028;
   }

   // $VF: renamed from: a (double) void
   public void method_1577(double x) {
      this.field_1028 = x;
   }

   // $VF: renamed from: b () double
   public double method_1578() {
      return this.field_1029;
   }

   // $VF: renamed from: b (double) void
   public void method_1579(double y) {
      this.field_1029 = y;
   }

   // $VF: renamed from: c () double
   public double method_1580() {
      return this.field_1030;
   }

   // $VF: renamed from: c (double) void
   public void method_1581(double z) {
      this.field_1030 = z;
   }

   // $VF: renamed from: d () double
   public double method_1582() {
      return this.field_1032;
   }
}
