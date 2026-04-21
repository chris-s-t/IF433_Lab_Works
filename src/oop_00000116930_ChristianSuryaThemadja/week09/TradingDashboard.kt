package oop_00000116930_ChristianSuryaThemadja.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 5, -8.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 25.0, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 15, -15.7, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 30, 40.2, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}