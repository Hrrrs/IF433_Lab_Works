package oop_00000114587_aufadanam.week03

class Player (val username: String) {
    private var xp:Int = 0

    val level: Int
        get() = (xp/100)+1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("Gagal: XP yang ditambahkan harus angka positif")
            return
        }

        val levelSebelumnya = level

        xp += amount
        println("$username mendapatkan +$amount XP (total XP: $xp)")

        if (level > levelSebelumnya) {
            println("Level Up! hore $username naik level ke $level")
        }
    }





}