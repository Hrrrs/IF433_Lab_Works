package oop_00000114587_aufadanam.week05

fun main() {
    val helper = MathHelper()

    println("--- Pengujian Overloading MathHelper ---")

    val luasPersegi = helper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = helper.hitungLuas(10, 8)
    println("Luas Persegi Panjang (10x8): $luasPersegiPanjang")

    val luasLingkaran = helper.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}