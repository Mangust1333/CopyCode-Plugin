# determineLanguage

Публичный метод, определяющий расширение передаваемого в него файла.

## Входные данные
Объект VirtualFile (имя объекта: virtualFile), в котором содержится информация о файле.
## Выходные данные
Расширение передаваемого файла или null если расширения нет.
## Примеры вызова
1. determineLanguage(virtualFile)
    
    > Здесь virtualFile является объектом `VirtualFile`, а также virtualFile.getExtension() вернёт cpp

    Выходные данные: `java`
2. determineLanguage(virtualFile)

   > Здесь virtualFile является объектом `VirtualFile`, а также virtualFile.getExtension() вернёт null

   Выходные данные: `null`

