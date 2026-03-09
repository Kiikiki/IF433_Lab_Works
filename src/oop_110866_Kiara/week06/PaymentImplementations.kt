package oop_110866_Kiara.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp. $amount via Gopay")
    }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting the bank for Rp. $amount")
    }
}