package oop_110866_Kiara.week06

interface Camera {
    fun turnOn() {
        println("Camera lens is open and sensor is active")
    }
}

interface Phone {
    fun turnOn() {
        println("Finding a cellular signal...")
    }
}