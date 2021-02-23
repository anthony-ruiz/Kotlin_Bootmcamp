package Buildings

open class BaseBuildingMaterial(open var numberNeeded: Int = 1 )


class Brick : BaseBuildingMaterial(){
    override var numberNeeded = 8
}

class Wood : BaseBuildingMaterial(){
    override  var numberNeeded = 4
}

class Building<out T:BaseBuildingMaterial>(val building: T){
    var baseMaterialsNeeded = 100
    var actualMaterialsNeeded = baseMaterialsNeeded - building.numberNeeded

    fun build(){
        println("we need $actualMaterialsNeeded of ${building::class.simpleName}")
    }

}

fun <T:BaseBuildingMaterial> isSmallBuilding (building: Building<T>){
    if(building.actualMaterialsNeeded < 500) print(" small building")  else print("large building")
}

fun main(args : Array<String>){
    Building(Wood()).build()
    isSmallBuilding(Building(Wood()))

}