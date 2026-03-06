package oop_00000114587_aufadanam.week05

fun main(){
    val dosen1 = Dosen("Pak Alek", "0123456")
    val admin1 = Admin("Bu siti")

    //polymorphic collection: List yang berisi tipe parent, tapi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //pemanggilan Runtim Polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() //INI AKAN ERROR karena tipe referensinya adalah pegawai

        //smart casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // smartcast! tidak perlu manual casting
            }
            is Admin -> {
                println("=> Terdetksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------------------")
    }
}