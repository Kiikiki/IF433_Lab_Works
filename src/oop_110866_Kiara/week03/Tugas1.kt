package oop_110866_Kiara.week03

fun main() {
    println("=== Your Weapon ===")
    //testing Epic tier
    val item1 = Weapon("The Slightly Sharp Object")
    item1.damage = 650
    println("Name: ${item1.name}, Damage: ${item1.damage}, Tier: ${item1.tier}")

    //testing overpowered weapon
    val item2 = Weapon("Regret")
    item2.damage = 9999
    println("Name: ${item2.name}, Damage: ${item2.damage}, Tier: ${item2.tier}")

    //testing insanely bad weapon
    val item3 = Weapon("Excalipoor")
    item3.damage = -50
    println("Name: ${item3.name}, Damage: ${item3.damage}, Tier: ${item3.tier}")
}