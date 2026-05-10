package Dev.ZWare.Client.pkg4;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public class Class14 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f int
   private static final int field_1025 = 20;
   // $VF: renamed from: g java.util.List
   private final List<Float> field_1026 = new ArrayList<>();
   // $VF: renamed from: h float
   private float field_1027 = 0.0F;

   // $VF: renamed from: c () void
   public void method_1565() {
      this.field_1026.add(this.method_1569(c.field_1724));

      while (this.field_1026.size() > 20) {
         this.field_1026.removeFirst();
      }

      this.field_1027 = this.field_1026.stream().reduce(0.0F, Float::sum) / this.field_1026.size();
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) double
   public double method_1566(PlayerEntity player) {
      return c.field_1724 == player ? this.field_1027 : this.method_1569(player);
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) double
   public double method_1567(PlayerEntity player) {
      return this.method_1566(player) * 20.0;
   }

   // $VF: renamed from: c (net.minecraft.entity.player.PlayerEntity) double
   public double method_1568(PlayerEntity player) {
      return this.method_1567(player) * 3.6;
   }

   // $VF: renamed from: a (net.minecraft.entity.Entity) float
   public float method_1569(Entity entity) {
      Entity var2 = entity.method_5854();
      double var3 = entity.method_23317() - entity.field_6014;
      double var5 = entity.method_23321() - entity.field_5969;
      if (var2 != null) {
         var3 = var2.method_23317() - var2.field_6014;
         var5 = var2.method_23321() - var2.field_5969;
      }

      return (float)Math.hypot(var3, var5);
   }
}
