package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;

public class Class1 extends Class11 {
   // $VF: renamed from: n int
   private static final int field_1105 = 2;
   // $VF: renamed from: o int
   private static final int field_1106 = 14;
   // $VF: renamed from: p int
   private static final int field_1107 = 14;
   // $VF: renamed from: q int
   private static final int field_1108 = 18;
   // $VF: renamed from: r int
   private static final int field_1109 = 4;
   // $VF: renamed from: s int
   private static final int field_1110 = 4;
   // $VF: renamed from: t java.util.List
   private static final List<Block> field_1111 = method_1775();
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Block> field_1112;
   // $VF: renamed from: v boolean
   private boolean field_1113;
   // $VF: renamed from: w boolean
   private boolean field_1114;
   // $VF: renamed from: x java.lang.String
   private String field_1115 = "";
   // $VF: renamed from: y int
   private int field_1116;
   // $VF: renamed from: z net.minecraft.block.Block
   private Block field_1117;

   public Class1(Dev.ZWare.Client.features.pkg3.Class8<Block> setting) {
      super(setting.method_670());
      this.field_1112 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.field_1117 = null;
      int var5 = Math.round(this.c());
      int var6 = Math.round(this.d());
      this.a(context, this.c(this.method_1761(mouseX, mouseY)));
      int var7 = var5 - 15;
      int var8 = Math.round(this.h + (this.d() - 16.0F) / 2.0F);
      context.method_51427(new ItemStack(this.field_1112.method_671().method_8389()), var7, var8);
      String var9 = this.a(this.field_1112.method_670() + " " + Formatting.field_1080 + this.method_1771(), Math.max(16, this.a() - 22));
      this.a(var9, -1);
      if (this.field_1113) {
         int var10 = this.method_1770();
         int var11 = Math.round(this.h + this.d() + 1.0F);
         int var12 = this.method_1769();
         int var13 = var10 + var12;
         int var15 = var11 + 14;
         context.method_25294(var10, var11, var13, var15, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, var11, var13, var15, 1426063360, 1.0F);
         String var16 = this.field_1115.isEmpty() && !this.field_1114 ? "*" : this.field_1115 + (this.field_1114 ? Class6.method_1819() : "");
         String var17 = "Search " + Formatting.field_1080 + var16;
         var17 = this.a(var17, Math.max(16, var12 - 6));
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var17, var10 + 3, var11 + 3, -1);
         List var18 = this.method_1767();
         int var19 = this.method_1768();
         int var20 = var19 * 4;
         int var21 = Math.max(1, (int)Math.ceil((double)var18.size() / Math.max(1, var20)));
         this.field_1116 = Math.max(0, Math.min(this.field_1116, var21 - 1));
         int var22 = var15 + 2;
         int var23 = var22 + 72;
         context.method_25294(var10, var22, var13, var23, 1711276032);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, var22, var13, var23, 1426063360, 1.0F);
         int var24 = this.field_1116 * var20;
         int var25 = Math.min(var18.size(), var24 + var20);

         for (int var26 = var24; var26 < var25; var26++) {
            int var27 = var26 - var24;
            int var28 = var27 % var19;
            int var29 = var27 / var19;
            int var30 = var10 + 2 + var28 * 18;
            int var31 = var22 + 2 + var29 * 18;
            int var32 = var30 + 18 - 2;
            int var33 = var31 + 18 - 2;
            Block var34 = (Block)var18.get(var26);
            boolean var35 = var34 == this.field_1112.method_671();
            boolean var36 = this.method_1774(mouseX, mouseY, var30, var31, var32, var33);
            int var37 = var35 ? -2008774401 : (var36 ? 1144206131 : 571543825);
            context.method_25294(var30, var31, var32, var33, var37);
            if (var35 || var36) {
               Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var30, var31, var32, var33, var35 ? -7820545 : -1722460843, 1.0F);
            }

            context.method_51427(new ItemStack(var34.method_8389()), var30 + 1, var31 + 1);
            if (var36) {
               this.field_1117 = var34;
            }
         }

         int var39 = var23 + 2;
         int var40 = var39 + 14;
         context.method_25294(var10, var39, var13, var40, 1996488704);
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(context.method_51448(), var10, var39, var13, var40, 1426063360, 1.0F);
         int var41 = var12 / 2;
         int var42 = var10 + 1;
         int var43 = var10 + var41 - 1;
         int var44 = var10 + var41 + 1;
         int var45 = var13 - 1;
         boolean var46 = this.method_1774(mouseX, mouseY, var42, var39 + 1, var43, var40 - 1);
         boolean var47 = this.method_1774(mouseX, mouseY, var44, var39 + 1, var45, var40 - 1);
         context.method_25294(var42, var39 + 1, var43, var40 - 1, var46 ? 860111940 : 571543825);
         context.method_25294(var44, var39 + 1, var45, var40 - 1, var47 ? 860111940 : 571543825);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, "<", var42 + 5, var39 + 3, -1);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, ">", var45 - 8, var39 + 3, -1);
         String var48 = this.field_1116 + 1 + "/" + var21;
         int var49 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var48);
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(context, var48, var10 + (var12 - var49) / 2, var39 + 3, -1);
         if (this.field_1117 != null) {
            context.method_51434(
               c.field_1772,
               List.of(this.field_1117.method_9518(), Text.method_43470(this.method_1772(this.field_1117)).method_27692(Formatting.field_1080)),
               mouseX,
               mouseY
            );
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      if (this.method_1761(mouseX, mouseY)) {
         if (mouseButton == 0) {
            if (!this.field_1113 && !this.method_1764() && !this.method_1765()) {
               this.method_1762();
            } else if (!this.field_1113) {
               this.field_1114 = false;
            }

            this.f();
            return;
         }

         if (mouseButton == 1) {
            if (this.field_1113) {
               this.method_1763();
            } else {
               this.method_1762();
            }

            this.f();
            return;
         }
      }

      if (this.field_1113) {
         int var4 = this.method_1770();
         int var5 = Math.round(this.h + this.d() + 1.0F);
         int var6 = this.method_1769();
         int var8 = var5 + 14;
         int var9 = var8 + 2;
         int var10 = var9 + 72;
         int var11 = var10 + 2;
         int var12 = var11 + 14;
         if (mouseButton == 0 && this.method_1774(mouseX, mouseY, var4, var5, var4 + var6, var8)) {
            this.field_1114 = true;
            this.f();
         } else {
            List var13 = this.method_1767();
            int var14 = this.method_1768();
            int var15 = var14 * 4;
            int var16 = Math.max(1, (int)Math.ceil((double)var13.size() / Math.max(1, var15)));
            this.field_1116 = Math.max(0, Math.min(this.field_1116, var16 - 1));
            int var17 = this.field_1116 * var15;
            int var18 = Math.min(var13.size(), var17 + var15);

            for (int var19 = var17; var19 < var18; var19++) {
               int var20 = var19 - var17;
               int var21 = var20 % var14;
               int var22 = var20 / var14;
               int var23 = var4 + 2 + var21 * 18;
               int var24 = var9 + 2 + var22 * 18;
               int var25 = var23 + 18 - 2;
               int var26 = var24 + 18 - 2;
               if (mouseButton == 0 && this.method_1774(mouseX, mouseY, var23, var24, var25, var26)) {
                  this.field_1112.method_672((Block)var13.get(var19));
                  this.method_1763();
                  this.f();
                  return;
               }
            }

            int var27 = var6 / 2;
            int var28 = var4 + 1;
            int var29 = var4 + var27 - 1;
            int var30 = var4 + var27 + 1;
            int var31 = var4 + var6 - 1;
            if (mouseButton == 0 && this.method_1774(mouseX, mouseY, var28, var11 + 1, var29, var12 - 1)) {
               this.field_1116 = Math.max(0, this.field_1116 - 1);
               this.f();
            } else if (mouseButton == 0 && this.method_1774(mouseX, mouseY, var30, var11 + 1, var31, var12 - 1)) {
               this.field_1116 = Math.min(var16 - 1, this.field_1116 + 1);
               this.f();
            }
         }
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1113 && this.field_1114 && this.method_1773(typedChar)) {
         this.field_1115 = this.field_1115 + Character.toLowerCase(typedChar);
         this.field_1116 = 0;
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1113) {
         switch (key) {
            case 256:
               if (!this.field_1115.isEmpty()) {
                  this.field_1115 = "";
                  this.field_1116 = 0;
                  return;
               }

               this.method_1763();
               return;
            case 257:
            case 335:
               this.method_1766();
               return;
            case 259:
               if (this.field_1114 && !this.field_1115.isEmpty()) {
                  this.field_1115 = this.field_1115.substring(0, this.field_1115.length() - 1);
                  this.field_1116 = 0;
                  return;
               }

               return;
            case 262:
               this.field_1116++;
               return;
            case 263:
               this.field_1116 = Math.max(0, this.field_1116 - 1);
               return;
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1112.method_710());
   }

   // $VF: renamed from: b () int
   @Override
   public int method_1711() {
      return !this.field_1113 ? this.d() : this.d() + 1 + 14 + 2 + 72 + 2 + 14 + 2;
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.field_1112.method_670() + " " + Formatting.field_1080 + this.method_1771()) + 20;
   }

   // $VF: renamed from: a (int, int) boolean
   @Override
   public boolean method_1717(int mouseX, int mouseY) {
      for (Dev.ZWare.Client.features.gui.Class1 var4 : OyVeyGui.getClickGui().getComponents()) {
         if (var4.field_1064) {
            return false;
         }
      }

      if (this.method_1761(mouseX, mouseY)) {
         return true;
      } else if (!this.field_1113) {
         return false;
      } else {
         int var7 = this.method_1770();
         int var8 = Math.round(this.h + this.d() + 1.0F);
         int var5 = var7 + this.method_1769();
         int var6 = var8 + 14 + 2 + 72 + 2 + 14 + 2;
         return this.method_1774(mouseX, mouseY, var7, var8, var5, var6);
      }
   }

   // $VF: renamed from: b () boolean
   @Override
   public boolean method_1719() {
      return this.field_1113;
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean method_1761(int var1, int var2) {
      return this.a(var1, var2, this.a(), this.b(), this.a() + this.a(), this.b() + this.d());
   }

   // $VF: renamed from: g () void
   private void method_1762() {
      this.field_1113 = true;
      this.field_1114 = false;
      this.field_1116 = 0;
   }

   // $VF: renamed from: h () void
   private void method_1763() {
      this.field_1113 = false;
      this.field_1114 = false;
      this.field_1116 = 0;
      this.field_1117 = null;
   }

   // $VF: renamed from: d () boolean
   private boolean method_1764() {
      if (c.field_1724 == null) {
         return false;
      } else if (c.field_1724.method_6047().method_7909() instanceof BlockItem var3) {
         this.field_1112.method_672(var3.method_7711());
         return true;
      } else if (c.field_1724.method_6079().method_7909() instanceof BlockItem var1) {
         this.field_1112.method_672(var1.method_7711());
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: e () boolean
   private boolean method_1765() {
      if (c.field_1687 != null && c.field_1765 instanceof BlockHitResult var1) {
         Block var3 = c.field_1687.method_8320(var1.method_17777()).method_26204();
         if (var3 != null && var3 != Blocks.field_10124 && var3.method_8389() != Items.field_8162) {
            this.field_1112.method_672(var3);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: i () void
   private void method_1766() {
      List var1 = this.method_1767();
      if (!var1.isEmpty()) {
         if (!this.field_1115.isEmpty()) {
            Identifier var2 = Identifier.method_12829(this.field_1115);
            if (var2 != null && Registries.field_41175.method_10250(var2)) {
               this.field_1112.method_672((Block)Registries.field_41175.method_63535(var2));
               this.method_1763();
               return;
            }
         }

         this.field_1112.method_672((Block)var1.get(0));
         this.method_1763();
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<Block> method_1767() {
      if (this.field_1115.isEmpty()) {
         return field_1111;
      } else {
         String var1 = this.field_1115.toLowerCase(Locale.ROOT);
         ArrayList var2 = new ArrayList();

         for (Block var4 : field_1111) {
            String var5 = this.method_1772(var4).toLowerCase(Locale.ROOT);
            String var6 = var4.method_9518().getString().toLowerCase(Locale.ROOT);
            if (var5.contains(var1) || var6.contains(var1)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: j () int
   private int method_1768() {
      int var1 = this.method_1769();
      return Math.max(4, (var1 - 4) / 18);
   }

   // $VF: renamed from: k () int
   private int method_1769() {
      return Math.max(this.a(), 76);
   }

   // $VF: renamed from: l () int
   private int method_1770() {
      return Math.round(this.g + ((float)this.a() - this.method_1769()) / 2.0F);
   }

   // $VF: renamed from: b () java.lang.String
   private String method_1771() {
      return this.method_1772(this.field_1112.method_671());
   }

   // $VF: renamed from: a (net.minecraft.block.Block) java.lang.String
   private String method_1772(Block var1) {
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
   private boolean method_1773(char var1) {
      return Character.isLetterOrDigit(var1) || var1 == '_' || var1 == ':' || var1 == '/' || var1 == '.';
   }

   // $VF: renamed from: a (int, int, int, int, int, int) boolean
   private boolean method_1774(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var5 && var2 >= var4 && var2 <= var6;
   }

   // $VF: renamed from: c () java.util.List
   private static List<Block> method_1775() {
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
