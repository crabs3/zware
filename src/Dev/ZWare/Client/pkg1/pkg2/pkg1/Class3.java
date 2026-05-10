package Dev.ZWare.Client.pkg1.pkg2.pkg1;

import Dev.ZWare.Client.features.pkg1.pkg5.Class7;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.util.Pool;

public final class Class3 {
   // $VF: renamed from: a Dev.ZWare.Client.pkg1.pkg2.pkg1.Class1
   private final Class1 field_380 = new Class1();
   // $VF: renamed from: b Dev.ZWare.Client.pkg1.pkg2.pkg1.Class2
   private final Class2 field_381 = new Class2();
   // $VF: renamed from: c net.minecraft.client.util.Pool
   private final Pool field_382 = new Pool(4);
   // $VF: renamed from: d boolean
   private boolean field_383;
   // $VF: renamed from: e boolean
   private boolean field_384;
   // $VF: renamed from: f boolean
   private boolean field_385;
   // $VF: renamed from: g boolean
   private boolean field_386;
   // $VF: renamed from: h Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5
   private Class5 field_387;

   // $VF: renamed from: a () void
   public void method_789() {
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientStopping)var1 -> this.method_803());
   }

   // $VF: renamed from: a () boolean
   public boolean method_790() {
      if (this.field_383) {
         return false;
      } else {
         Class7 var1 = Class7.method_2201();
         MinecraftClient var2 = MinecraftClient.method_1551();
         if (var1 == null || var2 == null || !var1.method_2202()) {
            return false;
         } else if (!this.field_380.method_187(var2)) {
            return false;
         } else {
            this.field_380.method_188();
            this.field_383 = true;
            return true;
         }
      }
   }

   // $VF: renamed from: b () void
   public void method_791() {
      this.field_383 = false;
      this.field_384 = false;
      this.field_385 = false;
      this.field_386 = false;
      this.field_387 = null;
   }

   // $VF: renamed from: b () boolean
   public boolean method_792() {
      return this.method_794();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5) boolean
   public boolean method_793(Class5 settings) {
      if (!this.field_383 && settings != null) {
         MinecraftClient var2 = MinecraftClient.method_1551();
         if (var2 == null) {
            return false;
         } else {
            if (this.field_385) {
               this.method_804(var2);
            }

            if (!this.field_380.method_187(var2)) {
               return false;
            } else {
               this.field_380.method_188();
               this.field_383 = true;
               this.field_386 = true;
               this.field_387 = settings;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: c () boolean
   private boolean method_794() {
      if (this.field_383) {
         return false;
      } else {
         MinecraftClient var1 = MinecraftClient.method_1551();
         if (var1 == null) {
            return false;
         } else {
            Class7 var2 = Class7.method_2201();
            if (var2 == null || !var2.method_2216()) {
               return false;
            } else if (!this.field_380.method_187(var1)) {
               return false;
            } else {
               if (!this.field_384) {
                  this.field_380.method_188();
                  this.field_384 = true;
               }

               this.field_383 = true;
               return true;
            }
         }
      }
   }

   // $VF: renamed from: c () void
   public void method_795() {
      this.method_797();
   }

   // $VF: renamed from: d () void
   public void method_796() {
      if (this.field_383 && this.field_386) {
         this.field_383 = false;
         this.field_386 = false;
         MinecraftClient var1 = MinecraftClient.method_1551();
         Framebuffer var2 = this.field_380.method_186();
         Class5 var3 = this.field_387;
         this.field_387 = null;
         if (var1 != null && var2 != null && var3 != null) {
            this.field_381.method_981(var1, var2, this.field_382, var3);
            this.method_805(var1, var2);
         }
      }
   }

   // $VF: renamed from: e () void
   private void method_797() {
      if (this.field_383) {
         this.field_383 = false;
         this.field_385 = true;
      }
   }

   // $VF: renamed from: a (float) void
   public void method_798(float tickDelta) {
      if (this.field_383) {
         this.method_795();
      }

      if (this.field_385) {
         MinecraftClient var2 = MinecraftClient.method_1551();
         if (var2 != null) {
            this.method_804(var2);
         }
      }
   }

   // $VF: renamed from: b (float) void
   public void method_799(float tickDelta) {
      if (this.field_383) {
         this.field_383 = false;
         MinecraftClient var2 = MinecraftClient.method_1551();
         Framebuffer var3 = this.field_380.method_186();
         if (var2 != null && var3 != null) {
            Class7 var4 = Class7.method_2201();
            if (var4 != null && var4.method_2205()) {
               this.field_381.method_980(var2, var3, this.field_382, var4);
            }

            Framebuffer var5 = var2.method_1522();
            if (var5 != null && var5.method_30277() != null) {
               var3.method_68445(var5.method_30277());
            }
         }
      }
   }

   // $VF: renamed from: a () net.minecraft.client.gl.Framebuffer
   public Framebuffer method_800() {
      return !this.field_383 ? null : this.field_380.method_186();
   }

   // $VF: renamed from: d () boolean
   public boolean method_801() {
      Class7 var1 = Class7.method_2201();
      return this.field_383 && var1 != null && var1.d() && !var1.method_2208();
   }

   // $VF: renamed from: e () boolean
   public boolean method_802() {
      Class7 var1 = Class7.method_2201();
      return this.field_383 && var1 != null && var1.d() && !var1.method_2207();
   }

   // $VF: renamed from: f () void
   public void method_803() {
      this.field_383 = false;
      this.field_384 = false;
      this.field_385 = false;
      this.field_386 = false;
      this.field_387 = null;
      this.field_381.method_984();
      this.field_380.method_189();
      this.field_382.close();
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient) void
   private void method_804(MinecraftClient var1) {
      if (this.field_385) {
         this.field_385 = false;
         this.field_384 = false;
         Framebuffer var2 = this.field_380.method_186();
         Class7 var3 = Class7.method_2201();
         if (var2 != null && var3 != null) {
            this.field_381.method_980(var1, var2, this.field_382, var3);
            this.method_805(var1, var2);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.MinecraftClient, net.minecraft.client.gl.Framebuffer) void
   private void method_805(MinecraftClient var1, Framebuffer var2) {
      Framebuffer var3 = var1.method_1522();
      if (var3 != null && var3.method_30277() != null) {
         var2.method_68445(var3.method_30277());
      }
   }
}
