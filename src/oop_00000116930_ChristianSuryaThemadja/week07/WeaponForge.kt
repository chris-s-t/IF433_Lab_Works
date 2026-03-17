package oop_00000116930_ChristianSuryaThemadja.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterSword =  GameItem(
                "Pedang Kayu Bapuk",
                5,
                ItemRarity.COMMON
            )
            return Weapon(starterSword, 50)
        }
        fun forgeEpicSword(): Weapon {
            val epicSword =  GameItem(
                "Pedang Besi Alam",
                50,
                ItemRarity.EPIC
            )
            return Weapon(epicSword, 75)
        }
    }
}