package Dev.ZWare.Client.features.pkg1.pkg1;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;

public class Class10 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_2505 = -1;
   // $VF: renamed from: p double
   private static final double field_2506 = 60.0;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2507 = this.a("Ignite", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2508 = this.a("Auto Disable", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2509 = this.a("Feedback", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2510 = this.a("Render", true);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2511 = this.a("Fade Time", 0.2, 0.0, 1.0);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class10.Inner1> field_2512 = this.a("Shape Mode", Class10.Inner1.Both);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2513 = this.a("Side Color", 85, 0, 255, 40);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2514 = this.a("Line Color", 255, 255, 255, 60);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg1.pkg1.Class10$Inner3
   private Class10.Inner3 field_2515;
   // $VF: renamed from: z boolean
   private boolean field_2516;
   // $VF: renamed from: A boolean
   private boolean field_2517;
   // $VF: renamed from: B java.util.Map
   private final Map<BlockPos, Long> field_2518 = new HashMap<>();

   public Class10() {
      super("Auto Portal", "makes a fucking portal", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
      this.field_2512.method_709(var1 -> this.field_2510.method_671());
      this.field_2513.method_709(var1 -> this.field_2510.method_671() && this.field_2512.method_671().method_1218());
      this.field_2514.method_709(var1 -> this.field_2510.method_671() && this.field_2512.method_671().method_1217());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2515 = null;
      this.field_2516 = false;
      this.field_2517 = false;
      this.field_2518.clear();
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null) {
         this.field_2515 = this.method_3198();
      } else {
         this.k();
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2515 = null;
      this.field_2518.clear();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_2515 == null || c.field_1687 == null) {
         return null;
      } else {
         return this.method_3202() ? "Lit" : this.method_3199() + "/10";
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3192(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && Dev.ZWare.Client.Class1.field_301 != null) {
         if (this.field_2515 == null) {
            this.field_2515 = this.method_3198();
            if (this.field_2515 == null) {
               return;
            }
         }

         if (!this.method_3200()) {
            this.method_3193();
         } else if (this.field_2507.method_671() && !this.method_3202()) {
            this.method_3194();
         } else {
            if (this.field_2508.method_671()) {
               this.k();
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_2510.method_671() && !g() && this.field_2515 != null) {
         this.method_3204(event);
         this.method_3205(event);
      }
   }

   // $VF: renamed from: n () void
   private void method_3193() {
      Hand var1 = this.method_3197();
      if (var1 == null) {
         if (!this.field_2516) {
            this.method_3211("Missing obsidian.");
            this.field_2516 = true;
         }
      } else {
         List var2 = this.method_3201();
         if (!var2.isEmpty()) {
            if (Dev.ZWare.Client.Class1.field_301.method_917(var2, Items.field_8281, var1)) {
               long var3 = System.currentTimeMillis();

               try {
                  for (BlockPos var6 : var2) {
                     if (!this.method_3203(var6) && Dev.ZWare.Client.Class1.field_301.method_921(Items.field_8281, var6, c.field_1687.method_8320(var6), var1)) {
                        this.field_2518.put(var6.method_10062(), var3);
                     }
                  }
               } finally {
                  Dev.ZWare.Client.Class1.field_301.method_929();
               }
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_3194() {
      if (!this.method_3202()) {
         Class10.Inner2 var1 = this.method_3208(var0 -> var0.method_31574(Items.field_8884) || var0.method_31574(Items.field_8814));
         if (var1 == null) {
            if (!this.field_2517) {
               this.method_3211("Frame is complete. Need Flint and Steel or Fire Charge to ignite.");
               this.field_2517 = true;
            }
         } else {
            BlockHitResult var2 = this.method_3195();
            if (var2 != null) {
               if (Dev.ZWare.Client.Class1.field_298 != null) {
                  Dev.ZWare.Client.Class1.field_298.method_310(var2.method_17784(), 60.0);
               }

               boolean var3;
               if (var1.method_1325() == Hand.field_5810) {
                  var3 = this.method_3196(Hand.field_5810, var2);
               } else {
                  Class10.Inner4 var4 = this.method_3209(var1.method_1326());
                  if (var4 == null) {
                     return;
                  }

                  try {
                     var3 = this.method_3196(Hand.field_5808, var2);
                  } finally {
                     this.method_3210(var4);
                  }
               }

               if (var3) {
                  this.field_2517 = false;
               }
            }
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.util.hit.BlockHitResult
   private BlockHitResult method_3195() {
      for (BlockPos var2 : this.field_2515.method_1461()) {
         BlockState var3 = c.field_1687.method_8320(var2);
         if (var3.method_45474() || var3.method_26215()) {
            BlockPos var4 = var2.method_10074();
            if (c.field_1687.method_8320(var4).method_27852(Blocks.field_10540)) {
               return new BlockHitResult(var4.method_46558().method_1031(0.0, 0.5, 0.0), Direction.field_11036, var4, false);
            }
         }
      }

      return null;
   }

   // $VF: renamed from: a (net.minecraft.util.Hand, net.minecraft.util.hit.BlockHitResult) boolean
   private boolean method_3196(Hand var1, BlockHitResult var2) {
      if (var1 != null && var2 != null && c.method_1562() != null && c.field_1687 != null) {
         c.method_1562()
            .method_52787(new PlayerInteractBlockC2SPacket(var1, var2, ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942()));
         c.method_1562().method_52787(new HandSwingC2SPacket(var1));
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () net.minecraft.util.Hand
   private Hand method_3197() {
      if (!c.field_1724.method_6047().method_31574(Items.field_8281)
         && Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Items.field_8281), 0, 35) == -1) {
         return c.field_1724.method_6079().method_31574(Items.field_8281) ? Hand.field_5810 : null;
      } else {
         return Hand.field_5808;
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg1.Class10$Inner3
   private Class10.Inner3 method_3198() {
      Direction var1 = c.field_1724.method_5735();
      if (var1.method_10166().method_10178()) {
         return null;
      } else {
         Direction var2 = var1.method_10170();
         BlockPos var3 = c.field_1724.method_24515().method_10093(var1).method_10062();
         Direction var4 = var2.method_10153();
         BlockPos var5 = var3.method_10093(var2).method_10062();
         BlockPos var6 = var3.method_10093(var4).method_10062();
         BlockPos var7 = var3.method_10079(var2, 2).method_10062();
         ArrayList var8 = new ArrayList(10);
         var8.add(var3);
         var8.add(var5);

         for (int var9 = 1; var9 <= 3; var9++) {
            var8.add(var6.method_10086(var9).method_10062());
            var8.add(var7.method_10086(var9).method_10062());
         }

         var8.add(var3.method_10086(4).method_10062());
         var8.add(var5.method_10086(4).method_10062());
         List var10 = List.of(var3.method_10084().method_10062(), var5.method_10084().method_10062());
         return new Class10.Inner3(var8, var10);
      }
   }

   // $VF: renamed from: a () int
   private int method_3199() {
      int var1 = 0;

      for (BlockPos var3 : this.field_2515.method_1460()) {
         if (this.method_3203(var3)) {
            var1++;
         }
      }

      return var1;
   }

   // $VF: renamed from: a () boolean
   private boolean method_3200() {
      for (BlockPos var2 : this.field_2515.method_1460()) {
         if (!this.method_3203(var2)) {
            return false;
         }
      }

      return true;
   }

   // $VF: renamed from: b () java.util.List
   private List<BlockPos> method_3201() {
      ArrayList var1 = new ArrayList();

      for (BlockPos var3 : this.field_2515.method_1460()) {
         if (!this.method_3203(var3)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   // $VF: renamed from: b () boolean
   private boolean method_3202() {
      for (BlockPos var2 : this.field_2515.method_1461()) {
         BlockState var3 = c.field_1687.method_8320(var2);
         if (var3.method_27852(Blocks.field_10316) || var3.method_27852(Blocks.field_10036) || var3.method_27852(Blocks.field_22089)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_3203(BlockPos var1) {
      return c.field_1687.method_8320(var1).method_27852(Blocks.field_10540);
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   private void method_3204(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      if (!this.method_3202()) {
         boolean var2 = true;

         for (BlockPos var4 : this.field_2515.method_1460()) {
            if (!this.method_3203(var4)) {
               var2 = false;
               this.method_3206(var1, var4, this.field_2513.method_671(), this.field_2514.method_671());
            }
         }

         if (this.field_2507.method_671() && var2) {
            for (BlockPos var7 : this.field_2515.method_1461()) {
               BlockState var5 = c.field_1687.method_8320(var7);
               if (var5.method_45474() || var5.method_26215()) {
                  this.method_3206(var1, var7, this.field_2513.method_671(), this.field_2514.method_671());
               }
            }
         }
      }
   }

   // $VF: renamed from: c (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   private void method_3205(Dev.ZWare.Client.pkg2.pkg1.Class14 var1) {
      long var2 = System.currentTimeMillis();
      long var4 = Math.max(1L, (long)(this.field_2511.method_671() * 1000.0));
      Iterator var6 = this.field_2518.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         long var8 = var2 - (Long)var7.getValue();
         if (var8 > var4) {
            var6.remove();
         } else {
            double var10 = 1.0 - MathHelper.method_15350((double)var8 / var4, 0.0, 1.0);
            this.method_3206(
               var1, (BlockPos)var7.getKey(), this.method_3207(this.field_2513.method_671(), var10), this.method_3207(this.field_2514.method_671(), var10)
            );
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.BlockPos, java.awt.Color, java.awt.Color) void
   private void method_3206(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, BlockPos var2, Color var3, Color var4) {
      Box var5 = new Box(var2);
      if (this.field_2512.method_671().method_1218()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var5, var3);
      }

      if (this.field_2512.method_671().method_1217()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var5, var4, 1.0);
      }
   }

   // $VF: renamed from: a (java.awt.Color, double) java.awt.Color
   private Color method_3207(Color var1, double var2) {
      int var4 = MathHelper.method_15340((int)Math.round(var1.getAlpha() * var2), 0, 255);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var4);
   }

   // $VF: renamed from: a (java.util.function.Predicate) Dev.ZWare.Client.features.pkg1.pkg1.Class10$Inner2
   private Class10.Inner2 method_3208(Predicate<ItemStack> var1) {
      if (var1.test(c.field_1724.method_6079())) {
         return new Class10.Inner2(Hand.field_5810, -1);
      } else if (var1.test(c.field_1724.method_6047())) {
         return new Class10.Inner2(Hand.field_5808, -1);
      } else {
         int var2 = Dev.ZWare.Client.pkg1.Class9.method_140(var1, 0, 35);
         return var2 == -1 ? null : new Class10.Inner2(Hand.field_5808, var2);
      }
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg1.Class10$Inner4
   private Class10.Inner4 method_3209(int var1) {
      if (var1 == -1) {
         return new Class10.Inner4(null, -1, -1);
      } else {
         Dev.ZWare.Client.pkg1.Class9.Inner1 var2 = Dev.ZWare.Client.pkg1.Class9.method_147(var1);
         if (var2 != null) {
            return new Class10.Inner4(var2, -1, -1);
         } else {
            int var3 = c.field_1724.method_31548().method_67532();
            return !Dev.ZWare.Client.pkg1.Class9.method_145(var1) ? null : new Class10.Inner4(null, var3, var1 > 8 ? var1 : -1);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class10$Inner4) void
   private void method_3210(Class10.Inner4 var1) {
      if (var1 != null) {
         if (var1.method_1451() != null) {
            Dev.ZWare.Client.pkg1.Class9.method_149(var1.method_1451());
         } else {
            if (var1.method_1453() != -1) {
               Dev.ZWare.Client.pkg1.Class9.method_145(var1.method_1453());
            }

            if (var1.method_1452() != -1) {
               Dev.ZWare.Client.pkg1.Class9.method_151(var1.method_1452());
            }
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   private void method_3211(String var1, Object... var2) {
      if (this.field_2509.method_671()) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647(
            Formatting.field_1080 + "[AutoPortal] " + Formatting.field_1068 + String.format(Locale.ROOT, var1, var2)
         );
      }
   }

   public static enum Inner1 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1217() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1218() {
         return this == Sides || this == Both;
      }
   }

   private record Inner2(Hand bX, int bY) {
      // $VF: renamed from: bX net.minecraft.util.Hand
      private final Hand field_808;
      // $VF: renamed from: bY int
      private final int field_809;

      private Inner2(Hand bX, int bY) {
         this.field_808 = bX;
         this.field_809 = bY;
      }

      // $VF: renamed from: bX () net.minecraft.util.Hand
      public Hand method_1325() {
         return this.field_808;
      }

      // $VF: renamed from: bY () int
      public int method_1326() {
         return this.field_809;
      }
   }

   private record Inner3(List<BlockPos> bS, List<BlockPos> bT) {
      // $VF: renamed from: bS java.util.List
      private final List<BlockPos> field_930;
      // $VF: renamed from: bT java.util.List
      private final List<BlockPos> field_931;

      private Inner3(List<BlockPos> bS, List<BlockPos> bT) {
         this.field_930 = bS;
         this.field_931 = bT;
      }

      // $VF: renamed from: bS () java.util.List
      public List<BlockPos> method_1460() {
         return this.field_930;
      }

      // $VF: renamed from: bT () java.util.List
      public List<BlockPos> method_1461() {
         return this.field_931;
      }
   }

   private record Inner4(Dev.ZWare.Client.pkg1.Class9.Inner1 bU, int bV, int bW) {
      // $VF: renamed from: bU Dev.ZWare.Client.pkg1.Class9$Inner1
      private final Dev.ZWare.Client.pkg1.Class9.Inner1 field_921;
      // $VF: renamed from: bV int
      private final int field_922;
      // $VF: renamed from: bW int
      private final int field_923;

      private Inner4(Dev.ZWare.Client.pkg1.Class9.Inner1 bU, int bV, int bW) {
         this.field_921 = bU;
         this.field_922 = bV;
         this.field_923 = bW;
      }

      // $VF: renamed from: bU () Dev.ZWare.Client.pkg1.Class9$Inner1
      public Dev.ZWare.Client.pkg1.Class9.Inner1 method_1451() {
         return this.field_921;
      }

      // $VF: renamed from: bV () int
      public int method_1452() {
         return this.field_922;
      }

      // $VF: renamed from: bW () int
      public int method_1453() {
         return this.field_923;
      }
   }
}
