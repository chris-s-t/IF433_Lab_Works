package oop_00000116930_ChristianSuryaThemadja.week08

fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val id = requireNotNull(rawJson["id"] as? String) {
        "API Invalid: Missing ID"
        IllegalArgumentException()
    }
    val name = requireNotNull(rawJson["name"] as? String) {
        "API Invalid: Missing Name"
        IllegalArgumentException()
    }

    val type = requireNotNull(rawJson["type"] as? String) {
        "API Invalid: Missing Type"
    }

    if (type == "ELECTRONIC") {
        val warrantyMonths = rawJson["warrantyMonths"] as? Int ?: 12
        return Product.Electronic(id, name, warrantyMonths)
    } else if (type == "CLOTHING") {
        val size = rawJson["size"] as? String ?: "All Size"
        return Product.Clothing(id, name, size)
    } else {
        return null
    }
}