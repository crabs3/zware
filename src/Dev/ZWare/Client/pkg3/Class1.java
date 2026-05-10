package Dev.ZWare.Client.pkg3;

public final class Class1 {
   private Class1() {
   }

   // $VF: renamed from: b (int, int) int
   public static int method_1018(int value, int salt) {
      return Integer.rotateLeft(value ^ 1515870810, 7) ^ salt;
   }
}
