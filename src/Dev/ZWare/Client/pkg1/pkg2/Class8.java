package Dev.ZWare.Client.pkg1.pkg2;

import java.util.OptionalDouble;
import java.util.function.Function;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters.Builder;
import net.minecraft.client.render.RenderPhase.LineWidth;
import net.minecraft.util.Util;

public class Class8 {
   // $VF: renamed from: a net.minecraft.client.render.RenderLayer
   private static final RenderLayer field_111 = RenderLayer.method_24048("global_fill", 156, Class6.field_215, method_247());
   // $VF: renamed from: b net.minecraft.client.render.RenderLayer
   private static final RenderLayer field_112 = RenderLayer.method_24048("global_lines_default", 156, Class6.field_216, method_247());
   // $VF: renamed from: c java.util.function.Function
   private static final Function<Double, RenderLayer> field_113 = Util.method_34866(var0 -> {
      LineWidth var1 = new LineWidth(OptionalDouble.of(var0));
      return RenderLayer.method_24048("global_lines", 156, Class6.field_216, method_246().method_23609(var1).method_23617(false));
   });

   // $VF: renamed from: a (double) net.minecraft.client.render.RenderLayer
   public static RenderLayer method_244(double width) {
      return width <= 1.0 ? field_112 : field_113.apply(width);
   }

   // $VF: renamed from: a () net.minecraft.client.render.RenderLayer
   public static RenderLayer method_245() {
      return field_111;
   }

   // $VF: renamed from: a () net.minecraft.client.render.RenderLayer.MultiPhaseParameters.Builder
   private static Builder method_246() {
      return MultiPhaseParameters.method_23598();
   }

   // $VF: renamed from: a () net.minecraft.client.render.RenderLayer.MultiPhaseParameters
   private static MultiPhaseParameters method_247() {
      return method_246().method_23617(false);
   }
}
