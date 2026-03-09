package oop_110866_Kiara.week06

fun main() {
    val lamp = SmartLamp("L01", "Guest Room")
    val speaker = SmartSpeaker("S01", "Google Kitchen Nest")
    val CCTV = SmartCCTV("C01", "Ezviz Garage")

    val smartHome = SmartHomeHub()
    smartHome.addDevice(lamp)
    smartHome.addDevice(speaker)
    smartHome.addDevice(CCTV)

    smartHome.activeSecurityMode()
    smartHome.turnOffAllSwitches()
}