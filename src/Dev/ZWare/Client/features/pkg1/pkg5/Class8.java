package Dev.ZWare.Client.features.pkg1.pkg5;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;

public class Class8 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg5.Class8
   private static Class8 field_1910;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1911 = this.a("No Item Shadow", false);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1912 = this.a("No Sway", false);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1913 = this.a("Anchor Eating Animation", false);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1914 = this.a("Old Animations", false);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1915 = this.a("Custom Animations", false);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class8.Inner2> field_1916 = this.a("Custom Animation Mode", Class8.Inner2.Default);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1917 = this.a("Disable Swap Main", true);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1918 = this.a("Disable Swap Off", true);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1919 = this.a("Swing Speed", 1.0F, 0.1F, 5.0F);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class8.Inner1> field_1920 = this.a("Swing Hand", Class8.Inner1.Mainhand);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1921 = this.a("Translate X", 0.0F, -2.0F, 2.0F);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1922 = this.a("Translate Y", 0.0F, -2.0F, 2.0F);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1923 = this.a("Translate Z", 0.0F, -2.0F, 2.0F);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1924 = this.a("Rotate X", 0.0F, -180.0F, 180.0F);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1925 = this.a("Rotate Y", 0.0F, -180.0F, 180.0F);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1926 = this.a("Rotate Z", 0.0F, -180.0F, 180.0F);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1927 = this.a("Scale X", 1.0F, 0.1F, 4.0F);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1928 = this.a("Scale Y", 1.0F, 0.1F, 4.0F);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1929 = this.a("Scale Z", 1.0F, 0.1F, 4.0F);
   // $VF: renamed from: I boolean
   public boolean field_1930;

   public Class8() {
      super("View Model", "make yo hands be big or small like my penis", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      field_1910 = this;
      this.field_1916.method_709(var1 -> this.field_1915.method_671());
      this.field_1917.method_709(var1 -> this.field_1914.method_671() || this.field_1915.method_671());
      this.field_1918.method_709(var1 -> this.field_1914.method_671() || this.field_1915.method_671());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class8
   public static Class8 method_2548() {
      return field_1910;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_2549(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var1) {
      if (var1.method_1045() instanceof HandSwingC2SPacket) {
         this.field_1930 = !this.field_1930;
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_2550() {
      return this.d() && this.field_1911.method_671();
   }

   // $VF: renamed from: b () boolean
   public boolean method_2551() {
      return this.d() && this.field_1912.method_671();
   }

   // $VF: renamed from: c () boolean
   public boolean method_2552() {
      return this.d() && this.field_1913.method_671();
   }

   // $VF: renamed from: n () boolean
   public boolean method_2553() {
      return this.d() && this.field_1914.method_671() && !this.field_1915.method_671();
   }

   // $VF: renamed from: o () boolean
   public boolean method_2554() {
      return this.d() && this.field_1915.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class8$Inner2
   public Class8.Inner2 method_2555() {
      return this.field_1916.method_671();
   }

   // $VF: renamed from: p () boolean
   public boolean method_2556() {
      return this.d() && (this.field_1914.method_671() || this.field_1915.method_671()) && this.field_1917.method_671();
   }

   // $VF: renamed from: q () boolean
   public boolean method_2557() {
      return this.d() && (this.field_1914.method_671() || this.field_1915.method_671()) && this.field_1918.method_671();
   }

   // $VF: renamed from: a () float
   public float method_2558() {
      return this.d() ? this.field_1919.method_671() : 1.0F;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class8$Inner1
   public Class8.Inner1 method_2559() {
      return this.field_1920.method_671();
   }

   public static enum Inner1 {
      Mainhand,
      Offhand;
   }

   public static enum Inner2 {
      Default,
      // $VF: renamed from: One Dev.ZWare.Client.features.pkg1.pkg5.Class8$Inner2
      field_644,
      // $VF: renamed from: Two Dev.ZWare.Client.features.pkg1.pkg5.Class8$Inner2
      field_645,
      Three,
      Four,
      Five,
      // $VF: renamed from: Six Dev.ZWare.Client.features.pkg1.pkg5.Class8$Inner2
      field_646,
      Seven,
      Eight,
      Nine,
      // $VF: renamed from: Ten Dev.ZWare.Client.features.pkg1.pkg5.Class8$Inner2
      field_647,
      Eleven,
      Twelve,
      Thirteen,
      Fourteen;
   }
}
