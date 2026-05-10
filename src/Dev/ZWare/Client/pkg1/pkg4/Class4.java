package Dev.ZWare.Client.pkg1.pkg4;

public final class Class4 {
   // $VF: renamed from: a int[]
   private static final int[] field_21 = new int[]{90, 23, 57, 100, 13, 114, 33, 75, 51};
   // $VF: renamed from: b int[][]
   private static final int[][] field_22 = new int[][]{
      {50, 96, 75, 29, 114, 71, 28, 113, 81, 54, 104},
      {23, 94, 123, 114, 12, 69, 120, 102, 72, 47, 124},
      {87, 100, 63, 85, 56, 125, 124, 30, 43, 113, 71},
      {79, 38, 74, 39, 40, 73, 22, 97}
   };

   private Class4() {
   }

   // $VF: renamed from: a () java.lang.String
   public static String method_64() {
      StringBuilder var0 = new StringBuilder(41);

      for (int var1 = 0; var1 < field_22.length; var1++) {
         int[] var2 = field_22[var1];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var0.append((char)method_65(var2[var3], var1, var3));
         }
      }

      return var0.toString();
   }

   // $VF: renamed from: a (int, int, int) int
   private static int method_65(int var0, int var1, int var2) {
      return var0 ^ field_21[(var2 + var1 * 5) % field_21.length] ^ var1 * 23 + var2 * 3 & 63;
   }
}
