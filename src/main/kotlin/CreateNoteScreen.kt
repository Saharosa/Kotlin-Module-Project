import java.util.Scanner

class CreateNoteScreen(val notesScreen: NotesScreen): ScreenPrototype(){
    var notes: MutableList<Note>? = null
        set(value){
            field = value
        }
    override fun display() {
        println("\nВведите имя заметки\n1. Выход")
        var title = getTitle()
        when(title?.toIntOrNull()){
            1->notesScreen.display()
            else -> {
                println("Введите текст для заметки")
                var text = Scanner(System.`in`).nextLine()
                while(title==null){
                    println("Содержание заметки не может быть пустым")
                    text = Scanner(System.`in`).nextLine()
                }
                if(notes!!.add(Note(title,text))) println("Заметка $title успешно добавлен")
                else println("Что то пошло не так")
                notesScreen.display()
            }
        }
    }
}
