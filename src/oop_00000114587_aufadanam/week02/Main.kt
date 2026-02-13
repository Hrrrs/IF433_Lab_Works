package oop_00000114587_aufadanam.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("masukan nama anda: ")
    val name = scanner.nextLine()

    print("masukan NIM anda (wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine() //bersihkan buffer newline penyakit klasik

    if (nim.length != 5){
        println("ERROR: pendaftaran dibatalkan, NIM harus 5 karakter!")
    } else {
        print("masukan Jurusan anda: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major )
    }
}

