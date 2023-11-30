# openTelegramSharePage

Публичный метод, создающий https запрос на официальную страницу Telegram: Share web page `https://t.me/share/url?url="Наш_текст"`

# Входные данные
String `message` - пересылаемое сообщение
# Результат работы
Открытие страницы Telegram: Share web page в браузере
# Пример вызова
Входные данные:<br>`openTelegramSharePage("```cpp\nmandarinka\n\```")`<br>
Результат работы:<br> открытие страницы в браузере `https://t.me/share/url?url=%60%60%60cpp%0Amandarinka%0A%60%60%60`