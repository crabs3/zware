package Dev.ZWare.Client.pkg1.pkg6.pkg2;

import Dev.ZWare.Client.features.pkg1.pkg1.Class9;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.minecraft.block.enums.NoteBlockInstrument;

public class Class2 extends Class3 {
   // $VF: renamed from: a int
   public static final int field_186 = 33;

   // $VF: renamed from: a (java.io.File, Dev.ZWare.Client.features.pkg1.pkg1.Class9) Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2
   @Override
   public Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 method_392(File file, Class9 notebot) throws Exception {
      Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 var4;
      try (FileInputStream var3 = new FileInputStream(file)) {
         var4 = this.method_393(var3);
      }

      return var4;
   }

   // $VF: renamed from: a (java.io.InputStream) Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2
   private Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 method_393(InputStream var1) throws Exception {
      ListMultimap var2 = MultimapBuilder.linkedHashKeys().arrayListValues().build();
      DataInputStream var3 = new DataInputStream(var1);
      short var4 = method_394(var3);
      int var5 = 0;
      if (var4 == 0) {
         var5 = var3.readUnsignedByte();
         var3.readUnsignedByte();
         if (var5 >= 3) {
            var4 = method_394(var3);
         }
      }

      method_394(var3);
      String var6 = method_396(var3);
      String var7 = method_396(var3);
      method_396(var3);
      method_396(var3);
      float var8 = method_394(var3) / 100.0F;
      var3.readBoolean();
      var3.readUnsignedByte();
      var3.readUnsignedByte();
      method_395(var3);
      method_395(var3);
      method_395(var3);
      method_395(var3);
      method_395(var3);
      method_396(var3);
      if (var5 >= 4) {
         var3.readUnsignedByte();
         var3.readUnsignedByte();
         method_394(var3);
      }

      if (var8 <= 0.0F) {
         var8 = 10.0F;
      }

      double var9 = -1.0;

      while (true) {
         short var11 = method_394(var3);
         if (var11 == 0) {
            return new Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2(var2, var6, var7);
         }

         var9 += var11 * (20.0F / var8);

         while (true) {
            short var12 = method_394(var3);
            if (var12 == 0) {
               break;
            }

            int var13 = var3.readUnsignedByte();
            int var14 = var3.readUnsignedByte();
            if (var5 >= 4) {
               var3.readUnsignedByte();
               var3.readUnsignedByte();
               method_394(var3);
            }

            NoteBlockInstrument var15 = method_397(var13);
            if (var15 != null) {
               var2.put((int)Math.round(var9), new Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1(var15, var14 - 33));
            }
         }
      }
   }

   // $VF: renamed from: a (java.io.DataInputStream) short
   private static short method_394(DataInputStream var0) throws IOException {
      int var1 = var0.readUnsignedByte();
      int var2 = var0.readUnsignedByte();
      return (short)(var1 + (var2 << 8));
   }

   // $VF: renamed from: a (java.io.DataInputStream) int
   private static int method_395(DataInputStream var0) throws IOException {
      int var1 = var0.readUnsignedByte();
      int var2 = var0.readUnsignedByte();
      int var3 = var0.readUnsignedByte();
      int var4 = var0.readUnsignedByte();
      return var1 + (var2 << 8) + (var3 << 16) + (var4 << 24);
   }

   // $VF: renamed from: a (java.io.DataInputStream) java.lang.String
   private static String method_396(DataInputStream var0) throws IOException {
      int var1 = method_395(var0);
      if (var1 < 0) {
         throw new EOFException("Length can't be negative: " + var1);
      } else if (var1 > var0.available()) {
         throw new EOFException("String length exceeds readable bytes.");
      } else {
         StringBuilder var2;
         for (var2 = new StringBuilder(var1); var1 > 0; var1--) {
            char var3 = (char)var0.readByte();
            if (var3 == '\r') {
               var3 = ' ';
            }

            var2.append(var3);
         }

         return var2.toString();
      }
   }

   // $VF: renamed from: a (int) net.minecraft.block.enums.NoteBlockInstrument
   private static NoteBlockInstrument method_397(int var0) {
      return switch (var0) {
         case 0 -> NoteBlockInstrument.field_12648;
         case 1 -> NoteBlockInstrument.field_12651;
         case 2 -> NoteBlockInstrument.field_12653;
         case 3 -> NoteBlockInstrument.field_12643;
         case 4 -> NoteBlockInstrument.field_12645;
         case 5 -> NoteBlockInstrument.field_12654;
         case 6 -> NoteBlockInstrument.field_12650;
         case 7 -> NoteBlockInstrument.field_12644;
         case 8 -> NoteBlockInstrument.field_12647;
         case 9 -> NoteBlockInstrument.field_12655;
         case 10 -> NoteBlockInstrument.field_18284;
         case 11 -> NoteBlockInstrument.field_18285;
         case 12 -> NoteBlockInstrument.field_18286;
         case 13 -> NoteBlockInstrument.field_18287;
         case 14 -> NoteBlockInstrument.field_18288;
         case 15 -> NoteBlockInstrument.field_18289;
         default -> null;
      };
   }
}
