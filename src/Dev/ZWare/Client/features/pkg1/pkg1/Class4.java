package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.entity.EntityPose;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.util.math.Box;

public class Class4 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1274 = this.a("Delay", 2, 1, 10);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1275 = this.a("Cooldown", 5, 1, 40);
   // $VF: renamed from: q int
   private int field_1276;
   // $VF: renamed from: r int
   private int field_1277;

   public Class4() {
      super(
         "Fixes", "Resends a single sneak packet when local crouch state is desynced.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false
      );
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1276 = 0;
      this.field_1277 = 0;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1276 = 0;
      this.field_1277 = 0;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.method_1955() ? "Desynced" : null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_1954(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.method_1562() != null) {
         if (this.field_1277 > 0) {
            this.field_1277--;
         }

         if (!this.method_1955()) {
            this.field_1276 = 0;
         } else if (++this.field_1276 >= this.field_1274.method_671()) {
            if (this.field_1277 <= 0) {
               this.method_1956(c.field_1724.method_5715());
               this.field_1276 = 0;
               this.field_1277 = this.field_1275.method_671();
            }
         }
      } else {
         this.field_1276 = 0;
         this.field_1277 = 0;
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_1955() {
      if (g() || c.method_1562() == null) {
         return false;
      } else if (!c.field_1724.method_5765() && !c.field_1724.method_6113() && !c.field_1724.method_6128() && !c.field_1724.method_5681()) {
         EntityPose var1 = c.field_1724.method_18376();
         if (var1 != EntityPose.field_18076 && var1 != EntityPose.field_18081) {
            return false;
         } else {
            Box var2 = c.field_1724.method_18377(EntityPose.field_18076).method_30757(c.field_1724.method_19538());
            return !c.field_1687.method_8587(c.field_1724, var2) ? false : c.field_1724.method_5715() != c.field_1724.method_18276();
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (boolean) void
   private void method_1956(boolean var1) {
      Mode var2 = var1 ? Mode.field_12979 : Mode.field_12984;
      c.method_1562().method_52787(new ClientCommandC2SPacket(c.field_1724, var2));
   }
}
