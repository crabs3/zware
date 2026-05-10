package Dev.ZWare.Client.features.pkg1.pkg3;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public class Class11 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2109 = 14.0;
   // $VF: renamed from: p double
   private static final double field_2110 = 4.5;
   // $VF: renamed from: q int
   private static final int field_2111 = 40;
   // $VF: renamed from: r double
   private static final double field_2112 = 9.0;
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class7
   private final Dev.ZWare.Client.features.pkg3.Class7 field_2113 = (Dev.ZWare.Client.features.pkg3.Class7)this.a(
      new Dev.ZWare.Client.features.pkg3.Class7("Blocks").a("General")
   );
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2114 = this.a("Only Above", true).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_2115 = this.a(
         "Toggle Mace Requirement", Dev.ZWare.Client.features.pkg3.Class4.method_427()
      )
      .method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2116 = this.a("Pause While Eating", true).method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2117 = this.a("Prediction", true).method_683("Prediction");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2118 = this.a("Fall Prediction Ticks", 3, 0, 20).method_683("Prediction");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2119 = this.a("Elytra Prediction Ticks", 3, 0, 20).method_683("Prediction");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2120 = this.a("Render", true).method_683("Render");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class11.Inner1> field_2121 = this.a("Shape Mode", Class11.Inner1.Both).method_683("Render");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2122 = this.a("Predict Color", 255, 140, 0, 35).method_683("Render");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2123 = this.a("Placement Color", 0, 200, 255, 35).method_683("Render");
   // $VF: renamed from: D java.util.List
   private final List<BlockPos> field_2124 = new ArrayList<>();
   // $VF: renamed from: E java.util.Map
   private final Map<UUID, Vec3d> field_2125 = new HashMap<>();
   // $VF: renamed from: F java.util.Map
   private final Map<UUID, Vec3d> field_2126 = new HashMap<>();
   // $VF: renamed from: G java.util.Map
   private final Map<UUID, Long> field_2127 = new HashMap<>();
   // $VF: renamed from: H java.util.Map
   private final Map<UUID, Integer> field_2128 = new HashMap<>();
   // $VF: renamed from: I net.minecraft.entity.player.PlayerEntity
   private PlayerEntity field_2129;
   // $VF: renamed from: J net.minecraft.util.math.Vec3d
   private Vec3d field_2130;
   // $VF: renamed from: K java.util.UUID
   private UUID field_2131;
   // $VF: renamed from: L double
   private double field_2132;
   // $VF: renamed from: M boolean
   private boolean field_2133 = true;
   // $VF: renamed from: N boolean
   private boolean field_2134;

   public Class11() {
      super(
         "Anti Mace",
         "Places a 7-block pattern at the predicted position of a falling or elytra mace attacker.",
         Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT,
         true,
         false,
         false
      );
      LinkedHashSet var1 = new LinkedHashSet();
      var1.add(Blocks.field_10540);
      var1.add(Blocks.field_22423);
      this.field_2113.e(var1);
      this.field_2118.method_709(var1x -> this.field_2117.method_671());
      this.field_2119.method_709(var1x -> this.field_2117.method_671());
      this.field_2121.method_709(var1x -> this.field_2120.method_671());
      this.field_2122.method_709(var1x -> this.field_2120.method_671());
      this.field_2123.method_709(var1x -> this.field_2120.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2744();
      this.field_2133 = true;
      this.field_2134 = false;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2744();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_2129 == null) {
         return this.field_2133 ? "Mace Only" : "Any Item";
      } else {
         return String.format(Locale.ROOT, "%s [%.1f]", this.field_2129.method_5477().getString(), this.field_2132);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2741(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g()) {
         if (var1.method_1045() instanceof PlaySoundS2CPacket var2 && var2.method_11894().comp_349() == SoundEvents.field_14702) {
            Vec3d var6 = new Vec3d(var2.method_11890(), var2.method_11889(), var2.method_11893());

            for (PlayerEntity var5 : c.field_1687.method_18456()) {
               if (var5 != null && var5.method_5805() && !var5.method_31481() && var5.method_19538().method_1025(var6) < 9.0) {
                  this.field_2128.put(var5.method_5667(), 40);
                  break;
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2742(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      this.method_2746();
      this.method_2745();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2743(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      this.field_2130 = null;
      this.field_2124.clear();
      this.field_2132 = 0.0;
      if (g()) {
         this.field_2129 = null;
         this.field_2131 = null;
      } else if (!this.field_2116.method_671() || !c.field_1724.method_6115()) {
         this.field_2129 = this.method_2747();
         if (this.field_2129 == null) {
            this.field_2131 = null;
         } else {
            if (!this.field_2129.method_5667().equals(this.field_2131)) {
               this.field_2131 = this.field_2129.method_5667();
            }

            UUID var2 = this.field_2129.method_5667();
            long var3 = c.field_1687.method_8510();
            Vec3d var5 = this.field_2129.method_19538();
            Vec3d var6 = this.field_2125.get(var2);
            Long var7 = this.field_2127.get(var2);
            if (var6 != null && var7 != null) {
               long var8 = Math.max(1L, var3 - var7);
               this.field_2126.put(var2, var5.method_1020(var6).method_1021(1.0 / var8));
            } else {
               this.field_2126.put(var2, this.field_2129.method_18798());
            }

            this.field_2125.put(var2, var5);
            this.field_2127.put(var2, var3);
            Vec3d var19 = this.field_2117.method_671() ? this.method_2750(this.field_2129, var2, var5) : var5;
            Vec3d var9 = c.field_1724.method_33571();
            this.field_2132 = Math.sqrt(var9.method_1025(var19));
            BlockPos var10 = BlockPos.method_49638(var19);
            this.field_2130 = Vec3d.method_24953(var10);
            if (!(this.field_2132 > 4.5)) {
               if (Dev.ZWare.Client.Class1.field_301 != null) {
                  Block var11 = this.method_2752();
                  if (var11 != null) {
                     List var12 = this.method_2751(var10);
                     var12.sort(Comparator.comparingDouble(var1x -> var9.method_1025(Vec3d.method_24953(var1x))));
                     boolean var13 = false;
                     if (Dev.ZWare.Client.Class1.field_301.method_916(var12, var11.method_8389())) {
                        try {
                           for (BlockPos var15 : var12) {
                              if (Dev.ZWare.Client.Class1.field_301.method_919(var11, var15)) {
                                 this.field_2124.add(var15.method_10062());
                                 var13 = true;
                              }
                           }
                        } finally {
                           Dev.ZWare.Client.Class1.field_301.method_929();
                        }
                     }

                     if (var13) {
                        ;
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2120.method_671()) {
         if (this.field_2130 != null) {
            Box var2 = new Box(
               this.field_2130.field_1352 - 0.1,
               this.field_2130.field_1351 - 0.1,
               this.field_2130.field_1350 - 0.1,
               this.field_2130.field_1352 + 0.1,
               this.field_2130.field_1351 + 0.1,
               this.field_2130.field_1350 + 0.1
            );
            this.method_2755(event, var2, this.field_2122.method_671());
         }

         for (BlockPos var3 : this.field_2124) {
            this.method_2755(event, new Box(var3), this.field_2123.method_671());
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2744() {
      this.field_2129 = null;
      this.field_2130 = null;
      this.field_2124.clear();
      this.field_2125.clear();
      this.field_2126.clear();
      this.field_2127.clear();
      this.field_2128.clear();
      this.field_2131 = null;
      this.field_2132 = 0.0;
   }

   // $VF: renamed from: o () void
   private void method_2745() {
      Dev.ZWare.Client.features.pkg3.Class4 var1 = this.field_2115.method_671();
      boolean var2 = c.field_1755 == null && var1 != null && !var1.method_432() && var1.method_436();
      if (var2) {
         if (!this.field_2134) {
            this.field_2133 = !this.field_2133;
            Dev.ZWare.Client.features.pkg2.Class1.method_1647("AntiMace: mace requirement " + (this.field_2133 ? "enabled." : "disabled."));
            this.field_2134 = true;
         }
      } else {
         this.field_2134 = false;
      }
   }

   // $VF: renamed from: p () void
   private void method_2746() {
      if (!this.field_2128.isEmpty()) {
         this.field_2128.entrySet().removeIf(var0 -> var0.getValue() == null || var0.getValue() <= 1);

         for (Entry var2 : this.field_2128.entrySet()) {
            var2.setValue((Integer)var2.getValue() - 1);
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.entity.player.PlayerEntity
   private PlayerEntity method_2747() {
      if (c.field_1687 != null && c.field_1724 != null) {
         PlayerEntity var1 = null;
         double var2 = Double.MAX_VALUE;
         double var4 = 196.0;

         for (PlayerEntity var7 : c.field_1687.method_18456()) {
            if (this.method_2749(var7, var4)
               && (!this.field_2114.method_671() || !(var7.method_23318() <= c.field_1724.method_23318() + 1.0))
               && (!this.field_2133 || this.method_2753(var7))
               && this.method_2748(var7)) {
               double var8 = c.field_1724.method_5858(var7);
               if (var8 < var2) {
                  var2 = var8;
                  var1 = var7;
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2748(PlayerEntity var1) {
      if (var1 == null) {
         return false;
      } else if (var1.method_6128()) {
         return true;
      } else if (!var1.method_24828()) {
         return true;
      } else {
         Vec3d var2 = this.field_2126.get(var1.method_5667());
         return var2 != null && var2.field_1351 < -0.25 ? true : var1.method_18798().field_1351 < -0.25;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, double) boolean
   private boolean method_2749(PlayerEntity var1, double var2) {
      if (var1 == null || var1 == c.field_1724 || var1 == c.field_1719) {
         return false;
      } else if (!var1.method_5805() || var1.method_31481() || var1.method_7325() || var1.method_68878()) {
         return false;
      } else {
         return Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_377(var1)
            ? false
            : c.field_1724.method_33571().method_1025(var1.method_19538()) <= var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, java.util.UUID, net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_2750(PlayerEntity var1, UUID var2, Vec3d var3) {
      if (var1.method_6128()) {
         int var5 = this.field_2119.method_671();
         if (var5 <= 0) {
            return var3;
         } else {
            return this.field_2128.containsKey(var2)
               ? Dev.ZWare.Client.pkg1.Class18.method_215(var1, var5)
               : Dev.ZWare.Client.pkg1.Class18.method_214(var1, var5);
         }
      } else {
         int var4 = this.field_2118.method_671();
         return var4 <= 0 ? var3 : Dev.ZWare.Client.pkg1.Class18.method_217(var3, this.field_2126.getOrDefault(var2, var1.method_18798()), var4);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) java.util.List
   private List<BlockPos> method_2751(BlockPos var1) {
      ArrayList var2 = new ArrayList(7);
      var2.add(var1.method_10062());
      var2.add(var1.method_10084().method_10062());
      var2.add(var1.method_10074().method_10062());
      var2.add(var1.method_10095().method_10062());
      var2.add(var1.method_10072().method_10062());
      var2.add(var1.method_10078().method_10062());
      var2.add(var1.method_10067().method_10062());
      return var2;
   }

   // $VF: renamed from: a () net.minecraft.block.Block
   private Block method_2752() {
      for (Block var2 : (Set)this.field_2113.a()) {
         if (var2 != null && var2 != Blocks.field_10124) {
            Item var3 = var2.method_8389();
            if (var3 != Items.field_8162 && Dev.ZWare.Client.pkg1.Class9.method_140(var1 -> var1.method_31574(var3), 0, 35) != -1) {
               return var2;
            }
         }
      }

      return null;
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2753(PlayerEntity var1) {
      return this.method_2754(var1.method_6047()) || this.method_2754(var1.method_6079());
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2754(ItemStack var1) {
      if (var1 != null && !var1.method_7960()) {
         Item var2 = var1.method_7909();
         return var2 == Items.field_49814 ? true : Registries.field_41178.method_10221(var2).method_12832().equals("mace");
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, java.awt.Color) void
   private void method_2755(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, Color var3) {
      if (this.field_2121.method_671().method_1123()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var2, var3);
      }

      if (this.field_2121.method_671().method_1122()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var2, var3, 1.0);
      }
   }

   public static enum Inner1 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1122() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1123() {
         return this == Sides || this == Both;
      }
   }
}
