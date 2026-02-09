package oop_110866_Kiara.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: object is made with nim ($nim) that isn't valid!")
            println("Student data $name might be problematic in the system.")
        }
        else {
            println("LOG: object student $name is successfully located in the memory!")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Using constructor general route (no major)")
    }
}