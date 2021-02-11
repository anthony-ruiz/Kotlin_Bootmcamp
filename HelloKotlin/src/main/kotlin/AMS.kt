fun main(args: Array<String>){
    val test = canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    print(test)
}

fun canAddFish(tankSize : Double, currentFish : List<Int>, fishSize:Int = 2, hasDecorations: Boolean = true) : Boolean{
    val totalLenght = currentFish.sum()

    return if(hasDecorations){
        totalLenght + fishSize <= tankSize * (.8)
    }else{
        totalLenght + fishSize <= tankSize
    }
}