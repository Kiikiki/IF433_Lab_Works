package oop_110866_Kiara.week10

fun main() {
    println("=== Test Generic Class ===")
    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println("Contents of intBox: ${intBox.value}")
    println("Contents of stringBox: ${stringBox.value}")

    println("\n=== Test Multiple Parameters ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Asset: ${itemPrice.key}, Price: ${itemPrice.value} USD")
}