package oop_110866_Kiara.week06

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("OLED screen light up: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Finding the nearest phone to connect... being single sucks")
    }

    override fun chargeBattery() {
        println("Battery charging using 15W charger!")
    }
}