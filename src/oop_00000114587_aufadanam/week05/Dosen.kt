package oop_00000114587_aufadanam.week05

class Dosen (nama: String, val nidn: String) : Pegawai(nama) {
    // Wajib di override karena fungsi bekerja abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    //Fungsi unik/spesifik yang hanya dimiliki dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa dikelas.")
    }
}