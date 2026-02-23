package oop_110866_Kiara.week04

class ElectricalCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand electric car increased it's speed! Battery capacity: $batteryCapacity%")
    }
}