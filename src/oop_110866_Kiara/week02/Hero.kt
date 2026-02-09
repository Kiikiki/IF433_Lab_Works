package oop_110866_Kiara.week02

class Hero (
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {
    fun attack(targetName: String) {
        println("$name attacked $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if(hp < 0) {
            hp = 0
        }

        println("$name takes $damage damage. Current hp: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}