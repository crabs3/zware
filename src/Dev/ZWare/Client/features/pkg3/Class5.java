package Dev.ZWare.Client.features.pkg3;

import java.awt.Color;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import org.joml.Vector2f;

public interface Class5 {
   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class8) Dev.ZWare.Client.features.pkg3.Class8
   <T extends Class8<?>> T method_2(T var1);

   // $VF: renamed from: a (java.lang.String, boolean) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Boolean> method_3(String name, boolean value) {
      return this.method_2(new Class8<>(name, value));
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Number, java.lang.Number, java.lang.Number) Dev.ZWare.Client.features.pkg3.Class8
   default <T extends Number> Class8<T> method_4(String name, T value, T min, T max) {
      return this.method_2(new Class8<>(name, (T)value, (T)min, (T)max));
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<String> method_5(String name, String value) {
      return this.method_2(new Class8<>(name, value));
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Enum) Dev.ZWare.Client.features.pkg3.Class8
   default <T extends Enum<?>> Class8<T> method_6(String name, T value) {
      return this.method_2(new Class8<>(name, (T)value));
   }

   // $VF: renamed from: a (java.lang.String, net.minecraft.block.Block) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Block> method_7(String name, Block value) {
      return this.method_2(new Class8<>(name, value));
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.features.pkg3.Class7
   default Class7 method_8(String name) {
      return this.method_2(new Class7(name));
   }

   // $VF: renamed from: a (java.lang.String) Dev.ZWare.Client.features.pkg3.Class1
   default Class1 method_9(String name) {
      return this.method_2(new Class1(name));
   }

   // $VF: renamed from: a (java.lang.String, net.minecraft.item.Item) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Item> method_10(String name, Item value) {
      return this.method_2(new Class8<>(name, value));
   }

   // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.features.pkg3.Class4) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Class4> method_11(String name, Class4 bind) {
      return this.method_2(new Class8<>(name, bind));
   }

   // $VF: renamed from: a (java.lang.String, java.awt.Color) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Color> method_12(String name, Color value) {
      return this.method_2(new Class8<>(name, value));
   }

   // $VF: renamed from: a (java.lang.String, int, int, int, int) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Color> method_13(String name, int r, int g, int b, int a) {
      return this.method_2(new Class8<>(name, new Color(r, g, b, a)));
   }

   // $VF: renamed from: a (java.lang.String, org.joml.Vector2f) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Vector2f> method_14(String name, Vector2f value) {
      return this.method_2(new Class8<>(name, value));
   }

   // $VF: renamed from: a (java.lang.String, float, float) Dev.ZWare.Client.features.pkg3.Class8
   default Class8<Vector2f> method_15(String name, float x, float y) {
      return this.method_2(new Class8<>(name, new Vector2f(x, y)));
   }
}
