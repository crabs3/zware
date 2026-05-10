package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class Class7 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1118 = 2;
   // $VF: renamed from: o int
   private static final int field_1119 = 14;
   // $VF: renamed from: p int
   private static final int field_1120 = 14;
   // $VF: renamed from: q int
   private static final int field_1121 = 14;
   // $VF: renamed from: r int
   private static final int field_1122 = 6;
   // $VF: renamed from: s int
   private static final int field_1123 = 180;
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class3
   private final Dev.ZWare.Client.features.pkg3.Class3 field_1124;
   // $VF: renamed from: u boolean
   private boolean field_1125;
   // $VF: renamed from: v boolean
   private boolean field_1126;
   // $VF: renamed from: w java.lang.String
   private String field_1127 = "";
   // $VF: renamed from: x int
   private int field_1128;
   // $VF: renamed from: y net.minecraft.entity.EntityType
   private EntityType<?> field_1129;

   public Class7(Dev.ZWare.Client.features.pkg3.Class3 setting) {
      super(setting.a());
      this.field_1124 = setting;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.field_1129 = null;
      this.a(context, this.c(this.method_1776(mouseX, mouseY)));
      String var5 = this.a(this.field_1124.a() + " " + Formatting.field_1080 + this.method_1783(), Math.max(16, this.a() - 6));
      this.a(var5, -1);
      if (this.field_1125) {
         int var6 = this.method_1782();
         int var7 = Math.round(this.h + this.d() + 1.0F);
         int var8 = this.method_1781();
         int var9 = var6 + var8;
         int var11 = var7 + 14;
         context.method_25294(var6, var7, var9, var11, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var6, var7, var9, var11, 1426063360, 1.0F);
         String var12 = this.field_1127.isEmpty() && !this.field_1126 ? "*" : this.field_1127 + (this.field_1126 ? Class6.method_1819() : "");
         String var13 = "Search " + Formatting.field_1080 + var12;
         var13 = this.a(var13, Math.max(16, var8 - 6));
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var13, var6 + 3, var7 + 3, -1);
         List var14 = this.method_1780();
         byte var15 = 6;
         int var16 = Math.max(1, (int)Math.ceil((double)var14.size() / var15));
         this.field_1128 = Math.max(0, Math.min(this.field_1128, var16 - 1));
         int var17 = var11 + 2;
         int var18 = var17 + 84;
         context.method_25294(var6, var17, var9, var18, 1711276032);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var6, var17, var9, var18, 1426063360, 1.0F);
         int var19 = this.field_1128 * var15;
         int var20 = Math.min(var14.size(), var19 + var15);

         for (int var21 = var19; var21 < var20; var21++) {
            int var22 = var21 - var19;
            int var23 = var17 + var22 * 14;
            int var24 = var23 + 14;
            EntityType var25 = (EntityType)var14.get(var21);
            boolean var26 = this.field_1124.method_714(var25);
            boolean var27 = this.method_1786(mouseX, mouseY, var6, var23, var9, var24);
            int var28 = var26 ? this.b(var27) : this.c(var27);
            context.method_25294(var6 + 1, var23, var9 - 1, var24, var28);
            int var29 = var6 + 3;
            int var30 = var23 + 3;
            int var31 = var29 + 8;
            int var32 = var30 + 8;
            context.method_25294(var29, var30, var31, var32, var26 ? this.b(false) : 1429418803);
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var29, var30, var31, var32, var26 ? this.b(true) : -1722460843, 1.0F);
            String var33 = Dev.ZWare.Client.features.pkg3.Class3.method_720(var25);
            var33 = this.a(var33, Math.max(16, var8 - 20));
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var33, var6 + 15, var23 + 3, -1);
            if (var27) {
               this.field_1129 = var25;
            }
         }

         int var35 = var18 + 2;
         int var36 = var35 + 14;
         context.method_25294(var6, var35, var9, var36, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var6, var35, var9, var36, 1426063360, 1.0F);
         int var37 = var8 / 2;
         int var38 = var6 + 1;
         int var39 = var6 + var37 - 1;
         int var40 = var6 + var37 + 1;
         int var41 = var9 - 1;
         boolean var42 = this.method_1786(mouseX, mouseY, var38, var35 + 1, var39, var36 - 1);
         boolean var43 = this.method_1786(mouseX, mouseY, var40, var35 + 1, var41, var36 - 1);
         context.method_25294(var38, var35 + 1, var39, var36 - 1, var42 ? 860111940 : 571543825);
         context.method_25294(var40, var35 + 1, var41, var36 - 1, var43 ? 860111940 : 571543825);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, "<", var38 + 5, var35 + 3, -1);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, ">", var41 - 8, var35 + 3, -1);
         String var44 = this.field_1128 + 1 + "/" + var16;
         int var45 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var44);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var44, var6 + (var8 - var45) / 2.0F, var35 + 3, -1);
         if (this.field_1129 != null) {
            context.method_51434(
               c.field_1772,
               List.of(
                  Text.method_43470(Dev.ZWare.Client.features.pkg3.Class3.method_720(this.field_1129)),
                  Text.method_43470(this.method_1784(this.field_1129)).method_27692(Formatting.field_1080)
               ),
               mouseX,
               mouseY
            );
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (!this.method_1776(mouseX, mouseY) || mouseButton != 0 && mouseButton != 1) {
         if (this.field_1125) {
            int var4 = this.method_1782();
            int var5 = Math.round(this.h + this.d() + 1.0F);
            int var6 = this.method_1781();
            int var8 = var5 + 14;
            int var9 = var8 + 2;
            int var10 = var9 + 84;
            int var11 = var10 + 2;
            int var12 = var11 + 14;
            if (mouseButton == 0 && this.method_1786(mouseX, mouseY, var4, var5, var4 + var6, var8)) {
               this.field_1126 = true;
               this.f();
            } else {
               List var13 = this.method_1780();
               byte var14 = 6;
               int var15 = Math.max(1, (int)Math.ceil((double)var13.size() / var14));
               this.field_1128 = Math.max(0, Math.min(this.field_1128, var15 - 1));
               int var16 = this.field_1128 * var14;
               int var17 = Math.min(var13.size(), var16 + var14);

               for (int var18 = var16; var18 < var17; var18++) {
                  int var19 = var18 - var16;
                  int var20 = var9 + var19 * 14;
                  int var21 = var20 + 14;
                  if (mouseButton == 0 && this.method_1786(mouseX, mouseY, var4, var20, var4 + var6, var21)) {
                     this.field_1124.method_715((EntityType<?>)var13.get(var18));
                     this.f();
                     return;
                  }
               }

               int var23 = var6 / 2;
               int var24 = var4 + 1;
               int var25 = var4 + var23 - 1;
               int var26 = var4 + var23 + 1;
               int var22 = var4 + var6 - 1;
               if (mouseButton == 0 && this.method_1786(mouseX, mouseY, var24, var11 + 1, var25, var12 - 1)) {
                  this.field_1128 = Math.max(0, this.field_1128 - 1);
                  this.f();
               } else {
                  if (mouseButton == 0 && this.method_1786(mouseX, mouseY, var26, var11 + 1, var22, var12 - 1)) {
                     this.field_1128 = Math.min(var15 - 1, this.field_1128 + 1);
                     this.f();
                  }
               }
            }
         }
      } else {
         if (this.field_1125) {
            this.method_1778();
         } else {
            this.method_1777();
         }

         this.f();
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1125 && this.field_1126 && this.method_1785(typedChar)) {
         this.field_1127 = this.field_1127 + Character.toLowerCase(typedChar);
         this.field_1128 = 0;
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1125) {
         switch (key) {
            case 256:
               if (!this.field_1127.isEmpty()) {
                  this.field_1127 = "";
                  this.field_1128 = 0;
                  return;
               }

               this.method_1778();
               return;
            case 257:
            case 335:
               this.method_1779();
               return;
            case 259:
               if (this.field_1126 && !this.field_1127.isEmpty()) {
                  this.field_1127 = this.field_1127.substring(0, this.field_1127.length() - 1);
                  this.field_1128 = 0;
                  return;
               }

               return;
            case 262:
               this.field_1128++;
               return;
            case 263:
               this.field_1128 = Math.max(0, this.field_1128 - 1);
               return;
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1124.n());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1125 ? this.d() : this.d() + 1 + 14 + 2 + 84 + 2 + 14 + 2;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1124.a() + " " + Formatting.field_1080 + this.method_1783()) + 8;
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (this.method_1776(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1125) {
         return false;
      } else {
         int var7 = this.method_1782();
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1781();
         int var6 = var8 + 14 + 2 + 84 + 2 + 14 + 2;
         return this.method_1786(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1125;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1776(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: g () void
   private void method_1777() {
      this.field_1125 = true;
      this.field_1126 = false;
      this.field_1128 = 0;
   }

   // $VF: renamed from: h () void
   private void method_1778() {
      this.field_1125 = false;
      this.field_1126 = false;
      this.field_1128 = 0;
      this.field_1129 = null;
   }

   // $VF: renamed from: i () void
   private void method_1779() {
      List var1 = this.method_1780();
      if (!var1.isEmpty()) {
         this.field_1124.method_715((EntityType<?>)var1.get(0));
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<EntityType<?>> method_1780() {
      List var1 = this.field_1124.method_717();
      if (this.field_1127.isEmpty()) {
         return var1;
      } else {
         String var2 = this.field_1127.toLowerCase(Locale.ROOT);
         ArrayList var3 = new ArrayList();

         for (EntityType var5 : var1) {
            String var6 = this.method_1784(var5).toLowerCase(Locale.ROOT);
            String var7 = Dev.ZWare.Client.features.pkg3.Class3.method_720(var5).toLowerCase(Locale.ROOT);
            if (var6.contains(var2) || var7.contains(var2)) {
               var3.add(var5);
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: j () int
   private int method_1781() {
      return Math.max(this.a(), 180);
   }

   // $VF: renamed from: k () int
   private int method_1782() {
      return Math.round(this.g + ((float)this.a() - this.method_1781()) / 2.0F);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1783() {
      String var1 = null;
      int var2 = 0;

      for (EntityType var4 : this.field_1124.method_717()) {
         if (this.field_1124.method_714(var4)) {
            if (var1 == null) {
               var1 = Dev.ZWare.Client.features.pkg3.Class3.method_720(var4);
            }

            var2++;
         }
      }

      if (var2 <= 0 || var1 == null) {
         return "None";
      } else {
         return var2 == 1 ? var1 : var1 + " +" + (var2 - 1);
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.EntityType) java.lang.String
   private String method_1784(EntityType<?> var1) {
      Identifier var2 = Registries.field_41177.method_10221(var1);
      return var2 != null ? var2.toString() : var1.toString();
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_1785(char var1) {
      return Character.isLetterOrDigit(var1) || Character.isSpaceChar(var1) || var1 == '_' || var1 == ':' || var1 == '/' || var1 == '.';
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1786(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }
}
