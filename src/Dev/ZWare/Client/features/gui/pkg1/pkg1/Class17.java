package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Formatting;

public class Class17 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1098 = 14;
   // $VF: renamed from: o int
   private static final int field_1099 = 1;
   // $VF: renamed from: p int
   private static final int field_1100 = 132;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class6
   private final Dev.ZWare.Client.features.pkg3.Class6 field_1101;
   // $VF: renamed from: r boolean
   private boolean field_1102;

   public Class17(Dev.ZWare.Client.features.pkg3.Class6 setting) {
      super(setting.a());
      this.field_1101 = setting;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.a(context, this.c(this.method_1755(mouseX, mouseY)));
      String var5 = this.a(this.field_1101.a() + " " + Formatting.field_1080 + this.method_1758(), Math.max(16, this.a() - 6));
      this.a(var5, -1);
      if (this.field_1102) {
         int var6 = this.method_1757();
         int var7 = Math.round(this.h + this.d() + 1.0F);
         int var8 = var6 + this.method_1756();
         List var9 = this.field_1101.method_725();

         for (int var10 = 0; var10 < var9.size(); var10++) {
            Dev.ZWare.Client.features.pkg3.Class6.Inner1 var11 = (Dev.ZWare.Client.features.pkg3.Class6.Inner1)var9.get(var10);
            int var12 = var7 + var10 * 14;
            int var13 = var12 + 14;
            boolean var14 = this.field_1101.method_722(var11.method_1320());
            boolean var15 = this.method_1759(mouseX, mouseY, var6, var12, var8, var13);
            int var16 = var14 ? this.b(var15) : this.c(var15);
            context.method_25294(var6, var12, var8, var13, var16);
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var6, var12, var8, var13, var14 ? this.b(true) : 1426063360, 1.0F);
            int var17 = var6 + 3;
            int var18 = var12 + 3;
            int var19 = var17 + 8;
            int var20 = var18 + 8;
            context.method_25294(var17, var18, var19, var20, var14 ? this.b(false) : 1429418803);
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var17, var18, var19, var20, var14 ? this.b(true) : -1722460843, 1.0F);
            String var21 = this.a(var11.method_1321(), Math.max(16, this.method_1756() - 20));
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var21, var6 + 15, var12 + 3, -1);
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (!this.method_1755(mouseX, mouseY) || mouseButton != 0 && mouseButton != 1) {
         if (this.field_1102 && mouseButton == 0) {
            int var4 = this.method_1757();
            int var5 = Math.round(this.h + this.d() + 1.0F);
            int var6 = var4 + this.method_1756();
            List var7 = this.field_1101.method_725();

            for (int var8 = 0; var8 < var7.size(); var8++) {
               int var9 = var5 + var8 * 14;
               int var10 = var9 + 14;
               if (this.method_1759(mouseX, mouseY, var4, var9, var6, var10)) {
                  this.field_1101.method_723(((Dev.ZWare.Client.features.pkg3.Class6.Inner1)var7.get(var8)).method_1320());
                  this.f();
                  return;
               }
            }
         }
      } else {
         this.field_1102 = !this.field_1102;
         this.f();
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1101.n());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1102 ? this.d() : this.d() + 1 + this.field_1101.method_725().size() * 14 + 1;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1101.a() + " " + Formatting.field_1080 + this.method_1758()) + 8;
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (this.method_1755(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1102) {
         return false;
      } else {
         int var7 = this.method_1757();
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1756();
         int var6 = var8 + this.field_1101.method_725().size() * 14 + 1;
         return this.method_1759(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1102;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1755(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: j () int
   private int method_1756() {
      return Math.max(this.a(), 132);
   }

   // $VF: renamed from: k () int
   private int method_1757() {
      return Math.round(this.g + ((float)this.a() - this.method_1756()) / 2.0F);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1758() {
      List var1 = this.field_1101.method_725();
      String var2 = null;
      int var3 = 0;

      for (Dev.ZWare.Client.features.pkg3.Class6.Inner1 var5 : var1) {
         if (this.field_1101.method_722(var5.method_1320())) {
            if (var2 == null) {
               var2 = var5.method_1321();
            }

            var3++;
         }
      }

      if (var3 <= 0 || var2 == null) {
         return "None";
      } else {
         return var3 == 1 ? var2 : var2 + " +" + (var3 - 1);
      }
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1759(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }
}
