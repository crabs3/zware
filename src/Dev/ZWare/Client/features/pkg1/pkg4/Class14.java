package Dev.ZWare.Client.features.pkg1.pkg4;

public class Class14 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class14
   private static Class14 field_1509;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner3> field_1510 = this.a("Kill Aura", Class14.Inner3.None);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner1> field_1511 = this.a("Phase", Class14.Inner1.Normal);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class14.Inner2> field_1512 = this.a("Pearl", Class14.Inner2.AltSilent);

   public Class14() {
      super("Multi Task", "Shared multitask behavior for combat and mining modules.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, false, false, false);
      field_1509 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14
   public static Class14 method_2110() {
      if (field_1509 == null) {
         field_1509 = new Class14();
      }

      return field_1509;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner3
   public Class14.Inner3 method_2111() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3098() : this.field_1510.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner1
   public Class14.Inner1 method_2112() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3099() : this.field_1511.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner2
   public Class14.Inner2 method_2113() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3100() : this.field_1512.method_671();
   }

   public static enum Inner1 {
      Normal,
      Offhand,
      AltSilent;
   }

   public static enum Inner2 {
      Offhand,
      AltSilent,
      None;
   }

   public static enum Inner3 {
      AltSilent,
      Offhand,
      None;
   }
}
