package oop_110866_Kiara.week05

class MathHelper() {
    // square
    fun calculateArea(side: Int): Int {
        return side * side
    }

    // rectangle
    fun calculateArea(width: Int, height: Int): Int {
        return width * height
    }

    //circle
    fun calculateArea(radius: Double): Double {
        return 3.14 * radius * radius
    }
}