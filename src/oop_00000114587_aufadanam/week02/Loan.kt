package oop_00000114587_aufadanam.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1 // Primary Constructor dengan Default Argument
) {

    // Method untuk menghitung denda berdasarkan logika bisnis
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}