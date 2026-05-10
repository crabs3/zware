package Dev.ZWare.Client.features.pkg1.pkg5;

import java.awt.Color;

public class Class17 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o java.awt.Color
   private static final Color field_1941 = new Color(255, 215, 80, 255);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg1.pkg5.Class17
   private static Class17 field_1942;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1943 = this.a("Friends", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1944 = this.a("Self", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1945 = this.a("Enemies", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1946 = this.a("No Bloat", false);

   public Class17() {
      super("Tab", "tweaks tab and adds like friends and enemies to it", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_1942 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class17
   public static Class17 method_2576() {
      return field_1942;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.Class12$Inner1) boolean
   public boolean method_2577(Dev.ZWare.Client.pkg1.Class12.Inner1 relation) {
      return switch (relation) {
         case SELF -> this.field_1944.method_671();
         case FRIEND -> this.field_1943.method_671();
         case ENEMY -> this.field_1945.method_671();
         case NONE -> false;
      };
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg1.Class12$Inner1) boolean
   public boolean method_2578(Dev.ZWare.Client.pkg1.Class12.Inner1 relation) {
      return switch (relation) {
         case SELF -> this.field_1944.method_671();
         case FRIEND -> this.field_1943.method_671();
         case ENEMY -> this.field_1945.method_671();
         case NONE -> false;
      };
   }

   // $VF: renamed from: a () boolean
   public boolean method_2579() {
      return this.d() && this.field_1946.method_671();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.Class12$Inner1) int
   public int method_2580(Dev.ZWare.Client.pkg1.Class12.Inner1 relation) {
      Class3 var2 = Class3.method_2315();

      return switch (relation) {
         case SELF -> field_1941.getRGB();
         case FRIEND -> var2 != null ? var2.method_2316() : new Color(85, 200, 255, 255).getRGB();
         case ENEMY -> var2 != null ? var2.method_2317() : new Color(255, 90, 90, 255).getRGB();
         case NONE -> Color.WHITE.getRGB();
      };
   }
}
