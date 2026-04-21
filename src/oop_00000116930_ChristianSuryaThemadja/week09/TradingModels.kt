package oop_00000116930_ChristianSuryaThemadja.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String)