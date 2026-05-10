package Dev.ZWare.Client.pkg1.pkg6.pkg1;

import net.minecraft.block.NoteBlock;
import net.minecraft.block.enums.NoteBlockInstrument;

public enum Class2 {
   BlockState((var0, var1) -> (NoteBlockInstrument)var0.method_11654(NoteBlock.field_11325)),
   BelowBlock(
      (var0, var1) -> Dev.ZWare.Client.features.Class1.field_1019.field_1687 != null
         ? Dev.ZWare.Client.features.Class1.field_1019.field_1687.method_8320(var1.method_10074()).method_51364()
         : (NoteBlockInstrument)var0.method_11654(NoteBlock.field_11325)
   );

   // $VF: renamed from: a Dev.ZWare.Client.pkg1.pkg6.pkg1.Class1
   private final Class1 field_696;

   private Class2(Class1 var3) {
      this.field_696 = var3;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg1.pkg6.pkg1.Class1
   public Class1 method_1207() {
      return this.field_696;
   }
}
