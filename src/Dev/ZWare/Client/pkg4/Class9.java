package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerPosition;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class9 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c float
   public float field_149;
   // $VF: renamed from: d float
   public float field_150;
   // $VF: renamed from: e float
   public float field_151;
   // $VF: renamed from: f float
   public float field_152;
   // $VF: renamed from: g float
   public float field_153;
   // $VF: renamed from: h float
   public float field_154;
   // $VF: renamed from: i float
   private static float field_155;
   // $VF: renamed from: j float
   private static float field_156;
   // $VF: renamed from: k float
   private static float field_157;
   // $VF: renamed from: l float
   private static float field_158;
   // $VF: renamed from: m float
   private static float field_159;
   // $VF: renamed from: n float
   private static float field_160;
   // $VF: renamed from: o boolean
   public static boolean field_161 = false;
   // $VF: renamed from: p float
   public static float field_162;
   // $VF: renamed from: q net.minecraft.util.math.Vec3d
   public static Vec3d field_163;
   // $VF: renamed from: r boolean
   public static boolean field_164;
   // $VF: renamed from: s double
   public double field_165;
   // $VF: renamed from: t double
   public double field_166;
   // $VF: renamed from: u double
   public double field_167;
   // $VF: renamed from: v float
   private float field_168;
   // $VF: renamed from: w float
   private float field_169;
   // $VF: renamed from: x boolean
   private boolean field_170;
   // $VF: renamed from: y boolean
   private boolean field_171;
   // $VF: renamed from: z int
   private int field_172;
   // $VF: renamed from: A boolean
   private boolean field_173;
   // $VF: renamed from: B float
   private float field_174;
   // $VF: renamed from: C float
   private float field_175;
   // $VF: renamed from: D boolean
   private boolean field_176;
   // $VF: renamed from: E float
   private float field_177;
   // $VF: renamed from: F float
   private float field_178;
   // $VF: renamed from: G int
   private int field_179 = -1;
   // $VF: renamed from: H boolean
   private boolean field_180;
   // $VF: renamed from: I Dev.ZWare.Client.pkg4.Class9$Inner1
   private final Class9.Inner1 field_181 = new Class9.Inner1();

   public Class9() {
      b.a(this);
   }

   // $VF: renamed from: a () void
   public void method_300() {
      if (a.field_1724 != null) {
         this.field_168 = a.field_1724.method_36454();
         this.field_169 = a.field_1724.method_36455();
         this.field_151 = this.field_168;
         this.field_152 = this.field_169;
         this.field_170 = true;
         if (!this.field_171) {
            this.method_359();
         }
      }
   }

   // $VF: renamed from: b () void
   public void method_301() {
      if (a.field_1724 != null && this.field_170) {
         a.field_1724.method_36456(this.field_168);
         a.field_1724.field_6241 = this.field_168;
         a.field_1724.method_36457(this.field_169);
      }
   }

   // $VF: renamed from: a (float, float) void
   public void method_302(float yaw, float pitch) {
      if (a.field_1724 != null) {
         this.field_151 = yaw;
         this.field_152 = pitch;
         this.field_149 = yaw;
         this.field_150 = pitch;
         a.field_1724.method_36456(yaw);
         a.field_1724.field_6241 = yaw;
         a.field_1724.method_36457(pitch);
      }
   }

   // $VF: renamed from: a (float) void
   public void method_303(float yaw) {
      if (a.field_1724 != null) {
         this.field_151 = yaw;
         this.field_149 = yaw;
         a.field_1724.method_36456(yaw);
         a.field_1724.field_6241 = yaw;
      }
   }

   // $VF: renamed from: b (float) void
   public void method_304(float pitch) {
      if (a.field_1724 != null) {
         this.field_152 = pitch;
         this.field_150 = pitch;
         a.field_1724.method_36457(pitch);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   public void method_305(BlockPos pos) {
      if (pos != null) {
         float[] var2 = this.method_332(Vec3d.method_24953(pos));
         this.method_302(var2[0], var2[1]);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) void
   public void method_306(Vec3d vec3d) {
      if (vec3d != null) {
         float[] var2 = this.method_332(vec3d);
         this.method_302(var2[0], var2[1]);
      }
   }

   // $VF: renamed from: a (double, double, double) void
   public void method_307(double x, double y, double z) {
      this.method_306(new Vec3d(x, y, z));
   }

   // $VF: renamed from: a (net.minecraft.entity.Entity) void
   public void method_308(Entity entity) {
      if (entity != null) {
         float[] var2 = this.method_332(entity.method_33571());
         this.method_302(var2[0], var2[1]);
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d) void
   public void method_309(Vec3d target) {
      if (a.field_1724 != null && a.method_1562() != null && target != null) {
         field_163 = target;
         float[] var2 = this.method_332(target);
         this.method_311(var2[0], var2[1]);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, double) boolean
   public boolean method_310(Vec3d target, double priority) {
      if (a.field_1724 == null || a.method_1562() == null || target == null) {
         return false;
      } else if (!this.method_358(priority)) {
         return false;
      } else {
         field_163 = target;
         float[] var4 = this.method_332(target);
         return this.method_312(var4[0], var4[1], priority);
      }
   }

   // $VF: renamed from: b (float, float) void
   public void method_311(float yaw, float pitch) {
      if (a.field_1724 != null && a.method_1562() != null) {
         if (!this.field_171) {
            this.method_359();
         }

         if (this.method_361()) {
            a.method_1562().method_52787(new Full(this.field_165, this.field_166, this.field_167, yaw, pitch, field_164, a.field_1724.field_5976));
         } else {
            a.method_1562().method_52787(new LookAndOnGround(yaw, pitch, field_164, a.field_1724.field_5976));
         }
      }
   }

   // $VF: renamed from: a (float, float, double) boolean
   public boolean method_312(float yaw, float pitch, double priority) {
      if (a.field_1724 == null || a.method_1562() == null) {
         return false;
      } else if (!this.method_358(priority)) {
         return false;
      } else {
         this.method_360();
         this.method_311(yaw, pitch);
         return true;
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d, double) boolean
   public boolean method_313(Vec3d target, double priority) {
      return this.method_314(target, priority, null);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, double, java.lang.Runnable) boolean
   public boolean method_314(Vec3d target, double priority, Runnable callback) {
      if (target == null) {
         return false;
      } else {
         field_163 = target;
         float[] var5 = this.method_332(target);
         return this.method_318(var5[0], var5[1], priority, callback);
      }
   }

   // $VF: renamed from: c (net.minecraft.util.math.Vec3d, double) boolean
   public boolean method_315(Vec3d target, double priority) {
      return this.method_316(target, priority, null);
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d, double, java.lang.Runnable) boolean
   public boolean method_316(Vec3d target, double priority, Runnable callback) {
      if (target == null) {
         return false;
      } else {
         field_163 = target;
         float[] var5 = this.method_332(target);
         return this.method_320(var5[0], var5[1], priority, callback);
      }
   }

   // $VF: renamed from: b (float, float, double) boolean
   public boolean method_317(float yaw, float pitch, double priority) {
      return this.method_318(yaw, pitch, priority, null);
   }

   // $VF: renamed from: a (float, float, double, java.lang.Runnable) boolean
   public boolean method_318(float yaw, float pitch, double priority, Runnable callback) {
      return this.method_328(yaw, pitch, priority, callback, false);
   }

   // $VF: renamed from: c (float, float, double) boolean
   public boolean method_319(float yaw, float pitch, double priority) {
      return this.method_320(yaw, pitch, priority, null);
   }

   // $VF: renamed from: b (float, float, double, java.lang.Runnable) boolean
   public boolean method_320(float yaw, float pitch, double priority, Runnable callback) {
      return this.method_328(yaw, pitch, priority, callback, true);
   }

   // $VF: renamed from: a (float, double) boolean
   public boolean method_321(float yaw, double priority) {
      return this.method_322(yaw, priority, null);
   }

   // $VF: renamed from: a (float, double, java.lang.Runnable) boolean
   public boolean method_322(float yaw, double priority, Runnable callback) {
      float var5 = this.method_370();
      return this.method_330(yaw, var5, priority, callback, true, false, false);
   }

   // $VF: renamed from: b (float, double) boolean
   public boolean method_323(float pitch, double priority) {
      return this.method_324(pitch, priority, null);
   }

   // $VF: renamed from: b (float, double, java.lang.Runnable) boolean
   public boolean method_324(float pitch, double priority, Runnable callback) {
      float var5 = this.method_369();
      return this.method_330(var5, pitch, priority, callback, true, false, true);
   }

   // $VF: renamed from: d (float, float, double) boolean
   public boolean method_325(float yaw, float pitch, double priority) {
      return this.method_326(yaw, pitch, priority, null);
   }

   // $VF: renamed from: c (float, float, double, java.lang.Runnable) boolean
   public boolean method_326(float yaw, float pitch, double priority, Runnable callback) {
      return this.method_329(yaw, pitch, priority, callback, true, true);
   }

   // $VF: renamed from: a () boolean
   public boolean method_327() {
      if (!this.field_181.field_63 || this.field_181.field_61 || this.field_181.field_58 == Double.NEGATIVE_INFINITY) {
         return false;
      } else {
         return !this.method_357() ? false : this.method_364();
      }
   }

   // $VF: renamed from: a (float, float, double, java.lang.Runnable, boolean) boolean
   private boolean method_328(float var1, float var2, double var3, Runnable var5, boolean var6) {
      return this.method_329(var1, var2, var3, var5, var6, false);
   }

   // $VF: renamed from: a (float, float, double, java.lang.Runnable, boolean, boolean) boolean
   private boolean method_329(float var1, float var2, double var3, Runnable var5, boolean var6, boolean var7) {
      return this.method_330(var1, var2, var3, var5, var6, var7, true);
   }

   // $VF: renamed from: a (float, float, double, java.lang.Runnable, boolean, boolean, boolean) boolean
   private boolean method_330(float var1, float var2, double var3, Runnable var5, boolean var6, boolean var7, boolean var8) {
      if (this.field_181.field_58 > var3 && !this.field_181.field_61) {
         return false;
      } else {
         this.field_181.field_61 = false;
         this.field_181.field_62 = false;
         this.field_181.field_59 = MathHelper.method_15393(var1);
         this.field_181.field_60 = MathHelper.method_15363(var2, -90.0F, 90.0F);
         this.field_181.field_58 = var3;
         this.field_181.field_66 = var5;
         this.field_181.field_63 = var6;
         this.field_181.field_64 = var7;
         this.field_181.field_65 = var8;
         return true;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Vec3d) float[]
   public float[] method_331(Vec3d eyesPos, Vec3d vec) {
      double var3 = vec.field_1352 - eyesPos.field_1352;
      double var5 = vec.field_1351 - eyesPos.field_1351;
      double var7 = vec.field_1350 - eyesPos.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new float[]{MathHelper.method_15393(var11), MathHelper.method_15393(var12)};
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) float[]
   public float[] method_332(Vec3d vec) {
      return a.field_1724 == null ? new float[]{0.0F, 0.0F} : this.method_331(a.field_1724.method_33571(), vec);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box) boolean
   public boolean method_333(Box box) {
      return this.method_334(this.field_153, this.field_154, box);
   }

   // $VF: renamed from: a (float, float, net.minecraft.util.math.Box) boolean
   public boolean method_334(float yaw, float pitch, Box box) {
      return a.field_1724 != null && box != null ? this.method_341(a.field_1724.method_33571(), yaw, pitch, box) : false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class17) void
   @iFT13zrx_wTXP(
      a = -200
   )
   private void method_335(Dev.ZWare.Client.pkg2.pkg1.Class17 var1) {
      if (a.field_1724 != null) {
         if (var1.method_1035() == Dev.ZWare.Client.pkg2.Class2.field_654) {
            if (this.method_357()) {
               if (!this.field_181.field_63) {
                  this.method_364();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner2) void
   @iFT13zrx_wTXP(
      a = -200
   )
   private void method_336(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2 var1) {
      if (a.field_1724 != null) {
         if (this.method_357()) {
            if (this.field_181.field_63 && !this.field_181.field_61) {
               this.method_364();
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_337(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var1) {
      if (a.field_1724 != null && !var1.method_1023()) {
         if (var1.method_1045() instanceof PlayerMoveC2SPacket var2) {
            if (var2.method_36172()) {
               this.field_153 = var2.method_12271(this.field_153);
               if (field_161) {
                  field_161 = false;
                  this.field_153 = field_162;
               }

               this.field_154 = var2.method_12270(this.field_154);
               this.method_342(this.field_153, this.field_154, false);
            }

            if (var2.method_36171()) {
               this.field_165 = var2.method_12269(this.field_165);
               this.field_166 = var2.method_12268(this.field_166);
               this.field_167 = var2.method_12274(this.field_167);
            }

            field_164 = var2.method_12273();
            this.field_171 = true;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_338(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (a.field_1724 != null) {
         if (var1.method_1045() instanceof PlayerPositionLookS2CPacket var2) {
            if (!this.field_171) {
               this.method_359();
            }

            PlayerPosition var8 = var2.comp_3228();
            Set var4 = var2.comp_3229();
            Dev.ZWare.Client.features.pkg1.pkg6.Class5 var5 = Dev.ZWare.Client.features.pkg1.pkg6.Class5.method_1957();
            if (var5 != null && var5.method_1958()) {
               var8 = new PlayerPosition(var8.comp_3148(), var8.comp_3149(), a.field_1724.method_36454(), a.field_1724.method_36455());
               var4 = this.method_339(var4);
            }

            PlayerPosition var6 = new PlayerPosition(
               new Vec3d(this.field_165, this.field_166, this.field_167), Vec3d.field_1353, this.field_153, this.field_154
            );
            PlayerPosition var7 = PlayerPosition.method_63639(var6, var8, var4);
            this.field_165 = var7.comp_3148().field_1352;
            this.field_166 = var7.comp_3148().field_1351;
            this.field_167 = var7.comp_3148().field_1350;
            this.field_153 = var7.comp_3150();
            this.field_154 = var7.comp_3151();
            this.field_171 = true;
            this.method_342(this.field_153, this.field_154, true);
         }
      }
   }

   // $VF: renamed from: a (java.util.Set) java.util.Set
   private Set<PositionFlag> method_339(Set<PositionFlag> var1) {
      EnumSet var2 = EnumSet.noneOf(PositionFlag.class);
      var2.addAll(var1);
      var2.remove(PositionFlag.field_12401);
      var2.remove(PositionFlag.field_12397);
      return var2;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner1) void
   @iFT13zrx_wTXP
   private void method_340(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner1 var1) {
      if (this.field_181.field_58 != Double.NEGATIVE_INFINITY) {
         if (this.field_181.field_62) {
            this.method_342(this.field_153, this.field_154, false);
         }

         this.field_176 = false;
         this.field_173 = false;
         if (this.field_181.field_61) {
            this.method_360();
         } else {
            this.field_181.field_62 = false;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, double, double, net.minecraft.util.math.Box) boolean
   public boolean method_341(Vec3d pos, double yaw, double pitch, Box box) {
      Vec3d var7 = new Vec3d(
         Math.cos(Math.toRadians(yaw + 90.0)) * Math.abs(Math.cos(Math.toRadians(pitch))),
         -Math.sin(Math.toRadians(pitch)),
         Math.sin(Math.toRadians(yaw + 90.0)) * Math.abs(Math.cos(Math.toRadians(pitch)))
      );
      double var8 = var7.field_1352 != 0.0 ? 1.0 / var7.field_1352 : 1.0E10;
      double var10 = var7.field_1351 != 0.0 ? 1.0 / var7.field_1351 : 1.0E10;
      double var12 = var7.field_1350 != 0.0 ? 1.0 / var7.field_1350 : 1.0E10;
      double var14 = (box.field_1323 - pos.field_1352) * var8;
      double var16 = (box.field_1320 - pos.field_1352) * var8;
      if (var14 > var16) {
         double var18 = var14;
         var14 = var16;
         var16 = var18;
      }

      double var30 = (box.field_1322 - pos.field_1351) * var10;
      double var20 = (box.field_1325 - pos.field_1351) * var10;
      if (var30 > var20) {
         double var22 = var30;
         var30 = var20;
         var20 = var22;
      }

      double var31 = (box.field_1321 - pos.field_1350) * var12;
      double var24 = (box.field_1324 - pos.field_1350) * var12;
      if (var31 > var24) {
         double var26 = var31;
         var31 = var24;
         var24 = var26;
      }

      double var32 = Math.max(Math.max(var14, var30), var31);
      double var28 = Math.min(Math.min(var16, var20), var24);
      return var28 >= 0.0 && var32 <= var28;
   }

   // $VF: renamed from: a (float, float, boolean) void
   public void method_342(float yaw, float pitch, boolean force) {
      if (a.field_1724 != null) {
         if (a.field_1724.field_6012 != this.field_172 || force) {
            this.field_172 = a.field_1724.field_6012;
            field_157 = field_155;
            field_158 = field_156;
            field_156 = this.method_375(yaw, field_158);
            field_159 = field_160;
            field_160 = yaw;
            field_155 = pitch;
         }
      }
   }

   // $VF: renamed from: a () float
   public static float method_343() {
      return field_155;
   }

   // $VF: renamed from: b () float
   public static float method_344() {
      return field_160;
   }

   // $VF: renamed from: c () float
   public static float method_345() {
      return field_156;
   }

   // $VF: renamed from: d () float
   public static float method_346() {
      return field_157;
   }

   // $VF: renamed from: e () float
   public static float method_347() {
      return field_159;
   }

   // $VF: renamed from: f () float
   public static float method_348() {
      return field_158;
   }

   // $VF: renamed from: a (int) boolean
   public boolean method_349(int playerAge) {
      return this.field_179 == playerAge;
   }

   // $VF: renamed from: b (int) boolean
   public boolean method_350(int playerAge) {
      return this.method_349(playerAge) && this.field_180;
   }

   // $VF: renamed from: g () float
   public float method_351() {
      return this.field_168;
   }

   // $VF: renamed from: c (float) void
   public void method_352(float yaw) {
      this.field_168 = yaw;
   }

   // $VF: renamed from: h () float
   public float method_353() {
      return this.field_169;
   }

   // $VF: renamed from: d (float) void
   public void method_354(float pitch) {
      this.field_169 = pitch;
   }

   // $VF: renamed from: i () float
   public float method_355() {
      return this.method_371();
   }

   // $VF: renamed from: j () float
   public float method_356() {
      return this.method_372();
   }

   // $VF: renamed from: b () boolean
   private boolean method_357() {
      if (!this.field_171) {
         this.method_359();
      }

      if (this.field_181.field_61) {
         return false;
      } else if (this.field_181.field_63) {
         return true;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = this.method_362();
         if (var1 != null) {
            return var1.method_3370();
         } else {
            Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = this.method_363();
            return var2 == null || var2.method_3101();
         }
      }
   }

   // $VF: renamed from: a (double) boolean
   private boolean method_358(double var1) {
      return this.field_181.field_61 || this.field_181.field_58 <= var1;
   }

   // $VF: renamed from: c () void
   private void method_359() {
      if (a.field_1724 != null) {
         this.field_153 = a.field_1724.method_36454();
         this.field_154 = a.field_1724.method_36455();
         this.field_165 = a.field_1724.method_23317();
         this.field_166 = a.field_1724.method_23318();
         this.field_167 = a.field_1724.method_23321();
         field_164 = a.field_1724.method_24828();
         this.field_171 = true;
      }
   }

   // $VF: renamed from: d () void
   private void method_360() {
      this.field_181.field_58 = Double.NEGATIVE_INFINITY;
      this.field_181.field_59 = 0.0F;
      this.field_181.field_60 = 0.0F;
      this.field_181.field_61 = false;
      this.field_181.field_62 = false;
      this.field_181.field_66 = null;
      this.field_181.field_63 = false;
      this.field_181.field_64 = false;
      this.field_181.field_65 = true;
      this.field_176 = false;
      this.field_173 = false;
   }

   // $VF: renamed from: c () boolean
   private boolean method_361() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = this.method_362();
      if (var1 != null) {
         return var1.method_3371();
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = this.method_363();
         return var2 == null || var2.method_3104();
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class7
   private Dev.ZWare.Client.features.pkg1.pkg4.Class7 method_362() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class7.class);
         if (var1 != null) {
            return var1;
         }
      }

      return Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3369();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class9
   private Dev.ZWare.Client.features.pkg1.pkg4.Class9 method_363() {
      return Dev.ZWare.Client.Class1.field_316 != null
         ? Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class9.class)
         : Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3092();
   }

   // $VF: renamed from: d () boolean
   private boolean method_364() {
      if (a.field_1724 == null) {
         return false;
      } else {
         float var1 = this.field_181.field_59;
         float var2 = this.field_181.field_60;
         Dev.ZWare.Client.features.pkg1.pkg4.Class7 var3 = this.method_362();
         if (!this.field_181.field_64 && var3 != null && var3.method_3373()) {
            var1 = this.method_373(this.field_153, this.field_181.field_59, var3.method_3374());
            var2 = this.method_374(this.field_154, this.field_181.field_60, var3.method_3375());
         }

         boolean var4 = this.field_181.field_63 && this.method_367();
         if (var4) {
            this.method_365(var1, var2, this.field_181.field_65);
         }

         this.method_366(var1, var2);
         this.method_302(var1, var2);
         this.field_181.field_62 = true;
         this.field_181.field_61 = this.method_368(var1, var2, this.field_181.field_59, this.field_181.field_60);
         if (this.field_181.field_61 && this.field_181.field_66 != null) {
            this.field_181.field_66.run();
         }

         return true;
      }
   }

   // $VF: renamed from: b (float, float, boolean) void
   private void method_365(float var1, float var2, boolean var3) {
      this.field_151 = var1;
      this.field_152 = var2;
      this.field_149 = var1;
      this.field_150 = var2;
      this.field_174 = var1;
      this.field_175 = var2;
      this.field_173 = true;
      this.field_179 = a.field_1724 != null ? a.field_1724.field_6012 : -1;
      this.field_180 = var3;
      this.method_342(var1, var2, true);
   }

   // $VF: renamed from: c (float, float) void
   private void method_366(float var1, float var2) {
      this.field_177 = var1;
      this.field_178 = var2;
      this.field_176 = true;
   }

   // $VF: renamed from: e () boolean
   private boolean method_367() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = this.method_362();
      if (var1 != null) {
         return var1.method_3372();
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = this.method_363();
         return var2 != null && var2.method_3105();
      }
   }

   // $VF: renamed from: a (float, float, float, float) boolean
   private boolean method_368(float var1, float var2, float var3, float var4) {
      return Math.abs(MathHelper.method_15393(var3 - var1)) <= 0.01F && Math.abs(var4 - var2) <= 0.01F;
   }

   // $VF: renamed from: k () float
   private float method_369() {
      return !this.field_181.field_61 && this.field_181.field_58 != Double.NEGATIVE_INFINITY ? this.field_181.field_59 : this.method_371();
   }

   // $VF: renamed from: l () float
   private float method_370() {
      return !this.field_181.field_61 && this.field_181.field_58 != Double.NEGATIVE_INFINITY ? this.field_181.field_60 : this.method_372();
   }

   // $VF: renamed from: m () float
   private float method_371() {
      if (!this.field_171) {
         this.method_359();
      }

      if (this.field_176) {
         return this.field_177;
      } else if (a.field_1724 == null) {
         return this.field_153;
      } else {
         return this.field_171 ? this.field_153 : a.field_1724.method_36454();
      }
   }

   // $VF: renamed from: n () float
   private float method_372() {
      if (!this.field_171) {
         this.method_359();
      }

      if (this.field_176) {
         return this.field_178;
      } else if (a.field_1724 == null) {
         return this.field_154;
      } else {
         return this.field_171 ? this.field_154 : a.field_1724.method_36455();
      }
   }

   // $VF: renamed from: a (float, float, float) float
   private float method_373(float var1, float var2, float var3) {
      float var4 = MathHelper.method_15393(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      } else if (var4 < -var3) {
         var4 = -var3;
      }

      return MathHelper.method_15393(var1 + var4);
   }

   // $VF: renamed from: b (float, float, float) float
   private float method_374(float var1, float var2, float var3) {
      float var4 = var2 - var1;
      if (var4 > var3) {
         var4 = var3;
      } else if (var4 < -var3) {
         var4 = -var3;
      }

      return MathHelper.method_15363(var1 + var4, -90.0F, 90.0F);
   }

   // $VF: renamed from: a (float, float) float
   private float method_375(float var1, float var2) {
      if (a.field_1724 == null) {
         return var2;
      } else {
         float var3 = var2;
         double var4 = a.field_1724.method_23317() - a.field_1724.field_6014;
         double var6 = a.field_1724.method_23321() - a.field_1724.field_5969;
         if (var4 * var4 + var6 * var6 > 0.0025000002F) {
            float var8 = (float)MathHelper.method_15349(var6, var4) * (180.0F / (float)Math.PI) - 90.0F;
            float var9 = MathHelper.method_15379(MathHelper.method_15393(var1) - var8);
            var3 = 95.0F < var9 && var9 < 265.0F ? var8 - 180.0F : var8;
         }

         if (a.field_1724.field_6251 > 0.0F) {
            var3 = var1;
         }

         var3 = var2 + MathHelper.method_15393(var3 - var2) * 0.3F;
         float var12 = MathHelper.method_15393(var1 - var3);
         if (var12 < -75.0F) {
            var12 = -75.0F;
         } else if (var12 >= 75.0F) {
            var12 = 75.0F;
         }

         var3 = var1 - var12;
         if (var12 * var12 > 2500.0F) {
            var3 += var12 * 0.2F;
         }

         return var3;
      }
   }

   public static class Inner1 {
      // $VF: renamed from: a double
      public double field_58 = Double.NEGATIVE_INFINITY;
      // $VF: renamed from: b float
      public float field_59;
      // $VF: renamed from: c float
      public float field_60;
      // $VF: renamed from: d boolean
      public boolean field_61;
      // $VF: renamed from: e boolean
      public boolean field_62;
      // $VF: renamed from: f boolean
      public boolean field_63;
      // $VF: renamed from: g boolean
      public boolean field_64;
      // $VF: renamed from: h boolean
      public boolean field_65 = true;
      // $VF: renamed from: i java.lang.Runnable
      public Runnable field_66;
   }
}
