package Dev.ZWare.Client.features.pkg1.pkg4;

public class Class6 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class6
   private static Class6 field_1454;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class6.Inner1> field_1455 = this.a("Mode", Class6.Inner1.field_620);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1456 = this.a("FastLatency", 3000, 250, 10000);

   public Class6() {
      super("Latency", "Shared ping display settings.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, false, false, false);
      this.field_1456.method_709(var1 -> this.field_1455.method_671() == Class6.Inner1.QueryPing);
      field_1454 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class6
   public static Class6 method_2079() {
      if (field_1454 == null) {
         field_1454 = new Class6();
      }

      return field_1454;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class6$Inner1
   public Class6.Inner1 method_2080() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3096() : this.field_1455.method_671();
   }

   // $VF: renamed from: a () long
   public long method_2081() {
      Class9 var1 = Class9.method_3092();
      return var1 != null ? var1.method_3097() : this.field_1456.method_671().intValue();
   }

   public static enum Inner1 {
      // $VF: renamed from: Tab Dev.ZWare.Client.features.pkg1.pkg4.Class6$Inner1
      field_620,
      QueryPing;
   }
}
