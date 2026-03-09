package oop_110866_Kiara.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Button '$name' successfully clicked!")
    }
}