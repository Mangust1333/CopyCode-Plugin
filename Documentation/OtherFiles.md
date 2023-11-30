## 1. [`build.gradle.kts`](#buildgradlekts)

### Описание
- `build.gradle.kts` - файл конфигурации Gradle, написанный на языке Kotlin.
> [!NOTE]
> Плагины и другие настройки проекта, адаптированны под среду разработки CLion, также добавлен репозиторий maven и dependency org.telegram:telegrambots:6.8.0.

## 2. [`gradle.properties`](#gradleproperties)

### Описание
- `gradle.properties` - файл, содержащий свойства Gradle, такие как версия Gradle и другие настройки, с учетом конфигурации для работы с CLion.

## 3. [`gradlew` и `gradlew.bat`](#gradlew-и-gradlewbat)

### Описание
- `gradlew` (или `gradlew.bat` для Windows) - исполняемый файл для запуска задач Gradle без необходимости установки Gradle локально, с учетом совместимости с CLion.

### Рекомендации
- Используйте `./gradlew` для Unix-подобных систем и `gradlew.bat` для Windows.
- Убедитесь, что эти файлы имеют права на выполнение (Unix).

## 4. [`settings.gradle.kts`](#settingsgradlekts)

### Описание
- `settings.gradle.kts` - файл конфигурации Gradle, определяющий структуру проекта с учетом особенностей интеграции с CLion.

## 5. [`.gitignore`](#gitignore)

### Описание
- `.gitignore` - файл, определяющий игнорируемые Git файлы и директории, адаптированный для проекта, настроенного исключительно под CLion.