package Dev.ZWare.Client.pkg1.pkg2;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;

public class Class4 implements AutoCloseable {
   // $VF: renamed from: a int
   private static final int field_453 = 256;
   // $VF: renamed from: b int
   private static final int field_454 = 16;
   // $VF: renamed from: c int
   private static final int field_455 = 4;
   // $VF: renamed from: d int
   private static final int field_456 = 12;
   // $VF: renamed from: e int
   private static final int field_457 = 384;
   // $VF: renamed from: f int
   private static final int field_458 = 8192;
   // $VF: renamed from: g int
   private static final int field_459 = 96;
   // $VF: renamed from: h float
   private static final float field_460 = 1.0F;
   // $VF: renamed from: i net.minecraft.client.MinecraftClient
   private final MinecraftClient field_461 = MinecraftClient.method_1551();
   // $VF: renamed from: j java.lang.String
   private final String field_462;
   // $VF: renamed from: k int
   private final int field_463;
   // $VF: renamed from: l float
   private final float field_464;
   // $VF: renamed from: m boolean
   private final boolean field_465;
   // $VF: renamed from: n boolean
   private final boolean field_466;
   // $VF: renamed from: o java.awt.Font
   private final Font field_467;
   // $VF: renamed from: p java.util.Map
   private final Map<Integer, Class4.Inner2> field_468 = new LinkedHashMap<Integer, Class4.Inner2>(16, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Entry<Integer, Class4.Inner2> eldest) {
         if (this.size() <= 12) {
            return false;
         } else {
            Class4.this.method_913((Class4.Inner2)eldest.getValue());
            return true;
         }
      }
   };
   // $VF: renamed from: q java.util.Map
   private final Map<Character, Class4.Inner6> field_469 = new LinkedHashMap<>();
   // $VF: renamed from: r java.util.Map
   private final Map<Long, Float> field_470 = new LinkedHashMap<Long, Float>(256, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Entry<Long, Float> eldest) {
         return this.size() > 8192;
      }
   };
   // $VF: renamed from: s java.util.Map
   private final Map<String, Class4.Inner10> field_471 = new LinkedHashMap<String, Class4.Inner10>(256, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Entry<String, Class4.Inner10> eldest) {
         return this.size() > 384;
      }
   };
   // $VF: renamed from: t java.awt.Font
   private Font field_472;
   // $VF: renamed from: u java.awt.font.FontRenderContext
   private FontRenderContext field_473;
   // $VF: renamed from: v float
   private float field_474;
   // $VF: renamed from: w int
   private int field_475;
   // $VF: renamed from: x int
   private int field_476;
   // $VF: renamed from: y java.lang.String
   private String field_477;
   // $VF: renamed from: z Dev.ZWare.Client.pkg1.pkg2.Class4$Inner10
   private Class4.Inner10 field_478;

   public Class4(String family, int size, float oversample, boolean antiAlias, boolean fractionalMetrics) {
      this.field_462 = family;
      this.field_463 = size;
      this.field_464 = Math.max(1.0F, oversample);
      this.field_465 = antiAlias;
      this.field_466 = fractionalMetrics;
      this.field_467 = new Font(family, 0, Math.max(1, size));
      this.method_894();
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, java.lang.String, float, float, int, boolean) int
   public int method_881(DrawContext context, String text, float x, float y, int color, boolean shadow) {
      return context != null && text != null && !text.isEmpty() ? this.method_888(context, this.method_895(text), x, y, color, shadow) : Math.round(x);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, net.minecraft.text.OrderedText, float, float, int, boolean) int
   public int method_882(DrawContext context, OrderedText text, float x, float y, int color, boolean shadow) {
      return context != null && text != null ? this.method_888(context, this.method_896(this.method_899(text)), x, y, color, shadow) : Math.round(x);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, net.minecraft.text.Text, float, float, int, boolean) int
   public int method_883(DrawContext context, Text text, float x, float y, int color, boolean shadow) {
      return text == null ? Math.round(x) : this.method_882(context, text.method_30937(), x, y, color, shadow);
   }

   // $VF: renamed from: a (java.lang.String) int
   public int method_884(String text) {
      if (text != null && !text.isEmpty()) {
         Class4.Inner10 var2 = this.method_895(text);
         return var2.method_1436() <= 0.0F ? 0 : Math.max(1, Math.round(var2.method_1436() / this.field_474));
      } else {
         return 0;
      }
   }

   // $VF: renamed from: a (net.minecraft.text.OrderedText) int
   public int method_885(OrderedText text) {
      if (text == null) {
         return 0;
      } else {
         Class4.Inner10 var2 = this.method_896(this.method_899(text));
         return var2.method_1436() <= 0.0F ? 0 : Math.max(1, Math.round(var2.method_1436() / this.field_474));
      }
   }

   // $VF: renamed from: a (net.minecraft.text.Text) int
   public int method_886(Text text) {
      return text == null ? 0 : this.method_885(text.method_30937());
   }

   // $VF: renamed from: a () int
   public int method_887() {
      this.method_893();
      return Math.max(1, Math.round(this.field_475 / this.field_474));
   }

   @Override
   public void close() {
      this.field_468.values().forEach(Class4.Inner2::close);
      this.field_468.clear();
      this.field_469.clear();
      this.field_470.clear();
      this.field_471.clear();
      this.field_477 = null;
      this.field_478 = null;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, Dev.ZWare.Client.pkg1.pkg2.Class4$Inner10, float, float, int, boolean) int
   private int method_888(DrawContext var1, Class4.Inner10 var2, float var3, float var4, int var5, boolean var6) {
      this.method_893();
      float var7 = this.method_905(var3);
      float var8 = this.method_905(var4);
      if (var6) {
         this.method_889(var1, var2, var7 + 1.0F, var8 + 1.0F, var5, 0.25F);
      }

      return this.method_889(var1, var2, var7, var8, var5, 1.0F);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, Dev.ZWare.Client.pkg1.pkg2.Class4$Inner10, float, float, int, float) int
   private int method_889(DrawContext var1, Class4.Inner10 var2, float var3, float var4, int var5, float var6) {
      int var7 = this.method_909(this.method_908(var5), var6);
      if (!var2.method_1435().isEmpty()) {
         MatrixStack var8 = var1.method_51448();
         var8.method_22903();
         var8.method_46416(var3, var4, 0.0F);
         var8.method_22905(1.0F / this.field_474, 1.0F / this.field_474, 1.0F);
         var1.method_64039(var5x -> {
            Matrix4f var6x = var8.method_23760().method_23761();

            for (Class4.Inner4 var8x : var2.method_1435()) {
               VertexConsumer var9 = var5x.getBuffer(RenderLayer.method_62277(var8x.method_1384()));

               for (Class4.Inner11 var11 : var8x.method_1385()) {
                  this.method_890(var9, var6x, var11.method_1327(), var11.method_1328(), this.method_910(var7, var6, var11.method_1330()), var11.method_1329());
               }
            }
         });
         var8.method_22909();
      }

      return Math.round(var3 + var2.method_1436() / this.field_474);
   }

   // $VF: renamed from: a (net.minecraft.client.render.VertexConsumer, org.joml.Matrix4f, float, float, int, Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6) void
   private void method_890(VertexConsumer var1, Matrix4f var2, float var3, float var4, int var5, Class4.Inner6 var6) {
      float var7 = var3 + var6.method_1277() - this.field_476;
      float var8 = var4 - this.field_476;
      float var9 = var7 + var6.method_1279();
      float var10 = var8 + var6.method_1280();
      var1.method_22918(var2, var7, var10, 0.0F).method_22913(var6.method_1272(), var6.method_1275()).method_39415(var5);
      var1.method_22918(var2, var9, var10, 0.0F).method_22913(var6.method_1274(), var6.method_1275()).method_39415(var5);
      var1.method_22918(var2, var9, var8, 0.0F).method_22913(var6.method_1274(), var6.method_1273()).method_39415(var5);
      var1.method_22918(var2, var7, var8, 0.0F).method_22913(var6.method_1272(), var6.method_1273()).method_39415(var5);
   }

   // $VF: renamed from: a (char) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6
   private Class4.Inner6 method_891(char var1) {
      Class4.Inner6 var2 = this.field_469.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         Class4.Inner2 var3 = this.method_892(var1);
         var2 = var3.method_625(var1);
         if (var2 != null) {
            this.field_469.put(var1, var2);
         }

         return var2;
      }
   }

   // $VF: renamed from: a (char) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner2
   private Class4.Inner2 method_892(char var1) {
      int var3 = var1 / 256 * 256;
      Class4.Inner2 var4 = this.field_468.get(var3);
      if (var4 != null) {
         return var4;
      } else {
         int var5 = Math.min(var3 + 256, 65536);
         Identifier var6 = Identifier.method_60655(
            "zware",
            "font/"
               + this.method_912(this.field_462)
               + "/"
               + this.field_463
               + "_"
               + Math.round(this.field_474 * 100.0F)
               + "_"
               + (this.field_465 ? "aa" : "raw")
               + "_"
               + (this.field_466 ? "fm" : "int")
               + "_"
               + var3
         );
         Class4.Inner2 var7 = new Class4.Inner2(var3, var5, var6, this.field_472, this.field_465, this.field_466);
         this.field_468.put(var3, var7);
         return var7;
      }
   }

   // $VF: renamed from: a () void
   private void method_893() {
      float var1 = this.method_904() * this.field_464;
      if (this.field_472 == null || Math.abs(var1 - this.field_474) > 0.01F) {
         this.method_894();
      }
   }

   // $VF: renamed from: b () void
   private void method_894() {
      this.close();
      this.field_474 = this.method_904() * this.field_464;
      this.field_476 = this.method_906(this.field_474);
      this.field_472 = this.field_467.deriveFont(Math.max(1.0F, this.field_463 * this.field_474));
      this.field_473 = new FontRenderContext(new AffineTransform(), this.field_465, this.field_466);
      this.field_475 = this.method_907(this.field_472, this.field_465, this.field_466);
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner10
   private Class4.Inner10 method_895(String var1) {
      this.method_893();
      if (this.method_900(var1)) {
         Class4.Inner10 var4 = this.field_471.get(var1);
         if (var4 != null) {
            return var4;
         } else {
            Class4.Inner10 var3 = this.method_896(this.method_898(var1));
            this.field_471.put(var1, var3);
            return var3;
         }
      } else if (var1.equals(this.field_477) && this.field_478 != null) {
         return this.field_478;
      } else {
         Class4.Inner10 var2 = this.method_896(this.method_898(var1));
         this.field_477 = var1;
         this.field_478 = var2;
         return var2;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.pkg2.Class4$Inner3) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner10
   private Class4.Inner10 method_896(Class4.Inner3 var1) {
      this.method_893();
      return this.method_897(var1.method_1491());
   }

   // $VF: renamed from: a (java.util.List) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner10
   private Class4.Inner10 method_897(List<Class4.Inner5> var1) {
      if (var1.isEmpty()) {
         return new Class4.Inner10(List.of(), 0.0F);
      } else {
         float var2 = 0.0F;
         float var3 = 0.0F;
         float var4 = 0.0F;
         float var5 = 0.0F;
         char var6 = 0;
         Class4.Inner6 var7 = null;
         LinkedHashMap var8 = new LinkedHashMap();

         for (Class4.Inner5 var10 : var1) {
            char var11 = var10.method_1379();
            if (var11 == '\n') {
               var5 = Math.max(var5, Math.max(var2, var4));
               var2 = 0.0F;
               var3 += this.field_475;
               var4 = 0.0F;
               var6 = 0;
               var7 = null;
            } else {
               Class4.Inner6 var12 = this.method_891(var11);
               if (var12 != null) {
                  if (var6 != 0 && var7 != null) {
                     var2 += this.method_903(var6, var7, var11, var12);
                  }

                  if (var12.method_1281()) {
                     var8.computeIfAbsent(var12.method_1271(), var0 -> new ArrayList<>()).add(new Class4.Inner11(var2, var3, var12, var10.method_1380()));
                     var4 = Math.max(var4, var2 + var12.method_1277() + var12.method_1278());
                  } else {
                     var4 = Math.max(var4, var2 + var12.method_1276());
                  }

                  var2 += var12.method_1276();
                  var6 = var11;
                  var7 = var12;
               }
            }
         }

         float var13 = Math.max(var5, Math.max(var2, var4));
         ArrayList var14 = new ArrayList(var8.size());

         for (Entry var16 : var8.entrySet()) {
            var14.add(new Class4.Inner4((Identifier)var16.getKey(), List.copyOf((Collection<? extends Class4.Inner11>)var16.getValue())));
         }

         return new Class4.Inner10(List.copyOf(var14), var13);
      }
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner3
   private Class4.Inner3 method_898(String var1) {
      ArrayList var2 = new ArrayList(var1.length());
      Integer var3 = null;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var4) {
            var4 = false;
            Formatting var7 = Formatting.method_544(var6);
            if (var7 != null) {
               if (var7 == Formatting.field_1070) {
                  var3 = null;
               } else if (var7.method_543() && var7.method_532() != null) {
                  var3 = var7.method_532();
               }
            }
         } else if (var6 == 167 && var5 + 1 < var1.length()) {
            var4 = true;
         } else {
            var2.add(new Class4.Inner5(var6, var3));
         }
      }

      return new Class4.Inner3(List.copyOf(var2));
   }

   // $VF: renamed from: a (net.minecraft.text.OrderedText) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner3
   private Class4.Inner3 method_899(OrderedText var1) {
      ArrayList var2 = new ArrayList();
      var1.accept((var2x, var3, var4) -> {
         Integer var5 = this.method_902(var3);

         for (char var9 : Character.toChars(var4)) {
            var2.add(new Class4.Inner5(var9, var5));
         }

         return true;
      });
      return new Class4.Inner3(List.copyOf(var2));
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_900(String var1) {
      if (var1 != null && !var1.isEmpty() && var1.length() <= 96) {
         boolean var2 = false;

         for (int var3 = 0; var3 < var1.length(); var3++) {
            char var4 = var1.charAt(var3);
            if (Character.isDigit(var4) || var4 == '\n') {
               return false;
            }

            if (var4 == 167) {
               return false;
            }

            if (!Character.isLetter(var4) && !Character.isWhitespace(var4) && !this.method_901(var4)) {
               var2 = true;
            }
         }

         return !var2;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (char) boolean
   private boolean method_901(char var1) {
      return switch (var1) {
         case '!', '"', '#', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '=', '?', '[', '\\', ']', '_', '{', '}' -> true;
         default -> false;
      };
   }

   // $VF: renamed from: a (net.minecraft.text.Style) java.lang.Integer
   private Integer method_902(Style var1) {
      if (var1 == null) {
         return null;
      } else {
         TextColor var2 = var1.method_10973();
         return var2 != null ? var2.method_27716() : null;
      }
   }

   // $VF: renamed from: a (char, Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6, char, Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6) float
   private float method_903(char var1, Class4.Inner6 var2, char var3, Class4.Inner6 var4) {
      if (this.field_472 == null || this.field_473 == null || var2 == null || var4 == null) {
         return 0.0F;
      } else if (!Character.isSurrogate(var1) && !Character.isSurrogate(var3)) {
         long var5 = (long)var1 << 32 | var3;
         Float var7 = this.field_470.get(var5);
         if (var7 != null) {
            return var7;
         } else {
            float var8 = 0.0F;

            try {
               GlyphVector var9 = this.field_472.layoutGlyphVector(this.field_473, new char[]{var1, var3}, 0, 2, 0);
               int var10 = var9.getNumGlyphs();
               if (var10 == 2) {
                  float var11 = (float)var9.getGlyphPosition(var10).getX();
                  var8 = var11 - var2.method_1276() - var4.method_1276();
               }
            } catch (RuntimeException var12) {
               var8 = 0.0F;
            }

            if (Math.abs(var8) < 0.01F) {
               var8 = 0.0F;
            }

            this.field_470.put(var5, var8);
            return var8;
         }
      } else {
         return 0.0F;
      }
   }

   // $VF: renamed from: a () float
   private float method_904() {
      return Math.max(1.0F, (float)this.field_461.method_22683().method_4495());
   }

   // $VF: renamed from: a (float) float
   private float method_905(float var1) {
      float var2 = this.method_904();
      return Math.round(var1 * var2) / var2;
   }

   // $VF: renamed from: a (float) int
   private int method_906(float var1) {
      return Math.max(4, (int)Math.ceil(var1) + 2);
   }

   // $VF: renamed from: a (java.awt.Font, boolean, boolean) int
   private int method_907(Font var1, boolean var2, boolean var3) {
      BufferedImage var4 = new BufferedImage(1, 1, 2);
      Graphics2D var5 = var4.createGraphics();
      this.method_911(var5, var2, var3);
      var5.setFont(var1);
      int var6 = Math.max(1, var5.getFontMetrics().getHeight());
      var5.dispose();
      return var6;
   }

   // $VF: renamed from: a (int) int
   private int method_908(int var1) {
      return (var1 & 0xFF000000) == 0 ? var1 | 0xFF000000 : var1;
   }

   // $VF: renamed from: a (int, float) int
   private int method_909(int var1, float var2) {
      int var3 = this.method_908(var1);
      int var4 = var3 >>> 24 & 0xFF;
      int var5 = Math.min(255, Math.max(0, Math.round((var3 >>> 16 & 0xFF) * var2)));
      int var6 = Math.min(255, Math.max(0, Math.round((var3 >>> 8 & 0xFF) * var2)));
      int var7 = Math.min(255, Math.max(0, Math.round((var3 & 0xFF) * var2)));
      return var4 << 24 | var5 << 16 | var6 << 8 | var7;
   }

   // $VF: renamed from: a (int, float, java.lang.Integer) int
   private int method_910(int var1, float var2, Integer var3) {
      if (var3 == null) {
         return var1;
      } else {
         int var4 = var1 & 0xFF000000;
         return this.method_909(var4 | var3, var2);
      }
   }

   // $VF: renamed from: a (java.awt.Graphics2D, boolean, boolean) void
   private void method_911(Graphics2D var1, boolean var2, boolean var3) {
      var1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var2 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
      var1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
      var1.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var3 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
      var1.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
      var1.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
      var1.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
      var1.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      var1.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_912(String var1) {
      StringBuilder var2 = new StringBuilder(var1.length());

      for (int var3 = 0; var3 < var1.length(); var3++) {
         char var4 = Character.toLowerCase(var1.charAt(var3));
         var2.append(Character.isLetterOrDigit(var4) ? var4 : '_');
      }

      return var2.toString();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.pkg2.Class4$Inner2) void
   private void method_913(Class4.Inner2 var1) {
      if (var1 != null) {
         var1.close();

         for (int var2 = var1.field_326; var2 < var1.field_327; var2++) {
            this.field_469.remove((char)var2);
         }

         this.field_471.clear();
         this.field_477 = null;
         this.field_478 = null;
      }
   }

   record Inner10(List<Class4.Inner4> dI, float dJ) {
      // $VF: renamed from: dI java.util.List
      private final List<Class4.Inner4> field_908;
      // $VF: renamed from: dJ float
      private final float field_909;

      Inner10(List<Class4.Inner4> dI, float dJ) {
         this.field_908 = dI;
         this.field_909 = dJ;
      }

      // $VF: renamed from: dI () java.util.List
      public List<Class4.Inner4> method_1435() {
         return this.field_908;
      }

      // $VF: renamed from: dJ () float
      public float method_1436() {
         return this.field_909;
      }
   }

   record Inner11(float dB, float dC, Class4.Inner6 dD, Integer dE) {
      // $VF: renamed from: dB float
      private final float field_810;
      // $VF: renamed from: dC float
      private final float field_811;
      // $VF: renamed from: dD Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6
      private final Class4.Inner6 field_812;
      // $VF: renamed from: dE java.lang.Integer
      private final Integer field_813;

      Inner11(float dB, float dC, Class4.Inner6 dD, Integer dE) {
         this.field_810 = dB;
         this.field_811 = dC;
         this.field_812 = dD;
         this.field_813 = dE;
      }

      // $VF: renamed from: dB () float
      public float method_1327() {
         return this.field_810;
      }

      // $VF: renamed from: dC () float
      public float method_1328() {
         return this.field_811;
      }

      // $VF: renamed from: dD () Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6
      public Class4.Inner6 method_1329() {
         return this.field_812;
      }

      // $VF: renamed from: dE () java.lang.Integer
      public Integer method_1330() {
         return this.field_813;
      }
   }

   private final class Inner2 implements AutoCloseable {
      // $VF: renamed from: a int
      private final int field_326;
      // $VF: renamed from: b int
      private final int field_327;
      // $VF: renamed from: c net.minecraft.util.Identifier
      private final Identifier field_328;
      // $VF: renamed from: d java.awt.Font
      private final Font field_329;
      // $VF: renamed from: e boolean
      private final boolean field_330;
      // $VF: renamed from: f boolean
      private final boolean field_331;
      // $VF: renamed from: g java.util.Map
      private final Map<Character, Class4.Inner6> field_332 = new HashMap<>();
      // $VF: renamed from: h net.minecraft.client.texture.NativeImageBackedTexture
      private NativeImageBackedTexture field_333;

      private Inner2(int var2, int var3, Identifier var4, Font var5, boolean var6, boolean var7) {
         this.field_326 = var2;
         this.field_327 = var3;
         this.field_328 = var4;
         this.field_329 = var5;
         this.field_330 = var6;
         this.field_331 = var7;
      }

      // $VF: renamed from: a (int) boolean
      private boolean method_624(int var1) {
         return var1 >= this.field_326 && var1 < this.field_327;
      }

      // $VF: renamed from: a (char) Dev.ZWare.Client.pkg1.pkg2.Class4$Inner6
      private Class4.Inner6 method_625(char var1) {
         if (this.field_333 == null) {
            this.method_626();
         }

         return this.field_332.get(var1);
      }

      // $VF: renamed from: a () void
      private void method_626() {
         int var1 = this.field_327 - this.field_326;
         if (var1 > 0) {
            BufferedImage var2 = new BufferedImage(1, 1, 2);
            Graphics2D var3 = var2.createGraphics();
            Class4.this.method_911(var3, this.field_330, this.field_331);
            var3.setFont(this.field_329);
            FontMetrics var4 = var3.getFontMetrics();
            int var5 = var4.getAscent();
            int var6 = Math.max(1, var4.getHeight());
            int var7 = 1;
            Class4.Inner9[] var8 = new Class4.Inner9[var1];

            for (int var9 = 0; var9 < var1; var9++) {
               char var10 = (char)(this.field_326 + var9);
               boolean var11 = !Character.isWhitespace(var10);
               if (!var11) {
                  float var12 = Math.max(1.0F, (float)var4.charWidth(var10));
                  var8[var9] = new Class4.Inner9(var10, null, var12, 0.0F, 0.0F, 0.0F, 0, false);
                  var7 = Math.max(var7, (int)Math.ceil(var12));
               } else {
                  GlyphVector var29 = this.field_329.createGlyphVector(Class4.this.field_473, new char[]{var10});
                  Rectangle2D var13 = var29.getVisualBounds().getBounds2D();
                  float var14 = Math.max(1.0F, var29.getGlyphMetrics(0).getAdvanceX());
                  float var15 = (float)var13.getX();
                  int var16 = Math.max(1, (int)Math.ceil(var13.getWidth()));
                  float var17 = Class4.this.field_476 - var15;
                  float var18 = Class4.this.field_476 + var5;
                  var8[var9] = new Class4.Inner9(var10, var29, var14, var15, var17, var18, var16, true);
                  var7 = Math.max(var7, Math.max((int)Math.ceil(var14), var16));
               }
            }

            var3.dispose();
            int var26 = var7 + Class4.this.field_476 * 2;
            int var27 = var6 + Class4.this.field_476 * 2;
            int var28 = Math.max(1, (var1 + 16 - 1) / 16);
            int var30 = Math.max(1, 16 * var26);
            int var31 = Math.max(1, var28 * var27);
            BufferedImage var32 = new BufferedImage(var30, var31, 2);
            Graphics2D var33 = var32.createGraphics();
            Class4.this.method_911(var33, this.field_330, this.field_331);
            var33.setFont(this.field_329);
            var33.setColor(new Color(255, 255, 255, 0));
            var33.fillRect(0, 0, var30, var31);
            var33.setColor(Color.WHITE);

            for (int var34 = 0; var34 < var1; var34++) {
               Class4.Inner9 var35 = var8[var34];
               int var36 = var34 % 16 * var26;
               int var19 = var34 / 16 * var27;
               if (var35.method_1483()) {
                  var33.drawGlyphVector(var35.method_1477(), var36 + var35.method_1480(), var19 + var35.method_1481());
               }

               float var20 = var35.method_1483() ? var35.method_1482() + Class4.this.field_476 * 2.0F : 0.0F;
               float var21 = var35.method_1483() ? var6 + Class4.this.field_476 * 2.0F : 0.0F;
               float var22 = (float)var36 / var30;
               float var23 = (float)var19 / var31;
               float var24 = this.method_627(var36, var20, var30);
               float var25 = this.method_628(var19, var21, var31);
               this.field_332
                  .put(
                     var35.method_1476(),
                     new Class4.Inner6(
                        this.field_328,
                        var22,
                        var23,
                        var24,
                        var25,
                        var35.method_1478(),
                        var35.method_1479(),
                        var35.method_1482(),
                        var20,
                        var21,
                        var35.method_1483()
                     )
                  );
            }

            var33.dispose();
            this.field_333 = this.method_629(this.field_328, var32);
         }
      }

      // $VF: renamed from: a (int, float, int) float
      private float method_627(int var1, float var2, int var3) {
         return var2 <= 0.0F ? 0.0F : (var1 + var2) / var3;
      }

      // $VF: renamed from: b (int, float, int) float
      private float method_628(int var1, float var2, int var3) {
         return var2 <= 0.0F ? 0.0F : (var1 + var2) / var3;
      }

      // $VF: renamed from: a (net.minecraft.util.Identifier, java.awt.image.BufferedImage) net.minecraft.client.texture.NativeImageBackedTexture
      private NativeImageBackedTexture method_629(Identifier var1, BufferedImage var2) {
         int var3 = var2.getWidth();
         int var4 = var2.getHeight();
         NativeImage var5 = new NativeImage(var3, var4, true);

         for (int var6 = 0; var6 < var3; var6++) {
            for (int var7 = 0; var7 < var4; var7++) {
               var5.method_61941(var6, var7, var2.getRGB(var6, var7));
            }
         }

         NativeImageBackedTexture var8 = new NativeImageBackedTexture(() -> "zware_font_atlas_" + this.field_326, var5);
         var8.method_65924(true);
         var8.method_4527(false, false);
         var8.method_4524();
         Class4.this.field_461.method_1531().method_4616(var1, var8);
         return var8;
      }

      @Override
      public void close() {
         if (this.field_333 != null) {
            Class4.this.field_461.method_1531().method_4615(this.field_328);
            this.field_333.close();
            this.field_333 = null;
         }

         this.field_332.clear();
      }
   }

   record Inner3(List<Class4.Inner5> dH) {
      // $VF: renamed from: dH java.util.List
      private final List<Class4.Inner5> field_960;

      Inner3(List<Class4.Inner5> dH) {
         this.field_960 = dH;
      }

      // $VF: renamed from: dH () java.util.List
      public List<Class4.Inner5> method_1491() {
         return this.field_960;
      }
   }

   record Inner4(Identifier dz, List<Class4.Inner11> dA) {
      // $VF: renamed from: dz net.minecraft.util.Identifier
      private final Identifier field_862;
      // $VF: renamed from: dA java.util.List
      private final List<Class4.Inner11> field_863;

      Inner4(Identifier dz, List<Class4.Inner11> dA) {
         this.field_862 = dz;
         this.field_863 = dA;
      }

      // $VF: renamed from: dz () net.minecraft.util.Identifier
      public Identifier method_1384() {
         return this.field_862;
      }

      // $VF: renamed from: dA () java.util.List
      public List<Class4.Inner11> method_1385() {
         return this.field_863;
      }
   }

   record Inner5(char dF, Integer dG) {
      // $VF: renamed from: dF char
      private final char field_857;
      // $VF: renamed from: dG java.lang.Integer
      private final Integer field_858;

      Inner5(char dF, Integer dG) {
         this.field_857 = dF;
         this.field_858 = dG;
      }

      // $VF: renamed from: dF () char
      public char method_1379() {
         return this.field_857;
      }

      // $VF: renamed from: dG () java.lang.Integer
      public Integer method_1380() {
         return this.field_858;
      }
   }

   record Inner6(Identifier df, float dg, float dh, float di, float dj, float dk, float dl, float dm, float dn, float dp, boolean dq) {
      // $VF: renamed from: df net.minecraft.util.Identifier
      private final Identifier field_757;
      // $VF: renamed from: dg float
      private final float field_758;
      // $VF: renamed from: dh float
      private final float field_759;
      // $VF: renamed from: di float
      private final float field_760;
      // $VF: renamed from: dj float
      private final float field_761;
      // $VF: renamed from: dk float
      private final float field_762;
      // $VF: renamed from: dl float
      private final float field_763;
      // $VF: renamed from: dm float
      private final float field_764;
      // $VF: renamed from: dn float
      private final float field_765;
      // $VF: renamed from: dp float
      private final float field_766;
      // $VF: renamed from: dq boolean
      private final boolean field_767;

      Inner6(Identifier df, float dg, float dh, float di, float dj, float dk, float dl, float dm, float dn, float dp, boolean dq) {
         this.field_757 = df;
         this.field_758 = dg;
         this.field_759 = dh;
         this.field_760 = di;
         this.field_761 = dj;
         this.field_762 = dk;
         this.field_763 = dl;
         this.field_764 = dm;
         this.field_765 = dn;
         this.field_766 = dp;
         this.field_767 = dq;
      }

      // $VF: renamed from: df () net.minecraft.util.Identifier
      public Identifier method_1271() {
         return this.field_757;
      }

      // $VF: renamed from: dg () float
      public float method_1272() {
         return this.field_758;
      }

      // $VF: renamed from: dh () float
      public float method_1273() {
         return this.field_759;
      }

      // $VF: renamed from: di () float
      public float method_1274() {
         return this.field_760;
      }

      // $VF: renamed from: dj () float
      public float method_1275() {
         return this.field_761;
      }

      // $VF: renamed from: dk () float
      public float method_1276() {
         return this.field_762;
      }

      // $VF: renamed from: dl () float
      public float method_1277() {
         return this.field_763;
      }

      // $VF: renamed from: dm () float
      public float method_1278() {
         return this.field_764;
      }

      // $VF: renamed from: dn () float
      public float method_1279() {
         return this.field_765;
      }

      // $VF: renamed from: dp () float
      public float method_1280() {
         return this.field_766;
      }

      // $VF: renamed from: dq () boolean
      public boolean method_1281() {
         return this.field_767;
      }
   }

   record Inner9(char dr, GlyphVector ds, float dt, float du, float dv, float dw, int dx, boolean dy) {
      // $VF: renamed from: dr char
      private final char field_945;
      // $VF: renamed from: ds java.awt.font.GlyphVector
      private final GlyphVector field_946;
      // $VF: renamed from: dt float
      private final float field_947;
      // $VF: renamed from: du float
      private final float field_948;
      // $VF: renamed from: dv float
      private final float field_949;
      // $VF: renamed from: dw float
      private final float field_950;
      // $VF: renamed from: dx int
      private final int field_951;
      // $VF: renamed from: dy boolean
      private final boolean field_952;

      Inner9(char dr, GlyphVector ds, float dt, float du, float dv, float dw, int dx, boolean dy) {
         this.field_945 = dr;
         this.field_946 = ds;
         this.field_947 = dt;
         this.field_948 = du;
         this.field_949 = dv;
         this.field_950 = dw;
         this.field_951 = dx;
         this.field_952 = dy;
      }

      // $VF: renamed from: dr () char
      public char method_1476() {
         return this.field_945;
      }

      // $VF: renamed from: ds () java.awt.font.GlyphVector
      public GlyphVector method_1477() {
         return this.field_946;
      }

      // $VF: renamed from: dt () float
      public float method_1478() {
         return this.field_947;
      }

      // $VF: renamed from: du () float
      public float method_1479() {
         return this.field_948;
      }

      // $VF: renamed from: dv () float
      public float method_1480() {
         return this.field_949;
      }

      // $VF: renamed from: dw () float
      public float method_1481() {
         return this.field_950;
      }

      // $VF: renamed from: dx () int
      public int method_1482() {
         return this.field_951;
      }

      // $VF: renamed from: dy () boolean
      public boolean method_1483() {
         return this.field_952;
      }
   }
}
