
const val MAX_BOOKS_BORROWED = 20



class Book(var title: String, var author: String, var year : Int){


    fun canBorrow(booksBorrowed :Int) : Boolean{
        return booksBorrowed <= MAX_BOOKS_BORROWED
    }

    companion object{
        const val BASE_URL = "www.amazon.com/"
    }

    fun printURL(){
        print("$BASE_URL$author.html")
    }

}

fun main(args : Array<String>){
    val myBook = Book("Hamlet" , "Shakespeare" , 1601)
    myBook.printURL()


}