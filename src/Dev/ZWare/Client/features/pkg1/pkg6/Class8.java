package Dev.ZWare.Client.features.pkg1.pkg6;

import Dev.ZWare.Client.mixin.Class34;
import Dev.ZWare.Client.pkg2.pkg1.Class16;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.InputUtil.Key;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.Hand;

public class Class8 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o int
   private static final int field_2861 = 1;
   // $VF: renamed from: p int
   private static final int field_2862 = 37;
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg1.pkg6.Class8
   private static Class8 field_2863;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2864 = this.a("Eatting", true);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2865 = this.a("Crawl", true);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2866 = this.a("Inventory Move", false);
   // $VF: renamed from: u int
   private int field_2867;
   // $VF: renamed from: v int
   private int field_2868;
   // $VF: renamed from: w boolean
   private boolean field_2869;
   // $VF: renamed from: x boolean
   private boolean field_2870;
   // $VF: renamed from: y boolean
   private boolean field_2871;
   // $VF: renamed from: z boolean
   private boolean field_2872;

   public Class8() {
      super("No Slow", "whats noslow idk", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MOVEMENT, true, false, false);
      field_2863 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg6.Class8
   public static Class8 method_3576() {
      return field_2863;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3595();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_3595();
      this.method_3589();
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      if (g()) {
         this.method_3595();
      } else {
         if (this.field_2866.method_671()) {
            this.method_3586();
         }

         boolean var1 = this.method_3591();
         if (this.field_2872 && !var1) {
            this.method_3594();
         }

         this.field_2872 = var1;
         if (!var1 && !this.method_3592()) {
            this.method_3594();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_3577(Class16.Inner3 var1) {
      if (!this.e()) {
         if (this.field_2864.method_671()) {
            if (var1.method_1045() instanceof PlayerInteractItemC2SPacket var2) {
               if (var2.method_12551() == Hand.field_5808) {
                  if (this.method_3593(c.field_1724.method_6047())) {
                     this.field_2869 = true;
                     this.field_2867 = 1;
                     this.field_2868 = 37;
                     this.field_2870 = true;
                     this.field_2871 = false;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.network.ClientPlayerEntity) boolean
   public static boolean method_3578(ClientPlayerEntity player) {
      Class8 var1 = method_3596();
      if (var1 == null) {
         return false;
      } else if (player == null) {
         return false;
      } else {
         return var1.field_2864.method_671() && var1.method_3590() ? true : var1.field_2865.method_671() && player.method_20448();
      }
   }

   // $VF: renamed from: a () boolean
   public static boolean method_3579() {
      Class8 var0 = method_3596();
      return var0 != null && var0.method_3590();
   }

   // $VF: renamed from: b () boolean
   public static boolean method_3580() {
      Class8 var0 = method_3596();
      return var0 != null && var0.method_3590() && c.field_1724 != null && c.field_1724.method_5624();
   }

   // $VF: renamed from: a (net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket) void
   public static void method_3581(PlayerMoveC2SPacket packet) {
      Class8 var1 = method_3596();
      if (var1 != null) {
         var1.method_3585(packet);
      }
   }

   // $VF: renamed from: b (net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket) void
   public static void method_3582(PlayerMoveC2SPacket packet) {
   }

   // $VF: renamed from: n () void
   public static void method_3583() {
   }

   // $VF: renamed from: o () void
   public static void method_3584() {
      Class8 var0 = method_3596();
      if (var0 != null) {
         var0.method_3586();
      }
   }

   // $VF: renamed from: c (net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket) void
   private void method_3585(PlayerMoveC2SPacket var1) {
      if (this.field_2864.method_671()) {
         if (this.method_3590()) {
            if (var1.method_36171()) {
               if (this.field_2870) {
                  this.field_2870 = false;
               } else if (this.field_2867 > 0) {
                  if (var1.method_12273() && var1.method_36172()) {
                     this.field_2867--;
                  }
               } else if (var1.method_36172()) {
                  if (var1.method_12273() || this.field_2871) {
                     if (this.field_2868 > 0) {
                        if (c.field_1724 != null && c.field_1724.field_3944 != null) {
                           int var2 = c.field_1724.method_31548().method_67532();
                           if (var2 >= 0 && var2 <= 8) {
                              c.field_1724.field_3944.method_52787(new UpdateSelectedSlotC2SPacket(var2));
                              if (var1.method_12273()) {
                                 this.field_2871 = true;
                              }

                              this.field_2868--;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_3586() {
      if (this.field_2866.method_671()) {
         if (c != null && c.field_1724 != null && c.field_1690 != null && c.method_22683() != null) {
            if (this.method_3587()) {
               long var1 = c.method_22683().method_4490();
               this.method_3588(c.field_1690.field_1894, var1);
               this.method_3588(c.field_1690.field_1881, var1);
               this.method_3588(c.field_1690.field_1913, var1);
               this.method_3588(c.field_1690.field_1849, var1);
               this.method_3588(c.field_1690.field_1903, var1);
               this.method_3588(c.field_1690.field_1867, var1);
               this.method_3588(c.field_1690.field_1832, var1);
            }
         }
      }
   }

   // $VF: renamed from: c () boolean
   private boolean method_3587() {
      return this.field_2866.method_671() && c.field_1755 != null && !(c.field_1755 instanceof ChatScreen);
   }

   // $VF: renamed from: a (net.minecraft.client.option.KeyBinding, long) void
   private void method_3588(KeyBinding var1, long var2) {
      Key var4 = ((Class34)var1).zware$getBoundKey();
      if (var4 != null) {
         boolean var5 = InputUtil.method_15987(var2, var4.method_1444());
         KeyBinding.method_1416(var4, var5);
         var1.method_23481(var5);
      }
   }

   // $VF: renamed from: q () void
   private void method_3589() {
      if (c != null && c.field_1690 != null) {
         c.field_1690.field_1894.method_23481(false);
         c.field_1690.field_1881.method_23481(false);
         c.field_1690.field_1913.method_23481(false);
         c.field_1690.field_1849.method_23481(false);
         c.field_1690.field_1903.method_23481(false);
         c.field_1690.field_1867.method_23481(false);
         c.field_1690.field_1832.method_23481(false);
      }
   }

   // $VF: renamed from: n () boolean
   private boolean method_3590() {
      return this.field_2864.method_671() && (this.method_3591() || this.field_2867 > 0 || this.field_2868 > 0 || this.field_2869);
   }

   // $VF: renamed from: o () boolean
   private boolean method_3591() {
      if (c.field_1724 == null) {
         return false;
      } else {
         return c.field_1724.method_6115() && c.field_1724.method_6058() == Hand.field_5808 ? this.method_3593(c.field_1724.method_6030()) : false;
      }
   }

   // $VF: renamed from: p () boolean
   private boolean method_3592() {
      if (c.field_1724 == null) {
         return false;
      } else {
         return !c.field_1690.field_1904.method_1434() ? false : this.method_3593(c.field_1724.method_6047());
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_3593(ItemStack var1) {
      if (var1 != null && !var1.method_7960()) {
         UseAction var2 = var1.method_7976();
         return var2 == UseAction.field_8950 || var2 == UseAction.field_8946;
      } else {
         return false;
      }
   }

   // $VF: renamed from: r () void
   private void method_3594() {
      this.field_2867 = 0;
      this.field_2868 = 0;
      this.field_2869 = false;
      this.field_2870 = false;
      this.field_2871 = false;
   }

   // $VF: renamed from: s () void
   private void method_3595() {
      this.method_3594();
      this.field_2872 = false;
   }

   // $VF: renamed from: b () Dev.ZWare.Client.features.pkg1.pkg6.Class8
   private static Class8 method_3596() {
      if (Dev.ZWare.Client.Class1.field_316 == null) {
         return field_2863 != null && field_2863.d() ? field_2863 : null;
      } else {
         Class8 var0 = Dev.ZWare.Client.Class1.field_316.method_510(Class8.class);
         return var0 != null && var0.d() ? var0 : null;
      }
   }
}
