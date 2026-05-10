package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.net.UnknownHostException;
import net.minecraft.client.network.MultiplayerServerListPinger;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.util.Formatting;

public class Class6 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F net.minecraft.client.network.MultiplayerServerListPinger
   private final MultiplayerServerListPinger field_3029 = new MultiplayerServerListPinger();
   // $VF: renamed from: G int
   private volatile int field_3030 = -1;
   // $VF: renamed from: H boolean
   private volatile boolean field_3031;
   // $VF: renamed from: I long
   private long field_3032;
   // $VF: renamed from: J long
   private long field_3033;
   // $VF: renamed from: K java.lang.String
   private String field_3034 = "";

   public Class6() {
      super("Ping", "Displays current server latency.", 60.0F, 10.0F);
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3748(true);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class6 var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class6.method_2079();
      Dev.ZWare.Client.features.pkg1.pkg4.Class6.Inner1 var3 = var2 != null ? var2.method_2080() : Dev.ZWare.Client.features.pkg1.pkg4.Class6.Inner1.field_620;
      long var4 = var2 != null ? var2.method_2081() : 3000L;
      if (c.method_1542()) {
         this.method_3748(true);
         this.a(0.0F);
         this.b(0.0F);
      } else {
         if (var3 != Dev.ZWare.Client.features.pkg1.pkg4.Class6.Inner1.QueryPing) {
            this.method_3748(true);
         } else {
            this.method_3745(var4);
         }
         String var6 = switch (var3) {
            case field_620 -> (Dev.ZWare.Client.Class1.field_295 != null ? Dev.ZWare.Client.Class1.field_295.method_1646() : 0) + "ms";
            case QueryPing -> this.field_3030 >= 0 ? this.field_3030 + "ms" : "...";
         };
         String var7 = Dev.ZWare.Client.pkg1.Class6.method_200("ping") + " " + Formatting.field_1068 + var6;
         int var8 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
         float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var7);
         this.a(var9, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134(), o);
         super.method_3643(e);
         this.a(e.method_1053(), "ping", var7, this.a(var9), this.f(), var8);
      }
   }

   // $VF: renamed from: c () boolean
   @Override
   protected boolean method_3663() {
      return this.n() || !c.method_1542();
   }

   // $VF: renamed from: a (long) void
   private void method_3745(long var1) {
      ServerInfo var3 = c.method_1558();
      if (var3 == null) {
         this.method_3748(true);
      } else {
         if (var1 != this.field_3033) {
            this.field_3033 = var1;
            this.field_3032 = 0L;
         }

         this.field_3029.method_3000();
         if (!var3.field_3761.equals(this.field_3034)) {
            this.method_3748(true);
            this.field_3034 = var3.field_3761;
            this.field_3030 = this.method_3747(var3.field_3758);
         }

         long var4 = System.currentTimeMillis();
         if (!this.field_3031 && var4 >= this.field_3032) {
            this.field_3031 = true;

            try {
               this.field_3029.method_3003(var3, () -> this.method_3746(var3), () -> this.method_3746(var3));
            } catch (UnknownHostException var7) {
               this.method_3746(var3);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.network.ServerInfo) void
   private void method_3746(ServerInfo var1) {
      this.field_3030 = this.method_3747(var1.field_3758);
      this.field_3031 = false;
      this.field_3032 = System.currentTimeMillis() + Math.max(250L, this.field_3033);
   }

   // $VF: renamed from: a (long) int
   private int method_3747(long var1) {
      return var1 >= 0L && var1 <= 2147483647L ? (int)var1 : -1;
   }

   // $VF: renamed from: a (boolean) void
   private void method_3748(boolean var1) {
      if (var1) {
         this.field_3029.method_3004();
      }

      this.field_3031 = false;
      this.field_3030 = -1;
      this.field_3032 = 0L;
      this.field_3033 = 0L;
      this.field_3034 = "";
   }
}
