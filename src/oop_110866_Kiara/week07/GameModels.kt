package oop_110866_Kiara.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(50), UNCOMMON(20), RARE(15), EPIC(10), LEGENDARY(5)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)