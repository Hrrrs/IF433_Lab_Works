package oop_00000114587_aufadanam.week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    // Override processPayment dengan logika limit kartu kredit
    override fun processPayment(amount: Double) {
        println("Memproses pembayaran Kartu Kredit untuk: $accountName")

        // Mengecek apakah pemakaian saat ini ditambah transaksi baru masih dalam limit
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Berhasil! Sejumlah: Rp$amount")
            println("Sisa Limit Tersedia: Rp${limit - usedAmount}")
        } else {
            println("Gagal: Transaksi ditolak! Melebihi limit kartu kredit.")
            println("Limit Tersedia: Rp${limit - usedAmount}, sedang mencoba transaksi: Rp$amount")
        }
        println("-----------------------------------")
    }

    // Fungsi tambahan untuk melihat status kartu
    fun displayCardStatus() {
        println("Status Kartu $accountName:")
        println("Total Limit: Rp$limit")
        println("Pemakaian: Rp$usedAmount")
    }
}