package example.myapp

import example.myapp.listeners.FishAction

class Shark:AquariumFish(), FishAction {
    override val color= "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}