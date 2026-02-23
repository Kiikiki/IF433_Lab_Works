package oop_110866_Kiara.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("Employee $name is working...")
    }

    open fun calculateBonus(): Int  {
        return baseSalary * 10 / 100
    }
}