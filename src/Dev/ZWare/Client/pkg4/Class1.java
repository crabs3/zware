package Dev.ZWare.Client.pkg4;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.TeleportConfirmC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.screen.slot.SlotActionType;

public class Class1 {
   // $VF: renamed from: a long
   private static final long field_114 = 50L;
   // $VF: renamed from: b long
   private static final long field_115 = 250L;
   // $VF: renamed from: c long
   private static final long field_116 = 1000L;
   // $VF: renamed from: d java.util.Map
   private final Map<Class1.Inner1, Class1.Inner2> field_117 = new EnumMap<>(Class1.Inner1.class);
   // $VF: renamed from: e java.util.Deque
   private final Deque<Long> field_118 = new ArrayDeque<>();

   public Class1() {
      for (Class1.Inner1 var4 : Class1.Inner1.values()) {
         this.field_117.put(var4, new Class1.Inner2());
      }

      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(this);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner3) void
   @iFT13zrx_wTXP
   private void method_248(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner3 var1) {
      Packet var2 = var1.method_1045();
      if (var2 != null) {
         if (!(var2 instanceof ClickSlotC2SPacket) || !this.method_270(System.currentTimeMillis())) {
            long var3 = System.currentTimeMillis();
            EnumSet var5 = this.method_259(var2);
            if (!var5.isEmpty()) {
               for (Class1.Inner1 var7 : var5) {
                  if (!this.field_117.get(var7).method_1059(var3, this.method_262(var7, var2), this.method_258(var7))) {
                     var1.method_1046();
                     return;
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner2) void
   @iFT13zrx_wTXP
   private void method_249(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner2 var1) {
      Packet var2 = var1.method_1045();
      if (var2 != null) {
         this.method_267(this.method_260(var2), System.currentTimeMillis());
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class1$Inner1) int
   public int method_250(Class1.Inner1 category) {
      if (!this.method_256(category)) {
         this.field_117.get(category).method_1058();
         return 0;
      } else {
         return this.field_117.get(category).method_1062(System.currentTimeMillis(), this.method_258(category));
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg4.Class1$Inner1) int
   public int method_251(Class1.Inner1 category) {
      return !this.method_256(category) ? 0 : Math.max(0, this.method_257(category) - this.method_250(category));
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class1$Inner1) long
   public long method_252(Class1.Inner1 category) {
      if (!this.method_256(category)) {
         this.field_117.get(category).method_1058();
         return 0L;
      } else {
         return this.field_117.get(category).method_1063(System.currentTimeMillis(), this.method_258(category));
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.Packet) boolean
   public boolean method_253(Packet<?> packet) {
      long var2 = System.currentTimeMillis();

      for (Class1.Inner1 var5 : this.method_259(packet)) {
         if (!this.field_117.get(var5).method_1059(var2, this.method_262(var5, packet), this.method_258(var5))) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (int, net.minecraft.screen.slot.SlotActionType) boolean
   public boolean method_254(int button, SlotActionType actionType) {
      EnumSet var3 = this.method_269(button, actionType);
      if (var3.isEmpty()) {
         return true;
      } else {
         long var4 = System.currentTimeMillis();

         for (Class1.Inner1 var7 : var3) {
            if (!this.field_117.get(var7).method_1059(var4, this.method_263(var7), this.method_258(var7))) {
               return false;
            }
         }

         this.method_266(var3, var4);
         synchronized (this.field_118) {
            this.field_118.addLast(var4);
            return true;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class12) boolean
   public boolean method_255(Class12 priority) {
      if (!this.method_256(Class1.Inner1.Global)) {
         return false;
      } else {
         int var2 = this.method_251(Class1.Inner1.Global);
         int var3 = this.method_264(this.method_258(Class1.Inner1.Global));

         int var4 = switch (priority) {
            case HIGH -> var3;
            case MEDIUM -> var3 + 8;
            case field_724 -> var3 + 24;
         };
         return var2 <= var4;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class1$Inner1) boolean
   public boolean method_256(Class1.Inner1 category) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = this.method_272();
      if (var2 == null) {
         return true;
      } else {
         return switch (category) {
            case Global -> var2.method_3130();
            case Offhand -> var2.method_3131();
            case ClickSlot -> var2.method_3132();
         };
      }
   }

   // $VF: renamed from: c (Dev.ZWare.Client.pkg4.Class1$Inner1) int
   public int method_257(Class1.Inner1 category) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = this.method_272();

      return switch (category) {
         case Global -> var2 != null ? var2.method_3124() : 1249;
         case Offhand -> var2 != null ? var2.method_3126() : 121;
         case ClickSlot -> var2 != null ? var2.method_3128() : 79;
      };
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg4.Class1$Inner1) long
   public long method_258(Class1.Inner1 category) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var2 = this.method_272();

      return switch (category) {
         case Global -> var2 != null ? var2.method_3125() : 3951L;
         case Offhand -> var2 != null ? var2.method_3127() : 500L;
         case ClickSlot -> var2 != null ? var2.method_3129() : 4200L;
      };
   }

   // $VF: renamed from: a (net.minecraft.network.packet.Packet) java.util.EnumSet
   private EnumSet<Class1.Inner1> method_259(Packet<?> var1) {
      EnumSet var2 = EnumSet.noneOf(Class1.Inner1.class);
      if (this.method_256(Class1.Inner1.Global) && this.method_261(var1)) {
         var2.add(Class1.Inner1.Global);
      }

      if (var1 instanceof ClickSlotC2SPacket && this.method_256(Class1.Inner1.ClickSlot)) {
         var2.add(Class1.Inner1.ClickSlot);
      }

      if (var1 instanceof PlayerActionC2SPacket var3 && var3.method_12363() == Action.field_12969 && this.method_256(Class1.Inner1.Offhand)) {
         var2.add(Class1.Inner1.Offhand);
      }

      return var2;
   }

   // $VF: renamed from: b (net.minecraft.network.packet.Packet) java.util.EnumSet
   private EnumSet<Class1.Inner1> method_260(Packet<?> var1) {
      EnumSet var2 = EnumSet.noneOf(Class1.Inner1.class);
      if (this.method_256(Class1.Inner1.Global) && this.method_261(var1)) {
         var2.add(Class1.Inner1.Global);
      }

      if (var1 instanceof ClickSlotC2SPacket && this.method_256(Class1.Inner1.ClickSlot)) {
         var2.add(Class1.Inner1.ClickSlot);
      }

      if (var1 instanceof PlayerActionC2SPacket var3 && var3.method_12363() == Action.field_12969 && this.method_256(Class1.Inner1.Offhand)) {
         var2.add(Class1.Inner1.Offhand);
      }

      return var2;
   }

   // $VF: renamed from: b (net.minecraft.network.packet.Packet) boolean
   private boolean method_261(Packet<?> var1) {
      return var1 != null;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class1$Inner1, net.minecraft.network.packet.Packet) int
   private int method_262(Class1.Inner1 var1, Packet<?> var2) {
      int var3 = this.method_257(var1);
      if (var1 != Class1.Inner1.Global) {
         return var3;
      } else {
         return this.method_265(var2) ? var3 : Math.max(1, var3 - this.method_264(this.method_258(var1)));
      }
   }

   // $VF: renamed from: d (Dev.ZWare.Client.pkg4.Class1$Inner1) int
   private int method_263(Class1.Inner1 var1) {
      return var1 != Class1.Inner1.Global ? this.method_257(var1) : Math.max(1, this.method_257(var1) - this.method_264(this.method_258(var1)));
   }

   // $VF: renamed from: a (long) int
   private int method_264(long var1) {
      int var3 = (int)Math.ceil(var1 / 50.0);
      int var4 = (int)Math.ceil(var1 / 250.0);
      return Math.max(8, var3 + var4);
   }

   // $VF: renamed from: c (net.minecraft.network.packet.Packet) boolean
   private boolean method_265(Packet<?> var1) {
      return var1 instanceof PlayerMoveC2SPacket
         || var1 instanceof PlayerInputC2SPacket
         || var1 instanceof ClientTickEndC2SPacket
         || var1 instanceof KeepAliveC2SPacket
         || var1 instanceof CommonPongC2SPacket
         || var1 instanceof TeleportConfirmC2SPacket;
   }

   // $VF: renamed from: a (java.util.EnumSet, long) void
   private void method_266(EnumSet<Class1.Inner1> var1, long var2) {
      for (Class1.Inner1 var5 : var1) {
         this.field_117.get(var5).method_1060(var2, this.method_258(var5));
      }
   }

   // $VF: renamed from: b (java.util.EnumSet, long) void
   private void method_267(EnumSet<Class1.Inner1> var1, long var2) {
      for (Class1.Inner1 var5 : var1) {
         this.field_117.get(var5).method_1061(var2, this.method_258(var5));
      }
   }

   // $VF: renamed from: b (int, net.minecraft.screen.slot.SlotActionType) boolean
   private boolean method_268(int var1, SlotActionType var2) {
      return var2 == SlotActionType.field_7791 && var1 == 40;
   }

   // $VF: renamed from: a (int, net.minecraft.screen.slot.SlotActionType) java.util.EnumSet
   private EnumSet<Class1.Inner1> method_269(int var1, SlotActionType var2) {
      EnumSet var3 = EnumSet.noneOf(Class1.Inner1.class);
      if (this.method_256(Class1.Inner1.Global)) {
         var3.add(Class1.Inner1.Global);
      }

      if (this.method_256(Class1.Inner1.ClickSlot)) {
         var3.add(Class1.Inner1.ClickSlot);
      }

      if (this.method_256(Class1.Inner1.Offhand) && this.method_268(var1, var2)) {
         var3.add(Class1.Inner1.Offhand);
      }

      return var3;
   }

   // $VF: renamed from: a (long) boolean
   private boolean method_270(long var1) {
      synchronized (this.field_118) {
         this.method_271(var1);
         if (this.field_118.isEmpty()) {
            return false;
         } else {
            this.field_118.removeFirst();
            return true;
         }
      }
   }

   // $VF: renamed from: a (long) void
   private void method_271(long var1) {
      while (true) {
         Long var3 = this.field_118.peekFirst();
         if (var3 == null || var1 - var3 < 1000L) {
            return;
         }

         this.field_118.removeFirst();
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class9
   private Dev.ZWare.Client.features.pkg1.pkg4.Class9 method_272() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class9.class);
         if (var1 != null) {
            return var1;
         }
      }

      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3092();
   }

   public static enum Inner1 {
      Global,
      Offhand,
      ClickSlot;
   }

   static final class Inner2 {
      // $VF: renamed from: a java.util.Deque
      private final Deque<Long> field_564 = new ArrayDeque<>();
      // $VF: renamed from: b java.util.Deque
      private final Deque<Long> field_565 = new ArrayDeque<>();

      // $VF: renamed from: a () void
      public synchronized void method_1058() {
         this.field_564.clear();
         this.field_565.clear();
      }

      // $VF: renamed from: a (long, int, long) boolean
      public synchronized boolean method_1059(long now, int limit, long timingMs) {
         this.method_1064(now, timingMs);
         return this.method_1065() < limit;
      }

      // $VF: renamed from: a (long, long) void
      public synchronized void method_1060(long now, long timingMs) {
         this.method_1064(now, timingMs);
         this.field_564.addLast(now);
      }

      // $VF: renamed from: b (long, long) void
      public synchronized void method_1061(long now, long timingMs) {
         this.method_1064(now, timingMs);
         this.field_565.addLast(now);
      }

      // $VF: renamed from: a (long, long) int
      public synchronized int method_1062(long now, long timingMs) {
         this.method_1064(now, timingMs);
         return this.method_1065();
      }

      // $VF: renamed from: a (long, long) long
      public synchronized long method_1063(long now, long timingMs) {
         this.method_1064(now, timingMs);
         return Math.max(this.method_1067(now, timingMs, this.field_564), this.method_1067(now, timingMs, this.field_565));
      }

      // $VF: renamed from: c (long, long) void
      private void method_1064(long var1, long var3) {
         this.method_1066(var1, var3, this.field_564);
         this.method_1066(var1, var3, this.field_565);
      }

      // $VF: renamed from: a () int
      private int method_1065() {
         return Math.max(this.field_564.size(), this.field_565.size());
      }

      // $VF: renamed from: a (long, long, java.util.Deque) void
      private void method_1066(long var1, long var3, Deque<Long> var5) {
         while (true) {
            Long var6 = (Long)var5.peekFirst();
            if (var6 == null || var1 - var6 < var3) {
               return;
            }

            var5.removeFirst();
         }
      }

      // $VF: renamed from: a (long, long, java.util.Deque) long
      private long method_1067(long var1, long var3, Deque<Long> var5) {
         return var5.isEmpty() ? 0L : Math.max(0L, var3 - (var1 - (Long)var5.peekFirst()));
      }
   }
}
