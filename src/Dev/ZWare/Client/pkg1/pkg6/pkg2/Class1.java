package Dev.ZWare.Client.pkg1.pkg6.pkg2;

import Dev.ZWare.Client.features.pkg1.pkg1.Class9;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.io.File;
import java.nio.file.Files;
import java.util.List;
import net.minecraft.block.enums.NoteBlockInstrument;

public class Class1 extends Class3 {
   // $VF: renamed from: a (java.io.File, Dev.ZWare.Client.features.pkg1.pkg1.Class9) Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2
   @Override
   public Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 method_392(File file, Class9 notebot) throws Exception {
      List var3 = Files.readAllLines(file.toPath());
      ListMultimap var4 = MultimapBuilder.linkedHashKeys().arrayListValues().build();
      String var5 = Class4.method_579(file);
      String var6 = "Unknown";

      for (int var7 = 0; var7 < var3.size(); var7++) {
         String var8 = (String)var3.get(var7);
         if (var8.startsWith("// Name: ")) {
            var5 = var8.substring(9);
         } else if (var8.startsWith("// Author: ")) {
            var6 = var8.substring(11);
         } else if (!var8.isBlank()) {
            String[] var9 = var8.split(":");
            if (var9.length < 2) {
               notebot.method_1972("Malformed line %d in %s", var7 + 1, file.getName());
            } else {
               int var12 = 0;

               int var10;
               int var11;
               try {
                  var10 = Integer.parseInt(var9[0]);
                  var11 = Integer.parseInt(var9[1]);
                  if (var9.length > 2) {
                     var12 = Integer.parseInt(var9[2]);
                  }
               } catch (NumberFormatException var14) {
                  notebot.method_1972("Invalid number at line %d in %s", var7 + 1, file.getName());
                  continue;
               }

               NoteBlockInstrument[] var13 = NoteBlockInstrument.values();
               if (var12 >= 0 && var12 < var13.length) {
                  var4.put(var10, new Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1(var13[var12], var11));
               } else {
                  notebot.method_1972("Invalid instrument at line %d in %s", var7 + 1, file.getName());
               }
            }
         }
      }

      return new Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2(var4, var5, var6);
   }
}
