package oop_00000116930_ChristianSuryaThemadja.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warrantyMonths" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warrantyMonths" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    for (raw in rawApiData) {
        try {
            val product = parseProduct(raw)
            product?.let {
                checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Data $raw is Corrupted")
        }
    }
    println("Thank you")
}