package oop_00000114587_aufadanam.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

    fun printReceipt(amount: Double) {
        println("Resi Pembayaran untuk $accountName: Rp$amount")
    }
}