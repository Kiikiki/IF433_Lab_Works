package oop_110866_Kiara.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Wage: ${e.salary}")

    e.increasePerformance()

    println("Tax: ${e.tax}")
}