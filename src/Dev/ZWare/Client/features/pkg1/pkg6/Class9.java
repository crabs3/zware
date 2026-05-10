package Dev.ZWare.Client.features.pkg1.pkg6;

import Dev.ZWare.Client.mixin.Class32;
import Dev.ZWare.Client.pkg2.pkg1.Class16;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerPosition;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerAbilitiesS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Vec3d;

public class Class9 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg6.Class9
   private static Class9 field_2700;
   // $VF: renamed from: p float
   private static final float field_2701 = -6.0F;
   // $VF: renamed from: q float
   private static final float field_2702 = -38.0F;
   // $VF: renamed from: r float
   private static final float field_2703 = 18.0F;
   // $VF: renamed from: s float
   private static final float field_2704 = -24.0F;
   // $VF: renamed from: t float
   private static final float field_2705 = -10.0F;
   // $VF: renamed from: u float
   private static final float field_2706 = -58.0F;
   // $VF: renamed from: v float
   private static final float field_2707 = -30.0F;
   // $VF: renamed from: w float
   private static final float field_2708 = 26.0F;
   // $VF: renamed from: x int
   private static final int field_2709 = 4;
   // $VF: renamed from: y double
   private static final double field_2710 = -0.08;
   // $VF: renamed from: z double
   private static final double field_2711 = 0.05;
   // $VF: renamed from: A double
   private static final double field_2712 = -0.04;
   // $VF: renamed from: B double
   private static final double field_2713 = 0.1;
   // $VF: renamed from: C double
   private static final double field_2714 = 5.0E-4;
   // $VF: renamed from: D double
   private static final double field_2715 = 7.0E-4;
   // $VF: renamed from: E long
   private static final long field_2716 = 5000L;
   // $VF: renamed from: F long
   private static final long field_2717 = 1500L;
   // $VF: renamed from: G long
   private static final long field_2718 = 500L;
   // $VF: renamed from: H long
   private static final long field_2719 = 250L;
   // $VF: renamed from: I long
   private static final long field_2720 = 1000L;
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner2> field_2721 = this.a("Mode", Class9.Inner2.Normal);
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2722 = this.a("MPO", false);
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2723 = this.a("S", false);
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2724 = this.a("N", false);
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2725 = this.a("NS", 0.001, 0.0, 0.005);
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2726 = this.a("NI", 6, 1, 10);
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2727 = this.a("DN", false);
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2728 = this.a("DNT", 6, 1, 10);
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2729 = this.a("DNN", false);
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2730 = this.a("PongFlushMessages", true);
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner3> field_2731 = this.a("PongFlushTrigger", Class9.Inner3.Either);
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2732 = this.a("PongFlushTime", 1, 1, 10);
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2733 = this.a("PongFlushMaxQueued", 2, 1, 20);
   // $VF: renamed from: W Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_2734 = this.a("PongFlushKeepAlive", Class9.Inner1.Queue);
   // $VF: renamed from: X Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_2735 = this.a("PongFlushPong", Class9.Inner1.Queue);
   // $VF: renamed from: Y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_2736 = this.a("PongFlushTeleportConfirm", Class9.Inner1.Queue);
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner4> field_2737 = this.a("PongFlushCorrectionMode", Class9.Inner4.TrackServerAnchor);
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2738 = this.a("SillyGrimRise", 0.06, 0.0, 0.2);
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2739 = this.a("SillyGrimRiseThreshold", 0.18, -0.1, 0.4);
   // $VF: renamed from: ac Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2740 = this.a("SillyGrimRiseInterval", 2, 1, 10);
   // $VF: renamed from: ad Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2741 = this.a("StupidRise", 0.08, 0.0, 0.25);
   // $VF: renamed from: ae Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2742 = this.a("StupidDrop", 0.035, 0.0, 0.25);
   // $VF: renamed from: af Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2743 = this.a("StupidCycleTicks", 4, 3, 8);
   // $VF: renamed from: ag Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2744 = this.a("StupidRefreshMs", 150, 50, 1000);
   // $VF: renamed from: ah Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2745 = this.a("Debug", false);
   // $VF: renamed from: ai Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2746 = this.a("DebugChat", false);
   // $VF: renamed from: aj Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2747 = this.a("DebugSummaryInterval", 20, 1, 200);
   // $VF: renamed from: ak Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2748 = this.a("CustomCancelMoveSend", true);
   // $VF: renamed from: al Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2749 = this.a("CustomCancelVehicleMoveSend", true);
   // $VF: renamed from: am Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2750 = this.a("CustomCancelCommandSend", false);
   // $VF: renamed from: an Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2751 = this.a("CustomCancelTeleportConfirmSend", false);
   // $VF: renamed from: ao Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2752 = this.a("CustomCancelKeepAliveSend", false);
   // $VF: renamed from: ap Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2753 = this.a("CustomCancelPongSend", false);
   // $VF: renamed from: aq Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2754 = this.a("CustomCancelPositionLookReceive", true);
   // $VF: renamed from: ar Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2755 = this.a("CustomCancelVehicleMoveReceive", true);
   // $VF: renamed from: as Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2756 = this.a("CustomCancelExplosionReceive", false);
   // $VF: renamed from: at Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2757 = this.a("CustomCancelAbilitiesReceive", false);
   // $VF: renamed from: au Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2758 = this.a("CustomCancelVelocityReceive", false);
   // $VF: renamed from: av int
   private int field_2759;
   // $VF: renamed from: aw int
   private int field_2760;
   // $VF: renamed from: ax boolean
   private boolean field_2761;
   // $VF: renamed from: ay boolean
   private boolean field_2762;
   // $VF: renamed from: az boolean
   private boolean field_2763;
   // $VF: renamed from: aA boolean
   private boolean field_2764;
   // $VF: renamed from: aB boolean
   private boolean field_2765;
   // $VF: renamed from: aC boolean
   private boolean field_2766;
   // $VF: renamed from: aD boolean
   private boolean field_2767;
   // $VF: renamed from: aE boolean
   private boolean field_2768;
   // $VF: renamed from: aF boolean
   private boolean field_2769;
   // $VF: renamed from: aG boolean
   private boolean field_2770;
   // $VF: renamed from: aH boolean
   private boolean field_2771;
   // $VF: renamed from: aI boolean
   private boolean field_2772;
   // $VF: renamed from: aJ boolean
   private boolean field_2773;
   // $VF: renamed from: aK float
   private float field_2774;
   // $VF: renamed from: aL float
   private float field_2775;
   // $VF: renamed from: aM float
   private float field_2776;
   // $VF: renamed from: aN float
   private float field_2777;
   // $VF: renamed from: aO double
   private double field_2778;
   // $VF: renamed from: aP double
   private double field_2779;
   // $VF: renamed from: aQ double
   private double field_2780;
   // $VF: renamed from: aR double
   private double field_2781;
   // $VF: renamed from: aS double
   private double field_2782;
   // $VF: renamed from: aT double
   private double field_2783;
   // $VF: renamed from: aU double
   private double field_2784;
   // $VF: renamed from: aV double
   private double field_2785;
   // $VF: renamed from: aW double
   private double field_2786;
   // $VF: renamed from: aX long
   private long field_2787;
   // $VF: renamed from: aY long
   private long field_2788;
   // $VF: renamed from: aZ long
   private long field_2789;
   // $VF: renamed from: a0 long
   private long field_2790;
   // $VF: renamed from: a1 long
   private long field_2791;
   // $VF: renamed from: a2 long
   private long field_2792;
   // $VF: renamed from: a3 double
   private double field_2793;
   // $VF: renamed from: a4 double
   private double field_2794;
   // $VF: renamed from: a5 long
   private long field_2795;
   // $VF: renamed from: a6 long
   private long field_2796;
   // $VF: renamed from: a7 long
   private long field_2797;
   // $VF: renamed from: a8 int
   private int field_2798;
   // $VF: renamed from: a9 int
   private int field_2799;
   // $VF: renamed from: a_ int
   private int field_2800;
   // $VF: renamed from: ba int
   private int field_2801;
   // $VF: renamed from: bb int
   private int field_2802;
   // $VF: renamed from: bc boolean
   private boolean field_2803;
   // $VF: renamed from: bd int
   private int field_2804;
   // $VF: renamed from: be boolean
   private boolean field_2805;
   // $VF: renamed from: bf boolean
   private boolean field_2806;
   // $VF: renamed from: bg int
   private int field_2807;
   // $VF: renamed from: bh boolean
   private boolean field_2808;
   // $VF: renamed from: bi boolean
   private boolean field_2809;
   // $VF: renamed from: bj Dev.ZWare.Client.features.pkg1.pkg6.Class9$Inner2
   private Class9.Inner2 field_2810 = Class9.Inner2.Normal;
   // $VF: renamed from: bk java.util.List
   private final List<Packet<?>> field_2811 = new ArrayList<>();

   public Class9() {
      super("Stop Motion", "Silly stop motion exploits", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, true, false, false);
      field_2700 = this;
      this.field_2722.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.FULL);
      this.field_2723.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.FULL && this.field_2722.method_671());
      this.field_2725.method_709(var1 -> this.field_2724.method_671());
      this.field_2726.method_709(var1 -> this.field_2724.method_671());
      this.field_2728.method_709(var1 -> this.field_2727.method_671());
      this.field_2729.method_709(var1 -> this.field_2727.method_671());
      this.field_2730.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush);
      this.field_2731.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush);
      this.field_2732.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush && this.method_3471());
      this.field_2733.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush && this.method_3472());
      this.field_2734.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush);
      this.field_2735.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush);
      this.field_2736.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush);
      this.field_2737.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.PongFlush);
      this.field_2738.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.SillyGrim);
      this.field_2739.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.SillyGrim);
      this.field_2740.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.SillyGrim);
      this.field_2741.method_709(var1 -> this.method_3437());
      this.field_2742.method_709(var1 -> this.method_3437());
      this.field_2743.method_709(var1 -> this.method_3437());
      this.field_2744.method_709(var1 -> this.method_3437());
      this.field_2746.method_709(var1 -> this.field_2745.method_671());
      this.field_2747.method_709(var1 -> this.field_2745.method_671());
      this.field_2748.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2749.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2750.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2751.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2752.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2753.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2754.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2755.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2756.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2757.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
      this.field_2758.method_709(var1 -> this.field_2721.method_671() == Class9.Inner2.Custom);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class9
   public static Class9 method_3393() {
      return field_2700;
   }

   // $VF: renamed from: a (double, int) float
   public static float method_3394(double verticalSpeed, int phase) {
      if (verticalSpeed < -0.08) {
         return phase == 0 ? -38.0F : -24.0F;
      } else if (verticalSpeed > 0.05) {
         return phase == 0 ? 18.0F : -6.0F;
      } else {
         return phase == 0 ? -24.0F : -6.0F;
      }
   }

   // $VF: renamed from: a () boolean
   public static boolean method_3395() {
      Class9 var0 = field_2700;
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         var0 = Dev.ZWare.Client.Class1.field_316.method_510(Class9.class);
      }

      return var0 != null && var0.d();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg6.Class9$Inner2) void
   public void method_3396(Class9.Inner2 mode) {
      Class9.Inner2 var2 = mode == null ? Class9.Inner2.Normal : mode;
      if (!this.field_2808) {
         this.field_2808 = true;
         this.field_2810 = this.method_3495();
         this.field_2809 = this.e();
         if (this.field_2809) {
            this.h.method_680(true);
            this.e();
            this.method_1887();
            if (this.k && !this.l) {
               b.a(this);
            }
         }
      }

      this.method_3496(var2);
      this.method_3493(2);
   }

   // $VF: renamed from: n () void
   public void method_3397() {
      if (this.field_2808) {
         this.method_3409();
         this.method_3408();
         this.method_3406(false);
         this.method_3496(this.field_2810);
         if (this.field_2809 && this.d()) {
            if (this.k && !this.l) {
               b.b(this);
            }

            this.h.method_680(false);
            this.e();
            this.method_1888();
         }

         this.field_2808 = false;
         this.field_2809 = false;
         this.field_2810 = Class9.Inner2.Normal;
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3407(false);
      this.field_2804 = 0;
      this.field_2805 = false;
      this.field_2806 = false;
      this.method_3480("Activated mode=%s.", this.field_2721.method_671());
      this.method_3476();
      this.method_3477();
      this.method_3478();
      this.method_3479();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3480(
         "Deactivating queue=%d visual=%s server=%s corrections=%d.",
         this.field_2811.size(),
         this.method_3484(this.field_2778, this.field_2779, this.field_2780),
         this.method_3483(),
         this.field_2801
      );
      this.method_3408();
      this.method_3407(true);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3398(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g()) {
         boolean var2 = this.method_3411();
         Entity var4 = this.method_3415();
         this.method_3474(var2, var2);
         if (var2 && var4 != null) {
            if (this.field_2807 > 0) {
               this.field_2807--;
            }

            if (this.field_2721.method_671() != Class9.Inner2.Folia && !this.field_2769) {
               this.method_3431(var4.method_23317(), var4.method_23318(), var4.method_23321());
            }

            this.field_2768 = false;
            this.field_2793 = this.method_3421();
            this.field_2761 = this.field_2760++ % 4 == 0;
            this.field_2762 = this.field_2721.method_671() != Class9.Inner2.FULL
                  && this.field_2721.method_671() != Class9.Inner2.Folia
                  && !this.method_3435()
                  && !this.method_3436()
                  && !this.method_3437()
               ? this.method_3423()
               : false;
            this.method_3425();
            if (this.field_2721.method_671() == Class9.Inner2.Folia || this.method_3435() || this.method_3436() || this.method_3437()) {
               this.field_2763 = false;
            }

            this.field_2764 = this.field_2721.method_671() != Class9.Inner2.Folia && !this.method_3435() && !this.method_3436() && !this.method_3437()
               ? this.method_3424()
               : false;
            if (this.method_3414()) {
               var4.method_18800(0.0, 0.0, 0.0);
               var4.field_6017 = 0.0;
               c.field_1724.method_18800(0.0, 0.0, 0.0);
               c.field_1724.field_6017 = 0.0;
            } else {
               if (this.field_2761) {
                  c.field_1724.method_18800(0.0, c.field_1724.method_18798().field_1351, 0.0);
               } else {
                  c.field_1724.method_18800(0.0, 0.0, 0.0);
               }

               c.field_1724.field_6017 = 0.0;
            }

            this.method_3475();
         } else {
            this.method_3408();
            this.method_3407(true);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3399(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (!g()) {
         if (this.method_3410()
            && this.field_2721.method_671() != Class9.Inner2.Folia
            && this.field_2769
            && !this.field_2762
            && !this.field_2763
            && !this.field_2764) {
            Entity var2 = this.method_3415();
            if (var2 != null) {
               var2.method_5814(this.field_2778, this.field_2779, this.field_2780);
               var2.method_18800(0.0, 0.0, 0.0);
               var2.field_6017 = 0.0;
               if (var2 != c.field_1724) {
                  this.method_3460(var2);
                  c.field_1724.method_18800(0.0, 0.0, 0.0);
                  c.field_1724.field_6017 = 0.0;
               } else {
                  c.field_1724.field_6017 = 0.0;
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class9) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3400(Dev.ZWare.Client.pkg2.pkg1.Class9 var1) {
      if (this.method_3410()) {
         double var2 = 0.0;
         if (this.field_2762) {
            var2 += this.field_2725.method_671();
         }

         if (this.field_2763) {
            var2 += 5.0E-4;
         }

         if (this.field_2764) {
            var2 += 7.0E-4;
         }

         if (var2 > 1.0E-6) {
            float var4 = (float)Math.toRadians(c.field_1724.method_36454());
            double var5 = -Math.sin(var4) * var2;
            double var7 = Math.cos(var4) * var2;
            if (this.field_2761) {
               var1.method_1029(var5, var7);
            } else {
               var1.method_1028(var5, 0.0, var7);
            }
         } else if (this.field_2761) {
            var1.method_1029(0.0, 0.0);
         } else {
            var1.method_1028(0.0, 0.0, 0.0);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3401(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2 var1) {
      if (this.method_3410() && c.field_1724 != null) {
         if (!this.method_3414()) {
            if (this.method_3440()) {
               this.field_2777 = c.field_1724.method_36455();
               this.field_2773 = true;
               this.field_2774 = this.method_3418();
               this.field_2768 = true;
               c.field_1724.method_36457(this.field_2774);
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3402(Class16.Inner1 var1) {
      Packet var2 = var1.method_1045();
      if (this.method_3414() && var2 instanceof VehicleMoveS2CPacket var3) {
         this.field_2801++;
         this.field_2797 = System.currentTimeMillis();
         String var4 = this.method_3484(this.field_2778, this.field_2779, this.field_2780);
         String var5 = this.method_3483();
         this.method_3458(var3);
         if (this.field_2721.method_671() == Class9.Inner2.Folia) {
            this.method_3432(var3.comp_3347().field_1352, var3.comp_3347().field_1351, var3.comp_3347().field_1350);
            this.method_3480(
               "Boat correction accepted visualBefore=%s visualAfter=%s serverBefore=%s serverAfter=%s.",
               var4,
               this.method_3484(this.field_2778, this.field_2779, this.field_2780),
               var5,
               this.method_3483()
            );
            return;
         }

         if (this.field_2721.method_671() == Class9.Inner2.Normal || this.method_3435() || this.method_3437()) {
            this.method_3459(var3, true);
            this.method_3432(var3.comp_3347().field_1352, var3.comp_3347().field_1351, var3.comp_3347().field_1350);
            this.method_3480(
               "Boat correction shadowed mode=%s visual=%s serverBefore=%s serverAfter=%s.", this.field_2721.method_671(), var4, var5, this.method_3483()
            );
            var1.method_1048();
            return;
         }
      }

      if (this.field_2721.method_671() == Class9.Inner2.SillyGrim && this.method_3410() && var2 instanceof PlayerPositionLookS2CPacket var11) {
         this.field_2801++;
         this.field_2797 = System.currentTimeMillis();
         String var15 = this.method_3483();
         this.method_3457(var11);
         this.method_3453(new TeleportConfirmC2SPacket(var11.comp_3133()));
         this.method_3480(
            "SillyGrim correction shadowed tp=%d visual=%s serverBefore=%s serverAfter=%s.",
            var11.comp_3133(),
            this.method_3484(this.field_2778, this.field_2779, this.field_2780),
            var15,
            this.method_3483()
         );
         var1.method_1048();
      } else if (this.field_2721.method_671() == Class9.Inner2.Normal && this.method_3410() && var2 instanceof PlayerPositionLookS2CPacket var10) {
         this.field_2801++;
         this.field_2797 = System.currentTimeMillis();
         String var14 = this.method_3483();
         this.method_3457(var10);
         this.method_3453(new TeleportConfirmC2SPacket(var10.comp_3133()));
         this.method_3480(
            "Normal correction shadowed tp=%d visual=%s serverBefore=%s serverAfter=%s.",
            var10.comp_3133(),
            this.method_3484(this.field_2778, this.field_2779, this.field_2780),
            var14,
            this.method_3483()
         );
         var1.method_1048();
      } else if (this.method_3437() && this.method_3410() && var2 instanceof PlayerPositionLookS2CPacket var9) {
         this.field_2801++;
         this.field_2797 = System.currentTimeMillis();
         String var13 = this.method_3483();
         this.method_3457(var9);
         this.method_3453(new TeleportConfirmC2SPacket(var9.comp_3133()));
         this.method_3480(
            "Stupid correction shadowed tp=%d visual=%s serverBefore=%s serverAfter=%s.",
            var9.comp_3133(),
            this.method_3484(this.field_2778, this.field_2779, this.field_2780),
            var13,
            this.method_3483()
         );
         var1.method_1048();
      } else {
         if (this.field_2721.method_671() == Class9.Inner2.Folia && this.method_3411() && var2 instanceof PlayerPositionLookS2CPacket var7) {
            this.field_2801++;
            this.field_2797 = System.currentTimeMillis();
            this.method_3456(var7);
            this.method_3480("Correction accepted tp=%d visual=%s.", var7.comp_3133(), this.method_3484(this.field_2778, this.field_2779, this.field_2780));
         }

         if (this.method_3435() && this.method_3410() && this.method_3488(var2)) {
            if (var2 instanceof PlayerPositionLookS2CPacket var8) {
               this.field_2801++;
               this.field_2797 = System.currentTimeMillis();
               String var12 = this.method_3484(this.field_2778, this.field_2779, this.field_2780);
               String var16 = this.method_3483();
               Vec3d var6 = this.method_3461(var8, this.method_3462());
               if (this.field_2737.method_671() == Class9.Inner4.Accept) {
                  this.method_3432(var6.field_1352, var6.field_1351, var6.field_1350);
                  this.method_3480(
                     "PongFlush correction accepted tp=%d visualBefore=%s visualAfter=%s serverBefore=%s serverAfter=%s.",
                     var8.comp_3133(),
                     var12,
                     this.method_3484(this.field_2778, this.field_2779, this.field_2780),
                     var16,
                     this.method_3483()
                  );
                  return;
               }

               if (this.field_2737.method_671() == Class9.Inner4.SyncAnchors) {
                  this.method_3432(var6.field_1352, var6.field_1351, var6.field_1350);
                  this.method_3449(var8.comp_3133());
                  this.method_3480(
                     "PongFlush correction synced tp=%d visualBefore=%s visualAfter=%s serverBefore=%s serverAfter=%s queue=%d.",
                     var8.comp_3133(),
                     var12,
                     this.method_3484(this.field_2778, this.field_2779, this.field_2780),
                     var16,
                     this.method_3483(),
                     this.field_2811.size()
                  );
                  var1.method_1048();
                  return;
               }

               if (this.field_2737.method_671() == Class9.Inner4.TrackServerAnchor || this.field_2737.method_671() == Class9.Inner4.Cancel) {
                  this.method_3457(var8);
               }

               this.method_3449(var8.comp_3133());
               this.method_3480(
                  "PongFlush correction canceled tp=%d mode=%s visual=%s serverBefore=%s serverAfter=%s queue=%d.",
                  var8.comp_3133(),
                  this.field_2737.method_671(),
                  var12,
                  var16,
                  this.method_3483(),
                  this.field_2811.size()
               );
            } else if (var2 instanceof VehicleMoveS2CPacket) {
               this.method_3480("PongFlush canceled VehicleMoveS2CPacket queue=%d.", this.field_2811.size());
            }

            var1.method_1048();
         } else if (this.method_3410()) {
            if (this.field_2721.method_671() == Class9.Inner2.FULL) {
               if (!this.field_2722.method_671() || this.method_3490(var2)) {
                  var1.method_1048();
               }
            } else {
               if (this.field_2721.method_671() == Class9.Inner2.Custom && this.method_3492(var2)) {
                  var1.method_1048();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3403(Class16.Inner3 var1) {
      Packet var2 = var1.method_1045();
      if (!this.field_2766) {
         if (this.method_3410()) {
            if (this.field_2721.method_671() == Class9.Inner2.FULL) {
               if (!this.field_2722.method_671() || this.method_3489(var2)) {
                  var1.method_1046();
               }
            } else if (this.field_2721.method_671() == Class9.Inner2.Custom) {
               if (this.method_3491(var2)) {
                  var1.method_1046();
               }
            } else if (!this.method_3435() || !this.method_3447(var1)) {
               if (this.method_3434() && this.method_3446(var2)) {
                  if (!this.field_2765) {
                     var1.method_1046();
                     return;
                  }

                  this.field_2765 = false;
                  this.field_2788 = System.currentTimeMillis() + this.field_2728.method_671().intValue() * 1000L;
                  this.field_2799 = this.field_2728.method_671();
               }

               if (this.method_3414() && var2 instanceof VehicleMoveC2SPacket var5) {
                  this.method_3429(var1, var5);
               } else if (var2 instanceof PlayerMoveC2SPacket var3) {
                  boolean var4 = this.field_2761 && this.method_3433();
                  if (this.field_2721.method_671() == Class9.Inner2.Folia) {
                     this.field_2767 = var4;
                     if (var3.method_36171()) {
                        this.method_3431(
                           var3.method_12269(c.field_1724.method_23317()),
                           var3.method_12268(c.field_1724.method_23318()),
                           var3.method_12274(c.field_1724.method_23321())
                        );
                     }
                  } else {
                     if (var3.method_36171() && (this.field_2762 || this.field_2763 || this.field_2764)) {
                        this.method_3431(
                           var3.method_12269(c.field_1724.method_23317()),
                           var3.method_12268(c.field_1724.method_23318()),
                           var3.method_12274(c.field_1724.method_23321())
                        );
                     }

                     var1.method_1046();
                     this.field_2767 = false;
                     this.method_3428(var3, var4);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3404(Class16.Inner2 var1) {
      Packet var2 = var1.method_1045();
      long var3 = System.currentTimeMillis();
      if (var2 instanceof PlayerMoveC2SPacket) {
         this.field_2795 = var3;
      }

      if (this.method_3487(var2)) {
         this.field_2796 = var3;
      }

      if (!this.field_2766) {
         if (this.field_2767 && this.method_3410()) {
            if (var2 instanceof PlayerMoveC2SPacket) {
               this.field_2767 = false;
               this.method_3454();
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner1) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3405(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner1 var1) {
      if (this.field_2770 && c.field_1724 != null) {
         Class32 var2 = (Class32)c.field_1724;
         var2.setLastXClient(this.field_2784);
         var2.setLastYClient(this.field_2785);
         var2.setLastZClient(this.field_2786);
         var2.setLastYawClient(this.field_2775);
         var2.setLastPitchClient(this.field_2776);
         var2.setLastOnGround(this.field_2771);
         var2.setLastHorizontalCollision(this.field_2772);
         var2.setTicksSinceLastPositionPacketSent(0);
         this.field_2770 = false;
      }

      this.method_3408();
   }

   // $VF: renamed from: a (boolean) void
   private void method_3406(boolean var1) {
      if (this.field_2745.method_671() && (!this.field_2811.isEmpty() || this.field_2769 || this.field_2803)) {
         this.method_3480(
            "Clearing freeze state flushResponses=%s queue=%d visual=%s server=%s.",
            var1,
            this.field_2811.size(),
            this.method_3484(this.field_2778, this.field_2779, this.field_2780),
            this.method_3483()
         );
      }

      if (var1) {
         this.method_3451();
      }

      this.field_2759 = 0;
      this.field_2760 = 0;
      this.field_2761 = false;
      this.field_2762 = false;
      this.field_2763 = false;
      this.field_2764 = false;
      this.field_2765 = false;
      this.field_2766 = false;
      this.field_2767 = false;
      this.field_2768 = false;
      this.field_2769 = false;
      this.field_2770 = false;
      this.field_2771 = false;
      this.field_2772 = false;
      this.field_2773 = false;
      this.field_2774 = 0.0F;
      this.field_2775 = 0.0F;
      this.field_2776 = 0.0F;
      this.field_2777 = 0.0F;
      this.field_2778 = 0.0;
      this.field_2779 = 0.0;
      this.field_2780 = 0.0;
      this.field_2781 = 0.0;
      this.field_2782 = 0.0;
      this.field_2783 = 0.0;
      this.field_2784 = 0.0;
      this.field_2785 = 0.0;
      this.field_2786 = 0.0;
      this.field_2787 = -1L;
      this.field_2788 = -1L;
      this.field_2789 = -1L;
      this.field_2790 = -1L;
      this.field_2791 = -1L;
      this.field_2792 = 0L;
      this.field_2793 = 0.0;
      this.field_2794 = 0.0;
      this.field_2798 = -1;
      this.field_2799 = -1;
      this.field_2800 = -1;
      this.field_2802 = 0;
      this.field_2803 = false;
      this.field_2804 = 0;
      this.field_2807 = 0;
      this.field_2811.clear();
   }

   // $VF: renamed from: d (boolean) void
   private void method_3407(boolean var1) {
      this.method_3406(var1);
      this.field_2795 = 0L;
      this.field_2796 = 0L;
      this.field_2797 = 0L;
      this.field_2801 = 0;
   }

   // $VF: renamed from: o () void
   private void method_3408() {
      if (this.field_2773 && c.field_1724 != null) {
         c.field_1724.method_36457(this.field_2777);
         this.field_2773 = false;
      }
   }

   // $VF: renamed from: p () void
   private void method_3409() {
      if (c.field_1724 != null) {
         Vec3d var1 = this.method_3463();
         c.field_1724.method_5814(var1.field_1352, var1.field_1351, var1.field_1350);
         c.field_1724.field_6017 = 0.0;
         Class32 var2 = (Class32)c.field_1724;
         var2.setLastXClient(var1.field_1352);
         var2.setLastYClient(var1.field_1351);
         var2.setLastZClient(var1.field_1350);
         var2.setLastYawClient(c.field_1724.method_36454());
         var2.setLastPitchClient(c.field_1724.method_36455());
         var2.setLastOnGround(c.field_1724.method_24828());
         var2.setLastHorizontalCollision(c.field_1724.field_5976);
         var2.setTicksSinceLastPositionPacketSent(0);
         if (Dev.ZWare.Client.Class1.field_298 != null) {
            Dev.ZWare.Client.Class1.field_298.field_165 = var1.field_1352;
            Dev.ZWare.Client.Class1.field_298.field_166 = var1.field_1351;
            Dev.ZWare.Client.Class1.field_298.field_167 = var1.field_1350;
            Dev.ZWare.Client.Class1.field_298.field_153 = c.field_1724.method_36454();
            Dev.ZWare.Client.Class1.field_298.field_154 = c.field_1724.method_36455();
            Dev.ZWare.Client.pkg4.Class9.field_164 = c.field_1724.method_24828();
         }

         if (Dev.ZWare.Client.Class1.field_304 != null) {
            Dev.ZWare.Client.Class1.field_304.method_1571();
         }
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_3410() {
      return this.method_3411();
   }

   // $VF: renamed from: c () boolean
   private boolean method_3411() {
      return Class1.method_3258() ? false : this.method_3412() || this.method_3413();
   }

   // $VF: renamed from: n () boolean
   private boolean method_3412() {
      if (c.field_1724 == null || c.field_1687 == null) {
         return false;
      } else if (!c.field_1724.method_6128() || c.field_1724.method_24828()) {
         return false;
      } else {
         return this.field_2808 && this.method_3417() ? false : this.field_2807 > 0 || !this.method_3417();
      }
   }

   // $VF: renamed from: o () boolean
   private boolean method_3413() {
      if (c.field_1724 == null || c.field_1687 == null) {
         return false;
      } else {
         return this.field_2808 && this.method_3417() ? false : this.method_3416() != null && (this.field_2807 > 0 || !this.method_3417());
      }
   }

   // $VF: renamed from: p () boolean
   private boolean method_3414() {
      return this.method_3413();
   }

   // $VF: renamed from: a () net.minecraft.entity.Entity
   private Entity method_3415() {
      AbstractBoatEntity var1 = this.method_3416();
      return (Entity)(var1 != null ? var1 : c.field_1724);
   }

   // $VF: renamed from: a () net.minecraft.entity.vehicle.AbstractBoatEntity
   private AbstractBoatEntity method_3416() {
      if (c.field_1724 == null) {
         return null;
      } else {
         return c.field_1724.method_5854() instanceof AbstractBoatEntity var1 ? var1 : null;
      }
   }

   // $VF: renamed from: q () boolean
   private boolean method_3417() {
      if (c.field_1724.field_3913 != null) {
         PlayerInput var1 = c.field_1724.field_3913.field_54155;
         if (var1 != null && (var1.comp_3159() || var1.comp_3160() || var1.comp_3161() || var1.comp_3162() || var1.comp_3163() || var1.comp_3164())) {
            return true;
         }
      }

      return c.field_1690.field_1894.method_1434()
         || c.field_1690.field_1881.method_1434()
         || c.field_1690.field_1913.method_1434()
         || c.field_1690.field_1849.method_1434()
         || c.field_1690.field_1903.method_1434()
         || c.field_1690.field_1832.method_1434();
   }

   // $VF: renamed from: a () float
   private float method_3418() {
      double var1 = this.field_2793;
      int var3 = this.field_2759++ & 3;
      if (this.method_3437()) {
         return this.method_3420(var1, var3);
      } else {
         return this.field_2721.method_671() == Class9.Inner2.Normal && this.field_2803 ? this.method_3419(var1, var3) : method_3394(var1, var3);
      }
   }

   // $VF: renamed from: b (double, int) float
   private float method_3419(double var1, int var3) {
      if (var1 < 0.25) {
         return var3 == 0 ? -38.0F : -24.0F;
      } else {
         return var3 == 0 ? -24.0F : -6.0F;
      }
   }

   // $VF: renamed from: c (double, int) float
   private float method_3420(double var1, int var3) {
      return switch (var3) {
         case 0 -> var1 < -0.04 ? -58.0F : (var1 > 0.1 ? 26.0F : -30.0F);
         case 1 -> var1 < -0.04 ? -30.0F : -10.0F;
         case 2 -> var1 > 0.1 ? 26.0F : -58.0F;
         default -> -10.0F;
      };
   }

   // $VF: renamed from: a () double
   private double method_3421() {
      if (this.method_3444() && this.field_2797 > 0L) {
         long var1 = System.currentTimeMillis() - this.field_2797;
         if (var1 <= 500L) {
            return this.field_2794;
         }
      }

      Entity var3 = this.method_3415();
      return var3 != null ? var3.method_18798().field_1351 : 0.0;
   }

   // $VF: renamed from: b () float
   private float method_3422() {
      if ((
            this.field_2721.method_671() == Class9.Inner2.Normal
               || this.field_2721.method_671() == Class9.Inner2.Folia
               || this.method_3435()
               || this.method_3437()
         )
         && c.field_1724 != null) {
         if (!this.field_2768) {
            this.field_2774 = this.method_3418();
            this.field_2768 = true;
         }

         return this.field_2774;
      } else {
         return c.field_1724 != null ? c.field_1724.method_36455() : 0.0F;
      }
   }

   // $VF: renamed from: r () boolean
   private boolean method_3423() {
      if (this.field_2724.method_671() && !(this.field_2725.method_671() <= 1.0E-6)) {
         int var1 = this.field_2726.method_671();
         long var2 = System.currentTimeMillis();
         long var4 = var1 * 1000L;
         if (this.field_2787 < 0L || this.field_2798 != var1) {
            this.field_2787 = var2 + var4;
            this.field_2798 = var1;
            return false;
         } else if (var2 < this.field_2787) {
            return false;
         } else {
            this.field_2787 = var2 + var4;
            return true;
         }
      } else {
         this.field_2787 = -1L;
         this.field_2798 = -1;
         return false;
      }
   }

   // $VF: renamed from: s () boolean
   private boolean method_3424() {
      if (this.field_2721.method_671() == Class9.Inner2.FULL) {
         this.field_2790 = -1L;
         return false;
      } else if (!this.field_2762 && !this.field_2763) {
         long var1 = System.currentTimeMillis();
         if (this.field_2790 < 0L) {
            this.field_2790 = var1 + 5000L;
            return false;
         } else if (var1 < this.field_2790) {
            return false;
         } else {
            this.field_2790 = var1 + 5000L;
            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: q () void
   private void method_3425() {
      this.field_2763 = false;
      if (!this.method_3435() && !this.field_2811.isEmpty()) {
         this.method_3451();
      }

      if ((this.method_3434() || this.method_3435()) && this.field_2721.method_671() != Class9.Inner2.FULL) {
         if (this.method_3435()) {
            this.method_3426();
         } else {
            this.method_3427();
         }
      } else {
         this.field_2788 = -1L;
         this.field_2789 = -1L;
         this.field_2799 = -1;
         this.field_2800 = -1;
         this.field_2765 = false;
      }
   }

   // $VF: renamed from: r () void
   private void method_3426() {
      if (this.field_2811.isEmpty()) {
         this.field_2789 = -1L;
         this.field_2800 = -1;
      } else if (this.method_3470()) {
         this.field_2789 = -1L;
         this.field_2800 = -1;
         this.method_3452("queue-size");
      } else if (!this.method_3471()) {
         this.field_2789 = -1L;
         this.field_2800 = -1;
      } else {
         if (this.field_2789 < 0L || this.field_2800 != this.field_2732.method_671()) {
            this.method_3468();
         }

         this.method_3467("timer");
      }
   }

   // $VF: renamed from: s () void
   private void method_3427() {
      int var1 = this.field_2728.method_671();
      long var2 = System.currentTimeMillis();
      long var4 = var1 * 1000L;
      if (this.field_2788 >= 0L && this.field_2799 == var1) {
         if (!this.field_2765 && var2 >= this.field_2788) {
            this.field_2765 = true;
            this.field_2763 = this.field_2729.method_671();
         }
      } else {
         this.field_2788 = var2 + var4;
         this.field_2799 = var1;
         this.field_2765 = false;
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket, boolean) void
   private void method_3428(PlayerMoveC2SPacket var1, boolean var2) {
      if (c.field_1724 != null && c.method_1562() != null) {
         float var3 = var1.method_12271(c.field_1724.method_36454());
         float var4 = this.method_3439() ? var1.method_12270(c.field_1724.method_36455()) : var1.method_12270(this.method_3422());
         boolean var5 = var1.method_12273();
         boolean var6 = var1.method_61225();
         double var7 = this.method_3441();
         double var9 = this.method_3442();
         double var11 = this.method_3443();
         if (this.method_3436()) {
            var9 += this.method_3465();
            this.method_3464(var7, var9, var11);
         } else if (this.method_3437()) {
            var9 += this.method_3466();
            this.method_3464(var7, var9, var11);
         }

         this.method_3455(var7, var9, var11, var3, var4, var5, var6);
         this.method_3453(new Full(var7, var9, var11, var3, var4, var5, var6));
         if (var2) {
            this.method_3454();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3, net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket) void
   private void method_3429(Class16.Inner3 var1, VehicleMoveC2SPacket var2) {
      AbstractBoatEntity var3 = this.method_3416();
      if (var3 != null) {
         if (this.field_2721.method_671() == Class9.Inner2.Folia) {
            this.method_3431(var2.comp_3350().field_1352, var2.comp_3350().field_1351, var2.comp_3350().field_1350);
         } else {
            if (this.field_2762 || this.field_2763 || this.field_2764) {
               this.method_3431(var2.comp_3350().field_1352, var2.comp_3350().field_1351, var2.comp_3350().field_1350);
            }

            var1.method_1046();
            this.method_3430(var2, var3);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket, net.minecraft.entity.Entity) void
   private void method_3430(VehicleMoveC2SPacket var1, Entity var2) {
      if (c.method_1562() != null) {
         double var3 = this.method_3441();
         double var5 = this.method_3442();
         double var7 = this.method_3443();
         this.method_3453(new VehicleMoveC2SPacket(new Vec3d(var3, var5, var7), var1.comp_3351(), var1.comp_3352(), var1.comp_3353()));
         var2.method_5814(var3, var5, var7);
         var2.method_18800(0.0, 0.0, 0.0);
         var2.field_6017 = 0.0;
         this.method_3460(var2);
      }
   }

   // $VF: renamed from: a (double, double, double) void
   private void method_3431(double var1, double var3, double var5) {
      this.field_2778 = var1;
      this.field_2779 = var3;
      this.field_2780 = var5;
      this.field_2769 = true;
      if (!this.field_2803) {
         this.method_3464(var1, var3, var5);
      }
   }

   // $VF: renamed from: b (double, double, double) void
   private void method_3432(double var1, double var3, double var5) {
      this.field_2778 = var1;
      this.field_2779 = var3;
      this.field_2780 = var5;
      this.field_2769 = true;
      this.method_3464(var1, var3, var5);
   }

   // $VF: renamed from: t () boolean
   private boolean method_3433() {
      long var1 = switch ((Class9.Inner2)this.field_2721.method_671()) {
         case Normal -> 500L;
         case SillyGrim -> 250L;
         case Stupid, Stupid2 -> this.field_2744.method_671().intValue();
         default -> 1500L;
      };
      long var3 = System.currentTimeMillis();
      if (this.field_2791 < 0L) {
         this.field_2791 = var3 + var1;
         return true;
      } else if (var3 < this.field_2791) {
         return false;
      } else {
         this.field_2791 = var3 + var1;
         return true;
      }
   }

   // $VF: renamed from: u () boolean
   private boolean method_3434() {
      return this.field_2727.method_671();
   }

   // $VF: renamed from: v () boolean
   private boolean method_3435() {
      return this.field_2721.method_671() == Class9.Inner2.PongFlush;
   }

   // $VF: renamed from: w () boolean
   private boolean method_3436() {
      return this.field_2721.method_671() == Class9.Inner2.SillyGrim;
   }

   // $VF: renamed from: x () boolean
   private boolean method_3437() {
      return this.field_2721.method_671() == Class9.Inner2.Stupid || this.field_2721.method_671() == Class9.Inner2.Stupid2;
   }

   // $VF: renamed from: y () boolean
   private boolean method_3438() {
      return this.field_2721.method_671() == Class9.Inner2.Stupid2;
   }

   // $VF: renamed from: z () boolean
   private boolean method_3439() {
      return this.method_3436() || this.method_3438();
   }

   // $VF: renamed from: A () boolean
   private boolean method_3440() {
      return this.field_2721.method_671() == Class9.Inner2.Normal
         || this.field_2721.method_671() == Class9.Inner2.Folia
         || this.field_2721.method_671() == Class9.Inner2.Stupid
         || this.method_3435();
   }

   // $VF: renamed from: b () double
   private double method_3441() {
      return this.method_3444() ? this.field_2781 : this.field_2778;
   }

   // $VF: renamed from: c () double
   private double method_3442() {
      return this.method_3444() ? this.field_2782 : this.field_2779;
   }

   // $VF: renamed from: d () double
   private double method_3443() {
      return this.method_3444() ? this.field_2783 : this.field_2780;
   }

   // $VF: renamed from: B () boolean
   private boolean method_3444() {
      return this.field_2721.method_671() != Class9.Inner2.Normal && !this.method_3436() && !this.method_3437() ? this.method_3445() : this.field_2803;
   }

   // $VF: renamed from: C () boolean
   private boolean method_3445() {
      return this.method_3435() && this.field_2737.method_671() == Class9.Inner4.TrackServerAnchor && this.field_2803;
   }

   // $VF: renamed from: a (net.minecraft.network.packet.Packet) boolean
   private boolean method_3446(Packet<?> var1) {
      return var1 instanceof KeepAliveC2SPacket || var1 instanceof CommonPongC2SPacket;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) boolean
   private boolean method_3447(Class16.Inner3 var1) {
      Packet var2 = var1.method_1045();
      if (!this.method_3446(var2)) {
         return false;
      } else {
         Class9.Inner1 var3 = this.method_3448(var2);
         if (var3 == Class9.Inner1.Send) {
            this.method_3480("PongFlush passed through %s.", this.method_3482(var2));
            return false;
         } else {
            var1.method_1046();
            boolean var4 = this.field_2811.isEmpty();
            this.field_2811.add(var2);
            this.method_3469(this.method_3450(var2), var4);
            this.method_3480("PongFlush queued %s queue=%d.", this.method_3482(var2), this.field_2811.size());
            return true;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.Packet) Dev.ZWare.Client.features.pkg1.pkg6.Class9$Inner1
   private Class9.Inner1 method_3448(Packet<?> var1) {
      if (var1 instanceof KeepAliveC2SPacket) {
         return this.field_2734.method_671();
      } else {
         return var1 instanceof CommonPongC2SPacket ? this.field_2735.method_671() : Class9.Inner1.Queue;
      }
   }

   // $VF: renamed from: b (int) void
   private void method_3449(int var1) {
      if (this.field_2736.method_671() == Class9.Inner1.Send) {
         this.method_3453(new TeleportConfirmC2SPacket(var1));
         this.method_3480("PongFlush sent TeleportConfirmC2SPacket tp=%d immediately.", var1);
      } else {
         boolean var2 = this.field_2811.isEmpty();
         this.field_2811.add(new TeleportConfirmC2SPacket(var1));
         this.method_3469("correction", var2);
         this.method_3480("PongFlush queued TeleportConfirmC2SPacket tp=%d queue=%d.", var1, this.field_2811.size());
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.Packet) java.lang.String
   private String method_3450(Packet<?> var1) {
      if (var1 instanceof KeepAliveC2SPacket) {
         return "keepalive";
      } else {
         return var1 instanceof CommonPongC2SPacket ? "pong" : "due-on-queue";
      }
   }

   // $VF: renamed from: t () void
   private void method_3451() {
      this.method_3452(null);
   }

   // $VF: renamed from: b (java.lang.String) void
   private void method_3452(String var1) {
      if (!this.field_2811.isEmpty() && c.method_1562() != null) {
         if (this.method_3435()) {
            if (var1 != null) {
               this.method_3473("Flushing %s queued response%s (%s).", this.field_2811.size(), this.field_2811.size() == 1 ? "" : "s", var1);
            } else {
               this.method_3473("Flushing %s queued response%s.", this.field_2811.size(), this.field_2811.size() == 1 ? "" : "s");
            }
         }

         this.method_3480(
            "Flushing queue reason=%s size=%d packets=%s visual=%s server=%s.",
            var1 != null ? var1 : "none",
            this.field_2811.size(),
            this.method_3481(),
            this.method_3484(this.field_2778, this.field_2779, this.field_2780),
            this.method_3483()
         );

         try {
            for (Packet var3 : this.field_2811) {
               this.method_3453(var3);
            }
         } finally {
            this.field_2811.clear();
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.Packet) void
   private void method_3453(Packet<?> var1) {
      if (c.method_1562() != null) {
         this.field_2766 = true;

         try {
            c.method_1562().method_52787(var1);
         } finally {
            this.field_2766 = false;
         }
      }
   }

   // $VF: renamed from: u () void
   private void method_3454() {
      if (c.field_1724 != null) {
         this.method_3453(new ClientCommandC2SPacket(c.field_1724, Mode.field_12982));
         c.field_1724.method_23669();
      }
   }

   // $VF: renamed from: a (double, double, double, float, float, boolean, boolean) void
   private void method_3455(double var1, double var3, double var5, float var7, float var8, boolean var9, boolean var10) {
      this.field_2784 = var1;
      this.field_2785 = var3;
      this.field_2786 = var5;
      this.field_2775 = var7;
      this.field_2776 = var8;
      this.field_2771 = var9;
      this.field_2772 = var10;
      this.field_2770 = true;
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket) void
   private void method_3456(PlayerPositionLookS2CPacket var1) {
      if (c.field_1724 != null) {
         Vec3d var2 = this.method_3461(var1, this.method_3462());
         this.method_3431(var2.field_1352, var2.field_1351, var2.field_1350);
      }
   }

   // $VF: renamed from: b (net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket) void
   private void method_3457(PlayerPositionLookS2CPacket var1) {
      if (c.field_1724 != null) {
         Vec3d var2 = this.field_2803
            ? new Vec3d(this.field_2781, this.field_2782, this.field_2783)
            : new Vec3d(this.field_2778, this.field_2779, this.field_2780);
         Vec3d var3 = this.method_3461(var1, var2);
         this.field_2794 = var3.field_1351 - var2.field_1351;
         this.method_3464(var3.field_1352, var3.field_1351, var3.field_1350);
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket) void
   private void method_3458(VehicleMoveS2CPacket var1) {
      Vec3d var2 = this.field_2803
         ? new Vec3d(this.field_2781, this.field_2782, this.field_2783)
         : new Vec3d(this.field_2778, this.field_2779, this.field_2780);
      this.field_2794 = var1.comp_3347().field_1351 - var2.field_1351;
      this.method_3464(var1.comp_3347().field_1352, var1.comp_3347().field_1351, var1.comp_3347().field_1350);
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.VehicleMoveS2CPacket, boolean) void
   private void method_3459(VehicleMoveS2CPacket var1, boolean var2) {
      AbstractBoatEntity var3 = this.method_3416();
      if (var3 != null) {
         var3.method_5641(var1.comp_3347().field_1352, var1.comp_3347().field_1351, var1.comp_3347().field_1350, var1.comp_3348(), var1.comp_3349());
         this.method_3460(var3);
         if (var2) {
            this.method_3453(VehicleMoveC2SPacket.method_65307(var3));
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.Entity) void
   private void method_3460(Entity var1) {
      if (c.field_1724 != null && c.field_1724.method_5854() == var1) {
         var1.method_24201(c.field_1724);
         c.field_1724.method_18799(var1.method_18798());
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket, net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_3461(PlayerPositionLookS2CPacket var1, Vec3d var2) {
      if (c.field_1724 == null) {
         return var2;
      } else {
         PlayerPosition var3 = new PlayerPosition(var2, Vec3d.field_1353, c.field_1724.method_36454(), c.field_1724.method_36455());
         return PlayerPosition.method_63639(var3, var1.comp_3228(), var1.comp_3229()).comp_3148();
      }
   }

   // $VF: renamed from: a () net.minecraft.util.math.Vec3d
   private Vec3d method_3462() {
      if (this.field_2769) {
         return new Vec3d(this.field_2778, this.field_2779, this.field_2780);
      } else {
         return c.field_1724 == null ? Vec3d.field_1353 : new Vec3d(c.field_1724.method_23317(), c.field_1724.method_23318(), c.field_1724.method_23321());
      }
   }

   // $VF: renamed from: b () net.minecraft.util.math.Vec3d
   private Vec3d method_3463() {
      if (this.method_3444()) {
         return new Vec3d(this.field_2781, this.field_2782, this.field_2783);
      } else if (this.field_2769) {
         return new Vec3d(this.field_2778, this.field_2779, this.field_2780);
      } else {
         return c.field_1724 != null ? c.field_1724.method_19538() : Vec3d.field_1353;
      }
   }

   // $VF: renamed from: c (double, double, double) void
   private void method_3464(double var1, double var3, double var5) {
      this.field_2781 = var1;
      this.field_2782 = var3;
      this.field_2783 = var5;
      this.field_2803 = true;
   }

   // $VF: renamed from: e () double
   private double method_3465() {
      if (this.method_3436() && this.field_2803) {
         if (this.field_2760 % this.field_2740.method_671() != 0) {
            return 0.0;
         } else {
            double var1 = this.field_2794;
            if (var1 > this.field_2739.method_671()) {
               return 0.0;
            } else {
               double var3 = this.field_2738.method_671();
               if (var1 < 0.0) {
                  var3 *= 1.0 + Math.min(1.0, Math.abs(var1) * 4.0);
               }

               return var3;
            }
         }
      } else {
         return 0.0;
      }
   }

   // $VF: renamed from: f () double
   private double method_3466() {
      if (!this.method_3437()) {
         return 0.0;
      } else {
         double var1 = this.field_2741.method_671();
         double var3 = this.field_2742.method_671();
         if (this.field_2793 < -0.04) {
            var1 *= 1.0 + Math.min(1.0, Math.abs(this.field_2793) * 4.0);
         } else if (this.field_2793 > 0.1) {
            var3 *= 1.0 + Math.min(1.0, this.field_2793 * 3.0);
         }

         int var5 = this.field_2760 % this.field_2743.method_671();

         return switch (var5) {
            case 0 -> var1;
            case 1 -> var1 * 0.4;
            case 2 -> -var3;
            default -> 0.0;
         };
      }
   }

   // $VF: renamed from: c (java.lang.String) void
   private void method_3467(String var1) {
      if (this.method_3435() && !this.field_2811.isEmpty()) {
         if (this.method_3471()) {
            if (this.field_2789 >= 0L && this.field_2800 == this.field_2732.method_671()) {
               long var2 = System.currentTimeMillis();
               if (var2 >= this.field_2789) {
                  this.field_2789 = -1L;
                  this.method_3452(var1);
               }
            } else {
               this.method_3468();
            }
         }
      }
   }

   // $VF: renamed from: v () void
   private void method_3468() {
      int var1 = this.field_2732.method_671();
      this.field_2789 = System.currentTimeMillis() + var1 * 1000L;
      this.field_2800 = var1;
      this.method_3473("Armed flush timer for %ss.", var1);
      this.method_3480("Armed PongFlush timer for %ss queue=%d.", var1, this.field_2811.size());
   }

   // $VF: renamed from: a (java.lang.String, boolean) void
   private void method_3469(String var1, boolean var2) {
      if (!this.field_2811.isEmpty()) {
         if (this.method_3470()) {
            this.field_2789 = -1L;
            this.field_2800 = -1;
            this.method_3452("queue-size");
         } else {
            if (var2) {
               this.method_3473("Queued response packets for the next flush.");
            }

            if (this.method_3471()) {
               this.method_3467(var1);
            }
         }
      }
   }

   // $VF: renamed from: D () boolean
   private boolean method_3470() {
      return this.method_3472() && this.field_2811.size() >= this.field_2733.method_671();
   }

   // $VF: renamed from: E () boolean
   private boolean method_3471() {
      return this.field_2731.method_671() == Class9.Inner3.Time || this.field_2731.method_671() == Class9.Inner3.Either;
   }

   // $VF: renamed from: F () boolean
   private boolean method_3472() {
      return this.field_2731.method_671() == Class9.Inner3.PacketCount || this.field_2731.method_671() == Class9.Inner3.Either;
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   private void method_3473(String var1, Object... var2) {
      if (this.field_2730.method_671()) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647(var1, var2);
      }
   }

   // $VF: renamed from: a (boolean, boolean) void
   private void method_3474(boolean var1, boolean var2) {
      if (this.field_2745.method_671()) {
         if (this.field_2805 != var1) {
            this.method_3480(
               "freezeEligible=%s gliding=%s onGround=%s queue=%d input=%s.",
               var1,
               c.field_1724 != null && c.field_1724.method_6128(),
               c.field_1724 != null && c.field_1724.method_24828(),
               this.field_2811.size(),
               this.method_3485()
            );
            this.field_2805 = var1;
         }

         if (this.field_2806 != var2) {
            this.method_3480(
               "shouldFreeze=%s queue=%d visual=%s server=%s.",
               var2,
               this.field_2811.size(),
               this.method_3484(this.field_2778, this.field_2779, this.field_2780),
               this.method_3483()
            );
            this.field_2806 = var2;
         }
      }
   }

   // $VF: renamed from: w () void
   private void method_3475() {
      if (!this.field_2745.method_671() || !this.method_3435() && !this.method_3436() && !this.method_3437() || !this.method_3410()) {
         this.field_2804 = 0;
      } else if (++this.field_2804 >= this.field_2747.method_671()) {
         this.field_2804 = 0;
         if (this.method_3436()) {
            this.method_3480(
               "SillyGrim summary frozenTicks=%d visual=%s server=%s trackedServerVerticalSpeed=%.3f yOffset=%.3f.",
               this.field_2760,
               this.method_3484(this.field_2778, this.field_2779, this.field_2780),
               this.method_3483(),
               this.field_2794,
               this.method_3465()
            );
         } else if (this.method_3437()) {
            this.method_3480(
               "%s summary frozenTicks=%d visual=%s server=%s sampledVerticalSpeed=%.3f yOffset=%.3f cycle=%d refresh=%dms.",
               this.field_2721.method_671(),
               this.field_2760,
               this.method_3484(this.field_2778, this.field_2779, this.field_2780),
               this.method_3483(),
               this.field_2793,
               this.method_3466(),
               this.field_2743.method_671(),
               this.field_2744.method_671()
            );
         } else {
            long var1 = this.field_2789 < 0L ? -1L : Math.max(0L, this.field_2789 - System.currentTimeMillis());
            this.method_3480(
               "Summary frozenTicks=%d queue=%d nextFlushInMs=%d visual=%s server=%s correctionMode=%s trigger=%s keepalive=%s pong=%s teleportConfirm=%s packets=%s.",
               this.field_2760,
               this.field_2811.size(),
               var1,
               this.method_3484(this.field_2778, this.field_2779, this.field_2780),
               this.method_3483(),
               this.field_2737.method_671(),
               this.field_2731.method_671(),
               this.field_2734.method_671(),
               this.field_2735.method_671(),
               this.field_2736.method_671(),
               this.method_3481()
            );
         }
      }
   }

   // $VF: renamed from: x () void
   private void method_3476() {
      if (this.field_2745.method_671() && this.method_3435()) {
         this.method_3480(
            "PongFlush config trigger=%s time=%ds maxQueued=%d keepalive=%s pong=%s teleportConfirm=%s correctionMode=%s.",
            this.field_2731.method_671(),
            this.field_2732.method_671(),
            this.field_2733.method_671(),
            this.field_2734.method_671(),
            this.field_2735.method_671(),
            this.field_2736.method_671(),
            this.field_2737.method_671()
         );
      }
   }

   // $VF: renamed from: y () void
   private void method_3477() {
      if (this.field_2745.method_671() && this.method_3436()) {
         this.method_3480(
            "SillyGrim config rise=%.3f threshold=%.3f interval=%dt refresh=%dms.",
            this.field_2738.method_671(),
            this.field_2739.method_671(),
            this.field_2740.method_671(),
            250L
         );
      }
   }

   // $VF: renamed from: z () void
   private void method_3478() {
      if (this.field_2745.method_671() && this.method_3437()) {
         this.method_3480(
            "%s config rise=%.3f drop=%.3f cycle=%dt refresh=%dms.",
            this.field_2721.method_671(),
            this.field_2741.method_671(),
            this.field_2742.method_671(),
            this.field_2743.method_671(),
            this.field_2744.method_671()
         );
      }
   }

   // $VF: renamed from: A () void
   private void method_3479() {
      if (this.method_3435()) {
         if (this.method_3472() && this.field_2733.method_671() <= 1) {
            this.method_3473("PacketCount with pongflush-max-queued=%s flushes every queued response immediately.", this.field_2733.method_671());
            this.method_3480("PacketCount trigger with maxQueued=%d flushes every queued response immediately.", this.field_2733.method_671());
         }

         if (this.field_2737.method_671() == Class9.Inner4.TrackServerAnchor && this.field_2736.method_671() == Class9.Inner1.Send) {
            this.method_3473("TrackServerAnchor with teleportConfirm=Send advances the hidden server anchor on every correction.");
            this.method_3480("TrackServerAnchor with teleportConfirm=Send advances the hidden server anchor on every correction.");
            this.method_3473("Use SyncAnchors if you want the freeze point to follow corrections instead of building hidden drift.");
         }

         if (this.field_2737.method_671() == Class9.Inner4.Cancel) {
            this.method_3473("Cancel still acknowledges corrections through teleport confirms, so the hidden server anchor can drift and snap later.");
            this.method_3480("Cancel mode can build hidden server drift because teleport confirms still acknowledge canceled corrections.");
            this.method_3473("Use SyncAnchors if you want to see and follow the real server position instead of snapping when the freeze breaks.");
         }
      }
   }

   // $VF: renamed from: b (java.lang.String, java.lang.Object[]) void
   private void method_3480(String var1, Object... var2) {
      if (this.field_2745.method_671()) {
         String var3 = String.format(Locale.ROOT, var1, var2);
         Dev.ZWare.Client.Class1.field_294.info("[StopMotion] {}", var3);
         if (this.field_2746.method_671()) {
            long var4 = System.currentTimeMillis();
            if (var4 < this.field_2792) {
               this.field_2802++;
            } else {
               String var6 = this.field_2802 > 0 ? String.format(Locale.ROOT, "[debug] +%d skipped | %s", this.field_2802, var3) : "[debug] " + var3;
               this.field_2802 = 0;
               this.field_2792 = var4 + 1000L;
               Dev.ZWare.Client.features.pkg2.Class1.method_1647(var6);
            }
         }
      }
   }

   // $VF: renamed from: g () java.lang.String
   private String method_3481() {
      if (this.field_2811.isEmpty()) {
         return "[]";
      } else {
         StringBuilder var1 = new StringBuilder("[");

         for (int var2 = 0; var2 < this.field_2811.size(); var2++) {
            if (var2 > 0) {
               var1.append(", ");
            }

            var1.append(this.method_3482(this.field_2811.get(var2)));
         }

         var1.append(']');
         return var1.toString();
      }
   }

   // $VF: renamed from: b (net.minecraft.network.packet.Packet) java.lang.String
   private String method_3482(Packet<?> var1) {
      if (var1 instanceof CommonPongC2SPacket) {
         return "CommonPongC2SPacket";
      } else if (var1 instanceof KeepAliveC2SPacket) {
         return "KeepAliveC2SPacket";
      } else if (var1 instanceof TeleportConfirmC2SPacket) {
         return "TeleportConfirmC2SPacket";
      } else if (var1 instanceof PlayerMoveC2SPacket) {
         return "PlayerMoveC2SPacket";
      } else if (var1 instanceof VehicleMoveC2SPacket) {
         return "VehicleMoveC2SPacket";
      } else if (var1 instanceof ClientCommandC2SPacket) {
         return "ClientCommandC2SPacket";
      } else if (var1 instanceof PlayerPositionLookS2CPacket) {
         return "PlayerPositionLookS2CPacket";
      } else if (var1 instanceof VehicleMoveS2CPacket) {
         return "VehicleMoveS2CPacket";
      } else {
         String var2 = var1.getClass().getSimpleName();
         return var2 != null && !var2.isEmpty() ? var2 : var1.getClass().getName();
      }
   }

   // $VF: renamed from: h () java.lang.String
   private String method_3483() {
      return !this.field_2803 ? "none" : this.method_3484(this.field_2781, this.field_2782, this.field_2783);
   }

   // $VF: renamed from: a (double, double, double) java.lang.String
   private String method_3484(double var1, double var3, double var5) {
      return String.format(Locale.ROOT, "(%.3f, %.3f, %.3f)", var1, var3, var5);
   }

   // $VF: renamed from: G () boolean
   private boolean method_3485() {
      return c.field_1724 != null && this.method_3417();
   }

   // $VF: renamed from: b (net.minecraft.network.packet.Packet) boolean
   private boolean method_3486(Packet<?> var1) {
      return var1 instanceof PlayerMoveC2SPacket || var1 instanceof VehicleMoveC2SPacket || var1 instanceof ClientCommandC2SPacket;
   }

   // $VF: renamed from: c (net.minecraft.network.packet.Packet) boolean
   private boolean method_3487(Packet<?> var1) {
      return var1 instanceof ClientCommandC2SPacket var2 && var2.method_12365() == Mode.field_12982;
   }

   // $VF: renamed from: d (net.minecraft.network.packet.Packet) boolean
   private boolean method_3488(Packet<?> var1) {
      return var1 instanceof PlayerPositionLookS2CPacket || var1 instanceof VehicleMoveS2CPacket;
   }

   // $VF: renamed from: e (net.minecraft.network.packet.Packet) boolean
   private boolean method_3489(Packet<?> var1) {
      return this.method_3486(var1) ? true : this.field_2723.method_671() && var1 instanceof TeleportConfirmC2SPacket;
   }

   // $VF: renamed from: f (net.minecraft.network.packet.Packet) boolean
   private boolean method_3490(Packet<?> var1) {
      if (this.method_3488(var1)) {
         return true;
      } else if (!this.field_2723.method_671()) {
         return false;
      } else {
         return !(var1 instanceof ExplosionS2CPacket) && !(var1 instanceof PlayerAbilitiesS2CPacket)
            ? var1 instanceof EntityVelocityUpdateS2CPacket var2 && c.field_1724 != null && var2.method_11818() == c.field_1724.method_5628()
            : true;
      }
   }

   // $VF: renamed from: g (net.minecraft.network.packet.Packet) boolean
   private boolean method_3491(Packet<?> var1) {
      if (this.field_2748.method_671() && var1 instanceof PlayerMoveC2SPacket) {
         return true;
      } else if (this.field_2749.method_671() && var1 instanceof VehicleMoveC2SPacket) {
         return true;
      } else if (this.field_2750.method_671() && var1 instanceof ClientCommandC2SPacket) {
         return true;
      } else if (this.field_2751.method_671() && var1 instanceof TeleportConfirmC2SPacket) {
         return true;
      } else {
         return this.field_2752.method_671() && var1 instanceof KeepAliveC2SPacket ? true : this.field_2753.method_671() && var1 instanceof CommonPongC2SPacket;
      }
   }

   // $VF: renamed from: h (net.minecraft.network.packet.Packet) boolean
   private boolean method_3492(Packet<?> var1) {
      if (this.field_2754.method_671() && var1 instanceof PlayerPositionLookS2CPacket) {
         return true;
      } else if (this.field_2755.method_671() && var1 instanceof VehicleMoveS2CPacket) {
         return true;
      } else if (this.field_2756.method_671() && var1 instanceof ExplosionS2CPacket) {
         return true;
      } else {
         return this.field_2757.method_671() && var1 instanceof PlayerAbilitiesS2CPacket
            ? true
            : this.field_2758.method_671()
               && var1 instanceof EntityVelocityUpdateS2CPacket var2
               && c.field_1724 != null
               && var2.method_11818() == c.field_1724.method_5628();
      }
   }

   // $VF: renamed from: c (int) void
   public void method_3493(int ticks) {
      if (ticks > 0) {
         this.field_2807 = Math.max(this.field_2807, ticks);
      }
   }

   // $VF: renamed from: a () int
   public int method_3494() {
      return this.field_2807;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class9$Inner2
   public Class9.Inner2 method_3495() {
      return this.field_2721.method_671();
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg6.Class9$Inner2) void
   public void method_3496(Class9.Inner2 mode) {
      if (mode != null) {
         this.field_2721.method_672(mode);
      }
   }

   public static enum Inner1 {
      Send,
      Queue;
   }

   public static enum Inner2 {
      Normal,
      SillyGrim,
      Stupid,
      Stupid2,
      Folia,
      FULL,
      PongFlush,
      Custom;
   }

   public static enum Inner3 {
      Time,
      PacketCount,
      Either;
   }

   public static enum Inner4 {
      Accept,
      Cancel,
      SyncAnchors,
      TrackServerAnchor;
   }
}
