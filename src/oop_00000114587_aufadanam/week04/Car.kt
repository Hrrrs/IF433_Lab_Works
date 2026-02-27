package oop_00000114587_aufadanam.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
}