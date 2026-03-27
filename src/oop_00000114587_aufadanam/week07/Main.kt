package oop_00000114587_aufadanam.week07

fun main() {
//    println("=== TEST SINGLETON ===")
//    println("status: ${DatabaseManager.connectionStatus}")
//    DatabaseManager.connect()
//
//    println("\n=== TEST REGULAR CLASS ===")
//    val reg1 = RegularUser("Alice", 22)
//    val reg2 = RegularUser("Alice", 22)
//    println(reg1) // Akan mencetak memori hash
//    println("sama? ${reg1 == reg2}") // False
//
//    println("\n=== TEST DATA CLASS ===")
//    val data1 = DataUser ("Alice", 22)
//    val data2 = DataUser("Alice", 22)
//    println(data1)
//    println("sama? ${data1 == data2}")
//
//    val data3 = data1.copy(age = 23)
//    println("Hasil Copy: $data3")
//
//    val (userName, age) = data1 // destructuring declaration
//    println("destructured: $userName berumur $userName")
//
//    println("\n=== TEST SEALED CLASS ===")
//    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
//
//    val uiMessage = when(response) {
//        is ApiResponse.Loading -> "Tampilkan Spinner"
//        is ApiResponse.Success -> "Tampilkan : ${response.data}"
//        is ApiResponse.Error -> "Tampilkan : ${response.message}"
//    }
//    println(uiMessage)
    GameManager.startGame()
    GameManager.startGame()
    // 8. Simulasi Factory & Enum
    println("Drop chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Durability: ${starterWeapon.durability}")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}