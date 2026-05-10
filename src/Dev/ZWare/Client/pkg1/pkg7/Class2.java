package Dev.ZWare.Client.pkg1.pkg7;

import Dev.ZWare.Client.pkg1.Class9;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;

public class Class2 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: a (int, boolean) boolean
   public boolean method_594(int inventorySlot, boolean skipGeneric) {
      return this.method_604(inventorySlot, 0, SlotActionType.field_7790, skipGeneric);
   }

   // $VF: renamed from: b (int, boolean) boolean
   public boolean method_595(int inventorySlot, boolean skipGeneric) {
      return this.method_604(inventorySlot, 0, SlotActionType.field_7794, skipGeneric);
   }

   // $VF: renamed from: c (int, boolean) boolean
   public boolean method_596(int inventorySlot, boolean skipGeneric) {
      return this.method_604(inventorySlot, 0, SlotActionType.field_7795, skipGeneric);
   }

   // $VF: renamed from: a (int, int, boolean) boolean
   public boolean method_597(int inventorySlot, int hotbarSlot, boolean skipGeneric) {
      return this.method_604(inventorySlot, hotbarSlot, SlotActionType.field_7791, skipGeneric);
   }

   // $VF: renamed from: d (int, boolean) boolean
   public boolean method_598(int inventorySlot, boolean skipGeneric) {
      return this.method_604(inventorySlot, 40, SlotActionType.field_7791, skipGeneric);
   }

   // $VF: renamed from: a (int) boolean
   public boolean method_599(int inventorySlot) {
      return this.method_594(inventorySlot, false);
   }

   // $VF: renamed from: b (int) boolean
   public boolean method_600(int inventorySlot) {
      return this.method_595(inventorySlot, false);
   }

   // $VF: renamed from: c (int) boolean
   public boolean method_601(int inventorySlot) {
      return this.method_596(inventorySlot, false);
   }

   // $VF: renamed from: a (int, int) boolean
   public boolean method_602(int inventorySlot, int hotbarSlot) {
      return this.method_597(inventorySlot, hotbarSlot, false);
   }

   // $VF: renamed from: d (int) boolean
   public boolean method_603(int inventorySlot) {
      return this.method_598(inventorySlot, false);
   }

   // $VF: renamed from: a (int, int, net.minecraft.screen.slot.SlotActionType, boolean) boolean
   public boolean method_604(int inventorySlot, int button, SlotActionType actionType, boolean skipGeneric) {
      if (inventorySlot < 0 || inventorySlot > 35) {
         return false;
      } else {
         return a.field_1724 == null ? false : this.method_606(a.field_1724.field_7512, Class9.method_144(inventorySlot), button, actionType, skipGeneric);
      }
   }

   // $VF: renamed from: a (int, int, net.minecraft.screen.slot.SlotActionType) boolean
   public boolean method_605(int inventorySlot, int button, SlotActionType actionType) {
      return this.method_604(inventorySlot, button, actionType, false);
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, int, net.minecraft.screen.slot.SlotActionType, boolean) boolean
   public boolean method_606(ScreenHandler handler, int slotId, int button, SlotActionType actionType, boolean skipGeneric) {
      if (a.field_1724 == null || a.field_1761 == null || handler == null || slotId < 0) {
         return false;
      } else if (this.method_608(skipGeneric)) {
         return false;
      } else {
         a.field_1761.method_2906(handler.field_7763, slotId, button, actionType, a.field_1724);
         return true;
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, int, net.minecraft.screen.slot.SlotActionType) boolean
   public boolean method_607(ScreenHandler handler, int slotId, int button, SlotActionType actionType) {
      return this.method_606(handler, slotId, button, actionType, false);
   }

   // $VF: renamed from: a (boolean) boolean
   public boolean method_608(boolean skipGeneric) {
      if (a.field_1755 == null || this.method_609()) {
         return false;
      } else if (a.field_1755 instanceof ChatScreen || a.field_1755 instanceof InventoryScreen || a.field_1755 instanceof CreativeInventoryScreen) {
         return false;
      } else {
         return !(a.field_1755 instanceof HandledScreen)
            ? false
            : !skipGeneric || a.field_1724 == null || !(a.field_1724.field_7512 instanceof GenericContainerScreenHandler);
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_609() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class9.class);
         if (var1 != null) {
            return var1.method_3095();
         }
      }

      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3092();
      return var2 != null && var2.method_3095();
   }
}
