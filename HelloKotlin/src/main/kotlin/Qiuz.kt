fun main(args: Array<String>){
    print(getFortuneCookie(getBirthday()))
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

    return when(birthday){
        28 , 31 -> fortunesList[0]
        in 1..7 -> fortunesList[1]
        else -> fortunesList[birthday/fortunesList.size]
    }

}

fun getBirthday(): Int{
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}