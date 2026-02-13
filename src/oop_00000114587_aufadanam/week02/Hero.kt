package oop_00000114587_aufadanam.week02

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