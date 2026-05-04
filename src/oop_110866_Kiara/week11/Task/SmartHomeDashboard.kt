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

    homeDevice.run {
        SmartDevice().apply {
            name = "Daikin Inverter (cabel 3 x 2.5)"
            category = "HVAC"
            isOnline = false
            powerLoad = 800
        }.also {
            homeDevice.add(it)
        }

        SmartDevice().apply {
            name = "Picolo's Auto Feeder"
            category = "Pet Care"
            isOnline = true
            powerLoad = 10
        }.also {
            homeDevice.add(it)
        }
    }

    val searchResult = homeDevice.find {
        it.category == "Camera"
    }

    searchResult?.let {
        val result = it.diagnose()
        println(result)
    }

    with(homeDevice) {
        println("total devices: ${this.size}")
    }

    val totalPower = homeDevice.run { sumOf { it.powerLoad} }
    println("Total power: $totalPower")

    homeDevice.forEach { println(it.diagnose()) }
}
