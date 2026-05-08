package oop_00000114587_aufadanam.week11

data class User(val name: String, var age: Int = 0)

fun main () {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name= "Alex"
        age = 25
    }
    println(user)
}