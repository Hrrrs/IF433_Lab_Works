package oop_00000114587_aufadanam.week06

interface PaymentMethod {
    fun pay(amount: Double)
}

class Gopay: PaymentMethod {
    override fun pay(amount: Double) { println("processing Rp$amount via Gopay Server") }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) { println("contacting Bank for Rp$amount") }
}