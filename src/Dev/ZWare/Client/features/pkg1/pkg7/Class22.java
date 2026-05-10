package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.StatisticsS2CPacket;
import net.minecraft.stat.Stat;
import net.minecraft.stat.StatHandler;
import net.minecraft.stat.Stats;
import net.minecraft.util.Formatting;

public class Class22 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F float
   private static final float field_3019 = 16.0F;
   // $VF: renamed from: G float
   private static final float field_3020 = 6.0F;
   // $VF: renamed from: H float
   private static final float field_3021 = 5.0F;
   // $VF: renamed from: I float
   private static final float field_3022 = 4.0F;
   // $VF: renamed from: J long
   private static final long field_3023 = 10000L;
   // $VF: renamed from: K net.minecraft.item.ItemStack
   private static final ItemStack field_3024 = Blocks.field_22109.method_8389().method_7854();
   // $VF: renamed from: L net.minecraft.stat.Stat
   private static final Stat<?> field_3025 = Stats.field_15427.method_14956(Blocks.field_22109);
   // $VF: renamed from: M int
   private int field_3026 = -1;
   // $VF: renamed from: N long
   private long field_3027;
   // $VF: renamed from: O java.lang.String
   private String field_3028 = "";

   public Class22() {
      super("Stats", "Shows session and lifetime ancient debris stats.", 120.0F, 36.0F);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3743();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3743();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      super.method_3643(e);
      Class22.Inner1 var2 = new Class22.Inner1(Dev.ZWare.Client.pkg1.Class6.method_200("session"), this.method_3740());
      Class22.Inner1 var3 = new Class22.Inner1(Dev.ZWare.Client.pkg1.Class6.method_200("lifetime"), this.method_3741());
      float var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
      float var5 = Math.max(16.0F, var4);
      float var6 = Math.max(this.method_3739(var2), this.method_3739(var3));
      float var7 = var5 * 2.0F + 4.0F;
      this.a(var6, var7);
      float var8 = this.e();
      float var9 = this.f();
      this.method_3738(e, var2, var8, var9, var5);
      this.method_3738(e, var3, var8, var9 + var5 + 4.0F, var5);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3736(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (g()) {
         this.method_3743();
      } else if (c.method_1542()) {
         this.field_3026 = this.method_3742();
         this.field_3028 = "singleplayer";
      } else {
         String var2 = this.method_3744();
         if (!var2.equals(this.field_3028)) {
            this.field_3028 = var2;
            this.field_3026 = -1;
            this.field_3027 = 0L;
         }

         long var3 = System.currentTimeMillis();
         if (c.method_1562() != null && var3 - this.field_3027 >= 10000L) {
            this.field_3027 = var3;
            c.method_1562().method_52787(new ClientStatusC2SPacket(Mode.field_12775));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3737(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (var1.method_1045() instanceof StatisticsS2CPacket var2) {
         this.field_3026 = var2.comp_2197().getInt(field_3025);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, Dev.ZWare.Client.features.pkg1.pkg7.Class22$Inner1, float, float, float) void
   private void method_3738(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, Class22.Inner1 var2, float var3, float var4, float var5) {
      float var6 = var4 + (var5 - Dev.ZWare.Client.pkg1.pkg2.Class1.method_134()) / 2.0F;
      int var7 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      String var8 = Formatting.field_1068 + Integer.toString(var2.method_1472());
      this.b(var1.method_1053(), var2.method_1471(), var3, var6, var7);
      float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2.method_1471());
      float var10 = var3 + var9 + 6.0F;
      float var11 = var4 + (var5 - 16.0F) / 2.0F;
      var1.method_1053().method_51427(field_3024, Math.round(var10), Math.round(var11));
      float var12 = var10 + 16.0F + 5.0F;
      this.a(var1.method_1053(), "stats-" + var2.method_1471().toLowerCase(), var8, var12, var6, var7);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg7.Class22$Inner1) float
   private float method_3739(Class22.Inner1 var1) {
      String var2 = Formatting.field_1068 + Integer.toString(var1.method_1472());
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var1.method_1471()) + 6.0F + 16.0F + 5.0F + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
   }

   // $VF: renamed from: c () int
   private int method_3740() {
      if (this.n() && g()) {
         return 12;
      } else if (Dev.ZWare.Client.Class1.field_316 == null) {
         return 0;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg1.Class16 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg1.Class16.class);
         return var1 != null ? var1.method_2458() : 0;
      }
   }

   // $VF: renamed from: d () int
   private int method_3741() {
      if (this.n() && g()) {
         return 347;
      } else if (g()) {
         return 0;
      } else {
         return this.field_3026 >= 0 ? this.field_3026 : this.method_3742();
      }
   }

   // $VF: renamed from: e () int
   private int method_3742() {
      StatHandler var1 = c.field_1724 != null ? c.field_1724.method_3143() : null;
      return var1 != null ? var1.method_15025(field_3025) : 0;
   }

   // $VF: renamed from: p () void
   private void method_3743() {
      this.field_3026 = -1;
      this.field_3027 = 0L;
      this.field_3028 = "";
   }

   // $VF: renamed from: g () java.lang.String
   private String method_3744() {
      if (c.method_1558() != null && c.method_1558().field_3761 != null) {
         return c.method_1558().field_3761;
      } else {
         return c.field_1687 != null ? c.field_1687.method_27983().method_29177().toString() : "";
      }
   }

   private record Inner1(String bH, int bI) {
      // $VF: renamed from: bH java.lang.String
      private final String field_941;
      // $VF: renamed from: bI int
      private final int field_942;

      private Inner1(String bH, int bI) {
         this.field_941 = bH;
         this.field_942 = bI;
      }

      // $VF: renamed from: bH () java.lang.String
      public String method_1471() {
         return this.field_941;
      }

      // $VF: renamed from: bI () int
      public int method_1472() {
         return this.field_942;
      }
   }
}
