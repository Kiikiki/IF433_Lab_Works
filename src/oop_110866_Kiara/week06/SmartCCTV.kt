package oop_110866_Kiara.week06

class SmartCCTV(override val id: String, override val name: String ) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[CCTV]$name: Smile for the Camera!")
        startRecord()
    }
    override fun turnOff() {
        println("[CCTV]$name: is offline")
    }
    override fun startRecord() {
        println("[CCTV]$name: what's that??? Quick get the camera!")
    }
}