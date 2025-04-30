import java.util.Scanner

fun <T:Lst>putList(archives: MutableList<T>){
    val size = archives.size
    for (i in 2 until size+2){
        println("$i. ${archives[i-2].title}")
    }
}
fun getTitle(): String{
    var title = Scanner(System.`in`).nextLine()
    while (title.isBlank()) {
        println("Название заметки не может быть пустым")
        title = Scanner(System.`in`).nextLine()
    }
    return title
}