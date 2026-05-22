package oop_00000114587_aufadanam.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: inisialisasi sistem. \n")
    println("file berhasil dibuat dan ditulis")
}