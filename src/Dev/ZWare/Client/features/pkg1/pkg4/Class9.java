package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.pkg2.pkg1.Class16;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.Locale;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.util.Formatting;

public class Class9 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class9
   private static Class9 field_2428;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_2429 = this.a("Global", Class9.Inner1.PaperMC).method_683("Packet Limits");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2430 = this.a("Global Limit", method_3144(), 1, 5000).method_683("Packet Limits");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2431 = this.a("Global Timing", method_3145(), 0.1, 10.0).method_683("Packet Limits");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_2432 = this.a("Offhand", Class9.Inner1.PaperMC).method_683("Packet Limits");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2433 = this.a("Offhand Limit", method_3146(), 1, 1000).method_683("Packet Limits");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2434 = this.a("Offhand Timing", method_3147(), 0.05, 10.0).method_683("Packet Limits");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_2435 = this.a("ClickSlot", Class9.Inner1.PaperMC).method_683("Packet Limits");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2436 = this.a("Click Slot Limit", method_3148(), 1, 1000).method_683("Packet Limits");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2437 = this.a("Click Slot Timing", method_3149(), 0.1, 10.0).method_683("Packet Limits");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2438 = this.a("Block Placement Delay", method_3140(), 0.0, 1.0).method_683("Placement");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2439 = this.a("Block Interaction Range", method_3141(), 0.5, 10.0).method_683("Placement");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2440 = this.a("Block Interaction Limit", 9, 1, 100).method_683("Placement");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2441 = this.a("Block Interaction Timeframe", method_3143(), 1, 5000)
      .method_683("Placement");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2442 = this.a("Block Placement Debug", false).method_683("Placement");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2443 = this.a("Grim Silent Swap Fix", false).method_683("Fixes");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class5.Inner1> field_2444 = this.a("Swap", Class5.Inner1.Auto).method_683("Inventory");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2445 = this.a("No Screen Close", false).method_683("Inventory");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class6.Inner1> field_2446 = this.a("Latency Mode", Class6.Inner1.field_620).method_683("Latency");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2447 = this.a("Fast Latency", 3000, 250, 10000).method_683("Latency");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner3> field_2448 = this.a("Kill Aura Mode", Class14.Inner3.None).method_683("MultiTask");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner1> field_2449 = this.a("Phase Mode", Class14.Inner1.Normal).method_683("MultiTask");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner2> field_2450 = this.a("Pearl Mode", Class14.Inner2.AltSilent).method_683("MultiTask");
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2451 = this.a("Tick Sync", true).method_683("Rotations");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2452 = this.a("Grim Snap Rotations", true).method_683("Rotations");
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2453 = this.a("Sync Rotation", false).method_683("Rotations");
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2454 = this.a("Smooth", false).method_683("Rotations");
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2455 = this.a("Smooth Yaw Step", 22.0, 1.0, 180.0).method_683("Rotations");
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2456 = this.a("Smooth Pitch Step", 10.0, 1.0, 90.0).method_683("Rotations");
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2457 = this.a("Anchor Aura", Class7.Inner1.Highest).method_683("Rotation Priority");
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2458 = this.a("Crystal Aura", Class7.Inner1.Highest).method_683("Rotation Priority");
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2459 = this.a("Kill Aura", Class7.Inner1.Highest).method_683("Rotation Priority");
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2460 = this.a("Sprint", Class7.Inner1.VeryHigh).method_683("Rotation Priority");
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2461 = this.a("Speed", Class7.Inner1.field_608).method_683("Rotation Priority");
   // $VF: renamed from: W Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2462 = this.a("Pearl Phase", Class7.Inner1.High).method_683("Rotation Priority");
   // $VF: renamed from: X Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2463 = this.a("Auto EXP", Class7.Inner1.Normal).method_683("Rotation Priority");
   // $VF: renamed from: Y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2464 = this.a("Elytra", Class7.Inner1.Normal).method_683("Rotation Priority");
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2465 = this.a("Surround", Class7.Inner1.field_608).method_683("Rotation Priority");
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2466 = this.a("Prediction Enabled", false).method_683("Predictions");
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2467 = this.a("Ticks", 3, 0, 20).method_683("Predictions");
   // $VF: renamed from: ac Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2468 = this.a("Elytra Ticks", 3, 0, 20).method_683("Predictions");
   // $VF: renamed from: ad Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2469 = this.a("Ground Raycast", true).method_683("Predictions");

   public Class9() {
      super("AntiCheat", "Shared packet, inventory, rotation, and prediction settings.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, true, false, true);
      this.field_2430.method_709(var1 -> this.field_2429.method_671() == Class9.Inner1.Custom);
      this.field_2431.method_709(var1 -> this.field_2429.method_671() == Class9.Inner1.Custom);
      this.field_2433.method_709(var1 -> this.field_2432.method_671() == Class9.Inner1.Custom);
      this.field_2434.method_709(var1 -> this.field_2432.method_671() == Class9.Inner1.Custom);
      this.field_2436.method_709(var1 -> this.field_2435.method_671() == Class9.Inner1.Custom);
      this.field_2437.method_709(var1 -> this.field_2435.method_671() == Class9.Inner1.Custom);
      this.field_2447.method_709(var1 -> this.field_2446.method_671() == Class6.Inner1.QueryPing);
      this.field_2455.method_709(var1 -> this.field_2454.method_671());
      this.field_2456.method_709(var1 -> this.field_2454.method_671());
      this.field_2467.method_709(var1 -> this.field_2466.method_671());
      this.field_2468.method_709(var1 -> this.field_2466.method_671());
      this.field_2469.method_709(var1 -> this.field_2466.method_671());
      field_2428 = this;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3091(Class16.Inner1 var1) {
      if (this.field_2443.method_671() && c.field_1724 != null) {
         if (var1.method_1045() instanceof ScreenHandlerSlotUpdateS2CPacket var2) {
            if (var2.method_11452() == 0) {
               int var6 = var2.method_11450();
               if (var6 >= 36 && var6 <= 44) {
                  ItemStack var4 = var2.method_11449();
                  ItemStack var5 = c.field_1724.method_6047();
                  if (!var4.method_7960() && !var5.method_7960()) {
                     if (ItemStack.method_7973(var4, var5)) {
                        var1.method_1048();
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class9
   public static Class9 method_3092() {
      return field_2428;
   }

   // $VF: renamed from: a () double
   public static double method_3093() {
      Class9 var0 = method_3092();
      return var0 != null ? var0.method_3118() : method_3141();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class5$Inner1
   public Class5.Inner1 method_3094() {
      return this.field_2444.method_671();
   }

   // $VF: renamed from: a () boolean
   public boolean method_3095() {
      return this.field_2445.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class6$Inner1
   public Class6.Inner1 method_3096() {
      return this.field_2446.method_671();
   }

   // $VF: renamed from: a () long
   public long method_3097() {
      return this.field_2447.method_671().intValue();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner3
   public Class14.Inner3 method_3098() {
      return this.field_2448.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner1
   public Class14.Inner1 method_3099() {
      return this.field_2449.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner2
   public Class14.Inner2 method_3100() {
      return this.field_2450.method_671();
   }

   // $VF: renamed from: b () boolean
   public boolean method_3101() {
      return this.field_2451.method_671();
   }

   // $VF: renamed from: c () boolean
   public boolean method_3102() {
      return method_3135();
   }

   // $VF: renamed from: n () boolean
   public boolean method_3103() {
      return method_3136();
   }

   // $VF: renamed from: o () boolean
   public boolean method_3104() {
      return this.field_2452.method_671();
   }

   // $VF: renamed from: p () boolean
   public boolean method_3105() {
      return this.field_2453.method_671();
   }

   // $VF: renamed from: q () boolean
   public boolean method_3106() {
      return this.field_2454.method_671();
   }

   // $VF: renamed from: a () float
   public float method_3107() {
      return this.field_2455.method_671().floatValue();
   }

   // $VF: renamed from: b () float
   public float method_3108() {
      return this.field_2456.method_671().floatValue();
   }

   // $VF: renamed from: a (java.lang.String, double) double
   public double method_3109(String moduleName, double fallback) {
      if (moduleName == null) {
         return fallback;
      } else {
         return switch (moduleName) {
            case "AnchorAura" -> this.method_3133(this.field_2457);
            case "CrystalAura" -> this.method_3133(this.field_2458);
            case "KillAura" -> this.method_3133(this.field_2459);
            case "Sprint" -> this.method_3133(this.field_2460);
            case "Speed" -> this.method_3133(this.field_2461);
            case "PearlPhase" -> this.method_3133(this.field_2462);
            case "AutoEXP" -> this.method_3133(this.field_2463);
            case "Elytra" -> this.method_3133(this.field_2464);
            case "Surround" -> this.method_3133(this.field_2465);
            default -> fallback;
         };
      }
   }

   // $VF: renamed from: r () boolean
   public boolean method_3110() {
      return this.field_2466.method_671();
   }

   // $VF: renamed from: a () int
   public int method_3111() {
      return this.method_3110() ? this.field_2467.method_671() : 0;
   }

   // $VF: renamed from: b () int
   public int method_3112() {
      return this.method_3110() ? this.field_2468.method_671() : 0;
   }

   // $VF: renamed from: s () boolean
   public boolean method_3113() {
      return this.method_3110() && this.field_2469.method_671();
   }

   // $VF: renamed from: t () boolean
   public boolean method_3114() {
      return method_3137();
   }

   // $VF: renamed from: u () boolean
   public boolean method_3115() {
      return method_3138();
   }

   // $VF: renamed from: v () boolean
   public boolean method_3116() {
      return method_3139();
   }

   // $VF: renamed from: b () double
   public double method_3117() {
      return this.field_2438.method_671();
   }

   // $VF: renamed from: c () double
   public double method_3118() {
      return this.field_2439.method_671();
   }

   // $VF: renamed from: c () int
   public int method_3119() {
      return method_3142();
   }

   // $VF: renamed from: d () int
   public int method_3120() {
      return this.field_2440.method_671();
   }

   // $VF: renamed from: e () int
   public int method_3121() {
      return this.field_2441.method_671();
   }

   // $VF: renamed from: w () boolean
   public boolean method_3122() {
      return this.field_2442.method_671();
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   public void method_3123(String format, Object... args) {
      if (this.method_3122()) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647(
            Formatting.field_1080 + "[BlockPlacement] " + Formatting.field_1068 + String.format(Locale.ROOT, format, args)
         );
      }
   }

   // $VF: renamed from: f () int
   public int method_3124() {
      return switch ((Class9.Inner1)this.field_2429.method_671()) {
         case None -> 0;
         case PaperMC -> method_3144();
         case Custom -> this.field_2430.method_671();
      };
   }

   // $VF: renamed from: b () long
   public long method_3125() {
      return switch ((Class9.Inner1)this.field_2429.method_671()) {
         case None -> 0L;
         case PaperMC -> this.method_3134(method_3145());
         case Custom -> this.method_3134(this.field_2431.method_671());
      };
   }

   // $VF: renamed from: g () int
   public int method_3126() {
      return switch ((Class9.Inner1)this.field_2432.method_671()) {
         case None -> 0;
         case PaperMC -> method_3146();
         case Custom -> this.field_2433.method_671();
      };
   }

   // $VF: renamed from: c () long
   public long method_3127() {
      return switch ((Class9.Inner1)this.field_2432.method_671()) {
         case None -> 0L;
         case PaperMC -> this.method_3134(method_3147());
         case Custom -> this.method_3134(this.field_2434.method_671());
      };
   }

   // $VF: renamed from: h () int
   public int method_3128() {
      return switch ((Class9.Inner1)this.field_2435.method_671()) {
         case None -> 0;
         case PaperMC -> method_3148();
         case Custom -> this.field_2436.method_671();
      };
   }

   // $VF: renamed from: d () long
   public long method_3129() {
      return switch ((Class9.Inner1)this.field_2435.method_671()) {
         case None -> 0L;
         case PaperMC -> this.method_3134(method_3149());
         case Custom -> this.method_3134(this.field_2437.method_671());
      };
   }

   // $VF: renamed from: x () boolean
   public boolean method_3130() {
      return this.field_2429.method_671() != Class9.Inner1.None;
   }

   // $VF: renamed from: y () boolean
   public boolean method_3131() {
      return this.field_2432.method_671() != Class9.Inner1.None;
   }

   // $VF: renamed from: z () boolean
   public boolean method_3132() {
      return this.field_2435.method_671() != Class9.Inner1.None;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) double
   private double method_3133(Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> var1) {
      return ((Class7.Inner1)var1.method_671()).method_1120();
   }

   // $VF: renamed from: a (double) long
   private long method_3134(double var1) {
      return Math.max(1L, Math.round(var1 * 1000.0));
   }

   // $VF: renamed from: A () boolean
   private static boolean method_3135() {
      return false;
   }

   // $VF: renamed from: B () boolean
   private static boolean method_3136() {
      return true;
   }

   // $VF: renamed from: C () boolean
   private static boolean method_3137() {
      return false;
   }

   // $VF: renamed from: D () boolean
   private static boolean method_3138() {
      return true;
   }

   // $VF: renamed from: E () boolean
   private static boolean method_3139() {
      return true;
   }

   // $VF: renamed from: d () double
   private static double method_3140() {
      return 0.05;
   }

   // $VF: renamed from: e () double
   private static double method_3141() {
      return 6.0;
   }

   // $VF: renamed from: i () int
   private static int method_3142() {
      return 30;
   }

   // $VF: renamed from: j () int
   private static int method_3143() {
      return 300;
   }

   // $VF: renamed from: k () int
   private static int method_3144() {
      return 1249;
   }

   // $VF: renamed from: f () double
   private static double method_3145() {
      return 4.0;
   }

   // $VF: renamed from: l () int
   private static int method_3146() {
      return 121;
   }

   // $VF: renamed from: g () double
   private static double method_3147() {
      return 0.5;
   }

   // $VF: renamed from: m () int
   private static int method_3148() {
      return 79;
   }

   // $VF: renamed from: h () double
   private static double method_3149() {
      return 4.2;
   }

   public static enum Inner1 {
      None,
      PaperMC,
      Custom;
   }
}
