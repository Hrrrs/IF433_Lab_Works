package oop_00000114587_aufadanam.week04

open class Employee(val name: String,val baseSalary: Int) {

    open fun work(){
        println("$name sedang gawe.")
    }

    open fun calculateBonus(): Int {
        // Menghitung 10% dari baseSalary
        return (baseSalary * 0.1).toInt()
    }
}