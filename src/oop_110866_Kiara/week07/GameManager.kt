package oop_110866_Kiara.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if(!isGameRunning) {
            println("Starting game engine ...")
            isGameRunning = true
        }
        else {
            println("Game already started")
        }
    }
}