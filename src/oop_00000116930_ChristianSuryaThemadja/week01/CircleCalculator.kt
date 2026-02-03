package oop_00000116930_ChristianSuryaThemadja.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}

fun checkSize(area: Double): String = if (area > 100) return("This is a Big Circle") else return("This is a Small Circle")