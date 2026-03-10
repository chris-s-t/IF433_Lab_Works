package oop_00000116930_ChristianSuryaThemadja.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}