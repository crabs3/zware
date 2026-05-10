package Dev.ZWare.Client.pkg1.pkg2;

import net.minecraft.client.gui.DrawContext;

public class Class5 {
   // $VF: renamed from: a int
   private static int field_321;
   // $VF: renamed from: b int
   private static int field_322;
   // $VF: renamed from: c int
   private static int field_323;
   // $VF: renamed from: d int
   private static int field_324;

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, int, int) void
   public static void method_621(DrawContext context, int x1, int y1, int x2, int y2) {
      context.method_44379(x1, y1, x2, y2);
      field_321 = x1;
      field_322 = y1;
      field_323 = x2;
      field_324 = y2;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext) void
   public static void method_622(DrawContext context) {
      context.method_44380();
   }

   // $VF: renamed from: b (net.minecraft.client.gui.DrawContext) void
   public static void method_623(DrawContext context) {
      context.method_44379(field_321, field_322, field_323, field_324);
   }
}
