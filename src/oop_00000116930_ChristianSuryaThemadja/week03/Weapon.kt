package oop_00000116930_ChristianSuryaThemadja.week03

class Weapon (val name: String){

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
            } else if (value > 1000) {
                println("Damage terlalu OverPowered! Max: 1000")
                field = 1000
            }
        }

    val tier: String
        get() {
            if (damage > 800) {
                return "Legendary"
            } else if (damage > 500) {
                return "Epic"
            } else {
                return "Common"
            }
        }
}