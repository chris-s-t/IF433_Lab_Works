package oop_00000116930_ChristianSuryaThemadja.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is Ready")
    }
}