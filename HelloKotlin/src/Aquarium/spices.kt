import javafx.scene.effect.Light

class Spice (val name : String, val spiciness : String = "mild"){

    val heat : Int
        get() {
            return when(spiciness){
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    fun makeSalt() = Spice("Salt")



}
fun main(args : Array<String>){
    var mySpice = Spice("myNewSpice")

    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    println( Spice("mySpice" , "hot").heat)
    var spicenesLevelList = spices.filter { it.heat < 5 }
    spicenesLevelList.iterator().forEach { println(" Spice: ${it.name} heat: ${it.heat} spiciness ${it.spiciness} ") }



}