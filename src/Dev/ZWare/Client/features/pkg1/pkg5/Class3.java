package Dev.ZWare.Client.features.pkg1.pkg5;

import com.mojang.blaze3d.systems.RenderSystem;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.Sprite;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class Class3 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg5.Class3
   private static Class3 field_1689;
   // $VF: renamed from: p net.minecraft.util.Identifier
   private static final Identifier field_1690 = Identifier.method_60655("oyvey", "textures/gui/logo.png");
   // $VF: renamed from: q int
   private static final int field_1691 = 3;
   // $VF: renamed from: r double
   private static final double field_1692 = 4.25;
   // $VF: renamed from: s double
   private static final double field_1693 = 0.165;
   // $VF: renamed from: t int
   private static final int field_1694 = 4;
   // $VF: renamed from: u int
   private static final int field_1695 = 400;
   // $VF: renamed from: v int
   private static final int field_1696 = 2;
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1697 = this.a("Scale", 1.0F, 0.5F, 3.0F);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1698 = this.a("Range", 64.0F, 5.0F, 256.0F);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1699 = this.a("Dropped Items", true);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1700 = this.a("Dropped Item Color", 255, 255, 180, 255);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1701 = this.a("Ignore Self", true);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1702 = this.a("Totem Pops", true);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class3.Inner1> field_1703 = this.a("Totem Pop Mode", Class3.Inner1.Brackets);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1704 = this.a("Held Items", true);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1705 = this.a("Item Display Scale", 1.0F, 0.5F, 3.0F);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1706 = this.a("Armor", true);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1707 = this.a("Armor Display Scale", 1.0F, 0.5F, 3.0F);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1708 = this.a("Effect Icons", true);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1709 = this.a("Effect Icon Scale", 1.0F, 0.5F, 3.0F);
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1710 = this.a("Fade Inferred Effect Icons", true);
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1711 = this.a("Client Logo", true);
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1712 = this.a("Default Color", 255, 255, 255, 255);
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1713 = this.a("Friend Color", 85, 200, 255, 255);
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1714 = this.a("Enemy Color", 255, 90, 90, 255);
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1715 = this.a("Totem Pop Color", 225, 120, 20, 255);
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1716 = this.a("Background Color", 0, 0, 0, 120);
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1717 = this.a("Border", true);
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1718 = this.a("Border Color", 18, 18, 18, 210);
   // $VF: renamed from: S java.util.List
   private final List<Class3.Inner7> field_1719 = new ArrayList<>();
   // $VF: renamed from: T org.joml.Matrix4f
   private final Matrix4f field_1720 = new Matrix4f();
   // $VF: renamed from: U org.joml.Matrix4f
   private final Matrix4f field_1721 = new Matrix4f();
   // $VF: renamed from: V org.joml.Vector4f
   private final Vector4f field_1722 = new Vector4f();
   // $VF: renamed from: W boolean
   private boolean field_1723;
   // $VF: renamed from: X int
   private int field_1724 = 96;
   // $VF: renamed from: Y int
   private int field_1725 = 32;
   // $VF: renamed from: Z java.util.Map
   private final Map<UUID, Class3.Inner2> field_1726 = new HashMap<>();
   // $VF: renamed from: aa java.util.Map
   private final Map<Integer, Class3.Inner4> field_1727 = new HashMap<>();

   public Class3() {
      super("Nametags", "Isnt it obvious", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, true, false, false);
      field_1689 = this;
      this.field_1705.method_709(var1 -> this.field_1704.method_671());
      this.field_1707.method_709(var1 -> this.field_1706.method_671());
      this.field_1709.method_709(var1 -> this.field_1708.method_671());
      this.field_1710.method_709(var1 -> this.field_1708.method_671());
      this.field_1703.method_709(var1 -> this.field_1702.method_671());
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class3
   public static Class3 method_2315() {
      return field_1689;
   }

   // $VF: renamed from: a () int
   public int method_2316() {
      return this.field_1713.method_671().getRGB();
   }

   // $VF: renamed from: b () int
   public int method_2317() {
      return this.field_1714.method_671().getRGB();
   }

   // $VF: renamed from: c () int
   public int method_2318() {
      return this.field_1712.method_671().getRGB();
   }

   // $VF: renamed from: d () int
   public int method_2319() {
      return this.field_1715.method_671().getRGB();
   }

   // $VF: renamed from: a (int) java.lang.String
   public String method_2320(int pops) {
      if (pops <= 0) {
         return null;
      } else {
         return switch ((Class3.Inner1)this.field_1703.method_671()) {
            case Brackets -> " [" + pops + "]";
            case Minus -> " -" + pops;
         };
      }
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1726.clear();
      this.field_1727.clear();
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1726.clear();
      this.field_1727.clear();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   public void method_2321(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 event) {
      if (g()) {
         this.field_1726.clear();
         this.field_1727.clear();
      } else if (!this.field_1708.method_671()) {
         this.field_1726.clear();
         this.field_1727.clear();
      } else {
         this.method_2338();
         this.method_2339();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   public void method_2322(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 event) {
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @iFT13zrx_wTXP
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (!g()) {
         this.field_1719.clear();
         this.field_1720.set(event.method_1055().method_23760().method_23761());
         this.field_1721.set(RenderSystem.getProjectionMatrix());

         for (PlayerEntity var3 : c.field_1687.method_18456()) {
            if (this.method_2323(var3)) {
               Class3.Inner7 var4 = this.method_2325(var3, event.method_1056());
               if (var4 != null) {
                  this.field_1719.add(var4);
               }
            }
         }

         if (this.field_1699.method_671()) {
            for (ItemEntity var6 : c.field_1687
               .method_8390(
                  ItemEntity.class,
                  c.field_1724.method_5829().method_1014(this.field_1698.method_671().floatValue()),
                  var0 -> !var0.method_31481() && !var0.method_6983().method_7960()
               )) {
               if (this.method_2324(var6)) {
                  Class3.Inner7 var7 = this.method_2326(var6, event.method_1056());
                  if (var7 != null) {
                     this.field_1719.add(var7);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @iFT13zrx_wTXP
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (!g() && !this.field_1719.isEmpty()) {
         this.method_2337();
         DrawContext var2 = event.method_1053();

         for (Class3.Inner7 var4 : this.field_1719) {
            this.method_2327(var2, var4);
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2323(PlayerEntity var1) {
      if (var1 == null) {
         return false;
      } else {
         boolean var2 = Dev.ZWare.Client.Class1.field_318.method_237(var1) > 0;
         if (var2 || var1.method_5805() && !var1.method_31481()) {
            if (var1 == c.field_1724 && c.field_1690.method_31044().method_31034()) {
               return false;
            } else if (this.field_1701.method_671() && var1 == c.field_1724) {
               return false;
            } else {
               double var3 = c.field_1724.method_23317() - var1.method_23317();
               double var5 = c.field_1724.method_23321() - var1.method_23321();
               double var7 = var3 * var3 + var5 * var5;
               double var9 = this.field_1698.method_671().floatValue();
               return var7 <= var9 * var9;
            }
         } else {
            return false;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.ItemEntity) boolean
   private boolean method_2324(ItemEntity var1) {
      if (var1 != null && !var1.method_31481() && !var1.method_6983().method_7960()) {
         double var2 = c.field_1724.method_23317() - var1.method_23317();
         double var4 = c.field_1724.method_23321() - var1.method_23321();
         double var6 = var2 * var2 + var4 * var4;
         double var8 = this.field_1698.method_671().floatValue();
         return var6 <= var8 * var8;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, float) Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner7
   private Class3.Inner7 method_2325(PlayerEntity var1, float var2) {
      Vec3d var3 = new Vec3d(
         MathHelper.method_16436(var2, var1.field_6014, var1.method_23317()),
         MathHelper.method_16436(var2, var1.field_6036, var1.method_23318()) + var1.method_17682() + 0.55,
         MathHelper.method_16436(var2, var1.field_5969, var1.method_23321())
      );
      Vec3d var4 = this.method_2328(var3);
      if (var4 == null) {
         return null;
      } else {
         ArrayList var5 = new ArrayList();
         ItemStack var6 = var1.method_6079();
         ItemStack var7 = var1.method_6047();
         if (this.field_1704.method_671()) {
            this.method_2329(var5, var6, this.field_1705.method_671());
         }

         if (this.field_1706.method_671()) {
            this.method_2329(var5, var1.method_6118(EquipmentSlot.field_6169), this.field_1707.method_671());
            this.method_2329(var5, var1.method_6118(EquipmentSlot.field_6174), this.field_1707.method_671());
            this.method_2329(var5, var1.method_6118(EquipmentSlot.field_6172), this.field_1707.method_671());
            this.method_2329(var5, var1.method_6118(EquipmentSlot.field_6166), this.field_1707.method_671());
         }

         if (this.field_1704.method_671()) {
            this.method_2329(var5, var7, this.field_1705.method_671());
         }

         List var8 = this.method_2334(var1);
         String var9 = null;
         if (this.field_1702.method_671()) {
            int var10 = Dev.ZWare.Client.Class1.field_318.method_237(var1);
            if (var10 > 0) {
               var9 = this.method_2320(var10);
            }
         }
         int var12 = switch (Dev.ZWare.Client.pkg1.Class12.method_1239(var1)) {
            case FRIEND -> this.field_1713.method_671().getRGB();
            case ENEMY -> this.field_1714.method_671().getRGB();
            default -> this.field_1712.method_671().getRGB();
         };
         boolean var11 = this.field_1711.method_671()
            && Dev.ZWare.Client.Class1.field_313 != null
            && Dev.ZWare.Client.Class1.field_313.method_93(var1)
            && this.method_2336();
         return new Class3.Inner7(
            var1.method_7334().getName(), var9, var12, this.field_1715.method_671().getRGB(), var4.field_1352, var4.field_1351, var5, var8, var11
         );
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.ItemEntity, float) Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner7
   private Class3.Inner7 method_2326(ItemEntity var1, float var2) {
      ItemStack var3 = var1.method_6983();
      if (var3.method_7960()) {
         return null;
      } else {
         Vec3d var4 = new Vec3d(
            MathHelper.method_16436(var2, var1.field_6014, var1.method_23317()),
            MathHelper.method_16436(var2, var1.field_6036, var1.method_23318()) + var1.method_17682() + 0.35,
            MathHelper.method_16436(var2, var1.field_5969, var1.method_23321())
         );
         Vec3d var5 = this.method_2328(var4);
         if (var5 == null) {
            return null;
         } else {
            String var6 = var3.method_7964().getString();
            String var7 = var3.method_7947() > 1 ? " x" + var3.method_7947() : null;
            return new Class3.Inner7(
               var6,
               var7,
               this.field_1700.method_671().getRGB(),
               this.field_1700.method_671().getRGB(),
               var5.field_1352,
               var5.field_1351,
               List.of(),
               List.of(),
               false
            );
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner7) void
   private void method_2327(DrawContext var1, Class3.Inner7 var2) {
      float var3 = this.field_1697.method_671();
      int var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2.field_1000);
      int var5 = var2.field_1001 != null ? Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var2.field_1001) : 0;
      int var6 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_134();
      int var7 = var2.field_1008 ? Math.max(6, var6 - 1) : 0;
      int var8 = var2.field_1008 ? Math.max(1, Math.round((float)this.field_1724 / this.field_1725 * var7)) : 0;
      int var9 = var2.field_1008 ? 3 : 0;
      int var10 = var4 + var5 + var8 + var9;
      int var11 = var2.field_1006.size();
      int var12 = this.method_2330(var2.field_1006);
      int var13 = this.method_2331(var2.field_1006);
      int var14 = var2.field_1007.size();
      int var15 = Math.max(8, Math.round(16.0F * this.field_1709.method_671()));
      int var16 = var14 > 0 ? var14 * var15 + (var14 - 1) * 2 : 0;
      int var17 = Math.round(-var10 / 2.0F);
      int var18 = var17 + var8 + var9;
      int var19 = Math.round(-var12 / 2.0F);
      int var20 = -var6;
      int var21 = var11 > 0 ? var20 - var13 - 2 : 0;
      int var22 = Math.round(-var16 / 2.0F);
      int var23 = var14 > 0 ? (var11 > 0 ? var21 : var20) - var15 - 2 : 0;
      var1.method_51448().method_22903();
      var1.method_51448().method_22904(var2.field_1004, var2.field_1005, 0.0);
      var1.method_51448().method_22905(var3, var3, 1.0F);
      int var24 = var17 - 3;
      int var25 = var20 - 1;
      int var26 = var17 + var10 + 3;
      int var27 = var20 + var6 + 1;
      var1.method_25294(var24, var25, var26, var27, this.field_1716.method_671().getRGB());
      if (this.field_1717.method_671()) {
         int var28 = this.field_1718.method_671().getRGB();
         var1.method_25294(var24 - 1, var25 - 1, var26 + 1, var25, var28);
         var1.method_25294(var24 - 1, var27, var26 + 1, var27 + 1, var28);
         var1.method_25294(var24 - 1, var25, var24, var27, var28);
         var1.method_25294(var26, var25, var26 + 1, var27, var28);
      }

      if (var2.field_1008) {
         int var32 = var20 + Math.round((var6 - var7) / 2.0F);
         var1.method_25302(
            RenderLayer::method_62277, field_1690, var17, var32, 0.0F, 0.0F, var8, var7, this.field_1724, this.field_1725, this.field_1724, this.field_1725
         );
      }

      Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var2.field_1000, var18, var20, var2.field_1002);
      if (var2.field_1001 != null) {
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1, var2.field_1001, var18 + var4, var20, var2.field_1003);
      }

      if (var14 > 0) {
         for (int var33 = 0; var33 < var14; var33++) {
            Class3.Inner3 var29 = var2.field_1007.get(var33);
            int var30 = var22 + var33 * (var15 + 2);
            this.method_2335(var1, var29, var30, var23, var15);
         }
      }

      if (var11 > 0) {
         int var34 = var19;

         for (int var35 = 0; var35 < var11; var35++) {
            Class3.Inner5 var36 = var2.field_1006.get(var35);
            int var31 = this.method_2332(var36);
            this.method_2333(var1, var36, var34, var21);
            var34 += var31 + 2;
         }
      }

      var1.method_51448().method_22909();
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_2328(Vec3d var1) {
      Vec3d var2 = c.field_1773.method_19418().method_19326();
      this.field_1722
         .set((float)(var1.field_1352 - var2.field_1352), (float)(var1.field_1351 - var2.field_1351), (float)(var1.field_1350 - var2.field_1350), 1.0F);
      this.field_1722.mul(this.field_1720);
      this.field_1722.mul(this.field_1721);
      if (this.field_1722.w <= 0.0F) {
         return null;
      } else {
         float var3 = 1.0F / this.field_1722.w;
         float var4 = this.field_1722.x * var3;
         float var5 = this.field_1722.y * var3;
         float var6 = this.field_1722.z * var3;
         double var7 = (var4 * 0.5 + 0.5) * c.method_22683().method_4489();
         double var9 = (1.0 - (var5 * 0.5 + 0.5)) * c.method_22683().method_4506();
         double var11 = var7 / c.method_22683().method_4495();
         double var13 = var9 / c.method_22683().method_4495();
         return !Double.isNaN(var11) && !Double.isNaN(var13) && !Double.isInfinite(var11) && !Double.isInfinite(var13) ? new Vec3d(var11, var13, var6) : null;
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.item.ItemStack, float) void
   private void method_2329(List<Class3.Inner5> var1, ItemStack var2, float var3) {
      if (var2 != null && !var2.method_7960()) {
         var1.add(new Class3.Inner5(var2.method_7972(), var3));
      }
   }

   // $VF: renamed from: a (java.util.List) int
   private int method_2330(List<Class3.Inner5> var1) {
      if (var1.isEmpty()) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < var1.size(); var3++) {
            var2 += this.method_2332((Class3.Inner5)var1.get(var3));
            if (var3 < var1.size() - 1) {
               var2 += 2;
            }
         }

         return var2;
      }
   }

   // $VF: renamed from: b (java.util.List) int
   private int method_2331(List<Class3.Inner5> var1) {
      int var2 = 0;

      for (Class3.Inner5 var4 : var1) {
         var2 = Math.max(var2, this.method_2332(var4));
      }

      return var2;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner5) int
   private int method_2332(Class3.Inner5 var1) {
      return Math.max(8, Math.round(16.0F * var1.method_1334()));
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner5, int, int) void
   private void method_2333(DrawContext var1, Class3.Inner5 var2, int var3, int var4) {
      float var5 = var2.method_1334();
      if (Math.abs(var5 - 1.0F) < 0.001F) {
         var1.method_51427(var2.method_1333(), var3, var4);
         var1.method_51431(c.field_1772, var2.method_1333(), var3, var4);
      } else {
         var1.method_51448().method_22903();
         var1.method_51448().method_46416(var3, var4, 0.0F);
         var1.method_51448().method_22905(var5, var5, 1.0F);
         var1.method_51427(var2.method_1333(), 0, 0);
         var1.method_51431(c.field_1772, var2.method_1333(), 0, 0);
         var1.method_51448().method_22909();
      }
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) java.util.List
   private List<Class3.Inner3> method_2334(PlayerEntity var1) {
      if (!this.field_1708.method_671()) {
         return List.of();
      } else {
         ArrayList var2 = new ArrayList(2);
         if (var1.method_6059(StatusEffects.field_5910)) {
            var2.add(new Class3.Inner3(StatusEffects.field_5910, 1.0F));
         }

         if (this.method_2340(var1) || this.field_1726.containsKey(var1.method_5667())) {
            float var3 = 1.0F;
            Class3.Inner2 var4 = this.field_1726.get(var1.method_5667());
            if (!this.method_2340(var1) && var4 != null && this.field_1710.method_671()) {
               var3 = var4.method_880();
            }

            var2.add(new Class3.Inner3(StatusEffects.field_5907, var3));
         }

         return var2;
      }
   }

   // $VF: renamed from: a (net.minecraft.client.gui.DrawContext, Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner3, int, int, int) void
   private void method_2335(DrawContext var1, Class3.Inner3 var2, int var3, int var4, int var5) {
      Sprite var6 = c.method_18505().method_18663(var2.method_1250());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var2.method_1251());
      var1.method_52709(RenderLayer::method_62277, var6, var3, var4, var5, var5);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $VF: renamed from: a () boolean
   private boolean method_2336() {
      return c != null && c.method_1478().method_14486(field_1690).isPresent();
   }

   // $VF: renamed from: n () void
   private void method_2337() {
      if (!this.field_1723 && c != null) {
         this.field_1723 = true;
         Optional var1 = c.method_1478().method_14486(field_1690);
         if (!var1.isEmpty()) {
            try {
               NativeImage var2 = NativeImage.method_4309(((Resource)var1.get()).method_14482());

               try {
                  this.field_1724 = Math.max(1, var2.method_4307());
                  this.field_1725 = Math.max(1, var2.method_4323());
               } catch (Throwable var6) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                     }
                  }

                  throw var6;
               }

               if (var2 != null) {
                  var2.close();
               }
            } catch (IOException var7) {
               Dev.ZWare.Client.Class1.field_294.error("Failed to read nametag client logo dimensions.", var7);
            }
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2338() {
      if (c.field_1687 == null) {
         this.field_1726.clear();
         this.field_1727.clear();
      } else {
         Iterator var1 = this.field_1726.entrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            PlayerEntity var3 = c.field_1687.method_18470((UUID)var2.getKey());
            if (var3 != null && var3.method_5805()) {
               Class3.Inner2 var4 = (Class3.Inner2)var2.getValue();
               var4.field_450--;
               if (var4.field_450 <= 0) {
                  var1.remove();
               } else if (!this.method_2340(var3) && this.method_2341(var3, var4)) {
                  var1.remove();
               }
            } else {
               var1.remove();
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2339() {
      HashMap var1 = new HashMap();
      double var2 = Math.max(8.0, (double)this.field_1698.method_671().floatValue()) + 4.25 + 2.0;
      Box var4 = c.field_1724.method_5829().method_1014(var2);

      for (PotionEntity var6 : c.field_1687.method_8390(PotionEntity.class, var4, var0 -> true)) {
         int var7 = this.method_2343(var6.method_7495());
         if (var7 > 0) {
            var1.put(var6.method_5628(), new Class3.Inner4(var6.method_19538(), var7));
         }
      }

      Iterator var8 = this.field_1727.entrySet().iterator();

      while (var8.hasNext()) {
         Entry var9 = (Entry)var8.next();
         if (!var1.containsKey(var9.getKey())) {
            this.method_2342(((Class3.Inner4)var9.getValue()).method_1447(), ((Class3.Inner4)var9.getValue()).method_1448());
            var8.remove();
         }
      }

      this.field_1727.clear();
      this.field_1727.putAll(var1);
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2340(PlayerEntity var1) {
      StatusEffectInstance var2 = var1.method_6112(StatusEffects.field_5907);
      StatusEffectInstance var3 = var1.method_6112(StatusEffects.field_5909);
      return var2 != null && var2.method_5578() > 0 && var3 != null;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity, Dev.ZWare.Client.features.pkg1.pkg5.Class3$Inner2) boolean
   private boolean method_2341(PlayerEntity var1, Class3.Inner2 var2) {
      if (var1.method_24828() && !var1.method_5799() && !var1.method_6101() && !var1.method_5765() && !var1.method_6128()) {
         double var3 = var1.method_23317() - var1.field_6014;
         double var5 = var1.method_23321() - var1.field_5969;
         double var7 = Math.sqrt(var3 * var3 + var5 * var5);
         if (var7 >= 0.165) {
            var2.field_452++;
         } else {
            var2.field_452 = 0;
         }

         return var2.field_452 >= 4;
      } else {
         var2.field_452 = 0;
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, int) void
   private void method_2342(Vec3d var1, int var2) {
      double var3 = 18.0625;

      for (PlayerEntity var6 : c.field_1687.method_18456()) {
         if (var6.method_5805() && !(var6.method_19538().method_1025(var1) > var3)) {
            this.field_1726.put(var6.method_5667(), new Class3.Inner2(var2));
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) int
   private int method_2343(ItemStack var1) {
      if (!var1.method_7960() && var1.method_31574(Items.field_8436)) {
         PotionContentsComponent var2 = (PotionContentsComponent)var1.method_58694(DataComponentTypes.field_49651);
         if (var2 == null) {
            return 0;
         } else {
            int var3 = 0;
            boolean var4 = false;
            boolean var5 = false;

            for (StatusEffectInstance var7 : var2.method_57397()) {
               if (var7.method_5579().equals(StatusEffects.field_5907)) {
                  var4 = true;
                  var3 = Math.max(var3, var7.method_5584());
               } else if (var7.method_5579().equals(StatusEffects.field_5909)) {
                  var5 = true;
                  var3 = Math.max(var3, var7.method_5584());
               }
            }

            if (var4 && var5) {
               return var3 > 0 ? var3 : 400;
            } else {
               return 0;
            }
         }
      } else {
         return 0;
      }
   }

   private static enum Inner1 {
      Brackets,
      Minus;
   }

   private static class Inner2 {
      // $VF: renamed from: a int
      private int field_450;
      // $VF: renamed from: b int
      private final int field_451;
      // $VF: renamed from: c int
      private int field_452;

      private Inner2(int var1) {
         this.field_450 = var1;
         this.field_451 = Math.max(1, var1);
      }

      // $VF: renamed from: a () float
      private float method_880() {
         return MathHelper.method_15363((float)this.field_450 / this.field_451, 0.15F, 1.0F);
      }
   }

   record Inner3(RegistryEntry<StatusEffect> cA, float cB) {
      // $VF: renamed from: cA net.minecraft.registry.entry.RegistryEntry
      private final RegistryEntry<StatusEffect> field_736;
      // $VF: renamed from: cB float
      private final float field_737;

      Inner3(RegistryEntry<StatusEffect> cA, float cB) {
         this.field_736 = cA;
         this.field_737 = cB;
      }

      // $VF: renamed from: cA () net.minecraft.registry.entry.RegistryEntry
      public RegistryEntry<StatusEffect> method_1250() {
         return this.field_736;
      }

      // $VF: renamed from: cB () float
      public float method_1251() {
         return this.field_737;
      }
   }

   record Inner4(Vec3d cL, int cM) {
      // $VF: renamed from: cL net.minecraft.util.math.Vec3d
      private final Vec3d field_917;
      // $VF: renamed from: cM int
      private final int field_918;

      Inner4(Vec3d cL, int cM) {
         this.field_917 = cL;
         this.field_918 = cM;
      }

      // $VF: renamed from: cL () net.minecraft.util.math.Vec3d
      public Vec3d method_1447() {
         return this.field_917;
      }

      // $VF: renamed from: cM () int
      public int method_1448() {
         return this.field_918;
      }
   }

   record Inner5(ItemStack cy, float cz) {
      // $VF: renamed from: cy net.minecraft.item.ItemStack
      private final ItemStack field_816;
      // $VF: renamed from: cz float
      private final float field_817;

      Inner5(ItemStack cy, float cz) {
         this.field_816 = cy;
         this.field_817 = cz;
      }

      // $VF: renamed from: cy () net.minecraft.item.ItemStack
      public ItemStack method_1333() {
         return this.field_816;
      }

      // $VF: renamed from: cz () float
      public float method_1334() {
         return this.field_817;
      }
   }

   record Inner7(String cC, String cD, int cE, int cF, double cG, double cH, List<Class3.Inner5> cI, List<Class3.Inner3> cJ, boolean cK) {
      // $VF: renamed from: cC java.lang.String
      private final String field_1000;
      // $VF: renamed from: cD java.lang.String
      private final String field_1001;
      // $VF: renamed from: cE int
      private final int field_1002;
      // $VF: renamed from: cF int
      private final int field_1003;
      // $VF: renamed from: cG double
      private final double field_1004;
      // $VF: renamed from: cH double
      private final double field_1005;
      // $VF: renamed from: cI java.util.List
      private final List<Class3.Inner5> field_1006;
      // $VF: renamed from: cJ java.util.List
      private final List<Class3.Inner3> field_1007;
      // $VF: renamed from: cK boolean
      private final boolean field_1008;

      Inner7(String cC, String cD, int cE, int cF, double cG, double cH, List<Class3.Inner5> cI, List<Class3.Inner3> cJ, boolean cK) {
         this.field_1000 = cC;
         this.field_1001 = cD;
         this.field_1002 = cE;
         this.field_1003 = cF;
         this.field_1004 = cG;
         this.field_1005 = cH;
         this.field_1006 = cI;
         this.field_1007 = cJ;
         this.field_1008 = cK;
      }

      // $VF: renamed from: cC () java.lang.String
      public String method_1535() {
         return this.field_1000;
      }

      // $VF: renamed from: cD () java.lang.String
      public String method_1536() {
         return this.field_1001;
      }

      // $VF: renamed from: cE () int
      public int method_1537() {
         return this.field_1002;
      }

      // $VF: renamed from: cF () int
      public int method_1538() {
         return this.field_1003;
      }

      // $VF: renamed from: cG () double
      public double method_1539() {
         return this.field_1004;
      }

      // $VF: renamed from: cH () double
      public double method_1540() {
         return this.field_1005;
      }

      // $VF: renamed from: cI () java.util.List
      public List<Class3.Inner5> method_1541() {
         return this.field_1006;
      }

      // $VF: renamed from: cJ () java.util.List
      public List<Class3.Inner3> method_1542() {
         return this.field_1007;
      }

      // $VF: renamed from: cK () boolean
      public boolean method_1543() {
         return this.field_1008;
      }
   }
}
