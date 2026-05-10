package Dev.ZWare.Client.pkg1.pkg1;

public class Class1 {
   // $VF: renamed from: a long
   private long field_288 = -1L;

   // $VF: renamed from: a (double) boolean
   public boolean method_610(double s) {
      return this.method_619(System.nanoTime() - this.field_288) >= (long)(s * 1000.0);
   }

   // $VF: renamed from: b (double) boolean
   public boolean method_611(double m) {
      return this.method_619(System.nanoTime() - this.field_288) >= (long)(m * 1000.0 * 60.0);
   }

   // $VF: renamed from: c (double) boolean
   public boolean method_612(double dms) {
      return this.method_619(System.nanoTime() - this.field_288) >= (long)(dms * 10.0);
   }

   // $VF: renamed from: d (double) boolean
   public boolean method_613(double ds) {
      return this.method_619(System.nanoTime() - this.field_288) >= (long)(ds * 100.0);
   }

   // $VF: renamed from: a (long) boolean
   public boolean method_614(long ms) {
      return this.method_619(System.nanoTime() - this.field_288) >= ms;
   }

   // $VF: renamed from: b (long) boolean
   public boolean method_615(long ns) {
      return System.nanoTime() - this.field_288 >= ns;
   }

   // $VF: renamed from: a (long) void
   public void method_616(long ms) {
      this.field_288 = System.nanoTime() - ms * 1000000L;
   }

   // $VF: renamed from: a () long
   public long method_617() {
      return this.method_619(System.nanoTime() - this.field_288);
   }

   // $VF: renamed from: a () void
   public void method_618() {
      this.field_288 = System.nanoTime();
   }

   // $VF: renamed from: a (long) long
   public long method_619(long time) {
      return time / 1000000L;
   }
}
