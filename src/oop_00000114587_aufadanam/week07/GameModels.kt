package oop_00000114587_aufadanam.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(9),
    EPIC(5),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)