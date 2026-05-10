package Dev.ZWare.Client.features.pkg1.pkg1;

import Dev.ZWare.Client.pkg1.Class22;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.CrafterBlockEntity;
import net.minecraft.block.entity.DispenserBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;
import yjShPPDAnoIeH9iXltdEPQeqqrYnT7_7.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.Xlu_QQhuYSJKCAAAJAHWZ2gxAwCJr;

public class Class19 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o com.google.gson.Gson
   private static final Gson field_1429 = new GsonBuilder().setPrettyPrinting().create();
   // $VF: renamed from: p java.lang.reflect.Type
   private static final Type field_1430 = (new TypeToken<List<Class19.Inner2>>() {}).getType();
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1431 = this.a("Chests", true).method_683("Storage");
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1432 = this.a("Barrels", true).method_683("Storage");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1433 = this.a("Shulkers", true).method_683("Storage");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1434 = this.a("Ender Chests", true).method_683("Storage");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1435 = this.a("Furnaces", true).method_683("Storage");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1436 = this.a("Dispensers Droppers", true).method_683("Storage");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1437 = this.a("Hoppers", true).method_683("Storage");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1438 = this.a("Crafters", true).method_683("Storage");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1439 = this.a("Minimum Storage Count", 4, 1, 100).method_683("General");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1440 = this.a("Shulker Instant Hit", false).method_683("General");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1441 = this.a("Crafter Instant Hit", false).method_683("General");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1442 = this.a("Disable On Teleport Or Death", false).method_683("General");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1443 = this.a("Ignore Trial Chambers", true).method_683("General");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1444 = this.a("Minimum Distance", 0, 0, 10000).method_683("General");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1445 = this.a("Only Old Chunks", true).method_683("General");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1446 = this.a("Notifications", true).method_683("General");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1447 = this.a("Send Webhook", false).method_683("General");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_1448 = this.a("Webhook Link", "").method_683("General");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1449 = this.a("Advanced Logging", false).method_683("General");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1450 = this.a("Ping For Webhook", false).method_683("General");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_1451 = this.a("Discord ID", "").method_683("General");
   // $VF: renamed from: L java.util.List
   private final List<Class19.Inner2> field_1452 = new ArrayList<>();
   // $VF: renamed from: M net.minecraft.util.math.Vec3d
   private Vec3d field_1453;

   public Class19() {
      super("Stash Notifier", "Detects stash-heavy chunks from XaeroPlus chunk events.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
      this.field_1448.method_709(var1 -> this.field_1447.method_671());
      this.field_1449.method_709(var1 -> this.field_1447.method_671());
      this.field_1450.method_709(var1 -> this.field_1447.method_671());
      this.field_1451.method_709(var1 -> this.field_1447.method_671() && this.field_1450.method_671());
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      if (g()) {
         this.k();
      } else if (Dev.ZWare.Client.pkg1.Class15.method_862() && Dev.ZWare.Client.pkg1.Class15.method_863(this)) {
         this.field_1453 = c.field_1724.method_19538();
         this.method_2071();
      } else {
         this.method_2078("XaeroPlus chunk events are required.");
         this.k();
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      Dev.ZWare.Client.pkg1.Class15.method_864(this);
      this.field_1453 = null;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return Integer.toString(this.field_1452.size());
   }

   // $VF: renamed from: a (java.lang.Object) void
   @Xlu_QQhuYSJKCAAAJAHWZ2gxAwCJr(
      a = -1
   )
   public void method_2061(Object rawEvent) {
      if (!g() && Dev.ZWare.Client.pkg1.Class15.method_865(rawEvent) && !Dev.ZWare.Client.pkg1.Class15.method_866(rawEvent)) {
         WorldChunk var2 = Dev.ZWare.Client.pkg1.Class15.method_867(rawEvent);
         if (var2 != null) {
            ChunkPos var3 = var2.method_12004();
            double var4 = var3.method_8326() + 8.0;
            double var6 = var3.method_8328() + 8.0;
            double var8 = this.field_1444.method_671() * this.field_1444.method_671();
            if (!(var4 * var4 + var6 * var6 < var8)) {
               RegistryKey var10 = c.field_1687.method_27983();
               boolean var11 = Dev.ZWare.Client.pkg1.Class15.method_869(var3.field_9181, var3.field_9180, var10);
               boolean var12 = Dev.ZWare.Client.pkg1.Class15.method_868(var3.field_9181, var3.field_9180, var10);
               if (!this.field_1445.method_671() || !var11 || var12) {
                  Class19.Inner2 var13 = new Class19.Inner2(var3);

                  for (BlockEntity var15 : var2.method_12214().values()) {
                     if (this.method_2065(var15) && (!this.field_1443.method_671() || !this.method_2066(var15))) {
                        if (var15 instanceof ChestBlockEntity) {
                           var13.field_395++;
                        } else if (var15 instanceof BarrelBlockEntity) {
                           var13.field_396++;
                        } else if (var15 instanceof ShulkerBoxBlockEntity) {
                           var13.field_397++;
                        } else if (var15 instanceof EnderChestBlockEntity) {
                           var13.field_398++;
                        } else if (var15 instanceof AbstractFurnaceBlockEntity) {
                           var13.field_399++;
                        } else if (var15 instanceof DispenserBlockEntity) {
                           var13.field_400++;
                        } else if (var15 instanceof HopperBlockEntity) {
                           var13.field_401++;
                        } else if (var15 instanceof CrafterBlockEntity) {
                           var13.field_402++;
                        }
                     }
                  }

                  if (this.method_2067(var13)) {
                     Class19.Inner2 var16 = null;
                     int var17 = this.field_1452.indexOf(var13);
                     if (var17 < 0) {
                        this.field_1452.add(var13);
                     } else {
                        var16 = this.field_1452.set(var17, var13);
                     }

                     if (var16 == null || !var16.method_808(var13)) {
                        this.field_1452.sort(Comparator.comparingInt(Class19.Inner2::a).reversed());
                        this.method_2072();
                        this.method_2073();
                        if (this.field_1446.method_671()) {
                           this.method_2078(
                              "Found stash at %d, %d%s", var13.field_393, var13.field_394, this.field_1449.method_671() ? " [" + var13.method_809() + "]" : ""
                           );
                        }

                        if (this.field_1447.method_671() && !this.field_1448.method_671().isBlank()) {
                           this.method_2068(var13, var11, var12);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner1) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_2062(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner1 var1) {
      if (g()) {
         this.field_1453 = null;
      } else if (this.field_1442.method_671() && this.field_1453 != null && c.field_1724.method_5707(this.field_1453) > 256.0) {
         this.method_2078("Disabled after a large position change.");
         this.k();
      } else {
         this.field_1453 = c.field_1724.method_19538();
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class12) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_2063(Dev.ZWare.Client.pkg2.pkg1.Class12 var1) {
      if (this.field_1442.method_671() && c.field_1724 != null) {
         if (var1.method_1057() == c.field_1724) {
            this.method_2078("Disabled on death.");
            this.k();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_2064(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (this.field_1442.method_671()) {
         if (var1.method_1045() instanceof PlayerPositionLookS2CPacket) {
            this.method_2078("Disabled on teleport correction.");
            this.k();
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.block.entity.BlockEntity) boolean
   private boolean method_2065(BlockEntity var1) {
      return var1 instanceof ChestBlockEntity && this.field_1431.method_671()
         || var1 instanceof BarrelBlockEntity && this.field_1432.method_671()
         || var1 instanceof ShulkerBoxBlockEntity && this.field_1433.method_671()
         || var1 instanceof EnderChestBlockEntity && this.field_1434.method_671()
         || var1 instanceof AbstractFurnaceBlockEntity && this.field_1435.method_671()
         || var1 instanceof DispenserBlockEntity && this.field_1436.method_671()
         || var1 instanceof HopperBlockEntity && this.field_1437.method_671()
         || var1 instanceof CrafterBlockEntity && this.field_1438.method_671();
   }

   // $VF: renamed from: b (net.minecraft.block.entity.BlockEntity) boolean
   private boolean method_2066(BlockEntity var1) {
      Block var2 = c.field_1687.method_8320(var1.method_11016().method_10074()).method_26204();
      return var2 == Blocks.field_33408 || var2 == Blocks.field_47035 || var2 == Blocks.field_27133 || var2 == Blocks.field_33407;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class19$Inner2) boolean
   private boolean method_2067(Class19.Inner2 var1) {
      return var1.method_807() >= this.field_1439.method_671()
         || this.field_1440.method_671() && var1.field_397 > 0
         || this.field_1441.method_671() && var1.field_402 > 0;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class19$Inner2, boolean, boolean) void
   private void method_2068(Class19.Inner2 var1, boolean var2, boolean var3) {
      String var4 = this.field_1450.method_671() && !this.field_1451.method_671().isBlank() ? "<@" + this.field_1451.method_671().trim() + ">" : "";
      if (this.field_1449.method_671()) {
         JsonObject var9 = new JsonObject();
         var9.addProperty("username", "Stash Notifier");
         if (!var4.isBlank()) {
            var9.addProperty("content", var4);
         }

         JsonObject var10 = new JsonObject();
         var10.addProperty("title", "Stash Found");
         var10.addProperty("color", 2153596);
         var10.addProperty("description", "Coordinates: X " + var1.field_393 + " Z " + var1.field_394 + " in " + this.method_2070(var2, var3) + " chunks.");
         JsonArray var7 = new JsonArray();
         this.method_2069(var7, "Chests", var1.field_395);
         this.method_2069(var7, "Barrels", var1.field_396);
         this.method_2069(var7, "Shulkers", var1.field_397);
         this.method_2069(var7, "Ender Chests", var1.field_398);
         this.method_2069(var7, "Hoppers", var1.field_401);
         this.method_2069(var7, "Dispensers/Droppers", var1.field_400);
         this.method_2069(var7, "Furnaces", var1.field_399);
         this.method_2069(var7, "Crafters", var1.field_402);
         var10.add("fields", var7);
         JsonArray var8 = new JsonArray();
         var8.add(var10);
         var9.add("embeds", var8);
         Class22.method_162(this.field_1448.method_671(), var9.toString());
      } else {
         JsonObject var5 = new JsonObject();
         var5.addProperty("username", "Stash Notifier");
         String var6 = "Found stash at " + var1.field_393 + ", " + var1.field_394 + ".";
         var5.addProperty("content", var4.isBlank() ? var6 : var4 + " " + var6);
         Class22.method_162(this.field_1448.method_671(), var5.toString());
      }
   }

   // $VF: renamed from: a (com.google.gson.JsonArray, java.lang.String, int) void
   private void method_2069(JsonArray var1, String var2, int var3) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var2);
      var4.addProperty("value", Integer.toString(var3));
      var4.addProperty("inline", true);
      var1.add(var4);
   }

   // $VF: renamed from: a (boolean, boolean) java.lang.String
   private String method_2070(boolean var1, boolean var2) {
      if (var1 && !var2) {
         return "new";
      } else if (var1) {
         return "unfollowed 1.12";
      } else {
         return !var2 ? "1.19" : "followed 1.12";
      }
   }

   // $VF: renamed from: n () void
   private void method_2071() {
      this.field_1452.clear();
      File var1 = this.method_2074();
      if (var1.exists()) {
         try (FileReader var2 = new FileReader(var1)) {
            List var3 = (List)field_1429.fromJson(var2, field_1430);
            if (var3 != null) {
               for (Class19.Inner2 var18 : var3) {
                  var18.method_806();
               }

               this.field_1452.addAll(var3);
               this.field_1452.sort(Comparator.comparingInt(Class19.Inner2::a).reversed());
               return;
            }
         } catch (Throwable var14) {
         }
      }

      File var15 = this.method_2075();
      if (var15.exists()) {
         try (BufferedReader var16 = new BufferedReader(new FileReader(var15))) {
            var16.readLine();

            String var4;
            while ((var4 = var16.readLine()) != null) {
               String[] var5 = var4.split(",");
               if (var5.length >= 10) {
                  int var6 = Integer.parseInt(var5[0].trim());
                  int var7 = Integer.parseInt(var5[1].trim());
                  Class19.Inner2 var8 = new Class19.Inner2(new ChunkPos(var6 - 8 >> 4, var7 - 8 >> 4));
                  var8.field_395 = Integer.parseInt(var5[2].trim());
                  var8.field_396 = Integer.parseInt(var5[3].trim());
                  var8.field_397 = Integer.parseInt(var5[4].trim());
                  var8.field_398 = Integer.parseInt(var5[5].trim());
                  var8.field_399 = Integer.parseInt(var5[6].trim());
                  var8.field_400 = Integer.parseInt(var5[7].trim());
                  var8.field_401 = Integer.parseInt(var5[8].trim());
                  var8.field_402 = Integer.parseInt(var5[9].trim());
                  this.field_1452.add(var8);
               }
            }
         } catch (Throwable var12) {
         }

         this.field_1452.sort(Comparator.comparingInt(Class19.Inner2::a).reversed());
      }
   }

   // $VF: renamed from: o () void
   private void method_2072() {
      File var1 = this.method_2074();
      if (var1.getParentFile() != null) {
         var1.getParentFile().mkdirs();
      }

      try (FileWriter var2 = new FileWriter(var1)) {
         field_1429.toJson(this.field_1452, var2);
      } catch (IOException var7) {
      }
   }

   // $VF: renamed from: p () void
   private void method_2073() {
      File var1 = this.method_2075();
      if (var1.getParentFile() != null) {
         var1.getParentFile().mkdirs();
      }

      try (FileWriter var2 = new FileWriter(var1)) {
         var2.write("X,Z,Chests,Barrels,Shulkers,EnderChests,Furnaces,DispensersDroppers,Hoppers,Crafters\n");

         for (Class19.Inner2 var4 : this.field_1452) {
            var4.method_810(var2);
         }
      } catch (IOException var7) {
      }
   }

   // $VF: renamed from: a () java.io.File
   private File method_2074() {
      return new File(this.method_2076(), "stashes.json");
   }

   // $VF: renamed from: b () java.io.File
   private File method_2075() {
      return new File(this.method_2076(), "stashes.csv");
   }

   // $VF: renamed from: c () java.io.File
   private File method_2076() {
      String var1 = "unknown";
      if (c != null) {
         if (c.method_1542()) {
            var1 = "singleplayer";
         } else {
            ServerInfo var2 = c.method_1558();
            if (var2 != null && var2.field_3761 != null && !var2.field_3761.isBlank()) {
               var1 = this.method_2077(var2.field_3761);
            }
         }
      }

      String var3 = c != null && c.field_1687 != null ? this.method_2077(c.field_1687.method_27983().method_29177().toString()) : "unknown";
      return new File(new File(new File(c.field_1697, "zware"), "stash-notifier"), var1 + File.separator + var3);
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_2077(String var1) {
      return var1.replaceAll("[^a-zA-Z0-9._-]+", "_");
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   private void method_2078(String var1, Object... var2) {
      Dev.ZWare.Client.features.pkg2.Class1.method_1647("[StashNotifier] " + String.format(Locale.ROOT, var1, var2));
   }

   private static final class Inner2 {
      // $VF: renamed from: a java.lang.StringBuilder
      private static final StringBuilder field_390 = new StringBuilder();
      // $VF: renamed from: b int
      public int field_391;
      // $VF: renamed from: c int
      public int field_392;
      // $VF: renamed from: d int
      public transient int field_393;
      // $VF: renamed from: e int
      public transient int field_394;
      // $VF: renamed from: f int
      public int field_395;
      // $VF: renamed from: g int
      public int field_396;
      // $VF: renamed from: h int
      public int field_397;
      // $VF: renamed from: i int
      public int field_398;
      // $VF: renamed from: j int
      public int field_399;
      // $VF: renamed from: k int
      public int field_400;
      // $VF: renamed from: l int
      public int field_401;
      // $VF: renamed from: m int
      public int field_402;

      private Inner2(ChunkPos var1) {
         this.field_391 = var1.field_9181;
         this.field_392 = var1.field_9180;
         this.method_806();
      }

      // $VF: renamed from: a () void
      private void method_806() {
         this.field_393 = this.field_391 * 16 + 8;
         this.field_394 = this.field_392 * 16 + 8;
      }

      // $VF: renamed from: a () int
      private int method_807() {
         return this.field_395 + this.field_396 + this.field_397 + this.field_398 + this.field_399 + this.field_400 + this.field_401 + this.field_402;
      }

      // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg1.Class19$Inner2) boolean
      private boolean method_808(Class19.Inner2 var1) {
         return var1 != null
            && this.field_395 == var1.field_395
            && this.field_396 == var1.field_396
            && this.field_397 == var1.field_397
            && this.field_398 == var1.field_398
            && this.field_399 == var1.field_399
            && this.field_400 == var1.field_400
            && this.field_401 == var1.field_401
            && this.field_402 == var1.field_402;
      }

      // $VF: renamed from: a () java.lang.String
      private String method_809() {
         return "C:"
            + this.field_395
            + " B:"
            + this.field_396
            + " S:"
            + this.field_397
            + " E:"
            + this.field_398
            + " H:"
            + this.field_401
            + " D:"
            + this.field_400
            + " F:"
            + this.field_399
            + " A:"
            + this.field_402;
      }

      // $VF: renamed from: a (java.io.Writer) void
      private void method_810(Writer var1) throws IOException {
         field_390.setLength(0);
         field_390.append(this.field_393)
            .append(',')
            .append(this.field_394)
            .append(',')
            .append(this.field_395)
            .append(',')
            .append(this.field_396)
            .append(',')
            .append(this.field_397)
            .append(',')
            .append(this.field_398)
            .append(',')
            .append(this.field_399)
            .append(',')
            .append(this.field_400)
            .append(',')
            .append(this.field_401)
            .append(',')
            .append(this.field_402)
            .append('\n');
         var1.write(field_390.toString());
      }

      @Override
      public boolean equals(Object object) {
         if (this == object) {
            return true;
         } else {
            return !(object instanceof Class19.Inner2 var2) ? false : this.field_391 == var2.field_391 && this.field_392 == var2.field_392;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.field_391, this.field_392);
      }
   }
}
