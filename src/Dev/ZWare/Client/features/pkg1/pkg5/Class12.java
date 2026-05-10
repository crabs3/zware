package Dev.ZWare.Client.features.pkg1.pkg5;

import Dev.ZWare.Client.mixin.Class39;
import java.awt.Color;
import net.minecraft.client.particle.AnimatedParticle;
import net.minecraft.client.particle.FireworksSparkParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.TotemParticle;

public class Class12 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg5.Class12
   private static Class12 field_1973;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1974 = this.a("Totem", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1975 = this.a("Firework", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class12.Inner1> field_1976 = this.a("Mode", Class12.Inner1.Solid);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1977 = this.a("Color One", 110, 255, 160, 255);
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1978 = this.a("Color Two", 255, 170, 60, 255);
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1979 = this.a("Color Three", 120, 210, 255, 255);
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1980 = this.a("Color Four", 255, 110, 210, 255);
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1981 = this.a("Rainbow Speed", 1.0F, 0.1F, 5.0F);
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1982 = this.a("Rainbow Saturation", 0.9F, 0.0F, 1.0F);
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Float> field_1983 = this.a("Rainbow Brightness", 1.0F, 0.0F, 1.0F);

   public Class12() {
      super("Particles", "change rendering of sum particles", Dev.ZWare.Client.features.pkg1.Class1.Inner1.VISUALS, false, false, false);
      field_1973 = this;
      this.field_1978.method_709(var1 -> this.field_1976.method_671() == Class12.Inner1.Split);
      this.field_1979.method_709(var1 -> this.field_1976.method_671() == Class12.Inner1.Split);
      this.field_1980.method_709(var1 -> this.field_1976.method_671() == Class12.Inner1.Split);
      this.field_1981.method_709(var1 -> this.field_1976.method_671() == Class12.Inner1.Rainbow);
      this.field_1982.method_709(var1 -> this.field_1976.method_671() == Class12.Inner1.Rainbow);
      this.field_1983.method_709(var1 -> this.field_1976.method_671() == Class12.Inner1.Rainbow);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg5.Class12
   public static Class12 method_2595() {
      return field_1973;
   }

   // $VF: renamed from: a (net.minecraft.client.particle.Particle) boolean
   public boolean method_2596(Particle particle) {
      return this.d() && particle != null && (this.method_2598(particle) || this.method_2599(particle));
   }

   // $VF: renamed from: a (net.minecraft.client.particle.Particle) void
   public void method_2597(Particle particle) {
      if (this.method_2596(particle)) {
         Color var2 = switch ((Class12.Inner1)this.field_1976.method_671()) {
            case Solid -> (Color)this.field_1977.method_671();
            case Split -> this.method_2602(particle);
            case Rainbow -> this.method_2603(particle);
         };
         particle.method_3084(var2.getRed() / 255.0F, var2.getGreen() / 255.0F, var2.getBlue() / 255.0F);
         if (particle instanceof AnimatedParticle var3) {
            Class39 var4 = (Class39)var3;
            var4.oyvey$setTargetRed(var2.getRed() / 255.0F);
            var4.oyvey$setTargetGreen(var2.getGreen() / 255.0F);
            var4.oyvey$setTargetBlue(var2.getBlue() / 255.0F);
            var4.oyvey$setChangesColor(true);
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.client.particle.Particle) boolean
   public boolean method_2598(Particle particle) {
      return this.field_1974.method_671() && method_2600(particle);
   }

   // $VF: renamed from: c (net.minecraft.client.particle.Particle) boolean
   public boolean method_2599(Particle particle) {
      return this.field_1975.method_671() && method_2601(particle);
   }

   // $VF: renamed from: d (net.minecraft.client.particle.Particle) boolean
   public static boolean method_2600(Particle particle) {
      return particle instanceof TotemParticle;
   }

   // $VF: renamed from: e (net.minecraft.client.particle.Particle) boolean
   public static boolean method_2601(Particle particle) {
      if (particle == null) {
         return false;
      } else {
         Class var1 = particle.getClass();
         return var1 == FireworksSparkParticle.class
            || var1.getEnclosingClass() == FireworksSparkParticle.class
            || var1.getNestHost() == FireworksSparkParticle.class;
      }
   }

   // $VF: renamed from: a (net.minecraft.client.particle.Particle) java.awt.Color
   private Color method_2602(Particle var1) {
      int var2 = Math.floorMod(System.identityHashCode(var1), 4);

      return switch (var2) {
         case 1 -> (Color)this.field_1978.method_671();
         case 2 -> (Color)this.field_1979.method_671();
         case 3 -> (Color)this.field_1980.method_671();
         default -> (Color)this.field_1977.method_671();
      };
   }

   // $VF: renamed from: b (net.minecraft.client.particle.Particle) java.awt.Color
   private Color method_2603(Particle var1) {
      double var2 = (float)System.currentTimeMillis() * Math.max(0.1F, this.field_1981.method_671());
      double var4 = Math.floorMod(System.identityHashCode(var1), 360);
      float var6 = (float)((var2 / 20.0 + var4) % 360.0 / 360.0);
      return Color.getHSBColor(var6, Math.max(0.0F, Math.min(1.0F, this.field_1982.method_671())), Math.max(0.0F, Math.min(1.0F, this.field_1983.method_671())));
   }

   public static enum Inner1 {
      Solid,
      Split,
      Rainbow;
   }
}
