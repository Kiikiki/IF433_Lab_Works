package oop_110866_Kiara.week13
import java.io.File

fun main() {
    println("=== Test Unsafe Resource Handling ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Make a connection with the database...")
    writer.println("Log 2: Write used data...")

    writer.close()
    println("writing process for unsafe is finish")
}