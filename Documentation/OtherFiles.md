# Краткая Документация для проекта на Gradle

## 1. [`build.gradle.kts`](https://github.com/Mangust1333/CopyCode-Plugin/blob/7d28ab8b2cbd8f54d56c6df428a77deb8363a32a/build.gradle.kts)

### Описание
- `build.gradle.kts` - файл конфигурации Gradle, написанный на языке Kotlin.
> [!NOTE]
> Плагины и другие настройки проекта, адаптированны под среду разработки CLion, также добавлен репозиторий maven и dependency org.telegram:telegrambots:6.8.0.

## 2. [`gradle.properties`](https://github.com/Mangust1333/CopyCode-Plugin/blob/b0e8f2eb6e83dbfcc70ee7f586b6f3ff626d3b75/gradle.properties)

### Описание
- `gradle.properties` - файл, содержащий свойства Gradle, такие как версия Gradle и другие настройки, с учетом конфигурации для работы с CLion.

## 3. [`gradlew` и `gradlew.bat`](https://github.com/Mangust1333/CopyCode-Plugin/blob/b0e8f2eb6e83dbfcc70ee7f586b6f3ff626d3b75/gradlew.bat)

### Описание
- `gradlew` (или `gradlew.bat` для Windows) - исполняемый файл для запуска задач Gradle без необходимости установки Gradle локально, с учетом совместимости с CLion.

### Рекомендации
- Используйте `./gradlew` для Unix-подобных систем и `gradlew.bat` для Windows.
- Убедитесь, что эти файлы имеют права на выполнение (Unix).

## 4. [`settings.gradle.kts`](https://github.com/Mangust1333/CopyCode-Plugin/blob/b0e8f2eb6e83dbfcc70ee7f586b6f3ff626d3b75/settings.gradle.kts)

### Описание
- `settings.gradle.kts` - файл конфигурации Gradle, определяющий структуру проекта с учетом особенностей интеграции с CLion.

## 5. [`.gitignore`](https://github.com/Mangust1333/CopyCode-Plugin/blob/b0e8f2eb6e83dbfcc70ee7f586b6f3ff626d3b75/.gitignore)

### Описание
- `.gitignore` - файл, определяющий игнорируемые Git файлы и директории, адаптированный для проекта, настроенного исключительно под CLion.