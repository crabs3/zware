package Dev.ZWare.Client.features.pkg1.pkg5;

import java.awt.Color;
import java.util.List;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

public class Class7 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o java.lang.String
   private static final String field_1586 = "hands";
   // $VF: renamed from: p java.lang.String
   private static final String field_1587 = "held_item";
   // $VF: renamed from: q java.lang.String
   private static final String field_1588 = "players";
   // $VF: renamed from: r java.lang.String
   private static final String field_1589 = "end_crystals";
   // $VF: renamed from: s java.lang.String
   private static final String field_1590 = "items";
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg1.pkg5.Class7
   private static Class7 field_1591;
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1592 = this.a("Old", false);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner2> field_1593 = this.a("Mode", Class7.Inner2.Default);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1594 = this.a("Color", new Color(255, 255, 255, 255));
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1595 = this.a("Fill Color", new Color(255, 255, 255, 255));
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1596 = this.a("Shader Fill", false);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1597 = this.a("Gradient Start Color", new Color(255, 255, 255, 255));
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1598 = this.a("Gradient End Color", new Color(255, 0, 255, 255));
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_1599 = this.a("Gradient Direction", Class7.Inner1.Vertical);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1600 = this.a("Transparency", 0.35F, 0.0F, 1.0F);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1601 = this.a("Glow Thickness", 2, 0, 10);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1602 = this.a("Inner Glow", false);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1603 = this.a("Inner Glow Thickness", 2, 1, 16);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1604 = this.a("Glow Sample Step", 1, 1, 16);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1605 = this.a("Glow Intensity", 1.35F, 0.0F, 3.0F);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<String> field_1606 = this.a("Image", "minecraft:textures/misc/enchanted_glint_item.png");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1607 = this.a("Rainbow Speed", 0.1F, 0.001F, 2.0F);
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1608 = this.a("RainbowF actor", 8.0F, 0.1F, 20.0F);
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1609 = this.a("Rainbow Saturation", 1.0F, 0.0F, 1.0F);
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1610 = this.a("Rainbow Lightness", 0.5F, 0.0F, 1.0F);
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1611 = this.a("Warp Speed", 0.5F, 0.01F, 3.0F);
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1612 = this.a("Warp Scale", 1.0F, 0.25F, 3.0F);
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1613 = this.a("Warp Bump", 0.05F, 0.0F, 0.2F);
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1614 = this.a("Only Fill", false);
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1615 = this.a("Bloom Enabled", true);
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1616 = this.a("Aura Enabled", true);
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1617 = this.a("Outline Enabled", true);
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1618 = this.a("Through Walls", false);
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1619 = this.a("Bloom Radius", 5.5F, 1.0F, 12.0F);
   // $VF: renamed from: W Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1620 = this.a("Bloom Intensity", 0.85F, 0.0F, 2.5F);
   // $VF: renamed from: X Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1621 = this.a("Aura Intensity", 0.95F, 0.0F, 2.5F);
   // $VF: renamed from: Y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1622 = this.a("Outline Width", 2.2F, 0.5F, 6.0F);
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1623 = this.a("Range", 64.0F, 1.0F, 512.0F);
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1624 = this.a("Aura Color Primary", new Color(56, 38, 86, 180));
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1625 = this.a("Aura Color Secondary", new Color(12, 10, 18, 90));
   // $VF: renamed from: ac Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1626 = this.a("Outline Color", new Color(122, 94, 178, 220));
   // $VF: renamed from: ad Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1627 = this.a("Only When Holding Item", false);
   // $VF: renamed from: ae Dev.ZWare.Client.features.pkg3.Class6
   public final Dev.ZWare.Client.features.pkg3.Class6 field_1628 = (Dev.ZWare.Client.features.pkg3.Class6)this.a(
      new Dev.ZWare.Client.features.pkg3.Class6(
         "Targets",
         List.of(
            new Dev.ZWare.Client.features.pkg3.Class6.Inner1("hands", "Hands"),
            new Dev.ZWare.Client.features.pkg3.Class6.Inner1("held_item", "HeldItem"),
            new Dev.ZWare.Client.features.pkg3.Class6.Inner1("players", "Players"),
            new Dev.ZWare.Client.features.pkg3.Class6.Inner1("end_crystals", "EndCrystals"),
            new Dev.ZWare.Client.features.pkg3.Class6.Inner1("items", "Items")
         ),
         Set.of("hands", "held_item")
      )
   );

   public Class7() {
      super("Chams", "cool glowy shit for entities and hands and stuf", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_1591 = this;
      this.field_1593.method_709(var1 -> !this.field_1592.method_671());
      this.field_1594.method_709(var1 -> !this.field_1592.method_671());
      this.field_1595
         .method_709(var1 -> !this.field_1592.method_671() && (this.field_1593.method_671() == Class7.Inner2.Default || !this.field_1596.method_671()));
      this.field_1596.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() != Class7.Inner2.Default);
      this.field_1597.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Gradient);
      this.field_1598.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Gradient);
      this.field_1599.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Gradient);
      this.field_1600.method_709(var1 -> !this.field_1592.method_671());
      this.field_1601.method_709(var1 -> !this.field_1592.method_671());
      this.field_1602.method_709(var1 -> !this.field_1592.method_671());
      this.field_1603.method_709(var1 -> !this.field_1592.method_671() && this.field_1602.method_671());
      this.field_1604.method_709(var1 -> !this.field_1592.method_671());
      this.field_1605.method_709(var1 -> !this.field_1592.method_671());
      this.field_1606.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Image);
      this.field_1607.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Rainbow);
      this.field_1608.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Rainbow);
      this.field_1609.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Rainbow);
      this.field_1610.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Rainbow);
      this.field_1611.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Warp);
      this.field_1612.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Warp);
      this.field_1613.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Warp);
      this.field_1614.method_709(var1 -> !this.field_1592.method_671() && this.field_1593.method_671() == Class7.Inner2.Warp);
      this.field_1615.method_709(var1 -> this.field_1592.method_671());
      this.field_1616.method_709(var1 -> this.field_1592.method_671());
      this.field_1617.method_709(var1 -> this.field_1592.method_671());
      this.field_1618.method_709(var1 -> this.method_2212());
      this.field_1619.method_709(var1 -> this.field_1592.method_671() && this.field_1615.method_671());
      this.field_1620.method_709(var1 -> this.field_1592.method_671() && this.field_1615.method_671());
      this.field_1621.method_709(var1 -> this.field_1592.method_671() && this.field_1616.method_671());
      this.field_1623.method_709(var1 -> this.method_2212());
      this.field_1622.method_709(var1 -> !this.field_1592.method_671() || this.field_1617.method_671());
      this.field_1624.method_709(var1 -> this.field_1592.method_671());
      this.field_1625.method_709(var1 -> this.field_1592.method_671());
      this.field_1626.method_709(var1 -> this.field_1592.method_671());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class7
   public static Class7 method_2201() {
      return field_1591;
   }

   // $VF: renamed from: a () boolean
   public boolean method_2202() {
      if (!this.d()) {
         return false;
      } else if (!this.method_2205()) {
         return false;
      } else if (!this.method_2207() && !this.method_2208()) {
         return false;
      } else if (c.field_1724 == null || c.field_1687 == null) {
         return false;
      } else {
         return !this.field_1627.method_671() ? true : !c.field_1724.method_6047().method_7960() || !c.field_1724.method_6079().method_7960();
      }
   }

   // $VF: renamed from: b () boolean
   public boolean method_2203() {
      return this.field_1592.method_671();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class7$Inner2
   public Class7.Inner2 method_2204() {
      return this.field_1593.method_671();
   }

   // $VF: renamed from: c () boolean
   public boolean method_2205() {
      return this.d() && this.method_2206();
   }

   // $VF: renamed from: n () boolean
   public boolean method_2206() {
      if (!this.d()) {
         return false;
      } else {
         return !this.method_2203() ? true : this.field_1615.method_671() || this.field_1616.method_671() || this.field_1617.method_671();
      }
   }

   // $VF: renamed from: o () boolean
   public boolean method_2207() {
      return this.field_1628.method_722("hands");
   }

   // $VF: renamed from: p () boolean
   public boolean method_2208() {
      return this.field_1628.method_722("held_item");
   }

   // $VF: renamed from: q () boolean
   public boolean method_2209() {
      return this.field_1628.method_722("players");
   }

   // $VF: renamed from: r () boolean
   public boolean method_2210() {
      return this.field_1628.method_722("end_crystals");
   }

   // $VF: renamed from: s () boolean
   public boolean method_2211() {
      return this.field_1628.method_722("items");
   }

   // $VF: renamed from: t () boolean
   public boolean method_2212() {
      return this.method_2209() || this.method_2210() || this.method_2211();
   }

   // $VF: renamed from: u () boolean
   public boolean method_2213() {
      return this.d() && this.field_1618.method_671();
   }

   // $VF: renamed from: v () boolean
   public boolean method_2214() {
      return this.method_2206() && this.method_2212();
   }

   // $VF: renamed from: w () boolean
   public boolean method_2215() {
      return this.method_2214() && this.method_2203();
   }

   // $VF: renamed from: x () boolean
   public boolean method_2216() {
      return this.method_2214() && !this.method_2215();
   }

   // $VF: renamed from: a (net.minecraft.entity.Entity) boolean
   public boolean method_2217(Entity entity) {
      if (!this.method_2214() || entity == null) {
         return false;
      } else if (!this.method_2221(entity)) {
         return false;
      } else if (entity instanceof PlayerEntity) {
         return this.method_2209();
      } else {
         return entity instanceof ItemEntity ? this.method_2211() : this.method_2210() && entity.method_5864() == EntityType.field_6110;
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.Entity) boolean
   public boolean method_2218(Entity entity) {
      return this.method_2216() && this.method_2217(entity);
   }

   // $VF: renamed from: c (net.minecraft.entity.Entity) boolean
   public boolean method_2219(Entity entity) {
      return this.method_2213() && this.method_2217(entity);
   }

   // $VF: renamed from: a () java.awt.Color
   public Color method_2220() {
      if (this.method_2203()) {
         return this.field_1626.method_671();
      } else {
         Color var1 = this.field_1593.method_671() != Class7.Inner2.Default && this.field_1596.method_671()
            ? this.field_1594.method_671()
            : this.field_1595.method_671();
         int var2 = Math.max(0, Math.min(255, Math.round(var1.getAlpha() * this.field_1600.method_671())));
         return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var2);
      }
   }

   // $VF: renamed from: d (net.minecraft.entity.Entity) boolean
   private boolean method_2221(Entity var1) {
      if (c.field_1724 == null) {
         return false;
      } else {
         double var2 = this.field_1623.method_671().floatValue();
         return c.field_1724.method_5858(var1) <= var2 * var2;
      }
   }

   // $VF: renamed from: b () java.awt.Color
   public Color method_2222() {
      return this.method_2203() ? this.field_1626.method_671() : this.field_1594.method_671();
   }

   public static enum Inner1 {
      Vertical,
      Horizontal,
      Diagonal;
   }

   public static enum Inner2 {
      Default,
      Gradient,
      Image,
      Rainbow,
      Warp,
      Nebula;
   }
}
