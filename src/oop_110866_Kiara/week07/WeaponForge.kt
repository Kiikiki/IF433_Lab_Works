package oop_110866_Kiara.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterSword = GameItem("Damaged Wooden Sword", 5, ItemRarity.COMMON)
            return Weapon(starterSword, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicSword = GameItem("Legendary Dragon Sword", 100, ItemRarity.EPIC)
            return Weapon(epicSword, 200)
        }
    }
}