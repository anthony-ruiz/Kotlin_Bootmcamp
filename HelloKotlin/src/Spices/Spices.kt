

abstract class Spices  (val name : String, val spiciness : String = "mild", color: SpiceColor ) : SpiceColor by color{
    abstract  fun prepareSpice()
}


class Curry(spiciness: String, name: String, color: SpiceColor = YellowSpiceColor) : Spices(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }

}
interface  Grinder {
    fun grind()
}

interface  SpiceColor{
    var color : String
}

object  YellowSpiceColor: SpiceColor{
    override var color = "Yellow"

}
fun main(args : Array<String>){

}