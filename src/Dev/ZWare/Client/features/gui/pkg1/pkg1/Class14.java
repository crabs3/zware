package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Class14 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1133 = 2;
   // $VF: renamed from: o int
   private static final int field_1134 = 14;
   // $VF: renamed from: p int
   private static final int field_1135 = 14;
   // $VF: renamed from: q int
   private static final int field_1136 = 14;
   // $VF: renamed from: r int
   private static final int field_1137 = 8;
   // $VF: renamed from: s int
   private static final int field_1138 = 220;
   // $VF: renamed from: t long
   private static final long field_1139 = 750L;
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_1140;
   // $VF: renamed from: v boolean
   private boolean field_1141;
   // $VF: renamed from: w boolean
   private boolean field_1142;
   // $VF: renamed from: x java.lang.String
   private String field_1143 = "";
   // $VF: renamed from: y int
   private int field_1144;
   // $VF: renamed from: z java.lang.String
   private String field_1145;
   // $VF: renamed from: A java.util.List
   private List<String> field_1146 = List.of();
   // $VF: renamed from: B long
   private long field_1147;

   public Class14(Dev.ZWare.Client.features.pkg3.Class8<String> setting) {
      super(setting.method_670());
      this.field_1140 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.field_1145 = null;
      this.method_1797();
      this.a(context, this.c(this.method_1791(mouseX, mouseY)));
      int var5 = Math.max(24, Math.round(this.c() - this.e()) - Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1140.method_670()) - 12);
      String var6 = this.method_1803(this.method_1802(), var5);
      this.a(this.field_1140.method_670() + " " + Formatting.field_1080 + var6, -1);
      if (this.field_1141) {
         int var7 = Math.round(this.g);
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var9 = this.method_1801();
         int var10 = var7 + var9;
         int var12 = var8 + 14;
         context.method_25294(var7, var8, var10, var12, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7, var8, var10, var12, 1426063360, 1.0F);
         String var13 = "Search " + Formatting.field_1080 + (this.field_1143.isEmpty() ? "*" : this.field_1143 + (this.field_1142 ? Class6.method_1819() : ""));
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var13, var7 + 3, var8 + 3, -1);
         List var14 = this.method_1795();
         byte var15 = 8;
         int var16 = Math.max(1, (int)Math.ceil((double)var14.size() / Math.max(1, var15)));
         this.field_1144 = Math.max(0, Math.min(this.field_1144, var16 - 1));
         int var17 = var12 + 2;
         int var18 = var17 + 112;
         context.method_25294(var7, var17, var10, var18, 1711276032);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7, var17, var10, var18, 1426063360, 1.0F);
         if (var14.isEmpty()) {
            String var19 = this.field_1143.isBlank()
               ? Formatting.field_1080 + "No bundled images found"
               : Formatting.field_1080 + "Press Enter to use raw path";
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var19, var7 + 4, var17 + 3, -1);
         } else {
            int var30 = this.field_1144 * var15;
            int var20 = Math.min(var14.size(), var30 + var15);

            for (int var21 = var30; var21 < var20; var21++) {
               int var22 = var21 - var30;
               int var23 = var17 + var22 * 14;
               int var24 = var23 + 14;
               Class14.Inner1 var25 = (Class14.Inner1)var14.get(var21);
               boolean var26 = this.method_1800(var25);
               boolean var27 = this.method_1807(mouseX, mouseY, var7 + 1, var23, var10 - 1, var24);
               int var28 = var26 ? this.b(var27) : this.c(var27);
               context.method_25294(var7 + 1, var23, var10 - 1, var24, var28);
               if (var26 || var27) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(
                     context.method_51448(), var7 + 1, var23, var10 - 1, var24, var26 ? this.b(true) : -1722460843, 1.0F
                  );
               }

               String var29 = this.method_1803(var25.method_1382(), var9 - 8);
               Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var29, var7 + 4, var23 + 3, -1);
               if (var27) {
                  this.field_1145 = var25.method_1382();
               }
            }
         }

         int var31 = var18 + 2;
         int var32 = var31 + 14;
         context.method_25294(var7, var31, var10, var32, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var7, var31, var10, var32, 1426063360, 1.0F);
         int var33 = var9 / 2;
         int var34 = var7 + 1;
         int var35 = var7 + var33 - 1;
         int var36 = var7 + var33 + 1;
         int var37 = var10 - 1;
         boolean var38 = this.method_1807(mouseX, mouseY, var34, var31 + 1, var35, var32 - 1);
         boolean var39 = this.method_1807(mouseX, mouseY, var36, var31 + 1, var37, var32 - 1);
         context.method_25294(var34, var31 + 1, var35, var32 - 1, var38 ? 860111940 : 571543825);
         context.method_25294(var36, var31 + 1, var37, var32 - 1, var39 ? 860111940 : 571543825);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, "<", var34 + 5, var31 + 3, -1);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, ">", var37 - 8, var31 + 3, -1);
         String var40 = this.field_1144 + 1 + "/" + var16;
         int var41 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var40);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var40, var7 + (var9 - var41) / 2.0F, var31 + 3, -1);
         if (this.field_1145 != null && !this.field_1145.equals(this.method_1803(this.field_1145, var9 - 8))) {
            context.method_51434(c.field_1772, List.of(Text.method_43470(this.field_1145)), mouseX, mouseY);
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (!this.method_1791(mouseX, mouseY) || mouseButton != 0 && mouseButton != 1) {
         if (this.field_1141) {
            int var4 = Math.round(this.g);
            int var5 = Math.round(this.h + this.d() + 1.0F);
            int var6 = this.method_1801();
            int var7 = var4 + var6;
            int var9 = var5 + 14;
            int var10 = var9 + 2;
            int var11 = var10 + 112;
            int var12 = var11 + 2;
            int var13 = var12 + 14;
            if (mouseButton == 0 && this.method_1807(mouseX, mouseY, var4, var5, var7, var9)) {
               this.field_1142 = true;
               this.f();
            } else {
               List var14 = this.method_1795();
               byte var15 = 8;
               int var16 = Math.max(1, (int)Math.ceil((double)var14.size() / Math.max(1, var15)));
               this.field_1144 = Math.max(0, Math.min(this.field_1144, var16 - 1));
               int var17 = this.field_1144 * var15;
               int var18 = Math.min(var14.size(), var17 + var15);

               for (int var19 = var17; var19 < var18; var19++) {
                  int var20 = var19 - var17;
                  int var21 = var10 + var20 * 14;
                  int var22 = var21 + 14;
                  if (mouseButton == 0 && this.method_1807(mouseX, mouseY, var4 + 1, var21, var7 - 1, var22)) {
                     this.field_1140.method_672(((Class14.Inner1)var14.get(var19)).method_1381());
                     this.method_1793();
                     this.f();
                     return;
                  }
               }

               int var24 = var6 / 2;
               int var25 = var4 + 1;
               int var26 = var4 + var24 - 1;
               int var27 = var4 + var24 + 1;
               int var23 = var7 - 1;
               if (mouseButton == 0 && this.method_1807(mouseX, mouseY, var25, var12 + 1, var26, var13 - 1)) {
                  this.field_1144 = Math.max(0, this.field_1144 - 1);
                  this.f();
               } else {
                  if (mouseButton == 0 && this.method_1807(mouseX, mouseY, var27, var12 + 1, var23, var13 - 1)) {
                     this.field_1144 = Math.min(var16 - 1, this.field_1144 + 1);
                     this.f();
                  }
               }
            }
         }
      } else {
         if (this.field_1141) {
            this.method_1793();
         } else {
            this.method_1792();
         }

         this.f();
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1141 && this.field_1142 && this.method_1805(typedChar)) {
         this.field_1143 = this.field_1143 + typedChar;
         this.field_1144 = 0;
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1141) {
         switch (key) {
            case 256:
               if (!this.field_1143.isEmpty()) {
                  this.field_1143 = "";
                  this.field_1144 = 0;
                  return;
               }

               this.method_1793();
               return;
            case 257:
            case 335:
               this.method_1794();
               return;
            case 259:
               if (this.field_1142 && !this.field_1143.isEmpty()) {
                  this.field_1143 = this.field_1143.substring(0, this.field_1143.length() - 1);
                  this.field_1144 = 0;
                  return;
               }

               return;
            case 262:
               this.field_1144++;
               return;
            case 263:
               this.field_1144 = Math.max(0, this.field_1144 - 1);
               return;
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      boolean var1 = this.field_1140.method_710();
      this.a(!var1);
      if (!var1 && this.field_1141) {
         this.method_1793();
      }
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1141 ? this.d() : this.d() + 1 + 14 + 2 + 112 + 2 + 14 + 2;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      int var1 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1140.method_670() + " " + Formatting.field_1080 + this.method_1802()) + 8;
      if (!this.field_1141) {
         return Math.min(Math.max(Class11.method_1738(), var1), this.method_1801() + 4);
      } else {
         int var2 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Search " + this.field_1143 + Class6.method_1819()) + 10;
         return Math.max(Math.min(var1, this.method_1801() + 4), Math.max(var2, this.method_1801() + 4));
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

      if (this.method_1791(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1141) {
         return false;
      } else {
         int var7 = Math.round(this.g);
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1801();
         int var6 = var8 + 14 + 2 + 112 + 2 + 14 + 2;
         return this.method_1807(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1141;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1791(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: g () void
   private void method_1792() {
      this.field_1141 = true;
      this.field_1142 = true;
      this.field_1143 = "";
      this.field_1144 = 0;
      this.method_1798(true);
   }

   // $VF: renamed from: h () void
   private void method_1793() {
      this.field_1141 = false;
      this.field_1142 = false;
      this.field_1144 = 0;
      this.field_1145 = null;
   }

   // $VF: renamed from: i () void
   private void method_1794() {
      List var1 = this.method_1796();
      if (!var1.isEmpty()) {
         this.field_1140.method_672((String)var1.get(0));
         this.method_1793();
      } else {
         if (!this.field_1143.isBlank()) {
            this.field_1140.method_672(this.field_1143.trim());
            this.method_1793();
         }
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<Class14.Inner1> method_1795() {
      ArrayList var1 = new ArrayList();
      List var2 = this.method_1796();
      if (this.method_1799(var2)) {
         var1.add(new Class14.Inner1(this.field_1143.trim(), "Use Raw Path: " + this.field_1143.trim(), true));
      }

      for (String var4 : var2) {
         var1.add(new Class14.Inner1(var4, var4, false));
      }

      return var1;
   }

   // $VF: renamed from: c () java.util.List
   private List<String> method_1796() {
      if (this.field_1143.isEmpty()) {
         return this.field_1146;
      } else {
         String var1 = this.field_1143.toLowerCase(Locale.ROOT);
         String var2 = this.method_1804(this.field_1143);
         ArrayList var3 = new ArrayList();

         for (String var5 : this.field_1146) {
            String var6 = this.method_1804(var5);
            if (var5.toLowerCase(Locale.ROOT).contains(var1) || var6.contains(var2)) {
               var3.add(var5);
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: j () void
   private void method_1797() {
      if (this.field_1141 || this.field_1146.isEmpty()) {
         long var1 = System.currentTimeMillis();
         if (this.field_1146.isEmpty() || var1 - this.field_1147 >= 750L) {
            this.method_1798(false);
         }
      }
   }

   // $VF: renamed from: a (boolean) void
   private void method_1798(boolean var1) {
      long var2 = System.currentTimeMillis();
      if (var1 || this.field_1146.isEmpty() || var2 - this.field_1147 >= 750L) {
         this.field_1146 = Dev.ZWare.Client.pkg1.pkg2.pkg1.Class4.method_398(c);
         this.field_1147 = var2;
      }
   }

   // $VF: renamed from: a (java.util.List) boolean
   private boolean method_1799(List<String> var1) {
      if (this.field_1143.isBlank()) {
         return false;
      } else {
         String var2 = this.method_1804(this.field_1143);

         for (String var4 : var1) {
            if (this.method_1804(var4).equals(var2)) {
               return false;
            }
         }

         return true;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.gui.pkg1.pkg1.Class14$Inner1) boolean
   private boolean method_1800(Class14.Inner1 var1) {
      String var2 = this.field_1140.method_671();
      return !var1.method_1383()
         ? Dev.ZWare.Client.pkg1.pkg2.pkg1.Class4.method_402(var2).equals(Dev.ZWare.Client.pkg1.pkg2.pkg1.Class4.method_402(var1.method_1381()))
         : this.method_1804(var2).equals(this.method_1804(var1.method_1381())) && !this.method_1806(var2);
   }

   // $VF: renamed from: j () int
   private int method_1801() {
      return Math.max(Class11.method_1738(), 220);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1802() {
      String var1 = this.field_1140.method_671();
      return var1 != null && !var1.isBlank() ? Dev.ZWare.Client.pkg1.pkg2.pkg1.Class4.method_400(var1) : "None";
   }

   // $VF: renamed from: b (java.lang.String, int) java.lang.String
   private String method_1803(String var1, int var2) {
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
   private String method_1804(String var1) {
      if (var1 != null && !var1.isBlank()) {
         StringBuilder var2 = new StringBuilder(var1.length());

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4 = Character.toLowerCase(var1.charAt(var3));
            if (Character.isLetterOrDigit(var4) || var4 == '.' || var4 == '/' || var4 == '_' || var4 == '-') {
               var2.append(var4);
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_1805(char var1) {
      return !Character.isISOControl(var1);
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_1806(String var1) {
      String var2 = Dev.ZWare.Client.pkg1.pkg2.pkg1.Class4.method_402(var1);

      for (String var4 : this.field_1146) {
         if (Dev.ZWare.Client.pkg1.pkg2.pkg1.Class4.method_402(var4).equals(var2)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1807(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }

   private record Inner1(String a, String b, boolean c) {
      // $VF: renamed from: a java.lang.String
      private final String field_859;
      // $VF: renamed from: b java.lang.String
      private final String field_860;
      // $VF: renamed from: c boolean
      private final boolean field_861;

      private Inner1(String a, String b, boolean c) {
         this.field_859 = a;
         this.field_860 = b;
         this.field_861 = c;
      }

      // $VF: renamed from: a () java.lang.String
      public String method_1381() {
         return this.field_859;
      }

      // $VF: renamed from: b () java.lang.String
      public String method_1382() {
         return this.field_860;
      }

      // $VF: renamed from: c () boolean
      public boolean method_1383() {
         return this.field_861;
      }
   }
}
