package oop_00000114587_aufadanam.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerformance()
    //e. performanceRating = 5 // kalau di uncomment error

    //3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}