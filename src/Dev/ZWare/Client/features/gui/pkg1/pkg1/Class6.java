package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Formatting;

public class Class6 extends Class11 {
   // $VF: renamed from: n Dev.ZWare.Client.pkg1.pkg1.Class1
   private static final Dev.ZWare.Client.pkg1.pkg1.Class1 field_1155 = new Dev.ZWare.Client.pkg1.pkg1.Class1();
   // $VF: renamed from: o boolean
   private static boolean field_1156;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_1157;
   // $VF: renamed from: q boolean
   public boolean field_1158;
   // $VF: renamed from: r Dev.ZWare.Client.features.gui.pkg1.pkg1.Class6$Inner1
   private Class6.Inner1 field_1159 = new Class6.Inner1("");

   public Class6(Dev.ZWare.Client.features.pkg3.Class8<String> setting) {
      super(setting.method_670());
      this.field_1157 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public static String method_1816(String str) {
      String var1 = "";
      if (str != null && !str.isEmpty()) {
         var1 = str.substring(0, str.length() - 1);
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      this.a(mouseX, mouseY);
      this.a(context, this.a(this.a(mouseX, mouseY)));
      if (this.field_1158) {
         this.a(this.field_1157.method_670() + " " + Formatting.field_1080 + this.field_1159.method_1335() + method_1819(), this.e());
      } else {
         this.a(this.field_1157.method_670() + " " + Formatting.field_1080 + this.field_1157.method_671(), this.e());
      }
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      super.method_1702(mouseX, mouseY, mouseButton);
      if (this.a(mouseX, mouseY)) {
         this.f();
      }
   }

   // $VF: renamed from: a (char, int) void
   @Override
   public void method_1705(char typedChar, int keyCode) {
      if (this.field_1158) {
         this.method_1818(this.field_1159.method_1335() + typedChar);
      }
   }

   // $VF: renamed from: a (int) void
   @Override
   public void method_1706(int key) {
      if (this.field_1158) {
         switch (key) {
            case 257:
               this.method_1817();
            case 259:
               this.method_1818(method_1816(this.field_1159.method_1335()));
         }
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1157.method_710());
   }

   // $VF: renamed from: g () void
   private void method_1817() {
      if (this.field_1159.method_1335().isEmpty()) {
         this.field_1157.method_672(this.field_1157.method_706());
      } else {
         this.field_1157.method_672(this.field_1159.method_1335());
      }

      this.method_1818("");
      this.d();
   }

   // $VF: renamed from: e () void
   @Override
   public void method_1722() {
      this.field_1158 = !this.field_1158;
   }

   // $VF: renamed from: c () boolean
   @Override
   public boolean method_1723() {
      return !this.field_1158;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_1818(String newString) {
      this.field_1159 = new Class6.Inner1(newString);
   }

   // $VF: renamed from: b () java.lang.String
   public static String method_1819() {
      if (field_1155.method_614(500L)) {
         field_1156 = !field_1156;
         field_1155.method_618();
      }

      return field_1156 ? "|" : "";
   }

   // $VF: renamed from: c () int
   @Override
   public int method_1718() {
      String var1;
      if (this.field_1158) {
         var1 = this.field_1157.method_670() + " " + Formatting.field_1080 + this.field_1159.method_1335() + method_1819();
      } else {
         var1 = this.field_1157.method_670() + " " + Formatting.field_1080 + this.field_1157.method_671();
      }

      return Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var1) + 8;
   }

   public record Inner1(String d) {
      // $VF: renamed from: d java.lang.String
      private final String field_818;

      public Inner1(String d) {
         this.field_818 = d;
      }

      // $VF: renamed from: d () java.lang.String
      public String method_1335() {
         return this.field_818;
      }
   }
}
