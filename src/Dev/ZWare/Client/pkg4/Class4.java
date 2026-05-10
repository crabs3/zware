package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;

public class Class4 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c java.util.concurrent.ConcurrentMap
   private static final ConcurrentMap<String, Integer> field_107 = new ConcurrentHashMap<>();

   // $VF: renamed from: a () void
   public void method_235() {
      b.a(this);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP(
      a = 1000
   )
   public void method_236(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 event) {
      if (a.field_1687 != null && a.field_1724 != null) {
         if (event.method_1045() instanceof EntityStatusS2CPacket var2
            && var2.method_11470() == 35
            && var2.method_11469(a.field_1687) instanceof PlayerEntity var4) {
            String var5 = var4.method_7334().getName();
            field_107.merge(var5, 1, Integer::sum);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) int
   public int method_237(PlayerEntity player) {
      return player == null ? 0 : field_107.getOrDefault(player.method_7334().getName(), 0);
   }

   // $VF: renamed from: a (java.lang.String) int
   public int method_238(String name) {
      return field_107.getOrDefault(name, 0);
   }

   // $VF: renamed from: a () java.util.concurrent.ConcurrentMap
   public ConcurrentMap<String, Integer> method_239() {
      return field_107;
   }

   // $VF: renamed from: b () void
   public void method_240() {
      field_107.clear();
   }
}
