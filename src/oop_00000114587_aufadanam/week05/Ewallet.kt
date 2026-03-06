package oop_00000114587_aufadanam.week05

// Mewarisi PaymentMethod dan menerima accountName untuk dikirim ke constructor super
class EWallet(
    accountName: String,
    var balance: Double = 0.0
) : PaymentMethod(accountName) {

    // 1. Override processPayment dengan logika saldo
    override fun processPayment(amount: Double) {
        println("Memproses pembayaran E-Wallet untuk: $accountName")

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Berhasil! Sejumlah: Rp$amount")
            println("Sisa Saldo: Rp$balance")
        } else {
            println("Gagal: Saldo tidak cukup. Saldo saat ini: Rp$balance")
        }
        println("-----------------------------------")
    }

    // 2. Fungsi spesifik untuk E-Wallet
    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Top-up Berhasil! Rp$amount ditambahkan ke akun $accountName.")
            println("Total Saldo: Rp$balance")
        } else {
            println("Jumlah top-up harus lebih dari 0.")
        }
        println("-----------------------------------")
    }
}