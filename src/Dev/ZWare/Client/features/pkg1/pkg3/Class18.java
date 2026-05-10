package Dev.ZWare.Client.features.pkg1.pkg3;

import Dev.ZWare.Client.mixin.Class26;
import com.mojang.blaze3d.systems.RenderSystem;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.Handler;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.InteractType;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket.InteractTypeHandler;
import net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class Class18 extends Dev.ZWare.Client.features.pkg1.Class1 {
   // $VF: renamed from: o double
   private static final double field_2192 = 100.0;
   // $VF: renamed from: p int
   private static final int field_2193 = 3;
   // $VF: renamed from: q double
   private static final double field_2194 = 12.0;
   // $VF: renamed from: r float
   private static final float field_2195 = 0.05F;
   // $VF: renamed from: s float
   private static final float field_2196 = 0.15F;
   // $VF: renamed from: t float
   private static final float field_2197 = 0.35F;
   // $VF: renamed from: u long
   private static final long field_2198 = 500L;
   // $VF: renamed from: v long
   private static final long field_2199 = 3L;
   // $VF: renamed from: w Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2200 = this.a("Place", true).method_683("Place");
   // $VF: renamed from: x Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2201 = this.a("PlaceRange", 3.9, 0.5, 10.0).method_683("Place");
   // $VF: renamed from: y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2202 = this.a("Placement Delay", 0, 0, 20).method_683("Place");
   // $VF: renamed from: z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2203 = this.a("Placement Rotate", true).method_683("Place");
   // $VF: renamed from: A Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2204 = this.a("Placement Swing", true).method_683("Place");
   // $VF: renamed from: B Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2205 = this.a("Placement Swing (Client Side)", false).method_683("Place");
   // $VF: renamed from: C Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2206 = this.a("Placement Ignore Dropped Items", true).method_683("Place");
   // $VF: renamed from: D Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2207 = this.a("Placement Ignore Crystals", true).method_683("Place");
   // $VF: renamed from: E Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2208 = this.a("Placement Strict Direction", true).method_683("Place");
   // $VF: renamed from: F Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2209 = this.a("Preplace", true).method_683("Place");
   // $VF: renamed from: G Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2210 = this.a("Placement Silent Swap", true).method_683("Place");
   // $VF: renamed from: H Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2211 = this.a("Placement Swap Back Timing", 0, 0, 20).method_683("Place");
   // $VF: renamed from: I Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2212 = this.a("Break", true).method_683("Break");
   // $VF: renamed from: J Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2213 = this.a("Break Range", 3.0, 1.0, 7.0).method_683("Break");
   // $VF: renamed from: K Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2214 = this.a("Break Stance Abuse", false).method_683("Break");
   // $VF: renamed from: L Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2215 = this.a("Inhibit", 4, 1, 20).method_683("Break");
   // $VF: renamed from: M Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2216 = this.a("Break Delay", 0, 0, 20).method_683("Break");
   // $VF: renamed from: N Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2217 = this.a("Break Rotate", true).method_683("Break");
   // $VF: renamed from: O Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2218 = this.a("Break Swing", true).method_683("Break");
   // $VF: renamed from: P Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2219 = this.a("Break Swing (Client Side)", false).method_683("Break");
   // $VF: renamed from: Q Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2220 = this.a("Age", 0, 0, 20).method_683("Break");
   // $VF: renamed from: R Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2221 = this.a("Assume Best Armor", true).method_683("Damage");
   // $VF: renamed from: S Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2222 = this.a("Self Pop Avoid", true).method_683("Damage");
   // $VF: renamed from: T Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2223 = this.a("Min Damage", 4.0, 0.0, 36.0).method_683("Damage");
   // $VF: renamed from: U Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2224 = this.a("Damage Sync", false).method_683("Damage");
   // $VF: renamed from: V Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg3.Class4> field_2225 = this.a(
         "Damage Sync Bind", Dev.ZWare.Client.features.pkg3.Class4.method_427()
      )
      .method_683("Damage");
   // $VF: renamed from: W Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2226 = this.a("Max Self Damage", 12.0, 0.0, 36.0).method_683("Damage");
   // $VF: renamed from: X Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2227 = this.a("Balance", 4, 2, 6).method_683("Damage");
   // $VF: renamed from: Y Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2228 = this.a("Health Balance", 0.2, 0.0, 1.0).method_683("Damage");
   // $VF: renamed from: Z Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2229 = this.a("Armor Balance", 0.2, 0.0, 1.0).method_683("Damage");
   // $VF: renamed from: aa Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2230 = this.a("Calc Ignore Double Mine Blocks", true).method_683("Damage");
   // $VF: renamed from: ab Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2231 = this.a("Double Mine Progress Threshold", 80.0, 0.0, 100.0).method_683("Damage");
   // $VF: renamed from: ac Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2232 = this.a("Ignore Terrain", true).method_683("Damage");
   // $VF: renamed from: ad Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2233 = this.a("Wither", false).method_683("Damage");
   // $VF: renamed from: ae Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2234 = this.a("Pause While Eatting", true).method_683("Misc");
   // $VF: renamed from: af Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2235 = this.a("Pause Kill Aura", false).method_683("Misc");
   // $VF: renamed from: ag Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2236 = this.a("Damage Sync Message Time", 1.5, 0.25, 5.0).method_683("Misc");
   // $VF: renamed from: ah Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2237 = this.a("Damage Sync Text Color", 255, 255, 255, 255).method_683("Misc");
   // $VF: renamed from: ai Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2238 = this.a("Damage SyncEnabled Color", 80, 255, 80, 255).method_683("Misc");
   // $VF: renamed from: aj Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2239 = this.a("Damage Sync Disabled Color", 255, 80, 80, 255).method_683("Misc");
   // $VF: renamed from: ak Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2240 = this.a("Render", true).method_683("Render");
   // $VF: renamed from: al Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class18.Inner8> field_2241 = this.a("Render Mode", Class18.Inner8.Fade).method_683("Render");
   // $VF: renamed from: am Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class18.Inner4> field_2242 = this.a("Render Style", Class18.Inner4.Normal).method_683("Render");
   // $VF: renamed from: an Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Class18.Inner14> field_2243 = this.a("Shape Mode", Class18.Inner14.Both).method_683("Render");
   // $VF: renamed from: ao Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2244 = this.a("Damage Render", true).method_683("Render");
   // $VF: renamed from: ap Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2245 = this.a("Damage Render Color", 255, 255, 255, 255).method_683("Render");
   // $VF: renamed from: aq Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2246 = this.a("Damage Render Scale", 1.0F, 0.5F, 3.0F).method_683("Render");
   // $VF: renamed from: ar Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2247 = this.a("Render Time", 0.5, 0.05, 2.0).method_683("Render");
   // $VF: renamed from: as Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2248 = this.a("Slide", false).method_683("Render");
   // $VF: renamed from: at Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Double> field_2249 = this.a("Slide Time", 0.2, 0.01, 1.0).method_683("Render");
   // $VF: renamed from: au Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2250 = this.a("Side Color", 255, 255, 255, 45).method_683("Render");
   // $VF: renamed from: av Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2251 = this.a("Line Color", 255, 255, 255, 170).method_683("Render");
   // $VF: renamed from: aw Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2> field_2252 = this.a(
         "Shader Mode", Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Default
      )
      .method_683("Render");
   // $VF: renamed from: ax Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2253 = this.a("Shader Color", new Color(255, 255, 255, 255)).method_683("Render");
   // $VF: renamed from: ay Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2254 = this.a("Gradient Start Color", new Color(255, 255, 255, 255)).method_683("Render");
   // $VF: renamed from: az Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Color> field_2255 = this.a("Gradient End Color", new Color(255, 0, 255, 255)).method_683("Render");
   // $VF: renamed from: aA Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner1> field_2256 = this.a(
         "Gradient Direction", Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner1.Vertical
      )
      .method_683("Render");
   // $VF: renamed from: aB Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2257 = this.a("Shader Transparency", 0.35F, 0.0F, 1.0F).method_683("Render");
   // $VF: renamed from: aC Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2258 = this.a("Glow Thickness", 2, 0, 10).method_683("Render");
   // $VF: renamed from: aD Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2259 = this.a("Inner Glow", false).method_683("Render");
   // $VF: renamed from: aE Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2260 = this.a("Inner Glow Thickness", 2, 1, 16).method_683("Render");
   // $VF: renamed from: aF Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Integer> field_2261 = this.a("Glow Sample Step", 1, 1, 16).method_683("Render");
   // $VF: renamed from: aG Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2262 = this.a("Glow Intensity", 1.35F, 0.0F, 3.0F).method_683("Render");
   // $VF: renamed from: aH Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<String> field_2263 = this.a("Shader Image", "minecraft:textures/misc/enchanted_glint_item.png")
      .method_683("Render");
   // $VF: renamed from: aI Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2264 = this.a("Rainbow Speed", 0.1F, 0.001F, 2.0F).method_683("Render");
   // $VF: renamed from: aJ Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2265 = this.a("Rainbow Factor", 8.0F, 0.1F, 20.0F).method_683("Render");
   // $VF: renamed from: aK Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2266 = this.a("Rainbow Saturation", 1.0F, 0.0F, 1.0F).method_683("Render");
   // $VF: renamed from: aL Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2267 = this.a("Rainbow Lightness", 0.5F, 0.0F, 1.0F).method_683("Render");
   // $VF: renamed from: aM Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2268 = this.a("Warp Speed", 0.5F, 0.01F, 3.0F).method_683("Render");
   // $VF: renamed from: aN Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2269 = this.a("Warp Scale", 1.0F, 0.25F, 3.0F).method_683("Render");
   // $VF: renamed from: aO Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2270 = this.a("Warp Bump", 0.05F, 0.0F, 0.2F).method_683("Render");
   // $VF: renamed from: aP Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2271 = this.a("Warp Only Fill", false).method_683("Render");
   // $VF: renamed from: aQ Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Float> field_2272 = this.a("Shader Outline Width", 2.2F, 0.5F, 6.0F).method_683("Render");
   // $VF: renamed from: aR Dev.ZWare.Client.features.pkg3.Class8
   private final Dev.ZWare.Client.features.pkg3.Class8<Boolean> field_2273 = this.a("Debug", false).method_683("Render");
   // $VF: renamed from: aS int
   private int field_2274;
   // $VF: renamed from: aT int
   private int field_2275;
   // $VF: renamed from: aU Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13
   private Class18.Inner13 field_2276;
   // $VF: renamed from: aV Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner5
   private Class18.Inner5 field_2277;
   // $VF: renamed from: aW Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner12
   private Class18.Inner12 field_2278;
   // $VF: renamed from: aX float
   public float field_2279;
   // $VF: renamed from: aY float
   private float field_2280;
   // $VF: renamed from: aZ net.minecraft.util.math.BlockPos
   private BlockPos field_2281;
   // $VF: renamed from: a0 long
   private long field_2282;
   // $VF: renamed from: a1 long
   private long field_2283;
   // $VF: renamed from: a2 double
   private double field_2284;
   // $VF: renamed from: a3 net.minecraft.util.math.Box
   private Box field_2285;
   // $VF: renamed from: a4 net.minecraft.util.math.Box
   private Box field_2286;
   // $VF: renamed from: a5 long
   private long field_2287;
   // $VF: renamed from: a6 float
   private float field_2288;
   // $VF: renamed from: a7 net.minecraft.util.math.BlockPos
   private BlockPos field_2289;
   // $VF: renamed from: a8 long
   private long field_2290;
   // $VF: renamed from: a9 net.minecraft.util.math.BlockPos
   private BlockPos field_2291;
   // $VF: renamed from: a_ Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13
   private Class18.Inner13 field_2292;
   // $VF: renamed from: ba long
   private long field_2293;
   // $VF: renamed from: bb net.minecraft.util.math.BlockPos
   private BlockPos field_2294;
   // $VF: renamed from: bc Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner5
   private Class18.Inner5 field_2295;
   // $VF: renamed from: bd net.minecraft.util.math.BlockPos
   private BlockPos field_2296;
   // $VF: renamed from: be long
   private long field_2297;
   // $VF: renamed from: bf boolean
   private boolean field_2298;
   // $VF: renamed from: bg boolean
   private boolean field_2299;
   // $VF: renamed from: bh long
   private long field_2300;
   // $VF: renamed from: bi boolean
   private boolean field_2301;
   // $VF: renamed from: bj boolean
   private boolean field_2302;
   // $VF: renamed from: bk int
   private int field_2303;
   // $VF: renamed from: bl long
   private long field_2304;
   // $VF: renamed from: bm org.joml.Matrix4f
   private final Matrix4f field_2305 = new Matrix4f();
   // $VF: renamed from: bn org.joml.Matrix4f
   private final Matrix4f field_2306 = new Matrix4f();
   // $VF: renamed from: bo org.joml.Vector4f
   private final Vector4f field_2307 = new Vector4f();
   // $VF: renamed from: bp Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner7
   private Class18.Inner7 field_2308;
   // $VF: renamed from: bq it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
   private final Int2IntOpenHashMap field_2309 = new Int2IntOpenHashMap();
   // $VF: renamed from: br it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
   private final Long2IntOpenHashMap field_2310 = new Long2IntOpenHashMap();
   // $VF: renamed from: bs java.util.Set
   private final Set<Integer> field_2311 = ConcurrentHashMap.newKeySet();
   // $VF: renamed from: bt Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13
   private Class18.Inner13 field_2312;
   // $VF: renamed from: bu Dev.ZWare.Client.features.pkg1.pkg3.Class8
   private Class8 field_2313;
   // $VF: renamed from: bv Dev.ZWare.Client.features.pkg1.pkg3.Class3
   private Class3 field_2314;

   public Class18() {
      super("Crystal Aura", "makes crystals place and go boom nigga", Dev.ZWare.Client.features.pkg1.Class1.Inner1.COMBAT, true, false, false);
      this.field_2213.method_709(var1 -> this.field_2212.method_671());
      this.field_2216.method_709(var1 -> this.field_2212.method_671());
      this.field_2217.method_709(var1 -> this.field_2212.method_671());
      this.field_2218.method_709(var1 -> this.field_2212.method_671());
      this.field_2219.method_709(var1 -> this.field_2212.method_671() && this.field_2218.method_671());
      this.field_2220.method_709(var1 -> this.field_2212.method_671());
      this.field_2215.method_709(var1 -> this.field_2212.method_671());
      this.field_2214.method_709(var1 -> this.field_2212.method_671());
      this.field_2202.method_709(var1 -> this.field_2200.method_671());
      this.field_2201.method_709(var1 -> this.field_2200.method_671());
      this.field_2203.method_709(var1 -> this.field_2200.method_671());
      this.field_2204.method_709(var1 -> this.field_2200.method_671());
      this.field_2205.method_709(var1 -> this.field_2200.method_671() && this.field_2204.method_671());
      this.field_2206.method_709(var1 -> this.field_2200.method_671());
      this.field_2210.method_709(var1 -> this.field_2200.method_671());
      this.field_2211.method_709(var0 -> false);
      this.field_2207.method_709(var1 -> this.field_2200.method_671());
      this.field_2208.method_709(var1 -> this.field_2200.method_671());
      this.field_2209.method_709(var1 -> this.field_2200.method_671());
      this.field_2232.method_709(var1 -> this.field_2200.method_671());
      this.field_2241.method_709(var1 -> this.field_2240.method_671());
      this.field_2242.method_709(var1 -> this.field_2240.method_671());
      this.field_2243.method_709(var1 -> this.field_2240.method_671());
      this.field_2244.method_709(var1 -> this.field_2240.method_671());
      this.field_2245.method_709(var1 -> this.field_2240.method_671() && this.field_2244.method_671());
      this.field_2246.method_709(var1 -> this.field_2240.method_671() && this.field_2244.method_671());
      this.field_2247.method_709(var1 -> this.field_2240.method_671());
      this.field_2248.method_709(var1 -> this.field_2240.method_671());
      this.field_2249.method_709(var1 -> this.field_2240.method_671() && this.field_2248.method_671());
      this.field_2250
         .method_709(
            var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Normal && this.field_2243.method_671().method_1127()
         );
      this.field_2251
         .method_709(
            var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Normal && this.field_2243.method_671().method_1126()
         );
      this.field_2252.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
      this.field_2253
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() != Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Gradient
               && this.field_2252.method_671() != Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Rainbow
         );
      this.field_2254
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Gradient
         );
      this.field_2255
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Gradient
         );
      this.field_2256
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Gradient
         );
      this.field_2257.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
      this.field_2258.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
      this.field_2259.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
      this.field_2260.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader && this.field_2259.method_671());
      this.field_2261.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
      this.field_2262.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
      this.field_2263
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Image
         );
      this.field_2264
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Rainbow
         );
      this.field_2265
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Rainbow
         );
      this.field_2266
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Rainbow
         );
      this.field_2267
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Rainbow
         );
      this.field_2268
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Warp
         );
      this.field_2269
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Warp
         );
      this.field_2270
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Warp
         );
      this.field_2271
         .method_709(
            var1 -> this.field_2240.method_671()
               && this.field_2242.method_671() == Class18.Inner4.Shader
               && this.field_2252.method_671() == Dev.ZWare.Client.features.pkg1.pkg5.Class7.Inner2.Warp
         );
      this.field_2272.method_709(var1 -> this.field_2240.method_671() && this.field_2242.method_671() == Class18.Inner4.Shader);
   }

   // $VF: renamed from: c () void
   @Override
   public void method_1887() {
      this.field_2313 = Class8.method_32();
      this.field_2274 = 0;
      this.field_2275 = 0;
      this.field_2279 = 0.0F;
      this.field_2280 = 0.0F;
      this.field_2276 = null;
      this.field_2312 = null;
      this.field_2277 = null;
      this.field_2278 = null;
      this.field_2281 = null;
      this.field_2282 = 0L;
      this.field_2283 = 0L;
      this.field_2284 = 0.0;
      this.field_2285 = null;
      this.field_2286 = null;
      this.field_2287 = 0L;
      this.field_2288 = 0.0F;
      this.field_2289 = null;
      this.field_2290 = 0L;
      this.field_2291 = null;
      this.field_2292 = null;
      this.field_2293 = Long.MIN_VALUE;
      this.field_2294 = null;
      this.field_2295 = null;
      this.field_2296 = null;
      this.field_2297 = Long.MIN_VALUE;
      this.field_2298 = false;
      this.field_2299 = true;
      this.field_2300 = 0L;
      this.field_2301 = this.field_2224.method_671();
      this.field_2303 = -1;
      this.field_2304 = Long.MIN_VALUE;
      this.field_2310.clear();
      this.field_2309.clear();
      this.field_2311.clear();
      this.field_2302 = false;
      this.field_2308 = null;
   }

   // $VF: renamed from: d () void
   @Override
   public void method_1888() {
      long var1 = System.currentTimeMillis();
      this.method_2863(var1);
      this.field_2284 = this.field_2240.method_671() && this.field_2281 != null ? this.method_2859(var1) : 0.0;
      this.field_2283 = this.field_2284 > 0.0 ? var1 : 0L;
      this.field_2277 = null;
      this.field_2278 = null;
      this.field_2289 = null;
      this.field_2290 = 0L;
      this.field_2291 = null;
      this.field_2292 = null;
      this.field_2293 = Long.MIN_VALUE;
      this.field_2294 = null;
      this.field_2295 = null;
      this.field_2296 = null;
      this.field_2297 = Long.MIN_VALUE;
      this.field_2298 = false;
      this.field_2303 = -1;
      this.field_2304 = Long.MIN_VALUE;
      this.field_2302 = false;
   }

   // $VF: renamed from: g () void
   @Override
   public void method_1891() {
      this.method_2939();
   }

   // $VF: renamed from: a () boolean
   public boolean method_2847() {
      return this.d() && this.field_2235.method_671() && this.field_2302;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class5$Inner2) void
   @iFT13zrx_wTXP(
      a = 100
   )
   private void method_2848(Dev.ZWare.Client.pkg2.pkg1.Class5.Inner2 var1) {
      long var2 = System.nanoTime();
      if (!g() && !c.field_1724.method_29504()) {
         if (this.field_2313 == null && Dev.ZWare.Client.Class1.field_316 != null) {
            this.field_2313 = Class8.method_32();
         }

         this.method_2931();
         this.method_2933();
         this.method_2934();
         long var4 = c.field_1687.method_8510();
         Class10.Inner1 var6 = new Class10.Inner1(var4);
         Class10 var7 = this.method_2902(var4, var6);
         boolean var8 = this.method_2901();
         this.field_2312 = var8 ? this.method_2903(var7, var6) : null;
         if (var8) {
            this.method_2890(this.field_2312);
         } else {
            this.method_2891();
         }

         this.field_2277 = var8 ? this.method_2881(this.field_2312) : null;
         this.field_2278 = var8 ? this.method_2907(this.field_2312, this.field_2277) : null;
         if (this.field_2273.method_671()) {
            float var9 = (float)(System.nanoTime() - var6.field_198) / 1000000.0F;
            c.field_1724.method_7353(Text.method_43470(var6.method_426(var9)), true);
         }

         if (this.method_2937()) {
            this.field_2312 = null;
            this.field_2277 = null;
            this.field_2278 = null;
            this.field_2302 = false;
            this.method_2944();
         } else {
            boolean var16 = this.method_2935();
            boolean var10 = this.method_2936();
            boolean var11 = !var10 && this.field_2278 != null && this.field_2278.method_225() == Class18.Inner15.PREPLACE;
            boolean var12 = !var16 && !var11 && this.field_2212.method_671() && this.field_2274 <= 0;
            boolean var13 = !var10 && (var11 || this.field_2200.method_671() && this.field_2275 <= 0 && this.field_2278 != null);
            this.field_2302 = this.method_2938(var16, var10);
            Runnable var14 = () -> this.method_2879(var12, var13);
            Class18.Inner9 var15 = this.method_2882(var12, var13);
            if (var15 != null) {
               Dev.ZWare.Client.Class1.field_298
                  .method_320(var15.method_815(), var15.method_816(), Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3376("CrystalAura", 100.0), var14);
            } else {
               var14.run();
            }

            this.field_2280 = (float)(System.nanoTime() - var2) / 1000000.0F;
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP(
      a = -100
   )
   private void method_2849(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (c.field_1687 != null) {
         if (var1.method_1045() instanceof EntityStatusS2CPacket var2 && var2.method_11470() == 3) {
            Entity var6 = var2.method_11469(c.field_1687);
            if (var6 instanceof PlayerEntity) {
               this.field_2311.add(var6.method_5628());
            }
         }

         if (var1.method_1045() instanceof EntitiesDestroyS2CPacket var4) {
            for (int var8 = 0; var8 < var4.method_36548().size(); var8++) {
               this.field_2309.remove(var4.method_36548().getInt(var8));
            }
         }

         if (var1.method_1045() instanceof EntitySpawnS2CPacket var5 && var5.method_11169() == EntityType.field_6110) {
            this.field_2293 = Math.max(this.field_2293, c.field_1687.method_8510() + 3L);
            this.field_2294 = BlockPos.method_49637(var5.method_11175(), var5.method_11174(), var5.method_11176()).method_10062();
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   @Override
   public void method_1893(Dev.ZWare.Client.pkg2.pkg1.Class3 event) {
      if (event.method_1053() != null) {
         this.method_2850(event);
         this.method_2851(event);
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   private void method_2850(Dev.ZWare.Client.pkg2.pkg1.Class3 var1) {
      if (this.field_2300 > 0L) {
         long var2 = System.currentTimeMillis();
         double var4 = Math.max(0.25, this.field_2236.method_671()) * 1000.0;
         double var6 = MathHelper.method_15350((var2 - this.field_2300) / var4, 0.0, 1.0);
         if (var6 >= 1.0) {
            this.field_2300 = 0L;
         } else {
            String var8 = "Damage Sync toggled: ";
            String var9 = this.field_2301 ? "ON" : "OFF";
            float var10 = (
                  c.method_22683().method_4486() - (Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var8) + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var9))
               )
               / 2.0F;
            float var11 = 12.0F;
            double var12 = 1.0 - var6;
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(var1.method_1053(), var8, var10, var11, this.method_2865(this.field_2237.method_671(), var12).getRGB());
            Dev.ZWare.Client.pkg1.pkg2.Class1.method_124(
               var1.method_1053(),
               var9,
               var10 + Dev.ZWare.Client.pkg1.pkg2.Class1.method_132(var8),
               var11,
               this.method_2865(this.field_2301 ? this.field_2238.method_671() : this.field_2239.method_671(), var12).getRGB()
            );
         }
      }
   }

   // $VF: renamed from: c (Dev.ZWare.Client.pkg2.pkg1.Class3) void
   private void method_2851(Dev.ZWare.Client.pkg2.pkg1.Class3 var1) {
      Class18.Inner7 var2 = this.field_2308;
      if (var2 != null) {
         float var3 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_133(var2.method_1343(), var2.method_1345());
         float var4 = Dev.ZWare.Client.pkg1.pkg2.Class1.method_135(var2.method_1345());
         float var5 = (float)var2.method_1342().field_1352 - var3 / 2.0F;
         float var6 = (float)var2.method_1342().field_1351 - var4 - 2.0F;
         Dev.ZWare.Client.pkg1.pkg2.Class1.method_126(var1.method_1053(), var2.method_1343(), var5, var6, var2.method_1344(), var2.method_1345());
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14) void
   @Override
   public void method_1894(Dev.ZWare.Client.pkg2.pkg1.Class14 event) {
      if (!g() && this.field_2281 != null && this.field_2240.method_671()) {
         long var2 = System.currentTimeMillis();
         double var4 = this.method_2858(var2);
         if (var4 <= 0.0) {
            this.method_2864();
         } else {
            Box var6 = this.method_2862(var2);
            if (var6 == null) {
               this.method_2864();
            } else {
               this.method_2867(event, var6, var4);
               if (this.field_2242.method_671() == Class18.Inner4.Shader) {
                  this.method_2871(event, var6, var4);
               } else {
                  if (this.field_2243.method_671().method_1127()) {
                     Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(event.method_1055(), var6, this.method_2865(this.field_2250.method_671(), var4));
                  }

                  if (this.field_2243.method_671().method_1126()) {
                     Dev.ZWare.Client.pkg1.pkg2.Class2.method_780(event.method_1055(), var6, this.method_2865(this.field_2251.method_671(), var4), 1.0);
                  }
               }
            }
         }
      } else {
         this.field_2308 = null;
      }
   }

   // $VF: renamed from: k () boolean
   @Override
   public boolean method_1895() {
      if (this.field_2300 > 0L) {
         return true;
      } else if (this.field_2240.method_671() && this.field_2244.method_671() && this.field_2281 != null) {
         if (this.method_2858(System.currentTimeMillis()) <= 0.0) {
            this.method_2864();
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: l () boolean
   @Override
   public boolean method_1896() {
      if (this.field_2240.method_671() && this.field_2281 != null) {
         if (this.method_2858(System.currentTimeMillis()) <= 0.0) {
            this.method_2864();
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: b () java.lang.String
   @Override
   public String method_1898() {
      return String.format(Locale.US, "%.2f %.2fms%s", this.field_2279, this.field_2280, this.field_2224.method_671() ? " DS" : "");
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class8) void
   @iFT13zrx_wTXP
   private void method_2852(Dev.ZWare.Client.pkg2.pkg1.Class8 var1) {
      if (var1 != null) {
         this.method_2940(var1.method_1044());
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class1) void
   @iFT13zrx_wTXP
   private void method_2853(Dev.ZWare.Client.pkg2.pkg1.Class1 var1) {
      if (var1 != null && var1.method_1043() == 1 && Dev.ZWare.Client.features.pkg3.Class4.method_429(var1.method_1042())) {
         this.method_2940(Dev.ZWare.Client.features.pkg3.Class4.method_428(var1.method_1042()).method_430());
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, boolean) void
   public void method_2854(BlockPos crystalPos, boolean snapAt) {
      if (this.d() && !g() && crystalPos != null) {
         BlockPos var3 = crystalPos.method_10074();
         if (this.method_2895(var3, crystalPos)) {
            this.field_2291 = var3.method_10062();
            this.field_2292 = null;
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) float
   public float method_2855(BlockPos crystalPos) {
      return !g() && crystalPos != null
         ? this.method_2921(new Vec3d(crystalPos.method_10263() + 0.5, crystalPos.method_10264(), crystalPos.method_10260() + 0.5))
         : -1.0F;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, int) void
   public void method_2856(BlockPos crystalPos, int packets) {
      if (this.d() && !g() && crystalPos != null && packets > 0 && !this.method_2936()) {
         BlockPos var3 = crystalPos.method_10074();
         BlockState var4 = c.field_1687.method_8320(var3);
         if (var4.method_27852(Blocks.field_10540) || var4.method_27852(Blocks.field_9987)) {
            if (this.method_2927(var3, crystalPos)) {
               int var5 = Math.max(1, packets);
               int var6 = 0;

               while (var6 < var5 && this.method_2899(var3)) {
                  var6++;
               }
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, boolean) boolean
   public boolean method_2857(Box box, boolean ignoreItems) {
      return !g() && box != null ? !c.field_1687.method_8333(null, box, var1 -> {
         if (var1 == null || var1.method_31481()) {
            return false;
         } else {
            return ignoreItems && var1 instanceof ItemEntity ? false : !(var1 instanceof ItemEntity var2 && var2.field_6012 < 10);
         }
      }).isEmpty() : false;
   }

   // $VF: renamed from: a (long) double
   private double method_2858(long var1) {
      return this.e() ? this.method_2860(var1) : this.method_2859(var1);
   }

   // $VF: renamed from: b (long) double
   private double method_2859(long var1) {
      double var3 = Math.max(0.05, this.field_2247.method_671()) * 1000.0;
      double var5 = MathHelper.method_15350((var1 - this.field_2282) / var3, 0.0, 1.0);
      if (var5 >= 1.0) {
         return 0.0;
      } else {
         return this.field_2241.method_671() == Class18.Inner8.Fade ? 1.0 - var5 : 1.0;
      }
   }

   // $VF: renamed from: c (long) double
   private double method_2860(long var1) {
      if (this.field_2283 > 0L && !(this.field_2284 <= 0.0)) {
         double var3 = Math.max(0.05, this.field_2247.method_671()) * 1000.0;
         double var5 = MathHelper.method_15350((var1 - this.field_2283) / var3, 0.0, 1.0);
         return var5 >= 1.0 ? 0.0 : this.field_2284 * (1.0 - var5);
      } else {
         return 0.0;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, long) void
   private void method_2861(BlockPos var1, long var2) {
      if (var1 == null) {
         this.method_2864();
      } else {
         Box var4 = new Box(var1);
         Box var5 = this.method_2862(var2);
         this.field_2281 = var1.method_10062();
         this.field_2282 = var2;
         this.field_2283 = 0L;
         this.field_2284 = 0.0;
         if (this.field_2248.method_671() && var5 != null && !var5.equals(var4)) {
            this.field_2285 = var5;
            this.field_2286 = var4;
            this.field_2287 = var2;
         } else {
            this.field_2285 = var4;
            this.field_2286 = var4;
            this.field_2287 = 0L;
         }
      }
   }

   // $VF: renamed from: a (long) net.minecraft.util.math.Box
   private Box method_2862(long var1) {
      if (this.field_2281 == null) {
         return null;
      } else if (this.field_2286 == null) {
         Box var7 = new Box(this.field_2281);
         this.field_2285 = var7;
         this.field_2286 = var7;
         this.field_2287 = 0L;
         return var7;
      } else if (this.field_2248.method_671() && this.field_2285 != null && this.field_2287 > 0L) {
         double var3 = Math.max(0.01, this.field_2249.method_671()) * 1000.0;
         double var5 = MathHelper.method_15350((var1 - this.field_2287) / var3, 0.0, 1.0);
         if (var5 >= 1.0) {
            this.field_2285 = this.field_2286;
            this.field_2287 = 0L;
            return this.field_2286;
         } else {
            return method_2866(this.field_2285, this.field_2286, var5);
         }
      } else {
         return this.field_2286;
      }
   }

   // $VF: renamed from: a (long) void
   private void method_2863(long var1) {
      Box var3 = this.method_2862(var1);
      if (var3 != null) {
         this.field_2285 = var3;
         this.field_2286 = var3;
         this.field_2287 = 0L;
      }
   }

   // $VF: renamed from: n () void
   private void method_2864() {
      this.field_2281 = null;
      this.field_2283 = 0L;
      this.field_2284 = 0.0;
      this.field_2285 = null;
      this.field_2286 = null;
      this.field_2287 = 0L;
      this.field_2308 = null;
   }

   // $VF: renamed from: a (java.awt.Color, double) java.awt.Color
   private Color method_2865(Color var1, double var2) {
      int var4 = MathHelper.method_15340((int)Math.round(var1.getAlpha() * var2), 0, 255);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), var4);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, net.minecraft.util.math.Box, double) net.minecraft.util.math.Box
   private static Box method_2866(Box var0, Box var1, double var2) {
      double var4 = MathHelper.method_15350(var2, 0.0, 1.0);
      return new Box(
         MathHelper.method_16436(var4, var0.field_1323, var1.field_1323),
         MathHelper.method_16436(var4, var0.field_1322, var1.field_1322),
         MathHelper.method_16436(var4, var0.field_1321, var1.field_1321),
         MathHelper.method_16436(var4, var0.field_1320, var1.field_1320),
         MathHelper.method_16436(var4, var0.field_1325, var1.field_1325),
         MathHelper.method_16436(var4, var0.field_1324, var1.field_1324)
      );
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, double) void
   private void method_2867(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, double var3) {
      if (this.field_2244.method_671() && !(this.field_2279 <= 0.0F)) {
         this.field_2305.set(var1.method_1055().method_23760().method_23761());
         this.field_2306.set(RenderSystem.getProjectionMatrix());
         Vec3d var5 = this.method_2868(new Vec3d((var2.field_1323 + var2.field_1320) * 0.5, var2.field_1325 + 0.18, (var2.field_1321 + var2.field_1324) * 0.5));
         if (var5 == null) {
            this.field_2308 = null;
         } else {
            String var6 = String.format(Locale.US, "%.1f", this.field_2279);
            this.field_2308 = new Class18.Inner7(var5, var6, this.method_2865(this.field_2245.method_671(), var3).getRGB(), this.field_2246.method_671());
         }
      } else {
         this.field_2308 = null;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Vec3d
   private Vec3d method_2868(Vec3d var1) {
      Vec3d var2 = c.field_1773.method_19418().method_19326();
      this.field_2307
         .set((float)(var1.field_1352 - var2.field_1352), (float)(var1.field_1351 - var2.field_1351), (float)(var1.field_1350 - var2.field_1350), 1.0F);
      this.field_2307.mul(this.field_2305);
      this.field_2307.mul(this.field_2306);
      if (this.field_2307.w <= 0.0F) {
         return null;
      } else {
         float var3 = 1.0F / this.field_2307.w;
         float var4 = this.field_2307.x * var3;
         float var5 = this.field_2307.y * var3;
         float var6 = this.field_2307.z * var3;
         if (!(var6 < -1.0F) && !(var6 > 1.0F)) {
            double var7 = (var4 * 0.5 + 0.5) * c.method_22683().method_4489();
            double var9 = (1.0 - (var5 * 0.5 + 0.5)) * c.method_22683().method_4506();
            double var11 = var7 / c.method_22683().method_4495();
            double var13 = var9 / c.method_22683().method_4495();
            return !Double.isNaN(var11) && !Double.isNaN(var13) && !Double.isInfinite(var11) && !Double.isInfinite(var13)
               ? new Vec3d(var11, var13, var6)
               : null;
         } else {
            return null;
         }
      }
   }

   // $VF: renamed from: a (double) Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5
   private Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5 method_2869(double var1) {
      float var3 = MathHelper.method_15363(this.field_2257.method_671() * (float)var1, 0.0F, 1.0F);
      return new Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5(
         this.field_2252.method_671(),
         this.field_2253.method_671(),
         this.field_2253.method_671(),
         false,
         this.field_2254.method_671(),
         this.field_2255.method_671(),
         this.field_2256.method_671(),
         var3,
         this.field_2258.method_671(),
         this.field_2259.method_671(),
         this.field_2260.method_671(),
         this.field_2261.method_671(),
         this.field_2262.method_671(),
         this.field_2263.method_671(),
         this.field_2264.method_671(),
         this.field_2265.method_671(),
         this.field_2266.method_671(),
         this.field_2267.method_671(),
         this.field_2268.method_671(),
         this.field_2269.method_671(),
         this.field_2270.method_671(),
         this.field_2271.method_671(),
         this.field_2272.method_671(),
         false
      );
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box, double, Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner10
   private Class18.Inner10 method_2870(Box var1, double var2, Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5 var4) {
      double var5 = Math.max(1.0, (double)var4.method_1318());
      float var7 = MathHelper.method_15363(var4.method_1303(), 0.0F, 1.0F);
      double var8 = System.nanoTime() * 1.0E-9;

      return switch (var4.method_1296()) {
         case Default, Image -> {
            Color var21 = method_2874(var4.method_1297(), var7);
            Color var25 = method_2875(var4.method_1297());
            yield new Class18.Inner10(var21, var21, var25, var5, 0.0, 1.0, 0.0, false);
         }
         case Gradient -> {
            double[] var20 = switch (var4.method_1302()) {
               case Vertical -> new double[]{0.0, 1.0, 0.0};
               case Horizontal -> new double[]{1.0, 0.0, 0.0};
               case Diagonal -> new double[]{0.65, 1.0, 0.65};
            };
            Color var24 = method_2874(var4.method_1300(), var7);
            Color var26 = method_2874(var4.method_1301(), var7);
            Color var28 = method_2875(method_2877(var4.method_1300(), var4.method_1301(), 0.5));
            yield new Class18.Inner10(var24, var26, var28, var5, var20[0], var20[1], var20[2], true);
         }
         case Rainbow -> {
            Color var19 = method_2878(
               var8, var4.method_1310(), var4.method_1311(), var4.method_1312(), var4.method_1313(), var1.field_1323 + var1.field_1322 + var1.field_1321
            );
            Color var23 = method_2878(
               var8, var4.method_1310(), var4.method_1311(), var4.method_1312(), var4.method_1313(), var1.field_1320 + var1.field_1325 + var1.field_1324 + 1.75
            );
            Color var12 = method_2875(
               method_2878(
                  var8,
                  var4.method_1310(),
                  var4.method_1311(),
                  var4.method_1312(),
                  var4.method_1313(),
                  var1.method_1005().field_1352 + var1.method_1005().field_1350 + 0.9
               )
            );
            yield new Class18.Inner10(method_2874(var19, var7), method_2874(var23, var7), var12, var5, 0.45, 1.0, 0.45, true);
         }
         case Warp -> {
            Color var18 = var4.method_1297();
            double var22 = 0.5
               + 0.5 * Math.sin(var8 * Math.max(0.01F, var4.method_1314()) * 4.0 + (var1.field_1323 + var1.field_1324) * Math.max(0.25F, var4.method_1315()));
            double var27 = MathHelper.method_15350(var4.method_1316() * 5.0, 0.0, 1.0);
            Color var29 = method_2874(method_2876(var18, Color.WHITE, Math.min(1.0, 0.15 + var22 * 0.45 + var27 * 0.35)), var7);
            Color var30 = method_2874(method_2876(var18, Color.BLACK, Math.min(1.0, 0.15 + (1.0 - var22) * 0.4 + var27 * 0.2)), var7);
            Color var31 = method_2875(method_2876(var18, Color.WHITE, Math.min(1.0, 0.25 + var22 * 0.35)));
            yield new Class18.Inner10(var29, var30, var31, var5, 0.0, 1.0, 0.0, true);
         }
         case Nebula -> {
            Color var10 = method_2876(var4.method_1297(), new Color(12, 140, 255, 255), 0.55);
            double var11 = 0.5 + 0.5 * Math.sin(var8 * 1.1 + var1.method_1005().field_1352 * 0.8 + var1.method_1005().field_1350 * 0.6);
            double var13 = 0.5 + 0.5 * Math.cos(var8 * 0.75 + var1.field_1322 * 2.0 + var2 * 3.0);
            Color var15 = method_2874(method_2876(var10, Color.WHITE, 0.2 + var11 * 0.3), var7);
            Color var16 = method_2874(method_2876(var10, new Color(0, 18, 70, 255), 0.35 + var13 * 0.35), var7);
            Color var17 = method_2875(method_2876(var10, new Color(160, 225, 255, 255), 0.45 + var11 * 0.2));
            yield new Class18.Inner10(var15, var16, var17, var5, 0.25, 1.0, 0.55, true);
         }
      };
   }

   // $VF: renamed from: b (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, double) void
   private void method_2871(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, double var3) {
      Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5 var5 = this.method_2869(var3);
      Class18.Inner10 var6 = this.method_2870(var2, 1.0 - var3, var5);
      if (!this.method_2873(var1, var2, var6, var5) && (this.field_2243.method_671().method_1127() || this.field_2243.method_671().method_1126())) {
         if (var6.method_1017()) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_777(
               var1.method_1055(), var2, var6.method_1010(), var6.method_1011(), var6.method_1014(), var6.method_1015(), var6.method_1016()
            );
         } else {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var2, var6.method_1010());
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner10) void
   private void method_2872(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, Class18.Inner10 var3) {
      Color var4 = method_2875(var3.method_1010());
      Color var5 = method_2875(var3.method_1011());
      if (this.field_2243.method_671().method_1127() || this.field_2243.method_671().method_1126()) {
         if (var3.method_1017()) {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_777(var1.method_1055(), var2, var4, var5, var3.method_1014(), var3.method_1015(), var3.method_1016());
         } else {
            Dev.ZWare.Client.pkg1.pkg2.Class2.method_776(var1.method_1055(), var2, var4);
         }
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class14, net.minecraft.util.math.Box, Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner10, Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5) boolean
   private boolean method_2873(Dev.ZWare.Client.pkg2.pkg1.Class14 var1, Box var2, Class18.Inner10 var3, Dev.ZWare.Client.pkg1.pkg2.pkg1.Class5 var4) {
      if (Dev.ZWare.Client.Class1.field_306 != null && Dev.ZWare.Client.Class1.field_306.method_793(var4)) {
         try {
            this.method_2872(var1, var2, var3);
         } finally {
            Dev.ZWare.Client.Class1.field_306.method_796();
         }

         return true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (java.awt.Color, float) java.awt.Color
   private static Color method_2874(Color var0, float var1) {
      int var2 = MathHelper.method_15340(Math.round(var0.getAlpha() * var1), 0, 255);
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), var2);
   }

   // $VF: renamed from: a (java.awt.Color) java.awt.Color
   private static Color method_2875(Color var0) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), 255);
   }

   // $VF: renamed from: a (java.awt.Color, java.awt.Color, double) java.awt.Color
   private static Color method_2876(Color var0, Color var1, double var2) {
      return method_2877(var0, var1, MathHelper.method_15350(var2, 0.0, 1.0));
   }

   // $VF: renamed from: b (java.awt.Color, java.awt.Color, double) java.awt.Color
   private static Color method_2877(Color var0, Color var1, double var2) {
      double var4 = MathHelper.method_15350(var2, 0.0, 1.0);
      int var6 = MathHelper.method_15340((int)Math.round(var0.getRed() + (var1.getRed() - var0.getRed()) * var4), 0, 255);
      int var7 = MathHelper.method_15340((int)Math.round(var0.getGreen() + (var1.getGreen() - var0.getGreen()) * var4), 0, 255);
      int var8 = MathHelper.method_15340((int)Math.round(var0.getBlue() + (var1.getBlue() - var0.getBlue()) * var4), 0, 255);
      int var9 = MathHelper.method_15340((int)Math.round(var0.getAlpha() + (var1.getAlpha() - var0.getAlpha()) * var4), 0, 255);
      return new Color(var6, var7, var8, var9);
   }

   // $VF: renamed from: a (double, float, float, float, float, double) java.awt.Color
   private static Color method_2878(double var0, float var2, float var3, float var4, float var5, double var6) {
      double var8 = var0 * Math.max(0.001F, var2) + var6 / Math.max(0.1F, var3);
      var8 -= Math.floor(var8);
      float var10 = MathHelper.method_15363(var4, 0.0F, 1.0F);
      float var11 = MathHelper.method_15363(var5 * 2.0F, 0.0F, 1.0F);
      return Color.getHSBColor((float)var8, var10, var11);
   }

   // $VF: renamed from: a (boolean, boolean) void
   private void method_2879(boolean var1, boolean var2) {
      if (!g()) {
         if (!this.method_2937()) {
            if (var2 && this.field_2278 != null && this.field_2278.method_225() == Class18.Inner15.PREPLACE) {
               this.method_2888(this.field_2278.method_223());
            } else {
               if (var1) {
                  this.method_2883();
               }

               if (var2 && this.field_2278 != null) {
                  if (this.field_2278.method_225() == Class18.Inner15.BASE) {
                     this.method_2897(this.field_2277);
                  } else if (this.field_2312 != null) {
                     this.field_2289 = null;
                     this.method_2887(this.field_2312);
                  }
               }
            }
         }
      }
   }

   // $VF: renamed from: b () boolean
   private boolean method_2880() {
      if (this.field_2314 == null && Dev.ZWare.Client.Class1.field_316 != null) {
         this.field_2314 = Dev.ZWare.Client.Class1.field_316.method_510(Class3.class);
      }

      return this.field_2314 != null && this.field_2314.d();
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner5
   private Class18.Inner5 method_2881(Class18.Inner13 var1) {
      if (this.method_2880() && this.field_2200.method_671() && this.field_2291 == null && this.field_2275 <= 0) {
         long var2 = c.field_1687.method_8510();
         BlockPos var4 = c.field_1724.method_24515();
         boolean var5 = var1 != null;
         if (this.field_2296 != null && this.field_2296.equals(var4) && this.field_2298 == var5 && var2 - this.field_2297 < 3L) {
            return this.field_2295;
         } else {
            this.field_2295 = this.method_2906(var1);
            this.field_2296 = var4.method_10062();
            this.field_2297 = var2;
            this.field_2298 = var5;
            return this.field_2295;
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (boolean, boolean) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner9
   private Class18.Inner9 method_2882(boolean var1, boolean var2) {
      if (var2 && this.field_2203.method_671() && this.field_2278 != null && this.field_2278.method_225() == Class18.Inner15.PREPLACE) {
         EndCrystalEntity var9 = this.method_2926(this.field_2278.method_223().method_10084());
         if (var9 != null && this.field_2212.method_671() && this.field_2274 <= 0) {
            Box var11 = var9.method_5829();
            Vec3d var12 = this.method_2955(var11);
            Vec3d var13 = Dev.ZWare.Client.pkg1.Class3.method_591(var11, var12);
            float[] var14 = Dev.ZWare.Client.Class1.field_298.method_331(var12, var13);
            return new Class18.Inner9(var14[0], var14[1]);
         } else {
            float[] var10 = Dev.ZWare.Client.Class1.field_298.method_332(this.field_2278.method_223().method_46558());
            return new Class18.Inner9(var10[0], var10[1]);
         }
      } else {
         if (var1 && this.field_2217.method_671()) {
            Class18.Inner11 var3 = this.method_2884();
            if (var3 != null) {
               Box var4 = var3.method_461().method_5829();
               Vec3d var5 = this.method_2955(var4);
               Vec3d var6 = Dev.ZWare.Client.pkg1.Class3.method_591(var4, var5);
               float[] var7 = Dev.ZWare.Client.Class1.field_298.method_331(var5, var6);
               return new Class18.Inner9(var7[0], var7[1]);
            }
         }

         if (var2 && this.field_2203.method_671() && this.field_2278 != null) {
            float[] var8 = Dev.ZWare.Client.Class1.field_298.method_332(this.field_2278.method_223().method_46558());
            return new Class18.Inner9(var8[0], var8[1]);
         } else {
            return null;
         }
      }
   }

   // $VF: renamed from: o () void
   private void method_2883() {
      Class18.Inner11 var1 = this.method_2884();
      if (var1 != null && !this.method_2935()) {
         this.method_2886(var1.method_461());
      } else {
         this.method_2944();
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner11
   private Class18.Inner11 method_2884() {
      Class18.Inner11 var1 = null;
      Box var2 = c.field_1724.method_5829().method_1014(this.field_2213.method_671() + 2.0);

      for (EndCrystalEntity var4 : c.field_1687.method_8390(EndCrystalEntity.class, var2, var0 -> true)) {
         if (var4.field_6012 >= this.field_2220.method_671()) {
            long var5 = var4.method_24515().method_10063();
            if (var4.field_6012 >= 5 || this.field_2310.containsKey(var5)) {
               Box var7 = var4.method_5829();
               Vec3d var8 = this.method_2955(var7);
               if (!(Dev.ZWare.Client.pkg1.Class7.method_121(var8, var7) > this.field_2213.method_671() * this.field_2213.method_671())) {
                  float var9 = this.method_2923(var4.method_19538());
                  if (!(var9 <= -0.9F) && (var1 == null || var9 > var1.method_462())) {
                     var1 = new Class18.Inner11(var4, var9);
                  }
               }
            }
         }
      }

      return var1 != null && var1.method_462() <= 0.0F ? null : var1;
   }

   // $VF: renamed from: a (net.minecraft.entity.decoration.EndCrystalEntity) boolean
   private boolean method_2885(EndCrystalEntity var1) {
      if (!this.field_2217.method_671()) {
         return true;
      } else {
         Box var2 = var1.method_5829();
         Vec3d var3 = this.method_2955(var2);
         return var2.method_1006(var3) || Dev.ZWare.Client.Class1.field_298.method_341(var3, c.field_1724.method_36454(), c.field_1724.method_36455(), var2);
      }
   }

   // $VF: renamed from: b (net.minecraft.entity.decoration.EndCrystalEntity) boolean
   private boolean method_2886(EndCrystalEntity var1) {
      if (var1 != null && !this.method_2935()) {
         if (this.method_2885(var1) && var1.field_6012 >= this.field_2220.method_671()) {
            int var2 = var1.method_5628();
            int var3 = this.field_2309.get(var2);
            if (var3 >= this.field_2215.method_671() && var1.field_6012 < 20) {
               return false;
            } else {
               c.field_1761.method_2918(c.field_1724, var1);
               if (this.field_2218.method_671()) {
                  c.field_1724.method_23667(Hand.field_5808, this.field_2219.method_671());
               }

               this.field_2309.put(var2, var3 + 1);
               this.field_2274 = this.field_2216.method_671();
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13) void
   private void method_2887(Class18.Inner13 var1) {
      if (var1 == null || var1.method_583() < 0.0F || this.method_2936()) {
         this.method_2944();
      } else if (this.method_2899(var1.method_582().method_10074())) {
         this.field_2276 = var1;
         this.field_2279 = var1.method_583();
         this.method_2861(var1.method_582().method_10074(), System.currentTimeMillis());
         this.field_2310.put(var1.method_582().method_10063(), 0);
         this.field_2275 = this.field_2202.method_671();
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   private void method_2888(BlockPos var1) {
      if (var1 != null && !this.method_2936()) {
         BlockPos var2 = var1.method_10084();
         if (!this.method_2927(var1, var2)) {
            int var3 = this.method_2892(var2);
            if (var3 < 0) {
               if (!this.method_2895(var1, var2)) {
                  this.method_2891();
               }

               return;
            }

            if (this.method_2896(var2, var3)) {
               if (!this.method_2895(var1, var2)) {
                  this.method_2891();
               }

               return;
            }
         }

         if (this.method_2899(var1)) {
            this.method_2889(var1);
         }
      } else {
         this.method_2891();
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) void
   private void method_2889(BlockPos var1) {
      Class18.Inner13 var2 = this.field_2292;
      BlockPos var3 = var1.method_10084();
      this.method_2891();
      long var4 = System.currentTimeMillis();
      this.field_2289 = null;
      if (var2 != null && var1.equals(var2.method_582().method_10074())) {
         this.field_2276 = var2;
         this.field_2279 = var2.method_583();
      } else {
         this.field_2276 = null;
         this.field_2279 = 0.0F;
      }

      this.method_2861(var1, var4);
      this.field_2310.put(var3.method_10063(), 0);
      this.field_2275 = this.field_2202.method_671();
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13) void
   private void method_2890(Class18.Inner13 var1) {
      if (this.method_2932()) {
         if (!this.d() || g() || !this.field_2200.method_671() || !this.field_2209.method_671()) {
            this.field_2293 = Long.MIN_VALUE;
         } else if (!this.method_2936()) {
            Class18.Inner13 var2 = var1 != null ? var1 : this.method_2894();
            if (var2 != null) {
               BlockPos var3 = var2.method_582().method_10074();
               if (this.method_2895(var3, var2.method_582())) {
                  this.field_2291 = var3.method_10062();
                  this.field_2292 = var2;
                  this.field_2293 = Long.MIN_VALUE;
                  this.field_2294 = null;
               }
            }
         }
      }
   }

   // $VF: renamed from: p () void
   private void method_2891() {
      this.field_2291 = null;
      this.field_2292 = null;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) int
   private int method_2892(BlockPos var1) {
      if (this.field_2212.method_671() && this.field_2274 <= 0 && var1 != null) {
         EndCrystalEntity var2 = this.method_2926(var1);
         return var2 != null && this.method_2886(var2) ? var2.method_5628() : -1;
      } else {
         return -1;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2893(BlockPos var1, BlockPos var2) {
      return this.method_2895(var1, var2);
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13
   private Class18.Inner13 method_2894() {
      if (this.field_2294 != null && !g()) {
         BlockPos var1 = this.field_2294.method_10062();
         BlockPos var2 = var1.method_10074();
         if (!this.method_2895(var2, var1)) {
            return null;
         } else {
            float var3 = this.method_2855(var1);
            float var4 = var3 >= 0.0F ? var3 : 0.0F;
            Vec3d var5 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
            double var6 = var5.method_1025(Vec3d.method_24953(var2));
            return new Class18.Inner13(var1, var4, this.method_2930(var1), 0.0, var6, 0.0);
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2895(BlockPos var1, BlockPos var2) {
      if (var1 != null && var2 != null && !g()) {
         BlockState var3 = c.field_1687.method_8320(var1);
         if (!var3.method_27852(Blocks.field_10540) && !var3.method_27852(Blocks.field_9987)) {
            return false;
         } else if (!this.method_2928(var2)) {
            return false;
         } else {
            EndCrystalEntity var4 = this.method_2926(var2);
            return var4 == null ? !this.method_2925(var1, var2) : !this.method_2896(var2, var4.method_5628());
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, int) boolean
   private boolean method_2896(BlockPos var1, int var2) {
      Box var3 = this.method_2957(var1);
      long var4 = var1.method_10063();

      for (Entity var7 : c.field_1687.method_8335(null, var3)) {
         if (var7.method_5628() != var2
            && (!this.field_2206.method_671() || !(var7 instanceof ItemEntity))
            && (!(var7 instanceof ItemEntity var8) || var8.field_6012 >= 10)
            && (!(var7 instanceof EndCrystalEntity var9) || !var9.method_24515().equals(var1) || !this.method_2929(var9, var4))) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner5) void
   private void method_2897(Class18.Inner5 var1) {
      if (var1 != null && !(var1.method_879() < 0.0F) && !this.method_2936()) {
         if (this.field_2289 == null) {
            this.method_2898(var1.method_878(), var1.method_879());
         } else {
            Block var2 = c.field_1687.method_8320(this.field_2289).method_26204();
            if (var2 != Blocks.field_10540 && var2 != Blocks.field_9987) {
               if (System.currentTimeMillis() - this.field_2290 >= 500L) {
                  this.method_2898(var1.method_878(), var1.method_879());
               }
            } else {
               this.field_2289 = null;
            }
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, float) boolean
   private boolean method_2898(BlockPos var1, float var2) {
      if (var1 != null && !g()) {
         BlockPos var3 = var1.method_10084();
         if (!this.method_2927(var1, var3)) {
            this.field_2289 = null;
            return false;
         } else {
            Block var4 = c.field_1687.method_8320(var1).method_26204();
            if (var4 != Blocks.field_10540 && var4 != Blocks.field_9987) {
               if (!Dev.ZWare.Client.Class1.field_301.method_914(var1, c.field_1687.method_8320(var1), Blocks.field_10540.method_8389())) {
                  return false;
               } else {
                  boolean var5 = false;

                  try {
                     var5 = Dev.ZWare.Client.Class1.field_301.method_918(Blocks.field_10540.method_8389(), var1);
                  } finally {
                     Dev.ZWare.Client.Class1.field_301.method_929();
                  }

                  if (!var5) {
                     return false;
                  } else {
                     long var6 = System.currentTimeMillis();
                     this.field_2289 = var1.method_10062();
                     this.field_2290 = var6;
                     this.field_2276 = null;
                     this.field_2279 = var2;
                     this.method_2861(var1, var6);
                     return true;
                  }
               }
            } else {
               this.field_2289 = null;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2899(BlockPos var1) {
      if (!this.method_2901()) {
         return false;
      } else {
         Class18.Inner3 var2 = this.method_2959();
         if (var2 == null) {
            return false;
         } else {
            try {
               BlockHitResult var3 = Dev.ZWare.Client.pkg1.Class14.method_507(var1, this.method_2900());
               if (var3 == null) {
                  if (this.field_2208.method_671()) {
                     return false;
                  }

                  var3 = new BlockHitResult(var1.method_46558().method_1031(0.0, 0.5, 0.0), Direction.field_11036, var1, false);
               }

               int var4 = ((Class26)c.field_1687).getPendingUpdateManager().method_41937().method_41942();
               c.method_1562().method_52787(new PlayerInteractBlockC2SPacket(Hand.field_5808, var3, var4));
               if (this.field_2204.method_671()) {
                  c.field_1724.method_23667(Hand.field_5808, this.field_2205.method_671());
               }

               return true;
            } finally {
               this.method_2960(var2);
            }
         }
      }
   }

   // $VF: renamed from: a () double
   private double method_2900() {
      return this.field_2201.method_671();
   }

   // $VF: renamed from: c () boolean
   private boolean method_2901() {
      if (g()) {
         return false;
      } else {
         return c.field_1724.method_6047().method_31574(Items.field_8301)
            ? true
            : this.field_2210.method_671() && Dev.ZWare.Client.Class1.field_300 != null && Dev.ZWare.Client.Class1.field_300.method_559(Items.field_8301);
      }
   }

   // $VF: renamed from: a (long, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner1) Dev.ZWare.Client.features.pkg1.pkg3.Class10
   private Class10 method_2902(long var1, Class10.Inner1 var3) {
      Vec3d var4 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
      BlockPos var5 = c.field_1724.method_24515();
      BlockPos var6 = BlockPos.method_49638(var4);
      ArrayList var7 = new ArrayList();

      for (PlayerEntity var9 : c.field_1687.method_18456()) {
         var3.field_199++;
         if (this.method_2946(var9)) {
            var3.field_200++;
            var7.add(this.method_2949(var9));
         }
      }

      if (this.field_2233.method_671()) {
         for (WitherEntity var20 : c.field_1687
            .method_8390(WitherEntity.class, c.field_1724.method_5829().method_1014(this.method_2900() + 12.0 + 2.0), var0 -> true)) {
            var3.field_199++;
            if (this.method_2947(var20)) {
               var3.field_200++;
               var7.add(this.method_2950(var20));
            }
         }
      }

      int var19 = (int)Math.ceil(this.method_2900());
      int var21 = var19 * var19;
      ArrayList var10 = new ArrayList();
      Set var11 = this.method_2920();

      for (int var12 = -var19; var12 <= var19; var12++) {
         for (int var13 = -var19; var13 <= var19; var13++) {
            for (int var14 = -var19; var14 <= var19; var14++) {
               if (var12 * var12 + var13 * var13 + var14 * var14 <= var21) {
                  BlockPos var15 = var6.method_10069(var12, var13, var14);
                  BlockPos var16 = var15.method_10074();
                  BlockState var17 = c.field_1687.method_8320(var16);
                  if (!var17.method_27852(Blocks.field_10540) && !var17.method_27852(Blocks.field_9987)) {
                     var3.field_203++;
                  } else if (!this.method_2928(var15)) {
                     var3.field_204++;
                  } else if (!this.method_2958(var4, var16)) {
                     var3.field_205++;
                  } else if (this.method_2925(var16, var15)) {
                     var3.field_202++;
                  } else {
                     var3.field_201++;
                     var10.add(var15.method_10062());
                  }
               }
            }
         }
      }

      return new Class10(
         var1,
         c.field_1724.method_5628(),
         var4,
         var5,
         this.method_2900(),
         this.field_2213.method_671(),
         this.field_2223.method_671(),
         this.field_2221.method_671(),
         c.field_1687.method_8407(),
         true,
         c.field_1687,
         var7.toArray(new Class10.Inner2[0]),
         var10.toArray(new BlockPos[0]),
         var11
      );
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class10, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner1) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13
   private Class18.Inner13 method_2903(Class10 var1, Class10.Inner1 var2) {
      Class18.Inner13 var3 = null;
      Class10.Inner2 var4 = null;

      for (Class10.Inner2 var8 : var1.method_1425()) {
         if (var8.method_1492() == var1.method_1415()) {
            var4 = var8;
            break;
         }
      }

      for (Class10.Inner2 var14 : var1.method_1425()) {
         if (var14.method_1492() != var1.method_1415()
            && !(
               var1.method_1424().method_8469(var14.method_1492()) instanceof PlayerEntity var10
                  && Dev.ZWare.Client.Class1.field_310 != null
                  && Dev.ZWare.Client.Class1.field_310.method_377(var10)
            )) {
            Class18.Inner13 var15 = this.method_2904(var1, var14, var4);
            if (var15 != null && this.method_2905(var15, var3)) {
               var3 = var15;
            }
         }
      }

      if (var3 != null) {
         var2.field_210 = 1;
      }

      return var3;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class10, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13
   private Class18.Inner13 method_2904(Class10 var1, Class10.Inner2 var2, Class10.Inner2 var3) {
      Class18.Inner13 var4 = null;

      for (BlockPos var8 : var1.method_1426()) {
         BlockPos var9 = var8.method_10074();
         Vec3d var10 = new Vec3d(var9.method_10263() + 0.5, var9.method_10264() + 1.0, var9.method_10260() + 0.5);
         float var11 = this.method_2909(var10, var2, var1.method_1427(), var1.method_1422(), var1.method_1423(), var1.method_1421(), var1.method_1424());
         if (!(var11 <= 0.0F)) {
            if (var3 != null) {
               float var12 = this.method_2909(var10, var3, var1.method_1427(), var1.method_1422(), var1.method_1423(), var1.method_1421(), var1.method_1424());
               if (var12 > this.field_2226.method_671()
                  || this.field_2222.method_671() && c.field_1724 != null && var12 + 1.5F >= c.field_1724.method_6032() + c.field_1724.method_6067()) {
                  continue;
               }
            }

            double var21 = this.method_2945(var2.method_1501(), var2.method_1502(), var2.method_1503());
            if (!(var11 < var21)) {
               double var14 = this.method_2914(var10, var2.method_1494());
               double var16 = var1.method_1416().method_1025(Vec3d.method_24953(var9));
               double var18 = this.method_2915(var10.field_1351, var2.method_1494());
               Class18.Inner13 var20 = new Class18.Inner13(var8, var11, this.method_2930(var8), var14, var16, var18);
               if (this.method_2905(var20, var4)) {
                  var4 = var20;
               }
            }
         }
      }

      return var4;
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13, Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13) boolean
   private boolean method_2905(Class18.Inner13 var1, Class18.Inner13 var2) {
      if (var1 == null) {
         return false;
      } else if (var2 == null) {
         return true;
      } else {
         float var3 = var1.method_583() - var2.method_583();
         if (var1.method_584() != var2.method_584() && Math.abs(var3) <= 0.15F) {
            return !var1.method_584();
         } else if (var3 > 0.35F) {
            return true;
         } else if (var3 < -0.35F) {
            return false;
         } else if (var2.method_584() && !var1.method_584()) {
            return true;
         } else if (!var2.method_584() && var1.method_584()) {
            return false;
         } else if (var1.method_585() + 1.0E-4 < var2.method_585()) {
            return true;
         } else if (var1.method_585() > var2.method_585() + 1.0E-4) {
            return false;
         } else if (var1.method_587() + 1.0E-4 < var2.method_587()) {
            return true;
         } else if (var1.method_587() > var2.method_587() + 1.0E-4) {
            return false;
         } else if (var1.method_586() + 1.0E-4 < var2.method_586()) {
            return true;
         } else {
            return var1.method_586() > var2.method_586() + 1.0E-4 ? false : var3 > 0.0F;
         }
      }
   }

   // $VF: renamed from: b (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner5
   private Class18.Inner5 method_2906(Class18.Inner13 var1) {
      int var2 = (int)Math.ceil(this.method_2900());
      Vec3d var3 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
      BlockPos var4 = BlockPos.method_49638(var3);
      float var5 = -1.0F;
      BlockPos var6 = null;

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            for (int var9 = -var2; var9 <= var2; var9++) {
               BlockPos var10 = var4.method_10069(var7, var8, var9);
               BlockPos var11 = var10.method_10074();
               BlockState var12 = c.field_1687.method_8320(var11);
               if (!var12.method_27852(Blocks.field_10540)
                  && !var12.method_27852(Blocks.field_9987)
                  && (var12.method_26215() || var12.method_45474())
                  && this.method_2928(var10)) {
                  double var13 = this.method_2900();
                  if (!(Dev.ZWare.Client.pkg1.Class7.method_121(var3, new Box(var11)) > var13 * var13) && !this.method_2925(var11, var10)) {
                     HashMap var15 = new HashMap();
                     var15.put(var11.method_10062(), Blocks.field_10540.method_9564());
                     float var16 = this.method_2922(new Vec3d(var11.method_10263() + 0.5, var11.method_10264() + 1.0, var11.method_10260() + 0.5), var15);
                     if (!(var16 < 0.0F) && var16 > var5) {
                        var5 = var16;
                        var6 = var11.method_10062();
                     }
                  }
               }
            }
         }
      }

      if (var6 != null) {
         this.field_2288 = var5;
         return new Class18.Inner5(var6, var5);
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner13, Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner5) Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner12
   private Class18.Inner12 method_2907(Class18.Inner13 var1, Class18.Inner5 var2) {
      if (this.field_2291 != null) {
         float var5 = this.field_2292 != null ? this.field_2292.method_583() : 0.0F;
         return new Class18.Inner12(this.field_2291.method_10062(), var5, Class18.Inner15.PREPLACE);
      } else {
         if (var2 != null) {
            float var3 = var1 != null ? var1.method_583() : 0.0F;
            boolean var4 = var1 == null ? var2.method_879() >= 10.0F : var2.method_879() >= var3 + 10.0F;
            if (var4) {
               return new Class18.Inner12(var2.method_878(), var2.method_879(), Class18.Inner15.BASE);
            }
         }

         return var1 != null ? new Class18.Inner12(var1.method_582().method_10074(), var1.method_583(), Class18.Inner15.CRYSTAL) : null;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, Dev.ZWare.Client.features.pkg1.pkg3.Class10, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner1) float
   private float method_2908(Vec3d var1, Class10 var2, Class10.Inner1 var3) {
      float var4 = 0.0F;
      boolean var5 = false;

      for (Class10.Inner2 var9 : var2.method_1425()) {
         float var10 = this.method_2909(var1, var9, var2.method_1427(), var2.method_1422(), var2.method_1423(), var2.method_1421(), var2.method_1424());
         if (!(var10 <= 0.0F)) {
            if (var9.method_1492() == var2.method_1415()) {
               if (var10 > this.field_2226.method_671()) {
                  var3.field_208++;
                  return -1.0F;
               }

               if (this.field_2222.method_671() && var10 + 1.5F >= var9.method_1501() + var9.method_1502()) {
                  var3.field_209++;
                  return -1.0F;
               }
            } else if (!(
               var2.method_1424().method_8469(var9.method_1492()) instanceof PlayerEntity var12
                  && Dev.ZWare.Client.Class1.field_310 != null
                  && Dev.ZWare.Client.Class1.field_310.method_377(var12)
            )) {
               double var14 = this.method_2945(var9.method_1501(), var9.method_1502(), var9.method_1503());
               if (var10 < var14) {
                  var3.field_207++;
               } else {
                  var4 += var10;
                  var5 = true;
               }
            }
         }
      }

      return var5 ? var4 : -1.0F;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2, java.util.Set, net.minecraft.world.Difficulty, boolean, boolean, net.minecraft.world.World) float
   private float method_2909(Vec3d var1, Class10.Inner2 var2, Set<BlockPos> var3, Difficulty var4, boolean var5, boolean var6, World var7) {
      return this.method_2910(var1, var2, var3, var4, var5, var6, var7, null);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2, java.util.Set, net.minecraft.world.Difficulty, boolean, boolean, net.minecraft.world.World, java.util.Map) float
   private float method_2910(
      Vec3d var1, Class10.Inner2 var2, Set<BlockPos> var3, Difficulty var4, boolean var5, boolean var6, World var7, Map<BlockPos, BlockState> var8
   ) {
      double var9 = var2.method_1493().method_1022(var1);
      if (var9 > 12.0) {
         return 0.0F;
      } else {
         double var11 = this.method_2917(var1, var2.method_1494(), var3, var7, var8);
         if (var11 <= 0.0) {
            return 0.0F;
         } else {
            double var13 = (1.0 - var9 / 12.0) * var11;
            if (var13 <= 0.0) {
               return 0.0F;
            } else {
               float var15 = (float)((var13 * var13 + var13) * 0.5 * 7.0 * 12.0 + 1.0);
               return this.method_2911(var15, var2, var4, var5, var6);
            }
         }
      }
   }

   // $VF: renamed from: a (float, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2, net.minecraft.world.Difficulty, boolean, boolean) float
   private float method_2911(float var1, Class10.Inner2 var2, Difficulty var3, boolean var4, boolean var5) {
      if (var4) {
         switch (var3) {
            case field_5801:
               var1 = 0.0F;
               break;
            case field_5805:
               var1 = Math.min(var1 / 2.0F + 1.0F, var1);
               break;
            case field_5807:
               var1 *= 1.5F;
         }
      }

      var1 = method_2919(var1, var2.method_1495(), var2.method_1496());
      if (var2.method_1497() >= 0) {
         var1 *= 1.0F - 0.2F * (var2.method_1497() + 1);
      }

      var1 = this.method_2912(var1, var2, var5);
      return Math.max(var1, 0.0F);
   }

   // $VF: renamed from: a (float, Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2, boolean) float
   private float method_2912(float var1, Class10.Inner2 var2, boolean var3) {
      int var4 = 0;
      if (var3) {
         if ((var2.method_1498() & 1) != 0) {
            var4 += 4;
         }

         if ((var2.method_1498() & 2) != 0) {
            var4 += 4;
         }

         if ((var2.method_1498() & 8) != 0) {
            var4 += 4;
         }

         if ((var2.method_1498() & 4) != 0) {
            var4 += 8;
         }
      } else {
         var4 += var2.method_1499();
         var4 += 2 * var2.method_1500();
      }

      var4 = MathHelper.method_15340(var4, 0, 20);
      return var1 * (1.0F - var4 / 25.0F);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Box, java.util.Set, net.minecraft.world.World) float
   private float method_2913(Vec3d var1, Box var2, Set<BlockPos> var3, World var4) {
      return this.method_2917(var1, var2, var3, var4, null);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Box) double
   private double method_2914(Vec3d var1, Box var2) {
      double var3 = this.method_2916(var1.field_1352, var2.field_1323, var2.field_1320);
      double var5 = this.method_2916(var1.field_1350, var2.field_1321, var2.field_1324);
      return var3 * var3 + var5 * var5;
   }

   // $VF: renamed from: a (double, net.minecraft.util.math.Box) double
   private double method_2915(double var1, Box var3) {
      return this.method_2916(var1, var3.field_1322, var3.field_1325);
   }

   // $VF: renamed from: a (double, double, double) double
   private double method_2916(double var1, double var3, double var5) {
      if (var1 < var3) {
         return var3 - var1;
      } else {
         return var1 > var5 ? var1 - var5 : 0.0;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.Box, java.util.Set, net.minecraft.world.World, java.util.Map) float
   private float method_2917(Vec3d var1, Box var2, Set<BlockPos> var3, World var4, Map<BlockPos, BlockState> var5) {
      double var6 = 1.0 / ((var2.field_1320 - var2.field_1323) * 2.0 + 1.0);
      double var8 = 1.0 / ((var2.field_1325 - var2.field_1322) * 2.0 + 1.0);
      double var10 = 1.0 / ((var2.field_1324 - var2.field_1321) * 2.0 + 1.0);
      double var12 = (1.0 - Math.floor(1.0 / var6) * var6) * 0.5;
      double var14 = (1.0 - Math.floor(1.0 / var10) * var10) * 0.5;
      if (!(var6 <= 0.0) && !(var8 <= 0.0) && !(var10 <= 0.0)) {
         int var16 = 0;
         int var17 = 0;

         for (double var18 = 0.0; var18 <= 1.0; var18 += var6) {
            for (double var20 = 0.0; var20 <= 1.0; var20 += var8) {
               for (double var22 = 0.0; var22 <= 1.0; var22 += var10) {
                  Vec3d var24 = new Vec3d(
                     MathHelper.method_16436(var18, var2.field_1323, var2.field_1320) + var12,
                     MathHelper.method_16436(var20, var2.field_1322, var2.field_1325),
                     MathHelper.method_16436(var22, var2.field_1321, var2.field_1324) + var14
                  );
                  if (this.method_2918(new Class18.Inner1(var24, var1, var3, var4, var5)) == null) {
                     var16++;
                  }

                  var17++;
               }
            }
         }

         return var17 == 0 ? 0.0F : (float)var16 / var17;
      } else {
         return 0.0F;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner1) net.minecraft.util.hit.BlockHitResult
   private BlockHitResult method_2918(Class18.Inner1 var1) {
      return (BlockHitResult)BlockView.method_17744(
         var1.method_502(),
         var1.method_503(),
         var1,
         (var1x, var2) -> {
            if (var1x.method_504() != null && var1x.method_504().contains(var2)) {
               return null;
            } else {
               BlockState var3 = var1x.method_506() != null && var1x.method_506().containsKey(var2)
                  ? var1x.method_506().get(var2)
                  : var1x.method_505().method_8320(var2);
               return this.field_2232.method_671() && var3.method_26204().method_9520() < 600.0F
                  ? null
                  : var3.method_26220(var1x.method_505(), var2).method_1092(var1x.method_502(), var1x.method_503(), var2);
            }
         },
         var0 -> null
      );
   }

   // $VF: renamed from: a (float, float, float) float
   private static float method_2919(float var0, float var1, float var2) {
      float var3 = 2.0F + var2 / 4.0F;
      float var4 = MathHelper.method_15363(var1 - var0 / var3, var1 * 0.2F, 20.0F);
      return var0 * (1.0F - var4 / 25.0F);
   }

   // $VF: renamed from: a () java.util.Set
   private Set<BlockPos> method_2920() {
      HashSet var1 = new HashSet();
      if (this.field_2230.method_671() && this.field_2313 != null) {
         double var2 = this.field_2231.method_671() / 100.0;
         BlockPos var4 = this.field_2313.method_22();
         if (var4 != null && this.field_2313.method_23() >= var2) {
            var1.add(var4.method_10062());
         }

         BlockPos var5 = this.field_2313.method_24();
         if (var5 != null && this.field_2313.method_26()) {
            var1.add(var5.method_10062());
         }
      }

      return var1;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) float
   private float method_2921(Vec3d var1) {
      return this.method_2924(var1, null, false);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, java.util.Map) float
   private float method_2922(Vec3d var1, Map<BlockPos, BlockState> var2) {
      return this.method_2924(var1, var2, false);
   }

   // $VF: renamed from: b (net.minecraft.util.math.Vec3d) float
   private float method_2923(Vec3d var1) {
      return this.method_2924(var1, null, true);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, java.util.Map, boolean) float
   private float method_2924(Vec3d var1, Map<BlockPos, BlockState> var2, boolean var3) {
      float var4 = 0.0F;
      boolean var5 = false;
      Set var6 = this.method_2920();

      for (PlayerEntity var8 : c.field_1687.method_18456()) {
         if (this.method_2946(var8)) {
            Class10.Inner2 var9 = this.method_2949(var8);
            float var10 = this.method_2910(var1, var9, var6, c.field_1687.method_8407(), true, this.field_2221.method_671(), c.field_1687, var2);
            if (var8 == c.field_1724) {
               if (var10 > this.field_2226.method_671()) {
                  return -1.0F;
               }

               if (this.field_2222.method_671() && var10 + 1.5F >= c.field_1724.method_6032() + c.field_1724.method_6067()) {
                  return -1.0F;
               }
            } else if ((Dev.ZWare.Client.Class1.field_310 == null || !Dev.ZWare.Client.Class1.field_310.method_377(var8)) && (!var3 || this.method_2948(var8))) {
               double var11 = this.method_2945(var8.method_6032(), var8.method_6067(), this.method_2952(var8));
               if (!(var10 < var11)) {
                  var4 += var10;
                  var5 = true;
               }
            }
         }
      }

      if (this.field_2233.method_671()) {
         for (WitherEntity var14 : c.field_1687
            .method_8390(WitherEntity.class, c.field_1724.method_5829().method_1014(this.method_2900() + 12.0 + 2.0), var0 -> true)) {
            if (this.method_2947(var14)) {
               Class10.Inner2 var15 = this.method_2950(var14);
               float var16 = this.method_2910(var1, var15, var6, c.field_1687.method_8407(), true, this.field_2221.method_671(), c.field_1687, var2);
               if (!var3 || this.method_2948(var14)) {
                  double var17 = this.method_2945(var15.method_1501(), var15.method_1502(), var15.method_1503());
                  if (!(var16 < var17)) {
                     var4 += var16;
                     var5 = true;
                  }
               }
            }
         }
      }

      return var5 ? var4 : -1.0F;
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2925(BlockPos var1, BlockPos var2) {
      Box var3 = this.method_2957(var2);
      long var4 = var2.method_10063();
      Iterator var6 = c.field_1687.method_8335(null, var3).iterator();

      while (true) {
         if (!var6.hasNext()) {
            return false;
         }

         Entity var7 = (Entity)var6.next();
         if ((!this.field_2206.method_671() || !(var7 instanceof ItemEntity)) && (!(var7 instanceof ItemEntity var8) || var8.field_6012 >= 10)) {
            if (!(var7 instanceof EndCrystalEntity var9)) {
               break;
            }

            if (var9.method_24515().equals(var2)) {
               if (!this.method_2929(var9, var4)) {
                  return true;
               }
            } else if (!this.field_2207.method_671() || var9.field_6012 >= 5 || !this.field_2310.containsKey(var9.method_24515().method_10063())) {
               break;
            }
         }
      }

      return true;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.entity.decoration.EndCrystalEntity
   private EndCrystalEntity method_2926(BlockPos var1) {
      if (var1 != null && !g()) {
         Box var2 = this.method_2957(var1);

         for (EndCrystalEntity var4 : c.field_1687.method_8390(EndCrystalEntity.class, var2, var0 -> true)) {
            if (var4.method_24515().equals(var1)) {
               return var4;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   // $VF: renamed from: d (net.minecraft.util.math.BlockPos, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2927(BlockPos var1, BlockPos var2) {
      return var2 != null && this.method_2928(var2) && !this.method_2925(var1, var2);
   }

   // $VF: renamed from: b (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2928(BlockPos var1) {
      BlockState var2 = c.field_1687.method_8320(var1);
      return var2.method_26215() || var2.method_27852(Blocks.field_10036) && c.field_1687.method_27983() == World.field_25181;
   }

   // $VF: renamed from: a (net.minecraft.entity.decoration.EndCrystalEntity, long) boolean
   private boolean method_2929(EndCrystalEntity var1, long var2) {
      if (!this.field_2207.method_671()) {
         return false;
      } else {
         return var1.method_5628() == this.field_2303 && var2 == this.field_2304
            ? true
            : this.field_2310.containsKey(var2) && this.field_2309.get(var1.method_5628()) > 0;
      }
   }

   // $VF: renamed from: c (net.minecraft.util.math.BlockPos) boolean
   private boolean method_2930(BlockPos var1) {
      Box var2 = this.method_2957(var1);

      for (Entity var4 : c.field_1687.method_8335(null, var2)) {
         if (var4 instanceof ItemEntity) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: q () void
   private void method_2931() {
      this.method_2944();
      this.field_2303 = -1;
      this.field_2304 = Long.MIN_VALUE;
      if (c.field_1724.field_6012 % 100 == 0) {
         this.field_2311.clear();
      }

      LongIterator var1 = this.field_2310.keySet().iterator();

      while (var1.hasNext()) {
         long var2 = var1.nextLong();
         int var4 = this.field_2310.get(var2) + 1;
         if (var4 > 35) {
            var1.remove();
         } else {
            this.field_2310.put(var2, var4);
         }
      }
   }

   // $VF: renamed from: n () boolean
   private boolean method_2932() {
      return c.field_1687 != null && this.field_2293 != Long.MIN_VALUE && c.field_1687.method_8510() <= this.field_2293;
   }

   // $VF: renamed from: r () void
   private void method_2933() {
      if (this.field_2212.method_671() && this.field_2274 > 0) {
         this.field_2274--;
      }

      if (this.field_2200.method_671() && this.field_2275 > 0) {
         this.field_2275--;
      }
   }

   // $VF: renamed from: s () void
   private void method_2934() {
      if (!g() && this.field_2212.method_671() && this.field_2274 <= 0 && !this.method_2935()) {
         Class18.Inner11 var1 = this.method_2884();
         if (var1 != null) {
            EndCrystalEntity var2 = var1.method_461();
            if (var2 != null) {
               if (this.field_2217.method_671() || this.method_2885(var2)) {
                  this.field_2303 = var2.method_5628();
                  this.field_2304 = var2.method_24515().method_10063();
               }
            }
         }
      }
   }

   // $VF: renamed from: o () boolean
   private boolean method_2935() {
      return this.method_2937() ? true : c.field_1724 != null && c.field_1724.method_6115();
   }

   // $VF: renamed from: p () boolean
   private boolean method_2936() {
      return this.method_2937() ? true : c.field_1724 != null && c.field_1724.method_6115();
   }

   // $VF: renamed from: q () boolean
   private boolean method_2937() {
      return this.field_2234.method_671() && this.method_2942();
   }

   // $VF: renamed from: a (boolean, boolean) boolean
   private boolean method_2938(boolean var1, boolean var2) {
      if (this.field_2235.method_671() && !g() && !this.method_2937()) {
         return var2 || this.field_2291 == null && this.field_2289 == null && this.field_2278 == null
            ? !var1 && this.field_2212.method_671() && this.method_2884() != null
            : true;
      } else {
         return false;
      }
   }

   // $VF: renamed from: t () void
   private void method_2939() {
      Dev.ZWare.Client.features.pkg3.Class4 var1 = this.field_2225.method_671();
      if (var1 == null || var1.method_432()) {
         this.field_2299 = true;
      } else if (!var1.method_436()) {
         this.field_2299 = true;
      } else if (this.field_2299 && !(c.field_1755 instanceof ChatScreen)) {
         this.method_2941();
      }
   }

   // $VF: renamed from: b (int) void
   private void method_2940(int var1) {
      if (this.d() && var1 > 0 && c.field_1755 == null) {
         Dev.ZWare.Client.features.pkg3.Class4 var2 = this.field_2225.method_671();
         if (var2 != null && !var2.method_432() && var2.method_430() == var1 && this.field_2299) {
            this.method_2941();
         }
      }
   }

   // $VF: renamed from: u () void
   private void method_2941() {
      this.field_2299 = false;
      this.field_2224.method_672(!this.field_2224.method_671());
      this.field_2301 = this.field_2224.method_671();
      this.field_2300 = System.currentTimeMillis();
      if (Dev.ZWare.Client.Class1.field_317 != null) {
         Dev.ZWare.Client.Class1.field_317.method_171();
      }
   }

   // $VF: renamed from: r () boolean
   private boolean method_2942() {
      if (c.field_1724 == null) {
         return false;
      } else if (c.field_1724.method_6115() && this.method_2943(c.field_1724.method_6030())) {
         return true;
      } else {
         return !c.field_1690.field_1904.method_1434() ? false : this.method_2943(c.field_1724.method_6047()) || this.method_2943(c.field_1724.method_6079());
      }
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) boolean
   private boolean method_2943(ItemStack var1) {
      if (var1 != null && !var1.method_7960()) {
         UseAction var2 = var1.method_7976();
         return var2 == UseAction.field_8950 || var2 == UseAction.field_8946;
      } else {
         return false;
      }
   }

   // $VF: renamed from: v () void
   private void method_2944() {
      this.field_2276 = null;
      this.field_2279 = 0.0F;
      this.field_2280 = 0.0F;
   }

   // $VF: renamed from: a (float, float, boolean) double
   private double method_2945(float var1, float var2, boolean var3) {
      double var4 = this.field_2223.method_671();
      int var6 = Math.max(1, this.field_2227.method_671());
      float var7 = var1 + var2;
      float var8 = var7 / 36.0F;
      if (var8 <= this.field_2228.method_671()) {
         var4 /= var6;
      }

      if (var3) {
         var4 /= var6;
      }

      return var4;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2946(PlayerEntity var1) {
      return var1 != null
         && !var1.method_31481()
         && var1.method_5805()
         && !var1.method_7325()
         && !var1.method_68878()
         && !this.field_2311.contains(var1.method_5628());
   }

   // $VF: renamed from: a (net.minecraft.entity.boss.WitherEntity) boolean
   private boolean method_2947(WitherEntity var1) {
      return var1 != null && !var1.method_31481() && var1.method_5805() && !this.field_2311.contains(var1.method_5628());
   }

   // $VF: renamed from: a (net.minecraft.entity.LivingEntity) boolean
   private boolean method_2948(LivingEntity var1) {
      return !this.field_2224.method_671() ? true : var1 != null && var1.field_6008 <= 10;
   }

   // $VF: renamed from: a (net.minecraft.entity.player.PlayerEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2
   private Class10.Inner2 method_2949(PlayerEntity var1) {
      int var2 = -1;
      StatusEffectInstance var3 = var1.method_6112(StatusEffects.field_5907);
      if (var3 != null) {
         var2 = var3.method_5578();
      }

      byte var4 = 0;
      if (!var1.method_6118(EquipmentSlot.field_6169).method_7960()) {
         var4 = (byte)(var4 | 1);
      }

      if (!var1.method_6118(EquipmentSlot.field_6174).method_7960()) {
         var4 = (byte)(var4 | 2);
      }

      if (!var1.method_6118(EquipmentSlot.field_6172).method_7960()) {
         var4 = (byte)(var4 | 4);
      }

      if (!var1.method_6118(EquipmentSlot.field_6166).method_7960()) {
         var4 = (byte)(var4 | 8);
      }

      int var5 = 0;
      int var6 = 0;
      if (!this.field_2221.method_671()) {
         for (EquipmentSlot var10 : this.method_2954()) {
            ItemStack var11 = var1.method_6118(var10);
            if (!var11.method_7960()) {
               var5 += Dev.ZWare.Client.pkg1.Class19.method_408(Enchantments.field_9111, var11);
               var6 += Dev.ZWare.Client.pkg1.Class19.method_408(Enchantments.field_9107, var11);
            }
         }
      }

      return new Class10.Inner2(
         var1.method_5628(),
         var1.method_19538(),
         var1.method_5829(),
         var1.method_6096(),
         (float)var1.method_45325(EntityAttributes.field_23725),
         var2,
         var4,
         var5,
         var6,
         var1.method_6032(),
         var1.method_6067(),
         this.method_2952(var1)
      );
   }

   // $VF: renamed from: a (net.minecraft.entity.boss.WitherEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2
   private Class10.Inner2 method_2950(WitherEntity var1) {
      return this.method_2951(var1);
   }

   // $VF: renamed from: a (net.minecraft.entity.LivingEntity) Dev.ZWare.Client.features.pkg1.pkg3.Class10$Inner2
   private Class10.Inner2 method_2951(LivingEntity var1) {
      int var2 = -1;
      StatusEffectInstance var3 = var1.method_6112(StatusEffects.field_5907);
      if (var3 != null) {
         var2 = var3.method_5578();
      }

      byte var4 = 0;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      if (var1 instanceof PlayerEntity var8) {
         if (!var8.method_6118(EquipmentSlot.field_6169).method_7960()) {
            var4 = (byte)(var4 | 1);
         }

         if (!var8.method_6118(EquipmentSlot.field_6174).method_7960()) {
            var4 = (byte)(var4 | 2);
         }

         if (!var8.method_6118(EquipmentSlot.field_6172).method_7960()) {
            var4 = (byte)(var4 | 4);
         }

         if (!var8.method_6118(EquipmentSlot.field_6166).method_7960()) {
            var4 = (byte)(var4 | 8);
         }

         if (!this.field_2221.method_671()) {
            for (EquipmentSlot var12 : this.method_2954()) {
               ItemStack var13 = var8.method_6118(var12);
               if (!var13.method_7960()) {
                  var5 += Dev.ZWare.Client.pkg1.Class19.method_408(Enchantments.field_9111, var13);
                  var6 += Dev.ZWare.Client.pkg1.Class19.method_408(Enchantments.field_9107, var13);
               }
            }
         }

         var7 = this.method_2952(var8);
      }

      return new Class10.Inner2(
         var1.method_5628(),
         var1.method_19538(),
         var1.method_5829(),
         var1.method_6096(),
         (float)var1.method_45325(EntityAttributes.field_23725),
         var2,
         var4,
         var5,
         var6,
         var1.method_6032(),
         var1.method_6067(),
         var7
      );
   }

   // $VF: renamed from: b (net.minecraft.entity.player.PlayerEntity) boolean
   private boolean method_2952(PlayerEntity var1) {
      int var2 = (int)(this.field_2229.method_671() * 100.0);

      for (EquipmentSlot var6 : this.method_2954()) {
         ItemStack var7 = var1.method_6118(var6);
         if (!var7.method_7960() && this.method_2953(var7, var2)) {
            return true;
         }
      }

      return false;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack, int) boolean
   private boolean method_2953(ItemStack var1, int var2) {
      if (var1 != null && !var1.method_7960() && var1.method_7963()) {
         int var3 = var1.method_7936();
         if (var3 <= 0) {
            return false;
         } else {
            int var4 = var3 - var1.method_7919();
            return var4 * 100.0 / var3 <= var2;
         }
      } else {
         return false;
      }
   }

   // $VF: renamed from: a () net.minecraft.entity.EquipmentSlot[]
   private EquipmentSlot[] method_2954() {
      return new EquipmentSlot[]{EquipmentSlot.field_6169, EquipmentSlot.field_6174, EquipmentSlot.field_6172, EquipmentSlot.field_6166};
   }

   // $VF: renamed from: a (net.minecraft.util.math.Box) net.minecraft.util.math.Vec3d
   private Vec3d method_2955(Box var1) {
      Vec3d var2 = c.field_1724.method_19538().method_1031(0.0, c.field_1724.method_5751(), 0.0);
      return this.field_2214.method_671() ? Dev.ZWare.Client.pkg1.Class3.method_590(c.field_1724, var1) : var2;
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) net.minecraft.util.math.Box
   private Box method_2956(Vec3d var1) {
      return new Box(var1.field_1352 - 0.5, var1.field_1351, var1.field_1350 - 0.5, var1.field_1352 + 0.5, var1.field_1351 + 2.0, var1.field_1350 + 0.5);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.Box
   private Box method_2957(BlockPos var1) {
      return new Box(
         var1.method_10263(), var1.method_10264(), var1.method_10260(), var1.method_10263() + 1.0, var1.method_10264() + 2.0, var1.method_10260() + 1.0
      );
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d, net.minecraft.util.math.BlockPos) boolean
   private boolean method_2958(Vec3d var1, BlockPos var2) {
      return var1 != null && var2 != null && var1.method_1022(var2.method_46558()) <= this.method_2900();
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner3
   private Class18.Inner3 method_2959() {
      if (c.field_1724.method_6047().method_31574(Items.field_8301)) {
         return new Class18.Inner3(false);
      } else if (!this.field_2210.method_671() || Dev.ZWare.Client.Class1.field_300 == null) {
         return null;
      } else {
         return !Dev.ZWare.Client.Class1.field_300.method_556(Items.field_8301, true) ? null : new Class18.Inner3(true);
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner3) void
   private void method_2960(Class18.Inner3 var1) {
      if (var1 != null && var1.method_765()) {
         if (Dev.ZWare.Client.Class1.field_300 != null) {
            Dev.ZWare.Client.Class1.field_300.method_561(true);
         }
      }
   }

   // $VF: renamed from: c (int) void
   private void method_2961(int var1) {
      InteractTypeHandler var2 = new InteractTypeHandler() {
         public InteractType method_34211() {
            return InteractType.field_29172;
         }

         public void method_34213(Handler handler) {
            handler.method_34218();
         }

         public void method_34212(PacketByteBuf buf) {
         }
      };
      c.method_1562().method_52787(Dev.ZWare.Client.mixin.Class10.invokeInit(var1, c.field_1724.method_5715(), var2));
   }

   static class Inner1 {
      // $VF: renamed from: a net.minecraft.util.math.Vec3d
      final Vec3d field_263;
      // $VF: renamed from: b net.minecraft.util.math.Vec3d
      final Vec3d field_264;
      // $VF: renamed from: c java.util.Set
      final Set<BlockPos> field_265;
      // $VF: renamed from: d net.minecraft.world.World
      final World field_266;
      // $VF: renamed from: e java.util.Map
      final Map<BlockPos, BlockState> field_267;

      Inner1(Vec3d var1, Vec3d var2, Set<BlockPos> var3, World var4, Map<BlockPos, BlockState> var5) {
         this.field_263 = var1;
         this.field_264 = var2;
         this.field_265 = var3;
         this.field_266 = var4;
         this.field_267 = var5;
      }

      // $VF: renamed from: a () net.minecraft.util.math.Vec3d
      Vec3d method_502() {
         return this.field_263;
      }

      // $VF: renamed from: b () net.minecraft.util.math.Vec3d
      Vec3d method_503() {
         return this.field_264;
      }

      // $VF: renamed from: a () java.util.Set
      Set<BlockPos> method_504() {
         return this.field_265;
      }

      // $VF: renamed from: a () net.minecraft.world.World
      World method_505() {
         return this.field_266;
      }

      // $VF: renamed from: a () java.util.Map
      Map<BlockPos, BlockState> method_506() {
         return this.field_267;
      }
   }

   static class Inner10 {
      // $VF: renamed from: a java.awt.Color
      final Color field_527;
      // $VF: renamed from: b java.awt.Color
      final Color field_528;
      // $VF: renamed from: c java.awt.Color
      final Color field_529;
      // $VF: renamed from: d double
      final double field_530;
      // $VF: renamed from: e double
      final double field_531;
      // $VF: renamed from: f double
      final double field_532;
      // $VF: renamed from: g double
      final double field_533;
      // $VF: renamed from: h boolean
      final boolean field_534;

      Inner10(Color var1, Color var2, Color var3, double var4, double var6, double var8, double var10, boolean var12) {
         this.field_527 = var1;
         this.field_528 = var2;
         this.field_529 = var3;
         this.field_530 = var4;
         this.field_531 = var6;
         this.field_532 = var8;
         this.field_533 = var10;
         this.field_534 = var12;
      }

      // $VF: renamed from: a () java.awt.Color
      Color method_1010() {
         return this.field_527;
      }

      // $VF: renamed from: b () java.awt.Color
      Color method_1011() {
         return this.field_528;
      }

      // $VF: renamed from: c () java.awt.Color
      Color method_1012() {
         return this.field_529;
      }

      // $VF: renamed from: a () double
      double method_1013() {
         return this.field_530;
      }

      // $VF: renamed from: b () double
      double method_1014() {
         return this.field_531;
      }

      // $VF: renamed from: c () double
      double method_1015() {
         return this.field_532;
      }

      // $VF: renamed from: d () double
      double method_1016() {
         return this.field_533;
      }

      // $VF: renamed from: a () boolean
      boolean method_1017() {
         return this.field_534;
      }
   }

   static class Inner11 {
      // $VF: renamed from: a net.minecraft.entity.decoration.EndCrystalEntity
      final EndCrystalEntity field_234;
      // $VF: renamed from: b float
      final float field_235;

      Inner11(EndCrystalEntity var1, float var2) {
         this.field_234 = var1;
         this.field_235 = var2;
      }

      // $VF: renamed from: a () net.minecraft.entity.decoration.EndCrystalEntity
      EndCrystalEntity method_461() {
         return this.field_234;
      }

      // $VF: renamed from: a () float
      float method_462() {
         return this.field_235;
      }
   }

   static class Inner12 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      final BlockPos field_97;
      // $VF: renamed from: b float
      final float field_98;
      // $VF: renamed from: c Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner15
      final Class18.Inner15 field_99;

      Inner12(BlockPos var1, float var2, Class18.Inner15 var3) {
         this.field_97 = var1;
         this.field_98 = var2;
         this.field_99 = var3;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_223() {
         return this.field_97;
      }

      // $VF: renamed from: a () float
      float method_224() {
         return this.field_98;
      }

      // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg3.Class18$Inner15
      Class18.Inner15 method_225() {
         return this.field_99;
      }
   }

   static class Inner13 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      final BlockPos field_278;
      // $VF: renamed from: b float
      final float field_279;
      // $VF: renamed from: c boolean
      final boolean field_280;
      // $VF: renamed from: d double
      final double field_281;
      // $VF: renamed from: e double
      final double field_282;
      // $VF: renamed from: f double
      final double field_283;

      Inner13(BlockPos var1, float var2, boolean var3, double var4, double var6, double var8) {
         this.field_278 = var1;
         this.field_279 = var2;
         this.field_280 = var3;
         this.field_281 = var4;
         this.field_282 = var6;
         this.field_283 = var8;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_582() {
         return this.field_278;
      }

      // $VF: renamed from: a () float
      float method_583() {
         return this.field_279;
      }

      // $VF: renamed from: a () boolean
      boolean method_584() {
         return this.field_280;
      }

      // $VF: renamed from: a () double
      double method_585() {
         return this.field_281;
      }

      // $VF: renamed from: b () double
      double method_586() {
         return this.field_282;
      }

      // $VF: renamed from: c () double
      double method_587() {
         return this.field_283;
      }
   }

   public static enum Inner14 {
      Lines,
      Sides,
      Both;

      // $VF: renamed from: a () boolean
      public boolean method_1126() {
         return this == Lines || this == Both;
      }

      // $VF: renamed from: b () boolean
      public boolean method_1127() {
         return this == Sides || this == Both;
      }
   }

   static enum Inner15 {
      PREPLACE,
      CRYSTAL,
      BASE;
   }

   static class Inner3 {
      // $VF: renamed from: a boolean
      final boolean field_378;

      Inner3(boolean var1) {
         this.field_378 = var1;
      }

      // $VF: renamed from: a () boolean
      boolean method_765() {
         return this.field_378;
      }
   }

   public static enum Inner4 {
      Normal,
      Shader;
   }

   static class Inner5 {
      // $VF: renamed from: a net.minecraft.util.math.BlockPos
      final BlockPos field_448;
      // $VF: renamed from: b float
      final float field_449;

      Inner5(BlockPos var1, float var2) {
         this.field_448 = var1;
         this.field_449 = var2;
      }

      // $VF: renamed from: a () net.minecraft.util.math.BlockPos
      BlockPos method_878() {
         return this.field_448;
      }

      // $VF: renamed from: a () float
      float method_879() {
         return this.field_449;
      }
   }

   private record Inner7(Vec3d au, String av, int aw, float ax) {
      // $VF: renamed from: au net.minecraft.util.math.Vec3d
      private final Vec3d field_825;
      // $VF: renamed from: av java.lang.String
      private final String field_826;
      // $VF: renamed from: aw int
      private final int field_827;
      // $VF: renamed from: ax float
      private final float field_828;

      private Inner7(Vec3d au, String av, int aw, float ax) {
         this.field_825 = au;
         this.field_826 = av;
         this.field_827 = aw;
         this.field_828 = ax;
      }

      // $VF: renamed from: au () net.minecraft.util.math.Vec3d
      public Vec3d method_1342() {
         return this.field_825;
      }

      // $VF: renamed from: av () java.lang.String
      public String method_1343() {
         return this.field_826;
      }

      // $VF: renamed from: aw () int
      public int method_1344() {
         return this.field_827;
      }

      // $VF: renamed from: ax () float
      public float method_1345() {
         return this.field_828;
      }
   }

   public static enum Inner8 {
      Normal,
      Fade;
   }

   static class Inner9 {
      // $VF: renamed from: a float
      final float field_410;
      // $VF: renamed from: b float
      final float field_411;

      Inner9(float var1, float var2) {
         this.field_410 = var1;
         this.field_411 = var2;
      }

      // $VF: renamed from: a () float
      float method_815() {
         return this.field_410;
      }

      // $VF: renamed from: b () float
      float method_816() {
         return this.field_411;
      }
   }
}
