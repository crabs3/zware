package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class18 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2969 = this.a("Nether", false);

   public Class18() {
      super("Coordinates", "Display coordinates", 150.0F, 20.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      if (g()) {
         this.c(150.0F, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134());
         super.method_3643(e);
      } else {
         Vec3d var2 = c.field_1724.method_19538();
         BlockPos var3 = BlockPos.method_49638(var2);
         Object var4 = "X: "
            + Formatting.field_1068
            + var3.method_10263()
            + Formatting.field_1070
            + " Y: "
            + Formatting.field_1068
            + var3.method_10264()
            + Formatting.field_1070
            + " Z: "
            + Formatting.field_1068
            + var3.method_10260();
         if (this.field_2969.method_671()) {
            int var5 = c.field_1724.method_37908().method_27983().method_29177().method_12832().equals("the_nether")
               ? var3.method_10263() * 8
               : var3.method_10263() / 8;
            int var6 = c.field_1724.method_37908().method_27983().method_29177().method_12832().equals("the_nether")
               ? var3.method_10260() * 8
               : var3.method_10260() / 8;
            var4 = var4 + Formatting.field_1070 + " [" + Formatting.field_1068 + var5 + ", " + var6 + Formatting.field_1070 + "]";
         }

         int var7 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
         float var8 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132((String)var4);
         this.c(var8, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134());
         super.method_3643(e);
         this.a(e.method_1053(), "coords", (String)var4, this.a(var8), this.f(), var7);
      }
   }
}
