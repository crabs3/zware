package Dev.ZWare.Client.features.pkg1.pkg3;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class12 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_2340 = -1;
   // $VF: renamed from: p int
   private static final int field_2341 = -2;
   // $VF: renamed from: q long
   private static final long field_2342 = 500L;
   // $VF: renamed from: r long
   private static final long field_2343 = 1000L;
   // $VF: renamed from: s double
   private static final double field_2344 = 100.0;
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2345 = this.a("Target Range", 8.0, 1.0, 16.0).method_683("Targeting");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2346 = this.a("Anchors Per Second", 5, 1, 10).method_683("Targeting");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2347 = this.a("Min Damage", 6.0, 0.0, 20.0).method_683("Damage");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2348 = this.a("Max Self Damage", 8.0, 0.0, 20.0).method_683("Damage");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class12.Inner2> field_2349 = this.a("Place Hand", Class12.Inner2.Offhand).method_683("Hands");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class12.Inner2> field_2350 = this.a("Charge Hand", Class12.Inner2.Main).method_683("Hands");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class12.Inner2> field_2351 = this.a("Explode Hand", Class12.Inner2.Main).method_683("Hands");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2352 = this.a("Rotate", true).method_683("Misc");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2353 = this.a("Pause While Eatting", true).method_683("Misc");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2354 = this.a("Render", true).method_683("Render");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2355 = this.a("Fade Time", 0.3, 0.0, 1.0).method_683("Render");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class12.Inner1> field_2356 = this.a("Render Mode", Class12.Inner1.Both).method_683("Render");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2357 = this.a("Side Color", 255, 80, 80, 35).method_683("Render");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2358 = this.a("Line Color", 255, 80, 80, 170).method_683("Render");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner3
   private Class12.Inner3 field_2359;
   // $VF: renamed from: I java.util.Deque
   private final Deque<Long> field_2360 = new ArrayDeque<>();
   // $VF: renamed from: J java.util.Map
   private final Map<BlockPos, Long> field_2361 = new LinkedHashMap<>();

   public Class12() {
      super("Anchor Aura", "anchors", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2357.method_709(var1 -> this.field_2354.method_671() && this.field_2356.method_671().method_1237());
      this.field_2358.method_709(var1 -> this.field_2354.method_671() && this.field_2356.method_671().method_1236());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2360.clear();
      this.field_2361.clear();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2360.clear();
      this.field_2361.clear();
      this.field_2359 = null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner2) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_2982(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2 var1) {
      this.field_2359 = null;
      if (!g()) {
         if (!RespawnAnchorBlock.method_27353(c.field_1687)) {
            if (c.method_1562() != null) {
               if (!this.field_2353.method_671() || !this.method_2993()) {
                  if (this.method_3003()) {
                     Class12.Inner3 var2 = this.method_2983();
                     if (var2 != null) {
                        this.field_2359 = var2;
                        if (!this.field_2352.method_671()) {
                           this.method_2989(var2);
                        } else {
                           Dev.ZWare.Client.Class1.field_298
                              .method_316(
                                 this.method_2988(var2),
                                 Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("AnchorAura", 100.0),
                                 () -> this.method_2989(var2)
                              );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2354.method_671()) {
         double var2 = this.field_2355.method_671();
         long var4 = System.currentTimeMillis();
         long var6 = Math.max(1L, (long)(var2 * 1000.0));
         Iterator var8 = this.field_2361.entrySet().iterator();

         while (var8.hasNext()) {
            Entry var9 = (Entry)var8.next();
            long var10 = var4 - (Long)var9.getValue();
            if (var10 > var6) {
               var8.remove();
            } else {
               double var12 = MathHelper.method_15350((double)var10 / var6, 0.0, 1.0);
               double var14 = 1.0 - var12 * var12;
               Box var16 = new Box((BlockPos)var9.getKey());
               if (this.field_2356.method_671().method_1237()) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(event.method_1055(), var16, this.method_3008(this.field_2357.method_671(), var14));
               }

               if (this.field_2356.method_671().method_1236()) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(event.method_1055(), var16, this.method_3008(this.field_2358.method_671(), var14), 1.0);
               }
            }
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2359 == null ? null : String.format("%.1f", this.field_2359.method_113());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner3
   private Class12.Inner3 method_2983() {
      HashSet var1 = new HashSet();
      Class12.Inner3 var2 = null;

      for (PlayerEntity var4 : c.field_1687.method_18456()) {
         if (this.method_2985(var4)) {
            int var5 = MathHelper.method_15384(this.method_2987());
            BlockPos var6 = var4.method_24515();

            for (int var7 = -var5; var7 <= var5; var7++) {
               for (int var8 = -1; var8 <= 2; var8++) {
                  for (int var9 = -var5; var9 <= var5; var9++) {
                     BlockPos var10 = var6.method_10069(var7, var8, var9).method_10062();
                     if (var1.add(var10)) {
                        Class12.Inner3 var11 = this.method_2984(var10, var4);
                        if (var11 != null
                           && (
                              var2 == null
                                 || var11.method_113() > var2.method_113()
                                 || var11.method_113() == var2.method_113() && var11.method_114() < var2.method_114()
                           )) {
                           var2 = var11;
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner3
   private Class12.Inner3 method_2984(BlockPos var1, PlayerEntity var2) {
      if (!this.method_2986(var1)) {
         return null;
      } else if (!Dev.ZWare.Client.Class1.field_301.method_926(Blocks.field_23152.method_8389(), var1)) {
         return null;
      } else {
         Vec3d var3 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
         double var4 = Dev.ZWare.Client.pkg1.Class21.method_58(var1, var2);
         double var6 = Dev.ZWare.Client.pkg1.Class21.method_58(var1, c.field_1724);
         double var8 = c.field_1724.method_6032() + c.field_1724.method_6067();
         if (var6 > this.field_2348.method_671()) {
            return null;
         } else if (var6 >= var8) {
            return null;
         } else {
            return var4 < this.field_2347.method_671() ? null : new Class12.Inner3(var1, var2.method_5628(), var4, var6);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2985(PlayerEntity var1) {
      if (var1 == null || var1 == c.field_1724) {
         return false;
      } else if (!var1.method_5805() || var1.method_31481()) {
         return false;
      } else if (var1.method_7325() || var1.method_68878()) {
         return false;
      } else if (Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_377(var1)) {
         return false;
      } else {
         double var2 = this.field_2345.method_671() * this.field_2345.method_671();
         return c.field_1724.method_5858(var1) <= var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2986(BlockPos var1) {
      double var2 = this.method_2987();
      double var4 = var2 * var2;
      Vec3d var6 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
      return Dev.ZWare.Client.pkg1.Class7.method_121(var6, new Box(var1)) <= var4;
   }

   // $VF: renamed from: a () double
   private double method_2987() {
      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3093();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner3) net.minecraft.util.math.Vec3d
   private Vec3d method_2988(Class12.Inner3 var1) {
      return var1.method_111().method_46558();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner3) void
   private void method_2989(Class12.Inner3 var1) {
      int var2 = this.method_2995(this.field_2350.method_671());
      if (var2 != Integer.MIN_VALUE) {
         int var3 = this.method_2996(this.field_2351.method_671());
         if (var3 != Integer.MIN_VALUE) {
            BlockState var4 = c.field_1687.method_8320(var1.method_111());
            Hand var5 = this.field_2349.method_671().method_1163();
            if (Dev.ZWare.Client.Class1.field_301.method_915(var1.method_111(), var4, Blocks.field_23152.method_8389(), var5)) {
               boolean var6 = false;

               try {
                  var6 = Dev.ZWare.Client.Class1.field_301.method_921(Blocks.field_23152.method_8389(), var1.method_111(), var4, var5);
               } finally {
                  Dev.ZWare.Client.Class1.field_301.method_929();
               }

               if (var6) {
                  this.field_2361.put(var1.method_111().method_10062(), System.currentTimeMillis());
                  BlockHitResult var7 = this.method_2992(var1.method_111());
                  if (this.method_2990(var2, this.field_2350.method_671(), var7)) {
                     if (this.method_2990(var3, this.field_2351.method_671(), var7)) {
                        this.method_3004();
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int, Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner2, net.minecraft.util.hit.BlockHitResult) boolean
   private boolean method_2990(int var1, Class12.Inner2 var2, BlockHitResult var3) {
      if (c.field_1724 == null || c.method_1562() == null || c.field_1687 == null) {
         return false;
      } else if (var2 == Class12.Inner2.Offhand) {
         Class12.Inner5 var14 = this.method_3000(var1);
         if (var14 == null) {
            return false;
         } else {
            boolean var15;
            try {
               var15 = this.method_2991(Hand.field_5810, var3);
            } finally {
               this.method_3002(var14);
            }

            return var15;
         }
      } else {
         Class12.Inner4 var4 = this.method_2999(var1);
         if (var4 == null) {
            return false;
         } else {
            boolean var5;
            try {
               var5 = this.method_2991(Hand.field_5808, var3);
            } finally {
               this.method_3001(var4);
            }

            return var5;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.Hand, net.minecraft.util.hit.BlockHitResult) boolean
   private boolean method_2991(Hand var1, BlockHitResult var2) {
      if (c.field_1724 != null && c.field_1687 != null && c.method_1562() != null) {
         c.method_1562()
            .method_52787(new PlayerInteractBlockC2SPacket(var1, var2, ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942()));
         c.method_1562().method_52787(new HandSwingC2SPacket(var1));
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.hit.BlockHitResult
   private BlockHitResult method_2992(BlockPos var1) {
      Vec3d var2 = var1.method_46558();
      Vec3d var3 = c.field_1724 != null ? c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0) : var2;
      Direction var4 = Direction.method_10142(var3.field_1352 - var2.field_1352, var3.field_1351 - var2.field_1351, var3.field_1350 - var2.field_1350);
      Vec3d var5 = var2.method_1031(var4.method_10148() * 0.5, var4.method_10164() * 0.5, var4.method_10165() * 0.5);
      return new BlockHitResult(var5, var4, var1, false);
   }

   // $VF: renamed from: a () boolean
   private boolean method_2993() {
      if (c.field_1724 != null && c.field_1724.method_6115()) {
         ItemStack var1 = c.field_1724.method_6030();
         if (var1 != null && !var1.method_7960()) {
            UseAction var2 = var1.method_7976();
            return var2 == UseAction.field_8950 || var2 == UseAction.field_8946;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () int
   private int method_2994() {
      return Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Blocks.field_10171.method_8389()), 0, 35);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner2) int
   private int method_2995(Class12.Inner2 var1) {
      if (c.field_1724 == null) {
         return Integer.MIN_VALUE;
      } else if (var1 == Class12.Inner2.Offhand) {
         if (c.field_1724.method_6079().method_31574(Blocks.field_10171.method_8389())) {
            return -1;
         } else {
            int var3 = this.method_2994();
            return var3 == -1 ? Integer.MIN_VALUE : var3;
         }
      } else if (c.field_1724.method_6047().method_31574(Blocks.field_10171.method_8389())) {
         return c.field_1724.method_31548().method_67532();
      } else if (c.field_1724.method_6079().method_31574(Blocks.field_10171.method_8389())) {
         return -2;
      } else {
         int var2 = this.method_2994();
         return var2 == -1 ? Integer.MIN_VALUE : var2;
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner2) int
   private int method_2996(Class12.Inner2 var1) {
      if (c.field_1724 == null) {
         return -1;
      } else if (var1 == Class12.Inner2.Offhand) {
         if (this.method_2998()) {
            return -1;
         } else {
            for (int var4 = 0; var4 <= 35; var4++) {
               if (this.method_2997(var4)) {
                  return var4;
               }
            }

            return Integer.MIN_VALUE;
         }
      } else {
         int var2 = c.field_1724.method_31548().method_67532();
         if (this.method_2997(var2)) {
            return var2;
         } else {
            for (int var3 = 0; var3 <= 35; var3++) {
               if (this.method_2997(var3)) {
                  return var3;
               }
            }

            return Integer.MIN_VALUE;
         }
      }
   }

   // $VF: renamed from: a (int) boolean
   private boolean method_2997(int var1) {
      if (c.field_1724 != null && var1 >= 0 && var1 <= 35) {
         ItemStack var2 = c.field_1724.method_31548().method_5438(var1);
         if (var2.method_7960()) {
            return true;
         } else {
            return var2.method_31574(Blocks.field_10171.method_8389()) ? false : !(var2.method_7909() instanceof BlockItem);
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_2998() {
      if (c.field_1724 == null) {
         return false;
      } else {
         ItemStack var1 = c.field_1724.method_6079();
         if (var1.method_7960()) {
            return true;
         } else {
            return var1.method_31574(Blocks.field_10171.method_8389()) ? false : !(var1.method_7909() instanceof BlockItem);
         }
      }
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner4
   private Class12.Inner4 method_2999(int var1) {
      if (c.field_1724 == null) {
         return null;
      } else {
         int var2 = c.field_1724.method_31548().method_67532();
         if (var1 == -2) {
            Dev.ZWare.Client.pkg1.Class9.method_152(var2);
            return new Class12.Inner4(-1, -1, var2);
         } else if (var1 < 0 || var1 > 35) {
            return null;
         } else if (var1 == var2) {
            return new Class12.Inner4(-1, -1, -1);
         } else if (var1 <= 8) {
            Dev.ZWare.Client.pkg1.Class9.method_151(var1);
            return new Class12.Inner4(var2, -1, -1);
         } else {
            Dev.ZWare.Client.pkg1.Class9.method_145(var1);
            return new Class12.Inner4(-1, var1, -1);
         }
      }
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner5
   private Class12.Inner5 method_3000(int var1) {
      if (c.field_1724 == null) {
         return null;
      } else if (var1 == -1) {
         return new Class12.Inner5(-1);
      } else if (var1 >= 0 && var1 <= 35) {
         Dev.ZWare.Client.pkg1.Class9.method_152(var1);
         return new Class12.Inner5(var1);
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner4) void
   private void method_3001(Class12.Inner4 var1) {
      if (var1 != null) {
         if (var1.method_764() != -1) {
            Dev.ZWare.Client.pkg1.Class9.method_152(var1.method_764());
         }

         if (var1.method_763() != -1) {
            Dev.ZWare.Client.pkg1.Class9.method_145(var1.method_763());
         }

         if (var1.method_762() != -1) {
            Dev.ZWare.Client.pkg1.Class9.method_151(var1.method_762());
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class12$Inner5) void
   private void method_3002(Class12.Inner5 var1) {
      if (var1 != null && var1.method_548() != -1) {
         Dev.ZWare.Client.pkg1.Class9.method_152(var1.method_548());
      }
   }

   // $VF: renamed from: c () boolean
   private boolean method_3003() {
      long var1 = System.currentTimeMillis();
      this.method_3005(var1);
      int var3 = this.field_2346.method_671();
      return this.method_3006(var1, 1000L) >= var3 ? false : this.method_3006(var1, 500L) < this.method_3007(var3);
   }

   // $VF: renamed from: n () void
   private void method_3004() {
      long var1 = System.currentTimeMillis();
      this.method_3005(var1);
      this.field_2360.addLast(var1);
   }

   // $VF: renamed from: a (long) void
   private void method_3005(long var1) {
      while (!this.field_2360.isEmpty() && var1 - this.field_2360.peekFirst() >= 1000L) {
         this.field_2360.removeFirst();
      }
   }

   // $VF: renamed from: a (long, long) int
   private int method_3006(long var1, long var3) {
      int var5 = 0;

      for (Long var7 : this.field_2360) {
         if (var1 - var7 < var3) {
            var5++;
         }
      }

      return var5;
   }

   // $VF: renamed from: a (int) int
   private int method_3007(int var1) {
      return Math.max(1, (var1 + 1) / 2);
   }

   // $VF: renamed from: a (java.awt.Color, double) java.awt.Color
   private Color method_3008(Color var1, double var2) {
      int var4 = Math.max(0, Math.min(255, (int)Math.round(var1.getAlpha() * var2)));
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var4);
   }

   public static enum Inner1 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1236() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1237() {
         return this == Sides || this == Both;
      }
   }

   public static enum Inner2 {
      Main,
      Offhand;

      // $VF: renamed from: a () net.minecraft.util.Hand
      public Hand method_1163() {
         return this == Offhand ? Hand.field_5810 : Hand.field_5808;
      }
   }

   static class Inner3 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      final BlockPos field_51;
      // $VF: renamed from: b int
      final int field_52;
      // $VF: renamed from: c double
      final double field_53;
      // $VF: renamed from: d double
      final double field_54;

      Inner3(BlockPos var1, int var2, double var3, double var5) {
         this.field_51 = var1;
         this.field_52 = var2;
         this.field_53 = var3;
         this.field_54 = var5;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_111() {
         return this.field_51;
      }

      // $VF: renamed from: a () int
      int method_112() {
         return this.field_52;
      }

      // $VF: renamed from: a () double
      double method_113() {
         return this.field_53;
      }

      // $VF: renamed from: b () double
      double method_114() {
         return this.field_54;
      }
   }

   static class Inner4 {
      // $VF: renamed from: a int
      final int field_374;
      // $VF: renamed from: b int
      final int field_375;
      // $VF: renamed from: c int
      final int field_376;

      Inner4(int var1, int var2, int var3) {
         this.field_374 = var1;
         this.field_375 = var2;
         this.field_376 = var3;
      }

      // $VF: renamed from: a () int
      int method_762() {
         return this.field_374;
      }

      // $VF: renamed from: b () int
      int method_763() {
         return this.field_375;
      }

      // $VF: renamed from: c () int
      int method_764() {
         return this.field_376;
      }
   }

   static class Inner5 {
      // $VF: renamed from: a int
      final int field_273;

      Inner5(int var1) {
         this.field_273 = var1;
      }

      // $VF: renamed from: a () int
      int method_548() {
         return this.field_273;
      }
   }
}
