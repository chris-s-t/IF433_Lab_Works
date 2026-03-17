package oop_00000116930_ChristianSuryaThemadja.week07

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String): BattleState()
    data class LootDroped(val item: GameItem): BattleState()
    data class GameOver(val reason: String): BattleState()
    object SafeZone: BattleState()
}