package oop_00000114587_aufadanam.week01

import kotlin.math.roundToInt

fun main() {
    val gameTitle = "Elden Ring"
    val price = 599000
    val userNote: String? = null
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, total = finalPrice, note = userNote?: "tidak ada catatan")
}

fun calculateDiscount (price: Int): Int= if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, total: Int, note: String) {
    println("------- Struk SteamKW -------")
    println("Game           : $title")
    println("harga discount : Rp $total")
    println("catatan: $note")
    println("-----------------------------")
}