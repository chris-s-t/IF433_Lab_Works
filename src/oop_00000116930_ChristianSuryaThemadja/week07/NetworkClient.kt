package oop_00000116930_ChristianSuryaThemadja.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}