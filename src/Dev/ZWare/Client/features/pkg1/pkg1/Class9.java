package Dev.ZWare.Client.features.pkg1.pkg1;

import Dev.ZWare.Client.mixin.Class26;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NoteBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class Class9 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_1281 = 9000.0;
   // $VF: renamed from: p java.nio.file.Path
   private static final Path field_1282 = FabricLoader.getInstance().getGameDir().resolve("oyvey").resolve("notebot");
   // $VF: renamed from: q Dev.ZWare.Client.features.pkg1.pkg1.Class9
   private static Class9 field_1283;
   // $VF: renamed from: r Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_1284 = this.a("SongFile", "").method_683("General");
   // $VF: renamed from: s Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1285 = this.a("TickDelay", 1, 1, 20).method_683("General");
   // $VF: renamed from: t Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1286 = this.a("ConcurrentTuneBlocks", 1, 1, 20).method_683("General");
   // $VF: renamed from: u Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2> field_1287 = this.a(
         "Mode", Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments
      )
      .method_683("General");
   // $VF: renamed from: v Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.pkg1.pkg6.pkg1.Class2> field_1288 = this.a(
         "InstrumentDetectMode", Dev.ZWare.Client.pkg1.pkg6.pkg1.Class2.BlockState
      )
      .method_683("General");
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1289 = this.a("Polyphonic", true).method_683("General");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1290 = this.a("AutoRotate", true).method_683("General");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1291 = this.a("AutoPlay", false).method_683("General");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1292 = this.a("RoundOutOfRange", false).method_683("General");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1293 = this.a("SwingArm", true).method_683("General");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_1294 = this.a("CheckNoteblocksAgainDelay", 10, 1, 20).method_683("General");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1295 = this.a("RenderText", true).method_683("Render");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1296 = this.a("RenderBoxes", true).method_683("Render");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Class9.Inner1> field_1297 = this.a("ShapeMode", Class9.Inner1.Both).method_683("Render");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1298 = this.a("UntunedSideColor", 204, 0, 0, 10).method_683("Render");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1299 = this.a("UntunedLineColor", 204, 0, 0, 255).method_683("Render");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1300 = this.a("TunedSideColor", 0, 204, 0, 10).method_683("Render");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1301 = this.a("TunedLineColor", 0, 204, 0, 255).method_683("Render");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1302 = this.a("HitSideColor", 255, 153, 0, 10).method_683("Render");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1303 = this.a("HitLineColor", 255, 153, 0, 255).method_683("Render");
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1304 = this.a("ScannedNoteblockSideColor", 255, 255, 0, 30).method_683("Render");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Color> field_1305 = this.a("ScannedNoteblockLineColor", 255, 255, 0, 255).method_683("Render");
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Double> field_1306 = this.a("NoteTextScale", 1.5, 0.25, 6.0).method_683("Render");
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   public final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_1307 = this.a("ShowScannedNoteblocks", false).method_683("Render");
   // $VF: renamed from: P java.util.EnumMap
   private final EnumMap<NoteBlockInstrument, Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.pkg1.pkg6.Class1.Inner1>> field_1308 = new EnumMap<>(
      NoteBlockInstrument.class
   );
   // $VF: renamed from: Q java.util.Map
   private final Map<Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1, BlockPos> field_1309 = new LinkedHashMap<>();
   // $VF: renamed from: R com.google.common.collect.Multimap
   private final Multimap<Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1, BlockPos> field_1310 = MultimapBuilder.linkedHashKeys().arrayListValues().build();
   // $VF: renamed from: S java.util.List
   private final List<BlockPos> field_1311 = new ArrayList<>();
   // $VF: renamed from: T java.util.Map
   private final Map<BlockPos, Integer> field_1312 = new LinkedHashMap<>();
   // $VF: renamed from: U org.joml.Matrix4f
   private final Matrix4f field_1313 = new Matrix4f();
   // $VF: renamed from: V org.joml.Matrix4f
   private final Matrix4f field_1314 = new Matrix4f();
   // $VF: renamed from: W org.joml.Vector4f
   private final Vector4f field_1315 = new Vector4f();
   // $VF: renamed from: X java.util.concurrent.CompletableFuture
   private CompletableFuture<Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2> field_1316;
   // $VF: renamed from: Y Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2
   private Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 field_1317;
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg1.pkg1.Class9$Inner3
   private Class9.Inner3 field_1318 = Class9.Inner3.None;
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg1.pkg1.Class9$Inner2
   private Class9.Inner2 field_1319 = Class9.Inner2.None;
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg1.pkg1.Class9$Inner2
   private Class9.Inner2 field_1320 = Class9.Inner2.None;
   // $VF: renamed from: ac java.lang.String
   private String field_1321;
   // $VF: renamed from: ad boolean
   private boolean field_1322;
   // $VF: renamed from: ae boolean
   private boolean field_1323;
   // $VF: renamed from: af int
   private int field_1324;
   // $VF: renamed from: ag int
   private int field_1325;
   // $VF: renamed from: ah int
   private int field_1326 = -1;

   public Class9() {
      super("Song Bot", "Plays noteblock songs.", Dev.ZWare.Client.features.pkg1.Class1.Inner1.MISC, true, false, false);
      field_1283 = this;
      this.field_1297.method_709(var1 -> this.field_1296.method_671());
      this.field_1298.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1081());
      this.field_1299.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1080());
      this.field_1300.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1081());
      this.field_1301.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1080());
      this.field_1302.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1081());
      this.field_1303.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1080());
      this.field_1304.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1081());
      this.field_1305.method_709(var1 -> this.field_1296.method_671() && this.field_1297.method_671().method_1080());
      this.field_1306.method_709(var1 -> this.field_1295.method_671());

      for (NoteBlockInstrument var4 : NoteBlockInstrument.values()) {
         Dev.ZWare.Client.pkg1.pkg6.Class1.Inner1 var5 = Dev.ZWare.Client.pkg1.pkg6.Class1.Inner1.method_1212(var4);
         if (var5 != null) {
            Dev.ZWare.Client.features.pkg3.Class8 var6 = this.a(this.method_1992(var4.name()), var5).method_683("Note Map");
            var6.method_709(var1 -> this.field_1287.method_671() == Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments);
            this.field_1308.put((Enum)var4, var6);
         }
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg1.Class9
   public static Class9 method_1960() {
      return field_1283 != null ? field_1283 : (Dev.ZWare.Client.Class1.field_316 != null ? Dev.ZWare.Client.Class1.field_316.method_510(Class9.class) : null);
   }

   // $VF: renamed from: a () java.nio.file.Path
   public static Path method_1961() {
      try {
         Files.createDirectories(field_1282);
      } catch (IOException var1) {
      }

      return field_1282;
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_1325 = 0;
      this.method_1974();
      if (this.field_1321 != null) {
         String var1 = this.field_1321;
         Class9.Inner2 var2 = this.field_1320;
         this.field_1321 = null;
         this.field_1320 = Class9.Inner2.None;
         this.method_1975(var1, var2);
      }
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      this.method_1974();
      this.field_1321 = null;
      this.field_1320 = Class9.Inner2.None;
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      if (this.field_1317 != null) {
         return this.field_1317.method_278();
      } else {
         return this.field_1318 == Class9.Inner3.None ? null : this.field_1319 + " | " + this.field_1318;
      }
   }

   // $VF: renamed from: g () java.lang.String
   public String method_1962() {
      if (this.e()) {
         return "Module disabled.";
      } else if (this.field_1317 == null && this.field_1318 != Class9.Inner3.LoadingSong) {
         return "No song loaded.";
      } else if (this.field_1322 && this.field_1317 != null) {
         return String.format(Locale.ROOT, "Playing song. %d/%d", this.field_1324, this.field_1317.method_277());
      } else if (this.field_1318 == Class9.Inner3.Playing) {
         return "Ready to play.";
      } else {
         return this.field_1318 != Class9.Inner3.SetUp && this.field_1318 != Class9.Inner3.Tune && this.field_1318 != Class9.Inner3.WaitingToCheckNoteblocks
            ? "Stage: " + this.field_1318 + "."
            : "Setting up the noteblocks.";
      }
   }

   // $VF: renamed from: b (java.lang.String) void
   public void method_1963(String path) {
      if (path != null && !path.isBlank()) {
         this.field_1284.method_672(path);
         if (this.e()) {
            this.field_1321 = path;
            this.field_1320 = Class9.Inner2.Noteblocks;
            this.j();
         } else {
            this.method_1974();
            this.method_1975(path, Class9.Inner2.Noteblocks);
         }
      } else {
         this.method_1994("Usage: .notebot load <file>");
      }
   }

   // $VF: renamed from: c (java.lang.String) void
   public void method_1964(String path) {
      if (path != null && !path.isBlank()) {
         this.field_1284.method_672(path);
         if (this.e()) {
            this.field_1321 = path;
            this.field_1320 = Class9.Inner2.Preview;
            this.j();
         } else {
            this.method_1974();
            this.method_1975(path, Class9.Inner2.Preview);
         }
      } else {
         this.method_1994("Usage: .notebot preview <file>");
      }
   }

   // $VF: renamed from: n () void
   public void method_1965() {
      if (!g()) {
         if (this.field_1318 == Class9.Inner3.Playing) {
            this.field_1322 = true;
            this.method_1993("Playing.");
         } else {
            if (this.field_1317 == null) {
               String var1 = this.field_1284.method_671();
               if (var1 != null && !var1.isBlank()) {
                  this.method_1963(var1);
                  return;
               }

               this.method_1994("No song loaded.");
            }
         }
      }
   }

   // $VF: renamed from: o () void
   public void method_1966() {
      if (this.e()) {
         this.j();
      } else {
         if (this.field_1322) {
            this.field_1322 = false;
            this.method_1993("Pausing.");
         } else {
            this.field_1322 = true;
            this.method_1993("Resuming.");
         }
      }
   }

   // $VF: renamed from: p () void
   public void method_1967() {
      this.method_1993("Stopping.");
      if (this.d()) {
         this.k();
      } else {
         this.method_1974();
      }
   }

   // $VF: renamed from: q () void
   public void method_1968() {
      if (this.field_1291.method_671() && this.field_1319 != Class9.Inner2.Preview) {
         this.method_1969();
      } else {
         this.method_1967();
      }
   }

   // $VF: renamed from: r () void
   public void method_1969() {
      List var1 = this.method_1970();
      if (var1.isEmpty()) {
         this.method_1994("No songs found in %s", method_1961());
         this.method_1967();
      } else {
         String var2 = (String)var1.get(ThreadLocalRandom.current().nextInt(var1.size()));
         this.method_1963(var2);
      }
   }

   // $VF: renamed from: b () java.util.List
   public List<String> method_1970() {
      Path var1 = method_1961();
      if (!Files.isDirectory(var1)) {
         return List.of();
      } else {
         try {
            return Files.list(var1)
               .filter(var0 -> Files.isRegularFile(var0))
               .filter(Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4::a)
               .map(var0 -> var0.getFileName().toString())
               .sorted(String.CASE_INSENSITIVE_ORDER)
               .toList();
         } catch (IOException var3) {
            return List.of();
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.block.enums.NoteBlockInstrument) net.minecraft.block.enums.NoteBlockInstrument
   public NoteBlockInstrument method_1971(NoteBlockInstrument instrument) {
      if (this.field_1287.method_671() != Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments) {
         return instrument;
      } else {
         Dev.ZWare.Client.features.pkg3.Class8 var2 = this.field_1308.get(instrument);
         return var2 != null ? ((Dev.ZWare.Client.pkg1.pkg6.Class1.Inner1)var2.method_671()).method_1211() : instrument;
      }
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   public void method_1972(String message, Object... args) {
      Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1054 + String.format(Locale.ROOT, message, args));
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class7$Inner2) void
   @iFT13zrx_wTXP
   private void method_1973(Dev.ZWare.Client.pkg2.pkg1.Class7.Inner2 var1) {
      this.field_1325++;
      this.field_1311.clear();
      if (this.field_1318 == Class9.Inner3.WaitingToCheckNoteblocks) {
         this.field_1326--;
         if (this.field_1326 == 0) {
            this.field_1326 = -1;
            this.method_1993("Checking noteblocks again...");
            this.method_1980();
            this.field_1318 = Class9.Inner3.Tune;
         }
      } else if (this.field_1318 == Class9.Inner3.SetUp) {
         this.method_1978();
         if (this.field_1310.isEmpty()) {
            this.method_1994("Can't find any nearby noteblock.");
            this.method_1967();
         } else {
            this.method_1979();
            if (this.field_1309.isEmpty()) {
               this.method_1994("Can't find any valid noteblock to play the song.");
               this.method_1967();
            } else {
               this.method_1980();
               this.field_1318 = Class9.Inner3.Tune;
            }
         }
      } else if (this.field_1318 == Class9.Inner3.Tune) {
         this.method_1981();
      } else if (this.field_1318 == Class9.Inner3.Playing && this.field_1322) {
         if (c.field_1724 != null && this.field_1317 != null && this.field_1324 <= this.field_1317.method_277()) {
            Collection var2 = this.field_1317.method_275().get(this.field_1324);
            if (!var2.isEmpty()) {
               if (this.field_1319 == Class9.Inner2.Preview) {
                  this.method_1984(var2);
               } else {
                  if (c.field_1724.method_68878()) {
                     this.method_1994("You need to be in survival mode.");
                     this.method_1967();
                     return;
                  }

                  this.method_1985(var2);
               }
            }

            this.field_1324++;
         } else {
            this.method_1968();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (this.field_1318 == Class9.Inner3.SetUp
         || this.field_1318 == Class9.Inner3.Tune
         || this.field_1318 == Class9.Inner3.WaitingToCheckNoteblocks
         || this.field_1322) {
         this.field_1313.set(event.method_1055().method_23760().method_23761());
         this.field_1314.set(RenderSystem.getProjectionMatrix());
         if (this.field_1296.method_671()) {
            if (!this.field_1307.method_671()) {
               for (Entry var9 : this.field_1309.entrySet()) {
                  BlockPos var4 = (BlockPos)var9.getValue();
                  BlockState var5 = c.field_1687.method_8320(var4);
                  if (var5.method_27852(Blocks.field_10179)) {
                     Color var6;
                     Color var7;
                     if (this.field_1311.contains(var4)) {
                        var6 = this.field_1302.method_671();
                        var7 = this.field_1303.method_671();
                     } else if (((Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1)var9.getKey()).method_106() == (Integer)var5.method_11654(NoteBlock.field_11324)) {
                        var6 = this.field_1300.method_671();
                        var7 = this.field_1301.method_671();
                     } else {
                        var6 = this.field_1298.method_671();
                        var7 = this.field_1299.method_671();
                     }

                     this.method_1989(event, var4, var6, var7);
                  }
               }
            } else {
               for (BlockPos var3 : this.field_1310.values()) {
                  this.method_1989(event, var3, this.field_1304.method_671(), this.field_1305.method_671());
               }
            }
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (this.field_1295.method_671()) {
         if (this.field_1318 == Class9.Inner3.SetUp
            || this.field_1318 == Class9.Inner3.Tune
            || this.field_1318 == Class9.Inner3.WaitingToCheckNoteblocks
            || this.field_1322) {
            DrawContext var2 = event.method_1053();
            float var3 = this.field_1306.method_671().floatValue();

            for (BlockPos var5 : this.field_1309.values()) {
               BlockState var6 = c.field_1687.method_8320(var5);
               if (var6.method_27852(Blocks.field_10179)) {
                  Vec3d var7 = this.method_1990(Vec3d.method_24953(var5).method_1031(0.0, 0.75, 0.0));
                  if (var7 != null) {
                     String var8 = String.valueOf(var6.method_11654(NoteBlock.field_11324));
                     String var9 = this.field_1312.containsKey(var5) ? " -" + this.field_1312.get(var5) : null;
                     int var10 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var8, var3);
                     int var11 = var9 != null ? Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var9, var3) : 0;
                     float var12 = (float)var7.field_1352 - (var10 + var11) / 2.0F;
                     float var13 = (float)var7.field_1351 - Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(var3);
                     float var14 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(var2, var8, var12, var13, Color.GREEN.getRGB(), var3);
                     if (var9 != null) {
                        Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(var2, var9, var14, var13, Color.RED.getRGB(), var3);
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: s () void
   private void method_1974() {
      if (this.field_1316 != null) {
         this.field_1316.cancel(true);
         this.field_1316 = null;
      }

      this.field_1311.clear();
      this.field_1312.clear();
      this.field_1309.clear();
      this.field_1310.clear();
      this.field_1323 = false;
      this.field_1324 = 0;
      this.field_1325 = 0;
      this.field_1326 = -1;
      this.field_1319 = Class9.Inner2.None;
      this.field_1322 = false;
      this.field_1318 = Class9.Inner3.None;
      this.field_1317 = null;
   }

   // $VF: renamed from: a (java.lang.String, Dev.ZWare.Client.features.pkg1.pkg1.Class9$Inner2) void
   private void method_1975(String var1, Class9.Inner2 var2) {
      File var3 = this.method_1977(var1);
      if (var3 == null || !var3.exists() || !var3.isFile()) {
         this.method_1994("File not found: %s", var1);
         this.method_1968();
      } else if (!Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_576(var3)) {
         this.method_1994("Unsupported song format: %s", var3.getName());
         this.method_1968();
      } else {
         this.method_1993("Loading song \"%s\".", Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_579(var3));
         this.field_1319 = var2;
         this.field_1318 = Class9.Inner3.LoadingSong;
         long var4 = System.currentTimeMillis();
         CompletableFuture var6 = CompletableFuture.supplyAsync(() -> {
            try {
               return Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_578(this, var3);
            } catch (Exception var3x) {
               throw new RuntimeException(var3x);
            }
         });
         this.field_1316 = var6;
         var6.completeOnTimeout(null, 60L, TimeUnit.SECONDS)
            .whenComplete((var6x, var7) -> c.execute(() -> this.method_1976(var6, var3, var6x, var7, var4, var2)));
      }
   }

   // $VF: renamed from: a (java.util.concurrent.CompletableFuture, java.io.File, Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2, java.lang.Throwable, long, Dev.ZWare.Client.features.pkg1.pkg1.Class9$Inner2) void
   private void method_1976(
      CompletableFuture<Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2> var1,
      File var2,
      Dev.ZWare.Client.pkg1.pkg6.pkg3.Class2 var3,
      Throwable var4,
      long var5,
      Class9.Inner2 var7
   ) {
      if (this.field_1316 == var1) {
         this.field_1316 = null;
         if (var4 == null) {
            if (var3 == null) {
               this.method_1994("Loading song \"%s\" timed out.", Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_579(var2));
               this.method_1968();
            } else {
               this.field_1317 = var3;
               long var10 = System.currentTimeMillis() - var5;
               this.method_1993("Song \"%s\" loaded in %dms.", Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_579(var2), var10);
               if (var7 == Class9.Inner2.Preview) {
                  this.field_1318 = Class9.Inner3.Playing;
                  this.method_1965();
               } else {
                  this.field_1318 = Class9.Inner3.SetUp;
               }
            }
         } else {
            Throwable var8 = var4 instanceof CompletionException var9 && var9.getCause() != null ? var9.getCause() : var4;
            if (var8 instanceof CancellationException) {
               this.method_1994("Loading song \"%s\" was cancelled.", Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_579(var2));
            } else {
               Dev.ZWare.Client.Class1.field_294.error("Failed to load notebot song {}", var2.getName(), var8);
               this.method_1994("Failed to load song \"%s\". See logs for details.", Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_579(var2));
            }

            this.method_1968();
         }
      }
   }

   // $VF: renamed from: a (java.lang.String) java.io.File
   private File method_1977(String var1) {
      if (var1 != null && !var1.isBlank()) {
         Path var2 = Path.of(var1);
         if (var2.isAbsolute()) {
            return var2.toFile();
         } else {
            Path var3 = method_1961();
            Path var4 = var3.resolve(var1).normalize();
            if (Files.exists(var4)) {
               return var4.toFile();
            } else {
               String var5 = var1.toLowerCase(Locale.ROOT);

               try {
                  Optional var6 = Files.list(var3)
                     .filter(var0 -> Files.isRegularFile(var0))
                     .filter(Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4::a)
                     .filter(var1x -> {
                        String var2x = var1x.getFileName().toString().toLowerCase(Locale.ROOT);
                        if (var2x.equals(var5)) {
                           return true;
                        } else {
                           String var3x = Dev.ZWare.Client.pkg1.pkg6.pkg2.Class4.method_579(var1x.toFile()).toLowerCase(Locale.ROOT);
                           return var3x.equals(var5);
                        }
                     })
                     .findFirst();
                  if (var6.isPresent()) {
                     return ((Path)var6.get()).toFile();
                  }
               } catch (IOException var7) {
               }

               return var4.toFile();
            }
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: t () void
   private void method_1978() {
      if (c.field_1724 != null && c.field_1687 != null && c.field_1761 != null) {
         this.field_1310.clear();
         double var1 = 6.0;
         int var3 = MathHelper.method_15384(var1) + 2;
         BlockPos var4 = c.field_1724.method_24515();

         for (int var5 = -var3; var5 < var3; var5++) {
            for (int var6 = -var3; var6 < var3; var6++) {
               for (int var7 = -var3; var7 < var3; var7++) {
                  BlockPos var8 = var4.method_10069(var6, var5 + 1, var7);
                  BlockState var9 = c.field_1687.method_8320(var8);
                  if (var9.method_27852(Blocks.field_10179) && this.method_1988(var8) && c.field_1724.method_56093(var8, 1.0)) {
                     Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var10 = Dev.ZWare.Client.pkg1.pkg6.Class1.method_1021(
                        var9, var8, this.field_1287.method_671(), this.field_1288.method_671().method_1207()
                     );
                     this.field_1310.put(var10, var8.method_10062());
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: u () void
   private void method_1979() {
      this.field_1309.clear();
      ArrayList var1 = new ArrayList<>(this.field_1317.method_276());
      HashMap var2 = new HashMap();
      ArrayList var3 = new ArrayList();

      for (Entry var5 : this.field_1310.asMap().entrySet()) {
         Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var6 = (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1)var5.getKey();
         ArrayList var7 = new ArrayList((Collection)var5.getValue());
         if (var1.contains(var6)) {
            this.field_1309.put(var6, (BlockPos)var7.removeFirst());
            var1.remove(var6);
         }

         if (!var7.isEmpty()) {
            if (this.field_1287.method_671() == Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments) {
               var2.computeIfAbsent(var6.method_104(), var0 -> new ArrayList()).addAll(var7);
            } else {
               var3.addAll(var7);
            }
         }
      }

      if (this.field_1287.method_671() == Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments) {
         for (Entry var13 : var2.entrySet()) {
            List var16 = var1.stream().filter(var1x -> var1x.method_104() == var13.getKey()).collect(Collectors.toCollection(ArrayList::new));
            if (!var16.isEmpty()) {
               for (BlockPos var8 : (List)var13.getValue()) {
                  if (var16.isEmpty()) {
                     break;
                  }

                  Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var9 = (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1)var16.removeFirst();
                  this.field_1309.put(var9, var8);
                  var1.remove(var9);
               }
            }
         }
      } else {
         for (BlockPos var14 : var3) {
            if (var1.isEmpty()) {
               break;
            }

            Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var17 = (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1)var1.removeFirst();
            this.field_1309.put(var17, var14);
         }
      }

      if (!var1.isEmpty()) {
         for (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var15 : var1) {
            this.method_1972("Missing note: %s, %d", var15.method_104(), var15.method_106());
         }

         this.method_1972("%d missing notes.", var1.size());
      }
   }

   // $VF: renamed from: v () void
   private void method_1980() {
      this.field_1312.clear();

      for (Entry var2 : this.field_1309.entrySet()) {
         BlockPos var3 = (BlockPos)var2.getValue();
         BlockState var4 = c.field_1687.method_8320(var3);
         if (var4.method_27852(Blocks.field_10179)) {
            int var5 = (Integer)var4.method_11654(NoteBlock.field_11324);
            int var6 = ((Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1)var2.getKey()).method_106();
            if (var5 != var6) {
               this.field_1312.put(var3, method_1991(var5, var6));
            }
         }
      }
   }

   // $VF: renamed from: w () void
   private void method_1981() {
      if (this.field_1312.isEmpty()) {
         if (this.field_1323) {
            this.field_1323 = false;
            this.field_1326 = this.field_1294.method_671();
            this.field_1318 = Class9.Inner3.WaitingToCheckNoteblocks;
            this.method_1993("Delaying check for noteblocks.");
         } else {
            this.field_1318 = Class9.Inner3.Playing;
            this.method_1993("Loading done.");
            this.method_1965();
         }
      } else if (this.field_1325 >= this.field_1285.method_671()) {
         this.method_1982();
         this.field_1325 = 0;
      }
   }

   // $VF: renamed from: x () void
   private void method_1982() {
      if (c.field_1724 != null && c.field_1687 != null && c.method_1562() != null) {
         if (this.field_1293.method_671()) {
            c.field_1724.method_6104(Hand.field_5808);
         }

         int var1 = 0;
         Iterator var2 = this.field_1312.entrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            BlockPos var4 = (BlockPos)var3.getKey();
            int var5 = (Integer)var3.getValue();
            if (this.field_1290.method_671()) {
               this.method_1987(var4);
            }

            this.method_1983(var4);
            this.field_1311.add(var4);
            var3.setValue(--var5);
            if (var5 <= 0) {
               var2.remove();
            }

            if (++var1 >= this.field_1286.method_671()) {
               return;
            }
         }
      } else {
         this.method_1967();
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   private void method_1983(BlockPos var1) {
      int var2 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
      c.method_1562()
         .method_52787(
            new PlayerInteractBlockC2SPacket(Hand.field_5808, new BlockHitResult(Vec3d.method_24953(var1), Direction.field_11033, var1, false), var2)
         );
      this.field_1323 = true;
   }

   // $VF: renamed from: a (java.util.Collection) void
   private void method_1984(Collection<Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1> var1) {
      if (c.field_1724 != null) {
         for (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var3 : var1) {
            float var4 = (float)Math.pow(2.0, (var3.method_106() - 12) / 12.0);
            if (this.field_1287.method_671() == Dev.ZWare.Client.pkg1.pkg6.Class1.Inner2.ExactInstruments && var3.method_104() != null) {
               c.field_1724.method_5783((SoundEvent)var3.method_104().method_11886().comp_349(), 2.0F, var4);
            } else {
               c.field_1724.method_5783((SoundEvent)SoundEvents.field_15114.comp_349(), 2.0F, var4);
            }
         }
      }
   }

   // $VF: renamed from: b (java.util.Collection) void
   private void method_1985(Collection<Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1> var1) {
      if (c.field_1724 != null && c.method_1562() != null) {
         Optional var2 = var1.stream().findFirst();
         if (this.field_1290.method_671() && var2.isPresent()) {
            BlockPos var3 = this.field_1309.get(var2.get());
            if (var3 != null) {
               this.method_1987(var3);
            }
         }

         if (this.field_1293.method_671()) {
            c.field_1724.method_6104(Hand.field_5808);
         }

         for (Dev.ZWare.Client.pkg1.pkg6.pkg3.Class1 var4 : var1) {
            BlockPos var5 = this.field_1309.get(var4);
            if (var5 != null) {
               this.method_1986(var5);
               if (!this.field_1289.method_671()) {
                  break;
               }
            }
         }
      } else {
         this.method_1967();
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) void
   private void method_1986(BlockPos var1) {
      int var2 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
      c.field_1724.field_3944.method_52787(new PlayerActionC2SPacket(Action.field_12968, var1, Direction.field_11033, var2));
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) void
   private void method_1987(BlockPos var1) {
      if (Dev.ZWare.Client.Class1.field_298 != null) {
         Dev.ZWare.Client.Class1.field_298.method_310(Vec3d.method_24953(var1), 9000.0);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_1988(BlockPos var1) {
      return c.field_1687.method_8320(var1).method_27852(Blocks.field_10179) && c.field_1687.method_8320(var1.method_10084()).method_26215();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.BlockPos, java.awt.Color, java.awt.Color) void
   private void method_1989(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, BlockPos var2, Color var3, Color var4) {
      Box var5 = new Box(var2);
      if (this.field_1297.method_671().method_1081()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var5, var3);
      }

      if (this.field_1297.method_671().method_1080()) {
         Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(var1.method_1055(), var5, var4, 1.0);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_1990(Vec3d var1) {
      Vec3d var2 = c.field_1773.method_19418().method_19326();
      this.field_1315
         .set((float)(var1.field_1352 - var2.field_1352), (float)(var1.field_1351 - var2.field_1351), (float)(var1.field_1350 - var2.field_1350), 1.0F);
      this.field_1315.mul(this.field_1313);
      this.field_1315.mul(this.field_1314);
      if (this.field_1315.w <= 0.0F) {
         return null;
      } else {
         float var3 = 1.0F / this.field_1315.w;
         float var4 = this.field_1315.x * var3;
         float var5 = this.field_1315.y * var3;
         float var6 = this.field_1315.z * var3;
         double var7 = (var4 * 0.5 + 0.5) * c.method_22683().method_4489();
         double var9 = (1.0 - (var5 * 0.5 + 0.5)) * c.method_22683().method_4506();
         double var11 = var7 / c.method_22683().method_4495();
         double var13 = var9 / c.method_22683().method_4495();
         return !Double.isNaN(var11) && !Double.isNaN(var13) && !Double.isInfinite(var11) && !Double.isInfinite(var13) ? new Vec3d(var11, var13, var6) : null;
      }
   }

   // $VF: renamed from: a (int, int) int
   private static int method_1991(int var0, int var1) {
      return var0 > var1 ? 25 - var0 + var1 : var1 - var0;
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   private String method_1992(String var1) {
      String[] var2 = var1.toLowerCase(Locale.ROOT).split("_");
      StringBuilder var3 = new StringBuilder();

      for (String var7 : var2) {
         if (!var7.isEmpty()) {
            var3.append(Character.toUpperCase(var7.charAt(0))).append(var7.substring(1));
         }
      }

      return var3.toString();
   }

   // $VF: renamed from: b (java.lang.String, java.lang.Object[]) void
   private void method_1993(String var1, Object... var2) {
      Dev.ZWare.Client.features.pkg2.Class1.method_1647(String.format(Locale.ROOT, var1, var2));
   }

   // $VF: renamed from: c (java.lang.String, java.lang.Object[]) void
   private void method_1994(String var1, Object... var2) {
      Dev.ZWare.Client.features.pkg2.Class1.method_1647(Formatting.field_1061 + String.format(Locale.ROOT, var1, var2));
   }

   public static enum Inner1 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1080() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1081() {
         return this == Sides || this == Both;
      }
   }

   public static enum Inner2 {
      None,
      Preview,
      Noteblocks;
   }

   public static enum Inner3 {
      None,
      LoadingSong,
      SetUp,
      Tune,
      WaitingToCheckNoteblocks,
      Playing;
   }
}
