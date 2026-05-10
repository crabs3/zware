package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.features.gui.HudEditorScreen;
import Dev.ZWare.Client.features.gui.OyVeyGui;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public class Class3 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_1554 = 175L;
   // $VF: renamed from: p float
   private static final float field_1555 = 6.0F;
   // $VF: renamed from: q float
   private static final float field_1556 = 4.0F;
   // $VF: renamed from: r float
   private static final float field_1557 = 6.0F;
   // $VF: renamed from: s float
   private static final float field_1558 = 4.0F;
   // $VF: renamed from: t float
   private static final float field_1559 = 2.0F;
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner3> field_1560 = this.a("Mode", Class3.Inner3.Render);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner1> field_1561 = this.a("Chat Style", Class3.Inner1.ZWare);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner2> field_1562 = this.a("Brand Mode", Class3.Inner2.ZWare);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner9> field_1563 = this.a("Emoji", Class3.Inner9.Lambda);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1564 = this.a("Brand Bold", false);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1565 = this.a("Brand Italic", false);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1566 = this.a("Middle Bold", false);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1567 = this.a("Middle Italic", false);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1568 = this.a("Status Bold", false);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1569 = this.a("Status Italic", false);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1570 = this.a("Visual Range", false);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1571 = this.a("Visual Range Ignore Friends", false);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1572 = this.a("Totem Pops", true);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1573 = this.a("Duration", 2500, 500, 10000);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1574 = this.a("Max Notifications", 5, 1, 10);
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1575 = this.a("Brand Color", method_2200());
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1576 = this.a("Bracket Color", new Color(170, 170, 170, 255));
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1577 = this.a("Enabled Color", new Color(120, 255, 120, 255));
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1578 = this.a("Disabled Color", new Color(255, 120, 120, 255));
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1579 = this.a("Text Color", new Color(255, 255, 255, 255));
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1580 = this.a("Background Color", new Color(0, 0, 0, 145));
   // $VF: renamed from: P java.util.List
   private final List<Class3.Inner5> field_1581 = new ArrayList<>();
   // $VF: renamed from: Q java.util.Map
   private final Map<UUID, Class3.Inner4> field_1582 = new HashMap<>();
   // $VF: renamed from: R java.util.Map
   private final Map<String, Integer> field_1583 = new HashMap<>();
   // $VF: renamed from: S boolean
   private boolean field_1584;
   // $VF: renamed from: T boolean
   private boolean field_1585;

   public Class3() {
      super("Notifications", "Shows module toggle notifications.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, true, false, false);
      this.field_1561.method_709(var1 -> this.method_2183());
      this.field_1562.method_709(var1 -> this.method_2182() || this.method_2183());
      this.field_1563.method_709(var1 -> (this.method_2182() || this.method_2183()) && this.field_1562.method_671() == Class3.Inner2.Emoji);
      this.field_1564.method_709(var1 -> this.method_2183());
      this.field_1565.method_709(var1 -> this.method_2183());
      this.field_1566.method_709(var1 -> this.method_2183());
      this.field_1567.method_709(var1 -> this.method_2183());
      this.field_1568.method_709(var1 -> this.method_2183());
      this.field_1569.method_709(var1 -> this.method_2183());
      this.field_1571.method_709(var1 -> this.field_1570.method_671());
      this.field_1572.method_709(var0 -> true);
      this.field_1573.method_709(var1 -> this.method_2182());
      this.field_1574.method_709(var1 -> this.method_2182());
      this.field_1576.method_709(var1 -> this.method_2183());
      this.field_1579.method_709(var1 -> this.method_2182() || this.method_2183());
      this.field_1580.method_709(var1 -> this.method_2182());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1581.clear();
      this.method_2186();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1581.clear();
      this.method_2186();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class13) void
   @iFT13zrx_wTXP
   private void method_2165(Dev.ZWare.Client.pkg2.pkg1.Class13 var1) {
      if (c.field_1724 != null && c.field_1687 != null) {
         Dev.ZWare.Client.features.pkg1.Class1 var2 = var1.method_1031();
         if (var2 != null && var2 != this) {
            this.method_2185(Class3.Inner5.method_1437(var2.method_1907(), var1.method_1032(), System.currentTimeMillis()));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2166(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (g()) {
         this.method_2186();
         this.method_2187();
      } else {
         if (this.field_1570.method_671()) {
            this.method_2167();
         } else {
            this.method_2186();
         }

         if (this.field_1572.method_671()) {
            this.method_2168();
         } else {
            this.method_2187();
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2167() {
      HashMap var1 = new HashMap();

      for (PlayerEntity var3 : c.field_1687.method_18456()) {
         if (!this.method_2188(var3)) {
            UUID var4 = var3.method_5667();
            Dev.ZWare.Client.pkg1.Class12.Inner1 var5 = Dev.ZWare.Client.pkg1.Class12.method_1239(var3);
            var1.put(var4, new Class3.Inner4(var3.method_7334().getName(), var5));
            if (this.field_1584 && !this.field_1582.containsKey(var4)) {
               this.method_2185(Class3.Inner5.method_1438(var3.method_7334().getName(), var5, true, System.currentTimeMillis()));
               Class4 var6 = Class4.method_1935();
               if (var6 != null) {
                  var6.method_1938();
               }
            }
         }
      }

      if (this.field_1584) {
         for (Entry var8 : this.field_1582.entrySet()) {
            if (!var1.containsKey(var8.getKey())) {
               this.method_2185(
                  Class3.Inner5.method_1438(
                     ((Class3.Inner4)var8.getValue()).method_1356(), ((Class3.Inner4)var8.getValue()).method_1357(), false, System.currentTimeMillis()
                  )
               );
            }
         }
      }

      this.field_1582.clear();
      this.field_1582.putAll(var1);
      this.field_1584 = true;
   }

   // $VF: renamed from: o () void
   private void method_2168() {
      HashMap var1 = new HashMap<>(Dev.ZWare.Client.Class1.field_318.method_239());
      if (this.field_1585) {
         for (Entry var3 : var1.entrySet()) {
            String var4 = (String)var3.getKey();
            if (!this.method_2190(var4)) {
               int var5 = Math.max(0, (Integer)var3.getValue());
               int var6 = this.field_1583.getOrDefault(var4, 0);
               if (var5 > var6) {
                  this.method_2185(Class3.Inner5.method_1439(var4, this.method_2191(var4), var5, System.currentTimeMillis()));
               }
            }
         }
      }

      this.field_1583.clear();
      this.field_1583.putAll(var1);
      this.field_1585 = true;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (!this.method_2184()) {
         this.method_2170(event.method_1053());
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext) void
   public void method_2169(DrawContext context) {
      this.method_2170(context);
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext) void
   private void method_2170(DrawContext var1) {
      if (!this.method_2182()) {
         this.field_1581.clear();
      } else if (g()) {
         this.field_1581.clear();
      } else {
         long var2 = System.currentTimeMillis();
         this.method_2171(var2);
         if (!this.field_1581.isEmpty()) {
            float var4 = c.method_22683().method_4486();
            float var5 = 6.0F;

            for (Class3.Inner5 var7 : this.field_1581) {
               float var8 = this.method_2172(var7, var2);
               if (!(var8 <= 0.0F)) {
                  Class3.Inner6 var9 = this.method_2192(var7);
                  int var10 = 0;

                  for (String var14 : var9.method_1247()) {
                     var10 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var14);
                  }

                  float var22 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
                  float var23 = var22 + 8.0F;
                  float var24 = 12.0F + var10;
                  float var25 = (1.0F - var8) * (var24 + 6.0F);
                  float var15 = var4 - var24 - 6.0F + var25;
                  int var16 = this.method_2174(this.field_1580.method_671(), var8);
                  int var17 = this.method_2174(new Color(0, 0, 0, 185), var8);
                  int var18 = this.method_2174(var9.method_1249(), var8);
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_768(var1.method_51448(), var15, var5, var15 + var24, var5 + var23, var16, var17);
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_773(var1.method_51448(), var15, var5, var15 + 2.0F, var5 + var23, var18);
                  float var19 = var15 + 6.0F;
                  float var20 = var5 + 4.0F;

                  for (int var21 = 0; var21 < var9.method_1247().length; var21++) {
                     var19 += this.method_2173(var1, var9.method_1247()[var21], var19, var20, var9.method_1248()[var21], var8);
                  }

                  var5 += var23 + 4.0F;
               }
            }
         }
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2171(long var1) {
      this.field_1581.removeIf(var3 -> var1 - var3.method_1446() > this.field_1573.method_671().intValue());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5, long) float
   private float method_2172(Class3.Inner5 var1, long var2) {
      long var4 = var2 - var1.method_1446();
      long var6 = this.field_1573.method_671().intValue() - var4;
      float var8 = Math.min((float)var4 / 175.0F, 1.0F);
      float var9 = Math.min((float)Math.max(var6, 0L) / 175.0F, 1.0F);
      return Math.max(0.0F, Math.min(var8, var9));
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, java.awt.Color, float) float
   private float method_2173(DrawContext var1, String var2, float var3, float var4, Color var5, float var6) {
      if (var2.isEmpty()) {
         return 0.0F;
      } else {
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var2, var3, var4, this.method_2174(var5, var6));
         return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
      }
   }

   // $VF: renamed from: a (java.awt.Color, float) int
   private int method_2174(Color var1, float var2) {
      int var3 = Math.max(0, Math.min(255, Math.round(var1.getAlpha() * var2)));
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var3).getRGB();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5) net.minecraft.text.MutableText
   private MutableText method_2175(Class3.Inner5 var1) {
      MutableText var2 = Text.method_43473();
      Color var3 = this.method_2193(var1);

      return switch (var1.method_1440()) {
         case MODULE_TOGGLE -> {
            switch ((Class3.Inner1)this.field_1561.method_671()) {
               case ZWare:
                  yield var2.method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.field_1579.method_671()))
                     .method_10852(this.method_2176(Dev.ZWare.Client.pkg1.Class6.method_200("notif_is"), this.field_1579.method_671()))
                     .method_10852(
                        this.method_2179(
                           var1.method_1442()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_enabled")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_disabled"),
                           var3
                        )
                     );
               case Syntaxia:
                  yield var2.method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.field_1579.method_671()))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(
                        this.method_2179(
                           var1.method_1442()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_enabled")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_disabled"),
                           var3
                        )
                     );
               case Sonnetica:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2179(var1.method_1442() ? "+" : "-", var3))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.field_1579.method_671()));
               case field_573:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2179(var1.method_1442() ? "+" : "-", var3))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.field_1579.method_671()));
               case Meteor:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.field_1579.method_671()))
                     .method_10852(this.method_2176(" toggled ", this.field_1579.method_671()))
                     .method_10852(this.method_2179(var1.method_1442() ? "on" : "off", var3));
               default:
                  throw new MatchException(null, null);
            }
         }
         case VISUAL_RANGE -> {
            switch ((Class3.Inner1)this.field_1561.method_671()) {
               case ZWare:
               case Syntaxia:
                  yield var2.method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), var3))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1443()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1579.method_671()
                        )
                     );
               case Sonnetica:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2179("!", var3))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), var3))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1443()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1579.method_671()
                        )
                     );
               case field_573:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2179("!", var3))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), var3))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1443()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1579.method_671()
                        )
                     );
               case Meteor:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), var3))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1443()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1579.method_671()
                        )
                     );
               default:
                  throw new MatchException(null, null);
            }
         }
         case TOTEM_POP -> {
            switch ((Class3.Inner1)this.field_1561.method_671()) {
               case ZWare:
               case Syntaxia:
                  yield var2.method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176(" ", this.field_1579.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.method_2194(var1.method_1445())))
                     .method_10852(this.method_2176(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1579.method_671()))
                     .method_10852(this.method_2179(String.valueOf(var1.method_1444()), this.method_2199()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1444() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2199()
                        )
                     );
               case Sonnetica:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2179("!", this.method_2199()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.method_2194(var1.method_1445())))
                     .method_10852(this.method_2176(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1579.method_671()))
                     .method_10852(this.method_2179(String.valueOf(var1.method_1444()), this.method_2199()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1444() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2199()
                        )
                     );
               case field_573:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2179("!", this.method_2199()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.method_2194(var1.method_1445())))
                     .method_10852(this.method_2176(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1579.method_671()))
                     .method_10852(this.method_2179(String.valueOf(var1.method_1444()), this.method_2199()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1444() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2199()
                        )
                     );
               case Meteor:
                  yield var2.method_10852(this.method_2176("[", this.field_1576.method_671()))
                     .method_10852(this.method_2177(this.method_2181()))
                     .method_10852(this.method_2176("] ", this.field_1576.method_671()))
                     .method_10852(this.method_2178(var1.method_1441(), this.method_2194(var1.method_1445())))
                     .method_10852(this.method_2176(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1579.method_671()))
                     .method_10852(this.method_2179(String.valueOf(var1.method_1444()), this.method_2199()))
                     .method_10852(
                        this.method_2176(
                           var1.method_1444() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2199()
                        )
                     );
               default:
                  throw new MatchException(null, null);
            }
         }
      };
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Color) net.minecraft.text.Text
   private Text method_2176(String var1, Color var2) {
      return this.method_2180(var1, var2, false, false);
   }

   // $VF: renamed from: a (java.lang.String) net.minecraft.text.Text
   private Text method_2177(String var1) {
      return this.method_2180(var1, this.field_1575.method_671(), this.field_1564.method_671(), this.field_1565.method_671());
   }

   // $VF: renamed from: b (java.lang.String, java.awt.Color) net.minecraft.text.Text
   private Text method_2178(String var1, Color var2) {
      return this.method_2180(var1, var2, this.field_1566.method_671(), this.field_1567.method_671());
   }

   // $VF: renamed from: c (java.lang.String, java.awt.Color) net.minecraft.text.Text
   private Text method_2179(String var1, Color var2) {
      return this.method_2180(var1, var2, this.field_1568.method_671(), this.field_1569.method_671());
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Color, boolean, boolean) net.minecraft.text.Text
   private Text method_2180(String var1, Color var2, boolean var3, boolean var4) {
      return Text.method_43470(var1).method_27694(var3x -> var3x.method_36139(var2.getRGB()).method_10982(var3).method_10978(var4));
   }

   // $VF: renamed from: g () java.lang.String
   private String method_2181() {
      return this.field_1562.method_671() == Class3.Inner2.Emoji ? this.field_1563.method_671().method_1108() : "ZWare";
   }

   // $VF: renamed from: a () boolean
   private boolean method_2182() {
      return this.field_1560.method_671() == Class3.Inner3.Render || this.field_1560.method_671() == Class3.Inner3.Both;
   }

   // $VF: renamed from: b () boolean
   private boolean method_2183() {
      return this.field_1560.method_671() == Class3.Inner3.Chat || this.field_1560.method_671() == Class3.Inner3.Both;
   }

   // $VF: renamed from: c () boolean
   private boolean method_2184() {
      return c.field_1755 instanceof OyVeyGui || c.field_1755 instanceof HudEditorScreen;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5) void
   private void method_2185(Class3.Inner5 var1) {
      if (this.method_2182()) {
         this.field_1581.add(0, var1);

         while (this.field_1581.size() > this.field_1574.method_671()) {
            this.field_1581.remove(this.field_1581.size() - 1);
         }
      }

      if (this.method_2183()) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1649(this.method_2175(var1));
      }
   }

   // $VF: renamed from: p () void
   private void method_2186() {
      this.field_1582.clear();
      this.field_1584 = false;
   }

   // $VF: renamed from: q () void
   private void method_2187() {
      this.field_1583.clear();
      this.field_1585 = false;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2188(PlayerEntity var1) {
      return var1 == null
         || var1 == c.field_1724
         || var1 instanceof Dev.ZWare.Client.pkg1.pkg3.pkg1.Class1
         || !var1.method_5805()
         || var1.method_7325()
         || this.field_1571.method_671() && Dev.ZWare.Client.Class1.field_310.method_376(var1.method_5477().getString())
         || !this.method_2189(var1);
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2189(PlayerEntity var1) {
      if (var1 != null && c.field_1724 != null && c.field_1690 != null) {
         int var2 = (Integer)c.field_1690.method_42503().method_41753();
         double var3 = Math.max(32.0, (var2 + 1) * 16.0);
         return c.field_1724.method_33571().method_1025(var1.method_19538()) <= var3 * var3;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_2190(String var1) {
      return var1 != null && !var1.isBlank() ? c.field_1724 != null && var1.equalsIgnoreCase(c.field_1724.method_7334().getName()) : true;
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.pkg1.Class12$Inner1
   private Dev.ZWare.Client.pkg1.Class12.Inner1 method_2191(String var1) {
      PlayerEntity var2 = c.field_1687 == null
         ? null
         : c.field_1687.method_18456().stream().filter(var1x -> var1x != null && var1x.method_7334().getName().equalsIgnoreCase(var1)).findFirst().orElse(null);
      return var2 != null ? Dev.ZWare.Client.pkg1.Class12.method_1239(var2) : Dev.ZWare.Client.pkg1.Class12.method_1240(null, var1);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5) Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner6
   private Class3.Inner6 method_2192(Class3.Inner5 var1) {
      String var2 = this.method_2181();

      return switch (var1.method_1440()) {
         case MODULE_TOGGLE -> new Class3.Inner6(
            new String[]{
               var2,
               " ",
               var1.method_1441(),
               Dev.ZWare.Client.pkg1.Class6.method_200("notif_is"),
               var1.method_1442() ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_enabled") : Dev.ZWare.Client.pkg1.Class6.method_200("notif_disabled")
            },
            new Color[]{
               this.field_1575.method_671(), this.field_1579.method_671(), this.field_1579.method_671(), this.field_1579.method_671(), this.method_2193(var1)
            },
            this.method_2193(var1)
         );
         case VISUAL_RANGE -> new Class3.Inner6(
            new String[]{
               var2,
               " ",
               var1.method_1441(),
               " ",
               var1.method_1443()
                  ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                  : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range")
            },
            new Color[]{this.field_1575.method_671(), this.field_1579.method_671(), this.method_2193(var1), this.field_1579.method_671()},
            this.method_2193(var1)
         );
         case TOTEM_POP -> new Class3.Inner6(
            new String[]{
               var2,
               " ",
               var1.method_1441(),
               Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"),
               String.valueOf(var1.method_1444()),
               var1.method_1444() == 1 ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem") : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems")
            },
            new Color[]{
               this.field_1575.method_671(),
               this.field_1579.method_671(),
               this.method_2194(var1.method_1445()),
               this.field_1579.method_671(),
               this.method_2199(),
               this.method_2199()
            },
            this.method_2199()
         );
      };
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5) java.awt.Color
   private Color method_2193(Class3.Inner5 var1) {
      return switch (var1.method_1440()) {
         case MODULE_TOGGLE -> var1.method_1442() ? (Color)this.field_1577.method_671() : (Color)this.field_1578.method_671();
         case VISUAL_RANGE -> this.method_2194(var1.method_1445());
         case TOTEM_POP -> this.method_2199();
      };
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.Class12$Inner1) java.awt.Color
   private Color method_2194(Dev.ZWare.Client.pkg1.Class12.Inner1 var1) {
      return switch (var1) {
         case SELF, FRIEND -> this.method_2198(this.method_2196());
         case ENEMY -> this.method_2198(this.method_2197());
         case NONE -> this.method_2198(this.method_2195());
      };
   }

   // $VF: renamed from: a () int
   private int method_2195() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? var1.method_2318() : -1;
   }

   // $VF: renamed from: b () int
   private int method_2196() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? var1.method_2316() : -11155201;
   }

   // $VF: renamed from: c () int
   private int method_2197() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? var1.method_2317() : -42406;
   }

   // $VF: renamed from: a (int) java.awt.Color
   private Color method_2198(int var1) {
      return new Color(var1, true);
   }

   // $VF: renamed from: a () java.awt.Color
   private Color method_2199() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? this.method_2198(var1.method_2319()) : new Color(225, 120, 20, 255);
   }

   // $VF: renamed from: b () java.awt.Color
   private static Color method_2200() {
      if (Dev.ZWare.Client.Class1.field_296 == null) {
         return new Color(170, 0, 255, 255);
      } else {
         Color var0 = Dev.ZWare.Client.Class1.field_296.method_492();
         return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), 255);
      }
   }

   public static enum Inner1 {
      ZWare,
      Syntaxia,
      Sonnetica,
      // $VF: renamed from: Mio Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner1
      field_573,
      Meteor;
   }

   public static enum Inner2 {
      ZWare,
      Emoji;
   }

   public static enum Inner3 {
      Render,
      Chat,
      Both;
   }

   private record Inner4(String ak, Dev.ZWare.Client.pkg1.Class12.Inner1 al) {
      // $VF: renamed from: ak java.lang.String
      private final String field_840;
      // $VF: renamed from: al Dev.ZWare.Client.pkg1.Class12$Inner1
      private final Dev.ZWare.Client.pkg1.Class12.Inner1 field_841;

      private Inner4(String ak, Dev.ZWare.Client.pkg1.Class12.Inner1 al) {
         this.field_840 = ak;
         this.field_841 = al;
      }

      // $VF: renamed from: ak () java.lang.String
      public String method_1356() {
         return this.field_840;
      }

      // $VF: renamed from: al () Dev.ZWare.Client.pkg1.Class12$Inner1
      public Dev.ZWare.Client.pkg1.Class12.Inner1 method_1357() {
         return this.field_841;
      }
   }

   record Inner5(Class3.Inner8 aa, String ab, boolean ac, boolean ad, int ae, Dev.ZWare.Client.pkg1.Class12.Inner1 af, long ag) {
      // $VF: renamed from: aa Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner8
      private final Class3.Inner8 field_910;
      // $VF: renamed from: ab java.lang.String
      private final String field_911;
      // $VF: renamed from: ac boolean
      private final boolean field_912;
      // $VF: renamed from: ad boolean
      private final boolean field_913;
      // $VF: renamed from: ae int
      private final int field_914;
      // $VF: renamed from: af Dev.ZWare.Client.pkg1.Class12$Inner1
      private final Dev.ZWare.Client.pkg1.Class12.Inner1 field_915;
      // $VF: renamed from: ag long
      private final long field_916;

      Inner5(Class3.Inner8 aa, String ab, boolean ac, boolean ad, int ae, Dev.ZWare.Client.pkg1.Class12.Inner1 af, long ag) {
         this.field_910 = aa;
         this.field_911 = ab;
         this.field_912 = ac;
         this.field_913 = ad;
         this.field_914 = ae;
         this.field_915 = af;
         this.field_916 = ag;
      }

      // $VF: renamed from: a (java.lang.String, boolean, long) Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5
      private static Class3.Inner5 method_1437(String var0, boolean var1, long var2) {
         return new Class3.Inner5(Class3.Inner8.MODULE_TOGGLE, var0, var1, false, 0, Dev.ZWare.Client.pkg1.Class12.Inner1.NONE, var2);
      }

      // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.pkg1.Class12$Inner1, boolean, long) Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5
      private static Class3.Inner5 method_1438(String var0, Dev.ZWare.Client.pkg1.Class12.Inner1 var1, boolean var2, long var3) {
         return new Class3.Inner5(Class3.Inner8.VISUAL_RANGE, var0, false, var2, 0, var1, var3);
      }

      // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.pkg1.Class12$Inner1, int, long) Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner5
      private static Class3.Inner5 method_1439(String var0, Dev.ZWare.Client.pkg1.Class12.Inner1 var1, int var2, long var3) {
         return new Class3.Inner5(Class3.Inner8.TOTEM_POP, var0, false, false, var2, var1, var3);
      }

      // $VF: renamed from: aa () Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner8
      public Class3.Inner8 method_1440() {
         return this.field_910;
      }

      // $VF: renamed from: ab () java.lang.String
      public String method_1441() {
         return this.field_911;
      }

      // $VF: renamed from: ac () boolean
      public boolean method_1442() {
         return this.field_912;
      }

      // $VF: renamed from: ad () boolean
      public boolean method_1443() {
         return this.field_913;
      }

      // $VF: renamed from: ae () int
      public int method_1444() {
         return this.field_914;
      }

      // $VF: renamed from: af () Dev.ZWare.Client.pkg1.Class12$Inner1
      public Dev.ZWare.Client.pkg1.Class12.Inner1 method_1445() {
         return this.field_915;
      }

      // $VF: renamed from: ag () long
      public long method_1446() {
         return this.field_916;
      }
   }

   private record Inner6(String[] ah, Color[] ai, Color aj) {
      // $VF: renamed from: ah java.lang.String[]
      private final String[] field_733;
      // $VF: renamed from: ai java.awt.Color[]
      private final Color[] field_734;
      // $VF: renamed from: aj java.awt.Color
      private final Color field_735;

      private Inner6(String[] ah, Color[] ai, Color aj) {
         this.field_733 = ah;
         this.field_734 = ai;
         this.field_735 = aj;
      }

      // $VF: renamed from: ah () java.lang.String[]
      public String[] method_1247() {
         return this.field_733;
      }

      // $VF: renamed from: ai () java.awt.Color[]
      public Color[] method_1248() {
         return this.field_734;
      }

      // $VF: renamed from: aj () java.awt.Color
      public Color method_1249() {
         return this.field_735;
      }
   }

   static enum Inner8 {
      MODULE_TOGGLE,
      VISUAL_RANGE,
      TOTEM_POP;
   }

   public static enum Inner9 {
      Lambda("λ"),
      Bolt("⚡"),
      Heart("❤️"),
      Planet("\ud83e\ude90"),
      Hazard("☣"),
      // $VF: renamed from: Eye Dev.ZWare.Client.features.pkg1.pkg4.Class3$Inner9
      field_601("\ud83d\udc41"),
      Secret("㊙");

      // $VF: renamed from: a java.lang.String
      private final String field_602;

      private Inner9(String var3) {
         this.field_602 = var3;
      }

      // $VF: renamed from: a () java.lang.String
      public String method_1108() {
         return this.field_602;
      }
   }
}
