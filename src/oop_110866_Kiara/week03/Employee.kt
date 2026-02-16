package oop_110866_Kiara.week03

class Employee(val name: String) {
    var salary: Int = 0

    /*infinite loop
     set(value) {
         println("Salary: $value")
         this.salary = value
     } */

    set(value) {
        if(value < 0) {
            println("ERROR: Wage cannot be negative. Will automatically be set to 0!")
            field = 0
        }
        else {
            field = value
        }
    }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("performanceRating $name increased: $performanceRating !")
    }

    fun printStatus() {
        println("Employee: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1
}

