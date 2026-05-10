package Dev.ZWare.Client.pkg1.pkg7;

import Dev.ZWare.Client.pkg2.pkg1.Class16;
import Dev.ZWare.Client.pkg2.pkg1.Class7;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.function.Predicate;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

public class Class3 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c int
   private int field_239 = -1;
   // $VF: renamed from: d int
   private int field_240 = -1;
   // $VF: renamed from: e int
   private int field_241 = -1;
   // $VF: renamed from: f boolean
   private boolean field_242;

   // $VF: renamed from: a () void
   public void method_463() {
      b.a(this);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = 200
   )
   private void method_464(Class7.Inner2 var1) {
      if (!this.method_473()) {
         this.method_475();
      } else {
         this.field_239 = a.field_1724.method_31548().method_67532();
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP(
      a = -200
   )
   private void method_465(Class7.Inner2 var1) {
      if (!this.method_473()) {
         this.method_475();
      } else {
         this.method_470();
         this.field_239 = -1;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner2) void
   @iFT13zrx_wTXP
   private void method_466(Class16.Inner2 var1) {
      if (var1.method_1045() instanceof UpdateSelectedSlotC2SPacket var2) {
         this.field_241 = var2.method_12442();
         if (!this.field_242) {
            this.field_240 = -1;
         }
      }
   }

   // $VF: renamed from: a (int) boolean
   public boolean method_467(int targetSlot) {
      return this.method_468(targetSlot, false);
   }

   // $VF: renamed from: a (int, boolean) boolean
   public boolean method_468(int targetSlot, boolean silent) {
      if (!this.method_472(targetSlot)) {
         return false;
      } else {
         int var3 = a.field_1724.method_31548().method_67532();
         if (silent && var3 != targetSlot) {
            int var4 = this.method_474(this.field_240) ? this.field_240 : (this.method_474(this.field_239) ? this.field_239 : var3);
            this.field_240 = var4 != targetSlot ? var4 : -1;
         } else if (!silent) {
            this.field_240 = -1;
         }

         if (var3 != targetSlot) {
            a.field_1724.method_31548().method_61496(targetSlot);
         }

         this.method_471(targetSlot);
         return true;
      }
   }

   // $VF: renamed from: a (java.util.function.Predicate) int
   public int method_469(Predicate<ItemStack> predicate) {
      if (!this.method_473()) {
         return -1;
      } else {
         ItemStack var2 = a.field_1724.method_6047();
         if (!var2.method_7960() && predicate.test(var2)) {
            return a.field_1724.method_31548().method_67532();
         } else {
            for (int var3 = 0; var3 < 9; var3++) {
               ItemStack var4 = a.field_1724.method_31548().method_5438(var3);
               if (!var4.method_7960() && predicate.test(var4)) {
                  return var3;
               }
            }

            return -1;
         }
      }
   }

   // $VF: renamed from: b () void
   private void method_470() {
      if (!this.method_474(this.field_240)) {
         this.field_240 = -1;
      } else {
         int var1 = this.field_240;
         this.field_240 = -1;
         int var2 = a.field_1724.method_31548().method_67532();
         if (var2 != var1) {
            a.field_1724.method_31548().method_61496(var1);
         }

         this.method_471(var1);
      }
   }

   // $VF: renamed from: a (int) void
   private void method_471(int var1) {
      if (this.field_241 != var1 && a.method_1562() != null) {
         this.field_242 = true;

         try {
            a.method_1562().method_52787(new UpdateSelectedSlotC2SPacket(var1));
         } finally {
            this.field_242 = false;
         }
      }
   }

   // $VF: renamed from: b (int) boolean
   private boolean method_472(int var1) {
      return this.method_473()
         && this.method_474(var1)
         && (Dev.ZWare.Client.Class1.field_299 == null || !Dev.ZWare.Client.Class1.field_299.method_109().method_608(false));
   }

   // $VF: renamed from: a () boolean
   private boolean method_473() {
      return a.field_1724 != null && a.field_1687 != null && a.method_1562() != null;
   }

   // $VF: renamed from: c (int) boolean
   private boolean method_474(int var1) {
      return var1 >= 0 && var1 <= 8;
   }

   // $VF: renamed from: c () void
   private void method_475() {
      this.field_239 = -1;
      this.field_240 = -1;
      this.field_241 = -1;
   }
}
