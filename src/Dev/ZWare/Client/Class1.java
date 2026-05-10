package Dev.ZWare.Client;

import Dev.ZWare.Client.features.gui.HudEditorScreen;
import Dev.ZWare.Client.pkg4.Class10;
import Dev.ZWare.Client.pkg4.Class11;
import Dev.ZWare.Client.pkg4.Class13;
import Dev.ZWare.Client.pkg4.Class14;
import Dev.ZWare.Client.pkg4.Class15;
import Dev.ZWare.Client.pkg4.Class16;
import Dev.ZWare.Client.pkg4.Class18;
import Dev.ZWare.Client.pkg4.Class19;
import Dev.ZWare.Client.pkg4.Class2;
import Dev.ZWare.Client.pkg4.Class20;
import Dev.ZWare.Client.pkg4.Class21;
import Dev.ZWare.Client.pkg4.Class22;
import Dev.ZWare.Client.pkg4.Class23;
import Dev.ZWare.Client.pkg4.Class24;
import Dev.ZWare.Client.pkg4.Class3;
import Dev.ZWare.Client.pkg4.Class4;
import Dev.ZWare.Client.pkg4.Class5;
import Dev.ZWare.Client.pkg4.Class6;
import Dev.ZWare.Client.pkg4.Class7;
import Dev.ZWare.Client.pkg4.Class8;
import Dev.ZWare.Client.pkg4.Class9;
import Dev.ZWare.Client.pkg4.KitManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1 implements ModInitializer, ClientModInitializer {
   // $VF: renamed from: a java.lang.String
   public static final String field_289 = "ZWare";
   // $VF: renamed from: b java.lang.String
   public static final String field_290 = SharedConstants.method_16673().method_48019();
   // $VF: renamed from: c java.lang.String
   public static final String field_291;
   // $VF: renamed from: d java.lang.String
   public static final String field_292;
   // $VF: renamed from: e float
   public static float field_293;
   // $VF: renamed from: f org.apache.logging.log4j.Logger
   public static final Logger field_294;
   // $VF: renamed from: g Dev.ZWare.Client.pkg4.Class20
   public static Class20 field_295;
   // $VF: renamed from: h Dev.ZWare.Client.pkg4.Class13
   public static Class13 field_296;
   // $VF: renamed from: i Dev.ZWare.Client.pkg4.Class6
   public static Class6 field_297;
   // $VF: renamed from: j Dev.ZWare.Client.pkg4.Class9
   public static Class9 field_298;
   // $VF: renamed from: k Dev.ZWare.Client.pkg1.pkg7.Class1
   public static Dev.ZWare.Client.pkg1.pkg7.Class1 field_299;
   // $VF: renamed from: l Dev.ZWare.Client.pkg4.Class22
   public static Class22 field_300;
   // $VF: renamed from: m Dev.ZWare.Client.pkg4.Class16
   public static Class16 field_301;
   // $VF: renamed from: n Dev.ZWare.Client.pkg4.Class1
   public static Dev.ZWare.Client.pkg4.Class1 field_302;
   // $VF: renamed from: o Dev.ZWare.Client.pkg4.Class3
   public static Class3 field_303;
   // $VF: renamed from: p Dev.ZWare.Client.pkg4.Class10
   public static Class10 field_304;
   // $VF: renamed from: q Dev.ZWare.Client.pkg4.Class19
   public static Class19 field_305;
   // $VF: renamed from: r Dev.ZWare.Client.pkg1.pkg2.pkg1.Class3
   public static Dev.ZWare.Client.pkg1.pkg2.pkg1.Class3 field_306;
   // $VF: renamed from: s Dev.ZWare.Client.pkg4.Class18
   public static Class18 field_307;
   // $VF: renamed from: t Dev.ZWare.Client.pkg4.Class14
   public static Class14 field_308;
   // $VF: renamed from: u Dev.ZWare.Client.pkg4.Class23
   public static Class23 field_309;
   // $VF: renamed from: v Dev.ZWare.Client.pkg4.Class24
   public static Class24 field_310;
   // $VF: renamed from: w Dev.ZWare.Client.pkg4.Class21
   public static Class21 field_311;
   // $VF: renamed from: x Dev.ZWare.Client.pkg4.KitManager
   public static KitManager field_312;
   // $VF: renamed from: y Dev.ZWare.Client.pkg4.Class2
   public static Class2 field_313;
   // $VF: renamed from: z Dev.ZWare.Client.pkg4.Class15
   public static Class15 field_314;
   // $VF: renamed from: A Dev.ZWare.Client.pkg4.Class8
   public static Class8 field_315;
   // $VF: renamed from: B Dev.ZWare.Client.pkg4.Class7
   public static Class7 field_316;
   // $VF: renamed from: C Dev.ZWare.Client.pkg4.Class11
   public static Class11 field_317;
   // $VF: renamed from: D Dev.ZWare.Client.pkg4.Class4
   public static Class4 field_318;
   // $VF: renamed from: E Dev.ZWare.Client.pkg4.Class5
   public static Class5 field_319;
   // $VF: renamed from: F Dev.ZWare.Client.features.gui.HudEditorScreen
   public static HudEditorScreen field_320;

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private static String method_620(String var0) {
      try {
         Process var1 = new ProcessBuilder("git", "rev-parse", "--short", "HEAD").redirectErrorStream(true).start();

         String var4;
         try (BufferedReader var2 = new BufferedReader(new InputStreamReader(var1.getInputStream(), StandardCharsets.UTF_8))) {
            String var3 = var2.readLine();
            if (var1.waitFor() != 0 || var3 == null || var3.isBlank()) {
               return var0;
            }

            var4 = var3.trim();
         }

         return var4;
      } catch (Exception var7) {
         return var0;
      }
   }

   public void onInitialize() {
      field_307 = new Class18();
      field_295 = new Class20();
      field_298 = new Class9();
      field_299 = new Dev.ZWare.Client.pkg1.pkg7.Class1();
      field_299.method_108();
      field_300 = new Class22();
      field_301 = new Class16();
      field_302 = new Dev.ZWare.Client.pkg4.Class1();
      field_303 = new Class3();
      field_304 = new Class10();
      field_310 = new Class24();
      field_311 = new Class21();
      field_312 = new KitManager();
      field_313 = new Class2();
      field_314 = new Class15();
      field_315 = new Class8();
      field_306 = new Dev.ZWare.Client.pkg1.pkg2.pkg1.Class3();
      field_296 = new Class13();
      field_297 = new Class6();
      field_309 = new Class23();
      field_316 = new Class7();
      field_308 = new Class14();
      field_318 = new Class4();
      field_319 = new Class5();
      Dev.ZWare.Client.pkg1.Class11.method_289();
   }

   public void onInitializeClient() {
      Dev.ZWare.Client.pkg1.Class4.method_226();
      field_307.method_1583();
      field_316.method_508();
      field_318.method_235();
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(field_319);
      field_306.method_789();
      field_320 = new HudEditorScreen();
      field_317 = new Class11();
      if (field_314 != null) {
         field_314.method_35();
      }

      field_317.method_170();
      field_316.method_522();
      field_296.method_491();
      if (field_315 != null) {
         field_315.method_70();
      }

      Runtime.getRuntime().addShutdownHook(new Thread(() -> {
         if (field_317 != null) {
            field_317.method_171();
         }

         if (field_315 != null) {
            field_315.method_71();
         }
      }, "ZWare-Shutdown"));
   }

   static {
      String var0 = "1.3";
      String var1 = "unknown";

      try (InputStream var2 = Class1.class.getResourceAsStream("/zware-build.properties")) {
         if (var2 != null) {
            Properties var3 = new Properties();
            var3.load(var2);
            var0 = var3.getProperty("mod_version", var0);
            var1 = var3.getProperty("git_hash", var1);
         }
      } catch (Exception var7) {
      }

      if ("unknown".equalsIgnoreCase(var1)) {
         var1 = method_620(var1);
      }

      field_291 = var0;
      field_292 = var1;
      field_293 = 1.0F;
      field_294 = LogManager.getLogger("OyVey");
   }
}
