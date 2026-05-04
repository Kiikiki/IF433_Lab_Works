package oop_110866_Kiara.week11.Task

fun main() {
    val homeDevice = mutableListOf<SmartDevice>()

    SmartDevice().apply {
        name = "Philips WiZ Living Room"
        category = "Lighting Room"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevice.add(it)
    }
}