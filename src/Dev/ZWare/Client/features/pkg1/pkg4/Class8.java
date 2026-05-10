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

public class Class8 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o java.awt.Color
   private static final Color field_1327 = new Color(255, 120, 120, 255);
   // $VF: renamed from: p java.lang.String
   public static final String field_1328 = "Lexend Deca";
   // $VF: renamed from: q long
   private static final long field_1329 = 175L;
   // $VF: renamed from: r float
   private static final float field_1330 = 6.0F;
   // $VF: renamed from: s float
   private static final float field_1331 = 4.0F;
   // $VF: renamed from: t float
   private static final float field_1332 = 6.0F;
   // $VF: renamed from: u float
   private static final float field_1333 = 4.0F;
   // $VF: renamed from: v float
   private static final float field_1334 = 2.0F;
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg1.pkg4.Class8
   private static Class8 field_1335 = new Class8();
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<String> field_1336 = this.a("Prefix", ";").method_683("General");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1337 = this.a("Module Descriptions", false).method_683("General");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1338 = this.a("Module Count", false).method_683("General");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1339 = this.a("Dynamic Category Width", true).method_683("General");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1340 = this.a("Color", 146, 146, 255, 180).method_683("Colors");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1341 = this.a("Top Color", 146, 146, 255, 180).method_683("Colors");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1342 = this.a("Category Outline Color", 146, 146, 255, 180).method_683("Colors");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1343 = this.a("Enabled Opacity", 190, 0, 255).method_683("Colors");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1344 = this.a("Disabled Opacity", 0, 0, 255).method_683("Colors");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1345 = this.a("Category Outline Thickness", 0.5F, 0.5F, 4.0F).method_683("Layout");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1346 = this.a("Category Header Height", 14, 10, 40).method_683("Layout");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1347 = this.a("Category Header Text Offset", 0.0F, -8.0F, 8.0F).method_683("Layout");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1348 = this.a("Category Content Padding", 1.0F, 0.0F, 10.0F).method_683("Layout");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1349 = this.a("Category Width", 120, 60, 200).method_683("Layout");
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1350 = this.a("Module Button Width", 84, 60, 240).method_683("Layout");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1351 = this.a("Module Button Height", 14, 12, 28).method_683("Layout");
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1352 = this.a("Button Padding", 0.0F, 0.0F, 6.0F).method_683("Layout");
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1353 = this.a("Dynamic Width Speed", 0.05F, 0.05F, 1.0F).method_683("Layout");
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1354 = this.a("Description Scale", 0.9F, 0.5F, 2.0F).method_683("Descriptions");
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1355 = this.a("Description Offset X", 12.0F, -200.0F, 200.0F).method_683("Descriptions");
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1356 = this.a("Description Offset Y", 6.0F, -200.0F, 200.0F).method_683("Descriptions");
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1357 = this.a("Description Text Color", 255, 255, 255, 255).method_683("Descriptions");
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1358 = this.a("Description Background Color", 0, 0, 0, 210).method_683("Descriptions");
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1359 = this.a("Description Border Color", 24, 24, 24, 235).method_683("Descriptions");
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class8.Inner5> field_1360 = this.a("Language", Class8.Inner5.English).method_683("Language");
   // $VF: renamed from: W Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1361 = this.a("Settings Animation Speed", 0.05F, 0.05F, 1.0F).method_683("Animations");
   // $VF: renamed from: X Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class8.Inner4> field_1362 = this.a("Open Animation", Class8.Inner4.Fade).method_683("Animations");
   // $VF: renamed from: Y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1363 = this.a("Open Animation Duration", 0.24F, 0.05F, 1.0F).method_683("Animations");
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1364 = this.a("Open Animation Stagger", 0.03F, 0.0F, 0.2F).method_683("Animations");
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1365 = this.a("Rainbow", false).method_683("Rainbow");
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1366 = this.a("Delay", 240, 0, 600).method_683("Rainbow");
   // $VF: renamed from: ac Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1367 = this.a("Brightness", 150.0F, 1.0F, 255.0F).method_683("Rainbow");
   // $VF: renamed from: ad Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1368 = this.a("Saturation", 150.0F, 1.0F, 255.0F).method_683("Rainbow");
   // $VF: renamed from: ae Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1369 = this.a("Font Enabled", false).method_683("Font");
   // $VF: renamed from: af Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<String> field_1370 = this.a("Family", "Arial").method_683("Font");
   // $VF: renamed from: ag Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1371 = this.a("Size", 9, 6, 32).method_683("Font");
   // $VF: renamed from: ah Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1372 = this.a("Over Sample", 1.0F, 1.0F, 4.0F).method_683("Font");
   // $VF: renamed from: ai Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1373 = this.a("Shadow", true).method_683("Font");
   // $VF: renamed from: aj Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1374 = this.a("Override Minecraft", true).method_683("Font");
   // $VF: renamed from: ak Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1375 = this.a("Anti Alias", true).method_683("Font");
   // $VF: renamed from: al Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1376 = this.a("Fractional Metrics", true).method_683("Font");
   // $VF: renamed from: am Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1377 = this.a("Notifications Enabled", true).method_683("Notifications");
   // $VF: renamed from: an Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner3> field_1378 = this.a("Mode", Class3.Inner3.Chat).method_683("Notifications");
   // $VF: renamed from: ao Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner1> field_1379 = this.a("Chat Style", Class3.Inner1.ZWare).method_683("Notifications");
   // $VF: renamed from: ap Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner2> field_1380 = this.a("Brand Mode", Class3.Inner2.ZWare).method_683("Notifications");
   // $VF: renamed from: aq Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner9> field_1381 = this.a("Emoji", Class3.Inner9.Lambda).method_683("Notifications");
   // $VF: renamed from: ar Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1382 = this.a("Brand Bold", false).method_683("Notifications");
   // $VF: renamed from: as Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1383 = this.a("Brand Italic", false).method_683("Notifications");
   // $VF: renamed from: at Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1384 = this.a("Middle Bold", false).method_683("Notifications");
   // $VF: renamed from: au Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1385 = this.a("Middle Italic", false).method_683("Notifications");
   // $VF: renamed from: av Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1386 = this.a("Status Bold", false).method_683("Notifications");
   // $VF: renamed from: aw Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1387 = this.a("Status Italic", false).method_683("Notifications");
   // $VF: renamed from: ax Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1388 = this.a("Visual Range", true).method_683("Notifications");
   // $VF: renamed from: ay Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1389 = this.a("Visual Range Ignore Friends", false).method_683("Notifications");
   // $VF: renamed from: az Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1390 = this.a("Totem Pops", true).method_683("Notifications");
   // $VF: renamed from: aA Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1391 = this.a("Duration", 2500, 500, 10000).method_683("Notifications");
   // $VF: renamed from: aB Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1392 = this.a("Max Notifications", 5, 1, 10).method_683("Notifications");
   // $VF: renamed from: aC Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1393 = this.a("Brand Color", new Color(170, 0, 255, 255)).method_683("Notifications");
   // $VF: renamed from: aD Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1394 = this.a("Bracket Color", 255, 88, 169, 255).method_683("Notifications");
   // $VF: renamed from: aE Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1395 = this.a("Enabled Color", 115, 255, 115, 255).method_683("Notifications");
   // $VF: renamed from: aF Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1396 = this.a("Disabled Color", 255, 115, 115, 255).method_683("Notifications");
   // $VF: renamed from: aG Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1397 = this.a("Text Color", new Color(255, 255, 255, 255)).method_683("Notifications");
   // $VF: renamed from: aH Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1398 = this.a("Background Color", new Color(0, 0, 0, 145)).method_683("Notifications");
   // $VF: renamed from: aI java.util.List
   private final List<Class8.Inner6> field_1399 = new ArrayList<>();
   // $VF: renamed from: aJ java.util.Map
   private final Map<UUID, Class8.Inner2> field_1400 = new HashMap<>();
   // $VF: renamed from: aK java.util.Map
   private final Map<String, Integer> field_1401 = new HashMap<>();
   // $VF: renamed from: aL boolean
   private boolean field_1402;
   // $VF: renamed from: aM boolean
   private boolean field_1403;

   public Class8() {
      super("Client", "Opens the client menu.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, true, false, true);
      this.a(344);
      this.field_1353.method_709(var1 -> this.field_1339.method_671());
      this.field_1354.method_709(var1 -> this.field_1337.method_671());
      this.field_1355.method_709(var1 -> this.field_1337.method_671());
      this.field_1356.method_709(var1 -> this.field_1337.method_671());
      this.field_1357.method_709(var1 -> this.field_1337.method_671());
      this.field_1358.method_709(var1 -> this.field_1337.method_671());
      this.field_1359.method_709(var1 -> this.field_1337.method_671());
      this.field_1363.method_709(var1 -> this.field_1362.method_671() != Class8.Inner4.None);
      this.field_1364.method_709(var1 -> this.field_1362.method_671() != Class8.Inner4.None);
      this.field_1366.method_709(var1 -> this.field_1365.method_671());
      this.field_1367.method_709(var1 -> this.field_1365.method_671());
      this.field_1368.method_709(var1 -> this.field_1365.method_671());
      this.field_1370.method_709(var1 -> this.field_1369.method_671());
      this.field_1371.method_709(var1 -> this.field_1369.method_671());
      this.field_1372.method_709(var1 -> this.field_1369.method_671());
      this.field_1373.method_709(var1 -> this.field_1369.method_671());
      this.field_1374.method_709(var1 -> this.field_1369.method_671());
      this.field_1375.method_709(var1 -> this.field_1369.method_671());
      this.field_1376.method_709(var1 -> this.field_1369.method_671());
      this.field_1378.method_709(var1 -> this.field_1377.method_671());
      this.field_1379.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1380.method_709(var1 -> this.field_1377.method_671() && (this.method_2019() || this.method_2020()));
      this.field_1381
         .method_709(var1 -> this.field_1377.method_671() && (this.method_2019() || this.method_2020()) && this.field_1380.method_671() == Class3.Inner2.Emoji);
      this.field_1382.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1383.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1384.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1385.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1386.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1387.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1388.method_709(var1 -> this.field_1377.method_671());
      this.field_1389.method_709(var1 -> this.field_1377.method_671() && this.field_1388.method_671());
      this.field_1390.method_709(var1 -> this.field_1377.method_671());
      this.field_1391.method_709(var1 -> this.field_1377.method_671() && this.method_2019());
      this.field_1392.method_709(var1 -> this.field_1377.method_671() && this.method_2019());
      this.field_1393.method_709(var1 -> this.field_1377.method_671() && (this.method_2019() || this.method_2020()));
      this.field_1394.method_709(var1 -> this.field_1377.method_671() && this.method_2020());
      this.field_1395.method_709(var1 -> this.field_1377.method_671());
      this.field_1396.method_709(var1 -> this.field_1377.method_671());
      this.field_1397.method_709(var1 -> this.field_1377.method_671() && (this.method_2019() || this.method_2020()));
      this.field_1398.method_709(var1 -> this.field_1377.method_671() && this.method_2019());
      this.method_2000();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class8
   public static Class8 method_1995() {
      if (field_1335 == null) {
         field_1335 = new Class8();
      }

      return field_1335;
   }

   // $VF: renamed from: a () boolean
   public boolean method_1996() {
      return this.field_1377.method_671();
   }

   // $VF: renamed from: b () boolean
   public boolean method_1997() {
      return this.field_1369.method_671();
   }

   // $VF: renamed from: b () java.util.List
   public List<String> method_1998() {
      return Dev.ZWare.Client.Class1.field_297 != null ? Dev.ZWare.Client.Class1.field_297.method_835() : List.of("Lexend Deca");
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext) void
   public void method_1999(DrawContext context) {
      this.method_2007(context);
   }

   // $VF: renamed from: n () void
   private void method_2000() {
      field_1335 = this;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class6) void
   @iFT13zrx_wTXP
   public void method_2001(Dev.ZWare.Client.pkg2.pkg1.Class6 event) {
      if (event.method_1038() == 2 && event.method_1037().method_681().equals(this)) {
         if (event.method_1037().equals(this.field_1336)) {
            Dev.ZWare.Client.Class1.field_309.method_1620(this.field_1336.method_674());
            Dev.ZWare.Client.features.pkg2.Class1.method_1647("Prefix set to {global} %s", Dev.ZWare.Client.Class1.field_309.method_1619());
         }

         if (event.method_1037().equals(this.field_1340)) {
            Dev.ZWare.Client.Class1.field_296.method_493(this.field_1340.method_674());
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class13) void
   @iFT13zrx_wTXP
   private void method_2002(Dev.ZWare.Client.pkg2.pkg1.Class13 var1) {
      if (this.field_1377.method_671() && c.field_1724 != null && c.field_1687 != null) {
         Dev.ZWare.Client.features.pkg1.Class1 var2 = var1.method_1031();
         if (var2 != null && var2 != this) {
            this.method_2022(Class8.Inner6.method_1369(var2.method_1907(), var1.method_1032(), System.currentTimeMillis()));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2003(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (!this.field_1377.method_671()) {
         this.method_2023();
         this.method_2024();
      } else if (g()) {
         this.method_2023();
         this.method_2024();
      } else {
         if (this.field_1388.method_671()) {
            this.method_2004();
         } else {
            this.method_2023();
         }

         if (this.field_1390.method_671()) {
            this.method_2005();
         } else {
            this.method_2024();
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2004() {
      HashMap var1 = new HashMap();

      for (PlayerEntity var3 : c.field_1687.method_18456()) {
         if (!this.method_2025(var3)) {
            UUID var4 = var3.method_5667();
            Dev.ZWare.Client.pkg1.Class12.Inner1 var5 = Dev.ZWare.Client.pkg1.Class12.method_1239(var3);
            var1.put(var4, new Class8.Inner2(var3.method_7334().getName(), var5));
            if (this.field_1402 && !this.field_1400.containsKey(var4)) {
               this.method_2022(Class8.Inner6.method_1370(var3.method_7334().getName(), var5, true, System.currentTimeMillis()));
               Class4 var6 = Class4.method_1935();
               if (var6 != null) {
                  var6.method_1938();
               }
            }
         }
      }

      if (this.field_1402) {
         for (Entry var8 : this.field_1400.entrySet()) {
            if (!var1.containsKey(var8.getKey())) {
               this.method_2022(
                  Class8.Inner6.method_1370(
                     ((Class8.Inner2)var8.getValue()).method_1449(), ((Class8.Inner2)var8.getValue()).method_1450(), false, System.currentTimeMillis()
                  )
               );
            }
         }
      }

      this.field_1400.clear();
      this.field_1400.putAll(var1);
      this.field_1402 = true;
   }

   // $VF: renamed from: p () void
   private void method_2005() {
      HashMap var1 = new HashMap<>(Dev.ZWare.Client.Class1.field_318.method_239());
      if (this.field_1403) {
         for (Entry var3 : var1.entrySet()) {
            String var4 = (String)var3.getKey();
            if (!this.method_2027(var4)) {
               int var5 = Math.max(0, (Integer)var3.getValue());
               int var6 = this.field_1401.getOrDefault(var4, 0);
               if (var5 > var6) {
                  this.method_2022(Class8.Inner6.method_1371(var4, this.method_2028(var4), var5, System.currentTimeMillis()));
               }
            }
         }
      }

      this.field_1401.clear();
      this.field_1401.putAll(var1);
      this.field_1403 = true;
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   private void method_2006(Dev.ZWare.Client.pkg2.pkg1.Class3 var1) {
      if (!this.method_2021()) {
         this.method_2007(var1.method_1053());
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      if (!g()) {
         c.method_1507(OyVeyGui.getClickGui());
      }
   }

   // $VF: renamed from: f () void
   @Override
   public void method_1890() {
      if (field_1327.equals(this.field_1396.method_671())) {
         this.field_1396.method_680(new Color(255, 255, 255, 255));
      }

      Dev.ZWare.Client.Class1.field_296.method_493(this.field_1340.method_671());
      Dev.ZWare.Client.Class1.field_309.method_1620(this.field_1336.method_671());
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      if (!(c.field_1755 instanceof OyVeyGui)) {
         this.k();
      }
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext) void
   private void method_2007(DrawContext var1) {
      if (!this.method_2019()) {
         this.field_1399.clear();
      } else if (g()) {
         this.field_1399.clear();
      } else {
         long var2 = System.currentTimeMillis();
         this.method_2008(var2);
         if (!this.field_1399.isEmpty()) {
            float var4 = c.method_22683().method_4486();
            float var5 = 6.0F;

            for (Class8.Inner6 var7 : this.field_1399) {
               float var8 = this.method_2009(var7, var2);
               if (!(var8 <= 0.0F)) {
                  Class8.Inner3 var9 = this.method_2029(var7);
                  int var10 = 0;

                  for (String var14 : var9.method_1428()) {
                     var10 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var14);
                  }

                  float var22 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
                  float var23 = var22 + 8.0F;
                  float var24 = 12.0F + var10;
                  float var25 = (1.0F - var8) * (var24 + 6.0F);
                  float var15 = var4 - var24 - 6.0F + var25;
                  int var16 = this.method_2011(this.field_1398.method_671(), var8);
                  int var17 = this.method_2011(new Color(0, 0, 0, 185), var8);
                  int var18 = this.method_2011(var9.method_1430(), var8);
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_768(var1.method_51448(), var15, var5, var15 + var24, var5 + var23, var16, var17);
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_773(var1.method_51448(), var15, var5, var15 + 2.0F, var5 + var23, var18);
                  float var19 = var15 + 6.0F;
                  float var20 = var5 + 4.0F;

                  for (int var21 = 0; var21 < var9.method_1428().length; var21++) {
                     var19 += this.method_2010(var1, var9.method_1428()[var21], var19, var20, var9.method_1429()[var21], var8);
                  }

                  var5 += var23 + 4.0F;
               }
            }
         }
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2008(long var1) {
      this.field_1399.removeIf(var3 -> var1 - var3.method_1378() > this.field_1391.method_671().intValue());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6, long) float
   private float method_2009(Class8.Inner6 var1, long var2) {
      long var4 = var2 - var1.method_1378();
      long var6 = this.field_1391.method_671().intValue() - var4;
      float var8 = Math.min((float)var4 / 175.0F, 1.0F);
      float var9 = Math.min((float)Math.max(var6, 0L) / 175.0F, 1.0F);
      return Math.max(0.0F, Math.min(var8, var9));
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, java.awt.Color, float) float
   private float method_2010(DrawContext var1, String var2, float var3, float var4, Color var5, float var6) {
      if (var2.isEmpty()) {
         return 0.0F;
      } else {
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var2, var3, var4, this.method_2011(var5, var6));
         return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
      }
   }

   // $VF: renamed from: a (java.awt.Color, float) int
   private int method_2011(Color var1, float var2) {
      int var3 = Math.max(0, Math.min(255, Math.round(var1.getAlpha() * var2)));
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var3).getRGB();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6) net.minecraft.text.MutableText
   private MutableText method_2012(Class8.Inner6 var1) {
      MutableText var2 = Text.method_43473();
      Color var3 = this.method_2030(var1);

      return switch (var1.method_1372()) {
         case MODULE_TOGGLE -> {
            switch ((Class3.Inner1)this.field_1379.method_671()) {
               case ZWare:
                  yield var2.method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), this.field_1397.method_671()))
                     .method_10852(this.method_2013(Dev.ZWare.Client.pkg1.Class6.method_200("notif_is"), this.field_1397.method_671()))
                     .method_10852(
                        this.method_2016(
                           var1.method_1374()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_enabled")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_disabled"),
                           var3
                        )
                     );
               case Syntaxia:
                  yield var2.method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), this.field_1397.method_671()))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(
                        this.method_2016(
                           var1.method_1374()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_enabled")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_disabled"),
                           var3
                        )
                     );
               case Sonnetica:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2016(var1.method_1374() ? "+" : "-", var3))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), this.field_1397.method_671()));
               case field_573:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2016(var1.method_1374() ? "+" : "-", var3))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), this.field_1397.method_671()));
               case Meteor:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), this.field_1397.method_671()))
                     .method_10852(this.method_2013(" toggled ", this.field_1397.method_671()))
                     .method_10852(this.method_2016(var1.method_1374() ? "on" : "off", var3));
               default:
                  throw new MatchException(null, null);
            }
         }
         case VISUAL_RANGE -> {
            switch ((Class3.Inner1)this.field_1379.method_671()) {
               case ZWare:
               case Syntaxia:
                  yield var2.method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1375()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1397.method_671()
                        )
                     );
               case Sonnetica:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2016("!", var3))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1375()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1397.method_671()
                        )
                     );
               case field_573:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2016("!", var3))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1375()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1397.method_671()
                        )
                     );
               case Meteor:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1375()
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range"),
                           this.field_1397.method_671()
                        )
                     );
               default:
                  throw new MatchException(null, null);
            }
         }
         case TOTEM_POP -> {
            switch ((Class3.Inner1)this.field_1379.method_671()) {
               case ZWare:
               case Syntaxia:
                  yield var2.method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013(" ", this.field_1397.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1397.method_671()))
                     .method_10852(this.method_2016(String.valueOf(var1.method_1376()), this.method_2036()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1376() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2036()
                        )
                     );
               case Sonnetica:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2016("!", var3))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1397.method_671()))
                     .method_10852(this.method_2016(String.valueOf(var1.method_1376()), this.method_2036()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1376() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2036()
                        )
                     );
               case field_573:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2016("!", var3))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1397.method_671()))
                     .method_10852(this.method_2016(String.valueOf(var1.method_1376()), this.method_2036()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1376() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2036()
                        )
                     );
               case Meteor:
                  yield var2.method_10852(this.method_2013("[", this.field_1394.method_671()))
                     .method_10852(this.method_2014(this.method_2018()))
                     .method_10852(this.method_2013("] ", this.field_1394.method_671()))
                     .method_10852(this.method_2015(var1.method_1373(), var3))
                     .method_10852(this.method_2013(Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"), this.field_1397.method_671()))
                     .method_10852(this.method_2016(String.valueOf(var1.method_1376()), this.method_2036()))
                     .method_10852(
                        this.method_2013(
                           var1.method_1376() == 1
                              ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem")
                              : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems"),
                           this.method_2036()
                        )
                     );
               default:
                  throw new MatchException(null, null);
            }
         }
      };
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Color) net.minecraft.text.Text
   private Text method_2013(String var1, Color var2) {
      return this.method_2017(var1, var2, false, false);
   }

   // $VF: renamed from: a (java.lang.String) net.minecraft.text.Text
   private Text method_2014(String var1) {
      return this.method_2017(var1, this.field_1393.method_671(), this.field_1382.method_671(), this.field_1383.method_671());
   }

   // $VF: renamed from: b (java.lang.String, java.awt.Color) net.minecraft.text.Text
   private Text method_2015(String var1, Color var2) {
      return this.method_2017(var1, var2, this.field_1384.method_671(), this.field_1385.method_671());
   }

   // $VF: renamed from: c (java.lang.String, java.awt.Color) net.minecraft.text.Text
   private Text method_2016(String var1, Color var2) {
      return this.method_2017(var1, var2, this.field_1386.method_671(), this.field_1387.method_671());
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Color, boolean, boolean) net.minecraft.text.Text
   private Text method_2017(String var1, Color var2, boolean var3, boolean var4) {
      return Text.method_43470(var1).method_27694(var3x -> var3x.method_36139(var2.getRGB()).method_10982(var3).method_10978(var4));
   }

   // $VF: renamed from: g () java.lang.String
   private String method_2018() {
      return this.field_1380.method_671() == Class3.Inner2.Emoji ? this.field_1381.method_671().method_1108() : "ZWare";
   }

   // $VF: renamed from: c () boolean
   private boolean method_2019() {
      return this.field_1377.method_671() && (this.field_1378.method_671() == Class3.Inner3.Render || this.field_1378.method_671() == Class3.Inner3.Both);
   }

   // $VF: renamed from: n () boolean
   private boolean method_2020() {
      return this.field_1377.method_671() && (this.field_1378.method_671() == Class3.Inner3.Chat || this.field_1378.method_671() == Class3.Inner3.Both);
   }

   // $VF: renamed from: o () boolean
   private boolean method_2021() {
      return c.field_1755 instanceof OyVeyGui || c.field_1755 instanceof HudEditorScreen;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6) void
   private void method_2022(Class8.Inner6 var1) {
      if (this.method_2019()) {
         this.field_1399.add(0, var1);

         while (this.field_1399.size() > this.field_1392.method_671()) {
            this.field_1399.remove(this.field_1399.size() - 1);
         }
      }

      if (this.method_2020()) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1649(this.method_2012(var1));
      }
   }

   // $VF: renamed from: q () void
   private void method_2023() {
      this.field_1400.clear();
      this.field_1402 = false;
   }

   // $VF: renamed from: r () void
   private void method_2024() {
      this.field_1401.clear();
      this.field_1403 = false;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2025(PlayerEntity var1) {
      return var1 == null
         || var1 == c.field_1724
         || var1 instanceof Dev.ZWare.Client.pkg1.pkg3.pkg1.Class1
         || !var1.method_5805()
         || var1.method_7325()
         || this.field_1389.method_671() && Dev.ZWare.Client.Class1.field_310.method_376(var1.method_5477().getString())
         || !this.method_2026(var1);
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2026(PlayerEntity var1) {
      if (var1 != null && c.field_1724 != null && c.field_1690 != null) {
         int var2 = (Integer)c.field_1690.method_42503().method_41753();
         double var3 = Math.max(32.0, (var2 + 1) * 16.0);
         return c.field_1724.method_33571().method_1025(var1.method_19538()) <= var3 * var3;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_2027(String var1) {
      return var1 != null && !var1.isBlank() ? c.field_1724 != null && var1.equalsIgnoreCase(c.field_1724.method_7334().getName()) : true;
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.pkg1.Class12$Inner1
   private Dev.ZWare.Client.pkg1.Class12.Inner1 method_2028(String var1) {
      PlayerEntity var2 = c.field_1687 == null
         ? null
         : c.field_1687.method_18456().stream().filter(var1x -> var1x != null && var1x.method_7334().getName().equalsIgnoreCase(var1)).findFirst().orElse(null);
      return var2 != null ? Dev.ZWare.Client.pkg1.Class12.method_1239(var2) : Dev.ZWare.Client.pkg1.Class12.method_1240(null, var1);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6) Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner3
   private Class8.Inner3 method_2029(Class8.Inner6 var1) {
      String var2 = this.method_2018();

      return switch (var1.method_1372()) {
         case MODULE_TOGGLE -> new Class8.Inner3(
            new String[]{
               var2,
               " ",
               var1.method_1373(),
               Dev.ZWare.Client.pkg1.Class6.method_200("notif_is"),
               var1.method_1374() ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_enabled") : Dev.ZWare.Client.pkg1.Class6.method_200("notif_disabled")
            },
            new Color[]{
               this.field_1393.method_671(), this.field_1397.method_671(), this.field_1397.method_671(), this.field_1397.method_671(), this.method_2030(var1)
            },
            this.method_2030(var1)
         );
         case VISUAL_RANGE -> new Class8.Inner3(
            new String[]{
               var2,
               " ",
               var1.method_1373(),
               " ",
               var1.method_1375()
                  ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_entered_range")
                  : Dev.ZWare.Client.pkg1.Class6.method_200("notif_left_range")
            },
            new Color[]{this.field_1393.method_671(), this.field_1397.method_671(), this.method_2030(var1), this.field_1397.method_671()},
            this.method_2030(var1)
         );
         case TOTEM_POP -> new Class8.Inner3(
            new String[]{
               var2,
               " ",
               var1.method_1373(),
               Dev.ZWare.Client.pkg1.Class6.method_200("notif_popped"),
               String.valueOf(var1.method_1376()),
               var1.method_1376() == 1 ? Dev.ZWare.Client.pkg1.Class6.method_200("notif_totem") : Dev.ZWare.Client.pkg1.Class6.method_200("notif_totems")
            },
            new Color[]{
               this.field_1393.method_671(),
               this.field_1397.method_671(),
               this.method_2031(var1.method_1377()),
               this.field_1397.method_671(),
               this.method_2036(),
               this.method_2036()
            },
            this.method_2036()
         );
      };
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6) java.awt.Color
   private Color method_2030(Class8.Inner6 var1) {
      return switch (var1.method_1372()) {
         case MODULE_TOGGLE -> var1.method_1374() ? (Color)this.field_1395.method_671() : (Color)this.field_1396.method_671();
         case VISUAL_RANGE -> this.method_2031(var1.method_1377());
         case TOTEM_POP -> this.method_2036();
      };
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.Class12$Inner1) java.awt.Color
   private Color method_2031(Dev.ZWare.Client.pkg1.Class12.Inner1 var1) {
      return switch (var1) {
         case SELF, FRIEND -> this.method_2035(this.method_2033());
         case ENEMY -> this.method_2035(this.method_2034());
         case NONE -> this.method_2035(this.method_2032());
      };
   }

   // $VF: renamed from: a () int
   private int method_2032() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? var1.method_2318() : -1;
   }

   // $VF: renamed from: b () int
   private int method_2033() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? var1.method_2316() : -11155201;
   }

   // $VF: renamed from: c () int
   private int method_2034() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? var1.method_2317() : -42406;
   }

   // $VF: renamed from: a (int) java.awt.Color
   private Color method_2035(int var1) {
      return new Color(var1, true);
   }

   // $VF: renamed from: a () java.awt.Color
   private Color method_2036() {
      Dev.ZWare.Client.features.pkg1.pkg5.Class3 var1 = Dev.ZWare.Client.features.pkg1.pkg5.Class3.method_2315();
      return var1 != null ? this.method_2035(var1.method_2319()) : new Color(225, 120, 20, 255);
   }

   // $VF: renamed from: b () java.awt.Color
   private static Color method_2037() {
      if (Dev.ZWare.Client.Class1.field_296 == null) {
         return new Color(0, 120, 255, 255);
      } else {
         Color var0 = Dev.ZWare.Client.Class1.field_296.method_492();
         return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), 255);
      }
   }

   private record Inner2(String o, Dev.ZWare.Client.pkg1.Class12.Inner1 p) {
      // $VF: renamed from: o java.lang.String
      private final String field_919;
      // $VF: renamed from: p Dev.ZWare.Client.pkg1.Class12$Inner1
      private final Dev.ZWare.Client.pkg1.Class12.Inner1 field_920;

      private Inner2(String o, Dev.ZWare.Client.pkg1.Class12.Inner1 p) {
         this.field_919 = o;
         this.field_920 = p;
      }

      // $VF: renamed from: o () java.lang.String
      public String method_1449() {
         return this.field_919;
      }

      // $VF: renamed from: p () Dev.ZWare.Client.pkg1.Class12$Inner1
      public Dev.ZWare.Client.pkg1.Class12.Inner1 method_1450() {
         return this.field_920;
      }
   }

   private record Inner3(String[] l, Color[] m, Color n) {
      // $VF: renamed from: l java.lang.String[]
      private final String[] field_901;
      // $VF: renamed from: m java.awt.Color[]
      private final Color[] field_902;
      // $VF: renamed from: n java.awt.Color
      private final Color field_903;

      private Inner3(String[] l, Color[] m, Color n) {
         this.field_901 = l;
         this.field_902 = m;
         this.field_903 = n;
      }

      // $VF: renamed from: l () java.lang.String[]
      public String[] method_1428() {
         return this.field_901;
      }

      // $VF: renamed from: m () java.awt.Color[]
      public Color[] method_1429() {
         return this.field_902;
      }

      // $VF: renamed from: n () java.awt.Color
      public Color method_1430() {
         return this.field_903;
      }
   }

   public static enum Inner4 {
      None,
      Fade,
      Slide;
   }

   public static enum Inner5 {
      English,
      Russian;
   }

   private record Inner6(Class8.Inner7 e, String f, boolean g, boolean h, int i, Dev.ZWare.Client.pkg1.Class12.Inner1 j, long k) {
      // $VF: renamed from: e Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner7
      private final Class8.Inner7 field_850;
      // $VF: renamed from: f java.lang.String
      private final String field_851;
      // $VF: renamed from: g boolean
      private final boolean field_852;
      // $VF: renamed from: h boolean
      private final boolean field_853;
      // $VF: renamed from: i int
      private final int field_854;
      // $VF: renamed from: j Dev.ZWare.Client.pkg1.Class12$Inner1
      private final Dev.ZWare.Client.pkg1.Class12.Inner1 field_855;
      // $VF: renamed from: k long
      private final long field_856;

      private Inner6(Class8.Inner7 e, String f, boolean g, boolean h, int i, Dev.ZWare.Client.pkg1.Class12.Inner1 j, long k) {
         this.field_850 = e;
         this.field_851 = f;
         this.field_852 = g;
         this.field_853 = h;
         this.field_854 = i;
         this.field_855 = j;
         this.field_856 = k;
      }

      // $VF: renamed from: a (java.lang.String, boolean, long) Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6
      private static Class8.Inner6 method_1369(String var0, boolean var1, long var2) {
         return new Class8.Inner6(Class8.Inner7.MODULE_TOGGLE, var0, var1, false, 0, Dev.ZWare.Client.pkg1.Class12.Inner1.NONE, var2);
      }

      // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.pkg1.Class12$Inner1, boolean, long) Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6
      private static Class8.Inner6 method_1370(String var0, Dev.ZWare.Client.pkg1.Class12.Inner1 var1, boolean var2, long var3) {
         return new Class8.Inner6(Class8.Inner7.VISUAL_RANGE, var0, false, var2, 0, var1, var3);
      }

      // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.pkg1.Class12$Inner1, int, long) Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner6
      private static Class8.Inner6 method_1371(String var0, Dev.ZWare.Client.pkg1.Class12.Inner1 var1, int var2, long var3) {
         return new Class8.Inner6(Class8.Inner7.TOTEM_POP, var0, false, false, var2, var1, var3);
      }

      // $VF: renamed from: e () Dev.ZWare.Client.features.pkg1.pkg4.Class8$Inner7
      public Class8.Inner7 method_1372() {
         return this.field_850;
      }

      // $VF: renamed from: f () java.lang.String
      public String method_1373() {
         return this.field_851;
      }

      // $VF: renamed from: g () boolean
      public boolean method_1374() {
         return this.field_852;
      }

      // $VF: renamed from: h () boolean
      public boolean method_1375() {
         return this.field_853;
      }

      // $VF: renamed from: i () int
      public int method_1376() {
         return this.field_854;
      }

      // $VF: renamed from: j () Dev.ZWare.Client.pkg1.Class12$Inner1
      public Dev.ZWare.Client.pkg1.Class12.Inner1 method_1377() {
         return this.field_855;
      }

      // $VF: renamed from: k () long
      public long method_1378() {
         return this.field_856;
      }
   }

   private static enum Inner7 {
      MODULE_TOGGLE,
      VISUAL_RANGE,
      TOTEM_POP;
   }
}
