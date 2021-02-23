package LessonSix


fun List<Int>.divisibleBy( block : (Int) -> Int) : List<Int> {
    var myList = mutableListOf<Int>()
        for(item in this){
            if(block(item) == 0){
                myList.add(item)
            }
        }
    return myList
}


fun main(args : Array<String>){
    var myList = listOf(11,12,13,14,15,16,17,18,19,20)
    print(myList.divisibleBy { it.rem(3) })
}