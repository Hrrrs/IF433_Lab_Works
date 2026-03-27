package oop_00000114587_aufadanam.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()
}