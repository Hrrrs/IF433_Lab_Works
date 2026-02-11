package oop_00000114587_aufadanam.week01

import kotlin.math.roundToInt

fun main() {
    val gameTitle = "Elden Ring"
    val price = 599000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount (price: Int): Int= if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()