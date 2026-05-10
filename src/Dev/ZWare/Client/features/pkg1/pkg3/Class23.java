package Dev.ZWare.Client.features.pkg1.pkg3;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class23 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2002 = Math.PI / 13;
   // $VF: renamed from: p double
   private static final double field_2003 = Math.PI / 4;
   // $VF: renamed from: q double
   private static final double field_2004 = 0.2;
   // $VF: renamed from: r double
   private static final double field_2005 = 0.08;
   // $VF: renamed from: s double
   private static final double field_2006 = 1.15;
   // $VF: renamed from: t float
   private static final float field_2007 = 75.0F;
   // $VF: renamed from: u double
   private static final double field_2008 = 75.0;
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_2009 = this.a(
      "Phase Bind", Dev.ZWare.Client.features.pkg3.Class4.method_427()
   );
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2010 = this.a("Anti Void", true);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2011 = this.a("Chat Feedback", false);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_2012 = this.a("Chat Prefix", "Phase");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2013 = this.a("Chat Prefix Color", new Color(255, 170, 255, 255));
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2014 = this.a("Debug Render", false);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class23.Inner1> field_2015 = this.a("Debug Shape Mode", Class23.Inner1.Both);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2016 = this.a("Debug Side Color", new Color(0, 200, 255, 30));
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2017 = this.a("Debug Line Color", new Color(0, 200, 255, 255));
   // $VF: renamed from: E boolean
   private boolean field_2018;
   // $VF: renamed from: F boolean
   private boolean field_2019 = true;

   public Class23() {
      super("Phase", "Phases into walls using pearls.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2012.method_709(var1 -> this.field_2011.method_671());
      this.field_2013.method_709(var1 -> this.field_2011.method_671());
      this.field_2015.method_709(var1 -> this.field_2014.method_671());
      this.field_2016.method_709(var1 -> this.field_2014.method_671() && this.field_2015.method_671().method_1171());
      this.field_2017.method_709(var1 -> this.field_2014.method_671() && this.field_2015.method_671().method_1172());
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2018 = false;
      this.field_2019 = true;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2622(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g()) {
         this.method_2624();
         if (this.field_2018) {
            if (this.method_2632() && !c.field_1724.method_7357().method_7904(Items.field_8634.method_7854())) {
               float var2 = this.method_2636();
               Vec3d var3 = this.method_2637(var2);
               float[] var4 = Dev.ZWare.Client.Class1.field_298.method_332(var3);
               float var5 = var4[0];
               float var6 = this.method_2639() ? 75.0F : var4[1];
               if (Dev.ZWare.Client.Class1.field_298.method_312(var5, var6, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("PearlPhase", 75.0))) {
                  if (this.field_2018 && !g()) {
                     this.method_2625(var2, var5, var6);
                  }
               }
            } else {
               this.field_2018 = false;
            }
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   private void method_2623(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      if (!g()) {
         if (this.field_2018 || this.field_2014.method_671()) {
            if (this.field_2014.method_671()) {
               Vec3d var2 = this.method_2637(this.method_2636());
               if (this.field_2015.method_671().method_1171()) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), this.method_2641(var2), this.field_2016.method_671());
               }

               if (this.field_2015.method_671().method_1172()) {
                  Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), this.method_2641(var2), this.field_2017.method_671(), 1.0);
               }
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2624() {
      if (!this.field_2009.method_671().method_436()) {
         this.field_2019 = true;
      } else if (this.field_2019 && !(c.field_1755 instanceof ChatScreen)) {
         this.field_2018 = true;
         this.field_2019 = false;
      }
   }

   // $VF: renamed from: a (float, float, float) void
   private void method_2625(float var1, float var2, float var3) {
      if (c.field_1687 != null && c.method_1562() != null && c.field_1724 != null) {
         this.method_2626(var1);

         boolean var4 = switch (this.method_2633()) {
            case Offhand -> this.method_2629(var2, var3);
            case AltSilent -> this.method_2630(var2, var3);
            case Normal -> this.method_2628(var2, var3);
         };
         if (!var4) {
            this.field_2018 = false;
         } else {
            if (this.field_2011.method_671()) {
               this.method_2640();
            }

            this.field_2018 = false;
         }
      } else {
         this.field_2018 = false;
      }
   }

   // $VF: renamed from: a (float) void
   private void method_2626(float var1) {
      BlockPos var2 = c.field_1724.method_24515().method_10081(this.method_2635(var1)).method_10062();
      if (Dev.ZWare.Client.Class1.field_301.method_914(var2, c.field_1687.method_8320(var2), Blocks.field_10540.method_8389())) {
         try {
            Dev.ZWare.Client.Class1.field_301.method_918(Blocks.field_10540.method_8389(), var2);
         } finally {
            Dev.ZWare.Client.Class1.field_301.method_929();
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.Hand, float, float) void
   private void method_2627(Hand var1, float var2, float var3) {
      int var4 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
      c.method_1562().method_52787(new PlayerInteractItemC2SPacket(var1, var4, var2, var3));
   }

   // $VF: renamed from: a (float, float) boolean
   private boolean method_2628(float var1, float var2) {
      if (c.field_1724.method_6079().method_31574(Items.field_8634)) {
         this.method_2627(Hand.field_5810, var1, var2);
         return true;
      } else if (c.field_1724.method_6115()) {
         return false;
      } else if (c.field_1724.method_6047().method_31574(Items.field_8634)) {
         this.method_2627(Hand.field_5808, var1, var2);
         return true;
      } else {
         int var3 = this.method_2634(Items.field_8634);
         Dev.ZWare.Client.pkg1.Class9.Inner1 var4 = var3 == -1 ? null : Dev.ZWare.Client.pkg1.Class9.method_147(var3);
         if (var4 == null) {
            return false;
         } else {
            boolean var5;
            try {
               this.method_2627(Hand.field_5808, var1, var2);
               var5 = true;
            } finally {
               Dev.ZWare.Client.pkg1.Class9.method_149(var4);
            }

            return var5;
         }
      }
   }

   // $VF: renamed from: b (float, float) boolean
   private boolean method_2629(float var1, float var2) {
      if (c.field_1724.method_6079().method_31574(Items.field_8634)) {
         this.method_2627(Hand.field_5810, var1, var2);
         return true;
      } else {
         int var3;
         if (c.field_1724.method_6047().method_31574(Items.field_8634)) {
            var3 = c.field_1724.method_31548().method_67532();
         } else {
            var3 = this.method_2634(Items.field_8634);
         }

         if (var3 != -1 && Dev.ZWare.Client.pkg1.Class9.method_152(var3)) {
            boolean var4;
            try {
               this.method_2627(Hand.field_5810, var1, var2);
               var4 = true;
            } finally {
               Dev.ZWare.Client.pkg1.Class9.method_152(var3);
            }

            return var4;
         } else {
            return false;
         }
      }
   }

   // $VF: renamed from: c (float, float) boolean
   private boolean method_2630(float var1, float var2) {
      if (c.field_1724.method_6079().method_31574(Items.field_8634)) {
         this.method_2627(Hand.field_5810, var1, var2);
         return true;
      } else if (c.field_1724.method_6047().method_31574(Items.field_8634)) {
         this.method_2627(Hand.field_5808, var1, var2);
         return true;
      } else {
         int var3 = this.method_2634(Items.field_8634);
         Dev.ZWare.Client.pkg1.Class9.Inner1 var4 = var3 == -1 ? null : Dev.ZWare.Client.pkg1.Class9.method_147(var3);
         if (var4 == null) {
            return false;
         } else {
            boolean var5;
            try {
               this.method_2627(Hand.field_5808, var1, var2);
               var5 = true;
            } finally {
               Dev.ZWare.Client.pkg1.Class9.method_149(var4);
            }

            return var5;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item) boolean
   private boolean method_2631(Item var1) {
      return c.field_1724.method_6047().method_31574(var1) || c.field_1724.method_6079().method_31574(var1) || this.method_2634(var1) != -1;
   }

   // $VF: renamed from: a () boolean
   private boolean method_2632() {
      if (c.field_1724.method_6079().method_31574(Items.field_8634)) {
         return true;
      } else {
         return switch (this.method_2633()) {
            case Offhand, AltSilent -> this.method_2631(Items.field_8634);
            case Normal -> !c.field_1724.method_6115()
               && (c.field_1724.method_6047().method_31574(Items.field_8634) || this.method_2634(Items.field_8634) != -1);
         };
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class14$Inner1
   private Dev.ZWare.Client.features.pkg1.pkg4.Class14.Inner1 method_2633() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class14 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class14.method_2110();
      return var1 == null ? Dev.ZWare.Client.features.pkg1.pkg4.Class14.Inner1.Normal : var1.method_2112();
   }

   // $VF: renamed from: a (net.minecraft.item.Item) int
   private int method_2634(Item var1) {
      return Dev.ZWare.Client.pkg1.Class9.method_140(var1x -> var1x.method_31574(var1), 0, 35);
   }

   // $VF: renamed from: a (float) net.minecraft.util.math.BlockPos
   private BlockPos method_2635(float var1) {
      int var2 = MathHelper.method_15357(MathHelper.method_15393(var1) * 8.0F / 360.0F + 0.5) & 7;

      return switch (var2) {
         case 0 -> new BlockPos(0, 0, 1);
         case 1 -> new BlockPos(-1, 0, 1);
         case 2 -> new BlockPos(-1, 0, 0);
         case 3 -> new BlockPos(-1, 0, -1);
         case 4 -> new BlockPos(0, 0, -1);
         case 5 -> new BlockPos(1, 0, -1);
         case 6 -> new BlockPos(1, 0, 0);
         case 7 -> new BlockPos(1, 0, 1);
         default -> BlockPos.field_10980;
      };
   }

   // $VF: renamed from: a () float
   private float method_2636() {
      if (c.field_1724.field_3913 == null) {
         return c.field_1724.method_36454();
      } else {
         PlayerInput var1 = c.field_1724.field_3913.field_54155;
         float var2 = var1 == null ? 0.0F : (var1.comp_3159() ? 1.0F : 0.0F) - (var1.comp_3160() ? 1.0F : 0.0F);
         float var3 = var1 == null ? 0.0F : (var1.comp_3161() ? 1.0F : 0.0F) - (var1.comp_3162() ? 1.0F : 0.0F);
         float var4 = c.field_1724.method_36454();
         if (var2 > 0.0F) {
            if (var3 > 0.0F) {
               var4 -= 45.0F;
            } else if (var3 < 0.0F) {
               var4 += 45.0F;
            }
         } else if (var2 < 0.0F) {
            var4 += 180.0F;
            if (var3 > 0.0F) {
               var4 += 45.0F;
            } else if (var3 < 0.0F) {
               var4 -= 45.0F;
            }
         } else if (var3 > 0.0F) {
            var4 -= 90.0F;
         } else if (var3 < 0.0F) {
            var4 += 90.0F;
         }

         return MathHelper.method_15393(var4);
      }
   }

   // $VF: renamed from: a (float) net.minecraft.util.math.Vec3d
   private Vec3d method_2637(float var1) {
      double var2 = c.field_1724.method_23317();
      double var4 = c.field_1724.method_23318();
      double var6 = c.field_1724.method_23321();
      double var8 = Math.floor(var2);
      double var10 = Math.floor(var6);
      double var12 = var2 - var8;
      double var14 = var6 - var10;
      double var16 = Math.min(Math.PI / 13, 0.758339026646939);
      double var18 = Math.max(Math.PI / 13, 0.758339026646939);
      double var20 = Math.min(Math.PI / 4, 0.21460183660255172);
      double var22 = Math.max(Math.PI / 4, 0.21460183660255172);
      BlockPos var24 = this.method_2635(var1);

      double var25 = var8 + switch (Integer.signum(var24.method_10263())) {
         case -1 -> var16;
         case 1 -> var18;
         default -> this.method_2638(var12, var16, var18);
      };

      double var27 = var10 + switch (Integer.signum(var24.method_10260())) {
         case -1 -> var20;
         case 1 -> var22;
         default -> this.method_2638(var14, var20, var22);
      };
      double var29 = var2 + MathHelper.method_15350(var25 - var2, -0.2, 0.2);
      double var31 = var6 + MathHelper.method_15350(var27 - var6, -0.2, 0.2);
      double var33 = var4 - 0.5;
      if (this.method_2639()) {
         var33++;
      }

      return new Vec3d(var29, var33, var31);
   }

   // $VF: renamed from: a (double, double, double) double
   private double method_2638(double var1, double var3, double var5) {
      return Math.abs(var1 - var3) <= Math.abs(var1 - var5) ? var3 : var5;
   }

   // $VF: renamed from: b () boolean
   private boolean method_2639() {
      if (!this.field_2010.method_671()) {
         return false;
      } else {
         int var1 = c.field_1724.method_31478();
         return c.field_1687.method_27983() == World.field_25180 && var1 == 1 || c.field_1687.method_27983() == World.field_25179 && var1 == -63;
      }
   }

   // $VF: renamed from: o () void
   private void method_2640() {
      MutableText var1 = Text.method_43473();
      var1.method_10852(Text.method_43470("[").method_27692(Formatting.field_1080));
      var1.method_10852(
         Text.method_43470(this.field_2012.method_671())
            .method_10862(Style.field_24360.method_27703(TextColor.method_27717(this.field_2013.method_671().getRGB() & 16777215)))
      );
      var1.method_10852(Text.method_43470("] ").method_27692(Formatting.field_1080));
      var1.method_10852(Text.method_43470("Threw pearl.").method_27692(Formatting.field_1080));
      c.field_1724.method_7353(var1, false);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Box
   private Box method_2641(Vec3d var1) {
      return new Box(
         var1.field_1352 - 0.08, var1.field_1351 - 0.08, var1.field_1350 - 0.08, var1.field_1352 + 0.08, var1.field_1351 + 0.08, var1.field_1350 + 0.08
      );
   }

   private static enum Inner1 {
      Both,
      Sides,
      Lines;

      // $VF: renamed from: a () boolean
      boolean method_1171() {
         return this == Both || this == Sides;
      }

      // $VF: renamed from: b () boolean
      boolean method_1172() {
         return this == Both || this == Lines;
      }
   }
}
