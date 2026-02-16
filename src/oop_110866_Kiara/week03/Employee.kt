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
            field = 0;
        }
        else {
            field = value
        }
    }
}