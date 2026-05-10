package Dev.ZWare.Client.features.pkg1.pkg6;

import Dev.ZWare.Client.mixin.Class57;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.Locale;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.OnGroundOnly;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class Class2 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o net.minecraft.util.math.Direction[]
   private static final Direction[] field_2136 = new Direction[]{Direction.field_11043, Direction.field_11035, Direction.field_11034, Direction.field_11039};
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2137 = this.a("Knockback", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2138 = this.a("Explosion", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner1> field_2139 = this.a("Mode", Class2.Inner1.NORMAL);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2140 = this.a("Horizontal", 0.0, 0.0, 100.0);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2141 = this.a("Vertical", 0.0, 0.0, 100.0);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2142 = this.a("Conceal", false);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2143 = this.a("Ground Only", false);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2144 = this.a("Trapped", false);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2145 = this.a("No Push Entities", true);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2146 = this.a("No Push Blocks", true);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2147 = this.a("No Push Liquids", true);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2148 = this.a("No Push Fishhook", true);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2149 = this.a("Living Entity Knockback", true);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2150 = this.a("Sinking", false);
   // $VF: renamed from: D boolean
   private boolean field_2151;
   // $VF: renamed from: E boolean
   private boolean field_2152;
   // $VF: renamed from: F long
   private long field_2153;

   public Class2() {
      super("Disabler", "removes knockback ig", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, true, false, false);
      this.field_2140.method_709(var1 -> this.method_2772());
      this.field_2141.method_709(var1 -> this.method_2772());
      this.field_2143.method_709(var1 -> this.field_2139.method_671() == Class2.Inner1.WALLS);
      this.field_2144.method_709(var1 -> this.field_2139.method_671() == Class2.Inner1.WALLS);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class2
   public static Class2 method_2762() {
      return Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Class2.class) : null;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2151 = false;
      this.field_2152 = false;
      this.field_2153 = 0L;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2770(true);
      this.field_2152 = false;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_2139.method_671() == Class2.Inner1.NORMAL) {
         return String.format(Locale.US, "H:%.1f%%, V:%.1f%%", this.field_2140.method_671(), this.field_2141.method_671());
      } else {
         return switch ((Class2.Inner1)this.field_2139.method_671()) {
            case NORMAL -> "Normal";
            case WALLS -> "Walls";
            case GRIM -> "Grim";
            case GRIM_V3 -> "GrimV3";
         };
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2763(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      this.field_2152 = false;
      this.method_2770(false);
      if (this.field_2150.method_671() && !g()) {
         if (!c.field_1690.field_1903.method_1434() && !c.field_1690.field_1832.method_1434()) {
            if ((c.field_1724.method_5799() || c.field_1724.method_5771()) && c.field_1724.method_18798().field_1351 < 0.0) {
               Vec3d var2 = c.field_1724.method_18798();
               c.field_1724.method_18800(var2.field_1352, 0.0, var2.field_1350);
            }
         }
      }
   }

   // $VF: renamed from: n () void
   public void method_2764() {
      if (!g()) {
         this.field_2153 = System.currentTimeMillis();
         if (this.field_2142.method_671()) {
            this.field_2152 = true;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket, org.spongepowered.asm.mixin.injection.callback.CallbackInfo) void
   public void method_2765(EntityVelocityUpdateS2CPacket packet, CallbackInfo ci) {
      if (!g() && this.field_2137.method_671() && packet.method_11818() == c.field_1724.method_5628()) {
         if (this.field_2152 && this.method_2775(packet)) {
            this.field_2152 = false;
         } else {
            if (this.field_2139.method_671() == Class2.Inner1.WALLS) {
               if (!this.method_2777() && (!this.field_2144.method_671() || !this.method_2776())) {
                  return;
               }

               if (this.field_2143.method_671() && !c.field_1724.method_24828()) {
                  return;
               }
            }

            switch ((Class2.Inner1)this.field_2139.method_671()) {
               case NORMAL:
               case WALLS:
                  if (this.field_2140.method_671() == 0.0 && this.field_2141.method_671() == 0.0) {
                     ci.cancel();
                     return;
                  }

                  Class57 var3 = (Class57)packet;
                  var3.setX((int)Math.round(packet.method_11815() * this.method_2773() * 8000.0));
                  var3.setY((int)Math.round(packet.method_11816() * this.method_2774() * 8000.0));
                  var3.setZ((int)Math.round(packet.method_11819() * this.method_2773() * 8000.0));
                  break;
               case GRIM:
                  if (!this.method_2771()) {
                     return;
                  }

                  ci.cancel();
                  this.field_2151 = true;
                  break;
               case GRIM_V3:
                  if (this.method_2777()) {
                     ci.cancel();
                  }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   public Vec3d method_2766(Vec3d knockback) {
      if (!g() && this.field_2138.method_671()) {
         if (this.field_2139.method_671() == Class2.Inner1.WALLS && !this.method_2777()) {
            return knockback;
         } else {
            return switch ((Class2.Inner1)this.field_2139.method_671()) {
               case NORMAL, WALLS -> this.field_2140.method_671() == 0.0 && this.field_2141.method_671() == 0.0
                  ? null
                  : new Vec3d(knockback.field_1352 * this.method_2773(), knockback.field_1351 * this.method_2774(), knockback.field_1350 * this.method_2773());
               case GRIM -> {
                  if (!this.method_2771()) {
                     yield knockback;
                  } else {
                     this.field_2151 = true;
                     yield null;
                  }
               }
               case GRIM_V3 -> this.method_2777() ? null : knockback;
            };
         }
      } else {
         return knockback;
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket) void
   public void method_2767(EntityDamageS2CPacket packet) {
      if (!g()
         && this.field_2139.method_671() == Class2.Inner1.GRIM_V3
         && packet.comp_1267() == c.field_1724.method_5628()
         && this.method_2777()
         && c.method_1562() != null) {
         c.method_1562().method_52787(new OnGroundOnly(false, c.field_1724.field_5976));
         c.method_1562().method_52787(new OnGroundOnly(true, c.field_1724.field_5976));
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_2768() {
      return this.d() && this.field_2149.method_671() && this.field_2137.method_671() && this.method_2769();
   }

   // $VF: renamed from: b () boolean
   private boolean method_2769() {
      if (g()) {
         return false;
      } else {
         return switch ((Class2.Inner1)this.field_2139.method_671()) {
            case NORMAL, GRIM, GRIM_V3 -> true;
            case WALLS -> this.method_2777() || this.field_2144.method_671() && this.method_2776()
               ? !this.field_2143.method_671() || c.field_1724.method_24828()
               : false;
         };
      }
   }

   // $VF: renamed from: a (boolean) void
   private void method_2770(boolean var1) {
      if (this.field_2151) {
         try {
            if (!g() && this.field_2139.method_671() == Class2.Inner1.GRIM && c.method_1562() != null) {
               float var2 = c.field_1724.method_36454();
               float var3 = c.field_1724.method_36455();
               if (!var1 && Dev.ZWare.Client.Class1.field_298 != null) {
                  var2 = Dev.ZWare.Client.Class1.field_298.field_153;
                  var3 = Dev.ZWare.Client.Class1.field_298.field_154;
               }

               c.method_1562()
                  .method_52787(
                     new Full(
                        c.field_1724.method_23317(),
                        c.field_1724.method_23318(),
                        c.field_1724.method_23321(),
                        var2,
                        var3,
                        c.field_1724.method_24828(),
                        c.field_1724.field_5976
                     )
                  );
               c.method_1562()
                  .method_52787(
                     new PlayerActionC2SPacket(
                        Action.field_12973,
                        c.field_1724.method_20448() ? c.field_1724.method_24515() : c.field_1724.method_24515().method_10084(),
                        Direction.field_11033
                     )
                  );
            }
         } finally {
            this.field_2151 = false;
         }
      }
   }

   // $VF: renamed from: c () boolean
   private boolean method_2771() {
      return System.currentTimeMillis() - this.field_2153 >= 100L;
   }

   // $VF: renamed from: n () boolean
   private boolean method_2772() {
      return this.field_2139.method_671() == Class2.Inner1.NORMAL || this.field_2139.method_671() == Class2.Inner1.WALLS;
   }

   // $VF: renamed from: a () double
   private double method_2773() {
      return this.field_2140.method_671() / 100.0;
   }

   // $VF: renamed from: b () double
   private double method_2774() {
      return this.field_2141.method_671() / 100.0;
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket) boolean
   private boolean method_2775(EntityVelocityUpdateS2CPacket var1) {
      return var1.method_11815() == 0.0 && var1.method_11816() == 0.0 && var1.method_11819() == 0.0;
   }

   // $VF: renamed from: o () boolean
   private boolean method_2776() {
      if (g()) {
         return false;
      } else {
         BlockPos var1 = c.field_1724.method_24515();
         BlockPos var2 = var1.method_10086(c.field_1724.method_20448() ? 1 : 2);
         if (c.field_1687.method_8320(var2).method_45474()) {
            return false;
         } else {
            int var3 = c.field_1724.method_20448() ? 0 : 1;

            for (Direction var7 : field_2136) {
               BlockPos var8 = var1.method_10093(var7).method_10086(var3);
               if (c.field_1687.method_8320(var8).method_45474()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   // $VF: renamed from: p () boolean
   private boolean method_2777() {
      return !g() && (this.method_2779() || this.method_2778());
   }

   // $VF: renamed from: q () boolean
   private boolean method_2778() {
      return !g() && c.field_1687.method_20812(c.field_1724, c.field_1724.method_5829()).iterator().hasNext();
   }

   // $VF: renamed from: r () boolean
   private boolean method_2779() {
      if (g()) {
         return false;
      } else {
         Box var1 = c.field_1724.method_5829().method_1002(0.01, 0.01, 0.01);
         int var2 = (int)Math.floor(var1.field_1323);
         int var3 = (int)Math.floor(var1.field_1320);
         int var4 = (int)Math.floor(var1.field_1322);
         int var5 = (int)Math.floor(var1.field_1325);
         int var6 = (int)Math.floor(var1.field_1321);
         int var7 = (int)Math.floor(var1.field_1324);

         for (int var8 = var2; var8 <= var3; var8++) {
            for (int var9 = var4; var9 <= var5; var9++) {
               for (int var10 = var6; var10 <= var7; var10++) {
                  BlockPos var11 = new BlockPos(var8, var9, var10);
                  if (!c.field_1687.method_8320(var11).method_45474() && !c.field_1687.method_8320(var11).method_26220(c.field_1687, var11).method_1110()) {
                     return true;
                  }
               }
            }
         }

         return false;
      }
   }

   public static enum Inner1 {
      NORMAL,
      WALLS,
      GRIM,
      GRIM_V3;
   }
}
