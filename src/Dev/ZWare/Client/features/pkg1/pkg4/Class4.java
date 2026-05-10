package Dev.ZWare.Client.features.pkg1.pkg4;

import Dev.ZWare.Client.pkg2.pkg1.Class16;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Class4 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o long
   private static final long field_1249 = 75L;
   // $VF: renamed from: p long
   private static final long field_1250 = 100L;
   // $VF: renamed from: q net.minecraft.util.Identifier
   private static final Identifier field_1251 = Identifier.method_60655("minecraft", "item.totem.use");
   // $VF: renamed from: r net.minecraft.util.Identifier
   private static final Identifier field_1252 = Identifier.method_60655("minecraft", "entity.generic.explode");
   // $VF: renamed from: s net.minecraft.util.Identifier
   private static final Identifier field_1253 = Identifier.method_60655("minecraft", "entity.experience_orb.pickup");
   // $VF: renamed from: t net.minecraft.util.Identifier
   private static final Identifier field_1254 = Identifier.method_60655("minecraft", "entity.player.hurt");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg1.pkg4.Class4
   private static Class4 field_1255;
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1256 = this.a("TotemPop", 1.0, 0.0, 2.0);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1257 = this.a("Explosion", 1.0, 0.0, 2.0);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1258 = this.a("EXP", 1.0, 0.0, 2.0);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1259 = this.a("Damage", 1.0, 0.0, 2.0);
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1260 = this.a("VisualRangeVolume", 1.0, 0.0, 2.0);
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1261 = this.a("PopSound", Class4.Inner1.VanillaTotem);
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1262 = this.a("ExplosionSound", Class4.Inner1.VanillaExplosion);
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1263 = this.a("EXPSound", Class4.Inner1.VanillaExp);
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1264 = this.a("DamageSound", Class4.Inner1.VanillaDamage);
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1265 = this.a("VisualRangeSound", Class4.Inner1.VanillaLevelUp);
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1266 = this.a("ClickVolume", 1.0, 0.0, 2.0);
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1267 = this.a("ClickSound", Class4.Inner1.Enable);
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1268 = this.a("HoverVolume", 1.0, 0.0, 2.0);
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class4.Inner1> field_1269 = this.a("HoverSound", Class4.Inner1.Hover1);
   // $VF: renamed from: J java.util.Set
   private final Set<Integer> field_1270 = new HashSet<>();
   // $VF: renamed from: K boolean
   private boolean field_1271;
   // $VF: renamed from: L long
   private long field_1272;
   // $VF: renamed from: M long
   private long field_1273;

   public Class4() {
      super("Sounds", "Custom combat and alert sounds.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.CLIENT, true, false, false);
      field_1255 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class4
   public static Class4 method_1935() {
      return field_1255 != null ? field_1255 : (Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Class4.class) : null);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1270.clear();
      this.field_1271 = false;
      this.field_1272 = 0L;
      this.field_1273 = 0L;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.field_1270.clear();
      this.field_1271 = false;
      this.field_1272 = 0L;
      this.field_1273 = 0L;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_1936(Class16.Inner1 var1) {
      if (g()) {
         this.method_1952();
      } else if (var1.method_1045() instanceof EntityStatusS2CPacket var2
         && var2.method_11470() == 35
         && var2.method_11469(c.field_1687) instanceof PlayerEntity) {
         this.method_1948(this.field_1261.method_671(), this.field_1256.method_671());
      } else if (var1.method_1045() instanceof ExplosionS2CPacket) {
         this.method_1948(this.field_1262.method_671(), this.field_1257.method_671());
      } else {
         if (var1.method_1045() instanceof EntityDamageS2CPacket var5 && c.field_1724 != null && var5.comp_1267() == c.field_1724.method_5628()) {
            long var7 = System.currentTimeMillis();
            if (var7 - this.field_1272 >= 75L) {
               this.field_1272 = var7;
               this.method_1948(this.field_1264.method_671(), this.field_1259.method_671());
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP
   private void method_1937(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (g()) {
         this.method_1952();
      } else {
         HashSet var2 = new HashSet();
         boolean var3 = false;

         for (ExperienceOrbEntity var5 : c.field_1687
            .method_8390(ExperienceOrbEntity.class, c.field_1724.method_5829().method_1009(8.0, 4.0, 8.0), var0 -> true)) {
            int var6 = var5.method_5628();
            var2.add(var6);
            if (this.field_1271 && !this.field_1270.contains(var6)) {
               var3 = true;
            }
         }

         this.field_1270.clear();
         this.field_1270.addAll(var2);
         if (!this.field_1271) {
            this.field_1271 = true;
         } else {
            long var7 = System.currentTimeMillis();
            if (var3 && var7 - this.field_1273 >= 100L) {
               this.field_1273 = var7;
               this.method_1951(this.field_1263.method_671(), this.field_1258.method_671());
            }
         }
      }
   }

   // $VF: renamed from: n () void
   public void method_1938() {
      this.method_1951(this.field_1265.method_671(), this.field_1260.method_671());
   }

   // $VF: renamed from: o () void
   public void method_1939() {
      this.method_1948(this.field_1267.method_671(), this.field_1266.method_671());
   }

   // $VF: renamed from: p () void
   public void method_1940() {
      this.method_1948(this.field_1269.method_671(), this.field_1268.method_671());
   }

   // $VF: renamed from: q () void
   public void method_1941() {
      this.method_1948(Class4.Inner1.Twitter, 1.0);
   }

   // $VF: renamed from: r () void
   public void method_1942() {
      this.method_1948(Class4.Inner1.field_711, 1.0);
   }

   // $VF: renamed from: s () void
   public void method_1943() {
      this.method_1948(Class4.Inner1.field_712, 1.0);
   }

   // $VF: renamed from: t () void
   public void method_1944() {
      this.method_1948(Class4.Inner1.Google, 1.0);
   }

   // $VF: renamed from: u () void
   public void method_1945() {
      this.method_1948(Class4.Inner1.Undertale, 1.0);
   }

   // $VF: renamed from: v () void
   public void method_1946() {
      this.method_1948(Class4.Inner1.Samsung, 1.0);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1) void
   public void method_1947(Class4.Inner1 choice) {
      this.method_1948(choice, 1.0);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1, double) void
   private void method_1948(Class4.Inner1 var1, double var2) {
      if (c != null) {
         c.execute(() -> this.method_1951(var1, var2));
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_1949() {
      if (!this.d()) {
         return false;
      } else {
         Class4.Inner1 var1 = this.field_1261.method_671();
         return var1 != null && var1.method_1222();
      }
   }

   // $VF: renamed from: a (net.minecraft.util.Identifier) boolean
   public boolean method_1950(Identifier soundId) {
      if (!this.d() || soundId == null) {
         return false;
      } else if (field_1251.equals(soundId)) {
         return this.method_1953(this.field_1261.method_671(), Class4.Inner1.VanillaTotem);
      } else if (field_1252.equals(soundId)) {
         return this.method_1953(this.field_1262.method_671(), Class4.Inner1.VanillaExplosion);
      } else if (field_1253.equals(soundId)) {
         return this.method_1953(this.field_1263.method_671(), Class4.Inner1.VanillaExp);
      } else {
         return field_1254.equals(soundId) ? this.method_1953(this.field_1264.method_671(), Class4.Inner1.VanillaDamage) : false;
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1, double) void
   private void method_1951(Class4.Inner1 var1, double var2) {
      if (this.d() && !g() && c.method_1483() != null) {
         float var4 = (float)Math.max(0.0, Math.min(2.0, var2));
         if (!(var4 <= 0.0F) && var1 != null && var1 != Class4.Inner1.None) {
            PositionedSoundInstance var5 = var1.method_1223(var4);
            if (var5 != null) {
               c.method_1483().method_4873(var5);
            }
         }
      }
   }

   // $VF: renamed from: w () void
   private void method_1952() {
      this.field_1270.clear();
      this.field_1271 = false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1, Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1) boolean
   private boolean method_1953(Class4.Inner1 var1, Class4.Inner1 var2) {
      return var1 != null && var1 != var2;
   }

   public static enum Inner1 {
      None(null, null),
      VanillaTotem(SoundEvent.method_47908(Identifier.method_60655("minecraft", "item.totem.use")), null),
      VanillaExplosion(SoundEvent.method_47908(Identifier.method_60655("minecraft", "entity.generic.explode")), null),
      VanillaExp(SoundEvent.method_47908(Identifier.method_60655("minecraft", "entity.experience_orb.pickup")), null),
      VanillaDamage(SoundEvent.method_47908(Identifier.method_60655("minecraft", "entity.player.hurt")), null),
      VanillaLevelUp(SoundEvent.method_47908(Identifier.method_60655("minecraft", "entity.player.levelup")), null),
      Custom1(SoundEvent.method_47908(Identifier.method_60655("oyvey", "custom_1")), Identifier.method_60655("oyvey", "sounds/custom/custom_1.ogg")),
      Custom2(SoundEvent.method_47908(Identifier.method_60655("oyvey", "custom_2")), Identifier.method_60655("oyvey", "sounds/custom/custom_2.ogg")),
      Custom3(SoundEvent.method_47908(Identifier.method_60655("oyvey", "custom_3")), Identifier.method_60655("oyvey", "sounds/custom/custom_3.ogg")),
      Custom4(SoundEvent.method_47908(Identifier.method_60655("oyvey", "custom_4")), Identifier.method_60655("oyvey", "sounds/custom/custom_4.ogg")),
      Custom5(SoundEvent.method_47908(Identifier.method_60655("oyvey", "custom_5")), Identifier.method_60655("oyvey", "sounds/custom/custom_5.ogg")),
      Enable(SoundEvent.method_47908(Identifier.method_60655("oyvey", "enable")), Identifier.method_60655("oyvey", "sounds/custom/enable.ogg")),
      Hover1(SoundEvent.method_47908(Identifier.method_60655("oyvey", "hover")), Identifier.method_60655("oyvey", "sounds/custom/hover.ogg")),
      Hover2(SoundEvent.method_47908(Identifier.method_60655("oyvey", "hover2")), Identifier.method_60655("oyvey", "sounds/custom/hover2.ogg")),
      Twitter(SoundEvent.method_47908(Identifier.method_60655("oyvey", "twitter")), Identifier.method_60655("oyvey", "sounds/custom/twitter.ogg")),
      // $VF: renamed from: Gta Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1
      field_711(SoundEvent.method_47908(Identifier.method_60655("oyvey", "gta")), Identifier.method_60655("oyvey", "sounds/custom/gta.ogg")),
      // $VF: renamed from: F1 Dev.ZWare.Client.features.pkg1.pkg4.Class4$Inner1
      field_712(SoundEvent.method_47908(Identifier.method_60655("oyvey", "f1")), Identifier.method_60655("oyvey", "sounds/custom/f1.ogg")),
      Google(SoundEvent.method_47908(Identifier.method_60655("oyvey", "google")), Identifier.method_60655("oyvey", "sounds/custom/google.ogg")),
      Undertale(SoundEvent.method_47908(Identifier.method_60655("oyvey", "undertale")), Identifier.method_60655("oyvey", "sounds/custom/undertale.ogg")),
      Samsung(SoundEvent.method_47908(Identifier.method_60655("oyvey", "samsung")), Identifier.method_60655("oyvey", "sounds/custom/samsung.ogg"));

      // $VF: renamed from: a net.minecraft.sound.SoundEvent
      private final SoundEvent field_713;
      // $VF: renamed from: b net.minecraft.util.Identifier
      private final Identifier field_714;

      private Inner1(SoundEvent var3, Identifier var4) {
         this.field_713 = var3;
         this.field_714 = var4;
      }

      // $VF: renamed from: a () boolean
      private boolean method_1222() {
         return this != VanillaTotem;
      }

      // $VF: renamed from: a (float) net.minecraft.client.sound.PositionedSoundInstance
      private PositionedSoundInstance method_1223(float var1) {
         return this.field_713 != null
               && Dev.ZWare.Client.features.Class1.field_1019 != null
               && Dev.ZWare.Client.features.Class1.field_1019.method_1483() != null
            ? PositionedSoundInstance.method_4757(this.field_713, 1.0F, var1)
            : null;
      }
   }
}
