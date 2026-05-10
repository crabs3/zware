package Dev.ZWare.Client.features.pkg1.pkg3;

import java.util.Locale;
import java.util.Set;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

record Class10(
   long ay,
   int az,
   Vec3d aA,
   BlockPos aB,
   double aC,
   double aD,
   double aE,
   boolean aF,
   Difficulty aG,
   boolean aH,
   World aI,
   Class10.Inner2[] aJ,
   BlockPos[] aK,
   Set<BlockPos> aL
) {
   // $VF: renamed from: ay long
   private final long field_887;
   // $VF: renamed from: az int
   private final int field_888;
   // $VF: renamed from: aA net.minecraft.util.math.Vec3d
   private final Vec3d field_889;
   // $VF: renamed from: aB net.minecraft.util.math.BlockPos
   private final BlockPos field_890;
   // $VF: renamed from: aC double
   private final double field_891;
   // $VF: renamed from: aD double
   private final double field_892;
   // $VF: renamed from: aE double
   private final double field_893;
   // $VF: renamed from: aF boolean
   private final boolean field_894;
   // $VF: renamed from: aG net.minecraft.world.Difficulty
   private final Difficulty field_895;
   // $VF: renamed from: aH boolean
   private final boolean field_896;
   // $VF: renamed from: aI net.minecraft.world.World
   private final World field_897;
   // $VF: renamed from: aJ Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2[]
   private final Class10.Inner2[] field_898;
   // $VF: renamed from: aK net.minecraft.util.math.BlockPos[]
   private final BlockPos[] field_899;
   // $VF: renamed from: aL java.util.Set
   private final Set<BlockPos> field_900;

   Class10(
      long ay,
      int az,
      Vec3d aA,
      BlockPos aB,
      double aC,
      double aD,
      double aE,
      boolean aF,
      Difficulty aG,
      boolean aH,
      World aI,
      Class10.Inner2[] aJ,
      BlockPos[] aK,
      Set<BlockPos> aL
   ) {
      this.field_887 = ay;
      this.field_888 = az;
      this.field_889 = aA;
      this.field_890 = aB;
      this.field_891 = aC;
      this.field_892 = aD;
      this.field_893 = aE;
      this.field_894 = aF;
      this.field_895 = aG;
      this.field_896 = aH;
      this.field_897 = aI;
      this.field_898 = aJ;
      this.field_899 = aK;
      this.field_900 = aL;
   }

   // $VF: renamed from: ay () long
   public long method_1414() {
      return this.field_887;
   }

   // $VF: renamed from: az () int
   public int method_1415() {
      return this.field_888;
   }

   // $VF: renamed from: aA () net.minecraft.util.math.Vec3d
   public Vec3d method_1416() {
      return this.field_889;
   }

   // $VF: renamed from: aB () net.minecraft.util.math.BlockPos
   public BlockPos method_1417() {
      return this.field_890;
   }

   // $VF: renamed from: aC () double
   public double method_1418() {
      return this.field_891;
   }

   // $VF: renamed from: aD () double
   public double method_1419() {
      return this.field_892;
   }

   // $VF: renamed from: aE () double
   public double method_1420() {
      return this.field_893;
   }

   // $VF: renamed from: aF () boolean
   public boolean method_1421() {
      return this.field_894;
   }

   // $VF: renamed from: aG () net.minecraft.world.Difficulty
   public Difficulty method_1422() {
      return this.field_895;
   }

   // $VF: renamed from: aH () boolean
   public boolean method_1423() {
      return this.field_896;
   }

   // $VF: renamed from: aI () net.minecraft.world.World
   public World method_1424() {
      return this.field_897;
   }

   // $VF: renamed from: aJ () Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2[]
   public Class10.Inner2[] method_1425() {
      return this.field_898;
   }

   // $VF: renamed from: aK () net.minecraft.util.math.BlockPos[]
   public BlockPos[] method_1426() {
      return this.field_899;
   }

   // $VF: renamed from: aL () java.util.Set
   public Set<BlockPos> method_1427() {
      return this.field_900;
   }

   static final class Inner1 {
      // $VF: renamed from: a long
      final long field_197;
      // $VF: renamed from: b long
      final long field_198 = System.nanoTime();
      // $VF: renamed from: c int
      int field_199;
      // $VF: renamed from: d int
      int field_200;
      // $VF: renamed from: e int
      int field_201;
      // $VF: renamed from: f int
      int field_202;
      // $VF: renamed from: g int
      int field_203;
      // $VF: renamed from: h int
      int field_204;
      // $VF: renamed from: i int
      int field_205;
      // $VF: renamed from: j int
      int field_206;
      // $VF: renamed from: k int
      int field_207;
      // $VF: renamed from: l int
      int field_208;
      // $VF: renamed from: m int
      int field_209;
      // $VF: renamed from: n int
      int field_210;

      Inner1(long var1) {
         this.field_197 = var1;
      }

      // $VF: renamed from: a (float) java.lang.String
      String method_426(float var1) {
         return String.format(
            Locale.US,
            "AsyncCalc tick=%d time=%.3fms | targets=%d/%d | cand=%d (blocked=%d base=%d air=%d pr=%d br=%d) | rej(min=%d self=%d pop=%d) | best=%d",
            this.field_197,
            var1,
            this.field_200,
            this.field_199,
            this.field_201,
            this.field_202,
            this.field_203,
            this.field_204,
            this.field_205,
            this.field_206,
            this.field_207,
            this.field_208,
            this.field_209,
            this.field_210
         );
      }
   }

   record Inner2(int aM, Vec3d aN, Box aO, float aP, float aQ, int aR, byte aS, int aT, int aU, float aV, float aW, boolean aX) {
      // $VF: renamed from: aM int
      private final int field_961;
      // $VF: renamed from: aN net.minecraft.util.math.Vec3d
      private final Vec3d field_962;
      // $VF: renamed from: aO net.minecraft.util.math.Box
      private final Box field_963;
      // $VF: renamed from: aP float
      private final float field_964;
      // $VF: renamed from: aQ float
      private final float field_965;
      // $VF: renamed from: aR int
      private final int field_966;
      // $VF: renamed from: aS byte
      private final byte field_967;
      // $VF: renamed from: aT int
      private final int field_968;
      // $VF: renamed from: aU int
      private final int field_969;
      // $VF: renamed from: aV float
      private final float field_970;
      // $VF: renamed from: aW float
      private final float field_971;
      // $VF: renamed from: aX boolean
      private final boolean field_972;

      Inner2(int aM, Vec3d aN, Box aO, float aP, float aQ, int aR, byte aS, int aT, int aU, float aV, float aW, boolean aX) {
         this.field_961 = aM;
         this.field_962 = aN;
         this.field_963 = aO;
         this.field_964 = aP;
         this.field_965 = aQ;
         this.field_966 = aR;
         this.field_967 = aS;
         this.field_968 = aT;
         this.field_969 = aU;
         this.field_970 = aV;
         this.field_971 = aW;
         this.field_972 = aX;
      }

      // $VF: renamed from: aM () int
      public int method_1492() {
         return this.field_961;
      }

      // $VF: renamed from: aN () net.minecraft.util.math.Vec3d
      public Vec3d method_1493() {
         return this.field_962;
      }

      // $VF: renamed from: aO () net.minecraft.util.math.Box
      public Box method_1494() {
         return this.field_963;
      }

      // $VF: renamed from: aP () float
      public float method_1495() {
         return this.field_964;
      }

      // $VF: renamed from: aQ () float
      public float method_1496() {
         return this.field_965;
      }

      // $VF: renamed from: aR () int
      public int method_1497() {
         return this.field_966;
      }

      // $VF: renamed from: aS () byte
      public byte method_1498() {
         return this.field_967;
      }

      // $VF: renamed from: aT () int
      public int method_1499() {
         return this.field_968;
      }

      // $VF: renamed from: aU () int
      public int method_1500() {
         return this.field_969;
      }

      // $VF: renamed from: aV () float
      public float method_1501() {
         return this.field_970;
      }

      // $VF: renamed from: aW () float
      public float method_1502() {
         return this.field_971;
      }

      // $VF: renamed from: aX () boolean
      public boolean method_1503() {
         return this.field_972;
      }
   }
}
