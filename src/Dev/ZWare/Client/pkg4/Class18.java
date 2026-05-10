package Dev.ZWare.Client.pkg4;

import Dev.ZWare.Client.features.gui.OyVeyGui;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.BrandCustomPayload;
import net.minecraft.network.packet.s2c.common.CustomPayloadS2CPacket;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.util.Formatting;

public class Class18 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f java.util.Set
   private final Set<UUID> field_1033 = new HashSet<>();

   // $VF: renamed from: c () void
   public void method_1583() {
      b.a(this);
   }

   // $VF: renamed from: d () void
   public void method_1584() {
      b.b(this);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class4) void
   @iFT13zrx_wTXP
   public void method_1585(Dev.ZWare.Client.pkg2.pkg1.Class4 event) {
      if (Dev.ZWare.Client.Class1.field_314 == null || !Dev.ZWare.Client.Class1.field_314.method_44()) {
         if (!g()) {
            Dev.ZWare.Client.Class1.field_316.method_523();
            this.method_1586();
         }
      }
   }

   // $VF: renamed from: e () void
   public void method_1586() {
      if (g()) {
         this.field_1033.clear();
      } else {
         Dev.ZWare.Client.Class1.field_316.method_524();

         for (PlayerEntity var2 : c.field_1687.method_18456()) {
            if (var2 != null) {
               UUID var3 = var2.method_5667();
               if (var2.method_6032() > 0.0F) {
                  this.field_1033.remove(var3);
               } else if (this.field_1033.add(var3)) {
                  b.a(new Dev.ZWare.Client.pkg2.pkg1.Class12(var2));
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class17) void
   @iFT13zrx_wTXP
   public void method_1587(Dev.ZWare.Client.pkg2.pkg1.Class17 event) {
      if (Dev.ZWare.Client.Class1.field_314 == null || !Dev.ZWare.Client.Class1.field_314.method_44()) {
         if (!g()) {
            if (event.method_1035() == Dev.ZWare.Client.pkg2.Class2.field_654) {
               Dev.ZWare.Client.Class1.field_308.method_1565();
               Dev.ZWare.Client.Class1.field_298.method_300();
            }

            if (event.method_1035() == Dev.ZWare.Client.pkg2.Class2.POST) {
               Dev.ZWare.Client.Class1.field_298.method_301();
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   public void method_1588(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 event) {
      Dev.ZWare.Client.Class1.field_295.method_1636();
      if (event.method_1045() instanceof WorldTimeUpdateS2CPacket) {
         Dev.ZWare.Client.Class1.field_295.method_1639();
      }

      if (event.method_1045() instanceof CustomPayloadS2CPacket var2) {
         CustomPayloadS2CPacket var10000 = var2;

         try {
            var11 = var10000.comp_1646();
         } catch (Throwable var9) {
            throw new MatchException(var9.toString(), var9);
         }

         if (var11 instanceof BrandCustomPayload var4) {
            BrandCustomPayload var12 = var4;

            try {
               var13 = var12.comp_1677();
            } catch (Throwable var8) {
               throw new MatchException(var8.toString(), var8);
            }

            String var10 = var13;
            Dev.ZWare.Client.Class1.field_295.method_1645(var10);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   public void method_1589(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (Dev.ZWare.Client.Class1.field_314 == null || !Dev.ZWare.Client.Class1.field_314.method_44()) {
         Dev.ZWare.Client.Class1.field_316.method_526(event);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   public void method_1590(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (Dev.ZWare.Client.Class1.field_314 == null || !Dev.ZWare.Client.Class1.field_314.method_44()) {
         Dev.ZWare.Client.Class1.field_316.method_525(event);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class8) void
   @iFT13zrx_wTXP
   public void method_1591(Dev.ZWare.Client.pkg2.pkg1.Class8 event) {
      if (Dev.ZWare.Client.Class1.field_314 != null && Dev.ZWare.Client.Class1.field_314.method_44()) {
         event.a();
      } else {
         if (c.field_1755 == null) {
            String var2 = Dev.ZWare.Client.Class1.field_309.method_1619();
            int var3 = event.method_1044();
            boolean var4 = false;
            if (var2.equals(".") && var3 == 46) {
               var4 = true;
            } else if (var2.equals(",") && var3 == 44) {
               var4 = true;
            } else if (var2.equals(";") && var3 == 59) {
               var4 = true;
            } else if (var2.equals("-") && var3 == 45) {
               var4 = true;
            }

            if (var4) {
               event.a();
               c.method_1507(new ChatScreen(""));
               return;
            }
         }

         if (c.field_1755 == null || c.field_1755 instanceof OyVeyGui) {
            Dev.ZWare.Client.Class1.field_316.method_532(event.method_1044());
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class1) void
   @iFT13zrx_wTXP
   public void method_1592(Dev.ZWare.Client.pkg2.pkg1.Class1 event) {
      if (Dev.ZWare.Client.Class1.field_314 == null || !Dev.ZWare.Client.Class1.field_314.method_44()) {
         if (event.method_1043() == 1) {
            Dev.ZWare.Client.Class1.field_316.method_533(event.method_1042());
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class11) void
   @iFT13zrx_wTXP
   public void method_1593(Dev.ZWare.Client.pkg2.pkg1.Class11 event) {
      if (Dev.ZWare.Client.Class1.field_314 != null && Dev.ZWare.Client.Class1.field_314.method_44()) {
         event.a();
      } else {
         if (event.method_1039().startsWith(Dev.ZWare.Client.features.pkg2.Class1.method_1650())) {
            event.a();

            try {
               if (event.method_1039().length() > 1) {
                  Dev.ZWare.Client.Class1.field_309
                     .method_1614(event.method_1039().substring(Dev.ZWare.Client.features.pkg2.Class1.method_1650().length() - 1));
               } else {
                  Dev.ZWare.Client.features.pkg2.Class1.method_1647("Please enter a command.");
               }
            } catch (Exception var3) {
               var3.printStackTrace();
               Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1061 + "An error occurred while running this command. Check the log!");
            }
         }
      }
   }
}
