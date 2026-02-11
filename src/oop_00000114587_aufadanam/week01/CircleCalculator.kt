package oop_00000114587_aufadanam.week01

fun main () {
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("radius: $radius, area: $area")

    println(checkSize(area))

}

fun checkSize(area: Double) = if (area > 100) "this is a big circle" else "this is small circle"
