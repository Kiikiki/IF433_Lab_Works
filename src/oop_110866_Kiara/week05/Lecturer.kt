package oop_110866_Kiara.week05

class Lecturer(name: String, val nidn: String): Employee(name) {
    override fun work() {
        println("[$name] is making preparing to attack student's mental health")
    }

    fun teaching() {
        println("[$name] is tortu- teaching students in class")
    }
}