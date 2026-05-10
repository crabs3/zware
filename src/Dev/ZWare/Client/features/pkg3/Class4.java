package Dev.ZWare.Client.features.pkg3;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class Class4 implements Dev.ZWare.Client.pkg1.pkg5.Class1 {
   // $VF: renamed from: c int
   public static final int field_211 = -1;
   // $VF: renamed from: d int
   private static final int field_212 = 1000;
   // $VF: renamed from: e int
   private int field_213;

   public Class4(int key) {
      this.field_213 = key;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg3.Class4
   public static Class4 method_427() {
      return new Class4(-1);
   }

   // $VF: renamed from: a (int) Dev.ZWare.Client.features.pkg3.Class4
   public static Class4 method_428(int button) {
      return new Class4(1000 + button);
   }

   // $VF: renamed from: a (int) boolean
   public static boolean method_429(int button) {
      return button >= 0 && button != 0 && button != 1;
   }

   // $VF: renamed from: a () int
   public int method_430() {
      return this.field_213;
   }

   // $VF: renamed from: a (int) void
   public void method_431(int key) {
      this.field_213 = key;
   }

   // $VF: renamed from: a () boolean
   public boolean method_432() {
      return this.field_213 == -1;
   }

   // $VF: renamed from: b () boolean
   public boolean method_433() {
      return this.field_213 >= 1000;
   }

   // $VF: renamed from: b () int
   public int method_434() {
      return this.method_433() ? this.field_213 - 1000 : -1;
   }

   // $VF: renamed from: a (com.google.gson.JsonElement) Dev.ZWare.Client.features.pkg3.Class4
   public static Class4 method_435(JsonElement element) {
      if (element != null && !element.isJsonNull()) {
         try {
            return new Class4(element.getAsInt());
         } catch (Throwable var7) {
            String var1;
            try {
               var1 = element.getAsString();
            } catch (Throwable var4) {
               return method_427();
            }

            if (var1 == null) {
               return method_427();
            } else {
               String var2 = var1.trim();
               if (!var2.isEmpty() && !var2.equalsIgnoreCase("none")) {
                  try {
                     return new Class4(Integer.parseInt(var2));
                  } catch (NumberFormatException var6) {
                     for (int var3 = 0; var3 <= 7; var3++) {
                        if (new Class4(1000 + var3).toString().equalsIgnoreCase(var2)) {
                           return method_428(var3);
                        }
                     }

                     if (var2.startsWith("key.")) {
                        try {
                           return new Class4(InputUtil.method_15981(var2).method_1444());
                        } catch (Throwable var5) {
                        }
                     }

                     for (int var8 = 32; var8 <= 348; var8++) {
                        if (new Class4(var8).toString().equalsIgnoreCase(var2)) {
                           return new Class4(var8);
                        }
                     }

                     return method_427();
                  }
               } else {
                  return method_427();
               }
            }
         }
      } else {
         return method_427();
      }
   }

   @Override
   public String toString() {
      if (this.method_432()) {
         return "None";
      } else {
         return this.method_433()
            ? this.method_437(this.method_434())
            : this.method_438(InputUtil.method_15985(this.field_213, 0).method_1441(), "key.keyboard.");
      }
   }

   // $VF: renamed from: c () boolean
   public boolean method_436() {
      if (!this.method_432() && a != null && a.method_22683() != null) {
         long var1 = a.method_22683().method_4490();
         if (!this.method_433()) {
            return GLFW.glfwGetKey(var1, this.method_430()) == 1;
         } else {
            int var3 = this.method_434();
            return method_429(var3) && GLFW.glfwGetMouseButton(var1, var3) == 1;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (int) java.lang.String
   private String method_437(int var1) {
      return switch (var1) {
         case 0 -> "Mouse Left";
         case 1 -> "Mouse Right";
         case 2 -> "Mouse Middle";
         default -> "Mouse " + (var1 + 1);
      };
   }

   // $VF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   private String method_438(String var1, String var2) {
      String var3 = var1.startsWith(var2) ? var1.substring(var2.length()) : var1;
      String[] var4 = var3.replace('_', ' ').split("\\.");
      StringBuilder var5 = new StringBuilder();

      for (String var9 : var4) {
         if (!var9.isEmpty()) {
            if (!var5.isEmpty()) {
               var5.append(' ');
            }

            var5.append(this.method_439(var9));
         }
      }

      return var5.isEmpty() ? var3 : var5.toString();
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_439(String var1) {
      return var1.isEmpty() ? "" : Character.toUpperCase(var1.charAt(0)) + (var1.length() != 1 ? var1.substring(1).toLowerCase() : "");
   }

   public static class Inner1 extends Converter<Class4, JsonElement> {
      // $VF: renamed from: a (Dev.ZWare.Client.features.pkg3.Class4) com.google.gson.JsonElement
      public JsonElement method_3795(Class4 bind) {
         return new JsonPrimitive(bind.toString());
      }

      // $VF: renamed from: a (com.google.gson.JsonElement) Dev.ZWare.Client.features.pkg3.Class4
      public Class4 method_3796(JsonElement jsonElement) {
         return Class4.method_435(jsonElement);
      }
   }
}
