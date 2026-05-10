package Dev.ZWare.Client.pkg1;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;

public final class Class5 {
   private Class5() {
   }

   // $VF: renamed from: a () java.util.List
   public static List<Class5.Inner1> method_166() {
      try {
         Class var0 = Class.forName("baritone.api.BaritoneAPI");
         Object var1 = var0.getMethod("getProvider").invoke(null);
         Object var2 = var1.getClass().getMethod("getPrimaryBaritone").invoke(var1);
         Object var3 = var2.getClass().getMethod("getSelectionManager").invoke(var2);
         Object var4 = var3.getClass().getMethod("getSelections").invoke(var3);
         if (var4 != null && var4.getClass().isArray()) {
            int var5 = Array.getLength(var4);
            ArrayList var6 = new ArrayList(var5);

            for (int var7 = 0; var7 < var5; var7++) {
               Object var8 = Array.get(var4, var7);
               if (var8 != null) {
                  BlockPos var9 = method_168(method_167(var8, "min"));
                  BlockPos var10 = method_168(method_167(var8, "max"));
                  if (var9 != null && var10 != null) {
                     var6.add(new Class5.Inner1(var9, var10));
                  }
               }
            }

            return var6;
         } else {
            return List.of();
         }
      } catch (Throwable var11) {
         return List.of();
      }
   }

   // $VF: renamed from: a (java.lang.Object, java.lang.String) java.lang.Object
   private static Object method_167(Object var0, String var1) throws ReflectiveOperationException {
      Method var2 = var0.getClass().getMethod(var1);
      var2.setAccessible(true);
      return var2.invoke(var0);
   }

   // $VF: renamed from: a (java.lang.Object) net.minecraft.util.math.BlockPos
   private static BlockPos method_168(Object var0) {
      return var0 instanceof BlockPos var1 ? var1 : null;
   }

   public record Inner1(BlockPos c1, BlockPos c2) {
      // $VF: renamed from: c1 net.minecraft.util.math.BlockPos
      private final BlockPos field_943;
      // $VF: renamed from: c2 net.minecraft.util.math.BlockPos
      private final BlockPos field_944;

      public Inner1(BlockPos c1, BlockPos c2) {
         this.field_943 = c1;
         this.field_944 = c2;
      }

      // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
      public boolean method_1473(BlockPos pos) {
         if (pos != null && this.field_943 != null && this.field_944 != null) {
            int var2 = Math.min(this.field_943.method_10263(), this.field_944.method_10263());
            int var3 = Math.min(this.field_943.method_10264(), this.field_944.method_10264());
            int var4 = Math.min(this.field_943.method_10260(), this.field_944.method_10260());
            int var5 = Math.max(this.field_943.method_10263(), this.field_944.method_10263());
            int var6 = Math.max(this.field_943.method_10264(), this.field_944.method_10264());
            int var7 = Math.max(this.field_943.method_10260(), this.field_944.method_10260());
            return pos.method_10263() >= var2
               && pos.method_10263() <= var5
               && pos.method_10264() >= var3
               && pos.method_10264() <= var6
               && pos.method_10260() >= var4
               && pos.method_10260() <= var7;
         } else {
            return false;
         }
      }

      // $VF: renamed from: c1 () net.minecraft.util.math.BlockPos
      public BlockPos method_1474() {
         return this.field_943;
      }

      // $VF: renamed from: c2 () net.minecraft.util.math.BlockPos
      public BlockPos method_1475() {
         return this.field_944;
      }
   }
}
