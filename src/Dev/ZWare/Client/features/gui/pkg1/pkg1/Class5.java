package Dev.ZWare.Client.features.gui.pkg1.pkg1;

import net.minecraft.client.gui.DrawContext;

public class Class5 extends Class11 {
   // $VF: renamed from: n Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1216;

   public Class5(Dev.ZWare.Client.features.pkg3.Class8<Boolean> setting) {
      super(setting.method_670());
      this.field_1216 = setting;
      this.i = 15;
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, int, int, float) void
   @Override
   public void method_1701(DrawContext context, int mouseX, int mouseY, float partialTicks) {
      super.method_1701(context, mouseX, mouseY, partialTicks);
   }

   // $VF: renamed from: e () void
   @Override
   public void method_1722() {
      this.field_1216.method_672(!this.field_1216.method_671());
   }

   // $VF: renamed from: c () boolean
   @Override
   public boolean method_1723() {
      return this.field_1216.method_671();
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1704() {
      this.a(!this.field_1216.method_710());
   }

   // $VF: renamed from: a (int, int, int) void
   @Override
   public void method_1702(int mouseX, int mouseY, int mouseButton) {
      super.method_1702(mouseX, mouseY, mouseButton);
      if (this.a(mouseX, mouseY)) {
         this.f();
      }
   }
}
