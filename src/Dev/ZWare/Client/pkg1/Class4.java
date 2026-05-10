package Dev.ZWare.Client.pkg1;

import java.lang.reflect.Field;
import net.minecraft.client.MinecraftClient;

public final class Class4 {
   // $VF: renamed from: a boolean
   private static boolean field_100;
   // $VF: renamed from: b boolean
   private static boolean field_101;
   // $VF: renamed from: c java.lang.Object
   private static Object field_102;
   // $VF: renamed from: d java.lang.reflect.Field
   private static Field field_103;
   // $VF: renamed from: e java.lang.reflect.Field
   private static Field field_104;
   // $VF: renamed from: f java.lang.reflect.Field
   private static Field field_105;
   // $VF: renamed from: g boolean
   private static boolean field_106;

   private Class4() {
   }

   // $VF: renamed from: a () void
   public static void method_226() {
      if (method_228()) {
         method_230(field_103, false);
         method_230(field_104, false);
         if (!field_106) {
            field_106 = true;
            Dev.ZWare.Client.Class1.field_294.info("Disabled Baritone multiplayer chunk caching to reduce freezes.");
         }
      }
   }

   // $VF: renamed from: a () boolean
   public static boolean method_227() {
      MinecraftClient var0 = MinecraftClient.method_1551();
      return method_228() && var0 != null && !var0.method_1542() ? !method_229(field_103, true) : false;
   }

   // $VF: renamed from: b () boolean
   private static boolean method_228() {
      if (field_100) {
         return field_101;
      } else {
         field_100 = true;

         try {
            Class var0 = Class.forName("baritone.api.BaritoneAPI");
            field_102 = var0.getMethod("getSettings").invoke(null);
            Class var1 = field_102.getClass();
            field_103 = var1.getField("chunkCaching");
            field_104 = var1.getField("renderCachedChunks");
            field_105 = field_103.getType().getField("value");
            field_101 = true;
         } catch (Throwable var2) {
            field_101 = false;
         }

         return field_101;
      }
   }

   // $VF: renamed from: a (java.lang.reflect.Field, boolean) boolean
   private static boolean method_229(Field var0, boolean var1) {
      if (field_101 && field_102 != null && var0 != null && field_105 != null) {
         try {
            Object var2 = var0.get(field_102);
            return field_105.get(var2) instanceof Boolean var4 ? var4 : var1;
         } catch (Throwable var5) {
            return var1;
         }
      } else {
         return var1;
      }
   }

   // $VF: renamed from: a (java.lang.reflect.Field, boolean) void
   private static void method_230(Field var0, boolean var1) {
      if (field_101 && field_102 != null && var0 != null && field_105 != null) {
         try {
            Object var2 = var0.get(field_102);
            field_105.set(var2, var1);
         } catch (Throwable var3) {
            Dev.ZWare.Client.Class1.field_294.debug("Failed to update Baritone setting {}.", var0.getName(), var3);
         }
      }
   }
}
