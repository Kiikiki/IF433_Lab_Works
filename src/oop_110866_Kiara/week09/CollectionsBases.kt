package oop_110866_Kiara.week09

fun main() {
    println("=== Test List ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== Test Set ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (set): $uniqueNumbers")

    val activeUsers = mutableSetOf<String>("User A", "User B")
    activeUsers.add("User C")
    activeUsers.add("User A")
    println("Active Users: $activeUsers")
}