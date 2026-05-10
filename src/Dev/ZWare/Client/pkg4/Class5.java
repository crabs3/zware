package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

public class Class5 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c java.util.Map
   private final Map<UUID, Long> field_184 = new HashMap<>();
   // $VF: renamed from: d long
   private static final long field_185 = 60000L;

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   public void method_387(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 event) {
      if (event.method_1045() instanceof PlaySoundS2CPacket var2) {
         Identifier var6 = var2.method_11894().method_40230().map(var0 -> var0.method_29177()).orElse(null);
         if (var6 == null) {
            try {
               var6 = ((SoundEvent)var2.method_11894().comp_349()).comp_3319();
            } catch (Exception var5) {
            }
         }

         if (var6 != null && this.method_390(var6.method_12832())) {
            UUID var4 = this.method_391(var2.method_11890(), var2.method_11889(), var2.method_11893());
            if (var4 != null) {
               this.field_184.put(var4, System.currentTimeMillis());
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class4) void
   @iFT13zrx_wTXP
   public void method_388(Dev.ZWare.Client.pkg2.pkg1.Class4 event) {
      long var2 = System.currentTimeMillis();
      this.field_184.entrySet().removeIf(var2x -> var2 - var2x.getValue() > 60000L);
   }

   // $VF: renamed from: a (java.util.UUID) boolean
   public boolean method_389(UUID uuid) {
      return this.field_184.containsKey(uuid);
   }

   // $VF: renamed from: a (java.lang.String) boolean
   private boolean method_390(String var1) {
      return var1.contains(".growl") || var1.contains(".stare") || var1.contains(".scream") || var1.contains(".angry");
   }

   // $VF: renamed from: a (double, double, double) java.util.UUID
   private UUID method_391(double var1, double var3, double var5) {
      if (a.field_1687 == null) {
         return null;
      } else {
         Entity var7 = null;
         double var8 = 100.0;
         Vec3d var10 = new Vec3d(var1, var3, var5);

         for (Entity var12 : a.field_1687.method_18112()) {
            double var13 = var12.method_5707(var10);
            if (var13 < var8) {
               var8 = var13;
               var7 = var12;
            }
         }

         return var7 != null ? var7.method_5667() : null;
      }
   }
}
