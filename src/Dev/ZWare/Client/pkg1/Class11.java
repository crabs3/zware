package Dev.ZWare.Client.pkg1;

import net.minecraft.text.MutableText;
import odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.n9_xu2mVcD5qQGEgbxT0cQyRf98mx;
import odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.irN71JBTa7RNQjUjj_RJI9.wz4SYN86TQdqlxogQkF_J;

public final class Class11 {
   // $VF: renamed from: a odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.n9_xu2mVcD5qQGEgbxT0cQyRf98mx
   private static n9_xu2mVcD5qQGEgbxT0cQyRf98mx<MutableText> field_145;

   private Class11() {
      throw new AssertionError("Can't create an instance of utility class");
   }

   // $VF: renamed from: a () void
   public static void method_289() {
      if (field_145 != null) {
         throw new IllegalStateException("Formatter is already initialized");
      } else {
         field_145 = new wz4SYN86TQdqlxogQkF_J(true);
         method_291();
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) net.minecraft.text.MutableText
   public static MutableText method_290(String content, Object... obj) {
      return obj != null && obj.length != 0 ? (MutableText)field_145.a(content, obj) : (MutableText)field_145.a(content);
   }

   // $VF: renamed from: b () void
   private static void method_291() {
      field_145.a("global", () -> Dev.ZWare.Client.Class1.field_296.method_494());
   }
}
