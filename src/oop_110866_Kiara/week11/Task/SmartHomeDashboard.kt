package oop_110866_Kiara.week11.Task

fun main() {
    val homeDevice = mutableListOf<SmartDevice>()

    SmartDevice().apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevice.add(it)
    }

    SmartDevice().apply {
        name = "Ezviz Outdoor"
        category = "Camera"
        powerLoad = 5
    }.also {
        homeDevice.add(it)
        println("[LOG] Camera is Connected")
    }
}