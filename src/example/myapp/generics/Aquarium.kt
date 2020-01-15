package example.myapp.generics


fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    addItemTo(aquarium)
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

class Aquarium<out T:WaterSupply>(val waterSupply: T) {
}

fun main() {
    genericsExample()
}