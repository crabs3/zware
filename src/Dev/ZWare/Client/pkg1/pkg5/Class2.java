package Dev.ZWare.Client.pkg1.pkg5;

import com.google.gson.JsonElement;

public interface Class2 {
   JsonElement toJson();

   void fromJson(JsonElement var1);

   default String getFileName() {
      return "";
   }
}
