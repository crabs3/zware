package Dev.ZWare.Client.features.pkg1.pkg1;

import Dev.ZWare.Client.mixin.Class56;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class Class17 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1683 = this.a("Reel Delay", 0, 0, 20);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1684 = this.a("Recast Delay", 10, 0, 40);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1685 = this.a("Cast Delay", 8, 0, 40);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1686 = this.a("Pause Screen", true);
   // $VF: renamed from: s int
   private int field_1687;
   // $VF: renamed from: t int
   private int field_1688;

   public Class17() {
      super("Auto Shark", "auto fishes for sharks", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, false, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1687 = 0;
      this.field_1688 = 0;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1688 = 0;
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      if (!g() && c.field_1761 != null) {
         if (this.field_1686.method_671()
            && c.field_1755 != null
            && !(c.field_1755 instanceof InventoryScreen)
            && !(c.field_1755 instanceof CreativeInventoryScreen)
            && !(c.field_1755 instanceof ChatScreen)) {
            this.field_1688 = 0;
         } else {
            if (this.field_1687 > 0) {
               this.field_1687--;
            }

            Hand var1 = this.method_2313();
            if (var1 == null) {
               this.field_1688 = 0;
            } else {
               FishingBobberEntity var2 = c.field_1724.field_7513;
               if (var2 != null && (var2.method_31481() || var2.method_37908() != c.field_1687)) {
                  var2 = null;
               }

               if (var2 == null) {
                  this.field_1688 = 0;
                  if (this.field_1687 <= 0 && this.method_2312(var1)) {
                     this.field_1687 = this.field_1685.method_671();
                  }
               } else if (!this.method_2311(var2)) {
                  this.field_1688 = 0;
               } else if (this.field_1688 < this.field_1683.method_671()) {
                  this.field_1688++;
               } else {
                  if (this.field_1687 <= 0 && this.method_2312(var1)) {
                     this.field_1687 = this.field_1684.method_671();
                     this.field_1688 = 0;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      Hand var1 = this.method_2313();
      if (var1 == null) {
         return "NoRod";
      } else {
         return c.field_1724 != null && c.field_1724.field_7513 != null ? "Fishing" : "Casting";
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.projectile.FishingBobberEntity) boolean
   private boolean method_2311(FishingBobberEntity var1) {
      return var1.method_26957() != null ? true : ((Class56)var1).getCaughtFish();
   }

   // $VF: renamed from: a (net.minecraft.util.Hand) boolean
   private boolean method_2312(Hand var1) {
      ActionResult var2 = c.field_1761.method_2919(c.field_1724, var1);
      if (!var2.method_23665()) {
         return false;
      } else {
         c.field_1724.method_6104(var1);
         return true;
      }
   }

   // $VF: renamed from: a () net.minecraft.util.Hand
   private Hand method_2313() {
      if (this.method_2314(c.field_1724.method_6047())) {
         return Hand.field_5808;
      } else {
         return this.method_2314(c.field_1724.method_6079()) ? Hand.field_5810 : null;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2314(ItemStack var1) {
      return var1 != null && !var1.method_7960() && var1.method_7909() instanceof FishingRodItem;
   }
}
