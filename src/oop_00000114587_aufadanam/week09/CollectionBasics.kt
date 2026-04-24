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

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("Unique numbers (set): $uniqueNumbers") // duplikat ilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // diabaikan karena udah ada
    println("Active users: $activeUsers")
}