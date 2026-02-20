package oop_00000114587_aufadanam.week03

fun main() {
    val e = Employee("Budi")
    println("--- test error ---")
    e.salary = 5000 //ini akan membuat program meledak
}