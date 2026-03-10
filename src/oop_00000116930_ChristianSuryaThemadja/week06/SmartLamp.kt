package oop_00000116930_ChristianSuryaThemadja.week06

class SmartLamp(override val id: String, override val name:String): SmartDevice, Switchable {
    override fun turnOn() { println("Smart lamp dinyalakan.") }
    override fun turnOff() { println("Smart lamp dimatikan.") }
}