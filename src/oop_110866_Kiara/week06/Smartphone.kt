package oop_110866_Kiara.week06

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()

        println("Smartphone Operation System is online")
    }
}