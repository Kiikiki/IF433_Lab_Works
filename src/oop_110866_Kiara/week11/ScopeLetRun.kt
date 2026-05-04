package oop_110866_Kiara.week11

fun main() {
    println("=== Test Let Function ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Name is detected: $it")
        it.length
    }
    println("Name length: $length")
}