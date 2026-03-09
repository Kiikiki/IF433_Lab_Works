package oop_110866_Kiara.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }
    fun turnOffAllSwitches(device: SmartDevice) {
        for (device in devices) {
            if(device is Switchable) {
                device.turnOff()
            }
        }
    }
    fun activeSecurityMode() {
        for (device in devices) {
            if(device is Recordable) {
                device.startRecord()
            }
            if(device is SmartSpeaker) {
                device.playMusic("Warning Alarm")
            }
        }
    }
}