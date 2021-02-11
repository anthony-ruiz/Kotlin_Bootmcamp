class SimpleSpice {
    var name : String = "curry"
    var spiciness : String = "mild"

    val heat : Int
        get() { return 5 }
}

fun main(args: Array<String>){
    var mySpice = SimpleSpice()
    println("Spice name: ${mySpice.name} spiciness: ${mySpice.heat}")
}