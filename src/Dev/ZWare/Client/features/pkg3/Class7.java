package Dev.ZWare.Client.features.pkg3;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class Class7 extends Class8<Set<Block>> {
   public Class7(String name) {
      super(name, new LinkedHashSet<>());
   }

   // $VF: renamed from: a (net.minecraft.block.Block) boolean
   public boolean method_730(Block block) {
      return block != null && ((Set)this.a()).contains(block);
   }

   // $VF: renamed from: a (net.minecraft.block.Block) void
   public void method_731(Block block) {
      if (block != null && block != Blocks.field_10124) {
         LinkedHashSet var2 = new LinkedHashSet((Collection)this.a());
         if (!var2.remove(block)) {
            var2.add(block);
         }

         this.a(var2);
      }
   }

   // $VF: renamed from: f () java.lang.String
   @Override
   public String method_707() {
      StringBuilder var1 = new StringBuilder();

      for (Block var3 : (Set)this.a()) {
         Identifier var4 = Registries.field_41175.method_10221(var3);
         if (var4 != null) {
            if (var1.length() > 0) {
               var1.append(',');
            }

            var1.append(var4);
         }
      }

      return var1.toString();
   }

   // $VF: renamed from: a (java.lang.String) java.util.Set
   public static Set<Block> method_732(String value) {
      LinkedHashSet var1 = new LinkedHashSet();
      if (value != null && !value.isBlank()) {
         for (String var5 : value.split(",")) {
            String var6 = var5.trim();
            if (!var6.isEmpty()) {
               Identifier var7 = Identifier.method_12829(var6);
               if (var7 != null && Registries.field_41175.method_10250(var7)) {
                  Block var8 = (Block)Registries.field_41175.method_63535(var7);
                  if (var8 != null && var8 != Blocks.field_10124) {
                     var1.add(var8);
                  }
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }
}
