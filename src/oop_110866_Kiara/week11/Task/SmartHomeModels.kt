package oop_110866_Kiara.week11.Task

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    return ("[DIAGNOSIS] $name | Category: $category | Status: ${if (isOnline) "Online" else "Offline"} | Power: $powerLoad Watt")
}