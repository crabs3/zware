package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Formatting;

public class Class17 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class17.Inner2> field_3083 = this.a("Color", Class17.Inner2.DEFAULT);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3084 = this.a("Icons", false);

   public Class17() {
      super("Potions", "Displays the status effects the local player has.", 80.0F, 20.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      if (g()) {
         this.a(0.0F);
         this.b(0.0F);
      } else {
         ArrayList var2 = new ArrayList();

         for (StatusEffectInstance var4 : c.field_1724.method_6026()) {
            RegistryEntry var5 = var4.method_5579();
            StatusEffect var6 = (StatusEffect)var5.comp_349();
            String var7 = var6.method_5560().getString();
            String var8 = this.method_3787(var6, var4);
            int var9 = this.method_3789(var6);
            Sprite var10 = this.field_3084.method_671() ? c.method_18505().method_18663(var5) : null;
            var2.add(new Class17.Inner1(var7, var8, var9, var10));
         }

         var2.sort(Comparator.comparing(Class17.Inner1::bD, String.CASE_INSENSITIVE_ORDER));
         if (var2.isEmpty() && !this.n()) {
            this.a(0.0F);
            this.b(0.0F);
         } else {
            float var12 = Math.max(Dev.ZWare.Client.pkg1.pkg2.Class1.method_134(), 12) + 1.0F;
            float var13 = 0.0F;

            for (Class17.Inner1 var17 : var2) {
               var13 = Math.max(var13, (var17.method_1285() != null ? 13.0F : 0.0F) + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var17.method_1283()));
            }

            this.a(var2.isEmpty() ? 80.0F : var13, var2.isEmpty() ? Dev.ZWare.Client.pkg1.pkg2.Class1.method_134() : var2.size() * var12, o);
            super.method_3643(e);
            float var16 = this.f();
            var13 = 0.0F;

            for (int var18 = 0; var18 < var2.size(); var18++) {
               Class17.Inner1 var19 = (Class17.Inner1)var2.get(var18);
               float var20 = var16 + var18 * var12;
               float var21 = (var19.method_1285() != null ? 13.0F : 0.0F) + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var19.method_1283());
               float var22 = this.a(var21);
               if (var19.method_1285() != null) {
                  e.method_1053().method_52709(RenderLayer::method_62277, var19.method_1285(), Math.round(var22), Math.round(var20 - 1.0F), 11, 11);
               }

               float var11 = var22 + (var19.method_1285() != null ? 13.0F : 0.0F);
               this.a(e.method_1053(), "potion-" + var19.method_1282(), var19.method_1283(), var11, var20, var19.method_1284());
               var13 = Math.max(var13, var21);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.effect.StatusEffect, net.minecraft.entity.effect.StatusEffectInstance) java.lang.String
   private String method_3787(StatusEffect var1, StatusEffectInstance var2) {
      String var3 = var2.method_5578() > 0 ? " " + (var2.method_5578() + 1) : "";
      return var1.method_5560().getString() + var3 + " " + Formatting.field_1068 + this.method_3788(var2);
   }

   // $VF: renamed from: a (net.minecraft.entity.effect.StatusEffectInstance) java.lang.String
   private String method_3788(StatusEffectInstance var1) {
      if (var1.method_48559()) {
         return "*:*";
      } else {
         int var2 = var1.method_5584();
         int var3 = var2 / 1200;
         int var4 = var2 % 1200 / 20;
         return var3 + ":" + (var4 < 10 ? "0" + var4 : Integer.toString(var4));
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.effect.StatusEffect) int
   private int method_3789(StatusEffect var1) {
      return switch ((Class17.Inner2)this.field_3083.method_671()) {
         case DEFAULT -> this.method_3790(var1.method_5556());
         case field_639 -> {
            String var2 = Registries.field_41174.method_10221(var1).method_12832();

            yield this.method_3790(switch (var2) {
               case "speed" -> 8171462;
               case "slowness" -> 5926017;
               case "haste" -> 14270531;
               case "mining_fatigue" -> 4866583;
               case "strength" -> 9643043;
               case "instant_health" -> 16262179;
               case "instant_damage" -> 4393481;
               case "jump_boost" -> 2293580;
               case "nausea" -> 5578058;
               case "regeneration" -> 13458603;
               case "resistance" -> 10044730;
               case "fire_resistance" -> 14981690;
               case "water_breathing" -> 3035801;
               case "invisibility" -> 8356754;
               case "blindness" -> 2039587;
               case "night_vision" -> 2039713;
               case "hunger" -> 5797459;
               case "weakness" -> 4738376;
               case "poison" -> 5149489;
               case "wither" -> 3484199;
               case "health_boost" -> 16284963;
               case "absorption" -> 2445989;
               case "saturation" -> 16262179;
               case "glowing" -> 9740385;
               case "levitation" -> 13565951;
               case "luck" -> 3381504;
               case "unluck" -> 12624973;
               default -> var1.method_5556();
            });
         }
         case THEME -> Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      };
   }

   // $VF: renamed from: b (int) int
   private int method_3790(int var1) {
      return 0xFF000000 | var1 & 16777215;
   }

   // $VF: renamed from: c () boolean
   @Override
   protected boolean method_3663() {
      return this.n() || c.field_1724 != null && !c.field_1724.method_6026().isEmpty();
   }

   private record Inner1(String bD, String bE, int bF, Sprite bG) {
      // $VF: renamed from: bD java.lang.String
      private final String field_768;
      // $VF: renamed from: bE java.lang.String
      private final String field_769;
      // $VF: renamed from: bF int
      private final int field_770;
      // $VF: renamed from: bG net.minecraft.client.texture.Sprite
      private final Sprite field_771;

      private Inner1(String bD, String bE, int bF, Sprite bG) {
         this.field_768 = bD;
         this.field_769 = bE;
         this.field_770 = bF;
         this.field_771 = bG;
      }

      // $VF: renamed from: bD () java.lang.String
      public String method_1282() {
         return this.field_768;
      }

      // $VF: renamed from: bE () java.lang.String
      public String method_1283() {
         return this.field_769;
      }

      // $VF: renamed from: bF () int
      public int method_1284() {
         return this.field_770;
      }

      // $VF: renamed from: bG () net.minecraft.client.texture.Sprite
      public Sprite method_1285() {
         return this.field_771;
      }
   }

   private static enum Inner2 {
      DEFAULT,
      // $VF: renamed from: OLD Dev.ZWare.Client.features.pkg1.pkg7.Class17$Inner2
      field_639,
      THEME;
   }
}
