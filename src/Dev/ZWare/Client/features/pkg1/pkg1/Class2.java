package Dev.ZWare.Client.features.pkg1.pkg1;

import Dev.ZWare.Client.pkg4.KitManager;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

public class Class2 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2179 = this.a("Delay Ms", 40, 0, 500);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2180 = this.a("Items Per Tick", 39, 1, 39);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner1> field_2181 = this.a("Mode", Class2.Inner1.Standard);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2182 = this.a("Close Shulker On Done", false);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class2.Inner3> field_2183 = this.a("Trigger Mode", Class2.Inner3.Manual).method_683("Shulker Select");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_2184 = this.a(
         "Trigger Bind", Dev.ZWare.Client.features.pkg3.Class4.method_427()
      )
      .method_683("Shulker Select");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2185 = this.a("Middle Click Trigger", true).method_683("Shulker Select");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2186 = this.a("Hotbar Slot", 1, 1, 9).method_683("Shulker Select");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2187 = this.a("Refill Threshold", 90, 50, 100).method_683("Shulker Select");
   // $VF: renamed from: x java.util.Deque
   private final Deque<Class2.Inner2> field_2188 = new ArrayDeque<>();
   // $VF: renamed from: y long
   private long field_2189;
   // $VF: renamed from: z int
   private int field_2190 = -1;
   // $VF: renamed from: A boolean
   private boolean field_2191;

   public Class2() {
      super("Rekit", "restores the loaded kit from shulkers and containers", Dev.ZWare.Client.features.pkg1.Class1.Inner1.WORLD, true, false, false);
      this.field_2184.method_709(var1 -> this.field_2183.method_671() == Class2.Inner3.Manual);
      this.field_2185.method_709(var1 -> this.field_2183.method_671() == Class2.Inner3.Manual);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2188.clear();
      this.field_2190 = -1;
      this.field_2191 = false;
      if (Dev.ZWare.Client.Class1.field_312 != null && Dev.ZWare.Client.Class1.field_312.getLoadedKit() != null) {
         if (this.method_2831()) {
            this.method_2811();
            if (this.field_2188.isEmpty()) {
               Dev.ZWare.Client.features.pkg2.Class1.method_1647("Rekit: nothing to move for {gray}%s", Dev.ZWare.Client.Class1.field_312.getLoadedKitName());
               this.method_2846();
            }
         }
      } else {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647("Load a kit first with {gray}kit load <name>");
         this.k();
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2188.clear();
      this.field_2191 = false;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return Dev.ZWare.Client.Class1.field_312 != null ? Dev.ZWare.Client.Class1.field_312.getLoadedKitName() : null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class1) void
   @iFT13zrx_wTXP
   private void method_2805(Dev.ZWare.Client.pkg2.pkg1.Class1 var1) {
      if (this.d()
         && this.field_2183.method_671() == Class2.Inner3.Manual
         && this.field_2185.method_671()
         && var1.method_1043() == 1
         && var1.method_1042() == 2) {
         this.method_2808();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class8) void
   @iFT13zrx_wTXP
   private void method_2806(Dev.ZWare.Client.pkg2.pkg1.Class8 var1) {
      if (this.d() && this.field_2183.method_671() == Class2.Inner3.Manual) {
         Dev.ZWare.Client.features.pkg3.Class4 var2 = this.field_2184.method_671();
         if (var2 != null && !var2.method_432() && !var2.method_433() && var2.method_430() == var1.method_1044()) {
            this.method_2808();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2807(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.field_1761 != null && Dev.ZWare.Client.Class1.field_312 != null) {
         if (Dev.ZWare.Client.Class1.field_312.getLoadedKit() != null) {
            if (this.field_2183.method_671() == Class2.Inner3.Automatic) {
               if (this.method_2832()) {
                  if (!this.field_2191 && c.field_1724.field_7512 instanceof GenericContainerScreenHandler var2) {
                     this.method_2809(var2, this.method_2834(var2));
                     this.field_2191 = true;
                  }
               } else {
                  this.field_2191 = false;
               }
            } else {
               this.field_2191 = false;
            }

            if (this.method_2830()) {
               if (!this.method_2832()) {
                  if (this.field_2188.isEmpty()) {
                     this.method_2811();
                     if (this.field_2188.isEmpty()) {
                        this.method_2846();
                        return;
                     }
                  }

                  this.method_2810();
               }
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2808() {
      if (this.method_2832() && c.field_1755 instanceof HandledScreen) {
         if (c.field_1724.field_7512 instanceof GenericContainerScreenHandler var1) {
            this.method_2809(var1, this.method_2834(var1));
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int) void
   private void method_2809(ScreenHandler var1, int var2) {
      if (var2 > 0 && this.method_2843(4)) {
         int var3 = this.field_2186.method_671() - 1;
         int var4 = var2 + 27 + var3;
         int var5 = -1;
         boolean var6 = false;
         ItemStack var7 = var1.method_7611(var4).method_7677();
         if (this.field_2190 != -1 && this.field_2190 < var2 && !var7.method_7960()) {
            this.method_2844(var1, var4, 0, SlotActionType.field_7790);
            this.method_2844(var1, this.field_2190, 0, SlotActionType.field_7790);
            var5 = this.field_2190;
            var6 = true;
         }

         this.field_2190 = -1;
         List var8 = this.method_2838();
         if (var8.isEmpty()) {
            if (!var1.method_34255().method_7960()) {
               this.method_2844(var1, var4, 0, SlotActionType.field_7790);
            }

            this.method_2845(var1);
         } else {
            int var9 = -1;
            int var10 = 0;

            for (int var11 = 0; var11 < var2; var11++) {
               if (var11 != var5) {
                  ItemStack var12 = var1.method_7611(var11).method_7677();
                  if (!var12.method_7960() && this.method_2840(var12)) {
                     int var13 = this.method_2841(var12, var8);
                     if (var13 > var10) {
                        var9 = var11;
                        var10 = var13;
                     }
                  }
               }
            }

            if (var9 != -1) {
               this.method_2844(var1, var9, 0, SlotActionType.field_7790);
               this.method_2844(var1, var4, 0, SlotActionType.field_7790);
               if (!var1.method_34255().method_7960()) {
                  this.method_2844(var1, var9, 0, SlotActionType.field_7790);
               }

               this.field_2190 = var9;
               Dev.ZWare.Client.pkg1.Class9.method_151(var3);
               this.method_2845(var1);
            } else {
               if (!var1.method_34255().method_7960()) {
                  this.method_2844(var1, var4, 0, SlotActionType.field_7790);
               }

               if (var6 || this.field_2183.method_671() == Class2.Inner3.Automatic) {
                  this.method_2845(var1);
               }
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2810() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.field_2189 >= this.field_2179.method_671().intValue()) {
         this.field_2189 = var1;
         int var3 = this.method_2842();
         if (var3 > 0) {
            ScreenHandler var4 = c.field_1724.field_7512;

            while (var3 > 0) {
               if (this.field_2188.isEmpty()) {
                  this.method_2811();
                  if (this.field_2188.isEmpty()) {
                     break;
                  }
               }

               Class2.Inner2 var5 = this.field_2188.pollFirst();
               if (var5 == null) {
                  break;
               }

               int var6 = this.method_2817(var5, var4);
               if (var6 > var3) {
                  this.field_2188.addFirst(var5);
                  break;
               }

               if (!this.method_2814(var5, var4)) {
                  break;
               }

               var3 -= var6;
            }

            if (this.field_2188.isEmpty()) {
               this.method_2811();
               if (this.field_2188.isEmpty()) {
                  this.method_2846();
               }
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2811() {
      this.field_2188.clear();
      if (this.method_2830()) {
         if (this.field_2181.method_671() == Class2.Inner1.Alternative) {
            this.method_2813();
         } else {
            this.method_2812();
         }
      }
   }

   // $VF: renamed from: q () void
   private void method_2812() {
      KitManager.Inner1 var1 = Dev.ZWare.Client.Class1.field_312.getLoadedKit();
      if (var1 != null && c.field_1687 != null) {
         ItemStack[] var2 = var1.method_874(c.field_1687.method_30349());
         ScreenHandler var3 = c.field_1724.field_7512;
         int var4 = this.method_2834(var3);
         HashSet var5 = new HashSet();

         for (int var9 : this.method_2837()) {
            if (var9 != this.method_2836()) {
               ItemStack var10 = this.method_2824(var2, var9);
               if (!var10.method_7960() && !var10.method_31574(Items.field_8833)) {
                  ItemStack var11 = this.method_2825(var9);
                  if (!this.method_2821(var11, var10) && !this.method_2822(var11, var10)) {
                     int var12 = this.method_2827(var3, var4, var10, var5);
                     if (var12 != -1) {
                        this.field_2188.addLast(new Class2.Inner2(this.method_2829(var9), var12, var9));
                        var5.add(var12);
                     }
                  }
               }
            }
         }

         for (int var20 : this.method_2837()) {
            if (var20 != this.method_2836()) {
               ItemStack var21 = this.method_2824(var2, var20);
               if (!var21.method_7960() && !var21.method_31574(Items.field_8833)) {
                  ItemStack var22 = this.method_2825(var20);
                  if (this.method_2822(var22, var21) && var22.method_7946()) {
                     int var23 = var21.method_7947() - var22.method_7947();
                     if (var23 > 0) {
                        for (int var15 : this.method_2828(var3, var4, var21, var5)) {
                           if (var23 <= 0) {
                              break;
                           }

                           ItemStack var16 = var3.method_7611(var15).method_7677();
                           this.field_2188.addLast(new Class2.Inner2(Class2.Inner4.PICKUP_SWAP, var15, var20));
                           var23 -= var16.method_7947();
                           var5.add(var15);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: r () void
   private void method_2813() {
      KitManager.Inner1 var1 = Dev.ZWare.Client.Class1.field_312.getLoadedKit();
      if (var1 != null && c.field_1687 != null) {
         ItemStack[] var2 = var1.method_874(c.field_1687.method_30349());
         ScreenHandler var3 = c.field_1724.field_7512;
         int var4 = this.method_2834(var3);
         HashSet var5 = new HashSet();

         for (int var9 : this.method_2837()) {
            if (var9 != this.method_2836()) {
               ItemStack var10 = this.method_2824(var2, var9);
               if (!var10.method_7960() && !var10.method_31574(Items.field_8833)) {
                  int var11 = this.method_2826(var10);
                  if (var11 < var10.method_7947()) {
                     int var12 = this.method_2827(var3, var4, var10, var5);
                     if (var12 != -1) {
                        this.field_2188.addLast(new Class2.Inner2(Class2.Inner4.CONTAINER_TO_INVENTORY, var12, var9));
                        var5.add(var12);
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner2, net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2814(Class2.Inner2 var1, ScreenHandler var2) {
      return switch (var1.field_973) {
         case HOTBAR_SWAP -> {
            this.method_2844(var2, var1.field_974, var1.field_975, SlotActionType.field_7791);
            yield true;
         }
         case OFFHAND_SWAP -> {
            this.method_2844(var2, var1.field_974, 40, SlotActionType.field_7791);
            yield true;
         }
         case CONTAINER_TO_INVENTORY -> this.method_2815(var1, var2);
         case PICKUP_SWAP -> this.method_2816(var1, var2);
      };
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner2, net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2815(Class2.Inner2 var1, ScreenHandler var2) {
      if (this.field_2181.method_671() == Class2.Inner1.Alternative) {
         this.method_2844(var2, var1.field_974, 0, SlotActionType.field_7794);
         return true;
      } else {
         int var3 = this.method_2835(var2, var1.field_975);
         if (var3 == -1) {
            return false;
         } else {
            ItemStack var4 = var2.method_7611(var1.field_974).method_7677();
            if (this.field_2181.method_671() == Class2.Inner1.Smart && this.method_2819(var2, var4) == var3) {
               this.method_2844(var2, var1.field_974, 0, SlotActionType.field_7794);
               return true;
            } else {
               return this.method_2816(new Class2.Inner2(Class2.Inner4.PICKUP_SWAP, var1.field_974, var1.field_975), var2);
            }
         }
      }
   }

   // $VF: renamed from: c (Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner2, net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2816(Class2.Inner2 var1, ScreenHandler var2) {
      int var3 = this.method_2835(var2, var1.field_975);
      if (var3 == -1) {
         return false;
      } else {
         boolean var4 = var2.method_7611(var3).method_7677().method_7960();
         this.method_2844(var2, var1.field_974, 0, SlotActionType.field_7790);
         this.method_2844(var2, var3, 0, SlotActionType.field_7790);
         if (!var4) {
            this.method_2844(var2, var1.field_974, 0, SlotActionType.field_7790);
         }

         return true;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner2, net.minecraft.screen.ScreenHandler) int
   private int method_2817(Class2.Inner2 var1, ScreenHandler var2) {
      return switch (var1.field_973) {
         case HOTBAR_SWAP, OFFHAND_SWAP, CONTAINER_TO_INVENTORY -> 1;
         case PICKUP_SWAP -> this.method_2818(var2, var1.field_975);
      };
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int) int
   private int method_2818(ScreenHandler var1, int var2) {
      int var3 = this.method_2835(var1, var2);
      if (var3 == -1) {
         return 3;
      } else {
         return var1.method_7611(var3).method_7677().method_7960() ? 2 : 3;
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, net.minecraft.item.ItemStack) int
   private int method_2819(ScreenHandler var1, ItemStack var2) {
      int var3 = var1.field_7761.size();
      if (var3 >= 36 && var2 != null && !var2.method_7960()) {
         int var4 = var3 - 36;
         int var5 = var3;

         for (int var6 = var4; var6 < var5; var6++) {
            ItemStack var7 = var1.method_7611(var6).method_7677();
            if (this.method_2820(var2, var7)) {
               return var6;
            }
         }

         for (int var8 = var4; var8 < var5; var8++) {
            if (var1.method_7611(var8).method_7677().method_7960()) {
               return var8;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack, net.minecraft.item.ItemStack) boolean
   private boolean method_2820(ItemStack var1, ItemStack var2) {
      return var1 != null && var2 != null && !var1.method_7960() && !var2.method_7960()
         ? ItemStack.method_31577(var1, var2) && var2.method_7947() < var2.method_7914()
         : false;
   }

   // $VF: renamed from: b (net.minecraft.item.ItemStack, net.minecraft.item.ItemStack) boolean
   private boolean method_2821(ItemStack var1, ItemStack var2) {
      return this.method_2822(var1, var2) && var1.method_7947() >= var2.method_7947();
   }

   // $VF: renamed from: c (net.minecraft.item.ItemStack, net.minecraft.item.ItemStack) boolean
   private boolean method_2822(ItemStack var1, ItemStack var2) {
      return var1 != null && var2 != null && !var1.method_7960() && !var2.method_7960() && ItemStack.method_31577(var1, var2);
   }

   // $VF: renamed from: d (net.minecraft.item.ItemStack, net.minecraft.item.ItemStack) boolean
   private boolean method_2823(ItemStack var1, ItemStack var2) {
      if (var1 == null || var2 == null || var1.method_7960() || var2.method_7960()) {
         return false;
      } else if (ItemStack.method_31577(var1, var2)) {
         return true;
      } else if (var1.method_7909() != var2.method_7909()) {
         return false;
      } else {
         ItemStack var3 = var1.method_7972();
         ItemStack var4 = var2.method_7972();
         var3.method_57381(DataComponentTypes.field_49629);
         var4.method_57381(DataComponentTypes.field_49629);
         return ItemStack.method_31577(var3, var4);
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack[], int) net.minecraft.item.ItemStack
   private ItemStack method_2824(ItemStack[] var1, int var2) {
      if (var1 != null && var2 >= 0 && var2 < var1.length) {
         return var1[var2] == null ? ItemStack.field_8037 : var1[var2];
      } else {
         return ItemStack.field_8037;
      }
   }

   // $VF: renamed from: a (int) net.minecraft.item.ItemStack
   private ItemStack method_2825(int var1) {
      if (var1 == 36) {
         return c.field_1724.method_6079();
      } else {
         return var1 >= 0 && var1 < 36 ? c.field_1724.method_31548().method_5438(var1) : ItemStack.field_8037;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) int
   private int method_2826(ItemStack var1) {
      int var2 = 0;

      for (int var6 : this.method_2837()) {
         if (var6 != this.method_2836()) {
            ItemStack var7 = this.method_2825(var6);
            if (this.method_2822(var7, var1)) {
               var2 += var7.method_7947();
            }
         }
      }

      return var2;
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, net.minecraft.item.ItemStack, java.util.Set) int
   private int method_2827(ScreenHandler var1, int var2, ItemStack var3, Set<Integer> var4) {
      int var5 = -1;
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MAX_VALUE;
      int var8 = -1;

      for (int var9 = 0; var9 < var2; var9++) {
         if (!var4.contains(var9)) {
            ItemStack var10 = var1.method_7611(var9).method_7677();
            if (this.method_2823(var10, var3)) {
               int var11 = var10.method_7947() >= var3.method_7947() ? 0 : 1;
               int var12 = Math.abs(var10.method_7947() - var3.method_7947());
               if (var11 < var6 || var11 == var6 && var12 < var7 || var11 == var6 && var12 == var7 && var10.method_7947() > var8) {
                  var5 = var9;
                  var6 = var11;
                  var7 = var12;
                  var8 = var10.method_7947();
               }
            }
         }
      }

      return var5;
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, net.minecraft.item.ItemStack, java.util.Set) java.util.List
   private List<Integer> method_2828(ScreenHandler var1, int var2, ItemStack var3, Set<Integer> var4) {
      ArrayList var5 = new ArrayList();

      for (int var6 = 0; var6 < var2; var6++) {
         if (!var4.contains(var6)) {
            ItemStack var7 = var1.method_7611(var6).method_7677();
            if (this.method_2823(var7, var3)) {
               var5.add(var6);
            }
         }
      }

      var5.sort(Comparator.<Integer>comparingInt(var1x -> var1.method_7611(var1x).method_7677().method_7947()).reversed());
      return var5;
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner4
   private Class2.Inner4 method_2829(int var1) {
      if (var1 < 9) {
         return Class2.Inner4.HOTBAR_SWAP;
      } else if (var1 == 36) {
         return Class2.Inner4.OFFHAND_SWAP;
      } else {
         return this.field_2181.method_671() == Class2.Inner1.Smart ? Class2.Inner4.CONTAINER_TO_INVENTORY : Class2.Inner4.PICKUP_SWAP;
      }
   }

   // $VF: renamed from: a () boolean
   private boolean method_2830() {
      ScreenHandler var1 = c.field_1724 != null ? c.field_1724.field_7512 : null;
      return var1 != null && this.method_2833(var1);
   }

   // $VF: renamed from: b () boolean
   private boolean method_2831() {
      return c.field_1724 != null && c.field_1724.field_7512 instanceof ShulkerBoxScreenHandler;
   }

   // $VF: renamed from: c () boolean
   private boolean method_2832() {
      return c.field_1755 instanceof HandledScreen var1
         && var1.method_25440().getString().toLowerCase(Locale.ROOT).contains("ender")
         && c.field_1724 != null
         && c.field_1724.field_7512 instanceof GenericContainerScreenHandler;
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler) boolean
   private boolean method_2833(ScreenHandler var1) {
      return var1 instanceof GenericContainerScreenHandler || var1 instanceof ShulkerBoxScreenHandler;
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler) int
   private int method_2834(ScreenHandler var1) {
      return Math.max(0, var1.field_7761.size() - 36);
   }

   // $VF: renamed from: b (net.minecraft.screen.ScreenHandler, int) int
   private int method_2835(ScreenHandler var1, int var2) {
      if (var2 == 36) {
         for (int var5 = 0; var5 < var1.field_7761.size(); var5++) {
            Slot var6 = var1.method_7611(var5);
            if (var6.field_7871 == c.field_1724.method_31548() && var6.method_34266() == 40) {
               return var5;
            }
         }

         return -1;
      } else {
         for (int var3 = 0; var3 < var1.field_7761.size(); var3++) {
            Slot var4 = var1.method_7611(var3);
            if (var4.field_7871 == c.field_1724.method_31548() && var4.method_34266() == var2) {
               return var3;
            }
         }

         return -1;
      }
   }

   // $VF: renamed from: a () int
   private int method_2836() {
      return this.field_2186.method_671() - 1;
   }

   // $VF: renamed from: a () int[]
   private int[] method_2837() {
      int[] var1 = new int[37];
      int var2 = 0;
      int var3 = 0;

      while (var3 < 9) {
         var1[var2++] = var3++;
      }

      var1[var2++] = 36;
      var3 = 9;

      while (var3 < 36) {
         var1[var2++] = var3++;
      }

      return var1;
   }

   // $VF: renamed from: b () java.util.List
   private List<ItemStack> method_2838() {
      ArrayList var1 = new ArrayList();
      KitManager.Inner1 var2 = Dev.ZWare.Client.Class1.field_312.getLoadedKit();
      if (var2 != null && c.field_1687 != null) {
         ItemStack[] var3 = var2.method_874(c.field_1687.method_30349());

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var4 != this.method_2836()) {
               ItemStack var5 = var3[var4];
               if (var5 != null && !var5.method_7960()) {
                  ItemStack var6 = this.method_2825(var4);
                  if (!this.method_2822(var6, var5) || var6.method_7947() < var5.method_7947()) {
                     if (this.method_2822(var6, var5) && var6.method_7946()) {
                        int var7 = (int)Math.ceil(var5.method_7914() * (this.field_2187.method_671().intValue() / 100.0));
                        if (var6.method_7947() >= var7) {
                           continue;
                        }
                     }

                     if (!this.method_2839(var1, var5)) {
                        var1.add(var5);
                     }
                  }
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.item.ItemStack) boolean
   private boolean method_2839(List<ItemStack> var1, ItemStack var2) {
      for (ItemStack var4 : var1) {
         if (this.method_2823(var4, var2)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2840(ItemStack var1) {
      return !var1.method_7960() && var1.method_7909() instanceof BlockItem var2 && var2.method_7711() instanceof ShulkerBoxBlock;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack, java.util.List) int
   private int method_2841(ItemStack var1, List<ItemStack> var2) {
      ContainerComponent var3 = (ContainerComponent)var1.method_58694(DataComponentTypes.field_49622);
      if (var3 == null) {
         return 0;
      } else {
         int var4 = 0;

         for (ItemStack var6 : var2) {
            boolean var7 = var3.method_59712().anyMatch(var2x -> this.method_2823(var2x, var6));
            if (var7) {
               var4++;
            }
         }

         return var4;
      }
   }

   // $VF: renamed from: b () int
   private int method_2842() {
      int var1 = this.field_2180.method_671();
      if (Dev.ZWare.Client.Class1.field_302 != null) {
         var1 = Math.min(var1, Dev.ZWare.Client.Class1.field_302.method_251(Dev.ZWare.Client.pkg4.Class1.Inner1.ClickSlot));
      }

      return Math.max(0, var1);
   }

   // $VF: renamed from: a (int) boolean
   private boolean method_2843(int var1) {
      return this.method_2842() >= var1;
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler, int, int, net.minecraft.screen.slot.SlotActionType) void
   private void method_2844(ScreenHandler var1, int var2, int var3, SlotActionType var4) {
      if (c.field_1761 != null && c.field_1724 != null) {
         c.field_1761.method_2906(var1.field_7763, var2, var3, var4, c.field_1724);
      }
   }

   // $VF: renamed from: a (net.minecraft.screen.ScreenHandler) void
   private void method_2845(ScreenHandler var1) {
      if (c.field_1724 != null) {
         if (!var1.method_34255().method_7960()) {
            int var2 = this.method_2834(var1) + 27 + (this.field_2186.method_671() - 1);
            if (var2 >= 0 && var2 < var1.field_7761.size()) {
               this.method_2844(var1, var2, 0, SlotActionType.field_7790);
            }
         }

         if (var1.method_34255().method_7960()) {
            c.field_1724.method_7346();
         }
      }
   }

   // $VF: renamed from: s () void
   private void method_2846() {
      if (this.field_2182.method_671() && this.method_2831()) {
         this.method_2845(c.field_1724.field_7512);
      }
   }

   private static enum Inner1 {
      Standard,
      Alternative,
      Smart;
   }

   private record Inner2(Class2.Inner4 b9, int b_, int ca) {
      // $VF: renamed from: b9 Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner4
      private final Class2.Inner4 field_973;
      // $VF: renamed from: b_ int
      private final int field_974;
      // $VF: renamed from: ca int
      private final int field_975;

      private Inner2(Class2.Inner4 b9, int b_, int ca) {
         this.field_973 = b9;
         this.field_974 = b_;
         this.field_975 = ca;
      }

      // $VF: renamed from: b9 () Dev.ZWare.Client.features.pkg1.pkg1.Class2$Inner4
      public Class2.Inner4 method_1504() {
         return this.field_973;
      }

      // $VF: renamed from: b_ () int
      public int method_1505() {
         return this.field_974;
      }

      // $VF: renamed from: ca () int
      public int method_1506() {
         return this.field_975;
      }
   }

   private static enum Inner3 {
      Manual,
      Automatic;
   }

   private static enum Inner4 {
      HOTBAR_SWAP,
      OFFHAND_SWAP,
      CONTAINER_TO_INVENTORY,
      PICKUP_SWAP;
   }
}
