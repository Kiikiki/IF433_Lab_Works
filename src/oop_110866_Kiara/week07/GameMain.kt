package oop_110866_Kiara.week07

fun main() {
    //start game
    GameManager.startGame()
    GameManager.startGame()

    //check LEGENDARY drop chance
    println("Legendary has a ${ItemRarity.LEGENDARY.dropChance}% chance to drop")

    //init sword
    val sword1 = Weapon.forgeStarterSword()
    println("=== Starter Sword ===")
    println("name       : ${sword1.item.name}")
    println("damage     : ${sword1.item.damage}")
    println("rarity     : ${sword1.item.rarity.name}")
    println("durability : ${sword1.durability}")

    //upgrading weapon
    val upgradedSwordStat = sword1.item.copy(damage = 25) //changing the item's damage
    val upgradedSword = Weapon.blacksmith(upgradedSwordStat, sword1.durability) //combining into a weapon

    //testing events
    println("\n=== Events ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Ugly Goblin"))
    processEvent(BattleState.LootDropped(upgradedSwordStat))
    processEvent(BattleState.GameOver("ugly goblin asked you out"))
}