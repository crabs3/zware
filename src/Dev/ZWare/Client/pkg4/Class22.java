package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.function.Predicate;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;

public class Class22 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c java.lang.Object
   private final Object field_274 = new Object();
   // $VF: renamed from: d Dev.ZWare.Client.pkg4.Class22$Inner1
   private final Class22.Inner1 field_275 = new Class22.Inner1();
   // $VF: renamed from: e Dev.ZWare.Client.pkg4.Class22$Inner1
   private final Class22.Inner1 field_276 = new Class22.Inner1();

   public Class22() {
      b.a(this);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class5$Inner1
   public Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1 method_549() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_554();
      return var1 != null ? var1.method_3094() : Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.Auto;
   }

   // $VF: renamed from: a () boolean
   public boolean method_550() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_554();
      return var1 != null && var1.method_3095();
   }

   // $VF: renamed from: b () boolean
   public boolean method_551() {
      Dev.ZWare.Client.pkg1.pkg7.Class2 var1 = this.method_572();
      if (var1 != null) {
         return var1.method_608(false);
      } else {
         return a.field_1755 != null && !this.method_550()
            ? a.field_1755 instanceof HandledScreen
               && !(a.field_1755 instanceof InventoryScreen)
               && !(a.field_1755 instanceof CreativeInventoryScreen)
               && !(a.field_1755 instanceof ChatScreen)
            : false;
      }
   }

   // $VF: renamed from: a (int) boolean
   public boolean method_552(int inventorySlot) {
      if (inventorySlot >= 0 && inventorySlot <= 8) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1 var2 = this.method_549();
         return var2 == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.Auto || var2 == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.SilentHotbar;
      } else {
         return false;
      }
   }

   // $VF: renamed from: c () boolean
   public boolean method_553() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1 var1 = this.method_549();
      return var1 == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.Auto || var1 == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.SilentSwap;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class9
   private Dev.ZWare.Client.features.pkg1.pkg4.Class9 method_554() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class9.class);
         if (var1 != null) {
            return var1;
         }
      }

      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3092();
   }

   // $VF: renamed from: b (int) boolean
   public boolean method_555(int slot) {
      Dev.ZWare.Client.pkg1.pkg7.Class3 var2 = this.method_573();
      if (var2 != null) {
         return var2.method_467(slot);
      } else if (a.field_1724 != null && a.method_1562() != null && slot >= 0 && slot <= 8 && !this.method_551()) {
         if (a.field_1724.method_31548().method_67532() != slot) {
            a.field_1724.method_31548().method_61496(slot);
         }

         a.method_1562().method_52787(new UpdateSelectedSlotC2SPacket(slot));
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item, boolean) boolean
   public boolean method_556(Item item, boolean instant) {
      Class22.Inner2 var3 = this.method_567(var1 -> var1.method_31574(item));
      if (this.method_549() == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.None && !var3.method_1406()) {
         return false;
      } else if (this.method_549() == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.SilentHotbar && !var3.method_1404()) {
         return false;
      } else {
         if (!var3.method_1404()) {
            var3 = this.method_568(var1 -> var1.method_31574(item));
         }

         return var3.method_1404() && this.method_558(var3, instant);
      }
   }

   // $VF: renamed from: a (int, boolean) boolean
   public boolean method_557(int inventorySlot, boolean instant) {
      if (a.field_1724 != null && inventorySlot >= 0 && inventorySlot <= 35) {
         ItemStack var3 = a.field_1724.method_31548().method_5438(inventorySlot);
         return var3.method_7960() ? false : this.method_558(new Class22.Inner2(inventorySlot, var3.method_7947()), instant);
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class22$Inner2, boolean) boolean
   public boolean method_558(Class22.Inner2 result, boolean instant) {
      if (a.field_1724 != null && a.field_1761 != null && a.method_1562() != null && result.method_1404()) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1 var3 = this.method_549();
         if (var3 == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.None && !result.method_1406()) {
            return false;
         } else if (var3 == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.SilentHotbar && !result.method_1405()) {
            return false;
         } else if (!instant && a.field_1724.method_6115() && a.field_1724.method_6058() == Hand.field_5808) {
            return false;
         } else {
            Class22.Inner1 var4 = this.method_571(instant);
            synchronized (this.field_274) {
               if (this.field_276.field_119) {
                  return false;
               }

               if (this.field_275.field_119 && !instant) {
                  return false;
               }

               var4.method_273();
               var4.field_119 = true;
            }

            if (result.method_1406()) {
               var4.field_120 = true;
               return true;
            } else {
               return switch (var3) {
                  case None -> {
                     this.method_566(var4);
                     yield false;
                  }
                  case Auto -> this.method_563(result, instant, var4);
                  case SilentHotbar -> this.method_564(result, instant, var4);
                  case SilentSwap -> this.method_565(result, var4);
               };
            }
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item) boolean
   public boolean method_559(Item item) {
      return this.method_560(item).method_1404();
   }

   // $VF: renamed from: a (net.minecraft.item.Item) Dev.ZWare.Client.pkg4.Class22$Inner2
   public Class22.Inner2 method_560(Item item) {
      Class22.Inner2 var2 = this.method_567(var1 -> var1.method_31574(item));
      if (this.method_549() == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.None && !var2.method_1406()) {
         return Class22.Inner2.field_881;
      } else if (this.method_549() == Dev.ZWare.Client.features.pkg1.pkg4.Class5.Inner1.SilentHotbar && !var2.method_1404()) {
         return Class22.Inner2.field_881;
      } else {
         if (!var2.method_1404()) {
            var2 = this.method_568(var1 -> var1.method_31574(item));
         }

         return var2.method_1404() ? var2 : Class22.Inner2.field_881;
      }
   }

   // $VF: renamed from: a (boolean) void
   public void method_561(boolean instantSwap) {
      Class22.Inner1 var2 = this.method_571(instantSwap);
      synchronized (this.field_274) {
         if (!var2.field_119) {
            return;
         }
      }

      if (!var2.field_120) {
         if (var2.field_121) {
            this.method_569(var2.field_125, var2.field_124);
         } else {
            this.method_555(var2.field_122);
         }
      }

      synchronized (this.field_274) {
         var2.method_273();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_562(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (a.field_1687 == null || a.field_1724 == null) {
         synchronized (this.field_274) {
            this.field_275.method_273();
            this.field_276.method_273();
         }
      } else if (this.field_275.field_119 && !this.field_275.field_120) {
         if (this.field_275.field_121) {
            int var5 = a.field_1724.method_31548().method_67532();
            if (var5 != this.field_275.field_124) {
               this.method_555(this.field_275.field_124);
            }
         } else {
            int var2 = a.field_1724.method_31548().method_67532();
            if (var2 != this.field_275.field_123) {
               this.method_555(this.field_275.field_123);
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class22$Inner2, boolean, Dev.ZWare.Client.pkg4.Class22$Inner1) boolean
   private boolean method_563(Class22.Inner2 var1, boolean var2, Class22.Inner1 var3) {
      boolean var4 = !var1.method_1405() || this.field_275.field_119 && var2 || a.field_1724.method_6115() && a.field_1724.method_6058() == Hand.field_5808;
      return var4 ? this.method_565(var1, var3) : this.method_564(var1, var2, var3);
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg4.Class22$Inner2, boolean, Dev.ZWare.Client.pkg4.Class22$Inner1) boolean
   private boolean method_564(Class22.Inner2 var1, boolean var2, Class22.Inner1 var3) {
      if (!var1.method_1405()) {
         this.method_566(var3);
         return false;
      } else {
         var3.field_122 = a.field_1724.method_31548().method_67532();
         var3.field_123 = var1.method_1407();
         var3.field_121 = false;
         Dev.ZWare.Client.pkg1.pkg7.Class3 var4 = this.method_573();
         boolean var5 = var4 != null ? var4.method_468(var1.method_1407(), var2) : this.method_555(var1.method_1407());
         if (!var5) {
            this.method_566(var3);
            return false;
         } else {
            return true;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class22$Inner2, Dev.ZWare.Client.pkg4.Class22$Inner1) boolean
   private boolean method_565(Class22.Inner2 var1, Class22.Inner1 var2) {
      if (this.method_551()) {
         this.method_566(var2);
         return false;
      } else {
         var2.field_125 = var1.method_1407();
         var2.field_124 = a.field_1724.method_31548().method_67532();
         var2.field_121 = true;
         if (!this.method_569(var1.method_1407(), var2.field_124)) {
            this.method_566(var2);
            return false;
         } else {
            return true;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class22$Inner1) void
   private void method_566(Class22.Inner1 var1) {
      synchronized (this.field_274) {
         var1.method_273();
      }
   }

   // $VF: renamed from: a (java.util.function.Predicate) Dev.ZWare.Client.pkg4.Class22$Inner2
   private Class22.Inner2 method_567(Predicate<ItemStack> var1) {
      if (a.field_1724 == null) {
         return Class22.Inner2.field_881;
      } else {
         int var2 = a.field_1724.method_31548().method_67532();
         if (this.method_570(var2) && var1.test(a.field_1724.method_31548().method_5438(var2))) {
            return new Class22.Inner2(var2, a.field_1724.method_31548().method_5438(var2).method_7947());
         } else {
            for (int var3 = 0; var3 <= 8; var3++) {
               ItemStack var4 = a.field_1724.method_31548().method_5438(var3);
               if (var1.test(var4)) {
                  return new Class22.Inner2(var3, var4.method_7947());
               }
            }

            return Class22.Inner2.field_881;
         }
      }
   }

   // $VF: renamed from: b (java.util.function.Predicate) Dev.ZWare.Client.pkg4.Class22$Inner2
   private Class22.Inner2 method_568(Predicate<ItemStack> var1) {
      if (a.field_1724 == null) {
         return Class22.Inner2.field_881;
      } else {
         int var2 = a.field_1724.method_31548().method_67532();
         if (this.method_570(var2) && var1.test(a.field_1724.method_31548().method_5438(var2))) {
            return new Class22.Inner2(var2, a.field_1724.method_31548().method_5438(var2).method_7947());
         } else {
            for (int var3 = 0; var3 <= 35; var3++) {
               ItemStack var4 = a.field_1724.method_31548().method_5438(var3);
               if (var1.test(var4)) {
                  return new Class22.Inner2(var3, var4.method_7947());
               }
            }

            return Class22.Inner2.field_881;
         }
      }
   }

   // $VF: renamed from: a (int, int) boolean
   private boolean method_569(int var1, int var2) {
      if (a.field_1724 != null && a.field_1761 != null && var1 >= 0 && var1 <= 35 && var2 >= 0 && var2 <= 8) {
         Dev.ZWare.Client.pkg1.pkg7.Class2 var3 = this.method_572();
         if (var3 != null) {
            return var3.method_602(var1, var2);
         } else {
            a.field_1761
               .method_2906(a.field_1724.field_7498.field_7763, Dev.ZWare.Client.pkg1.Class9.method_144(var1), var2, SlotActionType.field_7791, a.field_1724);
            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: c (int) boolean
   private boolean method_570(int var1) {
      return var1 >= 0 && var1 <= 35;
   }

   // $VF: renamed from: a (boolean) Dev.ZWare.Client.pkg4.Class22$Inner1
   private Class22.Inner1 method_571(boolean var1) {
      return var1 ? this.field_276 : this.field_275;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.pkg7.Class2
   private Dev.ZWare.Client.pkg1.pkg7.Class2 method_572() {
      return Dev.ZWare.Client.Class1.field_299 != null ? Dev.ZWare.Client.Class1.field_299.method_109() : null;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.pkg7.Class3
   private Dev.ZWare.Client.pkg1.pkg7.Class3 method_573() {
      return Dev.ZWare.Client.Class1.field_299 != null ? Dev.ZWare.Client.Class1.field_299.method_110() : null;
   }

   private static class Inner1 {
      // $VF: renamed from: a boolean
      private boolean field_119;
      // $VF: renamed from: b boolean
      private boolean field_120;
      // $VF: renamed from: c boolean
      private boolean field_121;
      // $VF: renamed from: d int
      private int field_122;
      // $VF: renamed from: e int
      private int field_123;
      // $VF: renamed from: f int
      private int field_124;
      // $VF: renamed from: g int
      private int field_125;

      // $VF: renamed from: a () void
      private void method_273() {
         this.field_119 = false;
         this.field_120 = false;
         this.field_121 = false;
         this.field_122 = 0;
         this.field_123 = 0;
         this.field_124 = 0;
         this.field_125 = 0;
      }
   }

   public record Inner2(int cZ, int c0) {
      // $VF: renamed from: cZ int
      private final int field_879;
      // $VF: renamed from: c0 int
      private final int field_880;
      // $VF: renamed from: a Dev.ZWare.Client.pkg4.Class22$Inner2
      private static final Class22.Inner2 field_881 = new Class22.Inner2(-1, 0);

      public Inner2(int cZ, int c0) {
         this.field_879 = cZ;
         this.field_880 = c0;
      }

      // $VF: renamed from: a () boolean
      public boolean method_1404() {
         return this.field_879 >= 0;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1405() {
         return this.field_879 >= 0 && this.field_879 <= 8;
      }

      // $VF: renamed from: c () boolean
      public boolean method_1406() {
         return Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null
            && this.field_879 == Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_31548().method_67532();
      }

      // $VF: renamed from: cZ () int
      public int method_1407() {
         return this.field_879;
      }

      // $VF: renamed from: c0 () int
      public int method_1408() {
         return this.field_880;
      }
   }
}
