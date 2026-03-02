package oop_110866_Kiara.week05

fun main() {
    val account1 = EWallet("Childe Tartaglia", 50000.0)
    val account2 = CreditCard("Zhong Li", 100000.0, 0.0)

    val accountList: List<PaymentMethod> = listOf(account1, account2)

    println("========= THE BANK =========")
    for(account in accountList) {
        account.processPayment(75000.0)
    }
    println("----------------------------")
}