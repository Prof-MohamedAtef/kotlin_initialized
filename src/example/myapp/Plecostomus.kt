package example.myapp

import example.myapp.listeners.FishAction

class Plecostomus:AquariumFish(), FishAction {
    override val color="gold"
    override fun eat() {
        println("eat algae")
    }
}