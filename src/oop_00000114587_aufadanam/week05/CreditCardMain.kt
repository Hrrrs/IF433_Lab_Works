package oop_00000114587_aufadanam.week05

fun main() {
    val myWallet = EWallet(accountName = "Aufa Wallet", balance = 50000.0)
    val myCard = CreditCard(accountName = "Aufa Card", limit = 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(myWallet, myCard)

    println("=== Simulasi Pembayaran dengan Smart Casting ===")

    for (method in paymentMethods) {
        println("Mencoba pembayaran dengan akun: ${method.accountName}")

        // 1. Coba pembayaran pertama kali
        method.processPayment(75000.0)

        // 2. Tantangan Smart Casting: Cek apakah ini EWallet
        if (method is EWallet) {
            println("[Sistem] Mendeteksi E-Wallet. Mencoba Top-Up otomatis...")

            // Di sini 'method' sudah di-smart cast menjadi EWallet
            // Kita bisa memanggil .topUp() yang tidak ada di PaymentMethod
            method.topUp(50000.0)

            println("[Sistem] Mencoba ulang pembayaran setelah Top-Up:")
            method.processPayment(75000.0) // Seharusnya sekarang saldo 50rb + 50rb = 100rb
        }
    }
}