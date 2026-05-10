package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class Class16 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1203 = 2;
   // $VF: renamed from: o int
   private static final int field_1204 = 14;
   // $VF: renamed from: p int
   private static final int field_1205 = 14;
   // $VF: renamed from: q int
   private static final int field_1206 = 18;
   // $VF: renamed from: r int
   private static final int field_1207 = 4;
   // $VF: renamed from: s int
   private static final int field_1208 = 4;
   // $VF: renamed from: t java.util.List
   private static final List<Item> field_1209 = method_1873();
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Item> field_1210;
   // $VF: renamed from: v boolean
   private boolean field_1211;
   // $VF: renamed from: w boolean
   private boolean field_1212;
   // $VF: renamed from: x java.lang.String
   private String field_1213 = "";
   // $VF: renamed from: y int
   private int field_1214;
   // $VF: renamed from: z net.minecraft.item.Item
   private Item field_1215;

   public Class16(Dev.ZWare.Client.features.pkg3.Class8<Item> setting) {
      super(setting.method_670());
      this.field_1210 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.field_1215 = null;
      int var5 = Math.round(this.c());
      this.a(context, this.c(this.method_1860(mouseX, mouseY)));
      int var6 = var5 - 15;
      int var7 = Math.round(this.h + (this.d() - 16.0F) / 2.0F);
      ItemStack var8 = this.field_1210.method_671() == Items.field_8162 ? ItemStack.field_8037 : new ItemStack((ItemConvertible)this.field_1210.method_671());
      if (!var8.method_7960()) {
         context.method_51427(var8, var6, var7);
      }

      this.a(this.field_1210.method_670() + " " + Formatting.field_1080 + this.method_1868(), -1);
      if (this.field_1211) {
         int var9 = Math.round(this.g);
         int var10 = Math.round(this.h + this.d() + 1.0F);
         int var11 = this.method_1867();
         int var12 = var9 + var11;
         int var14 = var10 + 14;
         context.method_25294(var9, var10, var12, var14, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var9, var10, var12, var14, 1426063360, 1.0F);
         String var15 = this.field_1213.isEmpty() && !this.field_1212 ? "*" : this.field_1213 + (this.field_1212 ? Class6.method_1819() : "");
         String var16 = "Search " + Formatting.field_1080 + var15;
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var16, var9 + 3, var10 + 3, -1);
         List var17 = this.method_1865();
         int var18 = this.method_1866();
         int var19 = var18 * 4;
         int var20 = Math.max(1, (int)Math.ceil((double)var17.size() / Math.max(1, var19)));
         this.field_1214 = Math.max(0, Math.min(this.field_1214, var20 - 1));
         int var21 = var14 + 2;
         int var22 = var21 + 72;
         context.method_25294(var9, var21, var12, var22, 1711276032);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var9, var21, var12, var22, 1426063360, 1.0F);
         int var23 = this.field_1214 * var19;
         int var24 = Math.min(var17.size(), var23 + var19);

         for (int var25 = var23; var25 < var24; var25++) {
            int var26 = var25 - var23;
            int var27 = var26 % var18;
            int var28 = var26 / var18;
            int var29 = var9 + 2 + var27 * 18;
            int var30 = var21 + 2 + var28 * 18;
            int var31 = var29 + 18 - 2;
            int var32 = var30 + 18 - 2;
            Item var33 = (Item)var17.get(var25);
            boolean var34 = var33 == this.field_1210.method_671();
            boolean var35 = this.method_1872(mouseX, mouseY, var29, var30, var31, var32);
            int var36 = var34 ? -2008774401 : (var35 ? 1144206131 : 571543825);
            context.method_25294(var29, var30, var31, var32, var36);
            if (var34 || var35) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var29, var30, var31, var32, var34 ? -7820545 : -1722460843, 1.0F);
            }

            ItemStack var37 = var33 == Items.field_8162 ? ItemStack.field_8037 : new ItemStack(var33);
            if (!var37.method_7960()) {
               context.method_51427(var37, var29 + 1, var30 + 1);
            }

            if (var35) {
               this.field_1215 = var33;
            }
         }

         int var38 = var22 + 2;
         int var39 = var38 + 14;
         context.method_25294(var9, var38, var12, var39, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var9, var38, var12, var39, 1426063360, 1.0F);
         int var40 = var11 / 2;
         int var41 = var9 + 1;
         int var42 = var9 + var40 - 1;
         int var43 = var9 + var40 + 1;
         int var44 = var12 - 1;
         boolean var45 = this.method_1872(mouseX, mouseY, var41, var38 + 1, var42, var39 - 1);
         boolean var46 = this.method_1872(mouseX, mouseY, var43, var38 + 1, var44, var39 - 1);
         context.method_25294(var41, var38 + 1, var42, var39 - 1, var45 ? 860111940 : 571543825);
         context.method_25294(var43, var38 + 1, var44, var39 - 1, var46 ? 860111940 : 571543825);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, "<", var41 + 5, var38 + 3, -1);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, ">", var44 - 8, var38 + 3, -1);
         String var47 = this.field_1214 + 1 + "/" + var20;
         int var48 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var47);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var47, var9 + (var11 - var48) / 2, var38 + 3, -1);
         if (this.field_1215 != null) {
            context.method_51434(
               c.field_1772,
               List.of(
                  Text.method_43470(this.method_1870(this.field_1215)),
                  Text.method_43470(this.method_1869(this.field_1215)).method_27692(Formatting.field_1080)
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
      if (this.method_1860(mouseX, mouseY)) {
         if (mouseButton == 0) {
            if (!this.field_1211 && !this.method_1863()) {
               this.method_1861();
            } else if (!this.field_1211) {
               this.field_1212 = false;
            }

            this.f();
            return;
         }

         if (mouseButton == 1) {
            if (this.field_1211) {
               this.method_1862();
            } else {
               this.method_1861();
            }

            this.f();
            return;
         }
      }

      if (this.field_1211) {
         int var4 = Math.round(this.g);
         int var5 = Math.round(this.h + this.d() + 1.0F);
         int var6 = this.method_1867();
         int var8 = var5 + 14;
         int var9 = var8 + 2;
         int var10 = var9 + 72;
         int var11 = var10 + 2;
         int var12 = var11 + 14;
         if (mouseButton == 0 && this.method_1872(mouseX, mouseY, var4, var5, var4 + var6, var8)) {
            this.field_1212 = true;
            this.f();
         } else {
            List var13 = this.method_1865();
            int var14 = this.method_1866();
            int var15 = var14 * 4;
            int var16 = Math.max(1, (int)Math.ceil((double)var13.size() / Math.max(1, var15)));
            this.field_1214 = Math.max(0, Math.min(this.field_1214, var16 - 1));
            int var17 = this.field_1214 * var15;
            int var18 = Math.min(var13.size(), var17 + var15);

            for (int var19 = var17; var19 < var18; var19++) {
               int var20 = var19 - var17;
               int var21 = var20 % var14;
               int var22 = var20 / var14;
               int var23 = var4 + 2 + var21 * 18;
               int var24 = var9 + 2 + var22 * 18;
               int var25 = var23 + 18 - 2;
               int var26 = var24 + 18 - 2;
               if (mouseButton == 0 && this.method_1872(mouseX, mouseY, var23, var24, var25, var26)) {
                  this.field_1210.method_672((Item)var13.get(var19));
                  this.method_1862();
                  this.f();
                  return;
               }
            }

            int var27 = var6 / 2;
            int var28 = var4 + 1;
            int var29 = var4 + var27 - 1;
            int var30 = var4 + var27 + 1;
            int var31 = var4 + var6 - 1;
            if (mouseButton == 0 && this.method_1872(mouseX, mouseY, var28, var11 + 1, var29, var12 - 1)) {
               this.field_1214 = Math.max(0, this.field_1214 - 1);
               this.f();
            } else {
               if (mouseButton == 0 && this.method_1872(mouseX, mouseY, var30, var11 + 1, var31, var12 - 1)) {
                  this.field_1214 = Math.min(var16 - 1, this.field_1214 + 1);
                  this.f();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1211 && this.field_1212 && this.method_1871(typedChar)) {
         this.field_1213 = this.field_1213 + Character.toLowerCase(typedChar);
         this.field_1214 = 0;
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1211) {
         switch (key) {
            case 256:
               if (!this.field_1213.isEmpty()) {
                  this.field_1213 = "";
                  this.field_1214 = 0;
                  return;
               }

               this.method_1862();
               return;
            case 257:
            case 335:
               this.method_1864();
               return;
            case 259:
               if (this.field_1212 && !this.field_1213.isEmpty()) {
                  this.field_1213 = this.field_1213.substring(0, this.field_1213.length() - 1);
                  this.field_1214 = 0;
                  return;
               }

               return;
            case 262:
               this.field_1214++;
               return;
            case 263:
               this.field_1214 = Math.max(0, this.field_1214 - 1);
               return;
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1210.method_710());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1211 ? this.d() : this.d() + 1 + 14 + 2 + 72 + 2 + 14 + 2;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      int var1 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1210.method_670() + " " + Formatting.field_1080 + this.method_1868()) + 20;
      if (!this.field_1211) {
         return var1;
      } else {
         int var2 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132("Search " + this.field_1213 + Class6.method_1819()) + 10;
         return Math.max(var1, Math.max(var2, this.method_1867() + 4));
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

      if (this.method_1860(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1211) {
         return false;
      } else {
         int var7 = Math.round(this.g);
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1867();
         int var6 = var8 + 14 + 2 + 72 + 2 + 14 + 2;
         return this.method_1872(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1211;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1860(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: g () void
   private void method_1861() {
      this.field_1211 = true;
      this.field_1212 = false;
      this.field_1214 = 0;
   }

   // $VF: renamed from: h () void
   private void method_1862() {
      this.field_1211 = false;
      this.field_1212 = false;
      this.field_1214 = 0;
      this.field_1215 = null;
   }

   // $VF: renamed from: d () boolean
   private boolean method_1863() {
      if (c.field_1724 == null) {
         return false;
      } else {
         ItemStack var1 = c.field_1724.method_6047();
         if (!var1.method_7960()) {
            this.field_1210.method_672(var1.method_7909());
            return true;
         } else {
            ItemStack var2 = c.field_1724.method_6079();
            if (!var2.method_7960()) {
               this.field_1210.method_672(var2.method_7909());
               return true;
            } else {
               return false;
            }
         }
      }
   }

   // $VF: renamed from: i () void
   private void method_1864() {
      List var1 = this.method_1865();
      if (!var1.isEmpty()) {
         if (!this.field_1213.isEmpty()) {
            Identifier var2 = Identifier.method_12829(this.field_1213);
            if (var2 != null && Registries.field_41178.method_10250(var2)) {
               this.field_1210.method_672((Item)Registries.field_41178.method_63535(var2));
               this.method_1862();
               return;
            }
         }

         this.field_1210.method_672((Item)var1.get(0));
         this.method_1862();
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<Item> method_1865() {
      if (this.field_1213.isEmpty()) {
         return field_1209;
      } else {
         String var1 = this.field_1213.toLowerCase(Locale.ROOT);
         ArrayList var2 = new ArrayList();

         for (Item var4 : field_1209) {
            String var5 = this.method_1869(var4).toLowerCase(Locale.ROOT);
            String var6 = this.method_1870(var4).toLowerCase(Locale.ROOT);
            if (var5.contains(var1) || var6.contains(var1)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: j () int
   private int method_1866() {
      int var1 = this.method_1867();
      return Math.max(4, (var1 - 4) / 18);
   }

   // $VF: renamed from: k () int
   private int method_1867() {
      return Math.max(Class11.method_1738(), 76);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1868() {
      return this.method_1869(this.field_1210.method_671());
   }

   // $VF: renamed from: a (net.minecraft.item.Item) java.lang.String
   private String method_1869(Item var1) {
      if (var1 == null) {
         return "air";
      } else {
         Identifier var2 = Registries.field_41178.method_10221(var1);
         if (var2 != null) {
            return var2.method_12836().equals("minecraft") ? var2.method_12832() : var2.toString();
         } else {
            return this.method_1870(var1);
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.item.Item) java.lang.String
   private String method_1870(Item var1) {
      return var1 == null ? "Air" : var1.method_63680().getString();
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_1871(char var1) {
      return Character.isLetterOrDigit(var1) || var1 == '_' || var1 == ':' || var1 == '/' || var1 == '.';
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1872(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }

   // $VF: renamed from: c () java.util.List
   private static List<Item> method_1873() {
      ArrayList var0 = new ArrayList();
      Registries.field_41178.forEach(var0::add);
      var0.sort(Comparator.comparing(var0x -> Registries.field_41178.method_10221(var0x).toString()));
      return List.copyOf(var0);
   }
}
