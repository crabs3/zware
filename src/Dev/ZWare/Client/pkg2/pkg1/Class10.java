package Dev.ZWare.Client.pkg2.pkg1;

import net.minecraft.client.gui.hud.MessageIndicator;
import net.minecraft.network.message.MessageSignatureData;
import net.minecraft.text.Text;

public class Class10 extends Dev.ZWare.Client.pkg2.Class1 {
   // $VF: renamed from: b net.minecraft.text.Text
   private Text field_556;
   // $VF: renamed from: c net.minecraft.network.message.MessageSignatureData
   private final MessageSignatureData field_557;
   // $VF: renamed from: d net.minecraft.client.gui.hud.MessageIndicator
   private final MessageIndicator field_558;

   public Class10(Text message, MessageSignatureData signature, MessageIndicator indicator) {
      this.field_556 = message;
      this.field_557 = signature;
      this.field_558 = indicator;
   }

   // $VF: renamed from: a () net.minecraft.text.Text
   public Text method_1049() {
      return this.field_556;
   }

   // $VF: renamed from: a (net.minecraft.text.Text) void
   public void method_1050(Text message) {
      this.field_556 = message;
   }

   // $VF: renamed from: a () net.minecraft.network.message.MessageSignatureData
   public MessageSignatureData method_1051() {
      return this.field_557;
   }

   // $VF: renamed from: a () net.minecraft.client.gui.hud.MessageIndicator
   public MessageIndicator method_1052() {
      return this.field_558;
   }
}
