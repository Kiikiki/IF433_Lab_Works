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

    println("\n=== Test Generic Functions ===")
    printData(3.14)
    val result = processData("Stable coin")
    println("Result: $result")

    println("\n=== Test Constraints ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Biggest: ${getMax(45, 90)}")
}