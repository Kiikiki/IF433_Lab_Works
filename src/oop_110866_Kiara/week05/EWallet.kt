package oop_110866_Kiara.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance < amount) {
            println("[payment process] A fly comes out of your balance. They don't accept flies \uD83E\uDEB0")
        }
        else {
            balance -= amount
            println("[payment process] Your balance is now $balance! I can hear mr crabs crying")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[top up] You have inserted $amount")
        println("The sound of cash fills your balance to $balance")
    }
}