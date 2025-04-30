import java.util.Scanner

class CreateArchiveScreen(val archives: MutableList<Archive>, val archiveScreen: ArchiveScreen): ScreenPrototype() {
    override fun display() {
        println("\nВведите название архива:\n1. Выход ")
        var title = getTitle()
        when (title?.toIntOrNull()) {
            1 -> archiveScreen.display()
            else -> {
                if (archives.add(Archive(title))) println("Архив $title успешно добавлен")
                else println("Что то пошло не так")
                archiveScreen.display()
            }
        }
    }
}