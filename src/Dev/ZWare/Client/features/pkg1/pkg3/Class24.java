package Dev.ZWare.Client.features.pkg1.pkg3;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.Hand;

public class Class24 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1809 = 14.0;
   // $VF: renamed from: p double
   private static final double field_1810 = 50.0;
   // $VF: renamed from: q int
   private static final int field_1811 = 9;
   // $VF: renamed from: r int
   private static final int field_1812 = 6;
   // $VF: renamed from: s long
   private static final long field_1813 = 500L;
   // $VF: renamed from: t long
   private static final long field_1814 = 100L;
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_1815 = this.a(
      "Throw Bind", Dev.ZWare.Client.features.pkg3.Class4.method_427()
   );
   // $VF: renamed from: v int
   private int field_1816;
   // $VF: renamed from: w boolean
   private boolean field_1817;
   // $VF: renamed from: x boolean
   private boolean field_1818;
   // $VF: renamed from: y java.util.List
   private final List<Long> field_1819 = new ArrayList<>();
   // $VF: renamed from: z int
   private int field_1820;
   // $VF: renamed from: A boolean
   private boolean field_1821;

   public Class24() {
      super("Auto Mend", "mends your armor so you dont get caught booty butt naked", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1816 = 100;
      this.field_1819.clear();
      this.field_1817 = this.field_1815.method_671().method_432();
      this.field_1821 = false;
      this.field_1818 = true;
      this.field_1820 = g() ? 0 : this.method_2415();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1817 = false;
      this.field_1821 = false;
   }

   // $VF: renamed from: n () void
   public void method_2406() {
      if (!g()) {
         this.field_1817 = true;
         this.field_1816 = 100;
         this.field_1821 = false;
         this.field_1820 = this.method_2415();
      }
   }

   // $VF: renamed from: o () void
   public void method_2407() {
      this.field_1817 = false;
      this.field_1821 = false;
   }

   // $VF: renamed from: a () boolean
   public boolean method_2408() {
      return this.field_1817;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      long var1 = System.currentTimeMillis();
      return String.valueOf(this.field_1819.stream().filter(var2 -> var1 - var2 <= 500L).count());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_2409(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g()) {
         long var2 = System.currentTimeMillis();
         this.field_1819.removeIf(var2x -> var2 - var2x > 500L);
         this.method_2410();
         if (this.field_1817) {
            if (this.method_2412() && !c.field_1724.method_7357().method_7904(Items.field_8287.method_7854())) {
               int var4 = this.method_2415();
               if (var4 < this.field_1820 && !this.field_1819.isEmpty()) {
                  long var5 = this.field_1819.getFirst();
                  this.field_1819.removeIf(var2x -> Math.abs(var2x - var5) < 100L);
               }

               this.field_1820 = var4;
               int var13 = this.field_1819.size();
               int var6 = var4 - var13;
               if (var4 <= 0) {
                  this.field_1817 = false;
                  this.field_1821 = false;
               } else if (var6 <= 0) {
                  this.field_1821 = true;
               } else {
                  this.field_1821 = false;
                  int var7 = this.method_2414();
                  int var8 = Math.max(1, var7 / 9);
                  int var9 = Math.max(1, 6 / var8);
                  int var10 = Math.min(var6, 9);
                  if (this.field_1816 < var9) {
                     this.field_1816++;
                  } else {
                     this.field_1816 = 0;
                     if (var10 > 0) {
                        float var11 = c.field_1724.method_36454();
                        float var12 = 90.0F;
                        if (Dev.ZWare.Client.Class1.field_298.method_312(var11, var12, Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("AutoEXP", 50.0))
                           )
                         {
                           this.method_2411(var10, var4, var13, var6, var11, var12);
                        }
                     }
                  }
               }
            } else {
               this.field_1817 = false;
               this.field_1821 = false;
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2410() {
      if (!this.field_1815.method_671().method_432()) {
         if (!this.field_1815.method_671().method_436()) {
            this.field_1818 = true;
         } else if (this.field_1818 && !(c.field_1755 instanceof ChatScreen)) {
            this.field_1817 = !this.field_1817;
            this.field_1818 = false;
            if (this.field_1817) {
               this.field_1816 = 100;
               this.field_1821 = false;
               this.field_1820 = this.method_2415();
            }
         }
      }
   }

   // $VF: renamed from: a (int, int, int, int, float, float) void
   private void method_2411(int var1, int var2, int var3, int var4, float var5, float var6) {
      if (this.field_1817 && !g() && c.field_1687 != null && c.method_1562() != null) {
         Dev.ZWare.Client.pkg1.Class9.Inner1 var8 = null;
         Hand var7;
         if (c.field_1724.method_6079().method_31574(Items.field_8287)) {
            var7 = Hand.field_5810;
         } else {
            var7 = Hand.field_5808;
            if (!c.field_1724.method_6047().method_31574(Items.field_8287)) {
               int var9 = this.method_2413();
               if (var9 == -1) {
                  this.field_1817 = false;
                  this.field_1821 = false;
                  return;
               }

               var8 = Dev.ZWare.Client.pkg1.Class9.method_147(var9);
               if (var8 == null) {
                  this.field_1817 = false;
                  this.field_1821 = false;
                  return;
               }
            }
         }

         int var15 = 0;

         try {
            for (int var10 = 0; var10 < var1; var10++) {
               int var11 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
               c.method_1562().method_52787(new PlayerInteractItemC2SPacket(var7, var11, var5, var6));
               this.field_1819.add(System.currentTimeMillis());
               var15++;
            }
         } finally {
            Dev.ZWare.Client.pkg1.Class9.method_149(var8);
         }
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_2412() {
      return !c.field_1724.method_6047().method_31574(Items.field_8287) && !c.field_1724.method_6079().method_31574(Items.field_8287)
         ? this.method_2413() != -1
         : true;
   }

   // $VF: renamed from: a () int
   private int method_2413() {
      return c.field_1724.field_7512 != c.field_1724.field_7498
         ? -1
         : Dev.ZWare.Client.pkg1.Class9.method_140(var0 -> var0.method_31574(Items.field_8287), 0, 35);
   }

   // $VF: renamed from: b () int
   private int method_2414() {
      if (Dev.ZWare.Client.Class1.field_316 == null) {
         return 9;
      } else {
         Dev.ZWare.Client.features.pkg1.Class1 var1 = Dev.ZWare.Client.Class1.field_316.method_509("Surround");
         Dev.ZWare.Client.features.pkg1.Class1 var2 = Dev.ZWare.Client.Class1.field_316.method_509("AutoTrap");
         boolean var3 = var1 != null && var1.method_1899() || var2 != null && var2.method_1899();
         return var3 ? 6 : 9;
      }
   }

   // $VF: renamed from: c () int
   private int method_2415() {
      int var1 = 0;
      var1 += this.method_2416(c.field_1724.method_6118(EquipmentSlot.field_6169));
      var1 += this.method_2416(c.field_1724.method_6118(EquipmentSlot.field_6174));
      var1 += this.method_2416(c.field_1724.method_6118(EquipmentSlot.field_6172));
      var1 += this.method_2416(c.field_1724.method_6118(EquipmentSlot.field_6166));
      var1 += this.method_2416(c.field_1724.method_6047());
      var1 += this.method_2416(c.field_1724.method_6079());
      return var1 <= 0 ? 0 : (int)Math.ceil(var1 / 14.0);
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) int
   private int method_2416(ItemStack var1) {
      return this.method_2417(var1) ? var1.method_7919() : 0;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2417(ItemStack var1) {
      return var1 != null
         && !var1.method_7960()
         && var1.method_7963()
         && var1.method_7986()
         && Dev.ZWare.Client.pkg1.Class19.method_411(Enchantments.field_9101, var1);
   }
}
