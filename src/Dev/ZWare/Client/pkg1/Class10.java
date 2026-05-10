package Dev.ZWare.Client.pkg1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class10 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c net.minecraft.client.MinecraftClient
   public static final MinecraftClient field_339 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0;
   // $VF: renamed from: d java.util.Random
   private static final Random field_340 = new Random();

   // $VF: renamed from: a (int, int) int
   public static int method_636(int min, int max) {
      return min + field_340.nextInt(max - min + 1);
   }

   // $VF: renamed from: a (double, double) double
   public static double method_637(double min, double max) {
      return MathHelper.method_15350(min + field_340.nextDouble() * max, min, max);
   }

   // $VF: renamed from: a (float, float) float
   public static float method_638(float min, float max) {
      return MathHelper.method_15363(min + field_340.nextFloat() * max, min, max);
   }

   // $VF: renamed from: a (int, int, int) int
   public static int method_639(int num, int min, int max) {
      return num < min ? min : Math.min(num, max);
   }

   // $VF: renamed from: a (float, float, float) float
   public static float method_640(float num, float min, float max) {
      return num < min ? min : Math.min(num, max);
   }

   // $VF: renamed from: a (double, double, double) double
   public static double method_641(double num, double min, double max) {
      return num < min ? min : Math.min(num, max);
   }

   // $VF: renamed from: a (float) float
   public static float method_642(float value) {
      return MathHelper.method_15374(value);
   }

   // $VF: renamed from: b (float) float
   public static float method_643(float value) {
      return MathHelper.method_15362(value);
   }

   // $VF: renamed from: c (float) float
   public static float method_644(float value) {
      return MathHelper.method_15393(value);
   }

   // $VF: renamed from: a (double) double
   public static double method_645(double value) {
      return MathHelper.method_15338(value);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, int) net.minecraft.util.math.Vec3d
   public static Vec3d method_646(Vec3d vec3d, int places) {
      return new Vec3d(method_648(vec3d.field_1352, places), method_648(vec3d.field_1351, places), method_648(vec3d.field_1350, places));
   }

   // $VF: renamed from: b (double) double
   public static double method_647(double input) {
      return input * input;
   }

   // $VF: renamed from: a (double, int) double
   public static double method_648(double value, int places) {
      if (places < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var3 = BigDecimal.valueOf(value);
         var3 = var3.setScale(places, RoundingMode.FLOOR);
         return var3.doubleValue();
      }
   }

   // $VF: renamed from: d (float) float
   public static float method_649(float valI) {
      float var1 = valI % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   // $VF: renamed from: a (float) net.minecraft.util.math.Vec3d
   public static Vec3d method_650(float yaw) {
      return new Vec3d(Math.cos(method_655(yaw + 90.0F)), 0.0, Math.sin(method_655(yaw + 90.0F)));
   }

   // $VF: renamed from: a (float, int) float
   public static float method_651(float value, int places) {
      if (places < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var2 = BigDecimal.valueOf((double)value);
         var2 = var2.setScale(places, RoundingMode.FLOOR);
         return var2.floatValue();
      }
   }

   // $VF: renamed from: a (java.util.Map, boolean) java.util.Map
   public static <K, V extends Comparable<? super V>> Map<K, V> method_652(Map<K, V> map, boolean descending) {
      LinkedList var2 = new LinkedList(map.entrySet());
      if (descending) {
         var2.sort(Entry.comparingByValue(Comparator.reverseOrder()));
      } else {
         var2.sort(Entry.comparingByValue());
      }

      LinkedHashMap var3 = new LinkedHashMap();

      for (Entry var5 : var2) {
         var3.put(var5.getKey(), (Comparable)var5.getValue());
      }

      return var3;
   }

   // $VF: renamed from: a () java.lang.String
   public static String method_653() {
      Calendar var0 = Calendar.getInstance();
      int var1 = var0.get(11);
      if (var1 < 12) {
         return "Good Morning ";
      } else if (var1 < 16) {
         return "Good Afternoon ";
      } else {
         return var1 < 21 ? "Good Evening " : "Good Night ";
      }
   }

   // $VF: renamed from: c (double) double
   public static double method_654(double rad) {
      return rad * (float) (180.0 / Math.PI);
   }

   // $VF: renamed from: d (double) double
   public static double method_655(double deg) {
      return deg * (float) (Math.PI / 180.0);
   }

   // $VF: renamed from: b (double, double) double
   public static double method_656(double val, double inc) {
      double var4 = 1.0 / inc;
      return Math.round(val * var4) / var4;
   }

   // $VF: renamed from: a (double) double[]
   public static double[] method_657(double speed) {
      float var2 = field_339.field_1724.field_3913.method_3128().field_1342;
      float var3 = field_339.field_1724.field_3913.method_3128().field_1343;
      float var4 = field_339.field_1724.field_5982
         + (field_339.field_1724.method_36454() - field_339.field_1724.field_5982) * field_339.method_61966().method_60637(false);
      if (var2 != 0.0F) {
         if (var3 > 0.0F) {
            var4 += var2 > 0.0F ? -45 : 45;
         } else if (var3 < 0.0F) {
            var4 += var2 > 0.0F ? 45 : -45;
         }

         var3 = 0.0F;
         if (var2 > 0.0F) {
            var2 = 1.0F;
         } else if (var2 < 0.0F) {
            var2 = -1.0F;
         }
      }

      double var5 = Math.sin(Math.toRadians(var4 + 90.0F));
      double var7 = Math.cos(Math.toRadians(var4 + 90.0F));
      double var9 = var2 * speed * var7 + var3 * speed * var5;
      double var11 = var2 * speed * var5 - var3 * speed * var7;
      return new double[]{var9, var11};
   }

   // $VF: renamed from: a (net.minecraft.entity.Entity) java.util.List
   public static List<Vec3d> method_658(Entity entity) {
      ArrayList var1 = new ArrayList();
      Box var2 = entity.method_5829();
      double var3 = entity.method_23318();
      double var5 = method_648(var2.field_1323, 0);
      double var7 = method_648(var2.field_1321, 0);
      double var9 = method_648(var2.field_1320, 0);
      double var11 = method_648(var2.field_1324, 0);
      if (var5 != var9) {
         var1.add(new Vec3d(var5, var3, var7));
         var1.add(new Vec3d(var9, var3, var7));
         if (var7 != var11) {
            var1.add(new Vec3d(var5, var3, var11));
            var1.add(new Vec3d(var9, var3, var11));
            return var1;
         }
      } else if (var7 != var11) {
         var1.add(new Vec3d(var5, var3, var7));
         var1.add(new Vec3d(var5, var3, var11));
         return var1;
      }

      var1.add(entity.method_19538());
      return var1;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Vec3d) boolean
   public static boolean method_659(Vec3d vec3d1, Vec3d vec3d2) {
      return method_660(vec3d1, vec3d2);
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Vec3d) boolean
   public static boolean method_660(Vec3d vec3d1, Vec3d vec3d2) {
      BlockPos var2 = BlockPos.method_49638(vec3d1);
      BlockPos var3 = BlockPos.method_49637(vec3d2.field_1352, vec3d1.field_1351, vec3d2.field_1350);
      return var2.equals(var3);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Vec3d) float[]
   public static float[] method_661(Vec3d from, Vec3d to) {
      double var2 = to.field_1352 - from.field_1352;
      double var4 = (to.field_1351 - from.field_1351) * -1.0;
      double var6 = to.field_1350 - from.field_1350;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      return new float[]{
         (float)MathHelper.method_15338(Math.toDegrees(Math.atan2(var6, var2)) - 90.0), (float)MathHelper.method_15338(Math.toDegrees(Math.atan2(var4, var8)))
      };
   }
}
