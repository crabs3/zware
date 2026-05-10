package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.util.math.Vec3d;

public class Class3 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f int
   private static final int field_1034 = -6969;
   // $VF: renamed from: g double
   private static final double field_1035 = 10.0;
   // $VF: renamed from: h double
   private static final double field_1036 = 0.5;
   // $VF: renamed from: i double
   private static final double field_1037 = 1.0E-4;
   // $VF: renamed from: j java.lang.String
   private String field_1038 = "FakePlayer";
   // $VF: renamed from: k boolean
   private boolean field_1039 = true;
   // $VF: renamed from: l int
   private int field_1040 = 20;
   // $VF: renamed from: m double
   private double field_1041 = 0.5;
   // $VF: renamed from: n Dev.ZWare.Client.pkg1.pkg3.pkg1.Class1
   private Dev.ZWare.Client.pkg1.pkg3.pkg1.Class1 field_1042;
   // $VF: renamed from: o boolean
   private boolean field_1043;

   public Class3() {
      super("FakePlayer");
      b.a(this);
   }

   // $VF: renamed from: b () java.lang.String
   public String method_1594() {
      return this.field_1038;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_1595(String name) {
      if (name != null && !name.isBlank()) {
         this.field_1038 = name.trim();
         if (this.method_1602()) {
            this.method_1604();
         }
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_1596() {
      return this.field_1039;
   }

   // $VF: renamed from: a (boolean) void
   public void method_1597(boolean copyInventory) {
      this.field_1039 = copyInventory;
      if (this.method_1602()) {
         this.method_1604();
      }
   }

   // $VF: renamed from: a () int
   public int method_1598() {
      return this.field_1040;
   }

   // $VF: renamed from: a (int) void
   public void method_1599(int health) {
      this.field_1040 = Math.max(1, Math.min(100, health));
      if (this.field_1042 != null) {
         this.field_1042.method_6033(Math.min(this.field_1040, (int)this.field_1042.method_6063()));
      }
   }

   // $VF: renamed from: a () double
   public double method_1600() {
      return this.field_1041;
   }

   // $VF: renamed from: a (double) void
   public void method_1601(double fallSpeed) {
      this.field_1041 = Math.max(0.05, Math.min(5.0, fallSpeed));
   }

   // $VF: renamed from: b () boolean
   public boolean method_1602() {
      return this.field_1042 != null;
   }

   // $VF: renamed from: c () java.lang.String
   public String method_1603() {
      return this.field_1042 == null
         ? "Not spawned"
         : String.format(
            "%s at %.1f %.1f %.1f%s",
            this.field_1042.method_7334().getName(),
            this.field_1042.method_23317(),
            this.field_1042.method_23318(),
            this.field_1042.method_23321(),
            this.field_1043 ? " [falling]" : ""
         );
   }

   // $VF: renamed from: c () boolean
   public boolean method_1604() {
      if (g()) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("Join a world before spawning a fake player.");
         return false;
      } else {
         this.method_1605();
         Entity var1 = c.field_1687.method_8469(-6969);
         if (var1 != null) {
            c.field_1687.method_2945(-6969, RemovalReason.field_26999);
            var1.method_5650(RemovalReason.field_26999);
         }

         this.field_1042 = new Dev.ZWare.Client.pkg1.pkg3.pkg1.Class1(c.field_1687, c.field_1724, this.field_1038, this.field_1040, this.field_1039);
         this.field_1042.method_3801(-6969);
         this.field_1043 = false;
         return true;
      }
   }

   // $VF: renamed from: c () void
   public void method_1605() {
      if (this.field_1042 == null) {
         this.field_1043 = false;
      } else {
         this.field_1042.method_3802();
         this.field_1042 = null;
         this.field_1043 = false;
      }
   }

   // $VF: renamed from: d () void
   public void method_1606() {
      this.method_1605();
   }

   // $VF: renamed from: e () void
   public void method_1607() {
      if (this.field_1042 == null) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("Spawn the fake player first.");
      } else {
         Dev.ZWare.Client.features.pkg1.pkg5.Class18 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class18.method_2581();
         if (var1 == null) {
            Dev.ZWare.Client.features.pkg2.Class1.method_1647("PopChams is not available.");
         } else {
            var1.method_2585(this.field_1042);
         }
      }
   }

   // $VF: renamed from: f () void
   public void method_1608() {
      if (this.field_1042 == null) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("Spawn the fake player first.");
      } else {
         this.field_1042
            .method_5808(
               this.field_1042.method_23317(),
               this.field_1042.method_23318() + 10.0,
               this.field_1042.method_23321(),
               this.field_1042.method_36454(),
               this.field_1042.method_36455()
            );
         this.field_1042.method_18799(Vec3d.field_1353);
         this.field_1042.method_24830(false);
         this.field_1043 = true;
      }
   }

   // $VF: renamed from: g () void
   public void method_1609() {
      if (this.field_1042 == null) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("Spawn the fake player first.");
      } else {
         Dev.ZWare.Client.features.pkg1.pkg5.Class5 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class5.method_2038();
         if (var1 != null) {
            var1.method_2039(this.field_1042.method_19538());
         }

         this.method_1605();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_1610(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (c.field_1687 == null || c.field_1724 == null) {
         this.method_1605();
      } else if (this.field_1042 != null) {
         if (this.field_1042.method_37908() != c.field_1687 || c.field_1687.method_8469(this.field_1042.method_5628()) != this.field_1042) {
            this.method_1604();
         }

         if (this.field_1043) {
            this.method_1611();
         }
      }
   }

   // $VF: renamed from: h () void
   private void method_1611() {
      if (this.field_1042 == null) {
         this.field_1043 = false;
      } else {
         double var1 = this.field_1041;
         if (var1 <= 0.0) {
            this.field_1042.method_18799(Vec3d.field_1353);
         } else {
            double var3 = this.field_1042.method_23318();
            this.field_1042.method_24830(false);

            while (var1 > 0.0) {
               double var5 = Math.min(var1, 0.5);
               double var7 = this.field_1042.method_23318();
               this.field_1042.method_5784(MovementType.field_6308, new Vec3d(0.0, -var5, 0.0));
               double var9 = var7 - this.field_1042.method_23318();
               if (var9 < var5 - 1.0E-4 || this.field_1042.method_24828()) {
                  break;
               }

               var1 -= var5;
            }

            double var11 = Math.max(0.0, var3 - this.field_1042.method_23318());
            if (!(var11 <= 1.0E-4) && !this.field_1042.method_24828()) {
               this.field_1042.method_18800(0.0, -var11, 0.0);
            } else {
               this.field_1042.method_18799(Vec3d.field_1353);
               this.field_1042.method_24830(true);
               this.field_1043 = false;
            }
         }
      }
   }
}
