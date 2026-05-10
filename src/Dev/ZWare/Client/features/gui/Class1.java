package Dev.ZWare.Client.features.gui;

import Dev.ZWare.Client.features.gui.pkg1.pkg1.Class11;
import Dev.ZWare.Client.features.gui.pkg1.pkg1.Class9;
import Dev.ZWare.Client.features.pkg1.pkg4.Class4;
import Dev.ZWare.Client.features.pkg1.pkg4.Class8;
import Dev.ZWare.Client.pkg1.Class6;
import Dev.ZWare.Client.pkg1.pkg2.Class2;
import Dev.ZWare.Client.pkg1.pkg2.Class5;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvents;

public class Class1 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f int
   public static final int field_1059 = 88;
   // $VF: renamed from: g int
   public static final int field_1060 = 2;
   // $VF: renamed from: h int[]
   public static int[] field_1061 = new int[]{1};
   // $VF: renamed from: i net.minecraft.client.gui.DrawContext
   protected DrawContext field_1062;
   // $VF: renamed from: j java.util.List
   private final List<Dev.ZWare.Client.features.gui.pkg1.Class1> field_1063 = new ArrayList<>();
   // $VF: renamed from: k boolean
   public boolean field_1064;
   // $VF: renamed from: l int
   private int field_1065;
   // $VF: renamed from: m int
   private int field_1066;
   // $VF: renamed from: n int
   private int field_1067;
   // $VF: renamed from: o int
   private int field_1068;
   // $VF: renamed from: p int
   private int field_1069;
   // $VF: renamed from: q int
   private int field_1070;
   // $VF: renamed from: r int
   private int field_1071;
   // $VF: renamed from: s int
   private int field_1072;
   // $VF: renamed from: t boolean
   private boolean field_1073;
   // $VF: renamed from: u boolean
   private boolean field_1074 = false;
   // $VF: renamed from: v float
   private float field_1075 = Float.NaN;
   // $VF: renamed from: w long
   private long field_1076 = System.nanoTime();

   public Class1(String name, int x, int y, boolean open) {
      super(name);
      this.field_1065 = x;
      this.field_1066 = y;
      this.field_1071 = x;
      this.field_1072 = y;
      this.field_1069 = method_1677();
      this.field_1070 = this.method_1686();
      this.field_1073 = open;
      this.method_1665();
   }

   // $VF: renamed from: c () void
   public void method_1665() {
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   public void method_1666(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.method_1668(context, mouseX, mouseY, partialTicks, this.field_1065, this.field_1066);
   }

   // $VF: renamed from: a (int, int) void
   private void method_1667(int var1, int var2) {
      if (this.field_1064) {
         this.field_1065 = this.field_1067 + var1;
         this.field_1066 = this.field_1068 + var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float, int, int) void
   public void method_1668(DrawContext context, int mouseX, int mouseY, float partialTicks, int renderX, int renderY) {
      this.field_1062 = context;
      this.method_1667(mouseX, mouseY);
      this.field_1070 = this.method_1686();
      this.field_1071 = this.field_1064 ? this.field_1065 : renderX;
      this.field_1072 = this.field_1064 ? this.field_1066 : renderY;
      Class8 var7 = Class8.method_1995();
      field_1061 = new int[]{1};
      float var8 = Class11.method_1740();
      float var9 = this.method_1687();
      float var10 = this.field_1073 ? Math.max(0.0F, this.method_1693() - var8) : 0.0F;
      Color var11 = var7.field_1341.method_671();
      Color var12 = var7.field_1342.method_671();
      float var13 = var7.field_1345.method_671();
      int var14 = new Color(var12.getRed(), var12.getGreen(), var12.getBlue(), 255).getRGB();
      if (var7.field_1365.method_671()) {
         var11 = Dev.ZWare.Client.pkg1.Class8.method_666(var7.field_1366.method_671());
      }

      int var15 = new Color(var11.getRed(), var11.getGreen(), var11.getBlue(), 255).getRGB();
      float var16 = this.field_1071;
      float var17 = this.field_1072;
      float var18 = this.field_1071 + this.field_1069;
      float var19 = this.field_1072 + this.field_1070;
      float var20 = var19 + var9;
      float var21 = this.field_1073 && var10 > 0.0F ? var20 + var10 + var9 : var19;
      Class2.method_773(context.method_51448(), var16, var17, var18, var19, var15);
      if (this.field_1073 && var10 > 0.0F) {
         Class2.method_773(context.method_51448(), var16, var19, var18, var21, 1996488704);
      }

      float var22 = this.field_1072 + Math.max(0.0F, (this.field_1070 - Dev.ZWare.Client.pkg1.pkg2.Class1.method_134()) / 2.0F) + var7.field_1347.method_671();
      this.method_1698(Class6.method_202(this.a()), this.field_1071 + 3.0F, var22, -1);
      if (var7.field_1338 != null && var7.field_1338.method_671()) {
         String var23 = "[" + this.method_1691().size() + "]";
         float var24 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var23);
         this.method_1698(var23, (float)this.field_1071 + this.field_1069 - var24 - 3.0F, var22, -1);
      }

      Class5.method_621(context, this.field_1071, 0, this.field_1071 + this.field_1069, c.method_22683().method_4502());
      float var31 = var19;
      if (this.field_1073) {
         float var32 = var20;
         boolean var25 = var7.field_1339.method_671();

         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var27 : this.method_1691()) {
            field_1061[0]++;
            if (!var27.method_1713()) {
               int var28 = this.method_1682() - 4;
               if (var27 instanceof Class9) {
                  int var29 = var25 ? var28 : Math.min(var28, Class11.method_1738());
                  float var30 = (var28 - var29) / 2.0F;
                  var27.method_1700(this.field_1071 + 2.0F + var30, var32);
                  var27.method_1710(var29);
               } else {
                  var27.method_1700(this.field_1071 + 2.0F, var32);
                  var27.method_1710(var28);
               }

               boolean var33 = var27.method_1719() || var27.method_1717(mouseX, mouseY);
               if (var33) {
                  Class5.method_622(context);
               }

               var27.method_1701(context, mouseX, mouseY, partialTicks);
               if (var33) {
                  Class5.method_623(context);
               }

               var32 += var27.method_1711() + var8;
            }
         }

         var31 = var32 - var8 + var9;
      }

      Class5.method_622(context);
      if (this.field_1073 && var31 > var19) {
         var21 = var31;
      }

      Class2.method_767(context.method_51448(), var16, var17, var18 - var13, var21 - var13, var14, var13);
   }

   // $VF: renamed from: a (int, int, int) void
   public void method_1669(int mouseX, int mouseY, int mouseButton) {
      if (mouseButton == 0 && this.method_1692(mouseX, mouseY)) {
         this.field_1067 = this.field_1065 - mouseX;
         this.field_1068 = this.field_1066 - mouseY;
         OyVeyGui.getClickGui().getComponents().forEach(var0 -> {
            if (var0.field_1064) {
               var0.field_1064 = false;
            }
         });
         this.field_1064 = true;
      } else if (mouseButton == 1 && this.method_1692(mouseX, mouseY)) {
         this.field_1073 = !this.field_1073;
         this.method_1699();
      } else if (this.field_1073) {
         this.method_1691().forEach(var3 -> var3.method_1702(mouseX, mouseY, mouseButton));
      }
   }

   // $VF: renamed from: b (int, int, int) void
   public void method_1670(int mouseX, int mouseY, int releaseButton) {
      if (releaseButton == 0) {
         this.field_1064 = false;
      }

      if (this.field_1073) {
         this.method_1691().forEach(var3 -> var3.method_1703(mouseX, mouseY, releaseButton));
      }
   }

   // $VF: renamed from: a (char, int) void
   public void method_1671(char typedChar, int keyCode) {
      if (this.field_1073) {
         this.method_1691().forEach(var2 -> var2.method_1705(typedChar, keyCode));
      }
   }

   // $VF: renamed from: a (int) void
   public void method_1672(int key) {
      if (this.field_1073) {
         this.method_1691().forEach(var1 -> var1.method_1706(key));
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.gui.pkg1.pkg1.Class11) void
   public void method_1673(Class11 button) {
      this.field_1063.add(button);
   }

   // $VF: renamed from: b (int, int) void
   public void method_1674(int targetX, int targetWidth) {
      long var3 = System.nanoTime();
      if (this.field_1064) {
         this.field_1076 = var3;
      } else {
         float var5 = this.method_1695(var3, this.method_1696());
         this.field_1065 = this.method_1694(this.field_1065, targetX, var5);
         this.field_1069 = this.method_1694(this.field_1069, targetWidth, var5);
         this.field_1076 = var3;
      }
   }

   // $VF: renamed from: a () int
   public int method_1675() {
      int var1 = method_1677();
      var1 = Math.max(var1, Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.a()) + 10);
      if (!this.field_1073) {
         return var1;
      } else {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var3 : this.method_1691()) {
            if (!var3.method_1713()) {
               var1 = Math.max(var1, var3.method_1718() + 4);
            }
         }

         return var1;
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_1676() {
      return this.field_1064;
   }

   // $VF: renamed from: b () int
   public static int method_1677() {
      Class8 var0 = Class8.method_1995();
      return var0 != null && var0.field_1349 != null
         ? Math.max(var0.field_1349.method_671(), Class11.method_1738() + 4)
         : Math.max(88, Class11.method_1738() + 4);
   }

   // $VF: renamed from: c () int
   public int method_1678() {
      return this.field_1065;
   }

   // $VF: renamed from: b (int) void
   public void method_1679(int x) {
      this.field_1065 = x;
   }

   // $VF: renamed from: d () int
   public int method_1680() {
      return this.field_1066;
   }

   // $VF: renamed from: c (int) void
   public void method_1681(int y) {
      this.field_1066 = y;
   }

   // $VF: renamed from: e () int
   public int method_1682() {
      return this.field_1069;
   }

   // $VF: renamed from: d (int) void
   public void method_1683(int width) {
      this.field_1069 = width;
   }

   // $VF: renamed from: f () int
   public int method_1684() {
      return this.field_1070;
   }

   // $VF: renamed from: e (int) void
   public void method_1685(int height) {
      this.field_1070 = height;
   }

   // $VF: renamed from: g () int
   private int method_1686() {
      Class8 var1 = Class8.method_1995();
      return var1 != null && var1.field_1346 != null ? var1.field_1346.method_671() : Math.max(13, Class11.method_1739() + 1);
   }

   // $VF: renamed from: a () float
   private float method_1687() {
      Class8 var1 = Class8.method_1995();
      return var1 != null && var1.field_1348 != null ? var1.field_1348.method_671() : 0.0F;
   }

   // $VF: renamed from: b () boolean
   public boolean method_1688() {
      return this.field_1074;
   }

   // $VF: renamed from: a (boolean) void
   public void method_1689(boolean hidden) {
      this.field_1074 = hidden;
   }

   // $VF: renamed from: c () boolean
   public boolean method_1690() {
      return this.field_1073;
   }

   // $VF: renamed from: b () java.util.List
   public final List<Dev.ZWare.Client.features.gui.pkg1.Class1> method_1691() {
      return this.field_1063;
   }

   // $VF: renamed from: a (int, int) boolean
   public boolean method_1692(int mouseX, int mouseY) {
      return mouseX >= this.field_1071
         && mouseX <= this.field_1071 + this.method_1682()
         && mouseY >= this.field_1072
         && mouseY <= this.field_1072 + this.method_1684() - (this.field_1073 ? 2 : 0);
   }

   // $VF: renamed from: b () float
   private float method_1693() {
      float var1 = 0.0F;

      for (Dev.ZWare.Client.features.gui.pkg1.Class1 var3 : this.method_1691()) {
         if (!var3.method_1713()) {
            var1 += var3.method_1711() + Class11.method_1740();
         }
      }

      return var1;
   }

   // $VF: renamed from: a (int, int, float) int
   private int method_1694(int var1, int var2, float var3) {
      if (var1 == var2) {
         return var2;
      } else {
         int var4 = Math.max(1, Math.round(Math.abs(var2 - var1) * var3));
         return var1 < var2 ? Math.min(var2, var1 + var4) : Math.max(var2, var1 - var4);
      }
   }

   // $VF: renamed from: a (long, float) float
   private float method_1695(long var1, float var3) {
      if (var3 >= 1.0F) {
         return 1.0F;
      } else {
         float var4 = Math.max(0.0F, (float)(var1 - this.field_1076) / 1.0E9F);
         float var5 = Math.max(1.0F, var4 * 60.0F);
         float var6 = Math.max(0.05F, Math.min(0.99F, var3));
         return 1.0F - (float)Math.pow(1.0F - var6, var5);
      }
   }

   // $VF: renamed from: c () float
   private float method_1696() {
      Class8 var1 = Class8.method_1995();
      return var1 != null && var1.field_1353 != null ? var1.field_1353.method_671() : 0.35F;
   }

   // $VF: renamed from: a (java.lang.String, double, double, java.awt.Color) void
   protected void method_1697(String text, double x, double y, Color color) {
      this.method_1698(text, x, y, color.hashCode());
   }

   // $VF: renamed from: a (java.lang.String, double, double, int) void
   protected void method_1698(String text, double x, double y, int color) {
      Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(this.field_1062, text, (float)x, (float)y, color);
   }

   // $VF: renamed from: d () void
   public void method_1699() {
      Class4 var1 = Class4.method_1935();
      if (var1 != null && var1.d() && var1.field_1267.method_671() != Class4.Inner1.None) {
         var1.method_1939();
      } else {
         c.method_1483().method_4873(PositionedSoundInstance.method_47978(SoundEvents.field_15015, 1.0F));
      }
   }
}
