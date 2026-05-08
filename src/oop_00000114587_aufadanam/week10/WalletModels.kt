package oop_00000114587_aufadanam.week10

interface NamedEntity {
    val name: String
}

data class Coin(
    override val name: String,
    val balance: Double
) : NamedEntity

data class Transaction(
    val id: String,
    val amount: Double
)