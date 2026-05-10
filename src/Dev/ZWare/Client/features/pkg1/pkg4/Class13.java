package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.pkg1.Class16;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.Locale;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;

public class Class13 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_2315 = 5000L;
   // $VF: renamed from: p int
   private static final int field_2316 = 128;
   // $VF: renamed from: q java.lang.String
   private static final String field_2317 = "1473455069063282850";
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_2318 = this.a("Application ID", "1473455069063282850");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2319 = this.a("Update Delay", 5, 1, 30);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2320 = this.a("Show Server", false);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2321 = this.a("Show Username", false);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2322 = this.a("Show Dimension", true);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2323 = this.a("Show Version", true);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2324 = this.a("Show Elapsed Time", true);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2325 = this.a("Debug", false);
   // $VF: renamed from: z Dev.ZWare.Client.pkg1.Class16
   private final Class16 field_2326 = new Class16();
   // $VF: renamed from: A long
   private long field_2327;
   // $VF: renamed from: B long
   private long field_2328;
   // $VF: renamed from: C long
   private long field_2329;
   // $VF: renamed from: D java.lang.String
   private String field_2330 = "";
   // $VF: renamed from: E java.lang.String
   private String field_2331 = "";
   // $VF: renamed from: F java.lang.String
   private String field_2332 = "";

   public Class13() {
      super("Discord", "Shows your current ZWare session in Discord rich presence.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2327 = System.currentTimeMillis();
      this.field_2328 = 0L;
      this.field_2329 = 0L;
      this.field_2330 = "";
      this.field_2331 = this.method_2969();
      this.field_2332 = "";
      this.field_2326.method_744();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2326.method_735();
      this.field_2326.method_744();
      this.field_2330 = "";
      this.field_2332 = "";
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.method_2969().isBlank()) {
         return "No App";
      } else if (!this.field_2326.method_739().isBlank()) {
         return "Error";
      } else if (this.field_2326.method_737()) {
         return this.field_2326.method_742() > 0L ? "Ack" : "Ready";
      } else {
         return this.field_2326.method_736() ? "Handshake" : "Retry";
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2962(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      String var2 = this.method_2969();
      if (var2.isBlank()) {
         if (this.field_2326.method_736()) {
            this.field_2326.method_735();
            this.field_2326.method_744();
         }

         this.field_2331 = "";
         this.field_2330 = "";
         this.method_2964();
      } else {
         if (!var2.equals(this.field_2331)) {
            this.field_2331 = var2;
            this.field_2330 = "";
            this.field_2328 = 0L;
            this.field_2326.method_744();
         }

         long var3 = System.currentTimeMillis();
         if (!this.field_2326.method_736()) {
            if (var3 - this.field_2328 >= 5000L) {
               this.field_2328 = var3;
               this.field_2326.method_733(var2);
            }

            this.method_2964();
         } else if (!this.field_2326.method_737()) {
            this.method_2964();
         } else {
            String var5 = this.method_2965();
            if (!var5.isEmpty()) {
               long var6 = this.field_2319.method_671().intValue() * 1000L;
               if (!var5.equals(this.field_2330) || var3 - this.field_2329 >= var6) {
                  this.field_2326.method_734(this.method_2963());
                  this.field_2330 = var5;
                  this.field_2329 = var3;
               }

               this.method_2964();
            }
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.Class16$Inner3
   private Class16.Inner3 method_2963() {
      return new Class16.Inner3(
         this.method_2970(this.method_2966()), this.method_2970(this.method_2967()), this.field_2324.method_671() ? this.field_2327 : null
      );
   }

   // $VF: renamed from: n () void
   private void method_2964() {
      if (this.field_2325.method_671() && !g()) {
         String var1 = this.method_1898();
         String var2 = this.field_2326.method_740();
         String var3 = this.field_2326.method_743();
         String var4 = this.field_2326.method_739();
         String var5 = var1 + "|" + var2 + "|" + var3 + "|" + var4;
         if (!var5.equals(this.field_2332)) {
            this.field_2332 = var5;
            Dev.ZWare.Client.features.pkg2.Class1.method_1647(
               "[DiscordRPC] status=%s socket=%s ack=%s error=%s", var1, this.method_2971(var2, 56), this.method_2971(var3, 72), this.method_2971(var4, 72)
            );
         }
      }
   }

   // $VF: renamed from: g () java.lang.String
   private String method_2965() {
      return this.method_2966() + "\n" + this.method_2967() + "\n" + this.field_2324.method_671();
   }

   // $VF: renamed from: h () java.lang.String
   private String method_2966() {
      if (c.field_1687 == null) {
         return "In Menus";
      } else if (c.method_1542()) {
         return "Singleplayer";
      } else {
         ServerInfo var1 = c.method_1558();
         return this.field_2320.method_671() && var1 != null && var1.field_3761 != null && !var1.field_3761.isBlank()
            ? "Server " + var1.field_3761.trim()
            : "Multiplayer";
      }
   }

   // $VF: renamed from: i () java.lang.String
   private String method_2967() {
      ArrayList var1 = new ArrayList();
      var1.add(this.field_2323.method_671() ? "ZWare " + Dev.ZWare.Client.Class1.field_291 : "ZWare");
      if (this.field_2322.method_671() && c.field_1687 != null) {
         var1.add(this.method_2968(c.field_1687.method_27983()));
      }

      if (this.field_2321.method_671()) {
         String var2 = c.field_1724 != null ? c.field_1724.method_7334().getName() : (c.method_1548() != null ? c.method_1548().method_1676() : "");
         if (var2 != null && !var2.isBlank()) {
            var1.add(var2);
         }
      }

      return String.join(" | ", var1);
   }

   // $VF: renamed from: a (net.minecraft.registry.RegistryKey) java.lang.String
   private String method_2968(RegistryKey<World> var1) {
      if (var1 == null) {
         return "Unknown";
      } else if (World.field_25179.equals(var1)) {
         return "Overworld";
      } else if (World.field_25180.equals(var1)) {
         return "Nether";
      } else if (World.field_25181.equals(var1)) {
         return "End";
      } else {
         String var2 = var1.method_29177().method_12832();
         if (var2 != null && !var2.isBlank()) {
            String[] var3 = var2.replace('-', ' ').replace('_', ' ').split("\\s+");
            StringBuilder var4 = new StringBuilder();

            for (String var8 : var3) {
               if (!var8.isBlank()) {
                  if (var4.length() > 0) {
                     var4.append(' ');
                  }

                  var4.append(Character.toUpperCase(var8.charAt(0)));
                  if (var8.length() > 1) {
                     var4.append(var8.substring(1).toLowerCase(Locale.ROOT));
                  }
               }
            }

            return var4.isEmpty() ? "Custom" : var4.toString();
         } else {
            return "Custom";
         }
      }
   }

   // $VF: renamed from: j () java.lang.String
   private String method_2969() {
      String var1 = this.field_2318.method_671();
      return var1 == null ? "" : var1.trim();
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_2970(String var1) {
      if (var1 == null) {
         return "";
      } else {
         String var2 = var1.trim();
         return var2.length() <= 128 ? var2 : var2.substring(0, 128);
      }
   }

   // $VF: renamed from: a (java.lang.String, int) java.lang.String
   private String method_2971(String var1, int var2) {
      if (var1 != null && !var1.isBlank()) {
         String var3 = var1.replace('\n', ' ').replace('\r', ' ').trim();
         return var3.length() <= var2 ? var3 : var3.substring(0, Math.max(0, var2 - 3)) + "...";
      } else {
         return "-";
      }
   }
}
