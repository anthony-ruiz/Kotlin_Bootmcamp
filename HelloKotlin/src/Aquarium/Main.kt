

fun main(args: Array<String>){
    buidAquarium()
}

fun buidAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "width: ${myAquarium.width} " +
            "height: ${myAquarium.height} ")

    myAquarium.height = 80

}
