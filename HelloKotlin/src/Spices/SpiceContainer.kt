data class SpiceContainer (val spice : Spices) {
    val label = spice.name
}

fun main(args: Array<String>){
    val mySpiceList  = listOf(SpiceContainer(Curry(name="green",spiciness = "mild")),
                                    SpiceContainer(Curry(name="habanero",spiciness = "hot")))

    for(element in mySpiceList){
        println(element.label)
    }
}