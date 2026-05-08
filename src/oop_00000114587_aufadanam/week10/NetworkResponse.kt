package oop_00000114587_aufadanam.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)