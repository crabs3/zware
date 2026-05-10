package Dev.ZWare.Client.features.pkg1.pkg5;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Class9 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_1902 = 420;
   // $VF: renamed from: p int
   private static final int field_1903 = 220;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg1.pkg5.Class9
   private static Class9 field_1904;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_1905 = this.a("Mode", Class9.Inner1.Gamma);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1906 = this.a("Gamma", 16.0, 1.0, 100.0);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg1.pkg5.Class9$Inner1
   private Class9.Inner1 field_1907;
   // $VF: renamed from: u java.lang.Double
   private Double field_1908;
   // $VF: renamed from: v net.minecraft.entity.effect.StatusEffectInstance
   private StatusEffectInstance field_1909;

   public Class9() {
      super("FullBright", "let there be light nigger", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_1904 = this;
      this.field_1906.method_709(var1 -> this.field_1905.method_671() == Class9.Inner1.Gamma);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class9
   public static Class9 method_2540() {
      return field_1904;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1907 = null;
      this.method_2543();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2545(this.field_1907);
      this.field_1907 = null;
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      this.method_2543();
      if (this.field_1905.method_671() == Class9.Inner1.Gamma) {
         this.method_2546();
      } else if (c.field_1724 != null) {
         this.method_2547();
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_1905.method_671().name();
   }

   // $VF: renamed from: a () boolean
   public boolean method_2541() {
      return this.d() && this.field_1905.method_671() == Class9.Inner1.Gamma;
   }

   // $VF: renamed from: a () float
   public float method_2542() {
      return this.field_1906.method_671().floatValue();
   }

   // $VF: renamed from: n () void
   private void method_2543() {
      Class9.Inner1 var1 = this.field_1905.method_671();
      if (this.field_1907 != var1) {
         this.method_2545(this.field_1907);
         this.method_2544(var1);
         this.field_1907 = var1;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class9$Inner1) void
   private void method_2544(Class9.Inner1 var1) {
      if (var1 == Class9.Inner1.Gamma) {
         if (c.field_1690 != null) {
            this.field_1908 = (Double)c.field_1690.method_42473().method_41753();
            this.method_2546();
         }
      } else if (c.field_1724 == null) {
         this.field_1909 = null;
      } else {
         StatusEffectInstance var2 = c.field_1724.method_6112(StatusEffects.field_5925);
         this.field_1909 = var2 != null ? new StatusEffectInstance(var2) : null;
         this.method_2547();
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg5.Class9$Inner1) void
   private void method_2545(Class9.Inner1 var1) {
      if (var1 != null) {
         if (var1 == Class9.Inner1.Gamma) {
            if (c.field_1690 != null && this.field_1908 != null) {
               c.field_1690.method_42473().method_41748(this.field_1908);
            }

            this.field_1908 = null;
         } else if (c.field_1724 == null) {
            this.field_1909 = null;
         } else {
            if (this.field_1909 != null) {
               c.field_1724.method_6092(new StatusEffectInstance(this.field_1909));
            } else {
               c.field_1724.method_6016(StatusEffects.field_5925);
            }

            this.field_1909 = null;
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2546() {
      if (c.field_1690 != null) {
         c.field_1690.method_42473().method_41748(1.0);
      }
   }

   // $VF: renamed from: p () void
   private void method_2547() {
      StatusEffectInstance var1 = c.field_1724.method_6112(StatusEffects.field_5925);
      if (var1 == null || var1.method_5584() < 220) {
         c.field_1724.method_6092(new StatusEffectInstance(StatusEffects.field_5925, 420, 0, false, false, false));
      }
   }

   public static enum Inner1 {
      Gamma,
      Potion;
   }
}
