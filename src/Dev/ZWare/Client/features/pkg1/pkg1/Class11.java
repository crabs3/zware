package Dev.ZWare.Client.features.pkg1.pkg1;

public class Class11 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg1.Class11
   private static Class11 field_2683;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2684 = this.a("Mouse Drag Move", true);

   public Class11() {
      super("Inventory Tweaks", "Inventory Tweaks", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, false, false, false);
      field_2683 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg1.Class11
   public static Class11 method_3379() {
      if (field_2683 == null) {
         field_2683 = new Class11();
      }

      return field_2683;
   }
}
