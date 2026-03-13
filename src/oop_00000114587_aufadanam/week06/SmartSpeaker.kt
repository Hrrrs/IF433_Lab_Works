package oop_00000114587_aufadanam.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker $name sekarang aktif.")
    }

    override fun turnOff() {
        println("Speaker $name masuk ke mode standby.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}