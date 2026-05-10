package Dev.ZWare.Client.pkg1;

import java.util.UUID;
import net.minecraft.entity.player.PlayerEntity;

public final class Class12 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   private Class12() {
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.pkg1.Class12$Inner1
   public static Class12.Inner1 method_1239(PlayerEntity player) {
      return player == null ? Class12.Inner1.NONE : method_1240(player.method_5667(), player.method_7334().getName());
   }

   // $VF: renamed from: a (java.util.UUID, java.lang.String) Dev.ZWare.Client.pkg1.Class12$Inner1
   public static Class12.Inner1 method_1240(UUID uuid, String name) {
      if (a.field_1724 != null) {
         if (uuid != null && uuid.equals(a.field_1724.method_5667())) {
            return Class12.Inner1.SELF;
         }

         if (name != null && name.equalsIgnoreCase(a.field_1724.method_7334().getName())) {
            return Class12.Inner1.SELF;
         }
      }

      if (name != null && Dev.ZWare.Client.Class1.field_310 != null && Dev.ZWare.Client.Class1.field_310.method_376(name)) {
         return Class12.Inner1.FRIEND;
      } else {
         return name != null && Dev.ZWare.Client.Class1.field_311 != null && Dev.ZWare.Client.Class1.field_311.method_208(name)
            ? Class12.Inner1.ENEMY
            : Class12.Inner1.NONE;
      }
   }

   public static enum Inner1 {
      SELF,
      FRIEND,
      ENEMY,
      NONE;
   }
}
