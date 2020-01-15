package example.myapp.generics


fun genericsExample() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

class Aquarium<out T:WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}

fun main() {
    genericsExample()
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}