package example.myapp

class main {
    fun makeFish(){
        val shark=Shark();
        val pleco=Plecostomus();println("Shark: ${shark.color}")
        println("Plecostomus: ${pleco.color}")
    }

    fun main(){
        makeFish()
    }
}