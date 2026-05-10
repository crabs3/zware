package Dev.ZWare.Client.features.gui.pkg1;

import java.awt.Color;
import net.minecraft.client.gui.DrawContext;

public class Class1 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f net.minecraft.client.gui.DrawContext
   public static DrawContext field_1077;
   // $VF: renamed from: g float
   protected float field_1078;
   // $VF: renamed from: h float
   protected float field_1079;
   // $VF: renamed from: i int
   protected int field_1080;
   // $VF: renamed from: j int
   protected int field_1081;
   // $VF: renamed from: k boolean
   private boolean field_1082;

   public Class1(String name) {
      super(name);
   }

   // $VF: renamed from: a (float, float) void
   public void method_1700(float x, float y) {
      this.field_1078 = x;
      this.field_1079 = y;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
   }

   // $VF: renamed from: a (int, int, int) void
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
   }

   // $VF: renamed from: b (int, int, int) void
   public void method_1703(int mouseX, int mouseY, int releaseButton) {
   }

   // $VF: renamed from: c () void
   public void method_1704() {
   }

   // $VF: renamed from: a (char, int) void
   public void method_1705(char typedChar, int keyCode) {
   }

   // $VF: renamed from: a (int) void
   public void method_1706(int key) {
   }

   // $VF: renamed from: a () float
   public float method_1707() {
      return this.field_1078;
   }

   // $VF: renamed from: b () float
   public float method_1708() {
      return this.field_1079;
   }

   // $VF: renamed from: a () int
   public int method_1709() {
      return this.field_1080;
   }

   // $VF: renamed from: b (int) void
   public void method_1710(int width) {
      this.field_1080 = width;
   }

   // $VF: renamed from: b () int
   public int method_1711() {
      return this.field_1081;
   }

   // $VF: renamed from: c (int) void
   public void method_1712(int height) {
      this.field_1081 = height;
   }

   // $VF: renamed from: a () boolean
   public boolean method_1713() {
      return this.field_1082;
   }

   // $VF: renamed from: a (boolean) boolean
   public boolean method_1714(boolean hidden) {
      this.field_1082 = hidden;
      return this.field_1082;
   }

   // $VF: renamed from: a (java.lang.String, double, double, java.awt.Color) void
   protected void method_1715(String text, double x, double y, Color color) {
      this.method_1716(text, x, y, color.hashCode());
   }

   // $VF: renamed from: a (java.lang.String, double, double, int) void
   protected void method_1716(String text, double x, double y, int color) {
      Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(field_1077, text, (float)x, (float)y, color);
   }

   // $VF: renamed from: a (int, int) boolean
   public boolean method_1717(int mouseX, int mouseY) {
      return false;
   }

   // $VF: renamed from: c () int
   public int method_1718() {
      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(this.a()) + 6;
   }

   // $VF: renamed from: b () boolean
   public boolean method_1719() {
      return false;
   }
}
