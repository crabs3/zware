package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.util.Formatting;

public class Class19 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3045 = this.a("ShowTimings", false);

   public Class19() {
      super("PacketLimiter", "Displays packet limiter counters.", 140.0F, 30.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      super.method_3643(e);
      if (!g() && Dev.ZWare.Client.Class1.field_302 != null) {
         String var2 = this.method_3754(Dev.ZWare.Client.pkg4.Class1.Inner1.Global);
         String var3 = this.method_3754(Dev.ZWare.Client.pkg4.Class1.Inner1.Offhand);
         String var4 = this.method_3754(Dev.ZWare.Client.pkg4.Class1.Inner1.ClickSlot);
         int var5 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
         int var6 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
         float var7 = Math.max(
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2),
            Math.max(Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3), Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4))
         );
         float var8 = var6 * 3.0F;
         this.a(var7, var8);
         float var9 = this.f();
         this.b(e.method_1053(), var2, this.a(Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2)), var9, var5);
         this.b(e.method_1053(), var3, this.a(Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3)), var9 + var6, var5);
         this.b(e.method_1053(), var4, this.a(Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4)), var9 + var6 * 2.0F, var5);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class1$Inner1) java.lang.String
   private String method_3754(Dev.ZWare.Client.pkg4.Class1.Inner1 var1) {
      if (!Dev.ZWare.Client.Class1.field_302.method_256(var1)) {
         return this.method_3755(var1) + " " + Formatting.field_1068 + "None";
      } else {
         int var2 = Dev.ZWare.Client.Class1.field_302.method_250(var1);
         int var3 = Dev.ZWare.Client.Class1.field_302.method_257(var1);
         String var4 = this.method_3755(var1);
         if (!this.field_3045.method_671()) {
            return var4 + " " + Formatting.field_1068 + var2 + "/" + var3;
         } else {
            long var5 = Dev.ZWare.Client.Class1.field_302.method_252(var1);
            return var4
               + " "
               + Formatting.field_1068
               + var2
               + "/"
               + var3
               + Formatting.field_1080
               + " ["
               + Formatting.field_1068
               + this.method_3756(var5)
               + Formatting.field_1080
               + "]";
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg4.Class1$Inner1) java.lang.String
   private String method_3755(Dev.ZWare.Client.pkg4.Class1.Inner1 var1) {
      return switch (var1) {
         case Global -> "Global";
         case Offhand -> "Offhand";
         case ClickSlot -> "ClickSlot";
      };
   }

   // $VF: renamed from: a (long) java.lang.String
   private String method_3756(long var1) {
      if (var1 % 1000L == 0L) {
         return var1 / 1000L + "s";
      } else {
         return var1 < 1000L ? var1 + "ms" : String.format("%.1fs", var1 / 1000.0);
      }
   }
}
