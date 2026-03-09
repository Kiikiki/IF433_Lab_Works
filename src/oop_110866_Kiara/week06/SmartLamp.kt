package oop_110866_Kiara.week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Let there be LIGHT!")
    }
    override fun turnOff() {
        println("BLINDED!!!")
    }
}