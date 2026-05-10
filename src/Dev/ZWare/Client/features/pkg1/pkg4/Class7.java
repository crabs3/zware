package Dev.ZWare.Client.features.pkg1.pkg4;

public class Class7 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class7
   private static Class7 field_2667;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2668 = this.a("TickSync", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2669 = this.a("GrimSnap", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2670 = this.a("Sync Rotation", false);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2671 = this.a("Smooth", false);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2672 = this.a("SmoothYawStep", 22.0, 1.0, 180.0);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2673 = this.a("SmoothPitchStep", 10.0, 1.0, 90.0);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2674 = this.a("AnchorAura", Class7.Inner1.Highest).method_683("Priority");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2675 = this.a("CrystalAura", Class7.Inner1.Highest).method_683("Priority");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2676 = this.a("KillAura", Class7.Inner1.Highest).method_683("Priority");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2677 = this.a("Sprint", Class7.Inner1.VeryHigh).method_683("Priority");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2678 = this.a("Speed", Class7.Inner1.field_608).method_683("Priority");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2679 = this.a("PearlPhase", Class7.Inner1.High).method_683("Priority");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2680 = this.a("AutoEXP", Class7.Inner1.Normal).method_683("Priority");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2681 = this.a("Elytra", Class7.Inner1.Normal).method_683("Priority");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2682 = this.a("Surround", Class7.Inner1.field_608).method_683("Priority");

   public Class7() {
      super("Rotations", "Shared rotation manager settings.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, false, false, false);
      this.field_2672.method_709(var1 -> this.field_2671.method_671());
      this.field_2673.method_709(var1 -> this.field_2671.method_671());
      field_2667 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class7
   public static Class7 method_3369() {
      if (field_2667 == null) {
         field_2667 = new Class7();
      }

      return field_2667;
   }

   // $VF: renamed from: a () boolean
   public boolean method_3370() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3101() : this.field_2668.method_671();
   }

   // $VF: renamed from: b () boolean
   public boolean method_3371() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3104() : this.field_2669.method_671();
   }

   // $VF: renamed from: c () boolean
   public boolean method_3372() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3105() : this.field_2670.method_671();
   }

   // $VF: renamed from: n () boolean
   public boolean method_3373() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3106() : this.field_2671.method_671();
   }

   // $VF: renamed from: a () float
   public float method_3374() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3107() : this.field_2672.method_671().floatValue();
   }

   // $VF: renamed from: b () float
   public float method_3375() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3108() : this.field_2673.method_671().floatValue();
   }

   // $VF: renamed from: a (java.lang.String, double) double
   public static double method_3376(String moduleName, double fallback) {
      Class9 var3 = Class9.method_3092();
      if (var3 != null) {
         return var3.method_3109(moduleName, fallback);
      } else {
         Class7 var4 = method_3369();
         return var4 != null ? var4.method_3377(moduleName, fallback) : fallback;
      }
   }

   // $VF: renamed from: b (java.lang.String, double) double
   public double method_3377(String moduleName, double fallback) {
      Class9 var4 = Class9.method_3092();
      if (var4 != null) {
         return var4.method_3109(moduleName, fallback);
      } else if (moduleName == null) {
         return fallback;
      } else {
         return switch (moduleName) {
            case "AnchorAura" -> this.method_3378(this.field_2674);
            case "CrystalAura" -> this.method_3378(this.field_2675);
            case "KillAura" -> this.method_3378(this.field_2676);
            case "Sprint" -> this.method_3378(this.field_2677);
            case "Speed" -> this.method_3378(this.field_2678);
            case "PearlPhase" -> this.method_3378(this.field_2679);
            case "AutoEXP" -> this.method_3378(this.field_2680);
            case "Elytra" -> this.method_3378(this.field_2681);
            case "Surround" -> this.method_3378(this.field_2682);
            default -> fallback;
         };
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) double
   private double method_3378(Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> var1) {
      return ((Class7.Inner1)var1.method_671()).method_1120();
   }

   public static enum Inner1 {
      Lowest(0.0),
      // $VF: renamed from: Low Dev.ZWare.Client.features.pkg1.pkg4.Class7$Inner1
      field_608(25.0),
      Normal(50.0),
      High(75.0),
      VeryHigh(90.0),
      Highest(100.0),
      Critical(125.0);

      // $VF: renamed from: a double
      private final double field_609;

      private Inner1(double var3) {
         this.field_609 = var3;
      }

      // $VF: renamed from: a () double
      public double method_1120() {
         return this.field_609;
      }
   }
}
