package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.mixin.Class26;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class Class1 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class1.Inner2> field_2627 = this.a("Mode", Class1.Inner2.HandSwing);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2628 = this.a("Amount", 50, 1, 5000);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2629 = this.a("Packets Per Tick", 25, 1, 500);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class1.Inner1> field_2630 = this.a("Hand", Class1.Inner1.Mainhand);
   // $VF: renamed from: s int
   private int field_2631;
   // $VF: renamed from: t boolean
   private boolean field_2632;
   // $VF: renamed from: u boolean
   private boolean field_2633;

   public Class1() {
      super("Packet Test", "Sends configurable packet bursts for limit testing.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
      this.field_2630.method_709(var1 -> this.field_2627.method_671().method_1101());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2631 = this.field_2628.method_671();
      this.field_2632 = false;
      this.field_2633 = false;
      if (g() || c.method_1562() == null || c.field_1724 == null || c.field_1687 == null) {
         this.k();
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_2631 = 0;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_3309(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      if (!g() && c.method_1562() != null && c.field_1724 != null && c.field_1687 != null) {
         for (int var2 = 0; this.field_2631 > 0 && var2 < this.field_2629.method_671(); var2++) {
            if (!this.method_3310()) {
               this.k();
               return;
            }

            this.field_2631--;
         }

         if (this.field_2631 <= 0) {
            Dev.ZWare.Client.features.pkg2.Class1.method_1647(
               Formatting.field_1080
                  + "PacketTest finished "
                  + Formatting.field_1068
                  + this.field_2628.method_671()
                  + Formatting.field_1080
                  + " "
                  + this.field_2627.method_671().field_594
                  + Formatting.field_1080
                  + " packets."
            );
            this.k();
         }
      } else {
         this.k();
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2627.method_671().field_594 + " " + this.field_2631;
   }

   // $VF: renamed from: a () boolean
   private boolean method_3310() {
      return switch ((Class1.Inner2)this.field_2627.method_671()) {
         case HandSwing -> this.method_3311();
         case UseItem -> this.method_3312();
         case UseBlock -> this.method_3313();
         case UpdateSelectedSlot -> this.method_3314();
         case ClickSlot -> this.method_3315();
         case ClickSlotOffhand -> this.method_3316();
         case SwapItemWithOffhand -> this.method_3317();
         case SprintCommand -> this.method_3318();
         case SneakCommand -> this.method_3319();
      };
   }

   // $VF: renamed from: b () boolean
   private boolean method_3311() {
      c.method_1562().method_52787(new HandSwingC2SPacket(this.method_3320()));
      return true;
   }

   // $VF: renamed from: c () boolean
   private boolean method_3312() {
      int var1 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
      c.method_1562().method_52787(new PlayerInteractItemC2SPacket(this.method_3320(), var1, c.field_1724.method_36454(), c.field_1724.method_36455()));
      return true;
   }

   // $VF: renamed from: n () boolean
   private boolean method_3313() {
      if (c.field_1765 instanceof BlockHitResult var1 && c.field_1765.method_17783() == Type.field_1332) {
         int var3 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
         c.method_1562().method_52787(new PlayerInteractBlockC2SPacket(this.method_3320(), var1, var3));
         return true;
      } else {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1061 + "PacketTest needs a block target for UseBlock.");
         return false;
      }
   }

   // $VF: renamed from: o () boolean
   private boolean method_3314() {
      c.method_1562().method_52787(new UpdateSelectedSlotC2SPacket(c.field_1724.method_31548().method_67532()));
      return true;
   }

   // $VF: renamed from: p () boolean
   private boolean method_3315() {
      if (c.field_1761 == null) {
         return false;
      } else {
         int var1 = c.field_1724.method_31548().method_67532();
         c.field_1761
            .method_2906(c.field_1724.field_7512.field_7763, Dev.ZWare.Client.pkg1.Class9.method_144(var1), var1, SlotActionType.field_7791, c.field_1724);
         return true;
      }
   }

   // $VF: renamed from: q () boolean
   private boolean method_3316() {
      if (c.field_1761 == null) {
         return false;
      } else {
         int var1 = c.field_1724.method_31548().method_67532();
         c.field_1761
            .method_2906(c.field_1724.field_7512.field_7763, Dev.ZWare.Client.pkg1.Class9.method_144(var1), 40, SlotActionType.field_7791, c.field_1724);
         return true;
      }
   }

   // $VF: renamed from: r () boolean
   private boolean method_3317() {
      c.method_1562().method_52787(new PlayerActionC2SPacket(Action.field_12969, BlockPos.field_10980, Direction.field_11033));
      return true;
   }

   // $VF: renamed from: s () boolean
   private boolean method_3318() {
      Mode var1 = this.field_2632 ? Mode.field_12985 : Mode.field_12981;
      this.field_2632 = !this.field_2632;
      c.method_1562().method_52787(new ClientCommandC2SPacket(c.field_1724, var1));
      return true;
   }

   // $VF: renamed from: t () boolean
   private boolean method_3319() {
      Mode var1 = this.field_2633 ? Mode.field_12984 : Mode.field_12979;
      this.field_2633 = !this.field_2633;
      c.method_1562().method_52787(new ClientCommandC2SPacket(c.field_1724, var1));
      return true;
   }

   // $VF: renamed from: a () net.minecraft.util.Hand
   private Hand method_3320() {
      return this.field_2630.method_671() == Class1.Inner1.Offhand ? Hand.field_5810 : Hand.field_5808;
   }

   public static enum Inner1 {
      Mainhand,
      Offhand;
   }

   public static enum Inner2 {
      HandSwing("HandSwing"),
      UseItem("UseItem"),
      UseBlock("UseBlock"),
      UpdateSelectedSlot("UpdateSelectedSlot"),
      ClickSlot("ClickSlot"),
      ClickSlotOffhand("ClickSlotOffhand"),
      SwapItemWithOffhand("SwapItemWithOffhand"),
      SprintCommand("SprintCommand"),
      SneakCommand("SneakCommand");

      // $VF: renamed from: a java.lang.String
      private final String field_594;

      private Inner2(String var3) {
         this.field_594 = var3;
      }

      // $VF: renamed from: a () boolean
      public boolean method_1101() {
         return this == HandSwing || this == UseItem || this == UseBlock;
      }
   }
}
