package Dev.ZWare.Client.features.pkg1.pkg5;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.util.math.Vec3d;

public class Class5 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_1406 = 3;
   // $VF: renamed from: p int
   private static int field_1407 = -900000;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg1.pkg5.Class5
   private static Class5 field_1408;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1409 = this.a("Self", false);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1410 = this.a("Ignore Friends", false);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class5.Inner1> field_1411 = this.a("Color Mode", Class5.Inner1.Vanilla);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1412 = this.a("Color", 120, 210, 255, 255);
   // $VF: renamed from: v java.util.Set
   private final Set<Integer> field_1413 = new HashSet<>();

   public Class5() {
      super("Death Effects", "zap people when they die or sum", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      field_1408 = this;
      this.field_1412.method_709(var1 -> this.field_1411.method_671() == Class5.Inner1.Custom);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class5
   public static Class5 method_2038() {
      return field_1408;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) void
   public void method_2039(Vec3d pos) {
      if (this.d() && !g() && pos != null) {
         this.method_2044(pos);
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1413.clear();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1413.clear();
   }

   // $VF: renamed from: a (net.minecraft.entity.LightningEntity) boolean
   public boolean method_2040(LightningEntity lightning) {
      return lightning != null && this.field_1413.contains(lightning.method_5628());
   }

   // $VF: renamed from: a () boolean
   public boolean method_2041() {
      return this.d() && this.field_1411.method_671() == Class5.Inner1.Custom;
   }

   // $VF: renamed from: a () java.awt.Color
   public Color method_2042() {
      return this.field_1412.method_671();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2043(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g()) {
         if (var1.method_1045() instanceof EntityStatusS2CPacket var2 && var2.method_11470() == 3) {
            if (var2.method_11469(c.field_1687) instanceof PlayerEntity var4 && !(var4 instanceof Dev.ZWare.Client.pkg1.pkg3.pkg1.Class1)) {
               if (var4 != c.field_1724 || this.field_1409.method_671()) {
                  if (!this.field_1410.method_671() || Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var4)) {
                     this.method_2039(var4.method_19538());
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d) void
   private void method_2044(Vec3d var1) {
      ClientWorld var3 = c.field_1687;
      if (var3 instanceof ClientWorld && var1 != null) {
         int var5 = field_1407--;
         LightningEntity var4 = new LightningEntity(EntityType.field_6112, var3);
         var4.method_5838(var5);
         var4.method_29498(true);
         var4.method_5814(var1.field_1352, var1.field_1351, var1.field_1350);
         this.field_1413.add(var5);
         var3.method_53875(var4);
      }
   }

   public static enum Inner1 {
      Vanilla,
      Custom;
   }
}
