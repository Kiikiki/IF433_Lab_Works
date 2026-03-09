package oop_110866_Kiara.week06

interface SmartDevice {
    abstract val id: String
    abstract val name: String
}

interface Switchable {
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    abstract fun startRecord()
    fun stopRecord() {
        println("Recording stopped and saved to Cloud. Fly high")
    }
}