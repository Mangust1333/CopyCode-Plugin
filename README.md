# CopyCode Plugin
# Разработал: Кубанцев Владислав Сергеевич M3108

## Плагин `CopyCode` представляет собой инструмент для упрощения работы связанной с рефакторингом, копированием, пересылкой и вырезкой блоков кода.


Разработанный с учетом повседневных задач программистов, этот плагин обеспечивает удобный способ подготовки кода для пересылки, обеспечивая его форматирование.
Также плагин реализует модификацию функций копирования и вырезки текста. 
Каждая модификация подразумевает под собой рефакторинг выделенного кода: перед копированием, вырезкой и отправкой текст дополняется тройными кавычками (```) в начале и конце, а также припиской расширения файла, затем копируется в буфер обмена.

Выглядит это следующим образом:

\`\`\` *Расширение файла*<br>
**Скопированный текст**<br>
\`\`\`


## Описание класса CopyCode

Класс содержит в себе функции 

`actionPerformed` 

`determineLanguage` 

`openTelegramSharePage`

### actionPerformed
Это основная функция, которая определяет, какой метод необходимо использовать в зависимости от нажатого сочетания клавиш, а также вызывает этот метод или выполняет определённый набор команд, если методы не требуются.

### determineLanguage
Метод, используемый для получения информации о расширении форматируемого файла.

### openTelegramSharePage
Метод используемый для пересылки выделенного кода в телеграмм.
