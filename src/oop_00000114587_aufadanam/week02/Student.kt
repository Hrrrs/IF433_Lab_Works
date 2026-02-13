package oop_00000114587_aufadanam.week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0,
) {
    init {
        // Validasi sederhana
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM $nim yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek Student $name berhasil dibuat di memory")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated" ){
        println("LOG: Menggunakan constructor jalur umum(tanpa Jurusan).")
    }
}