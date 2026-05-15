package oop_00000114587_aufadanam.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount balance of $balance"){
}