package Dev.ZWare.Client.features.pkg2;

import Dev.ZWare.Client.pkg1.Class11;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public abstract class Class1 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f java.lang.String
   protected String field_1055;
   // $VF: renamed from: g java.lang.String[]
   protected String[] field_1056;

   public Class1(String name) {
      super(name);
      this.field_1055 = name;
      this.field_1056 = new String[]{""};
   }

   public Class1(String name, String[] commands) {
      super(name);
      this.field_1055 = name;
      this.field_1056 = commands;
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   public static void method_1647(String message, Object... obj) {
      method_1648(Class11.method_290(message, obj));
   }

   // $VF: renamed from: a (net.minecraft.text.Text) void
   public static void method_1648(Text message) {
      MutableText var1 = Text.method_43473();
      String var2 = Dev.ZWare.Client.Class1.field_309.method_1617();
      var1.method_10852(Text.method_43470(var2).method_10862(Text.method_43473().method_10866().method_36139(-5635841)));
      var1.method_10852(Text.method_43470(" ").method_27692(Formatting.field_1080));
      var1.method_10852(message);
      method_1649(var1);
   }

   // $VF: renamed from: b (net.minecraft.text.Text) void
   public static void method_1649(Text message) {
      if (!f()) {
         c.field_1705.method_1743().method_1812(message);
      }
   }

   // $VF: renamed from: b () java.lang.String
   public static String method_1650() {
      return Dev.ZWare.Client.Class1.field_309.method_1619();
   }

   // $VF: renamed from: a (java.lang.String[]) void
   public abstract void method_1651(String[] var1);

   // $VF: renamed from: a () java.lang.String
   @Override
   public String method_1555() {
      return this.field_1055;
   }

   // $VF: renamed from: a () java.lang.String[]
   public String[] method_1652() {
      return this.field_1056;
   }
}
