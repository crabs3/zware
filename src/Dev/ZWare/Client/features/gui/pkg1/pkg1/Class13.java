package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Class13 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1160 = 2;
   // $VF: renamed from: o int
   private static final int field_1161 = 14;
   // $VF: renamed from: p int
   private static final int field_1162 = 14;
   // $VF: renamed from: q int
   private static final int field_1163 = 14;
   // $VF: renamed from: r int
   private static final int field_1164 = 8;
   // $VF: renamed from: s int
   private static final int field_1165 = 220;
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_1166;
   // $VF: renamed from: u boolean
   private boolean field_1167;
   // $VF: renamed from: v boolean
   private boolean field_1168;
   // $VF: renamed from: w java.lang.String
   private String field_1169 = "";
   // $VF: renamed from: x int
   private int field_1170;
   // $VF: renamed from: y java.lang.String
   private String field_1171;

   public Class13(Dev.ZWare.Client.features.pkg3.Class8<String> setting) {
      super(setting.method_670());
      this.field_1166 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.field_1171 = null;
      this.a(context, this.c(this.method_1820(mouseX, mouseY)));
      int var5 = Math.max(24, Math.round(this.c() - this.e()) - Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1166.method_670()) - 12);
      String var6 = this.method_1829(this.method_1827(), var5);
      this.a(this.field_1166.method_670() + " " + Formatting.field_1080 + var6, -1);
      if (this.field_1167) {
         int var7 = Math.round(this.g);
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var9 = this.method_1826();
         int var10 = var7 + var9;
         int var12 = var8 + 14;
         context.method_25294(var7, var8, var10, var12, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7, var8, var10, var12, 1426063360, 1.0F);
         String var13 = this.field_1169.isEmpty() && !this.field_1168 ? "*" : this.field_1169 + (this.field_1168 ? Class6.method_1819() : "");
         String var14 = "Search " + Formatting.field_1080 + var13;
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var14, var7 + 3, var8 + 3, -1);
         List var15 = this.method_1824();
         byte var16 = 8;
         int var17 = Math.max(1, (int)Math.ceil((double)var15.size() / Math.max(1, var16)));
         this.field_1170 = Math.max(0, Math.min(this.field_1170, var17 - 1));
         int var18 = var12 + 2;
         int var19 = var18 + 112;
         context.method_25294(var7, var18, var10, var19, 1711276032);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7, var18, var10, var19, 1426063360, 1.0F);
         if (var15.isEmpty()) {
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, Formatting.field_1080 + "No fonts found", var7 + 4, var18 + 3, -1);
         } else {
            int var20 = this.field_1170 * var16;
            int var21 = Math.min(var15.size(), var20 + var16);

            for (int var22 = var20; var22 < var21; var22++) {
               int var23 = var22 - var20;
               int var24 = var18 + var23 * 14;
               int var25 = var24 + 14;
               String var26 = (String)var15.get(var22);
               boolean var27 = this.method_1828(var26);
               boolean var28 = this.method_1832(mouseX, mouseY, var7 + 1, var24, var10 - 1, var25);
               int var29 = var27 ? -2008774401 : (var28 ? 1144206131 : 571543825);
               context.method_25294(var7 + 1, var24, var10 - 1, var25, var29);
               if (var27 || var28) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7 + 1, var24, var10 - 1, var25, var27 ? -7820545 : -1722460843, 1.0F);
               }

               String var30 = this.method_1829(var26, var9 - 8);
               Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var30, var7 + 4, var24 + 3, -1);
               if (var28) {
                  this.field_1171 = var26;
               }
            }
         }

         int var31 = var19 + 2;
         int var32 = var31 + 14;
         context.method_25294(var7, var31, var10, var32, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7, var31, var10, var32, 1426063360, 1.0F);
         int var33 = var9 / 2;
         int var34 = var7 + 1;
         int var35 = var7 + var33 - 1;
         int var36 = var7 + var33 + 1;
         int var37 = var10 - 1;
         boolean var38 = this.method_1832(mouseX, mouseY, var34, var31 + 1, var35, var32 - 1);
         boolean var39 = this.method_1832(mouseX, mouseY, var36, var31 + 1, var37, var32 - 1);
         context.method_25294(var34, var31 + 1, var35, var32 - 1, var38 ? 860111940 : 571543825);
         context.method_25294(var36, var31 + 1, var37, var32 - 1, var39 ? 860111940 : 571543825);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, "<", var34 + 5, var31 + 3, -1);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, ">", var37 - 8, var31 + 3, -1);
         String var40 = this.field_1170 + 1 + "/" + var17;
         int var41 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var40);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var40, var7 + (var9 - var41) / 2.0F, var31 + 3, -1);
         if (this.field_1171 != null && !this.field_1171.equals(this.method_1829(this.field_1171, var9 - 8))) {
            context.method_51434(c.field_1772, List.of(Text.method_43470(this.field_1171)), mouseX, mouseY);
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (!this.method_1820(mouseX, mouseY) || mouseButton != 0 && mouseButton != 1) {
         if (this.field_1167) {
            int var4 = Math.round(this.g);
            int var5 = Math.round(this.h + this.d() + 1.0F);
            int var6 = this.method_1826();
            int var7 = var4 + var6;
            int var9 = var5 + 14;
            int var10 = var9 + 2;
            int var11 = var10 + 112;
            int var12 = var11 + 2;
            int var13 = var12 + 14;
            if (mouseButton == 0 && this.method_1832(mouseX, mouseY, var4, var5, var7, var9)) {
               this.field_1168 = true;
               this.f();
            } else {
               List var14 = this.method_1824();
               byte var15 = 8;
               int var16 = Math.max(1, (int)Math.ceil((double)var14.size() / Math.max(1, var15)));
               this.field_1170 = Math.max(0, Math.min(this.field_1170, var16 - 1));
               int var17 = this.field_1170 * var15;
               int var18 = Math.min(var14.size(), var17 + var15);

               for (int var19 = var17; var19 < var18; var19++) {
                  int var20 = var19 - var17;
                  int var21 = var10 + var20 * 14;
                  int var22 = var21 + 14;
                  if (mouseButton == 0 && this.method_1832(mouseX, mouseY, var4 + 1, var21, var7 - 1, var22)) {
                     this.field_1166.method_672((String)var14.get(var19));
                     this.method_1822();
                     this.f();
                     return;
                  }
               }

               int var24 = var6 / 2;
               int var25 = var4 + 1;
               int var26 = var4 + var24 - 1;
               int var27 = var4 + var24 + 1;
               int var23 = var7 - 1;
               if (mouseButton == 0 && this.method_1832(mouseX, mouseY, var25, var12 + 1, var26, var13 - 1)) {
                  this.field_1170 = Math.max(0, this.field_1170 - 1);
                  this.f();
               } else {
                  if (mouseButton == 0 && this.method_1832(mouseX, mouseY, var27, var12 + 1, var23, var13 - 1)) {
                     this.field_1170 = Math.min(var16 - 1, this.field_1170 + 1);
                     this.f();
                  }
               }
            }
         }
      } else {
         if (this.field_1167) {
            this.method_1822();
         } else {
            this.method_1821();
         }

         this.f();
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1167 && this.field_1168 && this.method_1831(typedChar)) {
         this.field_1169 = this.field_1169 + typedChar;
         this.field_1170 = 0;
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1167) {
         switch (key) {
            case 256:
               if (!this.field_1169.isEmpty()) {
                  this.field_1169 = "";
                  this.field_1170 = 0;
                  return;
               }

               this.method_1822();
               return;
            case 257:
            case 335:
               this.method_1823();
               return;
            case 259:
               if (this.field_1168 && !this.field_1169.isEmpty()) {
                  this.field_1169 = this.field_1169.substring(0, this.field_1169.length() - 1);
                  this.field_1170 = 0;
                  return;
               }

               return;
            case 262:
               this.field_1170++;
               return;
            case 263:
               this.field_1170 = Math.max(0, this.field_1170 - 1);
               return;
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      boolean var1 = this.field_1166.method_710();
      this.a(!var1);
      if (!var1 && this.field_1167) {
         this.method_1822();
      }
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1167 ? this.d() : this.d() + 1 + 14 + 2 + 112 + 2 + 14 + 2;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      int var1 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1166.method_670() + " " + Formatting.field_1080 + this.method_1827()) + 8;
      if (!this.field_1167) {
         return Math.min(Math.max(Class11.method_1738(), var1), this.method_1826() + 4);
      } else {
         int var2 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Search " + this.field_1169 + Class6.method_1819()) + 10;
         return Math.max(Math.min(var1, this.method_1826() + 4), Math.max(var2, this.method_1826() + 4));
      }
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (this.method_1820(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1167) {
         return false;
      } else {
         int var7 = Math.round(this.g);
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1826();
         int var6 = var8 + 14 + 2 + 112 + 2 + 14 + 2;
         return this.method_1832(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1167;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1820(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: g () void
   private void method_1821() {
      this.field_1167 = true;
      this.field_1168 = false;
      this.field_1169 = "";
      this.field_1170 = 0;
   }

   // $VF: renamed from: h () void
   private void method_1822() {
      this.field_1167 = false;
      this.field_1168 = false;
      this.field_1170 = 0;
      this.field_1171 = null;
   }

   // $VF: renamed from: i () void
   private void method_1823() {
      List var1 = this.method_1824();
      if (!var1.isEmpty()) {
         this.field_1166.method_672((String)var1.get(0));
         this.method_1822();
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<String> method_1824() {
      List var1 = this.method_1825();
      if (this.field_1169.isEmpty()) {
         return var1;
      } else {
         String var2 = this.field_1169.toLowerCase(Locale.ROOT);
         String var3 = this.method_1830(this.field_1169);
         ArrayList var4 = new ArrayList();

         for (String var6 : var1) {
            String var7 = this.method_1830(var6);
            if (var6.toLowerCase(Locale.ROOT).contains(var2) || var7.contains(var3)) {
               var4.add(var6);
            }
         }

         return var4;
      }
   }

   // $VF: renamed from: c () java.util.List
   private List<String> method_1825() {
      if (Dev.ZWare.Client.Class1.field_297 != null) {
         return Dev.ZWare.Client.Class1.field_297.method_835();
      } else {
         return this.field_1166.method_681() instanceof Dev.ZWare.Client.features.pkg1.pkg4.Class8 var1 ? var1.method_1998() : List.of("Lexend Deca", "Dialog");
      }
   }

   // $VF: renamed from: j () int
   private int method_1826() {
      return Math.max(Class11.method_1738(), 220);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1827() {
      String var1 = this.field_1166.method_671();
      return var1 != null && !var1.isBlank() ? var1 : "Lexend Deca";
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_1828(String var1) {
      String var2 = this.field_1166.method_671();
      return var2 == null ? false : this.method_1830(var1).equals(this.method_1830(var2));
   }

   // $VF: renamed from: b (java.lang.String, int) java.lang.String
   private String method_1829(String var1, int var2) {
      if (var1 != null && !var1.isEmpty() && var2 > 0 && Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var1) > var2) {
         String var3 = "...";
         int var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3);
         if (var4 >= var2) {
            return var3;
         } else {
            int var5 = var1.length();

            while (var5 > 0 && Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var1.substring(0, var5)) + var4 > var2) {
               var5--;
            }

            return var1.substring(0, Math.max(0, var5)) + var3;
         }
      } else {
         return var1;
      }
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_1830(String var1) {
      if (var1 != null && !var1.isBlank()) {
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4 = Character.toLowerCase(var1.charAt(var3));
            if (Character.isLetterOrDigit(var4)) {
               var2.append(var4);
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_1831(char var1) {
      return !Character.isISOControl(var1);
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1832(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }
}
