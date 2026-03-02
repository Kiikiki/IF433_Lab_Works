package oop_110866_Kiara.week05

abstract class PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double)
}