package oop_00000114587_aufadanam.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.45))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status API: ${response.status}")
    println("--- Data Koin ---")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Saldo: ${coin.balance}")
    }
    println()

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-101", 50.0))
    txRepo.add(Transaction("TX-102", 150.5))

    println("--- Data Transaksi ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Jumlah: ${tx.amount}")
    }
    println()
}