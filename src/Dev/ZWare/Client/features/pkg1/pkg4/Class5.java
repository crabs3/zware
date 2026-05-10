package Dev.ZWare.Client.features.pkg1.pkg4;

public class Class5 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class5.Inner1> field_1404 = this.a("Swap", Class5.Inner1.Auto);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1405 = this.a("No Screen Close", false);

   public Class5() {
      super("Inventory", "Shared inventory swap settings.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, false, false, false);
   }

   public static enum Inner1 {
      None,
      Auto,
      SilentHotbar,
      SilentSwap;
   }
}
