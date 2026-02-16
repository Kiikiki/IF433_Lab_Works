package oop_110866_Kiara.week03

fun main() {
    println("=== Welcome to Solo Leveling definitely... ===")
    val user = Player("Frisk")
    //testing xp error (private)
    //println("Name: ${user.username}, Lv: ${user.level} (${user.xp}/100)")

    user.addXp(50)
    user.printInfo()

    user.addXp(60)
    user.printInfo()
}