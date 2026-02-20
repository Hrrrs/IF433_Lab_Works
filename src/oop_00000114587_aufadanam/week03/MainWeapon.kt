package oop_00000114587_aufadanam.week03

fun main() {
    // Membuat objek Weapon dengan damage awal yang valid
    val myWeapon = Weapon("DarkSlayer", 100)
    println("Status Awal: ${myWeapon.name} | Damage: ${myWeapon.damage} | Tier: ${myWeapon.tier}")

    println("\n--- Skenario 1: Set Damage ke -50 ---")
    myWeapon.damage = -50
    // Output yang diharapkan: Pesan peringatan dan damage tetap 100

    println("\n--- Skenario 2: Set Damage ke 9999 ---")
    myWeapon.damage = 9999
    // Output yang diharapkan: Pesan nerf dan damage menjadi 1000

    println("\n--- Hasil Akhir ---")
    println("Nama Senjata : ${myWeapon.name}")
    println("Final Damage : ${myWeapon.damage}")
    println("Tier Senjata : ${myWeapon.tier}")
}