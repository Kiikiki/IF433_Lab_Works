package oop_110866_Kiara.week03

class Employee(val name: String) {
    var salary: Int = 0

    //infinite loop
    set(value) {
        println("Salary: $value")
        this.salary = value
    }
}