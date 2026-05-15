package oop_00000114587_aufadanam.week12

fun main () {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}