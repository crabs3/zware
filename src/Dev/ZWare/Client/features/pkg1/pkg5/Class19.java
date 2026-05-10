package Dev.ZWare.Client.features.pkg1.pkg5;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.HashSet;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public class Class19 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class19.Inner1> field_2932 = this.a("Target", Class19.Inner1.Auto);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2933 = this.a("TargetRange", 12.0F, 1.0F, 32.0F);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2934 = this.a("IgnoreFriends", false);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2935 = this.a("RenderClear", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2936 = this.a("RenderBlocked", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2937 = this.a("RenderPoints", true);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2938 = this.a("RenderHitBlocks", true);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2939 = this.a("LineWidth", 1.0F, 0.1F, 5.0F);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2940 = this.a("PointSize", 0.08F, 0.02F, 0.35F);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2941 = this.a("ClearColor", 80, 255, 120, 255);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2942 = this.a("BlockedColor", 255, 90, 90, 255);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2943 = this.a("PointClearColor", 80, 255, 120, 95);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2944 = this.a("PointBlockedColor", 255, 90, 90, 95);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2945 = this.a("SourceColor", 146, 146, 255, 130);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2946 = this.a("HitBlockColor", 255, 188, 68, 120);
   // $VF: renamed from: D java.lang.String
   private String field_2947;

   public Class19() {
      super("Crystal Ray Viewer", "shows the actual crystal damage sample rays", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2947;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      this.field_2947 = null;
      if (!g() && c.field_1765 != null) {
         Class19.Inner2 var2 = this.method_3635();
         if (var2 != null) {
            PlayerEntity var3 = this.method_3636();
            if (var3 != null) {
               Dev.ZWare.Client.pkg1.Class17.Inner2 var4 = Dev.ZWare.Client.pkg1.Class17.method_295(var2.field_30, var3, var3.method_5829(), null, null);
               if (var4.method_1073() > 0) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(event.method_1055(), var2.field_31, this.field_2945.method_671());
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(
                     event.method_1055(), var2.field_31, this.field_2945.method_671(), this.field_2939.method_671().floatValue()
                  );
                  double var5 = this.field_2940.method_671().floatValue() * 0.5;
                  HashSet var7 = new HashSet();

                  for (Dev.ZWare.Client.pkg1.Class17.Inner3 var9 : var4.method_1070()) {
                     if (var9.method_635()) {
                        if (this.field_2935.method_671()) {
                           Dev.ZWare.Client.pkg1.pkg2.Class2.method_783(
                              event.method_1055(), var2.field_30, var9.method_630(), this.field_2941.method_671(), this.field_2939.method_671().floatValue()
                           );
                        }

                        if (this.field_2937.method_671()) {
                           Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(
                              event.method_1055(), this.method_3640(var9.method_630(), var5), this.field_2943.method_671()
                           );
                        }
                     } else {
                        if (this.field_2936.method_671()) {
                           Dev.ZWare.Client.pkg1.pkg2.Class2.method_783(
                              event.method_1055(), var2.field_30, var9.method_633(), this.field_2942.method_671(), this.field_2939.method_671().floatValue()
                           );
                        }

                        if (this.field_2937.method_671()) {
                           Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(
                              event.method_1055(), this.method_3640(var9.method_630(), var5), this.field_2944.method_671()
                           );
                        }

                        if (this.field_2938.method_671() && var9.method_634() != null && var7.add(var9.method_634())) {
                           Dev.ZWare.Client.pkg1.pkg2.Class2.method_782(
                              event.method_1055(), var9.method_634(), this.field_2946.method_671(), this.field_2939.method_671().floatValue()
                           );
                        }
                     }
                  }

                  int var10 = (int)Math.round(var4.method_1074() * 100.0);
                  this.field_2947 = var3.method_5477().getString() + " " + var10 + "%";
               }
            }
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class19$Inner2
   private Class19.Inner2 method_3635() {
      if (c.field_1765 instanceof EntityHitResult var1 && var1.method_17782() instanceof EndCrystalEntity var8) {
         Vec3d var11 = var8.method_19538();
         return new Class19.Inner2(var11, var8.method_5829());
      } else if (c.field_1765 instanceof BlockHitResult var6 && c.field_1765.method_17783() == Type.field_1332) {
         BlockPos var7 = var6.method_17777();
         BlockState var10 = c.field_1687.method_8320(var7);
         if (!var10.method_27852(Blocks.field_10540) && !var10.method_27852(Blocks.field_9987)) {
            return null;
         } else {
            Vec3d var4 = new Vec3d(var7.method_10263() + 0.5, var7.method_10264() + 1.0, var7.method_10260() + 0.5);
            Box var5 = new Box(
               var7.method_10263(),
               var7.method_10264() + 1.0,
               var7.method_10260(),
               var7.method_10263() + 1.0,
               var7.method_10264() + 3.0,
               var7.method_10260() + 1.0
            );
            return new Class19.Inner2(var4, var5);
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_3636() {
      return (PlayerEntity)(switch ((Class19.Inner1)this.field_2932.method_671()) {
         case Auto -> {
            PlayerEntity var1 = this.method_3637();
            if (var1 != null) {
               yield var1;
            } else {
               PlayerEntity var2 = this.method_3638();
               yield var2 != null ? var2 : c.field_1724;
            }
         }
         case Self -> c.field_1724;
         case Closest -> this.method_3638();
         case Crosshair -> this.method_3637();
      });
   }

   // $VF: renamed from: b () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_3637() {
      if (c.field_1765 instanceof EntityHitResult var1 && var1.method_17782() instanceof PlayerEntity var2) {
         return this.method_3639(var2, true) ? var2 : null;
      } else {
         return null;
      }
   }

   // $VF: renamed from: c () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_3638() {
      PlayerEntity var1 = null;
      double var2 = Double.MAX_VALUE;
      double var4 = this.field_2933.method_671() * this.field_2933.method_671();

      for (PlayerEntity var7 : c.field_1687.method_18456()) {
         if (this.method_3639(var7, false)) {
            double var8 = c.field_1724.method_5858(var7);
            if (!(var8 > var4) && !(var8 >= var2)) {
               var1 = var7;
               var2 = var8;
            }
         }
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, boolean) boolean
   private boolean method_3639(PlayerEntity var1, boolean var2) {
      if (var1 == null || var1.method_31481() || !var1.method_5805() || var1.method_7325()) {
         return false;
      } else {
         return !var2 && var1 == c.field_1724
            ? false
            : !this.field_2934.method_671() || Dev.ZWare.Client.pkg1.Class12.method_1239(var1) != Dev.ZWare.Client.pkg1.Class12.Inner1.FRIEND;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, double) net.minecraft.util.math.Box
   private Box method_3640(Vec3d var1, double var2) {
      return new Box(
         var1.field_1352 - var2, var1.field_1351 - var2, var1.field_1350 - var2, var1.field_1352 + var2, var1.field_1351 + var2, var1.field_1350 + var2
      );
   }

   private static enum Inner1 {
      Auto,
      Self,
      Closest,
      Crosshair;
   }

   private static final class Inner2 {
      // $VF: renamed from: a net.minecraft.util.math.Vec3d
      private final Vec3d field_30;
      // $VF: renamed from: b net.minecraft.util.math.Box
      private final Box field_31;

      private Inner2(Vec3d var1, Box var2) {
         this.field_30 = var1;
         this.field_31 = var2;
      }
   }
}
