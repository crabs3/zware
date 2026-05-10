package Dev.ZWare.Client.pkg1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.chunk.WorldChunk;

public final class Class15 {
   // $VF: renamed from: a boolean
   private static boolean field_426;
   // $VF: renamed from: b boolean
   private static boolean field_427;
   // $VF: renamed from: c java.lang.Object
   private static Object field_428;
   // $VF: renamed from: d java.lang.reflect.Method
   private static Method field_429;
   // $VF: renamed from: e java.lang.reflect.Method
   private static Method field_430;
   // $VF: renamed from: f java.lang.Class
   private static Class<?> field_431;
   // $VF: renamed from: g java.lang.reflect.Method
   private static Method field_432;
   // $VF: renamed from: h java.lang.reflect.Method
   private static Method field_433;
   // $VF: renamed from: i java.lang.reflect.Method
   private static Method field_434;
   // $VF: renamed from: j java.lang.Class
   private static Class<?> field_435;
   // $VF: renamed from: k java.lang.Class
   private static Class<?> field_436;
   // $VF: renamed from: l java.lang.reflect.Method
   private static Method field_437;
   // $VF: renamed from: m java.lang.reflect.Method
   private static Method field_438;
   // $VF: renamed from: n java.lang.reflect.Method
   private static Method field_439;

   private Class15() {
   }

   // $VF: renamed from: a () boolean
   public static boolean method_862() {
      method_871();
      return field_427;
   }

   // $VF: renamed from: a (java.lang.Object) boolean
   public static boolean method_863(Object listener) {
      method_871();
      if (field_427 && listener != null) {
         try {
            field_429.invoke(field_428, listener);
            return true;
         } catch (Throwable var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (java.lang.Object) void
   public static void method_864(Object listener) {
      method_871();
      if (field_427 && listener != null) {
         try {
            field_430.invoke(field_428, listener);
         } catch (Throwable var2) {
         }
      }
   }

   // $VF: renamed from: b (java.lang.Object) boolean
   public static boolean method_865(Object event) {
      method_871();
      return field_427 && event != null && field_431.isInstance(event);
   }

   // $VF: renamed from: c (java.lang.Object) boolean
   public static boolean method_866(Object event) {
      if (!method_865(event)) {
         return false;
      } else {
         try {
            return (Boolean)field_432.invoke(event);
         } catch (Throwable var2) {
            return false;
         }
      }
   }

   // $VF: renamed from: a (java.lang.Object) net.minecraft.world.chunk.WorldChunk
   public static WorldChunk method_867(Object event) {
      if (!method_865(event)) {
         return null;
      } else {
         try {
            return field_433.invoke(event) instanceof WorldChunk var2 ? var2 : null;
         } catch (Throwable var3) {
            return null;
         }
      }
   }

   // $VF: renamed from: a (int, int, net.minecraft.registry.RegistryKey) boolean
   public static boolean method_868(int x, int z, RegistryKey<World> worldKey) {
      method_871();
      if (!field_427) {
         return false;
      } else {
         try {
            Object var3 = field_434.invoke(null, field_435);
            return var3 != null && (Boolean)field_437.invoke(var3, x, z, worldKey);
         } catch (Throwable var4) {
            return false;
         }
      }
   }

   // $VF: renamed from: b (int, int, net.minecraft.registry.RegistryKey) boolean
   public static boolean method_869(int x, int z, RegistryKey<World> worldKey) {
      method_871();
      if (!field_427) {
         return false;
      } else {
         try {
            Object var3 = field_434.invoke(null, field_436);
            return var3 != null && (Boolean)field_438.invoke(var3, x, z, worldKey);
         } catch (Throwable var4) {
            return false;
         }
      }
   }

   // $VF: renamed from: c (int, int, net.minecraft.registry.RegistryKey) boolean
   public static boolean method_870(int x, int z, RegistryKey<World> worldKey) {
      method_871();
      if (!field_427) {
         return false;
      } else {
         try {
            Object var3 = field_434.invoke(null, field_436);
            return var3 != null && (Boolean)field_439.invoke(var3, x, z, worldKey);
         } catch (Throwable var4) {
            return false;
         }
      }
   }

   // $VF: renamed from: a () void
   private static synchronized void method_871() {
      if (!field_426) {
         field_426 = true;

         try {
            Class var0 = Class.forName("xaeroplus.XaeroPlus");
            Field var1 = var0.getField("EVENT_BUS");
            field_428 = var1.get(null);
            field_429 = field_428.getClass().getMethod("register", Object.class);
            field_430 = field_428.getClass().getMethod("unregister", Object.class);
            field_431 = Class.forName("xaeroplus.event.ChunkDataEvent");
            field_432 = field_431.getMethod("seenChunk");
            field_433 = field_431.getMethod("chunk");
            Class var2 = Class.forName("xaeroplus.module.ModuleManager");
            field_434 = var2.getMethod("getModule", Class.class);
            field_435 = Class.forName("xaeroplus.module.impl.OldChunks");
            field_436 = Class.forName("xaeroplus.module.impl.PaletteNewChunks");
            field_437 = field_435.getMethod("isOldChunk", int.class, int.class, RegistryKey.class);
            field_438 = field_436.getMethod("isNewChunk", int.class, int.class, RegistryKey.class);
            field_439 = field_436.getMethod("isInverseNewChunk", int.class, int.class, RegistryKey.class);
            field_427 = true;
         } catch (Throwable var3) {
            field_427 = false;
         }
      }
   }
}
