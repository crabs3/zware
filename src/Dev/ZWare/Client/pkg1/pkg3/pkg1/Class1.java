package Dev.ZWare.Client.pkg1.pkg3.pkg1;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.player.PlayerEntity;

public class Class1 extends OtherClientPlayerEntity {
   // $VF: renamed from: a java.util.UUID
   private final UUID field_3103;
   // $VF: renamed from: b net.minecraft.client.network.PlayerListEntry
   private PlayerListEntry field_3104;

   public Class1(ClientWorld world, PlayerEntity source, String name, float health, boolean copyInventory) {
      super(world, new GameProfile(UUID.randomUUID(), name));
      this.field_3103 = source.method_5667();
      this.method_3800(source, health, copyInventory);
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, float, boolean) void
   public void method_3800(PlayerEntity source, float health, boolean copyInventory) {
      this.method_60949(source.method_19538(), source.method_36454(), source.method_36455());
      this.field_6014 = source.field_6014;
      this.field_6036 = source.field_6036;
      this.field_5969 = source.field_5969;
      this.field_6283 = source.field_6283;
      this.field_6220 = source.field_6220;
      this.field_6241 = source.field_6241;
      this.field_6259 = source.field_6259;
      this.method_18380(source.method_18376());
      this.method_5660(source.method_5715());
      this.method_5728(source.method_5624());
      this.method_24830(source.method_24828());
      byte var4 = (Byte)source.method_5841().method_12789(PlayerEntity.field_7518);
      this.method_5841().method_12778(PlayerEntity.field_7518, var4);
      this.method_6127().method_26846(source.method_6127());
      this.method_6033(Math.min(health, this.method_6063()));
      this.method_6073(source.method_6067() + Math.max(0.0F, health - this.method_6063()));
      if (copyInventory) {
         this.method_31548().method_7377(source.method_31548());
      }
   }

   // $VF: renamed from: a (int) void
   public void method_3801(int entityId) {
      this.method_5838(entityId);
      if (this.method_37908() instanceof ClientWorld var2) {
         var2.method_53875(this);
      }
   }

   // $VF: renamed from: a () void
   public void method_3802() {
      if (this.method_37908() instanceof ClientWorld var1) {
         var1.method_2945(this.method_5628(), RemovalReason.field_26999);
      }

      this.method_5650(RemovalReason.field_26999);
   }

   protected PlayerListEntry method_3123() {
      if (this.field_3104 == null) {
         MinecraftClient var1 = MinecraftClient.method_1551();
         if (var1.method_1562() != null) {
            this.field_3104 = var1.method_1562().method_2871(this.field_3103);
         }
      }

      return this.field_3104;
   }
}
