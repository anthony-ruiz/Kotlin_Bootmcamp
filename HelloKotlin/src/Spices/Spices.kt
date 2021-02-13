sealed class Spices(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}


class Curry(spiciness: String, name: String, color: SpiceColor = YellowSpiceColor) : Spices(name, spiciness, color),
    Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    var color: Color
}

object YellowSpiceColor : SpiceColor{
    override var color = Color.YELLOW

}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

fun main(args: Array<String>) {

}