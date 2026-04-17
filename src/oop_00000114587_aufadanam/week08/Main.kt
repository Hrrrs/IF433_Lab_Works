package oop_00000114587_aufadanam.week08

fun main() {
    println("=== TEST SAFE CALS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        //Blok ini Hanya jalan jika totalPrice tidak NULL
        val tax = price* 0.11
        "Transaksi Valid. Harga: Rp$price, pajak: RP$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)
}