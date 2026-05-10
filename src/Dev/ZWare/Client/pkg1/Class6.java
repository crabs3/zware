package Dev.ZWare.Client.pkg1;

public final class Class6 {
   private Class6() {
   }

   // $VF: renamed from: a (java.lang.String) java.lang.String
   public static String method_200(String key) {
      return method_203() ? method_205(key) : method_204(key);
   }

   // $VF: renamed from: b (java.lang.String) java.lang.String
   public static String method_201(String internalName) {
      return method_203() ? method_207(internalName) : internalName;
   }

   // $VF: renamed from: c (java.lang.String) java.lang.String
   public static String method_202(String categoryName) {
      return method_203() ? method_206(categoryName) : categoryName;
   }

   // $VF: renamed from: a () boolean
   private static boolean method_203() {
      if (Dev.ZWare.Client.Class1.field_316 == null) {
         return false;
      } else {
         Dev.ZWare.Client.features.pkg1.pkg4.Class8 var0 = Dev.ZWare.Client.Class1.field_316.method_510(Dev.ZWare.Client.features.pkg1.pkg4.Class8.class);
         return var0 != null && var0.field_1360 != null && var0.field_1360.method_671() == Dev.ZWare.Client.features.pkg1.pkg4.Class8.Inner5.Russian;
      }
   }

   // $VF: renamed from: d (java.lang.String) java.lang.String
   private static String method_204(String var0) {
      return switch (var0) {
         case "fps" -> "FPS";
         case "ping" -> "Ping";
         case "tps" -> "TPS";
         case "speed" -> "Speed";
         case "bps" -> "b/s";
         case "cps" -> "CPS";
         case "eye_range" -> "EyeRange";
         case "on" -> "ON";
         case "off" -> "OFF";
         case "module_info" -> "Module Info";
         case "session" -> "Session";
         case "lifetime" -> "Lifetime";
         case "singleplayer" -> "Singleplayer";
         case "player" -> "Player";
         case "notif_entered_range" -> "Entered Visual Range";
         case "notif_left_range" -> "Left Visual Range";
         case "notif_enabled" -> "enabled";
         case "notif_disabled" -> "disabled";
         case "notif_is" -> " is ";
         case "notif_popped" -> " Just Popped ";
         case "notif_totem" -> " Totem";
         case "notif_totems" -> " Totems";
         default -> var0;
      };
   }

   // $VF: renamed from: e (java.lang.String) java.lang.String
   private static String method_205(String var0) {
      return switch (var0) {
         case "fps" -> "ФПС";
         case "ping" -> "Пинг";
         case "tps" -> "ТПС";
         case "speed" -> "Скорость";
         case "bps" -> "б/с";
         case "cps" -> "КПС";
         case "eye_range" -> "Дальность";
         case "on" -> "ВКЛ";
         case "off" -> "ВЫКЛ";
         case "module_info" -> "Инфо";
         case "session" -> "Сессия";
         case "lifetime" -> "За всё время";
         case "singleplayer" -> "Одиночная";
         case "player" -> "Игрок";
         case "notif_entered_range" -> "Вошел в зону видимости";
         case "notif_left_range" -> "Вышел из зоны видимости";
         case "notif_enabled" -> "включен";
         case "notif_disabled" -> "выключен";
         case "notif_is" -> " ";
         case "notif_popped" -> " Попнул ";
         case "notif_totem" -> " Тотем";
         case "notif_totems" -> " Тотемов";
         default -> var0;
      };
   }

   // $VF: renamed from: f (java.lang.String) java.lang.String
   private static String method_206(String var0) {
      return switch (var0) {
         case "Combat" -> "Бой";
         case "Movement" -> "Движение";
         case "Visuals" -> "Визуалы";
         case "Player" -> "Игрок";
         case "Extra" -> "Прочее";
         case "Client" -> "Клиент";
         case "Hud" -> "ХАД";
         default -> var0;
      };
   }

   // $VF: renamed from: g (java.lang.String) java.lang.String
   private static String method_207(String var0) {
      return switch (var0) {
         case "Crystal Aura" -> "Кристальная Аура";
         case "Anchor Aura" -> "Якорная Аура";
         case "Auto Mine" -> "Авто Добыча";
         case "Auto Trap" -> "Авто Ловушка";
         case "Base Place" -> "База";
         case "Blocker" -> "Блокировщик";
         case "Fall Blocker" -> "Защита Падения";
         case "Kill Aura" -> "Аура Убийства";
         case "Key Action" -> "Кей Экшн";
         case "Marker" -> "Маркер";
         case "Offhand" -> "Левая Рука";
         case "Phase" -> "Фаза";
         case "Surround" -> "Окружение";
         case "Auto Respawn" -> "Авто Возрождение";
         case "Anti Mace" -> "Анти Булава";
         case "Anti Desync" -> "Анти Десинк";
         case "Armor Swap" -> "Смена Брони";
         case "Air Place" -> "Воздушная Расстановка";
         case "Double Mine" -> "Двойная Добыча";
         case "Bounce" -> "Прыжок";
         case "Elytra" -> "Элитры";
         case "Elytra Control" -> "Контроль Элитр";
         case "No Jump Delay" -> "Без Задержки";
         case "No Rotate" -> "Без Поворота";
         case "No Slow" -> "Без Замедления";
         case "Speed" -> "Скорость";
         case "Sprint" -> "Бег";
         case "Disabler" -> "Дисейблер";
         case "Grim Disabler" -> "Грим Дисейблер";
         case "Camera Tweaks" -> "Камера";
         case "Highlight" -> "Подсветка Блоков";
         case "Chams" -> "Чамс";
         case "Death Effects" -> "Эффекты Смерти";
         case "Fake Item" -> "Фейк Предмет";
         case "FullBright" -> "Яркость";
         case "Break Indicators" -> "Индикаторы";
         case "Logout Spots" -> "Точки Выхода";
         case "Models" -> "Модели";
         case "Nametags" -> "Ники";
         case "No Render" -> "Без Рендера";
         case "Particles" -> "Частицы";
         case "Pop Chams" -> "Тотем Чамс";
         case "Preview" -> "Предпросмотр";
         case "Search" -> "Поиск";
         case "Tab" -> "Таб";
         case "View Model" -> "Вид Рук";
         case "Auto Disconnect" -> "Авто Выход";
         case "Auto EXP" -> "Авто Опыт";
         case "Auto Portal" -> "Авто Портал";
         case "Auto Shark" -> "Авто Шарк";
         case "Farm" -> "Ферма";
         case "Filler" -> "Заполнитель";
         case "Illegal Disconnect" -> "Незаконный Выход";
         case "Inventory Cleaner" -> "Очистка";
         case "InvTweaks" -> "Инвентарь";
         case "Logger" -> "Логгер";
         case "Notebot" -> "Нотбот";
         case "Nuker" -> "Нюкер";
         case "Rekit" -> "Авто-Пополнение";
         case "Scanner" -> "Сканер";
         case "Scaffold" -> "Строительство";
         case "Stop Motion" -> "Стоп Моушен";
         case "VaultESP" -> "Хранилище ESP";
         case "Fast Place" -> "Быстрая Расстановка";
         case "Packet Test" -> "Тест Пакетов";
         case "Watermark" -> "Водяной Знак";
         case "User" -> "Пользователь";
         case "Coordinates" -> "Координаты";
         case "NewCoords" -> "Новые Коорды";
         case "ArmorHud" -> "Броня";
         case "PotionsHud" -> "Зелья";
         case "TPS" -> "ТПС";
         case "Ping" -> "Пинг";
         case "NewPing" -> "Новый Пинг";
         case "FPS" -> "ФПС";
         case "NewSpeed" -> "Новая Скорость";
         case "ModuleInfos" -> "Инфо Модулей";
         case "EyeRange" -> "Дальность";
         case "CPS" -> "КПС";
         case "CountsHud" -> "Счётчик";
         case "Stats" -> "Статистика";
         case "TotemCount" -> "Тотемы";
         case "VisualRangeHud" -> "Визуальный Диапазон";
         case "MapsBroken" -> "Сломанные Карты";
         case "PacketLimiterHud" -> "Лимитер Пакетов";
         case "AntiCheat" -> "Фиксы";
         case "Client" -> "Клиент";
         case "DiscordRPC" -> "Discord RPC";
         case "HUD Editor" -> "Редактор ХАД";
         case "Sounds" -> "Звуки";
         case "Notifications" -> "Уведомления";
         default -> var0;
      };
   }
}
