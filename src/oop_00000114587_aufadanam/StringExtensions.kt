package oop_00000114587_aufadanam

fun String.addGreeting (): String {
    return "Hello $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}