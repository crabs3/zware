package Dev.ZWare.Client.features.pkg1.pkg4;

import java.util.List;

public class Class10 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg4.Class10
   private static Class10 field_2525;
   // $VF: renamed from: p java.lang.String
   public static final String field_2526 = "Lexend Deca";
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<String> field_2527 = this.a("Family", "Lexend Deca");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2528 = this.a("Size", 14, 6, 32);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2529 = this.a("Oversample", 3.0F, 1.0F, 4.0F);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2530 = this.a("Shadow", true);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2531 = this.a("Override Minecrafts Font", false);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2532 = this.a("Anti Alias", true);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2533 = this.a("Fractional Metrics", true);

   public Class10() {
      super("Font", "Renders GUI and HUD text with a system font.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, false, false, false);
      field_2525 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class10
   public static Class10 method_3214() {
      return field_2525;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.d() && Dev.ZWare.Client.Class1.field_297 != null ? Dev.ZWare.Client.Class1.field_297.method_836() : null;
   }

   // $VF: renamed from: b () java.util.List
   public List<String> method_3215() {
      return Dev.ZWare.Client.Class1.field_297 != null ? Dev.ZWare.Client.Class1.field_297.method_835() : List.of("Lexend Deca");
   }
}
