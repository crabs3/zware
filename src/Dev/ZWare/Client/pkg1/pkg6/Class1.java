package Dev.ZWare.Client.pkg1.pkg6;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.BlockState;
import net.minecraft.block.NoteBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.util.math.BlockPos;

public final class Class1 {
   private Class1() {
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.util.math.BlockPos, Dev.ZWare.Client.pkg1.pkg6.Class1$Inner2, Dev.ZWare.Client.pkg1.pkg6.pkg1.Class1) Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1
   public static Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 method_1021(
      BlockState noteBlock, BlockPos blockPos, Class1.Inner2 mode, Dev.ZWare.Client.pkg1.pkg6.pkg1.Class1 instrumentDetectFunction
   ) {
      NoteBlockInstrument var4 = null;
      int var5 = (Integer)noteBlock.method_11654(NoteBlock.field_11324);
      if (mode == Class1.Inner2.ExactInstruments) {
         var4 = instrumentDetectFunction.method_0(noteBlock, blockPos);
      }

      return new Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1(var4, var5);
   }

   public static enum Inner1 {
      None(null),
      Harp(NoteBlockInstrument.field_12648),
      Basedrum(NoteBlockInstrument.field_12653),
      Snare(NoteBlockInstrument.field_12643),
      // $VF: renamed from: Hat Dev.ZWare.Client.pkg1.pkg6.Class1$Inner1
      field_700(NoteBlockInstrument.field_12645),
      Bass(NoteBlockInstrument.field_12651),
      Flute(NoteBlockInstrument.field_12650),
      Bell(NoteBlockInstrument.field_12644),
      Guitar(NoteBlockInstrument.field_12654),
      Chime(NoteBlockInstrument.field_12647),
      Xylophone(NoteBlockInstrument.field_12655),
      IronXylophone(NoteBlockInstrument.field_18284),
      CowBell(NoteBlockInstrument.field_18285),
      Didgeridoo(NoteBlockInstrument.field_18286),
      // $VF: renamed from: Bit Dev.ZWare.Client.pkg1.pkg6.Class1$Inner1
      field_701(NoteBlockInstrument.field_18287),
      Banjo(NoteBlockInstrument.field_18288),
      Pling(NoteBlockInstrument.field_18289);

      // $VF: renamed from: a java.util.Map
      private static final Map<NoteBlockInstrument, Class1.Inner1> field_702 = new HashMap<>();
      // $VF: renamed from: b net.minecraft.block.enums.NoteBlockInstrument
      private final NoteBlockInstrument field_703;

      private Inner1(NoteBlockInstrument var3) {
         this.field_703 = var3;
      }

      // $VF: renamed from: a () net.minecraft.block.enums.NoteBlockInstrument
      public NoteBlockInstrument method_1211() {
         return this.field_703;
      }

      // $VF: renamed from: a (net.minecraft.block.enums.NoteBlockInstrument) Dev.ZWare.Client.pkg1.pkg6.Class1$Inner1
      public static Class1.Inner1 method_1212(NoteBlockInstrument instrument) {
         return instrument != null ? field_702.get(instrument) : null;
      }

      static {
         for (Class1.Inner1 var3 : values()) {
            field_702.put(var3.field_703, var3);
         }
      }
   }

   public static enum Inner2 {
      AnyInstrument,
      ExactInstruments;
   }
}
