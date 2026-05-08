package oop_00000114587_aufadanam.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)

fun <T : NamedEntity> WalletRepository<T>.searchByName(query: String): List<T> {
    return getAll().filter { it.name.contains(query, ignoreCase = true) }
}