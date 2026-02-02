package oop_110866_Kiara.week01

fun main () {
    val name = "John Doe"
    val score = 0

    println("Name: $name , Score: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Your grade: $grade")

    println("Status: ${calculateStatus(score)}")

        val studentId: String? = null

        val idLength = studentId?.length ?: 0

    println("ID Length: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Pass" else "Didn't Pass"