package Dev.ZWare.Client.features.pkg1.pkg2;

import Dev.ZWare.Client.features.pkg3.Class8;
import Dev.ZWare.Client.pkg2.pkg1.Class7;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

public class Class4 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   public final Class8<Boolean> field_1418 = this.a("Only Buttons", false);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Integer> field_1419 = this.a("Delay", 1, 0, 20);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Integer> field_1420 = this.a("Items Per Tick", 79, 1, 79);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Class4.Inner1> field_1421 = this.a("Mode", Class4.Inner1.Whitelist);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class1
   private final Dev.ZWare.Client.features.pkg3.Class1 field_1422 = this.a("Items");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Class8<Boolean> field_1423 = this.a("Close On Done", true);
   // $VF: renamed from: u int
   private int field_1424;
   // $VF: renamed from: v boolean
   public boolean field_1425;
   // $VF: renamed from: w boolean
   public boolean field_1426;
   // $VF: renamed from: x boolean
   public boolean field_1427;
   // $VF: renamed from: y boolean
   public boolean field_1428;

   public Class4() {
      super("ChestStealer", "Automatically steals items from containers", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1424 = 0;
      this.field_1425 = false;
      this.field_1426 = false;
      this.field_1427 = false;
      this.field_1428 = false;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1425 = false;
      this.field_1426 = false;
      this.field_1427 = false;
      this.field_1428 = false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2050(Class7.Inner2 var1) {
      if (!g() && c.field_1761 != null) {
         if (!(c.field_1755 instanceof HandledScreen)) {
            this.field_1425 = false;
            this.field_1426 = false;
            this.field_1427 = false;
            this.field_1428 = false;
         } else {
            ScreenHandler var2 = c.field_1724.field_7512;
            if (!this.method_2056(var2)) {
               this.field_1425 = false;
               this.field_1426 = false;
               this.field_1427 = false;
               this.field_1428 = false;
            } else if (this.field_1424 > 0) {
               this.field_1424--;
            } else {
               if (this.field_1418.method_671()) {
                  if (this.field_1425) {
                     if (!this.method_2051(var2)) {
                        this.field_1425 = false;
                     } else {
                        this.field_1424 = this.field_1419.method_671();
                     }
                  } else if (this.field_1426) {
                     if (!this.method_2052(var2)) {
                        this.field_1426 = false;
                     } else {
                        this.field_1424 = this.field_1419.method_671();
                     }
                  } else if (this.field_1427) {
                     if (!this.method_2053(var2)) {
                        this.field_1427 = false;
                     } else {
                        this.field_1424 = this.field_1419.method_671();
                     }
                  } else if (this.field_1428) {
                     if (!this.method_2054(var2)) {
                        this.field_1428 = false;
                     } else {
                        this.field_1424 = this.field_1419.method_671();
                     }
                  }
               } else if (this.method_2051(var2)) {
                  this.field_1424 = this.field_1419.method_671();
               } else if (this.field_1423.method_671() && this.method_2060()) {
                  boolean var3 = false;
                  int var4 = this.method_2057(var2);

                  for (int var5 = 0; var5 < var4; var5++) {
                     Slot var6 = var2.method_7611(var5);
                     if (var6 != null && var6.method_7681() && this.method_2055(var6.method_7677())) {
                        var3 = true;
                        break;
                     }
                  }

                  if (!var3) {
                     c.field_1724.method_7346();
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2051(ScreenHandler var1) {
      int var2 = this.method_2057(var1);
      if (var2 <= 0) {
         return false;
      } else {
         boolean var3 = false;
         int var4 = this.method_2058();
         int var5 = 0;

         for (int var6 = 0; var6 < var2 && var4 > 0; var6++) {
            Slot var7 = var1.method_7611(var6);
            if (var7 != null && var7.method_7681()) {
               ItemStack var8 = var7.method_7677();
               if (!var8.method_7960() && this.method_2055(var8)) {
                  boolean var9 = this.method_2059(var8);
                  if (!var9 || var5 < 39) {
                     c.field_1761.method_2906(var1.field_7763, var6, 0, SlotActionType.field_7794, c.field_1724);
                     var4--;
                     if (var9) {
                        var5++;
                     }

                     var3 = true;
                  }
               }
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: b (net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2052(ScreenHandler var1) {
      int var2 = this.method_2057(var1);
      int var3 = var1.field_7761.size();
      if (var2 <= 0) {
         return false;
      } else {
         boolean var4 = var1 instanceof ShulkerBoxScreenHandler;
         boolean var5 = false;
         int var6 = this.method_2058();

         for (int var7 = var2; var7 < var3 && var6 > 0; var7++) {
            Slot var8 = var1.method_7611(var7);
            if (var8 != null && var8.method_7681()) {
               ItemStack var9 = var8.method_7677();
               if (!var9.method_7960() && (!var4 || !this.method_2059(var9)) && this.method_2055(var9)) {
                  c.field_1761.method_2906(var1.field_7763, var7, 0, SlotActionType.field_7794, c.field_1724);
                  var6--;
                  var5 = true;
               }
            }
         }

         return var5;
      }
   }

   // $VF: renamed from: c (net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2053(ScreenHandler var1) {
      int var2 = this.method_2057(var1);
      if (var2 <= 0) {
         return false;
      } else {
         boolean var3 = false;
         int var4 = this.method_2058();

         for (int var5 = 0; var5 < var2 && var4 > 0; var5++) {
            Slot var6 = var1.method_7611(var5);
            if (var6 != null && var6.method_7681()) {
               ItemStack var7 = var6.method_7677();
               if (!var7.method_7960()) {
                  c.field_1761.method_2906(var1.field_7763, var5, 1, SlotActionType.field_7795, c.field_1724);
                  var4--;
                  var3 = true;
               }
            }
         }

         return var3;
      }
   }

   // $VF: renamed from: d (net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2054(ScreenHandler var1) {
      int var2 = this.method_2057(var1);
      int var3 = var1.field_7761.size();
      if (var2 <= 0) {
         return false;
      } else {
         boolean var4 = false;
         int var5 = this.method_2058();
         if (var5 <= 0) {
            return false;
         } else {
            for (int var6 = var2; var6 < var3 && var5 > 0; var6++) {
               Slot var7 = var1.method_7611(var6);
               if (var7 != null && var7.method_7681()) {
                  ItemStack var8 = var7.method_7677();
                  if (var8.method_7947() < var8.method_7914()) {
                     int var9 = 0;
                     Slot var10 = null;

                     for (int var11 = var2; var11 < var3; var11++) {
                        Slot var12 = var1.method_7611(var11);
                        if (var12 != null && var12.method_7681() && ItemStack.method_31577(var12.method_7677(), var8)) {
                           int var13 = var12.method_7677().method_7914() - var12.method_7677().method_7947();
                           if (var13 > 0) {
                              var9 += var13;
                              if (var10 == null) {
                                 var10 = var12;
                              }
                           }
                        }
                     }

                     if (var9 > 0 && var10 != null) {
                        for (int var14 = 0; var14 < var2; var14++) {
                           Slot var15 = var1.method_7611(var14);
                           if (var15 != null && var15.method_7681()) {
                              ItemStack var16 = var15.method_7677();
                              if (ItemStack.method_31577(var16, var8)) {
                                 if (var16.method_7947() <= var9) {
                                    if (var5 >= 1) {
                                       c.field_1761.method_2906(var1.field_7763, var14, 0, SlotActionType.field_7794, c.field_1724);
                                       var5--;
                                       var4 = true;
                                       break;
                                    }
                                 } else if (var5 >= 3) {
                                    c.field_1761.method_2906(var1.field_7763, var14, 0, SlotActionType.field_7790, c.field_1724);
                                    c.field_1761.method_2906(var1.field_7763, var10.field_7874, 0, SlotActionType.field_7790, c.field_1724);
                                    c.field_1761.method_2906(var1.field_7763, var14, 0, SlotActionType.field_7790, c.field_1724);
                                    var5 -= 3;
                                    var4 = true;
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            return var4;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2055(ItemStack var1) {
      Item var2 = var1.method_7909();
      boolean var3 = this.field_1422.method_711(var2);
      return this.field_1421.method_671() == Class4.Inner1.Whitelist ? var3 : !var3;
   }

   // $VF: renamed from: e (net.minecraft.screen.ScreenHandler) boolean
   public boolean method_2056(ScreenHandler handler) {
      return handler instanceof GenericContainerScreenHandler || handler instanceof ShulkerBoxScreenHandler;
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler) int
   private int method_2057(ScreenHandler var1) {
      return Math.max(0, var1.field_7761.size() - 36);
   }

   // $VF: renamed from: a () int
   private int method_2058() {
      int var1 = this.field_1420.method_671();
      if (Dev.ZWare.Client.Class1.field_302 != null) {
         var1 = Math.min(var1, Dev.ZWare.Client.Class1.field_302.method_251(Dev.ZWare.Client.pkg4.Class1.Inner1.ClickSlot));
      }

      return Math.max(0, var1);
   }

   // $VF: renamed from: b (net.minecraft.item.ItemStack) boolean
   private boolean method_2059(ItemStack var1) {
      return !var1.method_7960() && var1.method_7909() instanceof BlockItem var2 && var2.method_7711() instanceof ShulkerBoxBlock;
   }

   // $VF: renamed from: a () boolean
   private boolean method_2060() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (c.field_1724.method_31548().method_5438(var1).method_7960()) {
            return true;
         }
      }

      return false;
   }

   private static enum Inner1 {
      Whitelist,
      Blacklist;
   }
}
