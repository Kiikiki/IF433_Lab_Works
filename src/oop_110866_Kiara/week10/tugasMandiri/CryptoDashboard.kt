package oop_110866_Kiara.week10.tugasMandiri

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 100.0))
    coinRepo.add(Coin("ETH", 200.0))
    coinRepo.add(Coin("USDT", 300.0))
}