package oop_110866_Kiara.week03

fun main() {
    val e = Employee("Budi")

    //Salary test
    e.salary = -1000
    e.salary = 5000000
    println("Wage: ${e.salary}")

    //Encapsulation test
    e.increasePerformance()

    //Computation test (tax)
    println("Tax: ${e.tax}")
}