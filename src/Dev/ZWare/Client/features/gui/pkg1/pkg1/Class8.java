package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class Class8 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1190 = 2;
   // $VF: renamed from: o int
   private static final int field_1191 = 14;
   // $VF: renamed from: p int
   private static final int field_1192 = 14;
   // $VF: renamed from: q int
   private static final int field_1193 = 18;
   // $VF: renamed from: r int
   private static final int field_1194 = 4;
   // $VF: renamed from: s int
   private static final int field_1195 = 4;
   // $VF: renamed from: t java.util.List
   private static final List<Block> field_1196 = method_1859();
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class7
   private final Dev.ZWare.Client.features.pkg3.Class7 field_1197;
   // $VF: renamed from: v boolean
   private boolean field_1198;
   // $VF: renamed from: w boolean
   private boolean field_1199;
   // $VF: renamed from: x java.lang.String
   private String field_1200 = "";
   // $VF: renamed from: y int
   private int field_1201;
   // $VF: renamed from: z net.minecraft.block.Block
   private Block field_1202;

   public Class8(Dev.ZWare.Client.features.pkg3.Class7 setting) {
      super(setting.a());
      this.field_1197 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.field_1202 = null;
      int var5 = Math.round(this.c());
      int var6 = Math.round(this.d());
      this.a(context, this.c(this.method_1848(mouseX, mouseY)));
      String var7 = this.a(this.field_1197.a() + " " + Formatting.field_1080 + this.method_1855(), Math.max(16, this.a() - 6));
      this.a(var7, -1);
      if (this.field_1198) {
         int var8 = this.method_1854();
         int var9 = Math.round(this.h + this.d() + 1.0F);
         int var10 = this.method_1853();
         int var11 = var8 + var10;
         int var13 = var9 + 14;
         context.method_25294(var8, var9, var11, var13, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var8, var9, var11, var13, 1426063360, 1.0F);
         String var14 = this.field_1200.isEmpty() && !this.field_1199 ? "*" : this.field_1200 + (this.field_1199 ? Class6.method_1819() : "");
         String var15 = "Search " + Formatting.field_1080 + var14;
         var15 = this.a(var15, Math.max(16, var10 - 6));
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var15, var8 + 3, var9 + 3, -1);
         List var16 = this.method_1851();
         int var17 = this.method_1852();
         int var18 = var17 * 4;
         int var19 = Math.max(1, (int)Math.ceil((double)var16.size() / Math.max(1, var18)));
         this.field_1201 = Math.max(0, Math.min(this.field_1201, var19 - 1));
         int var20 = var13 + 2;
         int var21 = var20 + 72;
         context.method_25294(var8, var20, var11, var21, 1711276032);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var8, var20, var11, var21, 1426063360, 1.0F);
         int var22 = this.field_1201 * var18;
         int var23 = Math.min(var16.size(), var22 + var18);

         for (int var24 = var22; var24 < var23; var24++) {
            int var25 = var24 - var22;
            int var26 = var25 % var17;
            int var27 = var25 / var17;
            int var28 = var8 + 2 + var26 * 18;
            int var29 = var20 + 2 + var27 * 18;
            int var30 = var28 + 18 - 2;
            int var31 = var29 + 18 - 2;
            Block var32 = (Block)var16.get(var24);
            boolean var33 = this.field_1197.method_730(var32);
            boolean var34 = this.method_1858(mouseX, mouseY, var28, var29, var30, var31);
            int var35 = var33 ? -2008774401 : (var34 ? 1144206131 : 571543825);
            context.method_25294(var28, var29, var30, var31, var35);
            if (var33 || var34) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var28, var29, var30, var31, var33 ? -7820545 : -1722460843, 1.0F);
            }

            context.method_51427(new ItemStack(var32.method_8389()), var28 + 1, var29 + 1);
            if (var34) {
               this.field_1202 = var32;
            }
         }

         int var37 = var21 + 2;
         int var38 = var37 + 14;
         context.method_25294(var8, var37, var11, var38, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var8, var37, var11, var38, 1426063360, 1.0F);
         int var39 = var10 / 2;
         int var40 = var8 + 1;
         int var41 = var8 + var39 - 1;
         int var42 = var8 + var39 + 1;
         int var43 = var11 - 1;
         boolean var44 = this.method_1858(mouseX, mouseY, var40, var37 + 1, var41, var38 - 1);
         boolean var45 = this.method_1858(mouseX, mouseY, var42, var37 + 1, var43, var38 - 1);
         context.method_25294(var40, var37 + 1, var41, var38 - 1, var44 ? 860111940 : 571543825);
         context.method_25294(var42, var37 + 1, var43, var38 - 1, var45 ? 860111940 : 571543825);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, "<", var40 + 5, var37 + 3, -1);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, ">", var43 - 8, var37 + 3, -1);
         String var46 = this.field_1201 + 1 + "/" + var19;
         int var47 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var46);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var46, var8 + (var10 - var47) / 2, var37 + 3, -1);
         if (this.field_1202 != null) {
            context.method_51434(
               c.field_1772,
               List.of(this.field_1202.method_9518(), Text.method_43470(this.method_1856(this.field_1202)).method_27692(Formatting.field_1080)),
               mouseX,
               mouseY
            );
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (this.method_1848(mouseX, mouseY)) {
         if (mouseButton == 0) {
            if (!this.field_1198) {
               this.method_1849();
            }

            this.f();
            return;
         }

         if (mouseButton == 1) {
            if (this.field_1198) {
               this.method_1850();
            } else {
               this.method_1849();
            }

            this.f();
            return;
         }
      }

      if (this.field_1198) {
         int var4 = this.method_1854();
         int var5 = Math.round(this.h + this.d() + 1.0F);
         int var6 = this.method_1853();
         int var8 = var5 + 14;
         int var9 = var8 + 2;
         int var10 = var9 + 72;
         int var11 = var10 + 2;
         int var12 = var11 + 14;
         if (mouseButton == 0 && this.method_1858(mouseX, mouseY, var4, var5, var4 + var6, var8)) {
            this.field_1199 = true;
            this.f();
         } else {
            List var13 = this.method_1851();
            int var14 = this.method_1852();
            int var15 = var14 * 4;
            int var16 = Math.max(1, (int)Math.ceil((double)var13.size() / Math.max(1, var15)));
            this.field_1201 = Math.max(0, Math.min(this.field_1201, var16 - 1));
            int var17 = this.field_1201 * var15;
            int var18 = Math.min(var13.size(), var17 + var15);

            for (int var19 = var17; var19 < var18; var19++) {
               int var20 = var19 - var17;
               int var21 = var20 % var14;
               int var22 = var20 / var14;
               int var23 = var4 + 2 + var21 * 18;
               int var24 = var9 + 2 + var22 * 18;
               int var25 = var23 + 18 - 2;
               int var26 = var24 + 18 - 2;
               if (mouseButton == 0 && this.method_1858(mouseX, mouseY, var23, var24, var25, var26)) {
                  this.field_1197.method_731((Block)var13.get(var19));
                  this.f();
                  return;
               }
            }

            int var27 = var6 / 2;
            int var28 = var4 + 1;
            int var29 = var4 + var27 - 1;
            int var30 = var4 + var27 + 1;
            int var31 = var4 + var6 - 1;
            if (mouseButton == 0 && this.method_1858(mouseX, mouseY, var28, var11 + 1, var29, var12 - 1)) {
               this.field_1201 = Math.max(0, this.field_1201 - 1);
               this.f();
            } else if (mouseButton == 0 && this.method_1858(mouseX, mouseY, var30, var11 + 1, var31, var12 - 1)) {
               this.field_1201 = Math.min(var16 - 1, this.field_1201 + 1);
               this.f();
            }
         }
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1198 && this.field_1199 && this.method_1857(typedChar)) {
         this.field_1200 = this.field_1200 + Character.toLowerCase(typedChar);
         this.field_1201 = 0;
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1198) {
         switch (key) {
            case 256:
               if (!this.field_1200.isEmpty()) {
                  this.field_1200 = "";
                  this.field_1201 = 0;
                  return;
               }

               this.method_1850();
               return;
            case 257:
            case 258:
            case 260:
            case 261:
            default:
               return;
            case 259:
               if (this.field_1199 && !this.field_1200.isEmpty()) {
                  this.field_1200 = this.field_1200.substring(0, this.field_1200.length() - 1);
                  this.field_1201 = 0;
                  return;
               }

               return;
            case 262:
               this.field_1201++;
               return;
            case 263:
               this.field_1201 = Math.max(0, this.field_1201 - 1);
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1197.n());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1198 ? this.d() : this.d() + 1 + 14 + 2 + 72 + 2 + 14 + 2;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1197.a() + " " + Formatting.field_1080 + this.method_1855()) + 20;
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (this.method_1848(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1198) {
         return false;
      } else {
         int var7 = this.method_1854();
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1853();
         int var6 = var8 + 14 + 2 + 72 + 2 + 14 + 2;
         return this.method_1858(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1198;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1848(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: g () void
   private void method_1849() {
      this.field_1198 = true;
      this.field_1199 = false;
      this.field_1201 = 0;
   }

   // $VF: renamed from: h () void
   private void method_1850() {
      this.field_1198 = false;
      this.field_1199 = false;
      this.field_1201 = 0;
      this.field_1202 = null;
   }

   // $VF: renamed from: b () java.util.List
   private List<Block> method_1851() {
      if (this.field_1200.isEmpty()) {
         return field_1196;
      } else {
         String var1 = this.field_1200.toLowerCase(Locale.ROOT);
         ArrayList var2 = new ArrayList();

         for (Block var4 : field_1196) {
            String var5 = this.method_1856(var4).toLowerCase(Locale.ROOT);
            String var6 = var4.method_9518().getString().toLowerCase(Locale.ROOT);
            if (var5.contains(var1) || var6.contains(var1)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: j () int
   private int method_1852() {
      return Math.max(4, (this.method_1853() - 4) / 18);
   }

   // $VF: renamed from: k () int
   private int method_1853() {
      return Math.max(this.a(), 76);
   }

   // $VF: renamed from: l () int
   private int method_1854() {
      return Math.round(this.g + ((float)this.a() - this.method_1853()) / 2.0F);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1855() {
      int var1 = ((Set)this.field_1197.a()).size();
      if (var1 == 0) {
         return "None";
      } else {
         Block var2 = (Block)((Set)this.field_1197.a()).iterator().next();
         return var1 == 1 ? this.method_1856(var2) : this.method_1856(var2) + " +" + (var1 - 1);
      }
   }

   // $VF: renamed from: a (net.minecraft.block.Block) java.lang.String
   private String method_1856(Block var1) {
      if (var1 == null) {
         return "air";
      } else {
         Identifier var2 = Registries.field_41175.method_10221(var1);
         if (var2 != null) {
            return var2.method_12836().equals("minecraft") ? var2.method_12832() : var2.toString();
         } else {
            return var1.method_9518().getString();
         }
      }
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_1857(char var1) {
      return Character.isLetterOrDigit(var1) || var1 == '_' || var1 == ':' || var1 == '/' || var1 == '.';
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1858(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }

   // $VF: renamed from: c () java.util.List
   private static List<Block> method_1859() {
      ArrayList var0 = new ArrayList();
      Registries.field_41175.forEach(var1 -> {
         if (var1 != Blocks.field_10124 && var1.method_8389() != Items.field_8162) {
            var0.add(var1);
         }
      });
      var0.sort(Comparator.comparing(var0x -> Registries.field_41175.method_10221(var0x).toString()));
      return List.copyOf(var0);
   }
}
