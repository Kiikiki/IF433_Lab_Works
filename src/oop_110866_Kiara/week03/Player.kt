package oop_110866_Kiara.week03

class Player(val username: String) {
    private var xp: Int = 0
    var level: Int = (xp / 100) + 1

    fun addXp(amount: Int) {
        xp += amount
        if(level < (xp / 100) + 1) {
            level = (xp / 100) + 1
            println("$username Level Up to lv. $level! Your level of violence increases")
        }
    }
}