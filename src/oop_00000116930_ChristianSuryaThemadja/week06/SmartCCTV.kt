package oop_00000116930_ChristianSuryaThemadja.week06

class SmartCCTV(override val id: String, override val name:String): SmartDevice, Switchable, Recordable {
    override fun startRecord() { println("Smart CCTV mulai merekam.")}

    override fun turnOn() {
        println("Smart CCTV dinyalakan.")
        startRecord()
    }

    override fun turnOff() { println("Smart CCTV dimatikan.") }
}