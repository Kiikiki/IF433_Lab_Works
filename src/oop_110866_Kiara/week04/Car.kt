package oop_110866_Kiara.week04

open class Car(brand: String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk() {
        println("Car opening trunk with $numberOfDoors doors.")
    }

    //modification of the parent function
    override fun honk() {
        println("Honk! HONK woi AWAS WOI! $brand lewat!")
    }

    //add something to the parent function
    override fun accelerate() {
        super.accelerate() //calls the parent logic
        println("$brand car increased it's speed!")
    }
}