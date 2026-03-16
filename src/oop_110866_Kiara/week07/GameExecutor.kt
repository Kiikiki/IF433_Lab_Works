package oop_110866_Kiara.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("You encountered a monster!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("An item dropped! Loot acquired: ${item.name} (Rarity: ${item.rarity})")
        }
        is BattleState.GameOver -> {
            println("GAME OVER! You died because ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("You entered the safe zone. Your safe now")
        }
    }
}