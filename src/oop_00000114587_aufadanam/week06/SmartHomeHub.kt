package oop_00000114587_aufadanam.week06

// CHECKPOINT 17 & 18: create SmartHomeHub logic & implement advanced smart casting
class SmartHomeHub {
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat ---")
        for (device in devices) {
            // Smart Casting menggunakan 'is'
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (device in devices) {
            // Casting ke Recordable
            if (device is Recordable) {
                device.startRecord()
            }
            // Casting ke SmartSpeaker
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}