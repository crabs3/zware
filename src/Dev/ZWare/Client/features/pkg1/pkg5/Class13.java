package Dev.ZWare.Client.features.pkg1.pkg5;

import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class13 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1528 = 2.0;
   // $VF: renamed from: p double
   private static final double field_1529 = 0.35;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg1.pkg5.Class13
   private static Class13 field_1530;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1531 = this.a("View Clip", false).method_683("ViewClip");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1532 = this.a("Distance", 4.0F, 1.0F, 20.0F).method_683("ViewClip");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_1533 = this.a(
         "Freecam Bind", Dev.ZWare.Client.features.pkg3.Class4.method_427()
      )
      .method_683("Freecam");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1534 = this.a("Speed", 0.35F, 0.1F, 2.0F).method_683("Freecam");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1535 = this.a("Smooth", false).method_683("Freecam");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_1536 = this.a(
         "Freelook Bind", Dev.ZWare.Client.features.pkg3.Class4.method_427()
      )
      .method_683("Freelook");
   // $VF: renamed from: x boolean
   private boolean field_1537;
   // $VF: renamed from: y boolean
   private boolean field_1538;
   // $VF: renamed from: z net.minecraft.util.math.Vec3d
   public Vec3d field_1539 = Vec3d.field_1353;
   // $VF: renamed from: A net.minecraft.util.math.Vec3d
   public Vec3d field_1540 = Vec3d.field_1353;
   // $VF: renamed from: B net.minecraft.util.math.Vec3d
   private Vec3d field_1541 = Vec3d.field_1353;
   // $VF: renamed from: C float
   private float field_1542;
   // $VF: renamed from: D float
   private float field_1543;
   // $VF: renamed from: E float
   private float field_1544;
   // $VF: renamed from: F float
   private float field_1545;
   // $VF: renamed from: G float
   private float field_1546;
   // $VF: renamed from: H float
   private float field_1547;
   // $VF: renamed from: I net.minecraft.client.option.Perspective
   private Perspective field_1548;
   // $VF: renamed from: J boolean
   private boolean field_1549;
   // $VF: renamed from: K boolean
   private boolean field_1550;
   // $VF: renamed from: L float
   private float field_1551;
   // $VF: renamed from: M float
   private float field_1552;
   // $VF: renamed from: N net.minecraft.client.option.Perspective
   private Perspective field_1553;

   public Class13() {
      super("Camera Tweaks", "tweaks shit", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      field_1530 = this;
      this.field_1532.method_709(var1 -> this.field_1531.method_671());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class13
   public static Class13 method_2138() {
      return field_1530;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1537 = true;
      this.field_1549 = true;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2152();
      this.method_2164();
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      this.method_2149();
      this.method_2161();
      if (this.field_1538) {
         if (g()) {
            this.method_2152();
         } else if (this.field_1539 == null) {
            this.method_2152();
         } else {
            this.method_2153();
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_1538) {
         return "Freecam";
      } else {
         return this.field_1550 ? "Freelook" : null;
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_2139() {
      return this.d() && this.field_1531.method_671();
   }

   // $VF: renamed from: a () float
   public float method_2140() {
      return this.field_1532.method_671();
   }

   // $VF: renamed from: b () boolean
   public boolean method_2141() {
      return this.d() && this.field_1538 && this.field_1539 != null;
   }

   // $VF: renamed from: a () net.minecraft.util.math.Vec3d
   public Vec3d method_2142() {
      return this.field_1539;
   }

   // $VF: renamed from: b () net.minecraft.util.math.Vec3d
   public Vec3d method_2143() {
      return this.field_1540;
   }

   // $VF: renamed from: b () float
   public float method_2144() {
      return this.field_1542;
   }

   // $VF: renamed from: c () float
   public float method_2145() {
      return this.field_1543;
   }

   // $VF: renamed from: d () float
   public float method_2146() {
      return this.field_1544;
   }

   // $VF: renamed from: e () float
   public float method_2147() {
      return this.field_1545;
   }

   // $VF: renamed from: a (double, double) boolean
   public boolean method_2148(double deltaX, double deltaY) {
      if (!this.method_2141()) {
         return false;
      } else {
         this.field_1542 = MathHelper.method_15393(this.field_1542 + (float)deltaX * 0.15F);
         this.field_1543 = MathHelper.method_15363(this.field_1543 + (float)deltaY * 0.15F, -90.0F, 90.0F);
         return true;
      }
   }

   // $VF: renamed from: n () void
   private void method_2149() {
      if (this.d()) {
         if (c.field_1755 == null) {
            Dev.ZWare.Client.features.pkg3.Class4 var1 = this.field_1533.method_671();
            if (var1.method_432()) {
               this.field_1537 = true;
            } else if (!var1.method_436()) {
               this.field_1537 = true;
            } else if (this.field_1537) {
               this.field_1537 = false;
               this.method_2150();
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2150() {
      if (this.field_1538) {
         this.method_2152();
      } else {
         this.method_2151();
      }
   }

   // $VF: renamed from: p () void
   private void method_2151() {
      if (!g()) {
         Camera var1 = c.field_1773 == null ? null : c.field_1773.method_19418();
         this.field_1539 = var1 != null ? var1.method_19326() : c.field_1724.method_33571();
         this.field_1540 = this.field_1539;
         this.field_1541 = Vec3d.field_1353;
         if (var1 != null && var1.method_19332()) {
            this.field_1542 = var1.method_19330();
            this.field_1543 = var1.method_19329();
         } else {
            this.field_1542 = c.field_1724.method_36454();
            this.field_1543 = c.field_1724.method_36455();
         }

         this.field_1544 = this.field_1542;
         this.field_1545 = this.field_1543;
         this.field_1546 = c.field_1724.method_36454();
         this.field_1547 = c.field_1724.method_36455();
         this.field_1548 = c.field_1690.method_31044();
         this.field_1538 = true;
      }
   }

   // $VF: renamed from: q () void
   private void method_2152() {
      if (c != null && this.field_1548 != null) {
         c.field_1690.method_31043(this.field_1548);
      }

      this.field_1538 = false;
      this.field_1539 = null;
      this.field_1540 = null;
      this.field_1541 = Vec3d.field_1353;
      this.field_1548 = null;
   }

   // $VF: renamed from: r () void
   private void method_2153() {
      if (this.field_1539 != null) {
         this.field_1544 = this.field_1542;
         this.field_1545 = this.field_1543;
         c.field_1724.method_36456(this.field_1546);
         c.field_1724.method_36457(this.field_1547);
         c.field_1724.field_6241 = this.field_1546;
         c.field_1724.field_6283 = this.field_1546;
         double var1 = (c.field_1690.field_1894.method_1434() ? 1.0 : 0.0) - (c.field_1690.field_1881.method_1434() ? 1.0 : 0.0);
         double var3 = (c.field_1690.field_1913.method_1434() ? 1.0 : 0.0) - (c.field_1690.field_1849.method_1434() ? 1.0 : 0.0);
         double var5 = (c.field_1690.field_1903.method_1434() ? 1.0 : 0.0) - (c.field_1690.field_1832.method_1434() ? 1.0 : 0.0);
         double var7 = this.field_1534.method_671().floatValue();
         if (c.field_1690.field_1867.method_1434()) {
            var7 *= 2.0;
         }

         Vec3d var9 = this.method_2154();
         Vec3d var10 = this.method_2155();
         Vec3d var11 = var9.method_1021(var1).method_1019(var10.method_1021(var3)).method_1031(0.0, var5, 0.0);
         if (var11.method_1027() > 1.0E-6) {
            var11 = var11.method_1029().method_1021(var7);
         } else {
            var11 = Vec3d.field_1353;
         }

         if (this.field_1535.method_671()) {
            this.field_1541 = this.field_1541.method_1019(var11.method_1020(this.field_1541).method_1021(0.35));
            if (this.field_1541.method_1027() < 1.0E-6 && var11.method_1027() < 1.0E-6) {
               this.field_1541 = Vec3d.field_1353;
            }

            var11 = this.field_1541;
         } else {
            this.field_1541 = var11;
         }

         this.field_1540 = this.field_1539;
         this.field_1539 = this.field_1539.method_1019(var11);
      }
   }

   // $VF: renamed from: c () net.minecraft.util.math.Vec3d
   private Vec3d method_2154() {
      Camera var1 = c.field_1773 == null ? null : c.field_1773.method_19418();
      return var1 != null && var1.method_19332() ? new Vec3d(var1.method_19335()).method_1029() : Vec3d.method_1030(this.field_1543, this.field_1542);
   }

   // $VF: renamed from: d () net.minecraft.util.math.Vec3d
   private Vec3d method_2155() {
      Camera var1 = c.field_1773 == null ? null : c.field_1773.method_19418();
      if (var1 != null && var1.method_19332()) {
         return new Vec3d(var1.method_35689()).method_1029();
      } else {
         float var2 = this.field_1542 * (float) (Math.PI / 180.0);
         return new Vec3d(Math.cos(var2), 0.0, Math.sin(var2));
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.MovementType) boolean
   public boolean method_2156(MovementType movementType) {
      return this.method_2141() && movementType == MovementType.field_6308;
   }

   // $VF: renamed from: c () boolean
   public boolean method_2157() {
      return this.d() && this.field_1550;
   }

   // $VF: renamed from: f () float
   public float method_2158() {
      return this.field_1551;
   }

   // $VF: renamed from: g () float
   public float method_2159() {
      return this.field_1552;
   }

   // $VF: renamed from: b (double, double) boolean
   public boolean method_2160(double deltaX, double deltaY) {
      if (!this.method_2157()) {
         return false;
      } else {
         this.field_1551 = MathHelper.method_15393(this.field_1551 + (float)deltaX * 0.15F);
         this.field_1552 = MathHelper.method_15363(this.field_1552 + (float)deltaY * 0.15F, -90.0F, 90.0F);
         return true;
      }
   }

   // $VF: renamed from: s () void
   private void method_2161() {
      if (this.d()) {
         if (c.field_1755 == null) {
            Dev.ZWare.Client.features.pkg3.Class4 var1 = this.field_1536.method_671();
            if (var1.method_432()) {
               this.field_1549 = true;
            } else if (!var1.method_436()) {
               this.field_1549 = true;
            } else if (this.field_1549) {
               this.field_1549 = false;
               this.method_2162();
            }
         }
      }
   }

   // $VF: renamed from: t () void
   private void method_2162() {
      if (this.field_1550) {
         this.method_2164();
      } else {
         this.method_2163();
      }
   }

   // $VF: renamed from: u () void
   private void method_2163() {
      if (!g()) {
         if (this.field_1538) {
            this.method_2152();
         }

         this.field_1551 = c.field_1724.method_36454();
         this.field_1552 = c.field_1724.method_36455();
         this.field_1553 = c.field_1690.method_31044();
         if (this.field_1553 != Perspective.field_26665) {
            c.field_1690.method_31043(Perspective.field_26665);
         }

         this.field_1550 = true;
      }
   }

   // $VF: renamed from: v () void
   private void method_2164() {
      if (this.field_1550) {
         if (c != null && this.field_1553 != null && c.field_1690.method_31044() != this.field_1553) {
            c.field_1690.method_31043(this.field_1553);
         } else if (c != null && this.field_1553 == null) {
            c.field_1690.method_31043(Perspective.field_26664);
         }
      }

      this.field_1550 = false;
      this.field_1553 = null;
   }
}
