package oop_110866_Kiara.week04

//open is used to make it inherit the trait
open class Vehicle(val brand: String){
    var speed: Int = 0

    //can override
    open fun accelerate() {
        speed += 10
        println("$brand | speed: $speed km/h")
    }

    open fun honk() {
        println("Beep! beep im a sheep beep beep im a sheep!")
    }
}