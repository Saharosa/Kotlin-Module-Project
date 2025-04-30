class NotesScreen(val archiveScreen: ArchiveScreen,var createNoteScreen: CreateNoteScreen? =null,var note: ScreenOfNote? =null): ScreenPrototype(){
    var archive: Archive? = null
        set(value) {
            field = value
        }
    override fun display() {
        val notes = archive!!.notes
        createNoteScreen!!.notes = notes
        val size = notes.size
        println("\nЗаметки архива ${archive!!.title}:\n1. Создать заметку")
        putList<Note>(notes)
        println("${notes.size+2}. Выход")
        val choise = readLine()
        when(choise?.toIntOrNull()){
            1->createNoteScreen?.display()
            in 2..notes.size+1-> note?.display(notes[choise?.toIntOrNull()!!-2])
            notes.size+2-> archiveScreen.display()
            else -> {
                println("Некорректный ввод")
                this.display()
            }
        }
    }
}
