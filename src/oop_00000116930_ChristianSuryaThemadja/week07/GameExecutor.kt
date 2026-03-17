package oop_00000116930_ChristianSuryaThemadja.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Monster Muncul : ${event.monsterName}")
        is BattleState.LootDroped -> println("Mendapat Loot: ${event.item.name} dengan rarity ${event.item.rarity} dan damage ${event.item.damage}")
        is BattleState.GameOver -> println("Game Over : ${event.reason}")
        is BattleState.SafeZone -> println("Safe Zone")
    }
}