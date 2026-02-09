package oop_110866_Kiara.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter hero's name: ")
    val name = scanner.nextLine()

    print("Enter hero's base damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)

    var enemyHp = 100
    var ranAway = false

    println("=== You found a wild monster! ===")

    while(hero.isAlive() && enemyHp > 0) {
        println("Enemy HP : $enemyHp")
        println("Hero HP  : ${hero.hp}")

        println("Action: (1. Attack, 2. Run Away)")
        print("Your choice: ")
        val choice = scanner.nextInt()

        if(choice == 1) {
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage
            if(enemyHp < 0) enemyHp = 0

            println("Enemy takes ${hero.baseDamage} damage!")

            if(enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy counterattacks! (Ouch!)")
                hero.takeDamage(enemyDamage)
            }
        }
        else if(choice == 2) {
            println("${hero.name} runs away! (Are you really a hero...?)")
            ranAway = true
            break
        }
        else {
            println("ERROR: Invalid choice. (What are you even trying to do?)")
        }
    }

    println("=== Battle Result ===")
    if(ranAway) {
        println("It's called a tactical retreat! (definitely...)")
    }
    else if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} gained exp! Monster fainted! (this is definitely not a pokemon reference)")
    }
    else if(!hero.isAlive() && enemyHp > 0) {
        println("Monster ate you! (better luck next time)")
    }
    else {
        println("Tie... you and the monster found a new found respect in each other.")
        println("Both of you decided to travel the world together hand in hand")
        println("(secret ending?)")
    }
}