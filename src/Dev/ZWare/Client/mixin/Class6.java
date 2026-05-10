package Dev.ZWare.Client.mixin;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerListHud.class})
public class Class6 {
   @Shadow
   @Final
   private MinecraftClient field_2155;
   @Shadow
   @Final
   private static Comparator<PlayerListEntry> field_2156;

   @Inject(
      method = {"collectPlayerEntries"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void filterPlayerListEntries(CallbackInfoReturnable<List<PlayerListEntry>> var1) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class17 var2 = Dev.ZWare.Client.features.pkg1.pkg5.Class17.method_2576();
      if (var2 != null && var2.method_2579() && this.field_2155.field_1724 != null && this.field_2155.field_1724.field_3944 != null) {
         List var3 = this.field_2155.field_1724.field_3944.method_45732().stream().sorted(field_2156).toList();
         ArrayList var4 = new ArrayList();

         for (PlayerListEntry var6 : var3) {
            if (var6 != null) {
               GameProfile var7 = var6.method_2966();
               Dev.ZWare.Client.pkg1.Class12.Inner1 var8 = Dev.ZWare.Client.pkg1.Class12.method_1240(var7.getId(), var7.getName());
               if (var2.method_2578(var8)) {
                  var4.add(var6);
               }
            }
         }

         var1.setReturnValue(var4);
      }
   }

   @Inject(
      method = {"getPlayerName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void colorPlayerListName(PlayerListEntry var1, CallbackInfoReturnable<Text> var2) {
      Dev.ZWare.Client.features.pkg1.pkg5.Class17 var3 = Dev.ZWare.Client.features.pkg1.pkg5.Class17.method_2576();
      if (var3 != null && !var3.e() && var2.getReturnValue() != null) {
         GameProfile var4 = var1.method_2966();
         Dev.ZWare.Client.pkg1.Class12.Inner1 var5 = Dev.ZWare.Client.pkg1.Class12.method_1240(var4.getId(), var4.getName());
         if (var3.method_2577(var5)) {
            var2.setReturnValue(
               ((Text)var2.getReturnValue()).method_27661().method_27694(var2x -> var2x.method_27703(TextColor.method_27717(var3.method_2580(var5))))
            );
         }
      }
   }
}
