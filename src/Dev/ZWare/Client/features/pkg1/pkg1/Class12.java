package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.Locale;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class Class12 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2371 = this.a("Horizontal Speed", 0.2, 0.01, 3.0);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2372 = this.a("Vertical Boost", 0.0, 0.0, 3.0);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2373 = this.a("Vertical Delay Ticks", 1, 0, 10);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2374 = this.a("Open Timeout Ticks", 12, 1, 40);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2375 = this.a("Retry Delay Ticks", 2, 1, 10);
   // $VF: renamed from: t net.minecraft.util.math.BlockPos
   private BlockPos field_2376;
   // $VF: renamed from: u float
   private float field_2377;
   // $VF: renamed from: v boolean
   private boolean field_2378;
   // $VF: renamed from: w boolean
   private boolean field_2379;
   // $VF: renamed from: x boolean
   private boolean field_2380;
   // $VF: renamed from: y int
   private int field_2381;
   // $VF: renamed from: z int
   private int field_2382;
   // $VF: renamed from: A int
   private int field_2383 = -1;
   // $VF: renamed from: B int
   private int field_2384;

   public Class12() {
      super(
         "Shulker Test",
         "opens the shulker under you and launches you forward until it closes",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC,
         true,
         false,
         false
      );
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3026();
      if (!g() && c.field_1761 != null) {
         BlockPos var1 = c.field_1724.method_24515().method_10074();
         BlockState var2 = c.field_1687.method_8320(var1);
         if (!(var2.method_26204() instanceof ShulkerBoxBlock)) {
            Dev.ZWare.Client.features.pkg2.Class1.method_1647("[ShulkerTest] Stand on top of a shulker first.");
            this.k();
         } else {
            this.field_2376 = var1.method_10062();
            this.field_2377 = c.field_1724.method_36454();
            this.method_3023();
         }
      } else {
         this.k();
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3026();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_2378) {
         return "Open";
      } else {
         return this.field_2376 != null ? "Opening" : null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3019(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g() || c.field_1761 == null) {
         this.k();
      } else if (this.field_2376 == null) {
         this.k();
      } else {
         this.field_2381++;
         if (!(c.field_1687.method_8320(this.field_2376).method_26204() instanceof ShulkerBoxBlock)) {
            this.k();
         } else if (this.method_3024()) {
            this.field_2378 = true;
            if (this.field_2383 == -1) {
               this.field_2383 = c.field_1724.field_7512.field_7763;
               this.field_2384 = 0;
            }
         } else if (this.field_2378) {
            this.k();
         } else if (!(c.field_1724.field_7512 instanceof PlayerScreenHandler)) {
            this.k();
         } else if (this.field_2381 > this.field_2374.method_671()) {
            Dev.ZWare.Client.features.pkg2.Class1.method_1647(
               String.format(Locale.ROOT, "[ShulkerTest] Failed to open shulker at %s.", this.field_2376.method_23854())
            );
            this.k();
         } else {
            if (this.field_2381 >= this.field_2382) {
               this.method_3023();
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_3020(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (!g() && this.field_2378 && this.method_3024()) {
         this.method_3022();
         this.field_2384++;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3021(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (this.field_2378 && var1.method_1045() instanceof CloseScreenS2CPacket var2) {
         if (c.field_1755 instanceof HandledScreen) {
            if (this.field_2383 != -1 && var2.method_36148() == this.field_2383) {
               var1.method_1048();
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_3022() {
      Vec3d var1 = c.field_1724.method_18798();
      Vec3d var2 = this.method_3025(this.field_2377);
      Vec3d var3 = new Vec3d(var1.field_1352, 0.0, var1.field_1350);
      if (!this.field_2379) {
         var3 = var3.method_1019(var2.method_1021(this.field_2371.method_671()));
         this.field_2379 = true;
      }

      double var4 = var1.field_1351;
      if (!this.field_2380 && this.field_2384 >= this.field_2373.method_671()) {
         var4 = Math.max(var4 + this.field_2372.method_671(), this.field_2372.method_671());
         this.field_2380 = true;
      }

      c.field_1724.method_18800(var3.field_1352, var4, var3.field_1350);
   }

   // $VF: renamed from: o () void
   private void method_3023() {
      if (c.field_1724 != null && c.field_1761 != null && this.field_2376 != null) {
         BlockHitResult var1 = new BlockHitResult(Vec3d.method_24953(this.field_2376), Direction.field_11036, this.field_2376, false);
         ActionResult var2 = c.field_1761.method_2896(c.field_1724, Hand.field_5808, var1);
         this.field_2382 = this.field_2381 + this.field_2375.method_671();
         if (var2.method_23665()) {
            this.field_2377 = c.field_1724.method_36454();
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_3024() {
      return c.field_1724 != null && c.field_1724.field_7512 instanceof ShulkerBoxScreenHandler && c.field_1755 != null;
   }

   // $VF: renamed from: a (float) net.minecraft.util.math.Vec3d
   private Vec3d method_3025(float var1) {
      double var2 = Math.toRadians(var1);
      double var4 = -Math.sin(var2);
      double var6 = Math.cos(var2);
      return new Vec3d(var4, 0.0, var6);
   }

   // $VF: renamed from: p () void
   private void method_3026() {
      this.field_2376 = null;
      this.field_2378 = false;
      this.field_2379 = false;
      this.field_2380 = false;
      this.field_2381 = 0;
      this.field_2382 = 0;
      this.field_2383 = -1;
      this.field_2384 = 0;
   }
}
