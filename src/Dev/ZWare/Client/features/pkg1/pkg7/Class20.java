package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.util.Formatting;

public class Class20 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   public Class20() {
      super("FPS", "Displays current game FPS.", 50.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      String var2 = Dev.ZWare.Client.pkg1.Class6.method_200("fps") + " " + Formatting.field_1068 + c.method_47599();
      int var3 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      float var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2);
      this.a(var4, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134(), o);
      super.method_3643(e);
      this.a(e.method_1053(), "fps", var2, this.a(var4), this.f(), var3);
   }
}
