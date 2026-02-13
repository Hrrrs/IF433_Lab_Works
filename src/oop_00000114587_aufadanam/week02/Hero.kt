package oop_00000114587_aufadanam.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default Argument: 100 & Menggunakan 'var' karena nilai HP akan berubah
) {

    // 1. Method Attack: Simulasi serangan teks
    fun attack(targetName: String) {
        println("$name membacok $targetName!")
    }

    // 2. Method Take Damage: Manajemen State HP
    fun takeDamage(damage: Int) {
        hp -= damage

        // Logika: HP tidak boleh minus (Minimal 0)
        if (hp < 0) {
            hp = 0
        }

        println("$name menerima $damage damage! HP tersisa: $hp")
    }

    // 3. Method isAlive: Cek status hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main() {
    val input = Scanner(System.`in`)

    // 1. Inisialisasi Hero & Stat
    println("--- WELCOME TO SAWIT RPG ---")
    print("Masukkan Nama Hero: ")
    val name = input.nextLine()
    print("Masukkan Base Damage: ")
    val baseDamage = input.nextInt()

    val myHero = Hero(name, baseDamage) // HP otomatis 100 karena Default Argument

    // 2. Variabel Musuh (Enemy)
    var enemyHp = 100
    println("\nSeekor Monster muncul! HP Musuh: $enemyHp")

    // 3. Main Loop (While Hero Hidup DAN Musuh Hidup)
    while (myHero.isAlive() && enemyHp > 0) {
        println("\n=== MENU PERTANDINGAN ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = input.nextInt()

        if (choice == 1) {
            // Hero Menyerang
            myHero.attack("Monster")
            enemyHp -= myHero.baseDamage

            // Validasi agar HP Musuh tidak minus
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh tersisa: $enemyHp")

            // Jika Musuh masih hidup, Musuh membalas
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Monster sawit membalas serangan!")
                myHero.takeDamage(enemyDamage)
            }
        } else if (choice == 2) {
            println("${myHero.name} melarikan diri dari seperti bahlil (goblin)!")
            break
        } else {
            println("nguwawor!")
        }
    }

    // 4. Pengumuman Pemenang
    println("\n--- HASIL AKHIR ---")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang! Dunia kembali damai.")
    } else if (!myHero.isAlive()) {
        println("Sayang sekali... ${myHero.name} telah gugur di kebun sawit.")
    } else {
        println("Pertempuran berakhir karena heronya mirip bahlil (Kabur).")
    }
}