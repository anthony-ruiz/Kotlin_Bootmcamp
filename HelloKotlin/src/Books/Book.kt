import kotlin.random.Random

const val MAX_BOOKS_BORROWED = 20



class Book(var title: String, var author: String, var year : Int, var pages :Int){


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

fun Book.weight(book :Book)  = book.pages * 1.5

fun Book.tornPages(book : Book, pages: Int) {
    book.pages -= pages
    println("pages torn: $pages")
}

class Puppy{
    fun playWithBook(book: Book) = book.tornPages(book, Random.nextInt(book.pages))
}

fun main(args : Array<String>){
    val myBook = Book("Hamlet","Shakespeare", 1601,205)
    println("initial pages: ${myBook.pages}")
    val myPuppy = Puppy()
    myPuppy.playWithBook(myBook)
    println("book ended with: ${myBook.pages}")


}