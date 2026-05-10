package Dev.ZWare.Client.features.pkg1.pkg7;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import net.minecraft.entity.EntityType;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.util.Formatting;

public class Class2 extends Dev.ZWare.Client.features.pkg1.pkg4.Class11 {
   // $VF: renamed from: F long
   private static final long field_2998 = 1000L;
   // $VF: renamed from: G java.lang.String[]
   private static final String[] field_2999 = new String[]{"Potions", "TPS", "Ping", "FPS", "Speed", "EyeRange", "CPS"};
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3000 = this.a("Label", true);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_3001 = this.a("Precise", false);
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner1> field_3002 = this.a("Mode", Class2.Inner1.SPAWN);
   // $VF: renamed from: K java.util.Deque
   private final Deque<Long> field_3003 = new ArrayDeque<>();

   public Class2() {
      super("CPS", "Displays current crystals per second. Warning: works for all matching entities in range.", 100.0F, 10.0F);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 e) {
      double var2 = this.method_3723();
      String var4 = (this.field_3000.method_671() ? Dev.ZWare.Client.pkg1.Class6.method_200("cps") + " " : "") + Formatting.field_1068 + this.method_3724(var2);
      int var5 = Dev.ZWare.Client.Class1.field_296 != null ? Dev.ZWare.Client.Class1.field_296.method_499() : -1;
      float var6 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var4);
      this.a(var6, Dev.ZWare.Client.pkg1.pkg2.Class1.method_134(), field_2999);
      super.method_3643(e);
      this.a(e.method_1053(), "cps", var4, this.a(var6), this.f(), var5);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3720(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g() && this.field_3002.method_671() == Class2.Inner1.SPAWN) {
         if (var1.method_1045() instanceof EntitySpawnS2CPacket var2 && var2.method_11169() == EntityType.field_6110) {
            this.method_3722();
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_3721(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g() && this.field_3002.method_671() == Class2.Inner1.EXPLOSION) {
         if (var1.method_1045() instanceof ExplosionS2CPacket) {
            this.method_3722();
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_3722() {
      long var1 = System.currentTimeMillis();
      this.field_3003.addLast(var1);

      while (!this.field_3003.isEmpty() && var1 - this.field_3003.peekFirst() > 1000L) {
         this.field_3003.removeFirst();
      }
   }

   // $VF: renamed from: a () double
   private double method_3723() {
      long var1 = System.currentTimeMillis();

      while (!this.field_3003.isEmpty() && var1 - this.field_3003.peekFirst() > 1000L) {
         this.field_3003.removeFirst();
      }

      return this.field_3003.size();
   }

   // $VF: renamed from: a (double) java.lang.String
   private String method_3724(double var1) {
      return String.format(Locale.US, this.field_3001.method_671() ? "%.2f" : "%.0f", var1);
   }

   private static enum Inner1 {
      SPAWN,
      EXPLOSION;
   }
}
