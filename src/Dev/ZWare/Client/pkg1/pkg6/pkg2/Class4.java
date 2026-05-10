package Dev.ZWare.Client.pkg1.pkg6.pkg2;

import Dev.ZWare.Client.features.pkg1.pkg1.Class9;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.block.enums.NoteBlockInstrument;

public final class Class4 {
   // $VF: renamed from: a java.util.Map
   private static final Map<String, Class3> field_277 = new HashMap<>();

   private Class4() {
   }

   // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.pkg1.pkg6.pkg2.Class3) void
   public static void method_574(String extension, Class3 songDecoder) {
      field_277.put(extension.toLowerCase(Locale.ROOT), songDecoder);
   }

   // $VF: renamed from: a (java.io.File) Dev.ZWare.Client.pkg1.pkg6.pkg2.Class3
   public static Class3 method_575(File file) {
      return field_277.get(method_580(file));
   }

   // $VF: renamed from: a (java.io.File) boolean
   public static boolean method_576(File file) {
      return field_277.containsKey(method_580(file));
   }

   // $VF: renamed from: a (java.nio.file.Path) boolean
   public static boolean method_577(Path path) {
      return path != null && method_576(path.toFile());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class9, java.io.File) Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2
   public static Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 method_578(Class9 notebot, File file) throws Exception {
      if (!method_576(file)) {
         throw new IllegalStateException("Decoder for this file does not exist.");
      } else {
         Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 var2 = method_575(file).method_392(file, notebot);
         method_581(var2, notebot);
         var2.method_274();
         return var2;
      }
   }

   // $VF: renamed from: a (java.io.File) java.lang.String
   public static String method_579(File file) {
      String var1 = file.getName();
      int var2 = var1.lastIndexOf(46);
      return var2 <= 0 ? var1 : var1.substring(0, var2);
   }

   // $VF: renamed from: b (java.io.File) java.lang.String
   private static String method_580(File var0) {
      String var1 = var0.getName();
      int var2 = var1.lastIndexOf(46);
      return var2 == -1 ? "" : var1.substring(var2 + 1).toLowerCase(Locale.ROOT);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2, Dev.ZWare.Client.features.pkg1.pkg1.Class9) void
   private static void method_581(Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 var0, Class9 var1) {
      Iterator var2 = var0.method_275().entries().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         int var4 = (Integer)var3.getKey();
         Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var5 = (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1)var3.getValue();
         int var6 = var5.method_106();
         if (var6 < 0 || var6 > 24) {
            if (!var1.field_1292.method_671()) {
               var1.method_1972("Note at tick %d is out of range.", var4);
               var2.remove();
               continue;
            }

            var5.method_107(var6 < 0 ? 0 : 24);
         }

         if (var1.field_1287.method_671() == Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments) {
            NoteBlockInstrument var7 = var1.method_1971(var5.method_104());
            if (var7 != null) {
               var5.method_105(var7);
            }
         } else {
            var5.method_105(null);
         }
      }
   }

   static {
      method_574("nbs", new Class2());
      method_574("txt", new Class1());
   }
}
