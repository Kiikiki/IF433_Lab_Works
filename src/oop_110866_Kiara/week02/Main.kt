package oop_110866_Kiara.week02

import java.util.Scanner

fun Main() {
    val scanner = Scanner(System.`in`)

    println("--- APP PMB UMN ---")

    print("Enter name: ")
    val name = scanner.nextLine()

    print("Enter NIM (Enter 5 characters): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5) {
        println("ERROR: Registration failed. NIM must be 5 characters!")
    }
    else {
        print("Enter major: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Registration successful!")
    }
}