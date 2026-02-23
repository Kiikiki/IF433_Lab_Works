package oop_110866_Kiara.week04

fun main() {
    println("--- Testing Vehichle ---")
    val generalVehicle = Vehicle("bicycle")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)

    //testing it's own function
    myCar.openTrunk()
    //testing overriden function
    myCar.honk()
    //testing joint parent + child function
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricalCar = ElectricalCar("Pikachu", 0, 100)
    myElectricalCar.openTrunk()
    myElectricalCar.honk()
    myElectricalCar.accelerate()
}