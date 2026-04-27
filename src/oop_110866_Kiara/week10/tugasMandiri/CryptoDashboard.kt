package oop_110866_Kiara.week10.tugasMandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 100.0))
    coinRepo.add(Coin("ETH", 200.0))
    coinRepo.add(Coin("USDT", 300.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 100000.0))

    // Output
    // Coin: BTC, Balance: 100.0
    // Coin: ETH, Balance: 200.0
    // Coin: USDT, Balance: 300.0
}