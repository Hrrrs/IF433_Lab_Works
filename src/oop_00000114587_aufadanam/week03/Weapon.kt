package oop_00000114587_aufadanam.week03

class Weapon (name: String, damage: Int) {
    val name: String= name

    var damage: Int= 0
        set(value) {
            when {
                value < 0 -> {
                    println("gak boleh negatif nilai tetap $field")
                }
                value > 1000 -> {
                    println("bikin stat yg ngotak mas. dinerf ke 1000.")
                    field = 1000
                }
                else-> field = value
            }
        }

    init {
        this.damage = damage
    }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}