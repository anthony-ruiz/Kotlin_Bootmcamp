open  class Book (val title : String, val author : String ) {

    private var currentPage : Int = 1

    open fun readPage(){
        currentPage.inc()
    }

}
class eBook(title : String, author : String, var format: String = "text") : Book(title, author ){
    private var wordCount = 0

    override fun readPage() {
        wordCount = wordCount + 250
    }
}