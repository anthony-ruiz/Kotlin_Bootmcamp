import sun.security.util.Length

class Aquarium( var length: Int =100, var width: Int = 40, var height: Int = 20){

    var volume : Int
        get() = width * height * length
        set(value) {height = value /width * height}
}