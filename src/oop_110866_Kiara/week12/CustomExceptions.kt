package oop_110866_Kiara.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

