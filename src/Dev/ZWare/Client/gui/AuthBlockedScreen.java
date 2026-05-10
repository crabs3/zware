package Dev.ZWare.Client.gui;

import Dev.ZWare.Client.Class1;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AuthBlockedScreen extends Screen {
   // $VF: renamed from: a net.minecraft.util.Identifier
   private static final Identifier field_3105 = Identifier.method_60655("oyvey", "textures/gui/auth_left.png");
   // $VF: renamed from: b net.minecraft.util.Identifier
   private static final Identifier field_3106 = Identifier.method_60655("oyvey", "textures/gui/auth_right.png");
   // $VF: renamed from: c net.minecraft.util.Identifier
   private static final Identifier field_3107 = Identifier.method_60655("oyvey", "textures/gui/auth_bottom.png");
   // $VF: renamed from: d int
   private static final int field_3108 = 474;
   // $VF: renamed from: e int
   private static final int field_3109 = 1920;
   // $VF: renamed from: f int
   private static final int field_3110 = 1080;
   // $VF: renamed from: g int
   private static final int field_3111 = 480;
   // $VF: renamed from: h int
   private static final int field_3112 = 332;
   // $VF: renamed from: i net.minecraft.client.gui.widget.ButtonWidget
   private ButtonWidget field_3113;

   public AuthBlockedScreen() {
      super(Text.method_43470("ZWare Access"));
   }

   protected void method_25426() {
      byte var1 = 120;
      byte var2 = 20;
      int var3 = (this.field_22789 - var1) / 2;
      int var4 = this.field_22790 / 2 + 72;
      this.field_3113 = ButtonWidget.method_46430(Text.method_43470("Copy HWID"), var1x -> {
         if (this.field_22787 != null && Class1.field_314 != null) {
            this.field_22787.field_1774.method_1455(Class1.field_314.method_48());
         }
      }).method_46434(var3, var4, var1, var2).method_46431();
      this.method_37063(this.field_3113);
   }

   public void method_25394(DrawContext context, int mouseX, int mouseY, float delta) {
      this.method_25420(context, mouseX, mouseY, delta);
      super.method_25394(context, mouseX, mouseY, delta);
      String var5 = Class1.field_314 != null ? Class1.field_314.method_50() : "Access denied";
      String var6 = Class1.field_314 != null ? Class1.field_314.method_51() : "Authentication failed.";
      String var7 = Class1.field_314 != null ? Class1.field_314.method_48() : "";
      int var8 = this.field_22789 / 2;
      int var9 = this.field_22790 / 2 - 42;
      int var10 = Math.min(150, Math.max(72, this.field_22789 / 5));
      int var11 = Math.max(18, (this.field_22790 - var10) / 2);
      int var12 = Math.max(16, var8 - 230 - var10);
      int var13 = Math.min(this.field_22789 - var10 - 16, var8 + 230);
      int var14 = Math.min(170, Math.max(96, this.field_22789 / 4));
      int var15 = var14 * 332 / 480;
      method_3803(context, field_3105, var12, var11, var10, var10, 474, 474);
      method_3803(context, field_3106, var13, var11, var10, var10, 1920, 1080);
      method_3803(context, field_3107, var8 - var14 / 2, 14, var14, var15, 480, 332);
      context.method_27534(this.field_22793, Text.method_43470(var5), var8, var9, -1);
      context.method_27534(this.field_22793, Text.method_43470(var6), var8, var9 + 20, -3355444);
      context.method_27534(this.field_22793, Text.method_43470("HWID"), var8, var9 + 52, -1);
      context.method_27534(this.field_22793, Text.method_43470(var7), var8, var9 + 66, -5592406);
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, net.minecraft.util.Identifier, int, int, int, int, int, int) void
   private static void method_3803(DrawContext var0, Identifier var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var0.method_25302(RenderLayer::method_62277, var1, var2, var3, 0.0F, 0.0F, var4, var5, var6, var7, var6, var7);
   }

   public boolean method_25422() {
      return false;
   }

   public void method_25419() {
   }

   public boolean method_25421() {
      return false;
   }
}
