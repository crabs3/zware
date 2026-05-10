package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.features.gui.HudEditorScreen;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.util.Formatting;
import org.joml.Vector2f;

public abstract class Class11 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o java.lang.String[]
   protected static final String[] field_2948 = new String[]{"Potions", "TPS", "Ping", "FPS", "Speed"};
   // $VF: renamed from: p float
   private static final float field_2949 = 2.0F;
   // $VF: renamed from: q float
   private static final float field_2950 = 1.0F;
   // $VF: renamed from: r float
   private static final float field_2951 = 40.0F;
   // $VF: renamed from: s long
   private static final long field_2952 = 5000L;
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Vector2f> field_2953 = this.a("Position", 0.5F, 0.5F);
   // $VF: renamed from: u int
   private static final int field_2954 = -1442840576;
   // $VF: renamed from: v float
   private float field_2955;
   // $VF: renamed from: w float
   private float field_2956;
   // $VF: renamed from: x float
   private float field_2957;
   // $VF: renamed from: y float
   private float field_2958;
   // $VF: renamed from: z float
   private float field_2959;
   // $VF: renamed from: A float
   private float field_2960;
   // $VF: renamed from: B boolean
   private boolean field_2961;
   // $VF: renamed from: C boolean
   private boolean field_2962;
   // $VF: renamed from: D boolean
   private boolean field_2963;
   // $VF: renamed from: E java.util.Map
   private final Map<String, Class11.Inner2> field_2964 = new HashMap<>();

   public Class11(String name, String description, float width, float height) {
      super(name, description, Dev.ZWare.Client.features.pkg1.Class1.Inner1.field_677, true, false, false);
      this.field_2957 = width;
      this.field_2958 = height;
   }

   // $VF: renamed from: a () float
   public float method_3641() {
      return this.method_3681(c.method_22683().method_4486() * this.field_2953.method_671().x());
   }

   // $VF: renamed from: b () float
   public float method_3642() {
      return this.method_3682(c.method_22683().method_4502() * this.field_2953.method_671().y());
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   public void method_3643(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      this.method_3691();
      if (c.field_1755 instanceof HudEditorScreen && !g() && Dev.ZWare.Client.Class1.field_320 != null) {
         float var2 = this.method_3655();
         float var3 = this.method_3656();
         Float var4 = null;
         Float var5 = null;
         if (this.field_2962) {
            if (!this.field_2961 && this.method_3648() && Dev.ZWare.Client.Class1.field_320.field_3090 == null) {
               this.field_2955 = this.method_3645() - var2;
               this.field_2956 = this.method_3646() - var3;
               this.field_2961 = true;
               Dev.ZWare.Client.Class1.field_320.field_3090 = this;
            }

            if (this.field_2961) {
               Class11.Inner3 var6 = this.method_3679(
                  this.method_3681(this.method_3645() - this.field_2955), this.method_3682(this.method_3646() - this.field_2956)
               );
               float var7 = this.method_3681(var6.method_1252());
               float var8 = this.method_3682(var6.method_1253());
               var4 = var6.method_1254();
               var5 = var6.method_1255();
               this.field_2953.method_671().x = var7 / c.method_22683().method_4486();
               this.field_2953.method_671().y = var8 / c.method_22683().method_4502();
            }
         } else {
            this.field_2961 = false;
         }

         boolean var10 = this.method_3648() && !Dev.ZWare.Client.Class1.field_320.field_3091;
         if (Dev.ZWare.Client.Class1.field_320.field_3090 != null) {
            var10 = Dev.ZWare.Client.Class1.field_320.field_3090 == this;
         }

         if (var10) {
            int var11 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.a());
            int var12 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
            float var9 = var2 + this.field_2957 + 5.0F;
            if (var9 + var11 > c.method_22683().method_4486()) {
               var9 = var2 - 5.0F - var11;
            }

            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(e.method_1053(), this.a(), var9, var3 + this.field_2958 / 2.0F - var12 / 2.0F, -1);
            Dev.ZWare.Client.Class1.field_320.field_3091 = true;
         }

         if (this.field_2961) {
            this.method_3678(e, var4, var5);
         }

         Dev.ZWare.Client.pkg1.pkg2.Class2.method_767(
            e.method_1053().method_51448(),
            var2 - 1.0F,
            var3 - 1.0F,
            var2 + this.field_2957 + 1.0F,
            var3 + this.field_2958 + 1.0F,
            Dev.ZWare.Client.Class1.field_296.method_497().getRGB(),
            1.0F
         );
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class1) void
   @iFT13zrx_wTXP
   public void method_3644(Dev.ZWare.Client.pkg2.pkg1.Class1 e) {
      if (c.field_1755 instanceof HudEditorScreen && !g()) {
         if (Dev.ZWare.Client.Class1.field_320 != null) {
            if (e.method_1043() == 0) {
               this.field_2962 = false;
               this.field_2961 = false;
               Dev.ZWare.Client.Class1.field_320.field_3090 = null;
            }

            if (e.method_1043() == 1 && this.method_3648()) {
               this.field_2962 = true;
            }
         }
      }
   }

   // $VF: renamed from: a () int
   public int method_3645() {
      return (int)(c.field_1729.method_1603() / c.method_22683().method_4495());
   }

   // $VF: renamed from: b () int
   public int method_3646() {
      return (int)(c.field_1729.method_1604() / c.method_22683().method_4495());
   }

   // $VF: renamed from: a (float, float, float, float) void
   public void method_3647(float x, float y, float width, float height) {
      this.field_2957 = width;
      this.field_2958 = height;
      this.field_2953.method_671().x = this.method_3681(x) / c.method_22683().method_4486();
      this.field_2953.method_671().y = this.method_3682(y) / c.method_22683().method_4502();
   }

   // $VF: renamed from: a () boolean
   public boolean method_3648() {
      float var1 = this.method_3641();
      float var2 = this.method_3642();
      int var3 = this.method_3645();
      int var4 = this.method_3646();
      return var3 >= var1 - 1.0F && var3 <= var1 + this.field_2957 + 1.0F && var4 >= var2 - 1.0F && var4 <= var2 + this.field_2958 + 1.0F;
   }

   // $VF: renamed from: c () float
   public float method_3649() {
      return this.field_2957;
   }

   // $VF: renamed from: d () float
   public float method_3650() {
      return this.field_2958;
   }

   // $VF: renamed from: a (float) void
   public void method_3651(float width) {
      this.field_2957 = width;
   }

   // $VF: renamed from: b (float) void
   public void method_3652(float height) {
      this.field_2958 = height;
   }

   // $VF: renamed from: a (float, float) void
   protected void method_3653(float width, float height) {
      float var3 = this.method_3641();
      float var4 = this.method_3642();
      float var5 = var3 + this.field_2957;
      float var6 = var4 + this.field_2958;
      boolean var7 = this.method_3694(var3, this.field_2957);
      boolean var8 = this.method_3695(var4, this.field_2958);
      this.field_2957 = width;
      this.field_2958 = height;
      float var9 = var7 ? var5 - width : var3;
      float var10 = var8 ? var6 - height : var4;
      this.field_2953.method_671().x = this.method_3681(var9) / c.method_22683().method_4486();
      this.field_2953.method_671().y = this.method_3682(var10) / c.method_22683().method_4502();
   }

   // $VF: renamed from: a (float) float
   protected float method_3654(float contentWidth) {
      float var2 = this.method_3655();
      return this.method_3657() ? var2 + this.method_3649() - contentWidth : var2;
   }

   // $VF: renamed from: e () float
   protected float method_3655() {
      this.method_3691();
      return this.field_2963 ? this.field_2959 : this.method_3641();
   }

   // $VF: renamed from: f () float
   protected float method_3656() {
      this.method_3691();
      return this.field_2963 ? this.field_2960 : this.method_3642();
   }

   // $VF: renamed from: b () boolean
   protected boolean method_3657() {
      return this.method_3694(this.method_3641(), this.method_3649());
   }

   // $VF: renamed from: b (float, float) void
   protected void method_3658(float width, float height) {
      if (this.method_3690()) {
         this.method_3653(width, height);
      } else {
         float var3 = this.method_3689();
         this.method_3647(var3, var3, width, height);
      }
   }

   // $VF: renamed from: c (float, float) void
   protected void method_3659(float width, float height) {
      if (this.method_3690()) {
         this.method_3653(width, height);
      } else {
         float var3 = this.method_3689();
         this.method_3647(var3, c.method_22683().method_4502() - var3 - height, width, height);
      }
   }

   // $VF: renamed from: a (float, float, java.lang.String[]) void
   protected void method_3660(float width, float height, String... bottomUpOrder) {
      if (this.method_3690()) {
         this.method_3653(width, height);
      } else {
         float var4 = this.method_3689();
         float var5 = c.method_22683().method_4502() - var4 - height - this.method_3693(bottomUpOrder);
         float var6 = c.method_22683().method_4486() - var4 - width;
         this.method_3647(var6, var5, width, height);
      }
   }

   // $VF: renamed from: d (float, float) void
   protected void method_3661(float width, float height) {
      if (this.method_3690()) {
         this.method_3653(width, height);
      } else {
         float var3 = this.method_3689();
         float var4 = c.method_22683().method_4486() - var3 - width;
         float var5 = (c.method_22683().method_4502() - height) / 2.0F;
         this.method_3647(var4, var5, width, height);
      }
   }

   // $VF: renamed from: e (float, float) void
   protected void method_3662(float width, float height) {
      if (this.method_3690()) {
         this.method_3653(width, height);
      } else {
         float var3 = c.method_22683().method_4486() / 2.0F + 91.0F - width;
         float var4 = c.method_22683().method_4502() - height - 40.0F;
         this.method_3647(var3, var4, width, height);
      }
   }

   // $VF: renamed from: c () boolean
   protected boolean method_3663() {
      return this.d();
   }

   // $VF: renamed from: n () boolean
   protected boolean method_3664() {
      return c.field_1755 instanceof HudEditorScreen;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int) int
   protected int method_3665(DrawContext context, String text, float x, float y, int color) {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_127(context, text, x, y, color);
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int) int
   protected int method_3666(DrawContext context, String text, float x, float y, int color) {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_128(context, text, x, y, color);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, java.lang.String, float, float, int) int
   protected int method_3667(DrawContext context, String key, String text, float x, float y, int color) {
      return this.method_3668(context, key, text, x, y, color, 1.0F);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, java.lang.String, float, float, int, float) int
   protected int method_3668(DrawContext context, String key, String text, float x, float y, int color, float scale) {
      if (context != null && text != null) {
         if (this.method_3669() && this.method_3674(text)) {
            this.method_3671();
            long var8 = System.currentTimeMillis();
            String var10 = this.a() + ":" + key;
            List var11 = this.method_3672(text, color, scale);
            Class11.Inner2 var12 = this.field_2964.computeIfAbsent(var10, var0 -> new Class11.Inner2());
            var12.field_443 = var8;
            if (var12.field_441 == null) {
               var12.field_441 = var11;
               return Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(context, text, x, y, color, scale);
            } else {
               if (!this.method_3673(var12.field_441, var11)) {
                  var12.field_440 = var12.field_441;
                  var12.field_441 = var11;
                  var12.field_442 = var8;
               }

               if (var12.field_440 == null) {
                  return Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(context, text, x, y, color, scale);
               } else {
                  float var13 = Math.clamp((float)(var8 - var12.field_442) / this.method_3670(), 0.0F, 1.0F);
                  if (var13 >= 1.0F) {
                     var12.field_440 = null;
                     return Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(context, text, x, y, color, scale);
                  } else {
                     float var14 = x;
                     float var15 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(scale);
                     List var16 = var12.field_440;
                     List var17 = var12.field_441;
                     boolean var18 = false;

                     for (int var19 = 0; var19 < var17.size(); var19++) {
                        Class11.Inner4 var20 = (Class11.Inner4)var17.get(var19);
                        Class11.Inner4 var21 = var19 < var16.size() ? (Class11.Inner4)var16.get(var19) : null;
                        if (!this.method_3675(var21, var20)) {
                           Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(context, String.valueOf(var20.method_1488()), var14, y, var20.method_1489(), scale);
                           var14 += var20.method_1490();
                        } else {
                           var18 = true;
                           float var22 = Math.max(var21.method_1490(), var20.method_1490());
                           float var23 = var14 + (var22 - var20.method_1490()) / 2.0F;
                           float var24 = var14 + (var22 - var21.method_1490()) / 2.0F;
                           float var25 = this.method_3676(var21.method_1488(), var20.method_1488());
                           float var26 = y + var15 * var13 * var25;
                           float var27 = y + var15 * (var13 - 1.0F) * var25;
                           context.method_44379(
                              Math.max(0, (int)Math.floor(var14 - 1.0F)),
                              Math.max(0, (int)Math.floor(y - 1.0F)),
                              Math.max(1, (int)Math.ceil(var14 + var22 + 1.0F)),
                              Math.max(1, (int)Math.ceil(y + var15 + 1.0F))
                           );
                           Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(context, String.valueOf(var21.method_1488()), var24, var26, var21.method_1489(), scale);
                           Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(context, String.valueOf(var20.method_1488()), var23, var27, var20.method_1489(), scale);
                           context.method_44380();
                           var14 += var20.method_1490();
                        }
                     }

                     if (!var18) {
                        var12.field_440 = null;
                        return Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(context, text, x, y, color, scale);
                     } else {
                        return Math.round(var14);
                     }
                  }
               }
            }
         } else {
            return Dev.ZWare.Client.pkg1.pkg2.Class1.method_130(context, text, x, y, color, scale);
         }
      } else {
         return 0;
      }
   }

   // $VF: renamed from: o () boolean
   private boolean method_3669() {
      Class2 var1 = Class2.method_2695();
      return var1 != null && var1.method_2702() && !this.method_3664();
   }

   // $VF: renamed from: g () float
   private float method_3670() {
      Class2 var1 = Class2.method_2695();
      float var2 = var1 != null ? var1.method_2703() : 1.0F;
      return Math.max(40.0F, 240.0F / Math.max(0.25F, var2));
   }

   // $VF: renamed from: n () void
   private void method_3671() {
      long var1 = System.currentTimeMillis() - 5000L;
      Iterator var3 = this.field_2964.entrySet().iterator();

      while (var3.hasNext()) {
         if (((Class11.Inner2)((Entry)var3.next()).getValue()).field_443 < var1) {
            var3.remove();
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, int, float) java.util.List
   private List<Class11.Inner4> method_3672(String var1, int var2, float var3) {
      ArrayList var4 = new ArrayList(var1.length());
      int var5 = this.method_3677(var2);
      boolean var6 = false;

      for (int var7 = 0; var7 < var1.length(); var7++) {
         char var8 = var1.charAt(var7);
         if (var6) {
            var6 = false;
            Formatting var9 = Formatting.method_544(var8);
            if (var9 != null) {
               if (var9 == Formatting.field_1070) {
                  var5 = this.method_3677(var2);
               } else if (var9.method_543() && var9.method_532() != null) {
                  int var10 = var5 >>> 24 & 0xFF;
                  var5 = var10 << 24 | var9.method_532();
               }
            }
         } else if (var8 == 167 && var7 + 1 < var1.length()) {
            var6 = true;
         } else {
            var4.add(new Class11.Inner4(var8, var5, (float)Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(String.valueOf(var8), var3)));
         }
      }

      return var4;
   }

   // $VF: renamed from: a (java.util.List, java.util.List) boolean
   private boolean method_3673(List<Class11.Inner4> var1, List<Class11.Inner4> var2) {
      if (var1 == var2) {
         return true;
      } else if (var1 != null && var2 != null && var1.size() == var2.size()) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            Class11.Inner4 var4 = (Class11.Inner4)var1.get(var3);
            Class11.Inner4 var5 = (Class11.Inner4)var2.get(var3);
            if (var4.method_1488() != var5.method_1488() || var4.method_1489() != var5.method_1489()) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_3674(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         if (Character.isDigit(var1.charAt(var2))) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class11$Inner4, Dev.ZWare.Client.features.pkg1.pkg4.Class11$Inner4) boolean
   private boolean method_3675(Class11.Inner4 var1, Class11.Inner4 var2) {
      return var1 != null && var1.method_1488() != var2.method_1488() && Character.isDigit(var1.method_1488()) && Character.isDigit(var2.method_1488());
   }

   // $VF: renamed from: a (char, char) float
   private float method_3676(char var1, char var2) {
      int var3 = var1 - '0';
      int var4 = var2 - '0';
      int var5 = (var4 - var3 + 10) % 10;
      int var6 = (var3 - var4 + 10) % 10;
      return var5 <= var6 ? -1.0F : 1.0F;
   }

   // $VF: renamed from: a (int) int
   private int method_3677(int var1) {
      return (var1 & 0xFF000000) == 0 ? var1 | 0xFF000000 : var1;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3, java.lang.Float, java.lang.Float) void
   private void method_3678(Dev.ZWare.Client.pkg2.pkg1.Class3 var1, Float var2, Float var3) {
      int var4 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() & 16777215 | -1442840576 : -1426063361;
      if (var2 != null) {
         int var5 = Math.round(var2);
         var1.method_1053().method_25294(var5, 0, var5 + 1, c.method_22683().method_4502(), var4);
      }

      if (var3 != null) {
         int var6 = Math.round(var3);
         var1.method_1053().method_25294(0, var6, c.method_22683().method_4486(), var6 + 1, var4);
      }
   }

   // $VF: renamed from: a (float, float) Dev.ZWare.Client.features.pkg1.pkg4.Class11$Inner3
   private Class11.Inner3 method_3679(float var1, float var2) {
      Class2 var3 = Class2.method_2695();
      if (var3 != null && var3.method_2698() && Dev.ZWare.Client.Class1.field_316 != null) {
         float var4 = var3.method_2699();
         Class11.Inner1 var5 = new Class11.Inner1(var1, null, var4 + 1.0F);
         Class11.Inner1 var6 = new Class11.Inner1(var2, null, var4 + 1.0F);
         float var7 = c.method_22683().method_4486() / 2.0F;
         float var8 = c.method_22683().method_4502() / 2.0F;
         float var9 = this.method_3688();
         var5 = this.method_3680(var5, var1, var9, var9, var4);
         var5 = this.method_3680(var5, var1, c.method_22683().method_4486() - var9 - this.field_2957, c.method_22683().method_4486() - var9, var4);
         var5 = this.method_3680(var5, var1, var7 - this.field_2957 / 2.0F, var7, var4);
         var6 = this.method_3680(var6, var2, var9, var9, var4);
         var6 = this.method_3680(var6, var2, c.method_22683().method_4502() - var9 - this.field_2958, c.method_22683().method_4502() - var9, var4);
         var6 = this.method_3680(var6, var2, var8 - this.field_2958 / 2.0F, var8, var4);

         for (Dev.ZWare.Client.features.pkg1.Class1 var11 : Dev.ZWare.Client.Class1.field_316
            .method_520(Dev.ZWare.Client.features.pkg1.Class1.Inner1.field_677)) {
            if (var11 instanceof Class11 var12 && var12 != this && var12.d()) {
               float var13 = var12.method_3641();
               float var14 = var12.method_3642();
               float var15 = var12.method_3649();
               float var16 = var12.method_3650();
               float var17 = var13 + var15 / 2.0F;
               float var18 = var14 + var16 / 2.0F;
               float var19 = var13 + var15;
               float var20 = var14 + var16;
               var5 = this.method_3680(var5, var1, var13, var13, var4);
               var5 = this.method_3680(var5, var1, var19 - this.field_2957, var19, var4);
               var5 = this.method_3680(var5, var1, var17 - this.field_2957 / 2.0F, var17, var4);
               var5 = this.method_3680(var5, var1, var19, var19, var4);
               var5 = this.method_3680(var5, var1, var13 - this.field_2957, var13, var4);
               var6 = this.method_3680(var6, var2, var14, var14, var4);
               var6 = this.method_3680(var6, var2, var20 - this.field_2958, var20, var4);
               var6 = this.method_3680(var6, var2, var18 - this.field_2958 / 2.0F, var18, var4);
               var6 = this.method_3680(var6, var2, var20, var20, var4);
               var6 = this.method_3680(var6, var2, var14 - this.field_2958, var14, var4);
            }
         }

         return new Class11.Inner3(var5.method_1349(), var6.method_1349(), var5.method_1350(), var6.method_1350());
      } else {
         return new Class11.Inner3(var1, var2, null, null);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class11$Inner1, float, float, float, float) Dev.ZWare.Client.features.pkg1.pkg4.Class11$Inner1
   private Class11.Inner1 method_3680(Class11.Inner1 var1, float var2, float var3, float var4, float var5) {
      float var6 = Math.abs(var2 - var3);
      return !(var6 > var5) && !(var6 >= var1.method_1351()) ? new Class11.Inner1(var3, var4, var6) : var1;
   }

   // $VF: renamed from: b (float) float
   private float method_3681(float var1) {
      return this.method_3683(var1, this.method_3684(), this.method_3685());
   }

   // $VF: renamed from: c (float) float
   private float method_3682(float var1) {
      return this.method_3683(var1, this.method_3686(), this.method_3687());
   }

   // $VF: renamed from: a (float, float, float) float
   private float method_3683(float var1, float var2, float var3) {
      return Math.min(Math.max(var1, var2), var3);
   }

   // $VF: renamed from: h () float
   private float method_3684() {
      return Math.min(this.method_3688(), this.method_3685());
   }

   // $VF: renamed from: i () float
   private float method_3685() {
      return Math.max(0.0F, c.method_22683().method_4486() - this.field_2957 - this.method_3688());
   }

   // $VF: renamed from: j () float
   private float method_3686() {
      return Math.min(this.method_3688(), this.method_3687());
   }

   // $VF: renamed from: k () float
   private float method_3687() {
      float var1 = c.method_22683().method_4502() - this.field_2958 - this.method_3688();
      if (c.field_1755 instanceof ChatScreen) {
         var1 = Math.min(var1, c.method_22683().method_4502() - 14 - this.field_2958);
      }

      return Math.max(0.0F, var1);
   }

   // $VF: renamed from: l () float
   private float method_3688() {
      Class2 var1 = Class2.method_2695();
      return var1 != null ? var1.method_2696() : 0.0F;
   }

   // $VF: renamed from: m () float
   protected float method_3689() {
      return Math.max(2.0F, this.method_3688());
   }

   // $VF: renamed from: p () boolean
   private boolean method_3690() {
      Class2 var1 = Class2.method_2695();
      return var1 != null && var1.method_2697();
   }

   // $VF: renamed from: o () void
   private void method_3691() {
      float var1 = this.method_3641();
      float var2 = this.method_3642();
      Class2 var3 = Class2.method_2695();
      boolean var4 = var3 != null && var3.method_2700() && !this.method_3664();
      if (this.field_2963 && var4) {
         float var5 = Math.clamp(var3.method_2701(), 0.05F, 1.0F);
         this.field_2959 = this.method_3692(this.field_2959, var1, var5);
         this.field_2960 = this.method_3692(this.field_2960, var2, var5);
         if (Math.abs(this.field_2959 - var1) < 0.05F) {
            this.field_2959 = var1;
         }

         if (Math.abs(this.field_2960 - var2) < 0.05F) {
            this.field_2960 = var2;
         }
      } else {
         this.field_2959 = var1;
         this.field_2960 = var2;
         this.field_2963 = true;
      }
   }

   // $VF: renamed from: b (float, float, float) float
   private float method_3692(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   // $VF: renamed from: a (java.lang.String[]) float
   private float method_3693(String... var1) {
      if (Dev.ZWare.Client.Class1.field_316 != null && var1 != null) {
         float var2 = 0.0F;

         for (String var6 : var1) {
            if (var6.equalsIgnoreCase(this.a())) {
               break;
            }

            Dev.ZWare.Client.features.pkg1.Class1 var7 = Dev.ZWare.Client.Class1.field_316.method_509(var6);
            if (var7 instanceof Class11 var8 && var7.method_1899() && var8.method_3663()) {
               var2 += var8.method_3650() + 1.0F;
            }
         }

         return var2;
      } else {
         return 0.0F;
      }
   }

   // $VF: renamed from: a (float, float) boolean
   private boolean method_3694(float var1, float var2) {
      float var3 = this.method_3688();
      float var4 = Math.abs(var1 - var3);
      float var5 = Math.abs(c.method_22683().method_4486() - var3 - (var1 + var2));
      return var5 <= var4;
   }

   // $VF: renamed from: b (float, float) boolean
   private boolean method_3695(float var1, float var2) {
      float var3 = this.method_3688();
      float var4 = Math.abs(var1 - var3);
      float var5 = Math.abs(c.method_22683().method_4502() - var3 - (var1 + var2));
      return var5 <= var4;
   }

   private record Inner1(float q, Float r, float s) {
      // $VF: renamed from: q float
      private final float field_832;
      // $VF: renamed from: r java.lang.Float
      private final Float field_833;
      // $VF: renamed from: s float
      private final float field_834;

      private Inner1(float q, Float r, float s) {
         this.field_832 = q;
         this.field_833 = r;
         this.field_834 = s;
      }

      // $VF: renamed from: q () float
      public float method_1349() {
         return this.field_832;
      }

      // $VF: renamed from: r () java.lang.Float
      public Float method_1350() {
         return this.field_833;
      }

      // $VF: renamed from: s () float
      public float method_1351() {
         return this.field_834;
      }
   }

   private static final class Inner2 {
      // $VF: renamed from: a java.util.List
      private List<Class11.Inner4> field_440;
      // $VF: renamed from: b java.util.List
      private List<Class11.Inner4> field_441;
      // $VF: renamed from: c long
      private long field_442;
      // $VF: renamed from: d long
      private long field_443;
   }

   private record Inner3(float t, float u, Float v, Float w) {
      // $VF: renamed from: t float
      private final float field_738;
      // $VF: renamed from: u float
      private final float field_739;
      // $VF: renamed from: v java.lang.Float
      private final Float field_740;
      // $VF: renamed from: w java.lang.Float
      private final Float field_741;

      private Inner3(float t, float u, Float v, Float w) {
         this.field_738 = t;
         this.field_739 = u;
         this.field_740 = v;
         this.field_741 = w;
      }

      // $VF: renamed from: t () float
      public float method_1252() {
         return this.field_738;
      }

      // $VF: renamed from: u () float
      public float method_1253() {
         return this.field_739;
      }

      // $VF: renamed from: v () java.lang.Float
      public Float method_1254() {
         return this.field_740;
      }

      // $VF: renamed from: w () java.lang.Float
      public Float method_1255() {
         return this.field_741;
      }
   }

   private record Inner4(char x, int y, float z) {
      // $VF: renamed from: x char
      private final char field_957;
      // $VF: renamed from: y int
      private final int field_958;
      // $VF: renamed from: z float
      private final float field_959;

      private Inner4(char x, int y, float z) {
         this.field_957 = x;
         this.field_958 = y;
         this.field_959 = z;
      }

      // $VF: renamed from: x () char
      public char method_1488() {
         return this.field_957;
      }

      // $VF: renamed from: y () int
      public int method_1489() {
         return this.field_958;
      }

      // $VF: renamed from: z () float
      public float method_1490() {
         return this.field_959;
      }
   }
}
