package oop_00000114587_aufadanam.week03

fun main() {
    val player = Player("Kazuma")

    println("--- Testing Encapsulation ---")
    println("Status: Properti 'xp' tidak bisa diakses langsung (Aman).")

    println("\n--- Skenario 1: Tambah 50 XP ---")
    player.addXp(50)
    println("Level saat ini: ${player.level}")

    println("\n--- Skenario 2: Tambah 60 XP (Total 110) ---")
    player.addXp(60)

    println("\n--- Status Akhir Player ---")
    println("Username : ${player.username}")
    println("Level    : ${player.level}")
}