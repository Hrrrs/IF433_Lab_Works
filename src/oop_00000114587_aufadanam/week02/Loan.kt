package oop_00000114587_aufadanam.week02

import java.util.Scanner

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

fun main() {
    val input = Scanner(System.`in`)

    // 1. Input
    print("Masukkan Judul Buku: ")
    val bookTitle = input.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = input.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = input.nextInt()

    // 2. Validasi: Jika minus, ubah menjadi 1
    if (loanDuration < 0) {
        loanDuration = 1
    }

    // 3. Membuat objek
    val myLoan = Loan(bookTitle, borrower, loanDuration)

    // print detail peminjaman dan total denda
    println("\n--- DATA PEMINJAMAN ---")
    println("Buku    : ${myLoan.bookTitle}")
    println("Peminjam: ${myLoan.borrower}")
    println("Durasi  : ${myLoan.loanDuration} hari")
    println("Denda   : Rp ${myLoan.calculateFine()}")
}