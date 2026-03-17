package oop_00000116930_ChristianSuryaThemadja.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> "Monster Muncul"
        is BattleState.LootDroped -> "Mendapat Loot: ${event.item.name} dengan rarity ${event.item.rarity}"
        is BattleState.GameOver -> "Game Over"
        is BattleState.SafeZone -> "Safe Zone"
    }
}