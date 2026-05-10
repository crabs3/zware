package Dev.ZWare.Client.features.pkg1.pkg4;

public class Class12 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class12
   private static Class12 field_1414;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1415 = this.a("Ticks", 3, 0, 20);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1416 = this.a("Elytra Ticks", 3, 0, 20);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1417 = this.a("Ground Raycast", true);

   public Class12() {
      super(
         "Predictions",
         "Global prediction engine settings for AutoTrap, FallBlocker, etc.",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT,
         false,
         false,
         false
      );
      field_1414 = this;
      this.field_1416.method_709(var1 -> this.d());
      this.field_1417.method_709(var1 -> this.d());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class12
   public static Class12 method_2045() {
      if (field_1414 == null) {
         field_1414 = new Class12();
      }

      return field_1414;
   }

   // $VF: renamed from: a () boolean
   public static boolean method_2046() {
      Class9 var0 = Class9.method_3092();
      return var0 != null && var0.method_3110();
   }

   // $VF: renamed from: a () int
   public static int method_2047() {
      Class9 var0 = Class9.method_3092();
      return var0 != null ? var0.method_3111() : 0;
   }

   // $VF: renamed from: b () int
   public static int method_2048() {
      Class9 var0 = Class9.method_3092();
      return var0 != null ? var0.method_3112() : 0;
   }

   // $VF: renamed from: b () boolean
   public static boolean method_2049() {
      Class9 var0 = Class9.method_3092();
      return var0 != null && var0.method_3113();
   }
}
