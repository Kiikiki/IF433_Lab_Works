package oop_110866_Kiara.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(amount + usedAmount <= limit) {
            usedAmount = amount
            println("[payment method] The list of debt increase to $usedAmount")
        }
        else {
            println("[payment method] You have reached the limit. Seriously get some financial advice")
        }
    }
}