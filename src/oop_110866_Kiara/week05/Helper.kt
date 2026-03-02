package oop_110866_Kiara.week05

fun main() {
    val math = MathHelper()

    val square = math.calculateArea(4)
    val rectangle = math.calculateArea(4, 3)
    val circle = math.calculateArea(2.1)

    println("square: $square, rectangle: $rectangle, circle: $circle")
}