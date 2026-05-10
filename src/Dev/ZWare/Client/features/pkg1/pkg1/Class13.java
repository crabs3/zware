package Dev.ZWare.Client.features.pkg1.pkg1;

public class Class13 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class13.Inner1> field_2370 = this.a("Mode", Class13.Inner1.PacketKick);

   public Class13() {
      super("Illegal Disconnect", "makes you disconnect in illegal ways", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, false, false, false);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.method_3017("IllegalDisconnect");
      if (this.d()) {
         this.k();
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return this.field_2370.method_671().name();
   }

   // $VF: renamed from: a (java.lang.String) boolean
   public boolean method_3017(String source) {
      return method_3018(this.field_2370.method_671(), source);
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class13$Inner1, java.lang.String) boolean
   public static boolean method_3018(Class13.Inner1 mode, String source) {
      String var2 = switch (mode) {
         case PacketKick -> source + " [PacketKick]";
         case IllegalCharacters -> source + " [IllegalCharacters]";
      };
      return Dev.ZWare.Client.pkg1.Class1.method_69(var2);
   }

   public static enum Inner1 {
      PacketKick,
      IllegalCharacters;
   }
}
