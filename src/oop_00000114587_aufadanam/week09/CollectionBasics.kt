package oop_00000114587_aufadanam.week09

fun main() {
    println("=== TEST LIST ===")
    // immutable List : Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") //INI ERROR
    println("immutable List: $frameworks")

    //Mutable List: bosa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}