package Dev.ZWare.Client.features.pkg1.pkg3;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult.Success;
import net.minecraft.util.ActionResult.SwingSource;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class7 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_2534 = 200L;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2535 = this.a("Pause While Eatting", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2536 = this.a("Avoid Helping Opponents", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2537 = this.a("Ignore Rebreak", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2538 = this.a("Protect", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner4> field_2539 = this.a("Break Swing", Class7.Inner4.None);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2540 = this.a("Protect Override Block Cooldown", false);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2541 = this.a("Protect Instant Placement", true);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2542 = this.a("Enemy Double Mine React", true);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2543 = this.a("Rocket Protect", false);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2544 = this.a("Predict Rebreak", true);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2545 = this.a("Self Trap", true);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner2> field_2546 = this.a("Self Trap Mode", Class7.Inner2.Smart);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2547 = this.a("Self Trap Head", true);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2548 = this.a("Extend", true);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner3> field_2549 = this.a("Extend Mode", Class7.Inner3.Smart);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner1> field_2550 = this.a("Crawl Extend Mode", Class7.Inner1.Smart);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner5> field_2551 = this.a("Anchor Extend Mode", Class7.Inner5.None);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2552 = this.a("Render", true);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2553 = this.a("Fade Time", 0.2, 0.0, 1.0);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class7.Inner6> field_2554 = this.a("Shape Mode", Class7.Inner6.Both);
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2555 = this.a("Side Color", 85, 0, 255, 40);
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2556 = this.a("Line Color", 255, 255, 255, 60);
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2557 = this.a("Skipped Side Color", 255, 0, 0, 40);
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2558 = this.a("Skipped Line Color", 255, 0, 0, 120);
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2559 = this.a("Debug Protection Shape", false);
   // $VF: renamed from: O java.util.List
   private final List<BlockPos> field_2560 = new ArrayList<>();
   // $VF: renamed from: P java.util.Map
   private final Map<BlockPos, Long> field_2561 = new HashMap<>();
   // $VF: renamed from: Q java.util.Map
   private final Map<BlockPos, Long> field_2562 = new HashMap<>();
   // $VF: renamed from: R long
   private long field_2563;
   // $VF: renamed from: S long
   private long field_2564;
   // $VF: renamed from: T long
   private long field_2565;
   // $VF: renamed from: U long
   private long field_2566;
   // $VF: renamed from: V long
   private long field_2567;
   // $VF: renamed from: W long
   private long field_2568;
   // $VF: renamed from: X net.minecraft.util.math.BlockPos
   private BlockPos field_2569;
   // $VF: renamed from: Y net.minecraft.util.math.BlockPos
   private BlockPos field_2570;
   // $VF: renamed from: Z boolean
   private boolean field_2571;
   // $VF: renamed from: aa net.minecraft.util.math.BlockPos
   private BlockPos field_2572;
   // $VF: renamed from: ab int
   private int field_2573;
   // $VF: renamed from: ac net.minecraft.util.math.BlockPos
   private BlockPos field_2574;
   // $VF: renamed from: ad int
   private int field_2575;
   // $VF: renamed from: ae int
   private int field_2576;
   // $VF: renamed from: af net.minecraft.util.math.BlockPos
   private BlockPos field_2577;
   // $VF: renamed from: ag long
   private long field_2578;
   // $VF: renamed from: ah boolean
   private boolean field_2579;

   public Class7() {
      super("Surround", "no clue", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2539.method_709(var1 -> this.field_2538.method_671());
      this.field_2540.method_709(var1 -> this.field_2538.method_671());
      this.field_2541.method_709(var1 -> this.field_2538.method_671());
      this.field_2543.method_709(var1 -> this.field_2542.method_671());
      this.field_2546.method_709(var1 -> this.field_2545.method_671());
      this.field_2547.method_709(var1 -> this.field_2545.method_671());
      this.field_2549.method_709(var1 -> this.field_2548.method_671());
      this.field_2554.method_709(var1 -> this.field_2552.method_671());
      this.field_2555.method_709(var1 -> this.field_2552.method_671() && this.field_2554.method_671().method_1166());
      this.field_2556.method_709(var1 -> this.field_2552.method_671() && this.field_2554.method_671().method_1165());
      this.field_2557.method_709(var1 -> this.field_2552.method_671() && this.field_2554.method_671().method_1166());
      this.field_2558.method_709(var1 -> this.field_2552.method_671() && this.field_2554.method_671().method_1165());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2560.clear();
      this.field_2561.clear();
      this.field_2562.clear();
      this.field_2563 = 0L;
      this.field_2564 = 0L;
      this.field_2565 = 0L;
      this.field_2566 = 0L;
      this.field_2567 = 0L;
      this.field_2568 = 0L;
      this.field_2569 = null;
      this.field_2570 = null;
      this.field_2571 = false;
      this.field_2572 = null;
      this.field_2573 = 0;
      this.field_2574 = null;
      this.field_2575 = 0;
      this.field_2576 = 0;
      this.field_2577 = null;
      this.field_2578 = 0L;
      this.field_2579 = false;
   }

   @Override
   public void fromJson(JsonElement element) {
      if (element != null && !element.isJsonNull()) {
         JsonObject var2 = element.getAsJsonObject();
         if (!var2.has("EnemyDoubleMineReact") && var2.has("EnemySilentMineReact")) {
            JsonObject var3 = var2.deepCopy();
            var3.add("EnemyDoubleMineReact", var2.get("EnemySilentMineReact"));
            var2 = var3;
         }

         super.fromJson(var2);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3216(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g()) {
         Class8 var2 = this.method_3252();
         this.field_2560.clear();
         this.field_2579 = false;
         long var3 = System.currentTimeMillis();
         if (this.field_2551.method_671() == Class7.Inner5.Smart) {
            this.method_3230(var3);
         }

         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         ArrayList var7 = new ArrayList();
         if (!c.field_1724.method_20448() && !c.field_1724.method_6128()) {
            this.method_3219(var5, var6, var7, var2, var3);
         } else {
            this.method_3220(var5, var7, var3);
         }

         this.method_3221(var7);
         this.field_2560.addAll(var5);
         this.field_2560.addAll(var6);
         this.field_2560.addAll(var7);
         Set var8 = this.method_3244();
         this.field_2576++;
         if (this.field_2574 != null && this.field_2544.method_671() && this.field_2576 - this.field_2575 > 5) {
            this.field_2574 = null;
         }

         if (!this.method_3247()) {
            if (this.field_2538.method_671()) {
               this.method_3225(var8, var2, var3);
            }

            ArrayList var9 = new ArrayList();
            HashSet var10 = new HashSet();
            if (!this.field_2536.method_671()) {
               var9.addAll(this.field_2560);
            } else {
               Set var11 = this.method_3233();
               boolean var12 = this.method_3246();

               for (BlockPos var14 : this.field_2560) {
                  if (!this.method_3235(var14)) {
                     var9.add(var14);
                  } else if (var12 && !this.field_2571) {
                     var10.add(var14);
                  } else if (this.method_3234(var14, var11)) {
                     var9.add(var14);
                  } else {
                     var10.add(var14);
                  }
               }
            }

            long var17 = System.currentTimeMillis();

            for (BlockPos var20 : var10) {
               this.field_2562.put(var20.method_10062(), var17);
            }

            this.field_2579 = !var9.isEmpty();
            this.method_3227(var9, var2, var3);
            if (this.field_2559.method_671()) {
               long var19 = System.currentTimeMillis();

               for (BlockPos var16 : var8) {
                  this.field_2562.put(var16.method_10062(), var19);
               }
            }
         }
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_3217() {
      return this.d() && this.field_2579;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_3218(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g() && this.field_2551.method_671() == Class7.Inner5.Smart) {
         if (var1.method_1045() instanceof PlaySoundS2CPacket var2 && var2.method_11894() != null) {
            String var5 = ((SoundEvent)var2.method_11894().comp_349()).comp_3319().method_12832();
            if (var5.contains("respawn_anchor") && !var5.contains("ambient")) {
               Vec3d var4 = new Vec3d(var2.method_11890(), var2.method_11889(), var2.method_11893());
               if (!(var4.method_1025(c.field_1724.method_19538()) > 36.0)) {
                  this.field_2567 = System.currentTimeMillis();
               }
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List, java.util.List, java.util.List, Dev.ZWare.Client.features.pkg1.pkg3.Class8, long) void
   private void method_3219(List<BlockPos> var1, List<BlockPos> var2, List<BlockPos> var3, Class8 var4, long var5) {
      Box var7 = c.field_1724.method_5829().method_1002(0.01, 0.1, 0.01);
      int var8 = c.field_1724.method_24515().method_10264();
      int var9 = (int)Math.floor(var7.field_1323);
      int var10 = (int)Math.floor(var7.field_1320);
      int var11 = (int)Math.floor(var7.field_1321);
      int var12 = (int)Math.floor(var7.field_1324);
      boolean var13 = var9 == var10 && var11 == var12;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      if (this.field_2545.method_671() || this.field_2548.method_671() && this.field_2549.method_671() == Class7.Inner3.Smart) {
         Box var17 = c.field_1724.method_5829().method_1009(3.5, 0.5, 3.5).method_989(0.0, 1.0, 0.0);
         if (this.method_3250(var17)) {
            var14 = true;
            this.field_2563 = var5;
         }

         Box var18 = c.field_1724.method_5829().method_1009(1.5, 0.0, 1.5).method_989(0.0, -1.0, 0.0);
         if (this.method_3250(var18)) {
            var15 = true;
            this.field_2564 = var5;
         }
      }

      if (this.field_2548.method_671() && this.field_2549.method_671() == Class7.Inner3.Smart && var13) {
         Box var23 = c.field_1724.method_5829().method_1009(2.0, 1.0, 2.0);
         EndCrystalEntity var26 = this.method_3251(var23, var0 -> var0.method_24515().method_10264() <= c.field_1724.method_24515().method_10264());
         if (var26 != null) {
            this.field_2569 = var26.method_24515().method_10059(c.field_1724.method_24515()).method_10062();
            this.field_2565 = var5;
            var16 = true;
         }
      }

      for (int var24 = var9; var24 <= var10; var24++) {
         for (int var27 = var11; var27 <= var12; var27++) {
            BlockPos var19 = new BlockPos(var24, var8, var27);

            for (int var20 = -1; var20 <= 1; var20++) {
               for (int var21 = -1; var21 <= 1; var21++) {
                  if (Math.abs(var20) + Math.abs(var21) == 1) {
                     BlockPos var22 = var19.method_10069(var20, 0, var21).method_10062();
                     if (this.method_3249(var22)) {
                        var1.add(var22);
                     }

                     if (this.field_2545.method_671() && this.field_2546.method_671() != Class7.Inner2.None) {
                        this.method_3228(var2, var22, var14, var15, var5);
                     }

                     if (this.field_2551.method_671() != Class7.Inner5.None) {
                        this.method_3229(var2, var22, var5);
                     }
                  }
               }
            }

            BlockPos var28 = new BlockPos(var24, var8 - 1, var27).method_10062();
            BlockState var29 = c.field_1687.method_8320(var28);
            boolean var30 = this.field_2537.method_671() && var4 != null && (var28.equals(var4.method_24()) || var28.equals(var4.method_22()));
            if (!var30 && (var29.method_26215() || var29.method_45474())) {
               var1.add(var28);
            }
         }
      }

      if (this.field_2548.method_671() && var13) {
         boolean var25 = this.field_2549.method_671() == Class7.Inner3.Always
            || this.field_2549.method_671() == Class7.Inner3.Smart && var16 && var5 - this.field_2565 < 1000L;
         if (var25) {
            this.method_3231(var3, c.field_1724.method_24515(), this.field_2569);
         }
      }

      if (this.field_2545.method_671() && this.field_2547.method_671() && !c.field_1724.method_20448() && !c.field_1724.method_20232()) {
         var2.add(c.field_1724.method_24515().method_10086(2).method_10062());
      }
   }

   // $VF: renamed from: a (java.util.List, java.util.List, long) void
   private void method_3220(List<BlockPos> var1, List<BlockPos> var2, long var3) {
      Box var5 = c.field_1724.method_5829().method_1002(0.01, 0.0, 0.01);
      int var6 = c.field_1724.method_24515().method_10264();
      int var7 = (int)Math.floor(var5.field_1323);
      int var8 = (int)Math.floor(var5.field_1320);
      int var9 = (int)Math.floor(var5.field_1321);
      int var10 = (int)Math.floor(var5.field_1324);
      boolean var11 = var7 == var8 && var9 == var10;
      boolean var12 = false;
      if (this.field_2550.method_671() == Class7.Inner1.Smart && var11) {
         Box var13 = c.field_1724.method_5829().method_1009(2.0, 1.0, 2.0);
         EndCrystalEntity var14 = null;
         double var15 = Double.MAX_VALUE;

         for (Entity var18 : c.field_1687.method_8390(EndCrystalEntity.class, var13, var0 -> true)) {
            double var19 = var18.method_5707(c.field_1724.method_19538());
            if (var19 < var15) {
               var15 = var19;
               var14 = (EndCrystalEntity)var18;
            }
         }

         if (var14 != null) {
            this.field_2570 = var14.method_24515().method_10059(c.field_1724.method_24515()).method_10062();
            this.field_2566 = var3;
            var12 = true;
         }
      }

      List var21 = List.of(
         new BlockPos(0, 1, 0), new BlockPos(0, -1, 0), new BlockPos(1, 0, 0), new BlockPos(-1, 0, 0), new BlockPos(0, 0, 1), new BlockPos(0, 0, -1)
      );

      for (int var22 = var7; var22 <= var8; var22++) {
         for (int var24 = var9; var24 <= var10; var24++) {
            BlockPos var16 = new BlockPos(var22, var6, var24);

            for (BlockPos var27 : var21) {
               BlockPos var28 = var16.method_10081(var27).method_10062();
               if (this.method_3249(var28)) {
                  var1.add(var28);
               }
            }
         }
      }

      boolean var23 = var11 && this.field_2550.method_671() == Class7.Inner1.Smart && var12 && var3 - this.field_2566 < 1000L;
      if (var23) {
         BlockPos var25 = new BlockPos(var7, var6, var9);
         this.method_3231(var2, var25, this.field_2570);
      }
   }

   // $VF: renamed from: a (java.util.List) void
   private void method_3221(List<BlockPos> var1) {
      this.field_2571 = false;
      if (this.field_2542.method_671() && Dev.ZWare.Client.Class1.field_316 != null) {
         Dev.ZWare.Client.features.pkg1.pkg5.Class10 var2 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg5.Class10.class);
         if (var2 != null) {
            BlockPos var3 = c.field_1724.method_24515();
            Box var4 = c.field_1724.method_5829().method_1002(0.01, 0.1, 0.01);
            int var5 = (int)Math.floor(var4.field_1323);
            int var6 = (int)Math.floor(var4.field_1320);
            int var7 = (int)Math.floor(var4.field_1321);
            int var8 = (int)Math.floor(var4.field_1324);
            boolean var9 = var5 == var6 && var7 == var8;
            Set var10 = this.method_3233();
            long var11 = System.currentTimeMillis();

            for (Dev.ZWare.Client.features.pkg1.pkg5.Class10.Inner2 var14 : var2.method_2608().values()) {
               if (var14.field_194 != null && this.method_3222(var14.field_193, var10)) {
                  if (var14.field_196) {
                     this.method_3223(var14.field_193, var11);
                  }

                  if (!var9) {
                     this.field_2571 = true;
                  } else {
                     int var15 = var14.field_193.method_10263() - var3.method_10263();
                     int var16 = var14.field_193.method_10264() - var3.method_10264();
                     int var17 = var14.field_193.method_10260() - var3.method_10260();
                     if (var16 == 0 && Math.abs(var15) + Math.abs(var17) == 1) {
                        this.field_2571 = true;
                        BlockPos var18 = var14.field_193;
                        int var19;
                        int var20;
                        int var21;
                        int var22;
                        if (var15 != 0) {
                           var19 = var15;
                           var20 = 1;
                           var21 = var15;
                           var22 = -1;
                        } else {
                           var19 = 1;
                           var20 = var17;
                           var21 = -1;
                           var22 = var17;
                        }

                        BlockPos var23 = var18.method_10084();
                        BlockPos var24 = var18.method_10074();
                        BlockPos var25 = var3.method_10069(var19, 0, var20).method_10062();
                        BlockPos var26 = var3.method_10069(var21, 0, var22).method_10062();
                        BlockPos var27 = var3.method_10069(var15 * 2, 0, var17 * 2).method_10062();

                        for (BlockPos var31 : new BlockPos[]{var23, var24, var25, var26, var27}) {
                           if (!var31.equals(var3) && this.method_3249(var31)) {
                              var1.add(var31.method_10062());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, java.util.Set) boolean
   private boolean method_3222(BlockPos var1, Set<BlockPos> var2) {
      if (var1 == null) {
         return false;
      } else {
         for (BlockPos var4 : var2) {
            if (var1.method_10264() == var4.method_10264()
               && (var1.equals(var4.method_10095()) || var1.equals(var4.method_10072()) || var1.equals(var4.method_10078()) || var1.equals(var4.method_10067()))
               )
             {
               return true;
            }
         }

         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, long) void
   private void method_3223(BlockPos var1, long var2) {
      if (this.field_2543.method_671()
         && !this.method_3247()
         && c.field_1724 != null
         && c.field_1687 != null
         && c.field_1761 != null
         && c.method_1562() != null
         && var1 != null) {
         BlockPos var4 = var1.method_10062();
         BlockState var5 = c.field_1687.method_8320(var4);
         if (!var5.method_26215() && !var5.method_45474()) {
            if (this.field_2577 == null || !this.field_2577.equals(var4) || var2 - this.field_2578 >= 200L) {
               Box var6 = new Box(var4).method_1009(0.2, 1.1, 0.2);
               if (c.field_1687.method_8390(FireworkRocketEntity.class, var6, var0 -> true).isEmpty()) {
                  boolean var7 = false;
                  if (c.field_1724.method_6079().method_31574(Items.field_8639)) {
                     var7 = this.method_3224(var4, Hand.field_5810);
                  } else if (c.field_1724.method_6047().method_31574(Items.field_8639)) {
                     var7 = this.method_3224(var4, Hand.field_5808);
                  } else {
                     int var8 = Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Items.field_8639), 0, 35);
                     Dev.ZWare.Client.pkg1.Class9.Inner1 var9 = var8 == -1 ? null : Dev.ZWare.Client.pkg1.Class9.method_147(var8);
                     if (var9 != null) {
                        try {
                           var7 = this.method_3224(var4, Hand.field_5808);
                        } finally {
                           Dev.ZWare.Client.pkg1.Class9.method_149(var9);
                        }
                     }
                  }

                  if (var7) {
                     this.field_2577 = var4;
                     this.field_2578 = var2;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.Hand) boolean
   private boolean method_3224(BlockPos var1, Hand var2) {
      ActionResult var3 = c.field_1761
         .method_2896(
            c.field_1724, var2, new BlockHitResult(Vec3d.method_24953(var1).method_43206(Direction.field_11036, 0.5), Direction.field_11036, var1, false)
         );
      if (!var3.method_23665()) {
         return false;
      } else {
         if (var3 instanceof Success var4 && var4.comp_2909() != SwingSource.field_52426) {
            c.method_1562().method_52787(new HandSwingC2SPacket(var2));
         }

         return true;
      }
   }

   // $VF: renamed from: a (java.util.Set, Dev.ZWare.Client.features.pkg1.pkg3.Class8, long) void
   private void method_3225(Set<BlockPos> var1, Class8 var2, long var3) {
      for (BlockPos var6 : var1) {
         Box var7 = new Box(
            var6.method_10263(), var6.method_10264(), var6.method_10260(), var6.method_10263() + 1, var6.method_10264() + 1, var6.method_10260() + 1
         );
         Predicate var8 = var0 -> var0 instanceof EndCrystalEntity;
         Entity var9 = (Entity)c.field_1687.method_8333(null, var7, var8).stream().findFirst().orElse(null);
         if (var9 instanceof EndCrystalEntity var10 && var3 - this.field_2568 >= 50L) {
            BlockPos var11 = var10.method_24515();
            if (var11 != null && this.method_3245(var11, var1)) {
               double var12 = Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("Surround", 11.0);
               Dev.ZWare.Client.Class1.field_298.method_313(var10.method_19538(), var12);
               if (!Dev.ZWare.Client.Class1.field_298.method_333(var10.method_5829()) && Dev.ZWare.Client.pkg4.Class9.field_164) {
                  Dev.ZWare.Client.Class1.field_298.method_310(var10.method_19538(), var12);
               }

               if (Dev.ZWare.Client.Class1.field_298.method_333(var10.method_5829())) {
                  c.method_1562().method_52787(PlayerInteractEntityC2SPacket.method_34206(var10, c.field_1724.method_5715()));
                  this.method_3253();
                  var10.method_31472();
                  this.field_2568 = var3;
                  if (this.field_2540.method_671()) {
                     Dev.ZWare.Client.Class1.field_301.method_931(var6);
                  }

                  if (this.field_2541.method_671()) {
                     ArrayList var14 = new ArrayList();
                     BlockPos var15 = null;
                     BlockPos var16 = null;
                     if (var2 != null && var2.method_30()) {
                        var15 = var2.method_24();
                        var16 = var2.method_22();
                     }

                     boolean var17 = this.field_2537.method_671() && (var15 != null && var11.equals(var15) || var16 != null && var11.equals(var16));
                     if (!var17 && this.method_3245(var11, var1) && !this.method_3237(var11) && this.method_3249(var11)) {
                        var14.add(var11.method_10062());
                     }

                     if (!var14.isEmpty()) {
                        this.method_3226(var14, var15, var16, var3);
                     }
                     break;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos, long) void
   private void method_3226(List<BlockPos> var1, BlockPos var2, BlockPos var3, long var4) {
      if (!var1.isEmpty()) {
         if (Dev.ZWare.Client.Class1.field_301.method_916(var1, Items.field_8281)) {
            try {
               for (BlockPos var7 : var1) {
                  if ((!this.field_2537.method_671() || (var2 == null || !var7.equals(var2)) && (var3 == null || !var7.equals(var3)))
                     && Dev.ZWare.Client.Class1.field_301.method_918(Items.field_8281, var7)) {
                     this.field_2561.put(var7.method_10062(), var4);
                  }
               }
            } finally {
               Dev.ZWare.Client.Class1.field_301.method_929();
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List, Dev.ZWare.Client.features.pkg1.pkg3.Class8, long) void
   private void method_3227(List<BlockPos> var1, Class8 var2, long var3) {
      if (!var1.isEmpty()) {
         if (Dev.ZWare.Client.Class1.field_301.method_916(var1, Items.field_8281)) {
            try {
               for (BlockPos var6 : var1) {
                  BlockPos var7 = var2 != null ? var2.method_24() : null;
                  BlockPos var8 = var2 != null ? var2.method_22() : null;
                  boolean var9 = this.field_2537.method_671() && (var7 != null && var6.equals(var7) || var8 != null && var6.equals(var8));
                  if (!var9 && Dev.ZWare.Client.Class1.field_301.method_918(Items.field_8281, var6)) {
                     if (this.field_2544.method_671()) {
                        if (var6.equals(this.field_2572) && this.field_2576 - this.field_2573 <= 3) {
                           this.field_2574 = var6.method_10062();
                           this.field_2575 = this.field_2576;
                        }

                        this.field_2572 = var6.method_10062();
                        this.field_2573 = this.field_2576;
                     }

                     this.field_2561.put(var6.method_10062(), var3);
                  }
               }
            } finally {
               Dev.ZWare.Client.Class1.field_301.method_929();
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.util.math.BlockPos, boolean, boolean, long) void
   private void method_3228(List<BlockPos> var1, BlockPos var2, boolean var3, boolean var4, long var5) {
      if (this.field_2545.method_671() && this.field_2546.method_671() != Class7.Inner2.None) {
         boolean var7 = this.field_2546.method_671() == Class7.Inner2.Always
            || this.field_2546.method_671() == Class7.Inner2.Smart && var3 && var5 - this.field_2563 < 1000L;
         if (var7) {
            BlockPos var8 = var2.method_10084().method_10062();
            if (this.method_3249(var8)) {
               var1.add(var8);
            }
         }

         boolean var11 = this.field_2546.method_671() == Class7.Inner2.Always
            || this.field_2546.method_671() == Class7.Inner2.Smart && var3 && var5 - this.field_2564 < 1000L;
         if (var11) {
            BlockPos var9 = var2.method_10074().method_10062();
            if (this.method_3249(var9)) {
               var1.add(var9);
            }

            BlockPos var10 = c.field_1724.method_24515().method_10087(2).method_10062();
            if (this.method_3249(var10)) {
               var1.add(var10);
            }
         }
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.util.math.BlockPos, long) void
   private void method_3229(List<BlockPos> var1, BlockPos var2, long var3) {
      boolean var5 = this.field_2551.method_671() == Class7.Inner5.Always
         || this.field_2551.method_671() == Class7.Inner5.Smart && var3 - this.field_2567 < 1000L;
      if (var5) {
         BlockPos var6 = var2.method_10084().method_10062();
         if (this.method_3249(var6)) {
            var1.add(var6);
         }
      }
   }

   // $VF: renamed from: a (long) void
   private void method_3230(long var1) {
      Box var3 = c.field_1724.method_5829().method_1009(4.0, 2.0, 4.0);
      BlockPos var4 = BlockPos.method_49637(var3.field_1323, var3.field_1322, var3.field_1321);
      BlockPos var5 = BlockPos.method_49637(var3.field_1320, var3.field_1325, var3.field_1324);

      for (BlockPos var7 : BlockPos.method_10097(var4, var5)) {
         BlockPos var8 = var7.method_10062();
         if (c.field_1687.method_8320(var8).method_27852(Blocks.field_23152) && !(Dev.ZWare.Client.pkg1.Class21.method_58(var8, c.field_1724) <= 0.0)) {
            this.field_2567 = var1;
            return;
         }
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos) void
   private void method_3231(List<BlockPos> var1, BlockPos var2, BlockPos var3) {
      if (var3 != null) {
         int var4 = Integer.signum(var3.method_10263());
         int var5 = Integer.signum(var3.method_10260());
         boolean var6 = var4 != 0 && var5 != 0;
         boolean var7 = var4 != 0 ^ var5 != 0;
         if (var6) {
            this.method_3232(var1, var2.method_10069(var4, 0, var5));
            this.method_3232(var1, var2.method_10069(var4 * 2, 0, 0));
            this.method_3232(var1, var2.method_10069(0, 0, var5 * 2));
         } else if (var7) {
            BlockPos var8;
            BlockPos var9;
            BlockPos var10;
            if (var4 != 0) {
               var8 = var2.method_10069(var4, 0, 1);
               var9 = var2.method_10069(var4, 0, -1);
               var10 = var2.method_10069(var4 * 2, 0, 0);
            } else {
               var8 = var2.method_10069(1, 0, var5);
               var9 = var2.method_10069(-1, 0, var5);
               var10 = var2.method_10069(0, 0, var5 * 2);
            }

            this.method_3232(var1, var8);
            this.method_3232(var1, var9);
            this.method_3232(var1, var10);
         }
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.util.math.BlockPos) void
   private void method_3232(List<BlockPos> var1, BlockPos var2) {
      BlockPos var3 = var2.method_10062();
      if (this.method_3249(var3)) {
         var1.add(var3);
      }
   }

   // $VF: renamed from: a () java.util.Set
   private Set<BlockPos> method_3233() {
      HashSet var1 = new HashSet();
      int var2 = c.field_1724.method_24515().method_10264();
      Box var3 = c.field_1724.method_5829().method_1002(0.01, 0.1, 0.01);
      int var4 = (int)Math.floor(var3.field_1323);
      int var5 = (int)Math.floor(var3.field_1320);
      int var6 = (int)Math.floor(var3.field_1321);
      int var7 = (int)Math.floor(var3.field_1324);

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = var6; var9 <= var7; var9++) {
            var1.add(new BlockPos(var8, var2, var9).method_10062());
         }
      }

      return var1;
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos, java.util.Set) boolean
   private boolean method_3234(BlockPos var1, Set<BlockPos> var2) {
      for (BlockPos var4 : var2) {
         if (var1.equals(var4.method_10084())
            || var1.equals(var4.method_10074())
            || var1.equals(var4.method_10095())
            || var1.equals(var4.method_10072())
            || var1.equals(var4.method_10078())
            || var1.equals(var4.method_10067())
            || var1.equals(var4)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3235(BlockPos var1) {
      if (!this.field_2536.method_671()) {
         return false;
      } else {
         for (PlayerEntity var3 : c.field_1687.method_18456()) {
            if (var3 != c.field_1724
               && (Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var3))
               && !this.method_3236(var3)) {
               BlockPos var4 = var3.method_24515();
               double var5 = Math.sqrt(
                  Math.pow(var4.method_10263() - c.field_1724.method_24515().method_10263(), 2.0)
                     + Math.pow(var4.method_10260() - c.field_1724.method_24515().method_10260(), 2.0)
               );
               if (!(var5 > 5.0)) {
                  Box var7 = var3.method_5829().method_1002(0.01, 0.1, 0.01);
                  int var8 = (int)Math.floor(var7.field_1323);
                  int var9 = (int)Math.floor(var7.field_1320);
                  int var10 = (int)Math.floor(var7.field_1321);
                  int var11 = (int)Math.floor(var7.field_1324);
                  int var12 = var9 - var8 + 1;
                  int var13 = var11 - var10 + 1;
                  boolean var14 = var12 == 1 && var13 == 1;
                  boolean var15 = var12 == 2 && var13 == 1 || var12 == 1 && var13 == 2;
                  boolean var16 = var12 == 2 && var13 == 2;
                  if (var14) {
                     List var17 = List.of(var4.method_10095(), var4.method_10072(), var4.method_10078(), var4.method_10067());
                     if (var17.contains(var1)) {
                        return true;
                     }

                     if (var1.equals(var4.method_10074()) || var1.equals(var4)) {
                        return true;
                     }
                  }

                  if (var15) {
                     ArrayList var19 = new ArrayList();

                     for (int var18 = var8; var18 < var8 + var12; var18++) {
                        var19.add(new BlockPos(var18, var4.method_10264(), var10 - 1).method_10062());
                        var19.add(new BlockPos(var18, var4.method_10264(), var10 + var13).method_10062());
                     }

                     for (int var21 = var10; var21 < var10 + var13; var21++) {
                        var19.add(new BlockPos(var8 - 1, var4.method_10264(), var21).method_10062());
                        var19.add(new BlockPos(var8 + var12, var4.method_10264(), var21).method_10062());
                     }

                     if (var19.contains(var1)) {
                        return true;
                     }
                  }

                  if (var16) {
                     ArrayList var20 = new ArrayList();

                     for (int var22 = var8; var22 < var8 + 2; var22++) {
                        var20.add(new BlockPos(var22, var4.method_10264(), var10 - 1).method_10062());
                        var20.add(new BlockPos(var22, var4.method_10264(), var10 + 2).method_10062());
                     }

                     for (int var23 = var10; var23 < var10 + 2; var23++) {
                        var20.add(new BlockPos(var8 - 1, var4.method_10264(), var23).method_10062());
                        var20.add(new BlockPos(var8 + 2, var4.method_10264(), var23).method_10062());
                     }

                     if (var20.contains(var1)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.Entity) boolean
   private boolean method_3236(Entity var1) {
      return var1 != null && !c.field_1687.method_8320(var1.method_24515()).method_45474();
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3237(BlockPos var1) {
      double var2 = var1.method_10263() + 0.5;
      double var4 = var1.method_10264() + 0.5;
      double var6 = var1.method_10260() + 0.5;

      for (PlayerEntity var9 : c.field_1687.method_18456()) {
         if (var9 != c.field_1724
            && (Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var9))
            && var9.method_5829().method_1014(2.0).method_1008(var2, var4, var6)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: b () java.util.Set
   private Set<BlockPos> method_3238() {
      HashSet var1 = new HashSet();
      var1.add(new BlockPos(0, 0, 0));
      var1.add(new BlockPos(1, 0, 0));
      var1.add(new BlockPos(2, 0, 0));
      var1.add(new BlockPos(3, 0, 0));
      var1.add(new BlockPos(-1, 0, 0));
      var1.add(new BlockPos(-2, 0, 0));
      var1.add(new BlockPos(-3, 0, 0));
      var1.add(new BlockPos(0, 0, 1));
      var1.add(new BlockPos(0, 0, 2));
      var1.add(new BlockPos(0, 0, 3));
      var1.add(new BlockPos(0, 0, -1));
      var1.add(new BlockPos(0, 0, -2));
      var1.add(new BlockPos(0, 0, -3));
      var1.add(new BlockPos(1, 0, 1));
      var1.add(new BlockPos(2, 0, 1));
      var1.add(new BlockPos(1, 0, 2));
      var1.add(new BlockPos(1, 0, -1));
      var1.add(new BlockPos(2, 0, -1));
      var1.add(new BlockPos(1, 0, -2));
      var1.add(new BlockPos(-1, 0, 1));
      var1.add(new BlockPos(-2, 0, 1));
      var1.add(new BlockPos(-1, 0, 2));
      var1.add(new BlockPos(-1, 0, -1));
      var1.add(new BlockPos(-2, 0, -1));
      var1.add(new BlockPos(-1, 0, -2));
      return var1;
   }

   // $VF: renamed from: c () java.util.Set
   private Set<BlockPos> method_3239() {
      HashSet var1 = new HashSet();
      var1.add(new BlockPos(0, 1, 0));
      var1.add(new BlockPos(1, 1, 0));
      var1.add(new BlockPos(-1, 1, 0));
      var1.add(new BlockPos(2, 1, 0));
      var1.add(new BlockPos(-2, 1, 0));
      var1.add(new BlockPos(0, 1, 1));
      var1.add(new BlockPos(0, 1, -1));
      var1.add(new BlockPos(0, 1, 2));
      var1.add(new BlockPos(0, 1, -2));
      var1.add(new BlockPos(1, 1, 1));
      var1.add(new BlockPos(1, 1, -1));
      var1.add(new BlockPos(-1, 1, 1));
      var1.add(new BlockPos(-1, 1, -1));
      return var1;
   }

   // $VF: renamed from: d () java.util.Set
   private Set<BlockPos> method_3240() {
      HashSet var1 = new HashSet();
      var1.add(new BlockPos(0, 2, 0));
      var1.add(new BlockPos(0, 3, 0));
      var1.add(new BlockPos(1, 2, 0));
      var1.add(new BlockPos(-1, 2, 0));
      var1.add(new BlockPos(0, 2, 1));
      var1.add(new BlockPos(0, 2, -1));
      return var1;
   }

   // $VF: renamed from: e () java.util.Set
   private Set<BlockPos> method_3241() {
      HashSet var1 = new HashSet();
      var1.add(new BlockPos(0, -1, 0));
      var1.add(new BlockPos(1, -1, 0));
      var1.add(new BlockPos(-1, -1, 0));
      var1.add(new BlockPos(2, -1, 0));
      var1.add(new BlockPos(2, -1, 1));
      var1.add(new BlockPos(2, -1, -1));
      var1.add(new BlockPos(-2, -1, 0));
      var1.add(new BlockPos(-2, -1, 1));
      var1.add(new BlockPos(-2, -1, -1));
      var1.add(new BlockPos(0, -1, 1));
      var1.add(new BlockPos(0, -1, -1));
      var1.add(new BlockPos(0, -1, 2));
      var1.add(new BlockPos(1, -1, 2));
      var1.add(new BlockPos(-1, -1, 2));
      var1.add(new BlockPos(0, -1, -2));
      var1.add(new BlockPos(1, -1, -2));
      var1.add(new BlockPos(-1, -1, -2));
      var1.add(new BlockPos(1, -1, 1));
      var1.add(new BlockPos(1, -1, -1));
      var1.add(new BlockPos(-1, -1, 1));
      var1.add(new BlockPos(-1, -1, -1));
      var1.add(new BlockPos(0, -2, 0));
      return var1;
   }

   // $VF: renamed from: f () java.util.Set
   private Set<BlockPos> method_3242() {
      return this.method_3238();
   }

   // $VF: renamed from: g () java.util.Set
   private Set<BlockPos> method_3243() {
      HashSet var1 = new HashSet();
      var1.add(new BlockPos(0, -1, 0));
      var1.add(new BlockPos(1, -1, 0));
      var1.add(new BlockPos(-1, -1, 0));
      var1.add(new BlockPos(0, -1, 1));
      var1.add(new BlockPos(0, -1, -1));
      var1.add(new BlockPos(0, -2, 0));
      var1.add(new BlockPos(1, -1, 1));
      var1.add(new BlockPos(1, -1, -1));
      var1.add(new BlockPos(-1, -1, 1));
      var1.add(new BlockPos(-1, -1, -1));
      var1.add(new BlockPos(2, -1, 0));
      var1.add(new BlockPos(2, -1, 1));
      var1.add(new BlockPos(2, -1, -1));
      var1.add(new BlockPos(-2, -1, 0));
      var1.add(new BlockPos(-2, -1, 1));
      var1.add(new BlockPos(-2, -1, -1));
      var1.add(new BlockPos(0, 2, 0));
      var1.add(new BlockPos(0, 1, 0));
      var1.add(new BlockPos(1, 1, 0));
      var1.add(new BlockPos(0, 1, 1));
      var1.add(new BlockPos(-1, 1, 0));
      var1.add(new BlockPos(0, 1, -1));
      var1.add(new BlockPos(0, -1, 2));
      var1.add(new BlockPos(1, -1, 2));
      var1.add(new BlockPos(-1, -1, 2));
      var1.add(new BlockPos(0, -1, -2));
      var1.add(new BlockPos(1, -1, -2));
      var1.add(new BlockPos(-1, -1, -2));
      return var1;
   }

   // $VF: renamed from: h () java.util.Set
   private Set<BlockPos> method_3244() {
      HashSet var1 = new HashSet();
      BlockPos var2 = c.field_1724.method_24515();
      if (!c.field_1724.method_20448() && !c.field_1724.method_6128()) {
         for (BlockPos var11 : this.method_3238()) {
            var1.add(var2.method_10081(var11).method_10062());
         }

         for (BlockPos var12 : this.method_3239()) {
            var1.add(var2.method_10081(var12).method_10062());
         }

         for (BlockPos var13 : this.method_3240()) {
            var1.add(var2.method_10081(var13).method_10062());
         }

         for (BlockPos var14 : this.method_3241()) {
            var1.add(var2.method_10081(var14).method_10062());
         }
      } else {
         for (BlockPos var4 : this.method_3242()) {
            var1.add(var2.method_10081(var4).method_10062());
         }

         for (BlockPos var10 : this.method_3243()) {
            var1.add(var2.method_10081(var10).method_10062());
         }
      }

      return var1;
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos, java.util.Set) boolean
   private boolean method_3245(BlockPos var1, Set<BlockPos> var2) {
      return var1 != null && var2.contains(var1);
   }

   // $VF: renamed from: b () boolean
   private boolean method_3246() {
      int var1 = c.field_1724.method_24515().method_10264();
      Box var2 = c.field_1724.method_5829().method_1002(0.01, 0.1, 0.01);
      int var3 = (int)Math.floor(var2.field_1323);
      int var4 = (int)Math.floor(var2.field_1320);
      int var5 = (int)Math.floor(var2.field_1321);
      int var6 = (int)Math.floor(var2.field_1324);
      int var7 = 0;
      Class8 var8 = this.method_3252();

      for (int var9 = var3; var9 <= var4; var9++) {
         for (int var10 = var5; var10 <= var6; var10++) {
            BlockPos var11 = new BlockPos(var9, var1, var10).method_10062();
            boolean var12 = var8 != null && var8.method_30() && (var11.equals(var8.method_24()) || var11.equals(var8.method_22()) && var8.method_23() > 0.5);
            if (!c.field_1687.method_8320(var11).method_45474() && !var12) {
               var7++;
            }
         }
      }

      return var7 >= 1;
   }

   // $VF: renamed from: c () boolean
   private boolean method_3247() {
      if (!this.field_2535.method_671()) {
         return false;
      } else if (c.field_1724.method_6115() && this.method_3248(c.field_1724.method_6030())) {
         return true;
      } else {
         return !c.field_1690.field_1904.method_1434() ? false : this.method_3248(c.field_1724.method_6047()) || this.method_3248(c.field_1724.method_6079());
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_3248(ItemStack var1) {
      if (var1 != null && !var1.method_7960()) {
         UseAction var2 = var1.method_7976();
         return var2 == UseAction.field_8950 || var2 == UseAction.field_8946;
      } else {
         return false;
      }
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3249(BlockPos var1) {
      return c.field_1687.method_8320(var1).method_45474();
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box) boolean
   private boolean method_3250(Box var1) {
      return !c.field_1687.method_8333(null, var1, var0 -> var0 instanceof EndCrystalEntity).isEmpty();
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, java.util.function.Predicate) net.minecraft.entity.decoration.EndCrystalEntity
   private EndCrystalEntity method_3251(Box var1, Predicate<EndCrystalEntity> var2) {
      EndCrystalEntity var3 = null;
      double var4 = Double.MAX_VALUE;

      for (EndCrystalEntity var7 : c.field_1687.method_8390(EndCrystalEntity.class, var1, var2)) {
         double var8 = var7.method_5858(c.field_1724);
         if (var8 < var4) {
            var3 = var7;
            var4 = var8;
         }
      }

      return var3;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class8
   private Class8 method_3252() {
      return Dev.ZWare.Client.Class1.field_316 == null ? null : Class8.method_32();
   }

   // $VF: renamed from: n () void
   private void method_3253() {
      switch ((Class7.Inner4)this.field_2539.method_671()) {
         case None:
         default:
            break;
         case Client:
            c.field_1724.method_6104(Hand.field_5808);
            break;
         case Packet:
            c.method_1562().method_52787(new HandSwingC2SPacket(Hand.field_5808));
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2552.method_671()) {
         this.method_3254(event);
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   private void method_3254(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      long var2 = System.currentTimeMillis();
      long var4 = Math.max(1L, (long)(this.field_2553.method_671() * 1000.0));
      Iterator var6 = this.field_2561.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         long var8 = var2 - (Long)var7.getValue();
         if (var8 > var4) {
            var6.remove();
         } else {
            double var10 = 1.0 - MathHelper.method_15350((double)var8 / var4, 0.0, 1.0);
            this.method_3255(
               var1, (BlockPos)var7.getKey(), this.method_3256(this.field_2555.method_671(), var10), this.method_3256(this.field_2556.method_671(), var10)
            );
         }
      }

      Iterator var13 = this.field_2562.entrySet().iterator();

      while (var13.hasNext()) {
         Entry var14 = (Entry)var13.next();
         long var9 = var2 - (Long)var14.getValue();
         if (var9 > var4) {
            var13.remove();
         } else {
            double var11 = 1.0 - MathHelper.method_15350((double)var9 / var4, 0.0, 1.0);
            this.method_3255(
               var1, (BlockPos)var14.getKey(), this.method_3256(this.field_2557.method_671(), var11), this.method_3256(this.field_2558.method_671(), var11)
            );
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.BlockPos, java.awt.Color, java.awt.Color) void
   private void method_3255(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, BlockPos var2, Color var3, Color var4) {
      Box var5 = new Box(var2);
      if (this.field_2554.method_671().method_1166()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var5, var3);
      }

      if (this.field_2554.method_671().method_1165()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var5, var4, 1.0);
      }
   }

   // $VF: renamed from: a (java.awt.Color, double) java.awt.Color
   private Color method_3256(Color var1, double var2) {
      int var4 = MathHelper.method_15340((int)Math.round(var1.getAlpha() * var2), 0, 255);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var4);
   }

   public static enum Inner1 {
      None,
      Smart;
   }

   public static enum Inner2 {
      None,
      Smart,
      Always;
   }

   public static enum Inner3 {
      None,
      Smart,
      Always;
   }

   public static enum Inner4 {
      None,
      Client,
      Packet;
   }

   public static enum Inner5 {
      None,
      Smart,
      Always;
   }

   public static enum Inner6 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1165() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1166() {
         return this == Sides || this == Both;
      }
   }
}
