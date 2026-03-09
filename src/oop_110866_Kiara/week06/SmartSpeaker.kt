package oop_110866_Kiara.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Speaker is online")
    }
    override fun turnOff() {
        println("[$name] Crick Crick Crick. Silence shrouds the room")
    }
    fun playMusic(song: String) {
        println("$song is playing. Nice Taste!")
    }
}