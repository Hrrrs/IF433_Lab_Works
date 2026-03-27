package oop_00000114587_aufadanam.week07

class DatabaseManager {
    var connectionStatus: String = "Dissconected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("database is ready.")
    }
}