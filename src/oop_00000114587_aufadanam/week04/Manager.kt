package oop_00000114587_aufadanam.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Mengambil 10% dari superclass (Employee) dan menambah Rp 500.000
        return super.calculateBonus() + 500000
    }
}