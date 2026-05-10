package Dev.ZWare.Client.features.pkg1.pkg5;

import Dev.ZWare.Client.mixin.Class50;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class18 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg5.Class18
   private static Class18 field_1947;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class18.Inner1> field_1948 = this.a("Mode", Class18.Inner1.Normal);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1949 = this.a("Self", false);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1950 = this.a("Ignore Friends", false);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1951 = this.a("Fade Time", 800, 100, 5000);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1952 = this.a("Y Speed", 0.6F, -2.0F, 4.0F);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1953 = this.a("Scale", 1.0F, 0.1F, 3.0F);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1954 = this.a("Scale Modifier", -0.25F, -4.0F, 4.0F);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1955 = this.a("Line Width", 1.5F, 0.0F, 5.0F);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1956 = this.a("Glow", true);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1957 = this.a("Glow Fill Alpha", 0.12F, 0.0F, 1.0F);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1958 = this.a("Glow Thickness", 3, 0, 10);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1959 = this.a("Inner Glow", false);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1960 = this.a("Inner Glow Thickness", 2, 1, 16);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1961 = this.a("Glow Sample Step", 1, 1, 16);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1962 = this.a("Glow Intensity", 1.55F, 0.0F, 3.0F);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1963 = this.a("Glow Outline Width", 2.4F, 0.5F, 6.0F);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1964 = this.a("Through Walls", true);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1965 = this.a("Fade Out", true);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1966 = this.a("Max Pops", 8, 1, 32);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1967 = this.a("Color", 255, 255, 255, 160);
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.pkg1.pkg2.Class3.Inner5> field_1968 = this.a(
      "ShapeMode", Dev.ZWare.Client.pkg1.pkg2.Class3.Inner5.Both
   );
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1969 = this.a("Side Color", 255, 255, 255, 25);
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1970 = this.a("Line Color", 255, 255, 255, 60);
   // $VF: renamed from: M java.util.List
   private final List<Class18.Inner2> field_1971 = new ArrayList<>();

   public Class18() {
      super("Pop Chams", "use your brain", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      field_1947 = this;
      this.field_1948.method_709(var0 -> false);
      this.field_1953.method_709(var0 -> true);
      this.field_1954.method_709(var0 -> true);
      this.field_1967.method_709(var1 -> this.field_1956.method_671());
      this.field_1957.method_709(var1 -> this.field_1956.method_671());
      this.field_1958.method_709(var1 -> this.field_1956.method_671());
      this.field_1959.method_709(var1 -> this.field_1956.method_671());
      this.field_1960.method_709(var1 -> this.field_1956.method_671() && this.field_1959.method_671());
      this.field_1961.method_709(var1 -> this.field_1956.method_671());
      this.field_1962.method_709(var1 -> this.field_1956.method_671());
      this.field_1963.method_709(var1 -> this.field_1956.method_671());
      this.field_1965.method_709(var0 -> true);
      this.field_1968.method_709(var0 -> false);
      this.field_1969.method_709(var0 -> false);
      this.field_1970.method_709(var0 -> true);
      this.field_1955.method_709(var0 -> true);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class18
   public static Class18 method_2581() {
      return field_1947;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_2584();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_2584();
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_1971.isEmpty() ? null : Integer.toString(this.field_1971.size());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (g()) {
         this.method_2584();
      } else {
         long var2 = System.currentTimeMillis();
         this.method_2583(var2);
         if (!this.field_1971.isEmpty()) {
            if (this.field_1956.method_671()) {
               this.method_2586(event, var2);
            }

            for (Class18.Inner2 var5 : this.field_1971) {
               this.method_2589(event, var5, var2);
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_2582(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (!g()) {
         if (var1.method_1045() instanceof EntityStatusS2CPacket var2 && var2.method_11470() == 35) {
            if (var2.method_11469(c.field_1687) instanceof PlayerEntity var4) {
               if (var4 != c.field_1724 || this.field_1949.method_671()) {
                  if (!this.field_1950.method_671() || Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var4)) {
                     this.method_2585(var4);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2583(long var1) {
      Iterator var3 = this.field_1971.iterator();

      while (var3.hasNext()) {
         Class18.Inner2 var4 = (Class18.Inner2)var3.next();
         if (var4.method_484(var1, this.field_1951.method_671()) >= 1.0F) {
            var3.remove();
         }
      }
   }

   // $VF: renamed from: n () void
   private void method_2584() {
      this.field_1971.clear();
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) void
   public void method_2585(PlayerEntity player) {
      if (player instanceof AbstractClientPlayerEntity var2 && c != null && c.field_1687 != null) {
         if (c.method_1561().method_3953(var2) instanceof PlayerEntityRenderer var3) {
            PlayerEntityRenderState var5 = var3.method_62608();
            var3.method_62604(var2, var5, c.method_61966().method_60637(true));
            var5.field_53462 = false;
            this.field_1971.add(new Class18.Inner2(player.method_5667(), var2, var3, var5, System.currentTimeMillis(), this.field_1953.method_671()));

            while (this.field_1971.size() > this.field_1966.method_671()) {
               this.field_1971.remove(0);
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, long) boolean
   private boolean method_2586(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, long var2) {
      if (Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_793(this.method_2591())) {
         Immediate var4 = c.method_22940().method_23000();
         boolean var5 = (Boolean)c.field_1690.method_42435().method_41753();
         boolean var6 = this.field_1964.method_671();
         c.method_1561().method_3948(false);
         if (var6) {
            GlStateManager._disableDepthTest();
            GlStateManager._depthMask(false);
         }

         try {
            for (Class18.Inner2 var8 : this.field_1971) {
               this.method_2588(var1, var8, var2, var4, true);
            }

            var4.method_22993();
         } finally {
            if (var6) {
               GlStateManager._depthMask(true);
               GlStateManager._enableDepthTest();
            }

            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            c.method_1561().method_3948(var5);
            Dev.ZWare.Client.Class1.field_306.method_796();
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, Dev.ZWare.Client.features.pkg1.pkg5.Class18$Inner2, long) void
   private void method_2587(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Class18.Inner2 var2, long var3) {
      Immediate var5 = c.method_22940().method_23000();
      boolean var6 = (Boolean)c.field_1690.method_42435().method_41753();
      c.method_1561().method_3948(false);

      try {
         this.method_2588(var1, var2, var3, var5, false);
         var5.method_22993();
      } finally {
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         c.method_1561().method_3948(var6);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, Dev.ZWare.Client.features.pkg1.pkg5.Class18$Inner2, long, net.minecraft.client.render.VertexConsumerProvider.Immediate, boolean) void
   private void method_2588(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Class18.Inner2 var2, long var3, Immediate var5, boolean var6) {
      float var7 = var2.method_484(var3, this.field_1951.method_671());
      if (!(var7 >= 1.0F)) {
         float var8 = this.field_1965.method_671() ? 1.0F - var7 : 1.0F;
         int var9 = Math.max(0, Math.round(this.field_1967.method_671().getAlpha() * var8));
         if (var9 > 0) {
            PlayerEntityRenderer var10 = var2.method_479();
            PlayerEntityRenderState var11 = var2.method_480();
            Vec3d var12 = var10.method_23206(var11);
            Vec3d var13 = c.field_1773.method_19418().method_19326();
            double var14 = var11.field_53325 + var12.field_1352 - var13.field_1352;
            double var16 = var11.field_53326 + var12.field_1351 - var13.field_1351 + this.field_1952.method_671() * var7;
            double var18 = var11.field_53327 + var12.field_1350 - var13.field_1350;
            float var20 = Math.max(0.05F, this.field_1953.method_671() + this.field_1954.method_671() * var2.method_485(var3));
            float var21 = var9 / 255.0F;
            float var22 = var6 ? 1.0F : this.field_1967.method_671().getRed() / 255.0F;
            float var23 = var6 ? 1.0F : this.field_1967.method_671().getGreen() / 255.0F;
            float var24 = var6 ? 1.0F : this.field_1967.method_671().getBlue() / 255.0F;
            var1.method_1055().method_22903();
            var1.method_1055().method_22904(var14, var16, var18);
            if (Math.abs(var20 - 1.0F) > 0.001F) {
               double var25 = var11.field_53330 * 0.5;
               var1.method_1055().method_22904(0.0, var25, 0.0);
               var1.method_1055().method_22905(var20, var20, var20);
               var1.method_1055().method_22904(0.0, -var25, 0.0);
            }

            RenderSystem.setShaderColor(var22, var23, var24, var21);
            this.method_2590(var10, var11, var1.method_1055(), var5, 15728880, var6 ? -1 : this.field_1967.method_671().getRGB());
            var1.method_1055().method_22909();
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14, Dev.ZWare.Client.features.pkg1.pkg5.Class18$Inner2, long) void
   private void method_2589(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Class18.Inner2 var2, long var3) {
      float var5 = var2.method_484(var3, this.field_1951.method_671());
      if (!(var5 >= 1.0F)) {
         var2.method_476(var1.method_1056());
         var2.method_477(this.field_1952.method_671(), this.field_1954.method_671());
         if (!var2.method_481().isEmpty()) {
            float var6 = this.field_1965.method_671() ? 1.0F - var5 : 1.0F;
            Color var7 = this.method_2592(this.field_1970.method_671(), var6);
            if (var7.getAlpha() > 0 && !(this.field_1955.method_671() <= 0.0F)) {
               Vec3d var8 = c.field_1773.method_19418().method_19326();
               Vec3d var9 = var2.method_482();
               double var10 = var9.field_1352 - var8.field_1352;
               double var12 = var9.field_1351 - var8.field_1351;
               double var14 = var9.field_1350 - var8.field_1350;
               var1.method_1055().method_22903();
               Dev.ZWare.Client.pkg1.pkg2.Class3.method_283(
                  var1.method_1055(),
                  new Vec3d(var10, var12, var14),
                  var2.method_481(),
                  var2.method_483(),
                  new Color(0, 0, 0, 0),
                  var7,
                  Dev.ZWare.Client.pkg1.pkg2.Class3.Inner5.Lines,
                  this.field_1955.method_671(),
                  this.field_1964.method_671()
               );
               var1.method_1055().method_22909();
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.render.entity.PlayerEntityRenderer, net.minecraft.client.render.entity.state.PlayerEntityRenderState, net.minecraft.client.util.math.MatrixStack, net.minecraft.client.render.VertexConsumerProvider, int, int) void
   private void method_2590(PlayerEntityRenderer var1, PlayerEntityRenderState var2, MatrixStack var3, VertexConsumerProvider var4, int var5, int var6) {
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

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5
   private Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5 method_2591() {
      Color var1 = this.field_1967.method_671();
      Color var2 = new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), 255);
      return new Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5(
         Class7.Inner2.Default,
         var2,
         var2,
         false,
         var2,
         var2,
         Class7.Inner1.Vertical,
         this.field_1957.method_671(),
         this.field_1958.method_671(),
         this.field_1959.method_671(),
         this.field_1960.method_671(),
         this.field_1961.method_671(),
         this.field_1962.method_671(),
         "minecraft:textures/misc/enchanted_glint_item.png",
         0.1F,
         8.0F,
         1.0F,
         0.5F,
         0.5F,
         1.0F,
         0.05F,
         false,
         this.field_1963.method_671(),
         false
      );
   }

   // $VF: renamed from: a (java.awt.Color, float) java.awt.Color
   private Color method_2592(Color var1, float var2) {
      int var3 = Math.max(0, Math.round(var1.getAlpha() * MathHelper.method_15363(var2, 0.0F, 1.0F)));
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var3);
   }

   private static enum Inner1 {
      Normal,
      WireFrame;
   }

   private static final class Inner2 {
      // $VF: renamed from: a java.util.UUID
      private final UUID field_243;
      // $VF: renamed from: b net.minecraft.client.network.AbstractClientPlayerEntity
      private final AbstractClientPlayerEntity field_244;
      // $VF: renamed from: c net.minecraft.client.render.entity.PlayerEntityRenderer
      private final PlayerEntityRenderer field_245;
      // $VF: renamed from: d net.minecraft.client.render.entity.state.PlayerEntityRenderState
      private final PlayerEntityRenderState field_246;
      // $VF: renamed from: e long
      private final long field_247;
      // $VF: renamed from: f java.util.List
      private List<Dev.ZWare.Client.pkg1.pkg2.Class3.Inner4> field_248;
      // $VF: renamed from: g net.minecraft.util.math.Vec3d
      private Vec3d field_249;
      // $VF: renamed from: h double
      private double field_250;
      // $VF: renamed from: i long
      private long field_251;

      private Inner2(UUID var1, AbstractClientPlayerEntity var2, PlayerEntityRenderer var3, PlayerEntityRenderState var4, long var5, float var7) {
         this.field_243 = var1;
         this.field_244 = var2;
         this.field_245 = var3;
         this.field_246 = var4;
         this.field_247 = var5;
         this.field_250 = var7;
         Vec3d var8 = var3.method_23206(var4);
         this.field_249 = new Vec3d(var4.field_53325 + var8.field_1352, var4.field_53326 + var8.field_1351, var4.field_53327 + var8.field_1350);
      }

      // $VF: renamed from: a (float) void
      private void method_476(float var1) {
         if (this.field_248 == null) {
            Dev.ZWare.Client.pkg1.pkg2.Class3.Inner2 var2 = Dev.ZWare.Client.pkg1.pkg2.Class3.method_280(this.field_244, var1);
            this.field_248 = var2.method_1352();
            if (var2.method_1353() != null) {
               this.field_249 = var2.method_1353();
            }
         }
      }

      // $VF: renamed from: a (float, float) void
      private void method_477(float var1, float var2) {
         long var3 = System.nanoTime();
         if (this.field_251 == 0L) {
            this.field_251 = var3;
         } else {
            double var5 = Math.min((var3 - this.field_251) / 1.0E9, 0.25);
            this.field_251 = var3;
            this.field_249 = this.field_249.method_1031(0.0, var1 * var5, 0.0);
            this.field_250 += var2 * var5;
         }
      }

      // $VF: renamed from: a () java.util.UUID
      private UUID method_478() {
         return this.field_243;
      }

      // $VF: renamed from: a () net.minecraft.client.render.entity.PlayerEntityRenderer
      private PlayerEntityRenderer method_479() {
         return this.field_245;
      }

      // $VF: renamed from: a () net.minecraft.client.render.entity.state.PlayerEntityRenderState
      private PlayerEntityRenderState method_480() {
         return this.field_246;
      }

      // $VF: renamed from: a () java.util.List
      private List<Dev.ZWare.Client.pkg1.pkg2.Class3.Inner4> method_481() {
         return this.field_248 == null ? List.of() : this.field_248;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      private Vec3d method_482() {
         return this.field_249;
      }

      // $VF: renamed from: a () double
      private double method_483() {
         return this.field_250;
      }

      // $VF: renamed from: a (long, int) float
      private float method_484(long var1, int var3) {
         return var3 <= 0 ? 1.0F : MathHelper.method_15363((float)(var1 - this.field_247) / var3, 0.0F, 1.0F);
      }

      // $VF: renamed from: a (long) float
      private float method_485(long var1) {
         return Math.max(0.0F, (float)(var1 - this.field_247) / 1000.0F);
      }
   }
}
