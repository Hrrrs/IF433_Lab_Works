package oop_00000114587_aufadanam.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("connect to $url...")
    }
}