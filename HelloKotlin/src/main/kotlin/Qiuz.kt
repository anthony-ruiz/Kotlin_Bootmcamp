fun main(args: Array<String>){
    val test = whatShouldIDoToday("sad")
    print(test)
}

fun isWalkingWeather( mood :String, weather: String) = mood == "happy" && weather == "Sunny"
fun isLazyWeather(mood:String, weather: String,temperature: Int ) = mood == "sad" && weather == "rainy" && temperature == 0
fun isSwimmingWeahter( temperature: Int) = temperature > 35
fun whatShouldIDoToday(mood: String, weather:String ="sunny", temperature: Int = 24) : String{
    return when  {

        isWalkingWeather(mood, weather) -> "go for a walk"
        isLazyWeather(mood, weather, temperature) -> "stay in bed"
        isSwimmingWeahter(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}
