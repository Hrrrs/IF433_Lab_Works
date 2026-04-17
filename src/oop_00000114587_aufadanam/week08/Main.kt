package oop_00000114587_aufadanam.week08

fun main() {
    println("=== TEST SAFE CALS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        //Blok ini Hanya jalan jika totalPrice tidak NULL
        val tax = price* 0.11
        "Transaksi Valid. Harga: Rp$price, pajak: RP$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        //Hanya cetak jika cast sukses (text tidak null)
        text?.let {
            println("ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any =100 // tipe aslinya integer
    // Coba cast ke string. Jika gagal (null), ganti dengan "Unknown String"
    val safeString = someObject as? String ?: "Unknown String"
    println(" Hasil cast + fallback: $safeString")
    //program berhasil di eksekusi

    println("\n=== TEST THE RED BUTTON (!!) ===")
    val toxicData : String? = null
    try {
        //DANGEROUS: Memaksa compiler percaya data ini tidak null
        val length = toxicData!!.length
    }catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("stat" to "200", "token" to null)
    try {
        //Alih-alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["token"]){
            "CRITICAL EXCEPTION: token otentikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumentException) {
        println(e.message) // mencetak pesan custom kita bukan crash buta
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    //kita menekan tombol !! karena KITA TAHU implementasi Javanya aman
    val statusLength = javaResponse!!.length
    println("status dari Java: $javaResponse (Length: $statusLength)")

    runMockUnitTests()
}