package oop_110866_Kiara.week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    }
    catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    }
    finally {
        println("Division finished")
    }
}

fun main() {
    println("=== Test Try As Expression ===")
    val inputString = "123A"

    val result: Int = try {
        Integer.parseInt(inputString)
    }
    catch (e: NumberFormatException) {
        -1
    }
    println("Parsing Result: $result")
}