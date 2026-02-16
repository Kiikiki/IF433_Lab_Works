package oop_110866_Kiara.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if(value < 0) {
                println("ERROR: damage cannot be negative. What are you trying to do? Heal your enemies???")
                field = 0
            }
            else if(value > 1000) {
                println("ERROR: damage cannot be over 1000. Who do you think you are? One punch man??")
                field = 1000
            }
            else {
                field = value
            }
        }
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}