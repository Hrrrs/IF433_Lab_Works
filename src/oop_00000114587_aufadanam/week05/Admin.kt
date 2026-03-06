package oop_00000114587_aufadanam.week05

class Admin(nama: String) : Pegawai (nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk didepan komputer melayani administrasi")
    }

    //fungsi unik yang hanya dimiliki admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}