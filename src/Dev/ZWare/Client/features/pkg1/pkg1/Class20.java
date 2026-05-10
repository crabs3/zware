package Dev.ZWare.Client.features.pkg1.pkg1;

import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Class20 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o Dev.ZWare.Client.features.pkg1.pkg1.Class20
   private static Class20 field_2104;
   // $VF: renamed from: p Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2105 = this.a("Social", true);
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2106 = this.a("Highlight Name", true);
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class20.Inner1> field_2107 = this.a("Whisper Sound", Class20.Inner1.None);
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class20.Inner1> field_2108 = this.a("Mention Sound", Class20.Inner1.None);

   public Class20() {
      super("ChatUtils", "Utilities for chat interactions", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, true);
      field_2104 = this;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg1.Class20
   public static Class20 method_2734() {
      if (field_2104 == null) {
         field_2104 = new Class20();
      }

      return field_2104;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class10) void
   @iFT13zrx_wTXP
   public void method_2735(Dev.ZWare.Client.pkg2.pkg1.Class10 event) {
      if (c.field_1724 != null && !this.e()) {
         Text var2 = event.method_1049();
         String var3 = var2.getString();
         String var4 = var3.toLowerCase();
         String var5 = "ZWare".toLowerCase();
         if (var4.contains(var5)) {
            int var6 = var4.indexOf(var5);
            if (var6 < 10) {
               return;
            }
         }

         String var14 = c.field_1724.method_5477().getString();
         boolean var7 = var4.contains("whispers to you") || var4.contains("whispers:") || var4.contains("you whisper to");
         if (this.field_2107.method_671() != Class20.Inner1.None && var7) {
            this.method_2740(this.field_2107.method_671());
         }

         if (this.field_2108.method_671() != Class20.Inner1.None && var4.contains(var14.toLowerCase())) {
            this.method_2740(this.field_2108.method_671());
         }

         if (!var7) {
            Text var8 = var2;
            boolean var9 = false;
            if (this.field_2105.method_671()) {
               List var10 = Dev.ZWare.Client.Class1.field_310.method_380();
               List var11 = Dev.ZWare.Client.Class1.field_311.method_212();

               for (String var13 : var10) {
                  if (var13 != null && !var13.isEmpty() && this.method_2739(var3, var13)) {
                     var8 = this.method_2736(var2, -11141121);
                     var9 = true;
                     break;
                  }
               }

               if (!var9) {
                  for (String var17 : var11) {
                     if (var17 != null && !var17.isEmpty() && this.method_2739(var3, var17)) {
                        var8 = this.method_2736(var8, -48060);
                        var9 = true;
                        break;
                     }
                  }
               }
            }

            if (!var9 && this.field_2105.method_671()) {
               Text var15 = this.method_2737(var8);
               if (var15 != var8) {
                  var8 = var15;
               }
            }

            if (this.field_2106.method_671() && var8.getString().toLowerCase().contains(var14.toLowerCase())) {
               var8 = this.method_2738(var8, var14, Formatting.field_1075);
            }

            if (var8 != var2) {
               event.method_1050(var8);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.text.Text, int) net.minecraft.text.Text
   private Text method_2736(Text var1, int var2) {
      MutableText var3 = var1.method_27662().method_10862(var1.method_10866().method_36139(var2));

      for (Text var5 : var1.method_10855()) {
         var3.method_10852(this.method_2736(var5, var2));
      }

      return var3;
   }

   // $VF: renamed from: a (net.minecraft.text.Text) net.minecraft.text.Text
   private Text method_2737(Text var1) {
      String var2 = var1.getString();
      List var3 = Dev.ZWare.Client.Class1.field_310.method_380();
      List var4 = Dev.ZWare.Client.Class1.field_311.method_212();
      if (var3.isEmpty() && var4.isEmpty()) {
         return var1;
      } else {
         StringBuilder var5 = new StringBuilder();
         boolean var6 = true;

         for (String var8 : var3) {
            if (var8 != null && !var8.isEmpty()) {
               if (!var6) {
                  var5.append("|");
               }

               var5.append("\\b").append(Pattern.quote(var8)).append("\\b");
               var6 = false;
            }
         }

         for (String var17 : var4) {
            if (var17 != null && !var17.isEmpty()) {
               if (!var6) {
                  var5.append("|");
               }

               var5.append("\\b").append(Pattern.quote(var17)).append("\\b");
               var6 = false;
            }
         }

         if (var5.length() == 0) {
            return var1;
         } else {
            Pattern var16 = Pattern.compile(var5.toString(), 2);
            Matcher var18 = var16.matcher(var2);
            MutableText var9 = Text.method_43473();
            int var10 = 0;
            boolean var11 = false;

            Style var12;
            for (var12 = var1.method_10866(); var18.find(); var10 = var18.end()) {
               var11 = true;
               String var13 = var2.substring(var10, var18.start());
               if (!var13.isEmpty()) {
                  var9.method_10852(Text.method_43470(var13).method_10862(var12));
               }

               String var14 = var18.group();
               if (Dev.ZWare.Client.Class1.field_310.method_376(var14)) {
                  var9.method_10852(Text.method_43470(var14).method_10862(var12.method_36139(-11141121)));
               } else if (Dev.ZWare.Client.Class1.field_311.method_208(var14)) {
                  var9.method_10852(Text.method_43470(var14).method_10862(var12.method_36139(-48060)));
               } else {
                  var9.method_10852(Text.method_43470(var14).method_10862(var12));
               }
            }

            if (!var11) {
               return var1;
            } else {
               String var19 = var2.substring(var10);
               if (!var19.isEmpty()) {
                  var9.method_10852(Text.method_43470(var19).method_10862(var12));
               }

               return var9.method_10862(var12);
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.text.Text, java.lang.String, net.minecraft.util.Formatting) net.minecraft.text.Text
   private Text method_2738(Text var1, String var2, Formatting var3) {
      String var4 = var1.getString();
      if (!var4.toLowerCase().contains(var2.toLowerCase())) {
         return var1;
      } else {
         Pattern var5 = Pattern.compile(Pattern.quote(var2), 2);
         Matcher var6 = var5.matcher(var4);
         MutableText var7 = Text.method_43473();
         int var8 = 0;
         boolean var9 = false;

         Style var10;
         for (var10 = var1.method_10866(); var6.find(); var8 = var6.end()) {
            var9 = true;
            String var11 = var4.substring(var8, var6.start());
            if (!var11.isEmpty()) {
               var7.method_10852(Text.method_43470(var11).method_10862(var10));
            }

            var7.method_10852(Text.method_43470(var6.group()).method_10862(var10.method_36139(-11141121)));
         }

         if (!var9) {
            return var1;
         } else {
            String var12 = var4.substring(var8);
            if (!var12.isEmpty()) {
               var7.method_10852(Text.method_43470(var12).method_10862(var10));
            }

            return var7.method_10862(var10);
         }
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) boolean
   private boolean method_2739(String var1, String var2) {
      if (var1 != null && var2 != null && !var2.isEmpty()) {
         String var3 = var1.toLowerCase();
         String var4 = var2.toLowerCase();
         if (var3.contains("entered visual range")
            || var3.contains("left visual range")
            || var3.contains("вошел в зону видимости")
            || var3.contains("вышел из зоны видимости")) {
            return false;
         } else if (var3.contains("whispers to you") || var3.contains("whispers:")) {
            return false;
         } else if (!var3.contains("joined the game") && !var3.contains("left the game") && !var3.contains("зашел в игру") && !var3.contains("вышел из игры")) {
            int var5 = var3.indexOf(var4);
            return var5 != -1 && var5 < 30;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class20$Inner1) void
   private void method_2740(Class20.Inner1 var1) {
      if (var1 != Class20.Inner1.None) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class4 var2 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
         if (var2 != null) {
            switch (var1) {
               case Twitter:
                  var2.method_1941();
                  break;
               case field_630:
                  var2.method_1942();
                  break;
               case field_631:
                  var2.method_1943();
                  break;
               case Google:
                  var2.method_1944();
                  break;
               case Undertale:
                  var2.method_1945();
                  break;
               case Samsung:
                  var2.method_1946();
            }
         }
      }
   }

   public static enum Inner1 {
      None,
      Twitter,
      // $VF: renamed from: GTA Dev.ZWare.Client.features.pkg1.pkg1.Class20$Inner1
      field_630,
      // $VF: renamed from: F1 Dev.ZWare.Client.features.pkg1.pkg1.Class20$Inner1
      field_631,
      Google,
      Undertale,
      Samsung;
   }
}
