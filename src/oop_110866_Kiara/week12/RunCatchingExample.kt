package oop_110866_Kiara.week12

fun main() {
    println("=== Test Runcatching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}