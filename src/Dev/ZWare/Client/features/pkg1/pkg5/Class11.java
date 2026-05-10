package Dev.ZWare.Client.features.pkg1.pkg5;

public class Class11 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg5.Class11
   private static Class11 field_2056;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2057 = this.a("Spin", 1.0F, 0.0F, 10.0F);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2058 = this.a("Bounce", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2059 = this.a("Scale", 1.0F, 0.1F, 1.5F);

   public Class11() {
      super("Models", "Customize crystal model rendering.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_2056 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class11
   public static Class11 method_2686() {
      return field_2056;
   }

   // $VF: renamed from: a () float
   public float method_2687() {
      return this.d() ? this.field_2057.method_671() : 1.0F;
   }

   // $VF: renamed from: a () boolean
   public boolean method_2688() {
      return !this.d() || this.field_2058.method_671();
   }

   // $VF: renamed from: b () float
   public float method_2689() {
      return this.d() ? this.field_2059.method_671() : 1.0F;
   }
}
