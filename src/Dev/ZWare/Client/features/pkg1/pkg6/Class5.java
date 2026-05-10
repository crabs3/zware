package Dev.ZWare.Client.features.pkg1.pkg6;

public class Class5 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg6.Class5
   private static Class5 field_1278;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1279 = this.a("Position Look", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1280 = this.a("Player Rotation", true);

   public Class5() {
      super("No Rotate", "stops hause from forcing rotations on your ass", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, false, false, false);
      field_1278 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class5
   public static Class5 method_1957() {
      return field_1278;
   }

   // $VF: renamed from: a () boolean
   public boolean method_1958() {
      return this.d() && this.field_1279.method_671();
   }

   // $VF: renamed from: b () boolean
   public boolean method_1959() {
      return this.d() && this.field_1280.method_671();
   }
}
