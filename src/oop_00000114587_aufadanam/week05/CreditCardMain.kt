package oop_00000114587_aufadanam.week05

fun main() {
    // 1. Instansiasi objek dengan parameter awal
    val myWallet = EWallet(accountName = "Aufa Wallet", balance = 50000.0)
    val myCard = CreditCard(accountName = "Aufa Card", limit = 100000.0)

    // 2. Memasukkan keduanya ke dalam List bertipe PaymentMethod
    // Di sini terjadi 'Upcasting' otomatis
    val paymentMethods: List<PaymentMethod> = listOf(myWallet, myCard)

    println("=== Simulasi Pembayaran E-Commerce ===")
    println("Tagihan: Rp75000.0\n")

    // 3. Perulangan (Iteration) untuk memproses pembayaran
    for (method in paymentMethods) {
        // Kotlin secara cerdas memanggil fungsi override yang tepat
        // berdasarkan objek aslinya (Dynamic Dispatch)
        method.processPayment(75000.0)
    }
}