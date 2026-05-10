package Dev.ZWare.Client.pkg1.pkg6.pkg3;

import java.util.Objects;
import net.minecraft.block.enums.NoteBlockInstrument;

public class Class1 {
   // $VF: renamed from: a net.minecraft.block.enums.NoteBlockInstrument
   private NoteBlockInstrument field_44;
   // $VF: renamed from: b int
   private int field_45;

   public Class1(NoteBlockInstrument instrument, int noteLevel) {
      this.field_44 = instrument;
      this.field_45 = noteLevel;
   }

   // $VF: renamed from: a () net.minecraft.block.enums.NoteBlockInstrument
   public NoteBlockInstrument method_104() {
      return this.field_44;
   }

   // $VF: renamed from: a (net.minecraft.block.enums.NoteBlockInstrument) void
   public void method_105(NoteBlockInstrument instrument) {
      this.field_44 = instrument;
   }

   // $VF: renamed from: a () int
   public int method_106() {
      return this.field_45;
   }

   // $VF: renamed from: a (int) void
   public void method_107(int noteLevel) {
      this.field_45 = noteLevel;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else {
         return !(o instanceof Class1 var2) ? false : this.field_45 == var2.field_45 && this.field_44 == var2.field_44;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field_44, this.field_45);
   }

   @Override
   public String toString() {
      return "Note{instrument=" + this.field_44 + ", noteLevel=" + this.field_45 + "}";
   }
}
