import java.util.*

fun main(args: Array<String>){
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getFortuneCookie(birthday : Int) : String{
    val fortunesList : MutableList<String> = mutableListOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.");

    return fortunesList[birthday/fortunesList.size]
}

fun getBirthday() : Int{
    print("Enter your birthday: ")
    return  readLine()?.toIntOrNull() ?: 1
}