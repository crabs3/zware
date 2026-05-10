package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.InteractType;

public class Class5 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg1.pkg7.Class5$Inner1
   private static final Class5.Inner1 field_3077 = new Class5.Inner1();

   public Class5() {
      super("MapsBroken", "Displays item frames you broke this launch.", 120.0F, 10.0F);
      field_3077.method_811();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      super.method_3643(e);
      if (!g()) {
         int var2 = field_3077.method_812();
         String var3 = String.format("Frames Broken: %,d", var2);
         float var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var3);
         this.a(var4, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134());
         this.a(e.method_1053(), "frames-broken", var3, this.a(var4), this.f(), -1);
      }
   }

   static final class Inner1 {
      // $VF: renamed from: a long
      static final long field_405 = 2000L;
      // $VF: renamed from: b java.util.Map
      private final Map<Integer, Class5.Inner2> field_406 = new HashMap<>();
      // $VF: renamed from: c boolean
      private boolean field_407;
      // $VF: renamed from: d int
      private int field_408;

      // $VF: renamed from: a () void
      void method_811() {
         if (!this.field_407) {
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(this);
            this.field_407 = true;
         }
      }

      // $VF: renamed from: a () int
      int method_812() {
         return this.field_408;
      }

      // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner2) void
      @iFT13zrx_wTXP
      private void method_813(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner2 var1) {
         if (Dev.ZWare.Client.features.Class1.field_1019.field_1687 != null) {
            if (var1.method_1045() instanceof PlayerInteractEntityC2SPacket var2) {
               if (var2.field_12871.method_34211() == InteractType.field_29172) {
                  if (Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8469(var2.field_12870) instanceof ItemFrameEntity var4) {
                     Class5.Inner2 var5 = this.field_406.computeIfAbsent(var4.method_5628(), var0 -> new Class5.Inner2());
                     var5.field_255++;
                     var5.field_257 = var5.field_257 | var4.method_6940().method_7960();
                     var5.field_256 = System.currentTimeMillis();
                  }
               }
            }
         }
      }

      // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
      @iFT13zrx_wTXP
      private void method_814(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
         if (Dev.ZWare.Client.features.Class1.field_1019.field_1687 == null) {
            this.field_406.clear();
         } else {
            long var2 = System.currentTimeMillis();
            Iterator var4 = this.field_406.entrySet().iterator();

            while (var4.hasNext()) {
               Entry var5 = (Entry)var4.next();
               Class5.Inner2 var6 = (Class5.Inner2)var5.getValue();
               Entity var7 = Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8469((Integer)var5.getKey());
               if (var7 instanceof ItemFrameEntity) {
                  if (var2 - var6.field_256 > 2000L) {
                     var4.remove();
                  }
               } else {
                  if (var6.method_486(var2)) {
                     this.field_408++;
                  }

                  var4.remove();
               }
            }
         }
      }
   }

   static final class Inner2 {
      // $VF: renamed from: a int
      int field_255;
      // $VF: renamed from: b long
      long field_256;
      // $VF: renamed from: c boolean
      boolean field_257;

      // $VF: renamed from: a (long) boolean
      boolean method_486(long var1) {
         return var1 - this.field_256 > 2000L ? false : this.field_257 || this.field_255 >= 2;
      }
   }
}
