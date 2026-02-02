package oop_110866_Kiara.week01

fun main () {
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area: " + area)

    var result: String = checkSize(area)
    println("Result: $result")
}

fun checkSize(area: Double): String {
    if(area > 100) {
        return "This is a big circle"
    }
    else {
        return "This is a small circle"
    }
}