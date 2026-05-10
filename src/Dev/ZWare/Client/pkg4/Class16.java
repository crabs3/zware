package Dev.ZWare.Client.pkg4;

import Dev.ZWare.Client.mixin.Class26;
import Dev.ZWare.Client.mixin.Class33;
import irN71JBTa7RNQjUjj_RJI9.odzxumrdBQl8FJ_yAitSgORILY9Nd9Zsd.iFT13zrx_wTXP;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.LookAndOnGround;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.world.World;

public class Class16 {
   // $VF: renamed from: a int
   private static final int field_479 = 45;
   // $VF: renamed from: b long
   private static final long field_480 = 1000L;
   // $VF: renamed from: c long
   private static final long field_481 = 200L;
   // $VF: renamed from: d double
   private static final double field_482 = 110.0;
   // $VF: renamed from: e double
   private static final double field_483 = 6.0;
   // $VF: renamed from: f java.util.Set
   private static final Set<String> field_484 = Set.of(
      "facing", "horizontal_facing", "hopper_facing", "axis", "horizontal_axis", "block_face", "attachment", "face", "half", "rotation"
   );
   // $VF: renamed from: g float[]
   private static final float[] field_485 = new float[]{
      0.0F, 22.5F, 45.0F, 67.5F, 90.0F, 112.5F, 135.0F, 157.5F, 180.0F, -157.5F, -135.0F, -112.5F, -90.0F, -67.5F, -45.0F, -22.5F
   };
   // $VF: renamed from: h float[]
   private static final float[] field_486 = new float[]{0.0F, -90.0F, 90.0F, -67.5F, 67.5F, -45.0F, 45.0F, -22.5F, 22.5F};
   // $VF: renamed from: i java.util.Map
   private final Map<BlockPos, Long> field_487 = new ConcurrentHashMap<>();
   // $VF: renamed from: j boolean
   private boolean field_488;
   // $VF: renamed from: k int
   private int field_489;
   // $VF: renamed from: l long
   private long field_490 = -1L;
   // $VF: renamed from: m boolean
   private boolean field_491;
   // $VF: renamed from: n int
   private int field_492 = -1;
   // $VF: renamed from: o int
   private int field_493 = -1;
   // $VF: renamed from: p net.minecraft.util.Hand
   private Hand field_494 = Hand.field_5808;
   // $VF: renamed from: q long
   private long field_495 = -1L;
   // $VF: renamed from: r net.minecraft.item.ItemStack
   private ItemStack field_496 = ItemStack.field_8037;

   public Class16() {
      Dev.ZWare.Client.pkg1.pkg5.Class1.field_1.a(this);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState, net.minecraft.item.Item) boolean
   public boolean method_914(BlockPos position, BlockState state, Item item) {
      return this.method_915(position, state, item, Hand.field_5808);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState, net.minecraft.item.Item, net.minecraft.util.Hand) boolean
   public boolean method_915(BlockPos position, BlockState state, Item item, Hand hand) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null) {
         long var5 = System.currentTimeMillis();
         this.method_957(var5);
         if (!this.method_946(var5, false)) {
            this.method_976(
               "Begin skipped item=%s pos=%s hand=%s reason=burst-limit window=%dms limit=%d.",
               this.method_977(item),
               this.method_978(position),
               hand,
               this.method_956(),
               this.method_953()
            );
            return false;
         } else if (this.field_488) {
            this.method_976("Begin skipped item=%s pos=%s hand=%s reason=placement-active.", this.method_977(item), this.method_978(position), hand);
            return false;
         } else if (!this.method_928(item, position, state)) {
            return false;
         } else if (!this.method_940(item, hand)) {
            this.method_976("Begin skipped item=%s pos=%s hand=%s reason=swap-failed.", this.method_977(item), this.method_978(position), hand);
            return false;
         } else {
            this.field_488 = true;
            this.method_976("Begin armed item=%s pos=%s hand=%s.", this.method_977(item), this.method_978(position), hand);
            return true;
         }
      } else {
         this.method_976("Begin skipped item=%s pos=%s hand=%s reason=missing-context.", this.method_977(item), this.method_978(position), hand);
         return false;
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.item.Item) boolean
   public boolean method_916(List<BlockPos> positions, Item item) {
      return this.method_917(positions, item, Hand.field_5808);
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.item.Item, net.minecraft.util.Hand) boolean
   public boolean method_917(List<BlockPos> positions, Item item, Hand hand) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null
         && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null
         && positions != null
         && !positions.isEmpty()) {
         long var4 = System.currentTimeMillis();
         this.method_957(var4);
         if (!this.method_946(var4, false)) {
            this.method_976(
               "Begin skipped item=%s hand=%s reason=burst-limit window=%dms limit=%d.", this.method_977(item), hand, this.method_956(), this.method_953()
            );
            return false;
         } else if (this.field_488) {
            this.method_976("Begin skipped item=%s hand=%s reason=placement-active.", this.method_977(item), hand);
            return false;
         } else {
            boolean var6 = positions.stream().anyMatch(var2 -> this.method_926(item, var2));
            if (!var6) {
               this.method_976("Begin skipped item=%s hand=%s reason=no-valid-positions count=%d.", this.method_977(item), hand, positions.size());
               return false;
            } else if (!this.method_940(item, hand)) {
               this.method_976("Begin skipped item=%s hand=%s reason=swap-failed.", this.method_977(item), hand);
               return false;
            } else {
               this.field_488 = true;
               this.method_976("Begin armed item=%s hand=%s positions=%d.", this.method_977(item), hand, positions.size());
               return true;
            }
         }
      } else {
         this.method_976("Begin skipped item=%s hand=%s reason=missing-context-or-empty-list.", this.method_977(item), hand);
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos) boolean
   public boolean method_918(Item item, BlockPos blockPos) {
      return Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null && blockPos != null
         ? this.method_921(item, blockPos, Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687.method_8320(blockPos), Hand.field_5808)
         : false;
   }

   // $VF: renamed from: a (net.minecraft.block.Block, net.minecraft.util.math.BlockPos) boolean
   public boolean method_919(Block block, BlockPos blockPos) {
      return block == null ? false : this.method_918(block.method_8389(), blockPos);
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) boolean
   public boolean method_920(Item item, BlockPos blockPos, BlockState state) {
      return this.method_921(item, blockPos, state, Hand.field_5808);
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState, net.minecraft.util.Hand) boolean
   public boolean method_921(Item item, BlockPos blockPos, BlockState state, Hand hand) {
      return this.method_922(item, blockPos, state, hand, true);
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState, net.minecraft.util.Hand, boolean) boolean
   public boolean method_922(Item item, BlockPos blockPos, BlockState state, Hand hand, boolean rotatePlacement) {
      return this.method_923(item, blockPos, state, hand, rotatePlacement, null);
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState, net.minecraft.util.Hand, boolean, net.minecraft.block.BlockState) boolean
   public boolean method_923(Item item, BlockPos blockPos, BlockState state, Hand hand, boolean rotatePlacement, BlockState targetPlacementState) {
      return this.method_924(item, blockPos, state, hand, rotatePlacement, targetPlacementState, true);
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState, net.minecraft.util.Hand, boolean, net.minecraft.block.BlockState, boolean) boolean
   public boolean method_924(
      Item item, BlockPos blockPos, BlockState state, Hand hand, boolean rotatePlacement, BlockState targetPlacementState, boolean allowForcedAirPlace
   ) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null
         && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null
         && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1562() != null
         && blockPos != null) {
         long var8 = System.currentTimeMillis();
         this.method_957(var8);
         long var10 = this.field_487.values().stream().filter(var2 -> var8 - var2 <= 1000L).count();
         if (var10 >= this.method_952()) {
            this.method_976(
               "Place skipped item=%s pos=%s hand=%s reason=blocks-per-second-cap current=%d cap=%d.",
               this.method_977(item),
               this.method_978(blockPos),
               hand,
               var10,
               this.method_952()
            );
            return false;
         } else if (!this.method_928(item, blockPos, state)) {
            return false;
         } else {
            Direction var12 = method_936(blockPos);
            boolean var13 = this.method_950() && (var12 == null || allowForcedAirPlace && this.method_951());
            boolean var14 = hand == Hand.field_5810 && !Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_6079().method_31574(item);
            ItemStack var15 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_6079().method_7972();
            if (!this.method_925(var13, var14)) {
               this.method_976(
                  "Place skipped item=%s pos=%s hand=%s reason=packet-budget airplace=%s tempOffhandSwap=%s.",
                  this.method_977(item),
                  this.method_978(blockPos),
                  hand,
                  var13,
                  var14
               );
               return false;
            } else {
               BlockPos var16 = blockPos;
               Vec3d var17 = blockPos.method_46558();
               Hand var18 = var13 ? (hand == Hand.field_5810 ? Hand.field_5808 : Hand.field_5810) : hand;
               Direction var19 = var12 == null ? Direction.field_11033 : var12.method_10153();
               if (var12 != null) {
                  var16 = blockPos.method_10093(var12);
                  var17 = var17.method_1031(var12.method_10148() * 0.5, var12.method_10164() * 0.5, var12.method_10165() * 0.5);
               }

               Class16.Inner2 var20 = this.method_959(item, var18, var19, var16, var17, targetPlacementState);
               if (var12 != null && var20 == null && rotatePlacement && this.method_949()) {
                  this.method_976("Applied generic snap item=%s pos=%s hit=%s.", this.method_977(item), this.method_978(blockPos), this.method_979(var17));
                  Dev.ZWare.Client.Class1.field_298.method_309(var17);
               }

               BlockPos var21 = blockPos.method_10062();
               Long var22 = this.field_487.get(var21);
               if (var22 != null && var8 - var22 < this.method_954() * 1000.0) {
                  long var28 = Math.max(0L, Math.round(this.method_954() * 1000.0 - (var8 - var22)));
                  this.method_976(
                     "Place skipped item=%s pos=%s hand=%s reason=per-block-cooldown remaining=%dms.",
                     this.method_977(item),
                     this.method_978(blockPos),
                     hand,
                     var28
                  );
                  return false;
               } else if (!this.method_946(var8, true)) {
                  this.method_976(
                     "Place skipped item=%s pos=%s hand=%s reason=burst-limit window=%dms limit=%d.",
                     this.method_977(item),
                     this.method_978(blockPos),
                     hand,
                     this.method_956(),
                     this.method_953()
                  );
                  return false;
               } else {
                  this.field_487.put(var21, var8);
                  int var23 = -1;
                  if (var14) {
                     this.method_943(var15);
                     var23 = Dev.ZWare.Client.pkg1.Class9.method_140(var1 -> var1.method_31574(item), 0, 35);
                     if (var23 == -1 || !Dev.ZWare.Client.pkg1.Class9.method_152(var23)) {
                        this.field_487.remove(var21);
                        this.method_945();
                        this.method_976(
                           "Place skipped item=%s pos=%s hand=%s reason=temp-offhand-swap-failed slot=%d.",
                           this.method_977(item),
                           this.method_978(blockPos),
                           hand,
                           var23
                        );
                        return false;
                     }

                     this.method_976("Temporary offhand swap slot=%d item=%s.", var23, this.method_977(item));
                  }

                  try {
                     if (var13) {
                        this.method_943(var15);
                        this.method_976(
                           "Grim airplace swap start requestedHand=%s packetHand=%s.", hand, hand == Hand.field_5810 ? Hand.field_5808 : Hand.field_5810
                        );
                        Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
                           .method_1562()
                           .method_52787(new PlayerActionC2SPacket(Action.field_12969, BlockPos.field_10980, Direction.field_11033));
                        var18 = hand == Hand.field_5810 ? Hand.field_5808 : Hand.field_5810;
                     }

                     if (var20 != null) {
                        this.method_976(
                           "Applied placement rotation yaw=%.1f pitch=%.1f item=%s pos=%s.",
                           var20.method_1458(),
                           var20.method_1459(),
                           this.method_977(item),
                           this.method_978(blockPos)
                        );
                        this.method_974(var20);
                     }

                     Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
                        .method_1562()
                        .method_52787(
                           new PlayerInteractBlockC2SPacket(
                              var18,
                              new BlockHitResult(var17, var19, var16, false),
                              ((Class26)Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687).getPendingUpdateManager().method_41937().method_41942()
                           )
                        );
                     this.method_976(
                        "Sent interact item=%s pos=%s hand=%s neighbour=%s side=%s hit=%s airplace=%s.",
                        this.method_977(item),
                        this.method_978(blockPos),
                        var18,
                        this.method_978(var16),
                        var19,
                        this.method_979(var17),
                        var13
                     );
                     if (var13) {
                        Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
                           .method_1562()
                           .method_52787(new PlayerActionC2SPacket(Action.field_12969, BlockPos.field_10980, Direction.field_11033));
                        this.method_976("Grim airplace swap restored requestedHand=%s.", hand);
                     }
                  } finally {
                     if (var23 != -1) {
                        Dev.ZWare.Client.pkg1.Class9.method_152(var23);
                        this.method_976("Temporary offhand swap restored slot=%d item=%s.", var23, this.method_977(item));
                     }
                  }

                  return true;
               }
            }
         }
      } else {
         this.method_976("Place skipped item=%s pos=%s hand=%s reason=missing-context.", this.method_977(item), this.method_978(blockPos), hand);
         return false;
      }
   }

   // $VF: renamed from: a (boolean, boolean) boolean
   private boolean method_925(boolean var1, boolean var2) {
      if (Dev.ZWare.Client.Class1.field_302 == null) {
         return true;
      } else {
         int var3 = var2 ? 2 : 0;
         int var4 = (var1 ? 2 : 0) + var3;
         int var5 = 1 + (var1 ? 2 : 0) + var3;
         if (var3 > 0
            && Dev.ZWare.Client.Class1.field_302.method_256(Class1.Inner1.ClickSlot)
            && Dev.ZWare.Client.Class1.field_302.method_251(Class1.Inner1.ClickSlot) < var3) {
            this.method_976(
               "Packet budget failed category=ClickSlot required=%d remaining=%d.", var3, Dev.ZWare.Client.Class1.field_302.method_251(Class1.Inner1.ClickSlot)
            );
            return false;
         } else if (var4 > 0
            && Dev.ZWare.Client.Class1.field_302.method_256(Class1.Inner1.Offhand)
            && Dev.ZWare.Client.Class1.field_302.method_251(Class1.Inner1.Offhand) < var4) {
            this.method_976(
               "Packet budget failed category=Offhand required=%d remaining=%d.", var4, Dev.ZWare.Client.Class1.field_302.method_251(Class1.Inner1.Offhand)
            );
            return false;
         } else if (Dev.ZWare.Client.Class1.field_302.method_256(Class1.Inner1.Global)
            && Dev.ZWare.Client.Class1.field_302.method_251(Class1.Inner1.Global) < var5) {
            this.method_976(
               "Packet budget failed category=Global required=%d remaining=%d.", var5, Dev.ZWare.Client.Class1.field_302.method_251(Class1.Inner1.Global)
            );
            return false;
         } else {
            return true;
         }
      }
   }

   // $VF: renamed from: b (net.minecraft.item.Item, net.minecraft.util.math.BlockPos) boolean
   public boolean method_926(Item item, BlockPos blockPos) {
      return Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null && blockPos != null
         ? this.method_928(item, blockPos, Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687.method_8320(blockPos))
         : false;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.Hand, boolean) boolean
   public boolean method_927(BlockPos blockPos, Hand hand, boolean rotateInteraction) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 == null
         || Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 == null
         || Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1562() == null
         || blockPos == null) {
         this.method_976("Interact skipped pos=%s hand=%s reason=missing-context.", this.method_978(blockPos), hand);
         return false;
      } else if (!this.method_958(blockPos)) {
         this.method_976("Interact skipped pos=%s hand=%s reason=out-of-range range=%.2f.", this.method_978(blockPos), hand, this.method_955());
         return false;
      } else {
         Vec3d var4 = blockPos.method_46558();
         Direction var5 = this.method_938(blockPos, var4);
         if (rotateInteraction && this.method_949() && Dev.ZWare.Client.Class1.field_298 != null) {
            Dev.ZWare.Client.Class1.field_298.method_309(var4);
         }

         Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
            .method_1562()
            .method_52787(
               new PlayerInteractBlockC2SPacket(
                  hand,
                  new BlockHitResult(var4, var5, blockPos, false),
                  ((Class26)Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687).getPendingUpdateManager().method_41937().method_41942()
               )
            );
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_6104(hand);
         this.method_976("Interacted pos=%s hand=%s side=%s hit=%s rotate=%s.", this.method_978(blockPos), hand, var5, this.method_979(var4), rotateInteraction);
         return true;
      }
   }

   // $VF: renamed from: b (net.minecraft.item.Item, net.minecraft.util.math.BlockPos, net.minecraft.block.BlockState) boolean
   public boolean method_928(Item item, BlockPos blockPos, BlockState state) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 == null
         || Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 == null
         || blockPos == null
         || state == null) {
         return false;
      } else if (item instanceof BlockItem var4) {
         if (!this.method_958(blockPos)) {
            this.method_976(
               "Placement check failed item=%s pos=%s reason=out-of-range range=%.2f.", this.method_977(item), this.method_978(blockPos), this.method_955()
            );
            return false;
         } else if (!this.method_950() && method_936(blockPos) == null) {
            this.method_976("Placement check failed item=%s pos=%s reason=no-neighbour airplace-disabled.", this.method_977(item), this.method_978(blockPos));
            return false;
         } else if (!state.method_45474()) {
            this.method_976("Placement check failed item=%s pos=%s reason=target-not-replaceable.", this.method_977(item), this.method_978(blockPos));
            return false;
         } else if (!World.method_25953(blockPos)) {
            this.method_976("Placement check failed item=%s pos=%s reason=invalid-world-position.", this.method_977(item), this.method_978(blockPos));
            return false;
         } else {
            boolean var5 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
               .field_1687
               .method_8628(var4.method_7711().method_9564(), blockPos, ShapeContext.method_16194());
            if (!var5) {
               this.method_976("Placement check failed item=%s pos=%s reason=world-canPlace=false.", this.method_977(item), this.method_978(blockPos));
            }

            return var5;
         }
      } else {
         this.method_976("Placement check failed item=%s pos=%s reason=not-a-block-item.", this.method_977(item), this.method_978(blockPos));
         return false;
      }
   }

   // $VF: renamed from: a () void
   public void method_929() {
      if (this.field_488) {
         this.field_488 = false;
         this.method_941();
         this.method_976("Ended placement session.");
      }
   }

   // $VF: renamed from: a () boolean
   public boolean method_930() {
      return this.field_488;
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) void
   public void method_931(BlockPos blockPos) {
      if (blockPos != null) {
         this.field_487.remove(blockPos.method_10062());
      }
   }

   // $VF: renamed from: a () int
   public int method_932() {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null && !this.field_488) {
         long var1 = System.currentTimeMillis();
         this.method_957(var1);
         long var3 = this.field_487.values().stream().filter(var2 -> var1 - var2 <= 1000L).count();
         int var5 = Math.max(0, this.method_952() - (int)var3);
         int var6 = this.method_947(var1);
         return Math.max(0, Math.min(var5, var6));
      } else {
         return 0;
      }
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.block.Block) int
   public int method_933(List<BlockPos> positions, Block block) {
      return block == null ? 0 : this.method_934(positions, block.method_8389());
   }

   // $VF: renamed from: a (java.util.List, net.minecraft.item.Item) int
   public int method_934(List<BlockPos> positions, Item item) {
      if (positions == null || positions.isEmpty() || item == null) {
         return 0;
      } else if (!this.method_916(positions, item)) {
         return 0;
      } else {
         int var3 = 0;

         try {
            for (BlockPos var5 : positions) {
               if (var5 != null && this.method_918(item, var5)) {
                  var3++;
               }
            }
         } finally {
            this.method_929();
         }

         this.method_976("placeMany finished item=%s placed=%d/%d.", this.method_977(item), var3, positions.size());
         return var3;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   @iFT13zrx_wTXP
   private void method_935(Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var1) {
      if (var1.method_1045() instanceof ScreenHandlerSlotUpdateS2CPacket var4) {
         this.method_944(var4, var1);
      } else if (var1.method_1045() instanceof BlockUpdateS2CPacket var2) {
         if (!var2.method_11308().method_26215()) {
            this.field_487.remove(var2.method_11309().method_10062());
         }
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) net.minecraft.util.math.Direction
   public static Direction method_936(BlockPos pos) {
      if (pos != null && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687 != null && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null) {
         Direction var1 = null;
         double var2 = -1.0;

         for (Direction var7 : Direction.values()) {
            if (!Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1687.method_8320(pos.method_10093(var7)).method_26215()) {
               double var8 = method_937(pos, var7);
               if (var8 >= 0.0 && (var2 < 0.0 || var8 < var2)) {
                  var2 = var8;
                  var1 = var7;
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Direction) double
   private static double method_937(BlockPos var0, Direction var1) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 == null) {
         return -1.0;
      } else {
         Vec3d var2 = new Vec3d(
            var0.method_10263() + var1.method_10148() / 2.0F,
            var0.method_10264() + var1.method_10164() / 2.0F,
            var0.method_10260() + var1.method_10165() / 2.0F
         );
         return Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_33571().method_1025(var2);
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos, net.minecraft.util.math.Vec3d) net.minecraft.util.math.Direction
   private Direction method_938(BlockPos var1, Vec3d var2) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null && var2 != null) {
         Vec3d var3 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_33571();
         double var4 = var2.field_1352 - var3.field_1352;
         double var6 = var2.field_1351 - var3.field_1351;
         double var8 = var2.field_1350 - var3.field_1350;
         return Direction.method_10142(var4, var6, var8).method_10153();
      } else {
         return Direction.field_11036;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item) boolean
   private boolean method_939(Item var1) {
      return this.method_940(var1, Hand.field_5808);
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.Hand) boolean
   private boolean method_940(Item var1, Hand var2) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 == null) {
         return false;
      } else {
         this.method_941();
         this.field_494 = var2;
         if (var2 == Hand.field_5810) {
            if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_6079().method_31574(var1)) {
               this.field_491 = true;
               this.method_976("Swap ready item=%s hand=%s source=existing-offhand.", this.method_977(var1), var2);
               return true;
            } else {
               int var4 = Dev.ZWare.Client.pkg1.Class9.method_140(var1x -> var1x.method_31574(var1), 0, 35);
               if (var4 == -1) {
                  this.method_942();
                  this.method_976("Swap failed item=%s hand=%s reason=item-not-found.", this.method_977(var1), var2);
                  return false;
               } else {
                  this.field_491 = true;
                  this.method_976("Swap ready item=%s hand=%s source=temp-offhand slot=%d.", this.method_977(var1), var2, var4);
                  return true;
               }
            }
         } else if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_6047().method_31574(var1)) {
            this.field_491 = true;
            this.method_976("Swap ready item=%s hand=%s source=existing-mainhand.", this.method_977(var1), var2);
            return true;
         } else {
            int var3 = Dev.ZWare.Client.pkg1.Class9.method_140(var1x -> var1x.method_31574(var1), 0, 35);
            if (var3 == -1) {
               this.method_942();
               this.method_976("Swap failed item=%s hand=%s reason=item-not-found.", this.method_977(var1), var2);
               return false;
            } else {
               this.field_491 = true;
               if (var3 <= 8) {
                  this.field_493 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_31548().method_67532();
                  if (!Dev.ZWare.Client.pkg1.Class9.method_151(var3)) {
                     this.method_942();
                     this.method_976("Swap failed item=%s hand=%s reason=select-hotbar-failed slot=%d.", this.method_977(var1), var2, var3);
                     return false;
                  } else {
                     this.method_976("Swap ready item=%s hand=%s source=hotbar slot=%d previous=%d.", this.method_977(var1), var2, var3, this.field_493);
                     return true;
                  }
               } else if (!Dev.ZWare.Client.pkg1.Class9.method_145(var3)) {
                  this.method_942();
                  this.method_976("Swap failed item=%s hand=%s reason=swap-into-selected-failed slot=%d.", this.method_977(var1), var2, var3);
                  return false;
               } else {
                  this.field_492 = var3;
                  this.method_976("Swap ready item=%s hand=%s source=inventory slot=%d.", this.method_977(var1), var2, var3);
                  return true;
               }
            }
         }
      }
   }

   // $VF: renamed from: b () void
   private void method_941() {
      if (this.field_491 && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null) {
         if (this.field_492 != -1) {
            if (this.field_494 == Hand.field_5810) {
               Dev.ZWare.Client.pkg1.Class9.method_152(this.field_492);
            } else {
               Dev.ZWare.Client.pkg1.Class9.method_145(this.field_492);
            }

            this.method_976("Swap restored hand=%s slot=%d.", this.field_494, this.field_492);
         }

         if (this.field_493 != -1) {
            Dev.ZWare.Client.pkg1.Class9.method_151(this.field_493);
            this.method_976("Restored previous hotbar slot=%d.", this.field_493);
         }

         this.method_942();
      } else {
         this.method_942();
      }
   }

   // $VF: renamed from: c () void
   private void method_942() {
      this.field_491 = false;
      this.field_492 = -1;
      this.field_493 = -1;
      this.field_494 = Hand.field_5808;
   }

   // $VF: renamed from: a (net.minecraft.item.ItemStack) void
   private void method_943(ItemStack var1) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 == null) {
         this.method_945();
      } else {
         this.field_496 = var1.method_7972();
         this.field_495 = System.currentTimeMillis() + 200L;
      }
   }

   // $VF: renamed from: a (net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket, Dev.ZWare.Client.pkg2.pkg1.Class16$Inner1) void
   private void method_944(ScreenHandlerSlotUpdateS2CPacket var1, Dev.ZWare.Client.pkg2.pkg1.Class16.Inner1 var2) {
      if (var1.method_11452() == 0 && var1.method_11450() == 45) {
         if (this.field_495 >= 0L) {
            long var3 = System.currentTimeMillis();
            if (var3 > this.field_495) {
               this.method_945();
            } else if (ItemStack.method_7973(var1.method_11449(), this.field_496)) {
               this.method_945();
            } else {
               var2.method_1048();
               this.method_976("Ignored transient offhand sync stack=%s.", var1.method_11449().method_7909());
            }
         }
      }
   }

   // $VF: renamed from: d () void
   private void method_945() {
      this.field_495 = -1L;
      this.field_496 = ItemStack.field_8037;
   }

   // $VF: renamed from: a (long, boolean) boolean
   private boolean method_946(long var1, boolean var3) {
      int var4 = this.method_956();
      int var5 = this.method_953();
      if (this.field_490 != -1L && var1 - this.field_490 < var4 && this.field_489 >= var5) {
         return false;
      } else {
         if (var3) {
            this.field_489++;
         }

         if (this.field_490 == -1L || var1 - this.field_490 >= var4) {
            this.field_490 = var1;
            this.field_489 = 0;
         }

         return true;
      }
   }

   // $VF: renamed from: a (long) int
   private int method_947(long var1) {
      int var3 = this.method_953();
      int var4 = this.method_956();
      return this.field_490 != -1L && var1 - this.field_490 < var4 ? Math.max(0, var3 - this.field_489) : var3;
   }

   // $VF: renamed from: a () Dev.ZWare.Client.features.pkg1.pkg4.Class9
   private Dev.ZWare.Client.features.pkg1.pkg4.Class9 method_948() {
      if (Dev.ZWare.Client.Class1.field_316 != null) {
         Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class9.class);
         if (var1 != null) {
            return var1;
         }
      }

      return Dev.ZWare.Client.features.pkg1.pkg4.Class9.method_3092();
   }

   // $VF: renamed from: b () boolean
   private boolean method_949() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 != null ? var1.method_3114() : false;
   }

   // $VF: renamed from: c () boolean
   private boolean method_950() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 == null || var1.method_3115();
   }

   // $VF: renamed from: d () boolean
   private boolean method_951() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 == null || var1.method_3116();
   }

   // $VF: renamed from: b () int
   private int method_952() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 != null ? var1.method_3119() : 30;
   }

   // $VF: renamed from: c () int
   private int method_953() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 != null ? var1.method_3120() : 9;
   }

   // $VF: renamed from: a () double
   private double method_954() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 != null ? var1.method_3117() : 0.0;
   }

   // $VF: renamed from: b () double
   private double method_955() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 != null ? var1.method_3118() : 6.0;
   }

   // $VF: renamed from: d () int
   private int method_956() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var1 = this.method_948();
      return var1 != null ? var1.method_3121() : 300;
   }

   // $VF: renamed from: a (long) void
   private void method_957(long var1) {
      long var3 = Math.max(1000L, (long)Math.ceil(this.method_954() * 1000.0));
      this.field_487.entrySet().removeIf(var4 -> var1 - var4.getValue() > var3);
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) boolean
   private boolean method_958(BlockPos var1) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null && var1 != null) {
         double var2 = this.method_955();
         return var2 > 0.0
            && Dev.ZWare.Client.pkg1.Class7.method_121(Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_33571(), new Box(var1)) <= var2 * var2;
      } else {
         return false;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item, net.minecraft.util.Hand, net.minecraft.util.math.Direction, net.minecraft.util.math.BlockPos, net.minecraft.util.math.Vec3d, net.minecraft.block.BlockState) Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_959(Item var1, Hand var2, Direction var3, BlockPos var4, Vec3d var5, BlockState var6) {
      if (var6 != null && var1 instanceof BlockItem var7) {
         Class16.Inner2 var8 = this.method_960(var7, var2, var3, var4, var5, var6);
         return var8 != null ? var8 : this.method_964(var6);
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.BlockItem, net.minecraft.util.Hand, net.minecraft.util.math.Direction, net.minecraft.util.math.BlockPos, net.minecraft.util.math.Vec3d, net.minecraft.block.BlockState) Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_960(BlockItem var1, Hand var2, Direction var3, BlockPos var4, Vec3d var5, BlockState var6) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null && var3 != null && var4 != null && var5 != null) {
         Class16.Inner2 var7 = this.method_972();
         BlockState var8 = this.method_961(var1, var2, var3, var4, var5, var7);
         int var9 = this.method_962(var8, var6);
         Class16.Inner2 var10 = null;
         int var11 = Integer.MIN_VALUE;
         double var12 = Double.POSITIVE_INFINITY;

         for (float var17 : field_486) {
            for (float var21 : field_485) {
               Class16.Inner2 var22 = new Class16.Inner2(var21, var17);
               BlockState var23 = this.method_961(var1, var2, var3, var4, var5, var22);
               int var24 = this.method_962(var23, var6);
               double var25 = this.method_973(var7, var22);
               if (var24 > var11 || var24 == var11 && var25 < var12) {
                  var11 = var24;
                  var10 = var22;
                  var12 = var25;
               }
            }
         }

         if (var9 < 1000) {
            return var11 > 0 ? var10 : null;
         } else {
            return var11 >= 1000 && var10 != null && var12 > 6.0 ? var10 : null;
         }
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.item.BlockItem, net.minecraft.util.Hand, net.minecraft.util.math.Direction, net.minecraft.util.math.BlockPos, net.minecraft.util.math.Vec3d, Dev.ZWare.Client.pkg4.Class16$Inner2) net.minecraft.block.BlockState
   private BlockState method_961(BlockItem var1, Hand var2, Direction var3, BlockPos var4, Vec3d var5, Class16.Inner2 var6) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null
         && var1 != null
         && var2 != null
         && var3 != null
         && var4 != null
         && var5 != null
         && var6 != null) {
         ItemStack var7 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_5998(var2);
         if (!var7.method_31574(var1.method_8389())) {
            var7 = var1.method_7854();
         }

         float var8 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36454();
         float var9 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_6241;
         float var10 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36455();
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36456(var6.method_1458());
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_6241 = var6.method_1458();
         Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36457(var6.method_1459());

         Object var13;
         try {
            ItemPlacementContext var11 = new ItemPlacementContext(
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724, var2, var7, new BlockHitResult(var5, var3, var4, false)
            );
            ItemPlacementContext var19 = ((Class33)var1).zware$getPlacementContext(var11);
            if (var19 != null) {
               return ((Class33)var1).zware$getPlacementState(var19);
            }

            var13 = null;
         } catch (Throwable var17) {
            return null;
         } finally {
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36456(var8);
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_6241 = var9;
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36457(var10);
         }

         return (BlockState)var13;
      } else {
         return null;
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.block.BlockState) int
   private int method_962(BlockState var1, BlockState var2) {
      if (var1 != null && var2 != null && var1.method_26204() == var2.method_26204()) {
         if (var1.equals(var2)) {
            return 1000;
         } else {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;

            for (Property var7 : var2.method_28501()) {
               if (var1.method_28498(var7)) {
                  boolean var8 = this.method_963(var1, var2, var7);
                  boolean var9 = field_484.contains(var7.method_11899());
                  if (var9) {
                     var5++;
                     if (var8) {
                        var4++;
                        var3 += 100;
                     } else {
                        var3 -= 25;
                     }
                  } else if (var8) {
                     var3++;
                  }
               }
            }

            if (var5 > 0 && var4 == var5) {
               var3 += 250;
            }

            return var3;
         }
      } else {
         return Integer.MIN_VALUE;
      }
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState, net.minecraft.block.BlockState, net.minecraft.state.property.Property) boolean
   private boolean method_963(BlockState var1, BlockState var2, Property<?> var3) {
      return var1.method_11654(var3).equals(var2.method_11654(var3));
   }

   // $VF: renamed from: a (net.minecraft.block.BlockState) Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_964(BlockState var1) {
      Direction var2 = var1.method_28498(Properties.field_12481) ? (Direction)var1.method_11654(Properties.field_12481) : null;
      if (var1.method_28498(Properties.field_12555)) {
         BlockFace var3 = (BlockFace)var1.method_11654(Properties.field_12555);

         return switch (var3) {
            case field_12475 -> new Class16.Inner2(this.method_968(var2), -90.0F);
            case field_12473 -> new Class16.Inner2(this.method_968(var2), 90.0F);
            case field_12471 -> var2 != null ? this.method_966(var2) : null;
            default -> throw new MatchException(null, null);
         };
      } else if (var1.method_28498(Properties.field_12525)) {
         return this.method_965((Direction)var1.method_11654(Properties.field_12525));
      } else if (var2 != null) {
         return this.method_966(var2);
      } else {
         return var1.method_28498(Properties.field_12496) ? this.method_967((Axis)var1.method_11654(Properties.field_12496)) : null;
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Direction) Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_965(Direction var1) {
      if (var1 == null) {
         return null;
      } else if (var1.method_10166().method_10178()) {
         Direction var2 = var1.method_10153();

         return switch (var2) {
            case field_11036 -> new Class16.Inner2(this.method_970(), -90.0F);
            case field_11033 -> new Class16.Inner2(this.method_970(), 90.0F);
            default -> null;
         };
      } else {
         return new Class16.Inner2(this.method_969(var1), 0.0F);
      }
   }

   // $VF: renamed from: b (net.minecraft.util.math.Direction) Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_966(Direction var1) {
      return var1 == null ? null : new Class16.Inner2(this.method_969(var1.method_10153()), 0.0F);
   }

   // $VF: renamed from: a (net.minecraft.util.math.Direction.Axis) Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_967(Axis var1) {
      if (var1 == null) {
         return null;
      } else {
         return switch (var1) {
            case field_11048 -> new Class16.Inner2(-90.0F, 0.0F);
            case field_11052 -> new Class16.Inner2(this.method_970(), 90.0F);
            case field_11051 -> new Class16.Inner2(0.0F, 0.0F);
            default -> throw new MatchException(null, null);
         };
      }
   }

   // $VF: renamed from: a (net.minecraft.util.math.Direction) float
   private float method_968(Direction var1) {
      return var1 == null ? this.method_970() : this.method_969(var1.method_10153());
   }

   // $VF: renamed from: b (net.minecraft.util.math.Direction) float
   private float method_969(Direction var1) {
      return switch (var1) {
         case field_11035 -> 0.0F;
         case field_11039 -> 90.0F;
         case field_11043 -> 180.0F;
         case field_11034 -> -90.0F;
         default -> this.method_970();
      };
   }

   // $VF: renamed from: a () float
   private float method_970() {
      if (Dev.ZWare.Client.Class1.field_298 != null) {
         return Dev.ZWare.Client.Class1.field_298.method_355();
      } else {
         return Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null ? Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36454() : 0.0F;
      }
   }

   // $VF: renamed from: b () float
   private float method_971() {
      if (Dev.ZWare.Client.Class1.field_298 != null) {
         return Dev.ZWare.Client.Class1.field_298.method_356();
      } else {
         return Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null ? Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36455() : 0.0F;
      }
   }

   // $VF: renamed from: a () Dev.ZWare.Client.pkg4.Class16$Inner2
   private Class16.Inner2 method_972() {
      return new Class16.Inner2(this.method_970(), this.method_971());
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class16$Inner2, Dev.ZWare.Client.pkg4.Class16$Inner2) double
   private double method_973(Class16.Inner2 var1, Class16.Inner2 var2) {
      if (var1 != null && var2 != null) {
         float var3 = MathHelper.method_15393(var2.method_1458() - var1.method_1458());
         float var4 = var2.method_1459() - var1.method_1459();
         return Math.abs(var3) + Math.abs(var4);
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }

   // $VF: renamed from: a (Dev.ZWare.Client.pkg4.Class16$Inner2) void
   private void method_974(Class16.Inner2 var1) {
      if (Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724 != null && Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.method_1562() != null && var1 != null) {
         if (this.method_975() && Dev.ZWare.Client.Class1.field_298 != null) {
            float var2 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36454();
            float var3 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_6241;
            float var4 = Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36455();
            Dev.ZWare.Client.Class1.field_298.method_325(var1.method_1458(), var1.method_1459(), 110.0);
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36456(var1.method_1458());
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_6241 = var1.method_1458();
            Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36457(var1.method_1459());

            try {
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
                  .method_1562()
                  .method_52787(
                     new LookAndOnGround(
                        var1.method_1458(),
                        var1.method_1459(),
                        Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_24828(),
                        Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_5976
                     )
                  );
            } finally {
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36456(var2);
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_6241 = var3;
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_36457(var4);
            }
         } else {
            if (Dev.ZWare.Client.Class1.field_298 != null) {
               Dev.ZWare.Client.Class1.field_298.method_312(var1.method_1458(), var1.method_1459(), 110.0);
            } else {
               Dev.ZWare.Client.pkg1.pkg5.Class1.field_0
                  .method_1562()
                  .method_52787(
                     new LookAndOnGround(
                        var1.method_1458(),
                        var1.method_1459(),
                        Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.method_24828(),
                        Dev.ZWare.Client.pkg1.pkg5.Class1.field_0.field_1724.field_5976
                     )
                  );
            }
         }
      }
   }

   // $VF: renamed from: e () boolean
   private boolean method_975() {
      Dev.ZWare.Client.features.pkg1.pkg4.Class7 var1 = Dev.ZWare.Client.features.pkg1.pkg4.Class7.method_3369();
      return var1 != null && var1.method_3372();
   }

   // $VF: renamed from: a (java.lang.String, java.lang.Object[]) void
   private void method_976(String var1, Object... var2) {
      Dev.ZWare.Client.features.pkg1.pkg4.Class9 var3 = this.method_948();
      if (var3 != null) {
         var3.method_3123(var1, var2);
      }
   }

   // $VF: renamed from: a (net.minecraft.item.Item) java.lang.String
   private String method_977(Item var1) {
      return var1 == null ? "null" : var1.method_63680().getString();
   }

   // $VF: renamed from: a (net.minecraft.util.math.BlockPos) java.lang.String
   private String method_978(BlockPos var1) {
      return var1 == null ? "null" : var1.method_10263() + "," + var1.method_10264() + "," + var1.method_10260();
   }

   // $VF: renamed from: a (net.minecraft.util.math.Vec3d) java.lang.String
   private String method_979(Vec3d var1) {
      return var1 == null ? "null" : String.format(Locale.ROOT, "%.2f,%.2f,%.2f", var1.field_1352, var1.field_1351, var1.field_1350);
   }

   private record Inner2(float cP, float cQ) {
      // $VF: renamed from: cP float
      private final float field_928;
      // $VF: renamed from: cQ float
      private final float field_929;

      private Inner2(float cP, float cQ) {
         this.field_928 = cP;
         this.field_929 = cQ;
      }

      // $VF: renamed from: cP () float
      public float method_1458() {
         return this.field_928;
      }

      // $VF: renamed from: cQ () float
      public float method_1459() {
         return this.field_929;
      }
   }
}
