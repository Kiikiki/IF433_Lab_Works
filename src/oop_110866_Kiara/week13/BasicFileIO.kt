package oop_110866_Kiara.week13
import java.io.File

fun main() {
    println("=== Test Write Text ===")
    val file = File("notes.txt")
    file.writeText("Line 1: System Initialization\n")
    println("File Successfully made and written")

    file.appendText("Line 2: Add new configuration\n")
    println("Text successfully appended")

    println("\n=== Test Read Text ===")
    val fullContent = file.readText()
    println("Read in one go:\n$fullContent")

    println("=== Test Read Lines ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("$index: $line")
    }
}