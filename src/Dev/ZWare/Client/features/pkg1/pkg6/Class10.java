package Dev.ZWare.Client.features.pkg1.pkg6;

import Dev.ZWare.Client.pkg1.Class15;
import Dev.ZWare.Client.pkg1.Class22;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.chunk.WorldChunk;
import yjShPPDAnoIeH9iXltdEPQeqqrYnT7_7.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.Xlu_QQhuYSJKCAAAJAHWZ2gxAwCJr;

public class Class10 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2897 = 40.0;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2898 = this.a("Max Trail Length", 20, 1, 100).method_683("General");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2899 = this.a("Chunks Before Starting", 10, 1, 50).method_683("General");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2900 = this.a("Chunk Timeframe", 5, 1, 20).method_683("General");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class10.Inner1> field_2901 = this.a("Trail End Behavior", Class10.Inner1.Disable).method_683("General");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2902 = this.a("Trail End Yaw", 0.0, 0.0, 359.9).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2903 = this.a("Rotate Scaling", 0.1, 0.0, 1.0).method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2904 = this.a("Follow Only 1.12", false).method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_2905 = this.a("Webhook Link", "").method_683("General");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2906 = this.a("Path Distance", 500.0, 100.0, 2000.0).method_683("Advanced");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2907 = this.a("Start Direction Weight", 0.5, 0.0, 1.0).method_683("Advanced");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class10.Inner2> field_2908 = this.a("Direction Weighting", Class10.Inner2.None).method_683("Advanced");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2909 = this.a("Direction Weight Multiplier", 2, 2, 10).method_683("Advanced");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2910 = this.a("Chunk Found Timeout", 5000.0, 1000.0, 10000.0).method_683("Advanced");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2911 = this.a("Circling Degrees Per Tick", 2.0, 1.0, 20.0).method_683("Advanced");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2912 = this.a("Trail Timeout", 30000.0, 10000.0, 60000.0).method_683("Advanced");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2913 = this.a("Max Trail Deviation", 180.0, 1.0, 270.0).method_683("Advanced");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2914 = this.a("Auto Rocket", true).method_683("Flight");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2915 = this.a("Rocket Cooldown", 1500.0, 250.0, 10000.0).method_683("Flight");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2916 = this.a("Min Horizontal Speed", 1.0, 0.1, 5.0).method_683("Flight");
   // $VF: renamed from: I boolean
   private boolean field_2917;
   // $VF: renamed from: J java.util.ArrayDeque
   private final ArrayDeque<Vec3d> field_2918 = new ArrayDeque<>();
   // $VF: renamed from: K java.util.ArrayDeque
   private final ArrayDeque<Vec3d> field_2919 = new ArrayDeque<>();
   // $VF: renamed from: L java.util.Set
   private final Set<Long> field_2920 = new HashSet<>();
   // $VF: renamed from: M long
   private long field_2921;
   // $VF: renamed from: N long
   private long field_2922;
   // $VF: renamed from: O long
   private long field_2923;
   // $VF: renamed from: P float
   private float field_2924;

   public Class10() {
      super(
         "Trail Follower",
         "Follows XaeroPlus trail chunks and boosts with elytra rockets.",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT,
         true,
         false,
         false
      );
      this.field_2902.method_709(var1 -> this.field_2901.method_671() == Class10.Inner1.FlyTowardsYaw);
      this.field_2909.method_709(var1 -> this.field_2908.method_671() != Class10.Inner2.None);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      if (g()) {
         this.k();
      } else if (Class15.method_862() && Class15.method_863(this)) {
         this.method_3626();
         this.method_3612();
         this.field_2924 = this.method_3625(c.field_1724.method_36454());
      } else {
         this.method_3628("XaeroPlus chunk events are required.");
         this.k();
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      Class15.method_864(this);
      this.method_3626();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_2917) {
         return "Following";
      } else {
         return this.field_2919.isEmpty() ? "Idle" : "Scanning";
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_3610(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (!g()) {
         long var2 = System.currentTimeMillis();
         if (this.field_2917 && var2 - this.field_2921 > this.field_2912.method_671()) {
            this.field_2917 = false;
            this.field_2918.clear();
            this.field_2919.clear();
            this.method_3627("Trail timed out, stopping.");
            switch ((Class10.Inner1)this.field_2901.method_671()) {
               case Disable:
                  this.k();
                  return;
               case FlyTowardsYaw:
                  this.field_2924 = this.method_3625(this.field_2902.method_671().floatValue());
            }
         }

         if (this.field_2917 && var2 - this.field_2921 > this.field_2910.method_671().longValue()) {
            this.method_3615();
            this.method_3618(var2);
         } else {
            this.method_3616(this.field_2924);
            this.method_3618(var2);
         }
      }
   }

   // $VF: renamed from: a (java.lang.Object) void
   @Xlu_QQhuYSJKCAAAJAHWZ2gxAwCJr(
      a = -1
   )
   public void method_3611(Object rawEvent) {
      if (!g() && Class15.method_865(rawEvent) && !Class15.method_866(rawEvent)) {
         WorldChunk var2 = Class15.method_867(rawEvent);
         if (var2 != null) {
            RegistryKey var3 = c.field_1687.method_27983();
            ChunkPos var4 = var2.method_12004();
            long var5 = var4.method_8324() ^ var3.method_29177().hashCode();
            if (this.field_2920.add(var5)) {
               if (this.method_3620(var4, var3)) {
                  Vec3d var7 = new Vec3d(var4.method_8326() + 8.0, c.field_1724.method_23318(), var4.method_8328() + 8.0);
                  long var8 = System.currentTimeMillis();
                  if (!this.field_2917) {
                     if (var8 - this.field_2922 > this.field_2900.method_671().intValue() * 1000L) {
                        this.field_2919.clear();
                     }

                     this.field_2919.addLast(var7);
                     this.field_2922 = var8;
                     if (this.field_2919.size() >= this.field_2899.method_671()) {
                        this.field_2917 = true;
                        this.field_2921 = var8;
                        this.field_2918.addAll(this.field_2919);
                        this.field_2919.clear();
                        this.method_3614();
                        this.method_3627("Trail found, starting to follow.");
                     }
                  } else {
                     double var10 = this.method_3623(var7);
                     double var12 = this.method_3624(this.field_2924, var10);
                     if (!(Math.abs(var12) > this.field_2913.method_671())) {
                        this.field_2921 = var8;

                        while (this.field_2918.size() >= this.field_2898.method_671()) {
                           this.field_2918.pollFirst();
                        }

                        int var14 = Math.max(1, Math.min(this.field_2909.method_671(), this.field_2898.method_671()));
                        if (var12 > 0.0 && var12 < 90.0 && this.field_2908.method_671() == Class10.Inner2.Left) {
                           this.method_3613(var7, var14);
                        } else if (var12 < 0.0 && var12 > -90.0 && this.field_2908.method_671() == Class10.Inner2.Right) {
                           this.method_3613(var7, var14);
                        } else {
                           this.field_2918.addLast(var7);
                        }

                        this.method_3614();
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_3612() {
      if (c.field_1724 != null) {
         int var1 = MathHelper.method_15340(
            (int)Math.round(this.field_2898.method_671().intValue() * this.field_2907.method_671()), 0, this.field_2898.method_671()
         );
         if (var1 > 0) {
            Vec3d var2 = this.method_3622(c.field_1724.method_19538(), c.field_1724.method_36454(), this.field_2906.method_671());

            for (int var3 = 0; var3 < var1; var3++) {
               this.field_2918.addLast(var2);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, int) void
   private void method_3613(Vec3d var1, int var2) {
      for (int var3 = 0; var3 < var2 - 1; var3++) {
         if (!this.field_2918.isEmpty()) {
            this.field_2918.pollFirst();
         }

         this.field_2918.addLast(var1);
      }

      this.field_2918.addLast(var1);
   }

   // $VF: renamed from: o () void
   private void method_3614() {
      if (!this.field_2918.isEmpty() && c.field_1724 != null) {
         Vec3d var1 = this.method_3621(this.field_2918);
         Vec3d var2 = var1.method_1020(c.field_1724.method_19538());
         if (!(var2.method_1027() < 1.0E-6)) {
            Vec3d var3 = c.field_1724.method_19538().method_1019(var2.method_1029().method_1021(10.0));
            this.field_2924 = this.method_3625((float)this.method_3623(var3));
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_3615() {
      if (c.field_1724 != null) {
         this.field_2924 = this.method_3625(c.field_1724.method_36454() + this.field_2911.method_671().floatValue());
         this.method_3617(this.field_2924);
      }
   }

   // $VF: renamed from: a (float) void
   private void method_3616(float var1) {
      if (c.field_1724 != null) {
         float var2 = c.field_1724.method_36454();
         float var3 = MathHelper.method_15363(this.field_2903.method_671().floatValue(), 0.0F, 1.0F);
         float var4 = MathHelper.method_15393(var1 - var2);
         float var5 = var3 >= 1.0F ? var1 : this.method_3625(var2 + var4 * var3);
         this.method_3617(var5);
      }
   }

   // $VF: renamed from: b (float) void
   private void method_3617(float var1) {
      c.field_1724.method_36456(var1);
      c.field_1724.field_6241 = var1;
      if (Dev.ZWare.Client.Class1.field_298 != null) {
         Dev.ZWare.Client.Class1.field_298
            .method_321(MathHelper.method_15393(var1), Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("TrailFollower", 40.0));
      }
   }

   // $VF: renamed from: a (long) void
   private void method_3618(long var1) {
      if (this.field_2914.method_671() && c.field_1724 != null && c.field_1687 != null && c.field_1724.method_6128()) {
         if (!(var1 - this.field_2923 < this.field_2915.method_671())) {
            if (!this.method_3619()) {
               Vec3d var3 = c.field_1724.method_18798();
               double var4 = Math.hypot(var3.field_1352, var3.field_1350);
               if (!(var4 >= this.field_2916.method_671())) {
                  if (Class6.method_3031(true, c.field_1724.method_36454(), c.field_1724.method_36455())) {
                     this.field_2923 = var1;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_3619() {
      if (c.field_1687 != null && c.field_1724 != null) {
         for (Entity var2 : c.field_1687.method_18112()) {
            if (var2 instanceof FireworkRocketEntity var3 && c.field_1724.equals(var3.method_24921())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.ChunkPos, net.minecraft.registry.RegistryKey) boolean
   private boolean method_3620(ChunkPos var1, RegistryKey<World> var2) {
      boolean var3 = Class15.method_869(var1.field_9181, var1.field_9180, var2);
      boolean var4 = Class15.method_868(var1.field_9181, var1.field_9180, var2);
      boolean var5 = var3 || Class15.method_870(var1.field_9181, var1.field_9180, var2);
      return var5 && (!var3 && !this.field_2904.method_671() || var4);
   }

   // $VF: renamed from: a (java.util.ArrayDeque) net.minecraft.util.math.Vec3d
   private Vec3d method_3621(ArrayDeque<Vec3d> var1) {
      double var2 = 0.0;
      double var4 = 0.0;
      double var6 = 0.0;

      for (Vec3d var9 : var1) {
         var2 += var9.field_1352;
         var4 += var9.field_1351;
         var6 += var9.field_1350;
      }

      double var10 = Math.max(1, var1.size());
      return new Vec3d(var2 / var10, var4 / var10, var6 / var10);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, float, double) net.minecraft.util.math.Vec3d
   private Vec3d method_3622(Vec3d var1, float var2, double var3) {
      return var1.method_1019(Dev.ZWare.Client.pkg1.Class10.method_650(var2).method_1029().method_1021(var3));
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) double
   private double method_3623(Vec3d var1) {
      if (c.field_1724 == null) {
         return 0.0;
      } else {
         Vec3d var2 = var1.method_1020(c.field_1724.method_19538());
         return this.method_3625((float)Math.toDegrees(Math.atan2(var2.field_1350, var2.field_1352)) - 90.0F);
      }
   }

   // $VF: renamed from: a (double, double) double
   private double method_3624(double var1, double var3) {
      return MathHelper.method_15338(var3 - var1);
   }

   // $VF: renamed from: a (float) float
   private float method_3625(float var1) {
      float var2 = var1 % 360.0F;
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      return var2;
   }

   // $VF: renamed from: q () void
   private void method_3626() {
      this.field_2917 = false;
      this.field_2918.clear();
      this.field_2919.clear();
      this.field_2920.clear();
      this.field_2921 = 0L;
      this.field_2922 = 0L;
      this.field_2923 = 0L;
   }

   // $VF: renamed from: b (java.lang.String) void
   private void method_3627(String var1) {
      this.method_3628(var1);
      if (!this.field_2905.method_671().isBlank() && c.field_1724 != null) {
         String var2 = "{\"username\":\"TrailFollower\",\"content\":\"" + this.method_3629(var1) + "\"}";
         Class22.method_162(this.field_2905.method_671(), var2);
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   private void method_3628(String var1, Object... var2) {
      Dev.ZWare.Client.features.pkg2.Class1.method_1647("[TrailFollower] " + String.format(Locale.ROOT, var1, var2));
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_3629(String var1) {
      return var1.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r");
   }

   public static enum Inner1 {
      Disable,
      FlyTowardsYaw;
   }

   public static enum Inner2 {
      Left,
      None,
      Right;
   }
}
