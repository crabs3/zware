package Dev.ZWare.Client.features.gui;

import Dev.ZWare.Client.features.gui.pkg1.pkg1.Class9;
import Dev.ZWare.Client.features.pkg1.pkg4.Class8;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class OyVeyGui extends Screen {
   // $VF: renamed from: a float
   private static final float field_3114 = 0.24F;
   // $VF: renamed from: b float
   private static final float field_3115 = 0.03F;
   // $VF: renamed from: c Dev.ZWare.Client.features.gui.OyVeyGui
   private static OyVeyGui field_3116 = new OyVeyGui();
   // $VF: renamed from: d java.awt.Color
   private static Color field_3117 = null;
   // $VF: renamed from: e java.util.ArrayList
   private final ArrayList<Class1> field_3118 = new ArrayList<>();
   // $VF: renamed from: f long
   private long field_3119 = -1L;
   // $VF: renamed from: g Dev.ZWare.Client.features.gui.pkg1.pkg1.Class9
   private Class9 field_3120;
   // $VF: renamed from: h int
   private int field_3121;
   // $VF: renamed from: i int
   private int field_3122;

   public OyVeyGui() {
      super(Text.method_43470("ZWare"));
      this.method_3804();
      this.method_3805();
   }

   public static OyVeyGui getInstance() {
      if (field_3116 == null) {
         field_3116 = new OyVeyGui();
      }

      return field_3116;
   }

   public static OyVeyGui getClickGui() {
      return getInstance();
   }

   // $VF: renamed from: a () void
   private void method_3804() {
      field_3116 = this;
   }

   // $VF: renamed from: b () void
   private void method_3805() {
      int var1 = Class1.method_1677();
      int var2 = 6 - (var1 + 2);

      for (final Dev.ZWare.Client.features.pkg1.Class1.Inner1 var4 : Dev.ZWare.Client.Class1.field_316.method_521()) {
         if (var4 != Dev.ZWare.Client.features.pkg1.Class1.Inner1.field_677) {
            this.field_3118.add(new Class1(var4.method_1190(), var2 += var1 + 2, 4, true) {
               // $VF: renamed from: c () void
               @Override
               public void method_1665() {
                  h = new int[]{1};
                  Dev.ZWare.Client.Class1.field_316.method_520(var4).forEach(var1x -> {
                     if (!var1x.field_1230) {
                        this.a(new Class9(var1x));
                     }
                  });
               }
            });
         }
      }

      this.field_3118.forEach(var0 -> var0.method_1691().sort(Comparator.comparing(Dev.ZWare.Client.features.Class1::a)));
   }

   public void updateModule(Dev.ZWare.Client.features.pkg1.Class1 module) {
      for (Class1 var3 : this.field_3118) {
         for (Dev.ZWare.Client.features.gui.pkg1.Class1 var5 : var3.method_1691()) {
            if (var5 instanceof Class9 var6) {
               Dev.ZWare.Client.features.pkg1.Class1 var7 = var6.method_1878();
               if (module != null && module.equals(var7)) {
                  var6.method_1874();
               }
            }
         }
      }
   }

   public void method_25394(DrawContext context, int mouseX, int mouseY, float delta) {
      Dev.ZWare.Client.features.gui.pkg1.Class1.field_1077 = context;
      this.field_3120 = null;
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      float var5 = this.method_3808();
      int var6 = Math.max(0, Math.min(255, Math.round(120.0F * var5)));
      context.method_25294(0, 0, context.method_51421(), context.method_51443(), new Color(0, 0, 0, var6).hashCode());
      this.method_3806();
      Class8 var7 = Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Class8.class) : Class8.method_1995();
      if (var7 != null && var7.field_1362.method_671() == Class8.Inner4.Slide) {
         float var8 = 1.0F - (float)Math.pow(1.0F - var5, 3.0);
         int var9 = (int)(-context.method_51443() * (1.0F - var8));
         context.method_51448().method_22903();
         context.method_51448().method_46416(0.0F, var9, 0.0F);
      }

      for (int var14 = 0; var14 < this.field_3118.size(); var14++) {
         Class1 var15 = this.field_3118.get(var14);
         float var10 = this.method_3809(var14);
         int var11 = var15.method_1678();
         int var12 = var15.method_1680();
         if (var7 == null || var7.field_1362.method_671() == Class8.Inner4.Fade) {
            var11 = Math.round(method_3812(var15.method_1678() - 10.0F, var15.method_1678(), var10));
            int var13 = 24 + var14 * 8;
            var12 = Math.round(method_3812(var15.method_1680() - var13, var15.method_1680(), var10));
         }

         var15.method_1668(context, mouseX, mouseY, delta, var11, var12);
      }

      if (var7 != null && var7.field_1362.method_671() == Class8.Inner4.Slide) {
         context.method_51448().method_22909();
      }

      if (this.field_3120 != null) {
         this.field_3120.method_1885(context, this.field_3121, this.field_3122);
      }

      if (var7 != null && var7.method_1996()) {
         var7.method_1999(context);
      }
   }

   public boolean method_25402(double mouseX, double mouseY, int clickedButton) {
      if (this.method_3807()) {
         return super.method_25402(mouseX, mouseY, clickedButton);
      } else {
         this.field_3118.forEach(var5 -> var5.method_1669((int)mouseX, (int)mouseY, clickedButton));
         return super.method_25402(mouseX, mouseY, clickedButton);
      }
   }

   public boolean method_25406(double mouseX, double mouseY, int releaseButton) {
      if (this.method_3807()) {
         return super.method_25406(mouseX, mouseY, releaseButton);
      } else {
         this.field_3118.forEach(var5 -> var5.method_1670((int)mouseX, (int)mouseY, releaseButton));
         return super.method_25406(mouseX, mouseY, releaseButton);
      }
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.method_3807()) {
         return super.method_25401(mouseX, mouseY, horizontalAmount, verticalAmount);
      } else {
         if (verticalAmount < 0.0) {
            this.field_3118.forEach(var0 -> var0.method_1681(var0.method_1680() - 10));
         } else if (verticalAmount > 0.0) {
            this.field_3118.forEach(var0 -> var0.method_1681(var0.method_1680() + 10));
         }

         return super.method_25401(mouseX, mouseY, horizontalAmount, verticalAmount);
      }
   }

   public boolean method_25404(int keyCode, int scanCode, int modifiers) {
      if (this.method_3807()) {
         return super.method_25404(keyCode, scanCode, modifiers);
      } else {
         this.field_3118.forEach(var1 -> var1.method_1672(keyCode));
         return super.method_25404(keyCode, scanCode, modifiers);
      }
   }

   public boolean method_25400(char chr, int modifiers) {
      if (this.method_3807()) {
         return super.method_25400(chr, modifiers);
      } else {
         this.field_3118.forEach(var2 -> var2.method_1671(chr, modifiers));
         return super.method_25400(chr, modifiers);
      }
   }

   protected void method_25426() {
      super.method_25426();
      this.field_3119 = System.nanoTime();
   }

   public long getOpenedAt() {
      return this.field_3119;
   }

   public boolean method_25421() {
      return false;
   }

   public final ArrayList<Class1> getComponents() {
      return this.field_3118;
   }

   public int getTextOffset() {
      return -6;
   }

   public Class1 getComponentByName(String name) {
      for (Class1 var3 : this.field_3118) {
         if (var3.a().equalsIgnoreCase(name)) {
            return var3;
         }
      }

      return null;
   }

   public void queueDescriptionTooltip(Class9 button, int mouseX, int mouseY) {
      this.field_3120 = button;
      this.field_3121 = mouseX;
      this.field_3122 = mouseY;
   }

   // $VF: renamed from: c () void
   private void method_3806() {
      if (!this.field_3118.stream().anyMatch(Class1::a)) {
         boolean var1 = Class8.method_1995().field_1339.method_671();
         int var2 = 6;
         int var3 = Class1.method_1677();

         for (Class1 var5 : this.field_3118) {
            int var6 = var1 ? var5.method_1675() : var3;
            var5.method_1674(var2, var6);
            var2 = var5.method_1678() + var5.method_1682() + 2;
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_3807() {
      return this.method_3808() < 0.999F;
   }

   // $VF: renamed from: a () float
   private float method_3808() {
      Class8 var1 = Class8.method_1995();
      if (var1 == null || var1.field_1362 == null || var1.field_1362.method_671() == Class8.Inner4.None) {
         return 1.0F;
      } else if (this.field_3119 <= 0L) {
         return 1.0F;
      } else {
         float var2 = var1.field_1363 != null ? var1.field_1363.method_671() : 0.24F;
         float var3 = var1.field_1364 != null ? var1.field_1364.method_671() : 0.03F;
         float var4 = var2 + Math.max(0, this.field_3118.size() - 1) * Math.max(0.0F, var3);
         return var4 <= 0.0F ? 1.0F : method_3811(this.method_3810() / var4);
      }
   }

   // $VF: renamed from: a (int) float
   private float method_3809(int var1) {
      Class8 var2 = Class8.method_1995();
      if (var2 != null && var2.field_1362 != null && var2.field_1362.method_671() != Class8.Inner4.None) {
         float var3 = var2.field_1363 != null ? var2.field_1363.method_671() : 0.24F;
         float var4 = var2.field_1364 != null ? var2.field_1364.method_671() : 0.03F;
         if (var3 <= 0.0F) {
            return 1.0F;
         } else {
            float var5 = this.method_3810() - Math.max(0.0F, var4) * var1;
            return method_3813(method_3811(var5 / var3));
         }
      } else {
         return 1.0F;
      }
   }

   // $VF: renamed from: b () float
   private float method_3810() {
      return this.field_3119 <= 0L ? Float.POSITIVE_INFINITY : Math.max(0.0F, (float)(System.nanoTime() - this.field_3119) / 1.0E9F);
   }

   // $VF: renamed from: a (float) float
   private static float method_3811(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   // $VF: renamed from: a (float, float, float) float
   private static float method_3812(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   // $VF: renamed from: b (float) float
   private static float method_3813(float var0) {
      float var1 = 1.70158F;
      float var2 = var1 + 1.0F;
      float var3 = var0 - 1.0F;
      return 1.0F + var2 * var3 * var3 * var3 + var1 * var3 * var3;
   }

   public static Color getColorClipboard() {
      return field_3117;
   }

   public static void setColorClipboard(Color color) {
      field_3117 = color;
   }
}
