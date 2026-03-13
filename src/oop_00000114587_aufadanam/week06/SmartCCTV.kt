package oop_00000114587_aufadanam.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name aktif.")
        startRecord() // Memanggil otomatis saat menyala
    }

    override fun turnOff() {
        println("CCTV $name dinonaktifkan.")
    }

    override fun startRecord() {
        println("CCTV $name: Mulai merekam video...")
    }
}