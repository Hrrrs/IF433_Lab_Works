package oop_00000114587_aufadanam.week09

fun main() {
    println("=== TEST LAMBDA ===")
    // Syntax Lambda eksplisit: { parameters-> body }
    val sumbLambda = {a: Int, b: Int -> a+b }
    println("Hasil Sum: ${sumbLambda(5, 10)}")

    // Lambda dengan satu parameter bisa menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}