package Dev.ZWare.Client.pkg1.pkg2;

import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.List;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexRendering;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;

public class Class2 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, float, float, float, float, int) void
   public static void method_766(MatrixStack stack, float x1, float y1, float x2, float y2, int color) {
      method_773(stack, x1, y1, x2, y2, color);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, float, float, float, float, int, float) void
   public static void method_767(MatrixStack stack, float x1, float y1, float x2, float y2, int color, float width) {
      method_771(stack, x1, x2, y1, color, width);
      method_772(stack, x2, y1, y2, color, width);
      method_771(stack, x1, x2, y2, color, width);
      method_772(stack, x1, y1, y2, color, width);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, float, float, float, float, int, int) void
   public static void method_768(MatrixStack stack, float x1, float y1, float x2, float y2, int fillColor, int borderColor) {
      method_773(stack, x1, y1, x2, y2, fillColor);
      method_767(stack, x1, y1, x2, y2, borderColor, 1.0F);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, float, float, float, int) void
   protected static void method_769(MatrixStack matrices, float x1, float x2, float y, int color) {
      if (x2 < x1) {
         float var5 = x1;
         x1 = x2;
         x2 = var5;
      }

      method_773(matrices, x1, y, x2 + 1.0F, y + 1.0F, color);
   }

   // $VF: renamed from: b (net.minecraft.client.util.math.MatrixStack, float, float, float, int) void
   protected static void method_770(MatrixStack matrices, float x, float y1, float y2, int color) {
      if (y2 < y1) {
         float var5 = y1;
         y1 = y2;
         y2 = var5;
      }

      method_773(matrices, x, y1 + 1.0F, x + 1.0F, y2, color);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, float, float, float, int, float) void
   protected static void method_771(MatrixStack matrices, float x1, float x2, float y, int color, float width) {
      if (x2 < x1) {
         float var6 = x1;
         x1 = x2;
         x2 = var6;
      }

      method_773(matrices, x1, y, x2 + width, y + width, color);
   }

   // $VF: renamed from: b (net.minecraft.client.util.math.MatrixStack, float, float, float, int, float) void
   protected static void method_772(MatrixStack matrices, float x, float y1, float y2, int color, float width) {
      if (y2 < y1) {
         float var6 = y1;
         y1 = y2;
         y2 = var6;
      }

      method_773(matrices, x, y1 + width, x + width, y2, color);
   }

   // $VF: renamed from: b (net.minecraft.client.util.math.MatrixStack, float, float, float, float, int) void
   public static void method_773(MatrixStack matrix, float x1, float y1, float x2, float y2, int color) {
      if (x1 < x2) {
         float var6 = x1;
         x1 = x2;
         x2 = var6;
      }

      if (y1 < y2) {
         float var12 = y1;
         y1 = y2;
         y2 = var12;
      }

      float var7 = (color >> 24 & 0xFF) / 255.0F;
      float var8 = (color >> 16 & 0xFF) / 255.0F;
      float var9 = (color >> 8 & 0xFF) / 255.0F;
      float var10 = (color & 0xFF) / 255.0F;
      BufferBuilder var11 = Tessellator.method_1348().method_60827(DrawMode.field_27382, VertexFormats.field_1576);
      var11.method_22918(matrix.method_23760().method_23761(), x1, y2, 0.0F).method_22915(var8, var9, var10, var7);
      var11.method_22918(matrix.method_23760().method_23761(), x2, y2, 0.0F).method_22915(var8, var9, var10, var7);
      var11.method_22918(matrix.method_23760().method_23761(), x2, y1, 0.0F).method_22915(var8, var9, var10, var7);
      var11.method_22918(matrix.method_23760().method_23761(), x1, y1, 0.0F).method_22915(var8, var9, var10, var7);
      Class8.method_245().method_60895(var11.method_60800());
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, float, float, float, float, java.awt.Color, java.awt.Color) void
   public static void method_774(MatrixStack matrix, float x1, float y1, float x2, float y2, Color left, Color right) {
      BufferBuilder var7 = Tessellator.method_1348().method_60827(DrawMode.field_27382, VertexFormats.field_1576);
      var7.method_22918(matrix.method_23760().method_23761(), x1, y1, 0.0F)
         .method_22915(left.getRed() / 255.0F, left.getGreen() / 255.0F, left.getBlue() / 255.0F, left.getAlpha() / 255.0F);
      var7.method_22918(matrix.method_23760().method_23761(), x1, y2, 0.0F)
         .method_22915(left.getRed() / 255.0F, left.getGreen() / 255.0F, left.getBlue() / 255.0F, left.getAlpha() / 255.0F);
      var7.method_22918(matrix.method_23760().method_23761(), x2, y2, 0.0F)
         .method_22915(right.getRed() / 255.0F, right.getGreen() / 255.0F, right.getBlue() / 255.0F, right.getAlpha() / 255.0F);
      var7.method_22918(matrix.method_23760().method_23761(), x2, y1, 0.0F)
         .method_22915(right.getRed() / 255.0F, right.getGreen() / 255.0F, right.getBlue() / 255.0F, right.getAlpha() / 255.0F);
      Class8.method_245().method_60895(var7.method_60800());
   }

   // $VF: renamed from: b (net.minecraft.client.util.math.MatrixStack, float, float, float, float, java.awt.Color, java.awt.Color) void
   public static void method_775(MatrixStack matrix, float x1, float y1, float x2, float y2, Color top, Color bottom) {
      BufferBuilder var7 = Tessellator.method_1348().method_60827(DrawMode.field_27382, VertexFormats.field_1576);
      var7.method_22918(matrix.method_23760().method_23761(), x1, y1, 0.0F)
         .method_22915(top.getRed() / 255.0F, top.getGreen() / 255.0F, top.getBlue() / 255.0F, top.getAlpha() / 255.0F);
      var7.method_22918(matrix.method_23760().method_23761(), x1, y2, 0.0F)
         .method_22915(bottom.getRed() / 255.0F, bottom.getGreen() / 255.0F, bottom.getBlue() / 255.0F, bottom.getAlpha() / 255.0F);
      var7.method_22918(matrix.method_23760().method_23761(), x2, y2, 0.0F)
         .method_22915(bottom.getRed() / 255.0F, bottom.getGreen() / 255.0F, bottom.getBlue() / 255.0F, bottom.getAlpha() / 255.0F);
      var7.method_22918(matrix.method_23760().method_23761(), x2, y1, 0.0F)
         .method_22915(top.getRed() / 255.0F, top.getGreen() / 255.0F, top.getBlue() / 255.0F, top.getAlpha() / 255.0F);
      Class8.method_245().method_60895(var7.method_60800());
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Box, java.awt.Color) void
   public static void method_776(MatrixStack stack, Box box, Color c) {
      float var3 = (float)(box.field_1323 - a.method_1561().field_4686.method_19326().method_10216());
      float var4 = (float)(box.field_1322 - a.method_1561().field_4686.method_19326().method_10214());
      float var5 = (float)(box.field_1321 - a.method_1561().field_4686.method_19326().method_10215());
      float var6 = (float)(box.field_1320 - a.method_1561().field_4686.method_19326().method_10216());
      float var7 = (float)(box.field_1325 - a.method_1561().field_4686.method_19326().method_10214());
      float var8 = (float)(box.field_1324 - a.method_1561().field_4686.method_19326().method_10215());
      BufferBuilder var9 = Tessellator.method_1348().method_60827(DrawMode.field_27382, VertexFormats.field_1576);
      var9.method_22918(stack.method_23760().method_23761(), var3, var4, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var4, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var4, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var4, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var7, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var7, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var7, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var7, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var4, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var7, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var7, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var4, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var4, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var7, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var7, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var4, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var4, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var4, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var6, var7, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var7, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var4, var5).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var4, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var7, var8).method_39415(c.getRGB());
      var9.method_22918(stack.method_23760().method_23761(), var3, var7, var5).method_39415(c.getRGB());
      Class8.method_245().method_60895(var9.method_60800());
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Box, java.awt.Color, java.awt.Color, double, double, double) void
   public static void method_777(MatrixStack stack, Box box, Color start, Color end, double axisX, double axisY, double axisZ) {
      float var10 = (float)(box.field_1323 - a.method_1561().field_4686.method_19326().method_10216());
      float var11 = (float)(box.field_1322 - a.method_1561().field_4686.method_19326().method_10214());
      float var12 = (float)(box.field_1321 - a.method_1561().field_4686.method_19326().method_10215());
      float var13 = (float)(box.field_1320 - a.method_1561().field_4686.method_19326().method_10216());
      float var14 = (float)(box.field_1325 - a.method_1561().field_4686.method_19326().method_10214());
      float var15 = (float)(box.field_1324 - a.method_1561().field_4686.method_19326().method_10215());
      double var16 = Math.sqrt(axisX * axisX + axisY * axisY + axisZ * axisZ);
      double var18 = var16 <= 1.0E-6 ? 0.0 : axisX / var16;
      double var20 = var16 <= 1.0E-6 ? 1.0 : axisY / var16;
      double var22 = var16 <= 1.0E-6 ? 0.0 : axisZ / var16;
      double[] var24 = new double[]{
         method_786(box.field_1323, box.field_1322, box.field_1321, var18, var20, var22),
         method_786(box.field_1320, box.field_1322, box.field_1321, var18, var20, var22),
         method_786(box.field_1320, box.field_1322, box.field_1324, var18, var20, var22),
         method_786(box.field_1323, box.field_1322, box.field_1324, var18, var20, var22),
         method_786(box.field_1323, box.field_1325, box.field_1321, var18, var20, var22),
         method_786(box.field_1323, box.field_1325, box.field_1324, var18, var20, var22),
         method_786(box.field_1320, box.field_1325, box.field_1324, var18, var20, var22),
         method_786(box.field_1320, box.field_1325, box.field_1321, var18, var20, var22)
      };
      double var25 = var24[0];
      double var27 = var24[0];

      for (double var32 : var24) {
         var25 = Math.min(var25, var32);
         var27 = Math.max(var27, var32);
      }

      double var34 = Math.max(1.0E-6, var27 - var25);
      BufferBuilder var35 = Tessellator.method_1348().method_60827(DrawMode.field_27382, VertexFormats.field_1576);
      method_785(var35, stack, var10, var11, var12, box.field_1323, box.field_1322, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var11, var12, box.field_1320, box.field_1322, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var11, var15, box.field_1320, box.field_1322, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var11, var15, box.field_1323, box.field_1322, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var14, var12, box.field_1323, box.field_1325, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var14, var15, box.field_1323, box.field_1325, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var14, var15, box.field_1320, box.field_1325, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var14, var12, box.field_1320, box.field_1325, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var11, var12, box.field_1323, box.field_1322, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var14, var12, box.field_1323, box.field_1325, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var14, var12, box.field_1320, box.field_1325, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var11, var12, box.field_1320, box.field_1322, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var11, var12, box.field_1320, box.field_1322, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var14, var12, box.field_1320, box.field_1325, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var14, var15, box.field_1320, box.field_1325, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var11, var15, box.field_1320, box.field_1322, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var11, var15, box.field_1323, box.field_1322, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var11, var15, box.field_1320, box.field_1322, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var13, var14, var15, box.field_1320, box.field_1325, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var14, var15, box.field_1323, box.field_1325, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var11, var12, box.field_1323, box.field_1322, box.field_1321, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var11, var15, box.field_1323, box.field_1322, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var14, var15, box.field_1323, box.field_1325, box.field_1324, start, end, var18, var20, var22, var25, var34);
      method_785(var35, stack, var10, var14, var12, box.field_1323, box.field_1325, box.field_1321, start, end, var18, var20, var22, var25, var34);
      Class8.method_245().method_60895(var35.method_60800());
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Vec3d, java.awt.Color) void
   public static void method_778(MatrixStack stack, Vec3d vec, Color c) {
      method_776(stack, Box.method_29968(vec), c);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.BlockPos, java.awt.Color) void
   public static void method_779(MatrixStack stack, BlockPos bp, Color c) {
      method_776(stack, new Box(bp), c);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Box, java.awt.Color, double) void
   public static void method_780(MatrixStack stack, Box box, Color c, double lineWidth) {
      float var5 = (float)(box.field_1323 - a.method_1561().field_4686.method_19326().method_10216());
      float var6 = (float)(box.field_1322 - a.method_1561().field_4686.method_19326().method_10214());
      float var7 = (float)(box.field_1321 - a.method_1561().field_4686.method_19326().method_10215());
      float var8 = (float)(box.field_1320 - a.method_1561().field_4686.method_19326().method_10216());
      float var9 = (float)(box.field_1325 - a.method_1561().field_4686.method_19326().method_10214());
      float var10 = (float)(box.field_1324 - a.method_1561().field_4686.method_19326().method_10215());
      BufferBuilder var11 = Tessellator.method_1348().method_60827(DrawMode.field_27377, VertexFormats.field_29337);
      VertexRendering.method_62292(
         stack, var11, var5, var6, var7, var8, var9, var10, c.getRed() / 255.0F, c.getGreen() / 255.0F, c.getBlue() / 255.0F, c.getAlpha() / 255.0F
      );
      Class8.method_244(lineWidth).method_60895(var11.method_60800());
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Vec3d, java.awt.Color, double) void
   public static void method_781(MatrixStack stack, Vec3d vec, Color c, double lineWidth) {
      method_780(stack, Box.method_29968(vec), c, lineWidth);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.BlockPos, java.awt.Color, double) void
   public static void method_782(MatrixStack stack, BlockPos bp, Color c, double lineWidth) {
      method_780(stack, new Box(bp), c, lineWidth);
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, net.minecraft.util.math.Vec3d, net.minecraft.util.math.Vec3d, java.awt.Color, double) void
   public static void method_783(MatrixStack stack, Vec3d start, Vec3d end, Color color, double lineWidth) {
      Vec3d var6 = a.method_1561().field_4686.method_19326();
      float var7 = (float)(start.field_1352 - var6.field_1352);
      float var8 = (float)(start.field_1351 - var6.field_1351);
      float var9 = (float)(start.field_1350 - var6.field_1350);
      float var10 = (float)(end.field_1352 - var6.field_1352);
      float var11 = (float)(end.field_1351 - var6.field_1351);
      float var12 = (float)(end.field_1350 - var6.field_1350);
      float var13 = var10 - var7;
      float var14 = var11 - var8;
      float var15 = var12 - var9;
      float var16 = MathHelper.method_15355(var13 * var13 + var14 * var14 + var15 * var15);
      float var17 = var16 > 1.0E-5F ? var13 / var16 : 0.0F;
      float var18 = var16 > 1.0E-5F ? var14 / var16 : 0.0F;
      float var19 = var16 > 1.0E-5F ? var15 / var16 : 0.0F;
      BufferBuilder var20 = Tessellator.method_1348().method_60827(DrawMode.field_27377, VertexFormats.field_29337);
      var20.method_22918(stack.method_23760().method_23761(), var7, var8, var9).method_39415(color.getRGB()).method_22914(var17, var18, var19);
      var20.method_22918(stack.method_23760().method_23761(), var10, var11, var12).method_39415(color.getRGB()).method_22914(var17, var18, var19);
      Class8.method_244(lineWidth).method_60895(var20.method_60800());
   }

   // $VF: renamed from: a (net.minecraft.client.util.math.MatrixStack, java.util.List, java.awt.Color, double) void
   public static void method_784(MatrixStack stack, List<Vec3d> points, Color color, double lineWidth) {
      if (points != null && points.size() >= 2) {
         Vec3d var5 = a.method_1561().field_4686.method_19326();
         BufferBuilder var6 = Tessellator.method_1348().method_60827(DrawMode.field_27377, VertexFormats.field_29337);

         for (int var7 = 0; var7 < points.size() - 1; var7++) {
            Vec3d var8 = (Vec3d)points.get(var7);
            Vec3d var9 = (Vec3d)points.get(var7 + 1);
            float var10 = (float)(var8.field_1352 - var5.field_1352);
            float var11 = (float)(var8.field_1351 - var5.field_1351);
            float var12 = (float)(var8.field_1350 - var5.field_1350);
            float var13 = (float)(var9.field_1352 - var5.field_1352);
            float var14 = (float)(var9.field_1351 - var5.field_1351);
            float var15 = (float)(var9.field_1350 - var5.field_1350);
            float var16 = var13 - var10;
            float var17 = var14 - var11;
            float var18 = var15 - var12;
            float var19 = MathHelper.method_15355(var16 * var16 + var17 * var17 + var18 * var18);
            float var20 = var19 > 1.0E-5F ? var16 / var19 : 0.0F;
            float var21 = var19 > 1.0E-5F ? var17 / var19 : 0.0F;
            float var22 = var19 > 1.0E-5F ? var18 / var19 : 0.0F;
            var6.method_22918(stack.method_23760().method_23761(), var10, var11, var12).method_39415(color.getRGB()).method_22914(var20, var21, var22);
            var6.method_22918(stack.method_23760().method_23761(), var13, var14, var15).method_39415(color.getRGB()).method_22914(var20, var21, var22);
         }

         Class8.method_244(lineWidth).method_60895(var6.method_60800());
      }
   }

   // $VF: renamed from: a (net.minecraft.client.render.BufferBuilder, net.minecraft.client.util.math.MatrixStack, float, float, float, double, double, double, java.awt.Color, java.awt.Color, double, double, double, double, double) void
   private static void method_785(
      BufferBuilder var0,
      MatrixStack var1,
      float var2,
      float var3,
      float var4,
      double var5,
      double var7,
      double var9,
      Color var11,
      Color var12,
      double var13,
      double var15,
      double var17,
      double var19,
      double var21
   ) {
      double var23 = method_786(var5, var7, var9, var13, var15, var17);
      double var25 = Math.max(0.0, Math.min(1.0, (var23 - var19) / var21));
      Color var27 = method_787(var11, var12, var25);
      var0.method_22918(var1.method_23760().method_23761(), var2, var3, var4).method_39415(var27.getRGB());
   }

   // $VF: renamed from: a (double, double, double, double, double, double) double
   private static double method_786(double var0, double var2, double var4, double var6, double var8, double var10) {
      return var0 * var6 + var2 * var8 + var4 * var10;
   }

   // $VF: renamed from: a (java.awt.Color, java.awt.Color, double) java.awt.Color
   private static Color method_787(Color var0, Color var1, double var2) {
      int var4 = (int)Math.round(var0.getRed() + (var1.getRed() - var0.getRed()) * var2);
      int var5 = (int)Math.round(var0.getGreen() + (var1.getGreen() - var0.getGreen()) * var2);
      int var6 = (int)Math.round(var0.getBlue() + (var1.getBlue() - var0.getBlue()) * var2);
      int var7 = (int)Math.round(var0.getAlpha() + (var1.getAlpha() - var0.getAlpha()) * var2);
      return new Color(Math.max(0, Math.min(255, var4)), Math.max(0, Math.min(255, var5)), Math.max(0, Math.min(255, var6)), Math.max(0, Math.min(255, var7)));
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.client.util.math.MatrixStack
   public static MatrixStack method_788(Vec3d pos) {
      MatrixStack var1 = new MatrixStack();
      Camera var2 = a.field_1773.method_19418();
      var1.method_22907(RotationAxis.field_40714.rotationDegrees(var2.method_19329()));
      var1.method_22907(RotationAxis.field_40716.rotationDegrees(var2.method_19330() + 180.0F));
      var1.method_22904(
         pos.method_10216() - var2.method_19326().field_1352,
         pos.method_10214() - var2.method_19326().field_1351,
         pos.method_10215() - var2.method_19326().field_1350
      );
      return var1;
   }
}
