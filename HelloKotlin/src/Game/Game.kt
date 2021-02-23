package Game

enum class Directions(){
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game{
    var path = mutableListOf<Directions>(Directions.START)

    var north = {path.add(Directions.NORTH)}
    var south = {path.add(Directions.SOUTH)}
    var east = {path.add(Directions.EAST)}
    var west = {path.add(Directions.WEST)}
    var end = {path.add(Directions.END) ; println("Game Over ${path}") ; path.clear() ;  false}

    fun move(where : () -> Boolean){
        where.invoke()
    }

    fun makeMove(direction : String?){
        when {
            direction.equals("n") -> move(north)
            direction.equals("s") -> move(south)
            direction.equals("e") -> move(east)
            direction.equals("w") -> move(west)
            else -> move(end)
        }
    }
}
fun main (args: Array<String>){
    var myGame = Game()

    while (true){
        print("Enter a direction: n/s/e/w:")
        myGame.makeMove(readLine())


    }
}

