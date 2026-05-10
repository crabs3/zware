package Dev.ZWare.Client.pkg1;

import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;

public final class Class9 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c int
   public static final int field_57 = 40;

   private Class9() {
   }

   // $VF: renamed from: a (java.util.function.Predicate, int, int) int
   public static int method_140(Predicate<ItemStack> predicate, int start, int endInclusive) {
      if (a.field_1724 == null) {
         return -1;
      } else {
         int var3 = Math.max(0, start);
         int var4 = Math.min(35, endInclusive);

         for (int var5 = var3; var5 <= var4; var5++) {
            ItemStack var6 = a.field_1724.method_31548().method_5438(var5);
            if (predicate.test(var6)) {
               return var5;
            }
         }

         return -1;
      }
   }

   // $VF: renamed from: a (java.util.function.Predicate) int
   public static int method_141(Predicate<ItemStack> predicate) {
      return method_140(predicate, 0, 8);
   }

   // $VF: renamed from: a (net.minecraft.item.Item) int
   public static int method_142(Item item) {
      return method_141(var1 -> var1.method_31574(item));
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) int
   public static int method_143(BlockState state) {
      if (a.field_1724 == null) {
         return -1;
      } else {
         double var1 = Double.MAX_VALUE;
         int var3 = -1;

         for (int var4 = 0; var4 < 36; var4++) {
            ItemStack var5 = a.field_1724.method_31548().method_5438(var4);
            if (!var5.method_7960()) {
               double var6 = Class13.method_423(var4, state);
               if (!(var6 <= 0.0) && !(var6 >= var1)) {
                  var1 = var6;
                  var3 = var4;
               }
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: a (int) int
   public static int method_144(int inventorySlot) {
      if (inventorySlot >= 0 && inventorySlot <= 35) {
         return inventorySlot < 9 ? inventorySlot + 36 : inventorySlot;
      } else {
         throw new IllegalArgumentException("Inventory slot out of range: " + inventorySlot);
      }
   }

   // $VF: renamed from: a (int) boolean
   public static boolean method_145(int inventorySlot) {
      if (a.field_1724 == null || a.field_1761 == null) {
         return false;
      } else if (method_157()) {
         return false;
      } else if (inventorySlot == a.field_1724.method_31548().method_67532()) {
         return true;
      } else if (method_158(inventorySlot)) {
         return method_151(inventorySlot);
      } else {
         return !method_159() ? false : method_153(inventorySlot, a.field_1724.method_31548().method_67532(), SlotActionType.field_7791);
      }
   }

   // $VF: renamed from: b (int) boolean
   public static boolean method_146(int inventorySlot) {
      return method_147(inventorySlot) != null;
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.pkg1.Class9$Inner1
   public static Class9.Inner1 method_147(int inventorySlot) {
      return method_148(inventorySlot, true);
   }

   // $VF: renamed from: a (int, boolean) Dev.ZWare.Client.pkg1.Class9$Inner1
   public static Class9.Inner1 method_148(int inventorySlot, boolean instant) {
      if (a.field_1724 == null || a.field_1761 == null) {
         return null;
      } else if (inventorySlot >= 0 && inventorySlot <= 35) {
         int var2 = a.field_1724.method_31548().method_67532();
         if (inventorySlot == var2) {
            return new Class9.Inner1(inventorySlot, var2, instant, false);
         } else if (Dev.ZWare.Client.Class1.field_300 != null) {
            return !Dev.ZWare.Client.Class1.field_300.method_557(inventorySlot, instant) ? null : new Class9.Inner1(inventorySlot, var2, instant, true);
         } else {
            return !method_145(inventorySlot) ? null : new Class9.Inner1(inventorySlot, var2, instant, true);
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.Class9$Inner1) void
   public static void method_149(Class9.Inner1 state) {
      if (state != null && a.field_1724 != null) {
         if (state.method_1434()) {
            if (Dev.ZWare.Client.Class1.field_300 != null) {
               Dev.ZWare.Client.Class1.field_300.method_561(state.method_1433());
            } else {
               method_145(state.method_1431());
            }
         }
      }
   }

   // $VF: renamed from: a (int, int) boolean
   public static boolean method_150(int inventorySlot, int hotbarSlot) {
      if (a.field_1724 == null || a.field_1761 == null) {
         return false;
      } else if (method_157()) {
         return false;
      } else if (inventorySlot < 0 || inventorySlot > 35) {
         return false;
      } else if (hotbarSlot < 0 || hotbarSlot > 8) {
         return false;
      } else {
         return !method_159() ? false : method_153(inventorySlot, hotbarSlot, SlotActionType.field_7791);
      }
   }

   // $VF: renamed from: c (int) boolean
   public static boolean method_151(int slot) {
      if (slot < 0 || slot > 8) {
         throw new IllegalArgumentException("Hotbar slot out of range: " + slot);
      } else if (Dev.ZWare.Client.Class1.field_300 != null) {
         return Dev.ZWare.Client.Class1.field_300.method_555(slot);
      } else {
         Dev.ZWare.Client.pkg1.pkg7.Class3 var1 = method_161();
         if (var1 != null) {
            return var1.method_467(slot);
         } else if (a.field_1724 == null || a.method_1562() == null) {
            return false;
         } else if (method_157()) {
            return false;
         } else if (slot == a.field_1724.method_31548().method_67532()) {
            return true;
         } else {
            a.field_1724.method_31548().method_61496(slot);
            a.method_1562().method_52787(new UpdateSelectedSlotC2SPacket(slot));
            return true;
         }
      }
   }

   // $VF: renamed from: d (int) boolean
   public static boolean method_152(int inventorySlot) {
      if (a.field_1724 == null || a.field_1761 == null) {
         return false;
      } else {
         return method_157() ? false : method_153(inventorySlot, 40, SlotActionType.field_7791);
      }
   }

   // $VF: renamed from: a (int, int, net.minecraft.screen.slot.SlotActionType) boolean
   public static boolean method_153(int inventorySlot, int button, SlotActionType actionType) {
      return method_154(inventorySlot, button, actionType, false);
   }

   // $VF: renamed from: a (int, int, net.minecraft.screen.slot.SlotActionType, boolean) boolean
   public static boolean method_154(int inventorySlot, int button, SlotActionType actionType, boolean skipGeneric) {
      Dev.ZWare.Client.pkg1.pkg7.Class2 var4 = method_160();
      if (var4 != null) {
         return var4.method_604(inventorySlot, button, actionType, skipGeneric);
      } else if (a.field_1724 == null || a.field_1761 == null) {
         return false;
      } else if (inventorySlot >= 0 && inventorySlot <= 35) {
         a.field_1761.method_2906(a.field_1724.field_7512.field_7763, method_144(inventorySlot), button, actionType, a.field_1724);
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, int, net.minecraft.screen.slot.SlotActionType) boolean
   public static boolean method_155(ScreenHandler handler, int slotId, int button, SlotActionType actionType) {
      return method_156(handler, slotId, button, actionType, false);
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, int, net.minecraft.screen.slot.SlotActionType, boolean) boolean
   public static boolean method_156(ScreenHandler handler, int slotId, int button, SlotActionType actionType, boolean skipGeneric) {
      Dev.ZWare.Client.pkg1.pkg7.Class2 var5 = method_160();
      if (var5 != null) {
         return var5.method_606(handler, slotId, button, actionType, skipGeneric);
      } else if (a.field_1724 != null && a.field_1761 != null && handler != null && slotId >= 0) {
         a.field_1761.method_2906(handler.field_7763, slotId, button, actionType, a.field_1724);
         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () boolean
   private static boolean method_157() {
      if (Dev.ZWare.Client.Class1.field_300 != null) {
         return Dev.ZWare.Client.Class1.field_300.method_551();
      } else {
         Dev.ZWare.Client.pkg1.pkg7.Class2 var0 = method_160();
         return var0 != null && var0.method_608(false);
      }
   }

   // $VF: renamed from: e (int) boolean
   private static boolean method_158(int var0) {
      return Dev.ZWare.Client.Class1.field_300 == null || Dev.ZWare.Client.Class1.field_300.method_552(var0);
   }

   // $VF: renamed from: b () boolean
   private static boolean method_159() {
      return Dev.ZWare.Client.Class1.field_300 == null || Dev.ZWare.Client.Class1.field_300.method_553();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.pkg7.Class2
   private static Dev.ZWare.Client.pkg1.pkg7.Class2 method_160() {
      return Dev.ZWare.Client.Class1.field_299 != null ? Dev.ZWare.Client.Class1.field_299.method_109() : null;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.pkg7.Class3
   private static Dev.ZWare.Client.pkg1.pkg7.Class3 method_161() {
      return Dev.ZWare.Client.Class1.field_299 != null ? Dev.ZWare.Client.Class1.field_299.method_110() : null;
   }

   public record Inner1(int c8, int c9, boolean c_, boolean da) {
      // $VF: renamed from: c8 int
      private final int field_904;
      // $VF: renamed from: c9 int
      private final int field_905;
      // $VF: renamed from: c_ boolean
      private final boolean field_906;
      // $VF: renamed from: da boolean
      private final boolean field_907;

      public Inner1(int c8, int c9, boolean c_, boolean da) {
         this.field_904 = c8;
         this.field_905 = c9;
         this.field_906 = c_;
         this.field_907 = da;
      }

      // $VF: renamed from: c8 () int
      public int method_1431() {
         return this.field_904;
      }

      // $VF: renamed from: c9 () int
      public int method_1432() {
         return this.field_905;
      }

      // $VF: renamed from: c_ () boolean
      public boolean method_1433() {
         return this.field_906;
      }

      // $VF: renamed from: da () boolean
      public boolean method_1434() {
         return this.field_907;
      }
   }
}
