package Dev.ZWare.Client.features.pkg1;

import Dev.ZWare.Client.features.pkg3.Class4;
import Dev.ZWare.Client.features.pkg3.Class8;
import Dev.ZWare.Client.pkg1.pkg5.Class2;
import Dev.ZWare.Client.pkg2.pkg1.Class13;
import Dev.ZWare.Client.pkg2.pkg1.Class14;
import Dev.ZWare.Client.pkg2.pkg1.Class3;
import Dev.ZWare.Client.pkg2.pkg1.Class6;
import Dev.ZWare.Client.pkg4.Class11;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Formatting;
import org.joml.Vector2f;

public class Class1 extends Dev.ZWare.Client.features.Class1 implements Class2 {
   // $VF: renamed from: f java.lang.String
   private final String field_1223;
   // $VF: renamed from: g Dev.ZWare.Client.features.pkg1.Class1$Inner1
   private final Class1.Inner1 field_1224;
   // $VF: renamed from: h Dev.ZWare.Client.features.pkg3.Class8
   public Class8<Boolean> field_1225 = this.a("Enabled", false);
   // $VF: renamed from: i Dev.ZWare.Client.features.pkg3.Class8
   public Class8<Class4> field_1226 = this.a("Keybind", new Class4(-1));
   // $VF: renamed from: j Dev.ZWare.Client.features.pkg3.Class8
   public Class8<String> field_1227;
   // $VF: renamed from: k boolean
   public boolean field_1228;
   // $VF: renamed from: l boolean
   public boolean field_1229;
   // $VF: renamed from: m boolean
   public boolean field_1230;
   // $VF: renamed from: n java.lang.Boolean
   private Boolean field_1231;

   public Class1(String name, String description, Class1.Inner1 category, boolean hasListener, boolean hidden, boolean alwaysListening) {
      super(name);
      this.field_1227 = this.a("DisplayName", name);
      this.field_1223 = description;
      this.field_1224 = category;
      this.field_1228 = hasListener;
      this.field_1230 = hidden;
      this.field_1229 = alwaysListening;
   }

   // $VF: renamed from: c () void
   public void method_1887() {
   }

   // $VF: renamed from: d () void
   public void method_1888() {
   }

   // $VF: renamed from: e () void
   public void method_1889() {
   }

   // $VF: renamed from: f () void
   public void method_1890() {
   }

   // $VF: renamed from: g () void
   public void method_1891() {
   }

   // $VF: renamed from: h () void
   public void method_1892() {
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   public void method_1893(Class3 event) {
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   public void method_1894(Class14 event) {
   }

   // $VF: renamed from: k () boolean
   public boolean method_1895() {
      return false;
   }

   // $VF: renamed from: l () boolean
   public boolean method_1896() {
      return false;
   }

   // $VF: renamed from: i () void
   public void method_1897() {
   }

   // $VF: renamed from: b () java.lang.String
   public String method_1898() {
      return null;
   }

   // $VF: renamed from: d () boolean
   public boolean method_1899() {
      return this.field_1225.method_671();
   }

   // $VF: renamed from: e () boolean
   public boolean method_1900() {
      return !this.field_1225.method_671();
   }

   // $VF: renamed from: b (boolean) void
   public void method_1901(boolean enabled) {
      if (enabled) {
         this.method_1903();
      } else {
         this.method_1904();
      }
   }

   // $VF: renamed from: c (boolean) void
   public void method_1902(boolean enabled) {
      if (enabled != this.method_1899()) {
         if (enabled && !this.method_1906(false)) {
            this.field_1231 = true;
         } else {
            this.field_1231 = null;
            this.field_1225.method_680(enabled);
            this.method_1889();
            if (enabled) {
               this.method_1887();
            } else {
               this.method_1888();
            }
         }
      }
   }

   // $VF: renamed from: j () void
   public void method_1903() {
      if (!this.method_1899()) {
         if (this.method_1906(true)) {
            this.field_1231 = null;
            this.field_1225.method_672(true);
            this.method_1889();
            this.method_1887();
            if (this.method_1899() && this.field_1228 && !this.field_1229) {
               b.a(this);
            }

            b.a(new Class13(this, true));
            Dev.ZWare.Client.features.pkg1.pkg4.Class4 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
            if (var1 != null && var1.d() && !(this instanceof Dev.ZWare.Client.features.pkg1.pkg4.Class8)) {
               var1.method_1939();
            }
         }
      }
   }

   // $VF: renamed from: k () void
   public void method_1904() {
      if (!this.method_1900()) {
         if (this.field_1228 && !this.field_1229) {
            b.b(this);
         }

         this.field_1231 = null;
         this.field_1225.method_672(false);
         this.method_1889();
         this.method_1888();
         b.a(new Class13(this, false));
         Dev.ZWare.Client.features.pkg1.pkg4.Class4 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class4.method_1935();
         if (var1 != null && var1.d() && !(this instanceof Dev.ZWare.Client.features.pkg1.pkg4.Class8)) {
            var1.method_1939();
         }
      }
   }

   // $VF: renamed from: l () void
   public void method_1905() {
      Class6 var1 = new Class6(!this.method_1558() ? 1 : 0, this);
      b.a(var1);
      if (!var1.a()) {
         this.method_1901(!this.method_1558());
      }
   }

   // $VF: renamed from: a (boolean) boolean
   private boolean method_1906(boolean var1) {
      if (Dev.ZWare.Client.Class1.field_314 != null && !Dev.ZWare.Client.Class1.field_314.method_43()) {
         if (var1 && Dev.ZWare.Client.Class1.field_314.method_45()) {
            Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1061 + "Authentication required. Use .auth status / .auth login.");
         }

         return false;
      } else {
         return true;
      }
   }

   // $VF: renamed from: c () java.lang.String
   public String method_1907() {
      String var1 = this.field_1227.method_671();
      return var1.equals(this.a()) ? Dev.ZWare.Client.pkg1.Class6.method_201(this.a()) : var1;
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_1908(String name) {
      Class1 var2 = Dev.ZWare.Client.Class1.field_316.method_517(name);
      Class1 var3 = Dev.ZWare.Client.Class1.field_316.method_509(name);
      if (var2 == null && var3 == null) {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647(this.method_1907() + ", name: " + this.a() + ", has been renamed to: " + name);
         this.field_1227.method_672(name);
      } else {
         Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1061 + "A module of this name already exists.");
      }
   }

   // $VF: renamed from: i () boolean
   @Override
   public boolean method_1558() {
      return this.method_1899();
   }

   // $VF: renamed from: d () java.lang.String
   public String method_1909() {
      return this.field_1223;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.Class1$Inner1
   public Class1.Inner1 method_1910() {
      return this.field_1224;
   }

   // $VF: renamed from: e () java.lang.String
   public String method_1911() {
      return null;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg3.Class4
   public Class4 method_1912() {
      return this.field_1226.method_671();
   }

   // $VF: renamed from: a (int) void
   public void method_1913(int key) {
      this.field_1226.method_672(new Class4(key));
      if (Dev.ZWare.Client.Class1.field_317 != null) {
         Dev.ZWare.Client.Class1.field_317.method_171();
      }
   }

   // $VF: renamed from: m () boolean
   public boolean method_1914() {
      return this.field_1228 && this.method_1899() || this.field_1229;
   }

   // $VF: renamed from: f () java.lang.String
   public String method_1915() {
      return this.method_1907()
         + Formatting.field_1080
         + (this.method_1898() != null ? " [" + Formatting.field_1068 + this.method_1898() + Formatting.field_1080 + "]" : "");
   }

   // $VF: renamed from: m () void
   public void method_1916() {
      if (Boolean.TRUE.equals(this.field_1231) && this.method_1906(false)) {
         this.field_1231 = null;
         this.method_1903();
      }
   }

   @Override
   public JsonElement toJson() {
      JsonObject var1 = new JsonObject();

      for (Class8 var3 : this.a()) {
         try {
            if ("Enabled".equalsIgnoreCase(var3.method_670()) && this.field_1231 != null) {
               var1.addProperty(var3.method_670(), this.field_1231);
            } else if (var3.method_671() instanceof Class4 var4) {
               var1.addProperty(var3.method_670(), var4.method_430());
            } else if (var3.method_671() instanceof Color var5) {
               var1.addProperty(var3.method_670(), var5.getRed() + "," + var5.getGreen() + "," + var5.getBlue() + "," + var5.getAlpha());
            } else if (var3.method_671() instanceof Block var6) {
               var1.addProperty(var3.method_670(), Registries.field_41175.method_10221(var6).toString());
            } else if (var3.method_671() instanceof Item var7) {
               var1.addProperty(var3.method_670(), Registries.field_41178.method_10221(var7).toString());
            } else if (var3.method_671() instanceof Vector2f var8) {
               var1.addProperty(var3.method_670(), var8.x() + "," + var8.y());
            } else {
               var1.addProperty(var3.method_670(), var3.method_707());
            }
         } catch (Throwable var10) {
         }
      }

      return var1;
   }

   @Override
   public void fromJson(JsonElement element) {
      if (element != null && !element.isJsonNull()) {
         JsonObject var2 = element.getAsJsonObject();
         Boolean var3 = var2.has("Enabled") ? Boolean.parseBoolean(var2.get("Enabled").getAsString()) : null;

         for (Class8 var5 : this.a()) {
            try {
               if (!"Enabled".equalsIgnoreCase(var5.method_670())) {
                  JsonElement var6 = var2.get(var5.method_670());
                  if (var6 != null && !var6.isJsonNull()) {
                     Class11.method_169(this, var5, var6);
                  }
               }
            } catch (Throwable var7) {
               var7.printStackTrace();
            }
         }

         if (var3 != null) {
            this.method_1902(var3);
         }
      }
   }

   public static enum Inner1 {
      COMBAT("Combat"),
      MISC("Extra"),
      MOVEMENT("Movement"),
      VISUALS("Visuals"),
      WORLD("Player"),
      CLIENT("Client"),
      // $VF: renamed from: HUD Dev.ZWare.Client.features.pkg1.Class1$Inner1
      field_677("Hud");

      // $VF: renamed from: a java.lang.String
      private final String field_678;

      private Inner1(String var3) {
         this.field_678 = var3;
      }

      // $VF: renamed from: a () java.lang.String
      public String method_1190() {
         return this.field_678;
      }
   }
}
