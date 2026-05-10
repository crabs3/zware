package Dev.ZWare.Client.pkg2.pkg1;

import net.minecraft.network.packet.Packet;

public abstract class Class16 extends Dev.ZWare.Client.pkg2.Class1 {
   // $VF: renamed from: b net.minecraft.network.packet.Packet
   private final Packet<?> field_555;

   public Class16(Packet<?> packet) {
      this.field_555 = packet;
   }

   // $VF: renamed from: a () net.minecraft.network.packet.Packet
   public Packet<?> method_1045() {
      return this.field_555;
   }

   public static class Inner1 extends Class16 {
      public Inner1(Packet<?> packet) {
         super(packet);
      }

      // $VF: renamed from: a () net.minecraft.network.packet.Packet
      @Override
      public Packet<?> method_1045() {
         return super.method_1045();
      }

      // $VF: renamed from: a () void
      public void method_1048() {
         this.method_1022(true);
      }

      // $VF: renamed from: a (boolean) void
      @Override
      public void method_1022(boolean cancelled) {
         super.a(cancelled);
      }

      // $VF: renamed from: a () boolean
      @Override
      public boolean method_1023() {
         return super.a();
      }
   }

   public static class Inner2 extends Class16 {
      public Inner2(Packet<?> packet) {
         super(packet);
      }

      // $VF: renamed from: a () net.minecraft.network.packet.Packet
      @Override
      public Packet<?> method_1045() {
         return super.method_1045();
      }

      // $VF: renamed from: a () void
      public void method_1047() {
         this.method_1022(true);
      }

      // $VF: renamed from: a (boolean) void
      @Override
      public void method_1022(boolean cancelled) {
         super.a(cancelled);
      }

      // $VF: renamed from: a () boolean
      @Override
      public boolean method_1023() {
         return super.a();
      }
   }

   public static class Inner3 extends Class16 {
      public Inner3(Packet<?> packet) {
         super(packet);
      }

      // $VF: renamed from: a () net.minecraft.network.packet.Packet
      @Override
      public Packet<?> method_1045() {
         return super.method_1045();
      }

      // $VF: renamed from: a () void
      public void method_1046() {
         this.method_1022(true);
      }

      // $VF: renamed from: a (boolean) void
      @Override
      public void method_1022(boolean cancelled) {
         super.a(cancelled);
      }

      // $VF: renamed from: a () boolean
      @Override
      public boolean method_1023() {
         return super.a();
      }
   }
}
