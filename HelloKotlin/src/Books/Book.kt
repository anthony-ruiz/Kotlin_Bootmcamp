
class Book(var title: String, var author: String, var year : Int){

    fun basicInfo() : Pair<String, String> {
       return  title to author
        //return myValue
    }

    fun allInfo(): Triple<String, String, Int> {
        return Triple(title,author,year)
    }
}

fun main(args : Array<String>){

    val allBooks = setOf("Hamlet", "MacBeth", "Rome and Juliet")
    val library = mapOf("shakespeare" to allBooks)

    println(library.any { it.value.contains("Hamlet") })

    var moreBooks = mutableMapOf("Lion King" to "Steven" )
    moreBooks.getOrPut("Romeo and Juliet" , {"shakespeare"})
    moreBooks.forEach{ it -> println("author: ${it.key} book: ${it.value} ")}
}