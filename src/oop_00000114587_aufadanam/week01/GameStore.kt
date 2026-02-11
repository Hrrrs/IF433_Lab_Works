package oop_00000114587_aufadanam.week01

import kotlin.math.roundToInt

fun main() {
    val gameTitle = "Elden Ring"
    val price = 599000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, total = finalPrice)
}

fun calculateDiscount (price: Int): Int= if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, total: Int) {
    println("------- Struk SteamKW -------")
    println("Game           : $title")
    println("harga discount : Rp $total")
    println("-----------------------------")
}