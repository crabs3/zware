package Dev.ZWare.Client.pkg4;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Class20 extends Dev.ZWare.Client.features.Class1 {
   // $VF: renamed from: f float[]
   private final float[] field_1048 = new float[10];
   // $VF: renamed from: g java.text.DecimalFormat
   private final DecimalFormat field_1049 = new DecimalFormat("##.00#");
   // $VF: renamed from: h Dev.ZWare.Client.pkg1.pkg1.Class1
   private final Dev.ZWare.Client.pkg1.pkg1.Class1 field_1050 = new Dev.ZWare.Client.pkg1.pkg1.Class1();
   // $VF: renamed from: i float
   private float field_1051 = 20.0F;
   // $VF: renamed from: j float
   private float field_1052 = 20.0F;
   // $VF: renamed from: k long
   private long field_1053 = -1L;
   // $VF: renamed from: l java.lang.String
   private String field_1054 = "";

   // $VF: renamed from: c () void
   public void method_1636() {
      this.field_1050.method_618();
   }

   // $VF: renamed from: a () boolean
   public boolean method_1637() {
      return this.field_1050.method_614(2000L);
   }

   // $VF: renamed from: a () long
   public long method_1638() {
      return this.field_1050.method_617();
   }

   // $VF: renamed from: d () void
   public void method_1639() {
      long var2 = System.currentTimeMillis();
      if (this.field_1053 == -1L) {
         this.field_1053 = var2;
      } else {
         long var4 = var2 - this.field_1053;
         float var6 = (float)var4 / 20.0F;
         if (var6 == 0.0F) {
            var6 = 50.0F;
         }

         float var1;
         if ((var1 = 1000.0F / var6) > 20.0F) {
            var1 = 20.0F;
         }

         this.field_1052 = Float.parseFloat(this.field_1049.format(var1).replace(",", "."));
         System.arraycopy(this.field_1048, 0, this.field_1048, 1, this.field_1048.length - 1);
         this.field_1048[0] = var1;
         double var7 = 0.0;

         for (float var12 : this.field_1048) {
            var7 += var12;
         }

         if ((var7 = var7 / this.field_1048.length) > 20.0) {
            var7 = 20.0;
         }

         this.field_1051 = Float.parseFloat(this.field_1049.format(var7).replace(",", "."));
         this.field_1053 = var2;
      }
   }

   // $VF: renamed from: a () void
   @Override
   public void method_1561() {
      Arrays.fill(this.field_1048, 20.0F);
      this.field_1051 = 20.0F;
      this.field_1052 = 20.0F;
   }

   // $VF: renamed from: a () float
   public float method_1640() {
      return 20.0F / this.field_1051;
   }

   // $VF: renamed from: b () float
   public float method_1641() {
      return this.field_1051;
   }

   // $VF: renamed from: c () float
   public float method_1642() {
      return this.field_1052;
   }

   // $VF: renamed from: d () float
   public float method_1643() {
      return this.field_1051;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_1644() {
      return this.field_1054;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_1645(String brand) {
      this.field_1054 = brand;
   }

   // $VF: renamed from: a () int
   public int method_1646() {
      if (g()) {
         return 0;
      } else {
         try {
            return c.method_1562().method_2874(c.field_1724.method_7334().getName()).method_2959();
         } catch (Throwable var2) {
            return 0;
         }
      }
   }
}
