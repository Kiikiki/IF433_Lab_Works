package oop_110866_Kiara.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== Test Apply ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== Test Also ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("log before addition: $it")
    }.add(4)
    println("after addition: $numbers")

    println("\n=== Test With ===")
    with(user) {
        println("User Detail -> Name: $name, Age: $age")
    }

    val newUser = User("Budi", 20).apply {
        age = 21
    }.also {
        println("New user successfully made: $it")
    }
}