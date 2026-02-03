package oop_00000116930_ChristianSuryaThemadja.week01

fun main() {
    val gameTitle: String = "Game-Gamean"
    val price: Int = 525000
    val finalPrice: Int = calculateDiscount(price)

    printReceipt(gameTitle, price, finalPrice)

}

fun calculateDiscount(price: Int): Int = if (price>500000) return (price*0.8).toInt() else return (price*0.9).toInt()

fun printReceipt(title: String, price: Int, finalPrice: Int) = println("Game dengan judul $title seharga $price diskon menjadi $finalPrice")