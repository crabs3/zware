package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class16 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F float
   private static final float field_3065 = 16.0F;
   // $VF: renamed from: G float
   private static final float field_3066 = 4.0F;
   // $VF: renamed from: H float
   private static final float field_3067 = 5.0F;
   // $VF: renamed from: I float
   private static final float field_3068 = 0.9F;
   // $VF: renamed from: J java.util.List
   private static final List<Class16.Inner4> field_3069 = List.of(
      new Class16.Inner4("totem_of_undying", "Totems", Items.field_8288, 3),
      new Class16.Inner4("end_crystal", "Crystals", Items.field_8301, 12),
      new Class16.Inner4("ender_pearl", "Pearls", Items.field_8634, 16),
      new Class16.Inner4("obsidian", "Obsidian", Items.field_8281, 64)
   );
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class6
   private final Dev.ZWare.Client.features.pkg3.Class6 field_3070 = (Dev.ZWare.Client.features.pkg3.Class6)this.a(
      new Dev.ZWare.Client.features.pkg3.Class6(
         "Items",
         field_3069.stream().map(var0 -> new Dev.ZWare.Client.features.pkg3.Class6.Inner1(var0.method_1454(), var0.method_1455())).toList(),
         field_3069.stream().<String>map(Class16.Inner4::bt).toList()
      )
   );
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class16.Inner3> field_3071 = this.a("Style", Class16.Inner3.List);
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_3072 = this.a("Spacing", 3.0F, 0.0F, 12.0F);

   public Class16() {
      super("Counts", "Shows the counts of selected blocks/items.", 18.0F, 80.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      super.method_3643(e);
      List var2 = this.method_3779();
      Class16.Inner2 var3 = this.method_3777(var2);
      this.a(var3.method_1462(), var3.method_1463());
      if (!var2.isEmpty()) {
         this.method_3778(e, var2);
      }
   }

   // $VF: renamed from: a (java.util.List) Dev.ZWare.Client.features.pkg1.pkg7.Class16$Inner2
   private Class16.Inner2 method_3777(List<Class16.Inner1> var1) {
      float var2 = this.field_3072.method_671();
      if (var1.isEmpty()) {
         return new Class16.Inner2(16.0F, 16.0F);
      } else {
         return switch ((Class16.Inner3)this.field_3071.method_671()) {
            case List -> {
               float var10 = Math.max(16.0F, (float)Dev.ZWare.Client.pkg1.pkg2.Class1.method_134());
               float var12 = 16.0F;

               for (Class16.Inner1 var18 : var1) {
                  var12 = Math.max(var12, 21.0F + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var18.method_1322()));
               }

               float var16 = var1.size() * var10 + Math.max(0.0F, (float)(var1.size() - 1)) * var2;
               yield new Class16.Inner2(var12, var16);
            }
            case Labels -> {
               float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
               float var11 = 0.0F;

               for (Class16.Inner1 var17 : var1) {
                  float var19 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var17.method_1323().method_1455())
                     + 4.0F
                     + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var17.method_1322());
                  var11 = Math.max(var11, var19);
               }

               float var14 = var1.size() * var9 + Math.max(0.0F, (float)(var1.size() - 1)) * var2;
               yield new Class16.Inner2(var11, var14);
            }
            case Horizontal -> {
               float var3 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(0.9F);
               float var4 = 16.0F + var2 + var3;
               float var5 = 0.0F;

               for (int var6 = 0; var6 < var1.size(); var6++) {
                  Class16.Inner1 var7 = (Class16.Inner1)var1.get(var6);
                  float var8 = Math.max(16.0F, (float)Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var7.method_1322(), 0.9F));
                  var5 += var8;
                  if (var6 > 0) {
                     var5 += var2;
                  }
               }

               yield new Class16.Inner2(var5, var4);
            }
         };
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.util.List) void
   private void method_3778(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, List<Class16.Inner1> var2) {
      float var3 = this.e();
      float var4 = this.f();
      float var5 = this.field_3072.method_671();
      switch ((Class16.Inner3)this.field_3071.method_671()) {
         case List:
            float var16 = Math.max(16.0F, (float)Dev.ZWare.Client.pkg1.pkg2.Class1.method_134());
            float var18 = 0.0F;

            for (Class16.Inner1 var22 : var2) {
               float var24 = var4 + var18;
               int var26 = Math.round(var3);
               int var27 = Math.round(var24 + (var16 - 16.0F) / 2.0F);
               var1.method_1053().method_51427(var22.method_1323().method_1456().method_7854(), var26, var27);
               float var28 = var3 + 16.0F + 5.0F;
               float var14 = var24 + (var16 - Dev.ZWare.Client.pkg1.pkg2.Class1.method_134()) / 2.0F;
               this.a(var1.method_1053(), var22.method_1323().method_1454(), var22.method_1322(), var28, var14, -1);
               var18 += var16 + var5;
            }
            break;
         case Labels:
            float var15 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
            float var17 = 0.0F;

            for (Class16.Inner1 var21 : var2) {
               float var23 = var4 + var17;
               this.b(var1.method_1053(), var21.method_1323().method_1455(), var3, var23, -2565928);
               float var25 = var3 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var21.method_1323().method_1455()) + 4.0F;
               this.a(var1.method_1053(), var21.method_1323().method_1454(), var21.method_1322(), var25, var23, -1);
               var17 += var15 + var5;
            }
            break;
         case Horizontal:
            float var6 = var3;

            for (Class16.Inner1 var8 : var2) {
               float var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var8.method_1322(), 0.9F);
               float var10 = Math.max(16.0F, var9);
               float var11 = var6 + (var10 - 16.0F) / 2.0F;
               var1.method_1053().method_51427(var8.method_1323().method_1456().method_7854(), Math.round(var11), Math.round(var4));
               float var12 = var6 + (var10 - var9) / 2.0F;
               float var13 = var4 + 16.0F + var5;
               this.a(var1.method_1053(), var8.method_1323().method_1454(), var8.method_1322(), var12, var13, -1, 0.9F);
               var6 += var10 + var5;
            }
      }
   }

   // $VF: renamed from: b () java.util.List
   private List<Class16.Inner1> method_3779() {
      ArrayList var1 = new ArrayList();
      boolean var2 = this.n() && g();

      for (Class16.Inner4 var4 : field_3069) {
         if (this.field_3070.method_722(var4.method_1454())) {
            int var5 = var2 ? var4.method_1457() : this.method_3780(var4.method_1456());
            var1.add(new Class16.Inner1(var4, var5));
         }
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.item.Item) int
   private int method_3780(Item var1) {
      int var2 = 0;

      for (int var3 = 0; var3 <= 35; var3++) {
         ItemStack var4 = c.field_1724.method_31548().method_5438(var3);
         if (var4.method_31574(var1)) {
            var2 += var4.method_7947();
         }
      }

      if (c.field_1724.method_6079().method_31574(var1)) {
         var2 += c.field_1724.method_6079().method_7947();
      }

      return var2;
   }

   private record Inner1(Class16.Inner4 bx, int by) {
      // $VF: renamed from: bx Dev.ZWare.Client.features.pkg1.pkg7.Class16$Inner4
      private final Class16.Inner4 field_806;
      // $VF: renamed from: by int
      private final int field_807;

      private Inner1(Class16.Inner4 bx, int by) {
         this.field_806 = bx;
         this.field_807 = by;
      }

      // $VF: renamed from: a () java.lang.String
      private String method_1322() {
         return Integer.toString(this.field_807);
      }

      // $VF: renamed from: bx () Dev.ZWare.Client.features.pkg1.pkg7.Class16$Inner4
      public Class16.Inner4 method_1323() {
         return this.field_806;
      }

      // $VF: renamed from: by () int
      public int method_1324() {
         return this.field_807;
      }
   }

   private record Inner2(float bz, float bA) {
      // $VF: renamed from: bz float
      private final float field_932;
      // $VF: renamed from: bA float
      private final float field_933;

      private Inner2(float bz, float bA) {
         this.field_932 = bz;
         this.field_933 = bA;
      }

      // $VF: renamed from: bz () float
      public float method_1462() {
         return this.field_932;
      }

      // $VF: renamed from: bA () float
      public float method_1463() {
         return this.field_933;
      }
   }

   private static enum Inner3 {
      List,
      Labels,
      Horizontal;
   }

   private record Inner4(String bt, String bu, Item bv, int bw) {
      // $VF: renamed from: bt java.lang.String
      private final String field_924;
      // $VF: renamed from: bu java.lang.String
      private final String field_925;
      // $VF: renamed from: bv net.minecraft.item.Item
      private final Item field_926;
      // $VF: renamed from: bw int
      private final int field_927;

      private Inner4(String bt, String bu, Item bv, int bw) {
         this.field_924 = bt;
         this.field_925 = bu;
         this.field_926 = bv;
         this.field_927 = bw;
      }

      // $VF: renamed from: bt () java.lang.String
      public String method_1454() {
         return this.field_924;
      }

      // $VF: renamed from: bu () java.lang.String
      public String method_1455() {
         return this.field_925;
      }

      // $VF: renamed from: bv () net.minecraft.item.Item
      public Item method_1456() {
         return this.field_926;
      }

      // $VF: renamed from: bw () int
      public int method_1457() {
         return this.field_927;
      }
   }
}
