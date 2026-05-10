package Dev.ZWare.Client.pkg1;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.text.Text;

public final class Class1 {
   private Class1() {
   }

   // $VF: renamed from: a (java.lang.String) boolean
   public static boolean method_69(String reason) {
      MinecraftClient var1 = MinecraftClient.method_1551();
      if (var1 == null) {
         return false;
      } else {
         ClientPlayNetworkHandler var2 = var1.method_1562();
         if (var1.field_1724 != null && var1.field_1687 != null && var2 != null) {
            var2.method_48296().method_10747(Text.method_43470(reason));
            return true;
         } else {
            return false;
         }
      }
   }
}
