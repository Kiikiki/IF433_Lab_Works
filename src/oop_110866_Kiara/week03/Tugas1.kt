package oop_110866_Kiara.week03

fun main() {
    println("=== Your Weapon ===")
    val item = Weapon("Sir Stabs-a-Lot")

    item.damage = -50
    println("Name: ${item.name}, Damage: ${item.damage}, Tier: ${item.tier}")

    item.damage = 9999
    println("Name: ${item.name}, Damage: ${item.damage}, Tier: ${item.tier}")
}