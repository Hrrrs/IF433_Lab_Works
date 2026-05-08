package oop_00000114587_aufadanam.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("apakah null/empty? ${text.isNullOrEmptyCustom()}")
}