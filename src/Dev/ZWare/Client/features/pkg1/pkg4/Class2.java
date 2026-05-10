package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.features.gui.HudEditorScreen;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;

public class Class2 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class2
   private static Class2 field_2065;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner1> field_2066 = this.a("Layout Mode", Class2.Inner1.Managed);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2067 = this.a("Safe Corners", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2068 = this.a("Safe Corner Size", 6, 0, 40);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2069 = this.a("Snapping", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2070 = this.a("Snap Range", 6, 1, 20);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2071 = this.a("Animations", true);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2072 = this.a("Animation Speed", 0.35F, 0.05F, 1.0F);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner2> field_2073 = this.a("Number Animation Mode", Class2.Inner2.SlotMachine);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2074 = this.a("Number Animation Speed", 1.25F, 0.25F, 4.0F);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2075 = this.a("Rainbow", false);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2076 = this.a("Rainbow Delay", 240, 0, 600);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2077 = this.a("Rainbow Brightness", 150.0F, 1.0F, 255.0F);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2078 = this.a("Rainbow Saturation", 150.0F, 1.0F, 255.0F);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2079 = this.a("Text Glow", false);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2080 = this.a("Glow Radius", 1, 1, 4);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2081 = this.a("Glow Alpha", 0.35F, 0.05F, 1.0F);

   public Class2() {
      super("Hud", "Edit HUD element positions", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, true, false, false);
      this.field_2068.method_709(var1 -> this.field_2067.method_671());
      this.field_2070.method_709(var1 -> this.field_2069.method_671());
      this.field_2072.method_709(var1 -> this.field_2071.method_671());
      this.field_2074.method_709(var1 -> this.field_2073.method_671() == Class2.Inner2.SlotMachine);
      this.field_2076.method_709(var1 -> this.field_2075.method_671());
      this.field_2077.method_709(var1 -> this.field_2075.method_671());
      this.field_2078.method_709(var1 -> this.field_2075.method_671());
      this.field_2080.method_709(var1 -> this.field_2079.method_671());
      this.field_2081.method_709(var1 -> this.field_2079.method_671());
      field_2065 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class2
   public static Class2 method_2695() {
      return field_2065;
   }

   // $VF: renamed from: a () int
   public int method_2696() {
      return this.field_2067.method_671() ? this.field_2068.method_671() : 0;
   }

   // $VF: renamed from: a () boolean
   public boolean method_2697() {
      return this.field_2066.method_671() == Class2.Inner1.Custom;
   }

   // $VF: renamed from: b () boolean
   public boolean method_2698() {
      return this.field_2069.method_671();
   }

   // $VF: renamed from: b () int
   public int method_2699() {
      return this.field_2069.method_671() ? this.field_2070.method_671() : 0;
   }

   // $VF: renamed from: c () boolean
   public boolean method_2700() {
      return this.field_2071.method_671();
   }

   // $VF: renamed from: a () float
   public float method_2701() {
      return this.field_2071.method_671() ? this.field_2072.method_671() : 1.0F;
   }

   // $VF: renamed from: n () boolean
   public boolean method_2702() {
      return this.field_2073.method_671() == Class2.Inner2.SlotMachine;
   }

   // $VF: renamed from: b () float
   public float method_2703() {
      return this.field_2073.method_671() == Class2.Inner2.SlotMachine ? this.field_2074.method_671() : 0.0F;
   }

   // $VF: renamed from: o () boolean
   public boolean method_2704() {
      return this.field_2079.method_671();
   }

   // $VF: renamed from: p () boolean
   public boolean method_2705() {
      return this.field_2075.method_671();
   }

   // $VF: renamed from: c () int
   public int method_2706() {
      return this.field_2076.method_671();
   }

   // $VF: renamed from: c () float
   public float method_2707() {
      return this.field_2077.method_671();
   }

   // $VF: renamed from: d () float
   public float method_2708() {
      return this.field_2078.method_671();
   }

   // $VF: renamed from: d () int
   public int method_2709() {
      return this.field_2079.method_671() ? this.field_2080.method_671() : 0;
   }

   // $VF: renamed from: e () float
   public float method_2710() {
      return this.field_2079.method_671() ? this.field_2081.method_671() : 0.0F;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      if (g()) {
         this.k();
      } else {
         c.method_1507(Dev.ZWare.Client.Class1.field_320);
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      if (!g()) {
         c.method_1507(null);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class4) void
   @iFT13zrx_wTXP
   public void method_2711(Dev.ZWare.Client.pkg2.pkg1.Class4 event) {
      if (!g()) {
         if (!(c.field_1755 instanceof HudEditorScreen)) {
            this.k();
         }
      }
   }

   private static enum Inner1 {
      Managed,
      Custom;
   }

   private static enum Inner2 {
      None,
      SlotMachine;
   }
}
