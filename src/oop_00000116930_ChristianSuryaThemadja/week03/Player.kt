package oop_00000116930_ChristianSuryaThemadja.week03

class Player (val username: String) {
    private var xp: Int = 0

    val level: Int
    get() {
        return (xp/100) + 1
    }

    fun addXp (amount: Int) {
        val temp = level
        if (amount < 0) {
            println("Xp tidak boleh negatif!")
        } else {
            xp += amount
            println("Xp bertambah menjadi $xp")
        }

        if (temp < level) {
            println("Selamat $username naik ke level $level")
        }
    }
}