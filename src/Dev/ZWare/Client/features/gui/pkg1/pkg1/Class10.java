package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Formatting;

public class Class10 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1148 = 14;
   // $VF: renamed from: o int
   private static final int field_1149 = 1;
   // $VF: renamed from: p int
   private static final int field_1150 = 132;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Enum<?>> field_1151;
   // $VF: renamed from: r boolean
   private boolean field_1152;
   // $VF: renamed from: s float
   private float field_1153;
   // $VF: renamed from: t long
   private long field_1154 = -1L;

   public Class10(Dev.ZWare.Client.features.pkg3.Class8<Enum<?>> setting) {
      super(setting.method_670());
      this.field_1151 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.a(context, this.a(this.method_1808(mouseX, mouseY)));
      this.a(this.field_1151.method_670(), this.e());
      float var5 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1151.method_670());
      float var6 = this.g + var5 + 8.0F;
      float var7 = this.g + this.i - 4.0F;
      float var8 = var7 - var6;
      if (var8 > 10.0F) {
         context.method_44379((int)var6, (int)this.h, (int)var7, (int)this.d());
         Enum[] var9 = this.method_1812();
         int var10 = this.field_1151.method_688();
         long var11 = System.currentTimeMillis();
         if (this.field_1154 == -1L) {
            this.field_1154 = var11;
         }

         float var13 = Math.min(0.1F, (float)(var11 - this.field_1154) / 1000.0F);
         this.field_1154 = var11;
         float var14 = this.method_1814() * 65.0F;
         float var15 = var10 - this.field_1153;
         if (Math.abs(var15) > var9.length / 2.0F) {
            if (var15 > 0.0F) {
               this.field_1153 += var9.length;
            } else {
               this.field_1153 -= var9.length;
            }

            var15 = var10 - this.field_1153;
         }

         if (Math.abs(var15) < 0.001F) {
            this.field_1153 = var10;
         } else {
            float var16 = Math.min(1.0F, var13 * var14);
            this.field_1153 += var15 * var16;
         }

         if (this.field_1153 < 0.0F) {
            this.field_1153 += var9.length;
         }

         if (this.field_1153 >= var9.length) {
            this.field_1153 -= var9.length;
         }

         float var30 = (var6 + var7) / 2.0F;
         float var17 = this.f();
         float var18 = (var7 - var6) / 2.0F;
         byte var19 = 3;

         for (int var20 = -var19; var20 <= var19; var20++) {
            float var21 = var20 + (float)Math.floor(this.field_1153) - this.field_1153;
            int var22 = (int)Math.floor(this.field_1153) + var20;
            int var23 = (var22 % var9.length + var9.length) % var9.length;
            this.method_1813(context, var9, var23, var21, var30, var17, var18);
         }

         context.method_44380();
      }

      if (this.field_1152) {
         int var24 = this.method_1810();
         int var25 = Math.round(this.h + this.d() + 1.0F);
         int var26 = var24 + this.method_1809();
         Enum[] var12 = this.method_1812();

         for (int var27 = 0; var27 < var12.length; var27++) {
            Enum var28 = var12[var27];
            int var29 = var25 + var27 * 14;
            int var31 = var29 + 14;
            boolean var32 = var28 == this.field_1151.method_671();
            boolean var33 = this.method_1815(mouseX, mouseY, var24, var29, var26, var31);
            int var34 = var32 ? this.b(var33) : this.c(var33);
            context.method_25294(var24 + 1, var29, var26 - 1, var31, var34);
            int var35 = var32 ? this.b(true) : 1426063360;
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var24, var29, var26, var31, var35, 1.0F);
            String var36 = this.a(Dev.ZWare.Client.features.pkg3.Class2.method_3816(var28), Math.max(12, this.method_1809() - 8));
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var36, var24 + 4, var29 + 3, var32 ? -1 : this.e());
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1151.method_710());
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (this.method_1808(mouseX, mouseY)) {
         if (mouseButton == 0) {
            this.field_1151.method_689();
            this.f();
            return;
         }

         if (mouseButton == 1) {
            this.field_1152 = !this.field_1152;
            this.f();
            return;
         }
      }

      if (this.field_1152 && mouseButton == 0) {
         int var4 = this.method_1810();
         int var5 = Math.round(this.h + this.d() + 1.0F);
         int var6 = var4 + this.method_1809();
         Enum[] var7 = this.method_1812();

         for (int var8 = 0; var8 < var7.length; var8++) {
            int var9 = var5 + var8 * 14;
            int var10 = var9 + 14;
            if (this.method_1815(mouseX, mouseY, var4, var9, var6, var10)) {
               this.field_1151.method_672(var7[var8]);
               this.f();
               return;
            }
         }
      }
   }

   // $VF: renamed from: c () boolean
   @Override
   public boolean method_1723() {
      return true;
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1152 ? this.d() : this.d() + 1 + this.method_1812().length * 14 + 1;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1151.method_670() + " " + Formatting.field_1080 + this.method_1811()) + 14;
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (this.method_1808(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1152) {
         return false;
      } else {
         int var7 = this.method_1810();
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1809();
         int var6 = var8 + this.method_1812().length * 14 + 1;
         return this.method_1815(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1152;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1808(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: j () int
   private int method_1809() {
      return Math.max(this.a(), 132);
   }

   // $VF: renamed from: k () int
   private int method_1810() {
      return Math.round(this.g + ((float)this.a() - this.method_1809()) / 2.0F);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1811() {
      String var1 = this.field_1151.method_687();
      return var1.equalsIgnoreCase("ABC") ? "ABC" : var1;
   }

   // $VF: renamed from: a () java.lang.Enum[]
   private Enum<?>[] method_1812() {
      return (Enum<?>[])this.field_1151.method_671().getDeclaringClass().getEnumConstants();
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.Enum[], int, float, float, float, float) void
   private void method_1813(DrawContext var1, Enum<?>[] var2, int var3, float var4, float var5, float var6, float var7) {
      if (var3 >= 0 && var3 < var2.length) {
         String var8 = Dev.ZWare.Client.features.pkg3.Class2.method_3816(var2[var3]);
         float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var8);
         float var10 = var4 * (float) (Math.PI / 3);
         if (!(Math.abs(var10) > Math.PI * 5.0 / 7.0)) {
            float var11 = (float)Math.sin(var10) * var7 * 1.2F;
            float var12 = var4 * (var7 * 0.5F);
            float var13 = (var11 + var12) * 1.5F;
            float var14 = (float)Math.pow(Math.cos(var10), 1.2F);
            if (!(var14 <= 0.05F)) {
               float var15 = var5 + var13;
               float var16 = var9 * var14;
               float var17 = var15 - var16 / 2.0F;
               float var18 = (float)Math.pow(var14, 3.0);
               int var19 = Math.max(0, Math.min(255, Math.round(255.0F * var18)));
               int var20 = Math.max(60, Math.min(255, Math.round(255.0F * var18)));
               int var21 = var19 << 24 | var20 << 16 | var20 << 8 | var20;
               var1.method_51448().method_22903();
               var1.method_51448().method_46416(var17, var6 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_134() * (1.0F - var14) / 2.0F, 0.0F);
               var1.method_51448().method_22905(var14, var14, 1.0F);
               Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var8, 0.0F, 0.0F, var21);
               var1.method_51448().method_22909();
            }
         }
      }
   }

   // $VF: renamed from: h () float
   private float method_1814() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class8.method_1995();
      return var1 != null && var1.field_1361 != null ? var1.field_1361.method_671() : 0.35F;
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1815(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }
}
