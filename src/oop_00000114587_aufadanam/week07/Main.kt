package oop_00000114587_aufadanam.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("sama? ${reg1 == reg2}") // False
}