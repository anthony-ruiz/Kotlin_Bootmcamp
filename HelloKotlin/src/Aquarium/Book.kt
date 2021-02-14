
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
    val myBook = Book("don quijote", "pepe", 2012)
    print(myBook.basicInfo().toString())
    print(myBook.allInfo().toString())
    val (name, author, year ) = myBook.allInfo()
    print("Here is your book $name written by $author in $year")
}