package oop_110866_Kiara.week04

class Car(brand: String, val numberOfDoors: Int): Vehicle(brand) {
    fun openTrunk() {
        println("Car opening trunk with $numberOfDoors doors.")
    }

    //modifictaion
    override fun honk() {
        println("Honk! HONK woi AWAS WOI! $brand lewat!")
    }
}