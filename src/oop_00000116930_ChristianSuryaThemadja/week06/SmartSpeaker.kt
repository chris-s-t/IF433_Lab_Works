package oop_00000116930_ChristianSuryaThemadja.week06

class SmartSpeaker(override val id: String, override val name:String): SmartDevice, Switchable {
    override fun turnOn() { println("Smart speaker dinyalakan.") }
    override fun turnOff() { println("Smart speaker dimatikan.") }

    fun playMusic(song: String) { println("Memutar lagu $song dari Spotify.") }
}