package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.SharedConstants;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.util.Identifier;

public class Class9 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F long
   private static final long field_3073 = System.currentTimeMillis();
   // $VF: renamed from: G float
   private static final float field_3074 = 3.0F;
   // $VF: renamed from: H float
   private static final float field_3075 = 2.0F;
   // $VF: renamed from: I int
   private static final int field_3076 = -5592406;

   public Class9() {
      super("User", "Displays your username, version, and uptime.", 120.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      String var2 = this.method_3783();
      String var3 = "Minecraft " + this.method_3784();
      String var4 = this.method_3785();
      String var5 = " - ";
      float var6 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
      int var7 = Math.max(10, Math.round(var6 + 1.0F));
      float var8 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2)
         + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5)
         + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3)
         + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5)
         + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4);
      float var9 = var7 + 3.0F + var8;
      float var10 = Math.max((float)var7, var6);
      this.method_3781(var9, var10);
      super.method_3643(e);
      float var11 = this.a(var9);
      float var12 = this.f();
      float var13 = var12 + (var10 - var7) / 2.0F;
      float var14 = var12 + (var10 - var6) / 2.0F;
      float var15 = var11 + var7 + 3.0F;
      int var16 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      this.method_3782(e, var11, var13, var7);
      this.b(e.method_1053(), var2, var15, var14, var16);
      var15 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
      this.b(e.method_1053(), var5, var15, var14, -5592406);
      var15 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5);
      this.b(e.method_1053(), var3, var15, var14, -1);
      var15 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3);
      this.b(e.method_1053(), var5, var15, var14, -5592406);
      var15 += Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var5);
      this.a(e.method_1053(), "uptime", var4, var15, var14, -1);
   }

   // $VF: renamed from: f (float, float) void
   private void method_3781(float var1, float var2) {
      float var3 = this.m();
      float var4 = var3;
      if (Dev.ZWare.Client.Class1.field_316 != null
         && Dev.ZWare.Client.Class1.field_316.method_510(Class14.class) instanceof Dev.ZWare.Client.features.pkg1.pkg4.Class11 var6
         && var6.d()) {
         var4 = var3 + (var6.method_3650() + 2.0F);
      }

      this.a(var3, var4, var1, var2);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, float, float, int) void
   private void method_3782(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, float var2, float var3, int var4) {
      Identifier var5 = c.field_1724 != null ? c.field_1724.method_52814().comp_1626() : DefaultSkinHelper.method_52854(c.method_53462()).comp_1626();
      var1.method_1053().method_25302(RenderLayer::method_62277, var5, Math.round(var2), Math.round(var3), 8.0F, 8.0F, var4, var4, 8, 8, 64, 64);
      var1.method_1053().method_25302(RenderLayer::method_62277, var5, Math.round(var2), Math.round(var3), 40.0F, 8.0F, var4, var4, 8, 8, 64, 64);
   }

   // $VF: renamed from: g () java.lang.String
   private String method_3783() {
      if (c.field_1724 != null) {
         return c.field_1724.method_5477().getString();
      } else {
         return c.method_53462() != null && c.method_53462().getName() != null ? c.method_53462().getName() : Dev.ZWare.Client.pkg1.Class6.method_200("player");
      }
   }

   // $VF: renamed from: h () java.lang.String
   private String method_3784() {
      return SharedConstants.method_16673().method_48019();
   }

   // $VF: renamed from: i () java.lang.String
   private String method_3785() {
      long var1 = Math.max(0L, (System.currentTimeMillis() - field_3073) / 1000L);
      long var3 = var1 / 3600L;
      long var5 = var1 % 3600L / 60L;
      long var7 = var1 % 60L;
      if (var3 > 0L) {
         return String.format("%dh %02dm", var3, var5);
      } else {
         return var5 > 0L ? String.format("%dm %02ds", var5, var7) : var7 + "s";
      }
   }
}
