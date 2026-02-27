package oop_00000114587_aufadanam.week04

fun main () {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("sepeda onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() //Memanggil method milik sendiri
    myCar.honk()      //Memanggil method yg sudah di-override
    myCar.accelerate()//Memanggil gabungan method Parent dan Child

    println("\n--- Testing ElectricCar ---")
    val electricCar = ElectricCar("BYD", 4, 90)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    val manager = Manager("Budi", 10000000)
    val developer = Developer("Aris", 8000000, "Kotlin")

    println("--- Status Manager ---")
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")

    println("\n--- Status Developer ---")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
}