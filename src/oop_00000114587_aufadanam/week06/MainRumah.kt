package oop_00000114587_aufadanam.week06

fun main() {
    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val googleNest = SmartSpeaker("S01", "Google Nest Dapur")
    val ezvizGarasi = SmartCCTV("C01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    // Menambahkan perangkat ke Hub
    hub.addDevice(lampuTamu)
    hub.addDevice(googleNest)
    hub.addDevice(ezvizGarasi)

    // Eksekusi skenario
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}