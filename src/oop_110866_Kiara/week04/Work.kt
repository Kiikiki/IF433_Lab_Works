package oop_110866_Kiara.week04

fun main() {
    println("--- Your Working Place ---")

    println("\n--- Meet you manager the worst one we got! ---")
    val manager = Manager("No Pay Overtime", 10000000)
    manager.work()
//    manager.calculateBonus()
    println("Bonus: Rp. " + manager.calculateBonus())

    println("\n--- Our top rate Sla- I mean top rated Employee ---")
    val slave = Developer("Wrong Place Wrong Time", 100000, "Kotlin")
    slave.work()
//    slave.calculateBonus()
    println("Bonus: Rp. " + slave.calculateBonus())
}