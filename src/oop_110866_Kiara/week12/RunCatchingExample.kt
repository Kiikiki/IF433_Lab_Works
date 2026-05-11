package oop_110866_Kiara.week12

fun main() {
    println("=== Test Runcatching ===")
    val result: Result<Int> = runCatching {
        "100".toInt()
    }

    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Converted Successfully: $v")
    }.onFailure { e ->
        println("Converted Error: ${e.message}")
    }
}