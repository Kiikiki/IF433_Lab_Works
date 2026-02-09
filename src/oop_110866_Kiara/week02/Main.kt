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

    print("Pick a choice (1. Regular, 2. Public): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if(type == 1) {
        print("Enter major: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Registered at: ${s1.major} with an initial GPA of ${s1.gpa}")
    }
    else if(type == 2) {
        val s2 = Student(name, nim)
        println("Registered at: ${s2.major} with an initial GPA of ${s2.gpa}")
    }
    else {
        println("Choice not available, registration failed!")
    }
}