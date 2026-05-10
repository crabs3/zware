package Dev.ZWare.Client.features.pkg3;

import java.awt.Color;
import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import org.joml.Vector2f;

public class Class8<T> {
   // $VF: renamed from: a java.lang.String
   private final String field_342;
   // $VF: renamed from: b java.lang.Object
   private final T field_343;
   // $VF: renamed from: c java.lang.Object
   private T field_344;
   // $VF: renamed from: d java.lang.Object
   private T field_345;
   // $VF: renamed from: e java.lang.Object
   private T field_346;
   // $VF: renamed from: f java.lang.Object
   private T field_347;
   // $VF: renamed from: g boolean
   private boolean field_348;
   // $VF: renamed from: h java.util.function.Predicate
   private Predicate<T> field_349;
   // $VF: renamed from: i java.lang.String
   private String field_350;
   // $VF: renamed from: j java.lang.String
   private String field_351;
   // $VF: renamed from: k Dev.ZWare.Client.features.Class1
   private Dev.ZWare.Client.features.Class1 field_352;

   public Class8(String name, T defaultValue) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_345 = (T)defaultValue;
      this.field_350 = "";
   }

   public Class8(String name, T defaultValue, String description) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_345 = (T)defaultValue;
      this.field_350 = description;
   }

   public Class8(String name, T defaultValue, T min, T max, String description) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_346 = (T)min;
      this.field_347 = (T)max;
      this.field_345 = (T)defaultValue;
      this.field_350 = description;
      this.field_348 = true;
   }

   public Class8(String name, T defaultValue, T min, T max) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_346 = (T)min;
      this.field_347 = (T)max;
      this.field_345 = (T)defaultValue;
      this.field_350 = "";
      this.field_348 = true;
   }

   public Class8(String name, T defaultValue, T min, T max, Predicate<T> visibility, String description) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_346 = (T)min;
      this.field_347 = (T)max;
      this.field_345 = (T)defaultValue;
      this.field_349 = visibility;
      this.field_350 = description;
      this.field_348 = true;
   }

   public Class8(String name, T defaultValue, T min, T max, Predicate<T> visibility) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_346 = (T)min;
      this.field_347 = (T)max;
      this.field_345 = (T)defaultValue;
      this.field_349 = visibility;
      this.field_350 = "";
      this.field_348 = true;
   }

   public Class8(String name, T defaultValue, Predicate<T> visibility) {
      this.field_342 = name;
      this.field_343 = (T)defaultValue;
      this.field_344 = (T)defaultValue;
      this.field_349 = visibility;
      this.field_345 = (T)defaultValue;
   }

   // $VF: renamed from: a () java.lang.String
   public String method_670() {
      return this.field_342;
   }

   // $VF: renamed from: a () java.lang.Object
   public T method_671() {
      return this.field_344;
   }

   // $VF: renamed from: a (java.lang.Object) void
   public void method_672(T value) {
      this.method_675((T)value);
      if (this.field_348) {
         if (((Number)this.field_346).floatValue() > ((Number)value).floatValue()) {
            this.method_675(this.field_346);
         }

         if (((Number)this.field_347).floatValue() < ((Number)value).floatValue()) {
            this.method_675(this.field_347);
         }
      }

      Dev.ZWare.Client.pkg2.pkg1.Class6 var2 = new Dev.ZWare.Client.pkg2.pkg1.Class6(this);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var2);
      if (!var2.a()) {
         this.field_344 = this.field_345;
      } else {
         this.field_345 = this.field_344;
      }
   }

   // $VF: renamed from: a () void
   public void method_673() {
      this.method_672(this.method_706());
   }

   // $VF: renamed from: b () java.lang.Object
   public T method_674() {
      return this.field_345;
   }

   // $VF: renamed from: b (java.lang.Object) void
   public void method_675(T value) {
      this.field_345 = (T)value;
   }

   // $VF: renamed from: c () java.lang.Object
   public T method_676() {
      return this.field_346;
   }

   // $VF: renamed from: c (java.lang.Object) void
   public void method_677(T min) {
      this.field_346 = (T)min;
   }

   // $VF: renamed from: d () java.lang.Object
   public T method_678() {
      return this.field_347;
   }

   // $VF: renamed from: d (java.lang.Object) void
   public void method_679(T max) {
      this.field_347 = (T)max;
   }

   // $VF: renamed from: e (java.lang.Object) void
   public void method_680(T value) {
      this.method_675((T)value);
      if (this.field_348) {
         if (((Number)this.field_346).floatValue() > ((Number)value).floatValue()) {
            this.method_675(this.field_346);
         }

         if (((Number)this.field_347).floatValue() < ((Number)value).floatValue()) {
            this.method_675(this.field_347);
         }
      }

      this.field_344 = this.field_345;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.Class1
   public Dev.ZWare.Client.features.Class1 method_681() {
      return this.field_352;
   }

   // $VF: renamed from: b () java.lang.String
   public String method_682() {
      return this.field_351;
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.features.pkg3.Class8
   public Class8<T> method_683(String section) {
      this.field_351 = section;
      return this;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.Class1) void
   public void method_684(Dev.ZWare.Client.features.Class1 feature) {
      this.field_352 = feature;
   }

   // $VF: renamed from: a (java.lang.String) int
   public int method_685(String input) {
      for (int var2 = 0; var2 < this.field_344.getClass().getEnumConstants().length; var2++) {
         Enum var3 = (Enum)this.field_344.getClass().getEnumConstants()[var2];
         if (var3.name().equalsIgnoreCase(input)) {
            return var2;
         }
      }

      return -1;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_686(String value) {
      for (Enum var5 : (Enum[])((Enum)this.field_344).getClass().getEnumConstants()) {
         if (var5.name().equalsIgnoreCase(value)) {
            this.field_344 = (T)var5;
         }
      }
   }

   // $VF: renamed from: c () java.lang.String
   public String method_687() {
      return Class2.method_3816((Enum)this.field_344);
   }

   // $VF: renamed from: a () int
   public int method_688() {
      return Class2.method_3814((Enum)this.field_344);
   }

   // $VF: renamed from: b () void
   public void method_689() {
      this.field_345 = (T)Class2.method_3815((Enum)this.field_344);
      Dev.ZWare.Client.pkg2.pkg1.Class6 var1 = new Dev.ZWare.Client.pkg2.pkg1.Class6(this);
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(var1);
      if (!var1.a()) {
         this.field_344 = this.field_345;
      } else {
         this.field_345 = this.field_344;
      }
   }

   // $VF: renamed from: c () void
   public void method_690() {
      this.field_344 = (T)Class2.method_3815((Enum)this.field_344);
   }

   // $VF: renamed from: d () java.lang.String
   public String method_691() {
      if (this.method_702()) {
         return "Targets";
      } else if (this.method_703()) {
         return "MultiSelect";
      } else if (this.method_704()) {
         return "BlockList";
      } else if (this.method_705()) {
         return "ItemList";
      } else if (this.method_697()) {
         return "Bind";
      } else if (this.method_695()) {
         return "Enum";
      } else if (this.method_698()) {
         return "Color";
      } else if (this.method_699()) {
         return "Block";
      } else if (this.method_700()) {
         return "Item";
      } else {
         return this.method_701() ? "Pos" : this.method_692(this.field_343);
      }
   }

   // $VF: renamed from: a (java.lang.Object) java.lang.String
   public <K> String method_692(K value) {
      return value.getClass().getSimpleName();
   }

   // $VF: renamed from: e () java.lang.String
   public String method_693() {
      return Objects.requireNonNullElse(this.field_350, "");
   }

   // $VF: renamed from: a () boolean
   public boolean method_694() {
      return this.field_344 instanceof Number;
   }

   // $VF: renamed from: b () boolean
   public boolean method_695() {
      return this.field_344 instanceof Enum;
   }

   // $VF: renamed from: c () boolean
   public boolean method_696() {
      return this.field_344 instanceof String;
   }

   // $VF: renamed from: d () boolean
   public boolean method_697() {
      return this.field_344 instanceof Class4;
   }

   // $VF: renamed from: e () boolean
   public boolean method_698() {
      return this.field_344 instanceof Color;
   }

   // $VF: renamed from: f () boolean
   public boolean method_699() {
      return this.field_344 instanceof Block;
   }

   // $VF: renamed from: g () boolean
   public boolean method_700() {
      return this.field_344 instanceof Item;
   }

   // $VF: renamed from: h () boolean
   public boolean method_701() {
      return this.field_344 instanceof Vector2f;
   }

   // $VF: renamed from: i () boolean
   public boolean method_702() {
      return this instanceof Class3;
   }

   // $VF: renamed from: j () boolean
   public boolean method_703() {
      return this instanceof Class6;
   }

   // $VF: renamed from: k () boolean
   public boolean method_704() {
      return this instanceof Class7;
   }

   // $VF: renamed from: l () boolean
   public boolean method_705() {
      return this instanceof Class1;
   }

   // $VF: renamed from: e () java.lang.Object
   public T method_706() {
      return this.field_343;
   }

   // $VF: renamed from: f () java.lang.String
   public String method_707() {
      return this.field_344.toString();
   }

   // $VF: renamed from: m () boolean
   public boolean method_708() {
      return this.field_348;
   }

   // $VF: renamed from: a (java.util.function.Predicate) void
   public void method_709(Predicate<T> visibility) {
      this.field_349 = visibility;
   }

   // $VF: renamed from: n () boolean
   public boolean method_710() {
      return this.field_349 == null || this.field_349.test(this.method_671());
   }
}
