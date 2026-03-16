package oop_110866_Kiara.week07

fun main() {
    //start game
    GameManager.startGame()
    GameManager.startGame()

    //check LEGENDARY drop chance
    println("Legendary has a ${ItemRarity.LEGENDARY}% chance to drop")

    //init sword
    val sword1 = Weapon.forgeStarterSword()
    println("=== Starter Sword ===")
    println("name       : ${sword1.item.name}")
    println("damage     : ${sword1.item.damage}")
    println("rarity     : ${sword1.item.rarity.name}")
    println("durability : ${sword1.durability}")


}