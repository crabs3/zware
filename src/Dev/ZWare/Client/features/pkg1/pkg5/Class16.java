package Dev.ZWare.Client.features.pkg1.pkg5;

import Dev.ZWare.Client.mixin.Class50;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRemoveS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;

public class Class16 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2082 = this.a("Ignore Friends", false);
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2083 = this.a("Through Walls", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2084 = this.a("Render Items", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2085 = this.a("Range", 128.0F, 5.0F, 512.0F);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2086 = this.a("Scale", 1.0F, 0.5F, 3.0F);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2087 = this.a("Max Spots", 8, 1, 64);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2088 = this.a("Color", 255, 255, 255, 160);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2089 = this.a("Default Color", 255, 255, 255, 255);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2090 = this.a("Friend Color", 85, 200, 255, 255);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2091 = this.a("Enemy Color", 255, 90, 90, 255);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2092 = this.a("Time Color", 200, 200, 200, 255);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2093 = this.a("Background Color", 0, 0, 0, 120);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2094 = this.a("Border", true);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2095 = this.a("Border Color", 18, 18, 18, 210);
   // $VF: renamed from: C java.util.Map
   private final Map<UUID, Class16.Inner5> field_2096 = new HashMap<>();
   // $VF: renamed from: D java.util.List
   private final List<Class16.Inner3> field_2097 = new ArrayList<>();
   // $VF: renamed from: E java.util.List
   private final List<Class16.Inner4> field_2098 = new ArrayList<>();
   // $VF: renamed from: F java.util.Queue
   private final Queue<UUID> field_2099 = new ConcurrentLinkedQueue<>();
   // $VF: renamed from: G java.util.Queue
   private final Queue<UUID> field_2100 = new ConcurrentLinkedQueue<>();
   // $VF: renamed from: H org.joml.Matrix4f
   private final Matrix4f field_2101 = new Matrix4f();
   // $VF: renamed from: I org.joml.Matrix4f
   private final Matrix4f field_2102 = new Matrix4f();
   // $VF: renamed from: J org.joml.Vector4f
   private final Vector4f field_2103 = new Vector4f();

   public Class16() {
      super("Logout Spots", "shows where the opps logged out", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2733();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2733();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2097.isEmpty() ? null : Integer.toString(this.field_2097.size());
   }

   // $VF: renamed from: b () java.util.List
   public List<Class16.Inner1> method_2712() {
      if (this.field_2097.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(this.field_2097.size());

         for (Class16.Inner3 var3 : this.field_2097) {
            if (var3 != null && var3.method_1339() != null) {
               var1.add(
                  new Class16.Inner1(
                     var3.method_1336(),
                     var3.method_1337(),
                     new Vec3d(var3.method_1339().field_53325, var3.method_1339().field_53326, var3.method_1339().field_53327),
                     var3.method_1339().field_53330,
                     var3.method_1341()
                  )
               );
            }
         }

         return List.copyOf(var1);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_2713(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (!g() && c.method_1562() != null) {
         this.method_2720();

         for (PlayerEntity var3 : c.field_1687.method_18456()) {
            if (this.method_2715(var3)) {
               this.method_2716(var3);
               this.field_2097.removeIf(var1x -> var1x.method_1336().equals(var3.method_5667()));
            }
         }

         while (this.field_2097.size() > this.field_2087.method_671()) {
            this.field_2097.remove(0);
         }
      } else {
         this.method_2733();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2714(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (var1.method_1045() instanceof PlayerRemoveS2CPacket var5) {
         this.field_2099.addAll(var5.comp_1105());
      } else {
         if (var1.method_1045() instanceof PlayerListS2CPacket var2) {
            for (Entry var4 : var2.method_46330()) {
               this.field_2100.add(var4.comp_1106());
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      this.field_2098.clear();
      if (!g() && !this.field_2097.isEmpty()) {
         this.field_2101.set(event.method_1055().method_23760().method_23761());
         this.field_2102.set(RenderSystem.getProjectionMatrix());
         long var2 = System.currentTimeMillis();
         ArrayList var4 = new ArrayList();

         for (Class16.Inner3 var6 : this.field_2097) {
            if (this.method_2721(var6)) {
               var4.add(var6);
               Class16.Inner4 var7 = this.method_2722(var6, var2);
               if (var7 != null) {
                  this.field_2098.add(var7);
               }
            }
         }

         if (!var4.isEmpty()) {
            if (this.field_2083.method_671()) {
               this.method_2725(event, var4);
            } else {
               for (Class16.Inner3 var9 : var4) {
                  this.method_2726(event, var9);
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (!g() && !this.field_2098.isEmpty()) {
         DrawContext var2 = event.method_1053();

         for (Class16.Inner4 var4 : this.field_2098) {
            this.method_2723(var2, var4);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2715(PlayerEntity var1) {
      return var1 != null && var1 != c.field_1724 && var1.method_5805() && !var1.method_31481();
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) void
   private void method_2716(PlayerEntity var1) {
      if (var1 instanceof AbstractClientPlayerEntity var2) {
         if (c.method_1561().method_3953(var2) instanceof PlayerEntityRenderer var3) {
            PlayerEntityRenderState var5 = var3.method_62608();
            var3.method_62604(var2, var5, c.method_61966().method_60637(true));
            var5.field_53462 = false;
            this.field_2096.put(var1.method_5667(), new Class16.Inner5(var1.method_5667(), var1.method_7334().getName(), var3, var5, this.method_2718(var1)));
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner5) void
   private void method_2717(Class16.Inner5 var1) {
      if (var1 != null) {
         if (!this.field_2082.method_671()
            || Dev.ZWare.Client.pkg1.Class12.method_1240(var1.method_1521(), var1.method_1522()) != Dev.ZWare.Client.pkg1.Class12.Inner1.FRIEND) {
            this.field_2097.removeIf(var1x -> var1x.method_1336().equals(var1.method_1521()));
            this.field_2097
               .add(
                  new Class16.Inner3(
                     var1.method_1521(), var1.method_1522(), var1.method_1523(), var1.method_1524(), var1.method_1525(), System.currentTimeMillis()
                  )
               );
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) java.util.List
   private List<ItemStack> method_2718(PlayerEntity var1) {
      ArrayList var2 = new ArrayList();
      this.method_2719(var2, var1.method_6079());
      this.method_2719(var2, var1.method_6118(EquipmentSlot.field_6169));
      this.method_2719(var2, var1.method_6118(EquipmentSlot.field_6174));
      this.method_2719(var2, var1.method_6118(EquipmentSlot.field_6172));
      this.method_2719(var2, var1.method_6118(EquipmentSlot.field_6166));
      this.method_2719(var2, var1.method_6047());
      return List.copyOf(var2);
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.item.ItemStack) void
   private void method_2719(List<ItemStack> var1, ItemStack var2) {
      if (var2 != null && !var2.method_7960()) {
         var1.add(var2.method_7972());
      }
   }

   // $VF: renamed from: n () void
   private void method_2720() {
      UUID var1;
      while ((var1 = this.field_2100.poll()) != null) {
         this.field_2097.removeIf(var1x -> var1x.method_1336().equals(var1));
      }

      while ((var1 = this.field_2099.poll()) != null) {
         Class16.Inner5 var2 = this.field_2096.remove(var1);
         if (var2 != null) {
            this.method_2717(var2);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner3) boolean
   private boolean method_2721(Class16.Inner3 var1) {
      if (var1 != null && var1.method_1339() != null) {
         if (this.field_2082.method_671()
            && Dev.ZWare.Client.pkg1.Class12.method_1240(var1.method_1336(), var1.method_1337()) == Dev.ZWare.Client.pkg1.Class12.Inner1.FRIEND) {
            return false;
         } else {
            double var2 = c.field_1724.method_23317() - var1.method_1339().field_53325;
            double var4 = c.field_1724.method_23318() - var1.method_1339().field_53326;
            double var6 = c.field_1724.method_23321() - var1.method_1339().field_53327;
            double var8 = this.field_2085.method_671().floatValue();
            return var2 * var2 + var4 * var4 + var6 * var6 <= var8 * var8;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner3, long) Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner4
   private Class16.Inner4 method_2722(Class16.Inner3 var1, long var2) {
      Vec3d var4 = this.method_2724(
         new Vec3d(var1.method_1339().field_53325, var1.method_1339().field_53326 + var1.method_1339().field_53330 + 0.55, var1.method_1339().field_53327)
      );
      return var4 == null
         ? null
         : new Class16.Inner4(
            var1.method_1337(),
            this.method_2731(var2 - var1.method_1341()),
            this.method_2730(var1.method_1336(), var1.method_1337()),
            this.field_2092.method_671().getRGB(),
            var4.field_1352,
            var4.field_1351,
            var1.method_1340()
         );
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner4) void
   private void method_2723(DrawContext var1, Class16.Inner4 var2) {
      float var3 = this.field_2086.method_671();
      boolean var4 = this.method_2732();
      List var5 = var4 ? var2.method_1515() : List.of();
      int var6 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2.method_1509());
      int var7 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2.method_1510());
      int var8 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(" ");
      int var9 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
      int var10 = var6 + var8 + var7;
      int var11 = var5.size();
      int var12 = var11 > 0 ? var11 * 16 + (var11 - 1) * 2 : 0;
      int var13 = Math.round(-var10 / 2.0F);
      int var14 = -var9;
      int var15 = Math.round(-var12 / 2.0F);
      int var16 = var11 > 0 ? var14 - 18 : 0;
      var1.method_51448().method_22903();
      var1.method_51448().method_22904(var2.field_982, var2.field_983, 0.0);
      var1.method_51448().method_22905(var3, var3, 1.0F);
      int var17 = var13 - 3;
      int var18 = var14 - 1;
      int var19 = var13 + var10 + 3;
      int var20 = var14 + var9 + 1;
      var1.method_25294(var17, var18, var19, var20, this.field_2093.method_671().getRGB());
      if (this.field_2094.method_671()) {
         int var21 = this.field_2095.method_671().getRGB();
         var1.method_25294(var17 - 1, var18 - 1, var19 + 1, var18, var21);
         var1.method_25294(var17 - 1, var20, var19 + 1, var20 + 1, var21);
         var1.method_25294(var17 - 1, var18, var17, var20, var21);
         var1.method_25294(var19, var18, var19 + 1, var20, var21);
      }

      Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var2.method_1509(), var13, var14, var2.method_1511());
      Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var2.method_1510(), var13 + var6 + var8, var14, var2.method_1512());
      if (var11 > 0) {
         for (int var23 = 0; var23 < var11; var23++) {
            int var22 = var15 + var23 * 18;
            var1.method_51427((ItemStack)var5.get(var23), var22, var16);
            var1.method_51431(c.field_1772, (ItemStack)var5.get(var23), var22, var16);
         }
      }

      var1.method_51448().method_22909();
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_2724(Vec3d var1) {
      Vec3d var2 = c.field_1773.method_19418().method_19326();
      this.field_2103
         .set((float)(var1.field_1352 - var2.field_1352), (float)(var1.field_1351 - var2.field_1351), (float)(var1.field_1350 - var2.field_1350), 1.0F);
      this.field_2103.mul(this.field_2101);
      this.field_2103.mul(this.field_2102);
      if (this.field_2103.w <= 0.0F) {
         return null;
      } else {
         float var3 = 1.0F / this.field_2103.w;
         float var4 = this.field_2103.x * var3;
         float var5 = this.field_2103.y * var3;
         float var6 = this.field_2103.z * var3;
         double var7 = (var4 * 0.5 + 0.5) * c.method_22683().method_4489();
         double var9 = (1.0 - (var5 * 0.5 + 0.5)) * c.method_22683().method_4506();
         double var11 = var7 / c.method_22683().method_4495();
         double var13 = var9 / c.method_22683().method_4495();
         return !Double.isNaN(var11) && !Double.isNaN(var13) && !Double.isInfinite(var11) && !Double.isInfinite(var13) ? new Vec3d(var11, var13, var6) : null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, java.util.List) void
   private void method_2725(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, List<Class16.Inner3> var2) {
      Immediate var3 = c.method_22940().method_23000();
      boolean var4 = (Boolean)c.field_1690.method_42435().method_41753();
      c.method_1561().method_3948(false);
      GlStateManager._disableDepthTest();
      GlStateManager._depthMask(false);

      try {
         for (Class16.Inner3 var6 : var2) {
            this.method_2727(var1, var6, var3, true);
         }

         var3.method_22993();
      } finally {
         GlStateManager._depthMask(true);
         GlStateManager._enableDepthTest();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         c.method_1561().method_3948(var4);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner3) void
   private void method_2726(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Class16.Inner3 var2) {
      Immediate var3 = c.method_22940().method_23000();
      boolean var4 = (Boolean)c.field_1690.method_42435().method_41753();
      c.method_1561().method_3948(false);

      try {
         this.method_2727(var1, var2, var3, false);
         var3.method_22993();
      } finally {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         c.method_1561().method_3948(var4);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, Dev.ZWare.Client.features.pkg1.pkg5.Class16$Inner3, net.minecraft.client.render.VertexConsumerProvider.Immediate, boolean) void
   private void method_2727(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Class16.Inner3 var2, Immediate var3, boolean var4) {
      int var5 = this.field_2088.method_671().getAlpha();
      if (var5 > 0) {
         PlayerEntityRenderer var6 = var2.method_1338();
         PlayerEntityRenderState var7 = var2.method_1339();
         Vec3d var8 = var6.method_23206(var7);
         Vec3d var9 = c.field_1773.method_19418().method_19326();
         double var10 = var7.field_53325 + var8.field_1352 - var9.field_1352;
         double var12 = var7.field_53326 + var8.field_1351 - var9.field_1351;
         double var14 = var7.field_53327 + var8.field_1350 - var9.field_1350;
         float var16 = var5 / 255.0F;
         float var17 = var4 ? 1.0F : this.field_2088.method_671().getRed() / 255.0F;
         float var18 = var4 ? 1.0F : this.field_2088.method_671().getGreen() / 255.0F;
         float var19 = var4 ? 1.0F : this.field_2088.method_671().getBlue() / 255.0F;
         var1.method_1055().method_22903();
         var1.method_1055().method_22904(var10, var12, var14);
         RenderSystem.setShaderColor(var17, var18, var19, var16);
         this.method_2728(var6, var7, var1.method_1055(), var3, 15728880, var4 ? -1 : this.field_2088.method_671().getRGB(), this.field_2084.method_671());
         var1.method_1055().method_22909();
      }
   }

   // $VF: renamed from: a (net.minecraft.client.render.entity.PlayerEntityRenderer, net.minecraft.client.render.entity.state.PlayerEntityRenderState, net.minecraft.client.util.math.MatrixStack, net.minecraft.client.render.VertexConsumerProvider, int, int, boolean) void
   private void method_2728(
      PlayerEntityRenderer var1, PlayerEntityRenderState var2, MatrixStack var3, VertexConsumerProvider var4, int var5, int var6, boolean var7
   ) {
      if (var7) {
         var1.method_4054(var2, var3, var4, var5);
      } else {
         this.method_2729(var1, var2, var3, var4, var5, var6);
      }
   }

   // $VF: renamed from: a (net.minecraft.client.render.entity.PlayerEntityRenderer, net.minecraft.client.render.entity.state.PlayerEntityRenderState, net.minecraft.client.util.math.MatrixStack, net.minecraft.client.render.VertexConsumerProvider, int, int) void
   private void method_2729(PlayerEntityRenderer var1, PlayerEntityRenderState var2, MatrixStack var3, VertexConsumerProvider var4, int var5, int var6) {
      Class50 var7 = (Class50)var1;
      var3.method_22903();
      if (var2.method_62613(EntityPose.field_18078) && var2.field_53463 != null) {
         float var8 = var2.field_53331 - 0.1F;
         var3.method_46416(-var2.field_53463.method_10148() * var8, 0.0F, -var2.field_53463.method_10165() * var8);
      }

      var3.method_22905(var2.field_53453, var2.field_53453, var2.field_53453);
      var7.invokeSetupTransforms(var2, var3, var2.field_53446, var2.field_53453);
      var3.method_22905(-1.0F, -1.0F, 1.0F);
      var7.invokeScale(var2, var3);
      var3.method_46416(0.0F, -1.501F, 0.0F);
      ((PlayerEntityModel)var1.method_4038()).method_62110(var2);
      RenderLayer var11 = var7.invokeGetRenderLayer(var2, true, false, false);
      if (var11 != null) {
         VertexConsumer var9 = var4.getBuffer(var11);
         int var10 = LivingEntityRenderer.method_23622(var2, 0.0F);
         ((PlayerEntityModel)var1.method_4038()).method_62100(var3, var9, var5, var10, var6);
      }

      var3.method_22909();
   }

   // $VF: renamed from: a (java.util.UUID, java.lang.String) int
   private int method_2730(UUID var1, String var2) {
      return switch (Dev.ZWare.Client.pkg1.Class12.method_1240(var1, var2)) {
         case FRIEND -> this.field_2090.method_671().getRGB();
         case ENEMY -> this.field_2091.method_671().getRGB();
         default -> this.field_2089.method_671().getRGB();
      };
   }

   // $VF: renamed from: a (long) java.lang.String
   private String method_2731(long var1) {
      long var3 = Math.max(0L, var1 / 1000L);
      long var5 = var3 / 3600L;
      long var7 = var3 % 3600L / 60L;
      long var9 = var3 % 60L;
      return var5 > 0L ? String.format("%d:%02d:%02d", var5, var7, var9) : String.format("%d:%02d", var7, var9);
   }

   // $VF: renamed from: a () boolean
   private boolean method_2732() {
      long var1 = c.method_22683().method_4490();
      return GLFW.glfwGetKey(var1, 340) == 1 || GLFW.glfwGetKey(var1, 344) == 1;
   }

   // $VF: renamed from: o () void
   private void method_2733() {
      this.field_2096.clear();
      this.field_2097.clear();
      this.field_2098.clear();
      this.field_2099.clear();
      this.field_2100.clear();
   }

   public record Inner1(UUID ct, String cu, Vec3d cv, double cw, long cx) {
      // $VF: renamed from: ct java.util.UUID
      private final UUID field_1009;
      // $VF: renamed from: cu java.lang.String
      private final String field_1010;
      // $VF: renamed from: cv net.minecraft.util.math.Vec3d
      private final Vec3d field_1011;
      // $VF: renamed from: cw double
      private final double field_1012;
      // $VF: renamed from: cx long
      private final long field_1013;

      public Inner1(UUID ct, String cu, Vec3d cv, double cw, long cx) {
         this.field_1009 = ct;
         this.field_1010 = cu;
         this.field_1011 = cv;
         this.field_1012 = cw;
         this.field_1013 = cx;
      }

      // $VF: renamed from: ct () java.util.UUID
      public UUID method_1544() {
         return this.field_1009;
      }

      // $VF: renamed from: cu () java.lang.String
      public String method_1545() {
         return this.field_1010;
      }

      // $VF: renamed from: cv () net.minecraft.util.math.Vec3d
      public Vec3d method_1546() {
         return this.field_1011;
      }

      // $VF: renamed from: cw () double
      public double method_1547() {
         return this.field_1012;
      }

      // $VF: renamed from: cx () long
      public long method_1548() {
         return this.field_1013;
      }
   }

   private record Inner3(UUID cg, String ch, PlayerEntityRenderer ci, PlayerEntityRenderState cj, List<ItemStack> ck, long cl) {
      // $VF: renamed from: cg java.util.UUID
      private final UUID field_819;
      // $VF: renamed from: ch java.lang.String
      private final String field_820;
      // $VF: renamed from: ci net.minecraft.client.render.entity.PlayerEntityRenderer
      private final PlayerEntityRenderer field_821;
      // $VF: renamed from: cj net.minecraft.client.render.entity.state.PlayerEntityRenderState
      private final PlayerEntityRenderState field_822;
      // $VF: renamed from: ck java.util.List
      private final List<ItemStack> field_823;
      // $VF: renamed from: cl long
      private final long field_824;

      private Inner3(UUID cg, String ch, PlayerEntityRenderer ci, PlayerEntityRenderState cj, List<ItemStack> ck, long cl) {
         this.field_819 = cg;
         this.field_820 = ch;
         this.field_821 = ci;
         this.field_822 = cj;
         this.field_823 = ck;
         this.field_824 = cl;
      }

      // $VF: renamed from: cg () java.util.UUID
      public UUID method_1336() {
         return this.field_819;
      }

      // $VF: renamed from: ch () java.lang.String
      public String method_1337() {
         return this.field_820;
      }

      // $VF: renamed from: ci () net.minecraft.client.render.entity.PlayerEntityRenderer
      public PlayerEntityRenderer method_1338() {
         return this.field_821;
      }

      // $VF: renamed from: cj () net.minecraft.client.render.entity.state.PlayerEntityRenderState
      public PlayerEntityRenderState method_1339() {
         return this.field_822;
      }

      // $VF: renamed from: ck () java.util.List
      public List<ItemStack> method_1340() {
         return this.field_823;
      }

      // $VF: renamed from: cl () long
      public long method_1341() {
         return this.field_824;
      }
   }

   private record Inner4(String cm, String cn, int co, int cp, double cq, double cr, List<ItemStack> cs) {
      // $VF: renamed from: cm java.lang.String
      private final String field_978;
      // $VF: renamed from: cn java.lang.String
      private final String field_979;
      // $VF: renamed from: co int
      private final int field_980;
      // $VF: renamed from: cp int
      private final int field_981;
      // $VF: renamed from: cq double
      private final double field_982;
      // $VF: renamed from: cr double
      private final double field_983;
      // $VF: renamed from: cs java.util.List
      private final List<ItemStack> field_984;

      private Inner4(String cm, String cn, int co, int cp, double cq, double cr, List<ItemStack> cs) {
         this.field_978 = cm;
         this.field_979 = cn;
         this.field_980 = co;
         this.field_981 = cp;
         this.field_982 = cq;
         this.field_983 = cr;
         this.field_984 = cs;
      }

      // $VF: renamed from: cm () java.lang.String
      public String method_1509() {
         return this.field_978;
      }

      // $VF: renamed from: cn () java.lang.String
      public String method_1510() {
         return this.field_979;
      }

      // $VF: renamed from: co () int
      public int method_1511() {
         return this.field_980;
      }

      // $VF: renamed from: cp () int
      public int method_1512() {
         return this.field_981;
      }

      // $VF: renamed from: cq () double
      public double method_1513() {
         return this.field_982;
      }

      // $VF: renamed from: cr () double
      public double method_1514() {
         return this.field_983;
      }

      // $VF: renamed from: cs () java.util.List
      public List<ItemStack> method_1515() {
         return this.field_984;
      }
   }

   private record Inner5(UUID cb, String cc, PlayerEntityRenderer cd, PlayerEntityRenderState ce, List<ItemStack> cf) {
      // $VF: renamed from: cb java.util.UUID
      private final UUID field_990;
      // $VF: renamed from: cc java.lang.String
      private final String field_991;
      // $VF: renamed from: cd net.minecraft.client.render.entity.PlayerEntityRenderer
      private final PlayerEntityRenderer field_992;
      // $VF: renamed from: ce net.minecraft.client.render.entity.state.PlayerEntityRenderState
      private final PlayerEntityRenderState field_993;
      // $VF: renamed from: cf java.util.List
      private final List<ItemStack> field_994;

      private Inner5(UUID cb, String cc, PlayerEntityRenderer cd, PlayerEntityRenderState ce, List<ItemStack> cf) {
         this.field_990 = cb;
         this.field_991 = cc;
         this.field_992 = cd;
         this.field_993 = ce;
         this.field_994 = cf;
      }

      // $VF: renamed from: cb () java.util.UUID
      public UUID method_1521() {
         return this.field_990;
      }

      // $VF: renamed from: cc () java.lang.String
      public String method_1522() {
         return this.field_991;
      }

      // $VF: renamed from: cd () net.minecraft.client.render.entity.PlayerEntityRenderer
      public PlayerEntityRenderer method_1523() {
         return this.field_992;
      }

      // $VF: renamed from: ce () net.minecraft.client.render.entity.state.PlayerEntityRenderState
      public PlayerEntityRenderState method_1524() {
         return this.field_993;
      }

      // $VF: renamed from: cf () java.util.List
      public List<ItemStack> method_1525() {
         return this.field_994;
      }
   }
}
