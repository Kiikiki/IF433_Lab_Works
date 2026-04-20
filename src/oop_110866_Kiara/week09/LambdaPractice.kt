package oop_110866_Kiara.week09

fun main() {
    println("===Test Lambda ===")
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Sum Result: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Square Result: ${squareImplicit(4)}")
}