package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.net.UnknownHostException;
import net.minecraft.client.network.MultiplayerServerListPinger;
import net.minecraft.client.network.ServerInfo;

public class Class7 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F java.lang.String[]
   private static final String[] field_3035 = new String[]{"Potions", "TPS", "Ping", "NewPing", "FPS", "Speed", "NewSpeed"};
   // $VF: renamed from: G net.minecraft.client.network.MultiplayerServerListPinger
   private final MultiplayerServerListPinger field_3036 = new MultiplayerServerListPinger();
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3037 = this.a("Shadow", true);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3038 = this.a("LabelColor", new Color(175, 175, 175, 255));
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_3039 = this.a("ValueColor", new Color(255, 255, 255, 255));
   // $VF: renamed from: K int
   private volatile int field_3040 = -1;
   // $VF: renamed from: L boolean
   private volatile boolean field_3041;
   // $VF: renamed from: M long
   private long field_3042;
   // $VF: renamed from: N long
   private long field_3043;
   // $VF: renamed from: O java.lang.String
   private String field_3044 = "";

   public Class7() {
      super("NewPing", "Shows your ping using Latency settings.", 70.0F, 10.0F);
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3752(true);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (c.method_1542()) {
         this.method_3752(true);
         this.a(0.0F);
         this.b(0.0F);
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class6 var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class6.method_2079();
         Dev.ZWare.Client.features.pkg1.pkg4.Class6.Inner1 var3 = var2 != null
            ? var2.method_2080()
            : Dev.ZWare.Client.features.pkg1.pkg4.Class6.Inner1.field_620;
         long var4 = var2 != null ? var2.method_2081() : 3000L;
         if (var3 != Dev.ZWare.Client.features.pkg1.pkg4.Class6.Inner1.QueryPing) {
            this.method_3752(true);
         } else {
            this.method_3749(var4);
         }
         String var6 = switch (var3) {
            case field_620 -> (Dev.ZWare.Client.Class1.field_295 != null ? Dev.ZWare.Client.Class1.field_295.method_1646() : 0) + "ms";
            case QueryPing -> this.field_3040 >= 0 ? this.field_3040 + "ms" : "...";
         };
         String var7 = "Ping ";
         float var8 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var7) + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var6);
         float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
         this.a(var8, var9, field_3035);
         super.method_3643(event);
         float var10 = this.a(var8);
         float var11 = this.f();
         this.method_3753(event, var7, var10, var11, this.field_3038.method_671());
         this.method_3753(event, var6, var10 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var7), var11, this.field_3039.method_671());
      }
   }

   // $VF: renamed from: c () boolean
   @Override
   protected boolean method_3663() {
      return this.n() || !c.method_1542();
   }

   // $VF: renamed from: a (long) void
   private void method_3749(long var1) {
      ServerInfo var3 = c.method_1558();
      if (var3 == null) {
         this.method_3752(true);
      } else {
         if (var1 != this.field_3043) {
            this.field_3043 = var1;
            this.field_3042 = 0L;
         }

         this.field_3036.method_3000();
         if (!var3.field_3761.equals(this.field_3044)) {
            this.method_3752(true);
            this.field_3044 = var3.field_3761;
            this.field_3040 = this.method_3751(var3.field_3758);
         }

         long var4 = System.currentTimeMillis();
         if (!this.field_3041 && var4 >= this.field_3042) {
            this.field_3041 = true;

            try {
               this.field_3036.method_3003(var3, () -> this.method_3750(var3), () -> this.method_3750(var3));
            } catch (UnknownHostException var7) {
               this.method_3750(var3);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.network.ServerInfo) void
   private void method_3750(ServerInfo var1) {
      this.field_3040 = this.method_3751(var1.field_3758);
      this.field_3041 = false;
      this.field_3042 = System.currentTimeMillis() + Math.max(250L, this.field_3043);
   }

   // $VF: renamed from: a (long) int
   private int method_3751(long var1) {
      return var1 >= 0L && var1 <= 2147483647L ? (int)var1 : -1;
   }

   // $VF: renamed from: a (boolean) void
   private void method_3752(boolean var1) {
      if (var1) {
         this.field_3036.method_3004();
      }

      this.field_3041 = false;
      this.field_3040 = -1;
      this.field_3042 = 0L;
      this.field_3043 = 0L;
      this.field_3044 = "";
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.lang.String, float, float, java.awt.Color) void
   private void method_3753(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, String var2, float var3, float var4, Color var5) {
      if (this.field_3037.method_671()) {
         this.b(var1.method_1053(), var2, var3, var4, var5.getRGB());
      } else {
         this.a(var1.method_1053(), var2, var3, var4, var5.getRGB());
      }
   }
}
