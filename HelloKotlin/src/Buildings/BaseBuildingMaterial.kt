package Buildings

open class BaseBuildingMaterial(open val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(){
    override var numberNeeded = 4
}

class Brick : BaseBuildingMaterial(){
    override var numberNeeded = 8
}

class Building<T : BaseBuildingMaterial>(val buildingMaterial : T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded - buildingMaterial.numberNeeded

    fun build(){print("Material: ${buildingMaterial::class.simpleName} Number needed: ${actualMaterialsNeeded}")}
}

fun main(args: Array<String>){
   Building(Wood()).build()

}