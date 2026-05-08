package oop_00000114587_aufadanam.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.45))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 1500.0))
}