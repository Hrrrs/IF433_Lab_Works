package oop_00000114587_aufadanam.week01

fun main (args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("radius: $radius, area: $area")

    checkSize(area)
}

fun checkSize(area: Double){
    if (area > 100){
        println("this is a Big Circle")
    } else {
        println("this is a Small Circle")
    }
}