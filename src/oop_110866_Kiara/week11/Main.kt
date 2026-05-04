package oop_110866_Kiara.week11

fun main() {
    println("=== Test Extension Function ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Null/Empty? ${text.isNullOrEmptyCustom()}")
}