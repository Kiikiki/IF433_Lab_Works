package oop_110866_Kiara.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Welcome to the Library ---")

    print("Enter book title: ")
    val title = scanner.nextLine()

    print("Enter borrower: ")
    val borrower = scanner.nextLine()

    print("Enter loan duration (days): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("ERROR: Invalid duration, loan duration automatically set to 1 day!")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("=== Loan details ===")
    println("Book title : ${loan.bookTitle}")
    println("Borrower   : ${loan.borrower}")
    println("Duration   : ${loan.loanDuration} day(s)")
    println("Total Fine : Rp. ${loan.calculateFine()}")

}