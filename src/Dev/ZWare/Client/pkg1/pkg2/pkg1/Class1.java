package Dev.ZWare.Client.pkg1.pkg2.pkg1;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;

public final class Class1 {
   // $VF: renamed from: a java.lang.String
   private static final String field_79 = "oyvey_hand_shader_capture";
   // $VF: renamed from: b net.minecraft.client.gl.SimpleFramebuffer
   private SimpleFramebuffer field_80;

   // $VF: renamed from: a () net.minecraft.client.gl.Framebuffer
   public Framebuffer method_186() {
      return this.field_80;
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient) boolean
   public boolean method_187(MinecraftClient client) {
      int var2 = Math.max(1, client.method_22683().method_4489());
      int var3 = Math.max(1, client.method_22683().method_4506());
      if (this.field_80 == null) {
         this.field_80 = new SimpleFramebuffer("oyvey_hand_shader_capture", var2, var3, true);
      } else if (this.field_80.field_1482 != var2 || this.field_80.field_1481 != var3) {
         this.field_80.method_1234(var2, var3);
      }

      this.field_80.method_58226(FilterMode.LINEAR);
      return true;
   }

   // $VF: renamed from: a () void
   public void method_188() {
      if (this.field_80 != null) {
         GpuTexture var1 = this.field_80.method_30277();
         if (var1 != null) {
            CommandEncoder var2 = RenderSystem.getDevice().createCommandEncoder();
            GpuTexture var3 = this.field_80.method_30278();
            if (this.field_80.field_1478 && var3 != null) {
               var2.clearColorAndDepthTextures(var1, 0, var3, 1.0);
            } else {
               var2.clearColorTexture(var1, 0);
            }
         }
      }
   }

   // $VF: renamed from: b () void
   public void method_189() {
      if (this.field_80 != null) {
         this.field_80.method_1238();
         this.field_80 = null;
      }
   }
}
