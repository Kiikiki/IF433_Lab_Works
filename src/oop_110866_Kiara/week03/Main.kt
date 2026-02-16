package oop_110866_Kiara.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000

    e.printStatus()
    e.increasePerformance()
    e.printStatus()
}