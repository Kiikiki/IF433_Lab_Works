package oop_110866_Kiara.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work() {
        println("Dev $name is coding with $programmingLanguage!")
    }
}