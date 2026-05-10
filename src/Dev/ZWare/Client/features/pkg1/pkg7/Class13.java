package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import net.minecraft.util.Formatting;

public class Class13 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F java.text.DecimalFormat
   private static final DecimalFormat field_3078 = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));

   public Class13() {
      super("TPS", "Displays current server ticks.", 75.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      float var2 = Dev.ZWare.Client.Class1.field_295 != null ? Dev.ZWare.Client.Class1.field_295.method_1642() : 20.0F;
      float var3 = Dev.ZWare.Client.Class1.field_295 != null ? Dev.ZWare.Client.Class1.field_295.method_1643() : 20.0F;
      String var4 = Dev.ZWare.Client.pkg1.Class6.method_200("tps")
         + " "
         + Formatting.field_1068
         + field_3078.format(var2)
         + Formatting.field_1080
         + " ["
         + Formatting.field_1068
         + field_3078.format(var3)
         + Formatting.field_1080
         + "]";
      int var5 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      float var6 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4);
      this.a(var6, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134(), o);
      super.method_3643(e);
      this.a(e.method_1053(), "tps", var4, this.a(var6), this.f(), var5);
   }
}
