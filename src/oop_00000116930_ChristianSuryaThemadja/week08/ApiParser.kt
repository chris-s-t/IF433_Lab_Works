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

    if (type == "ELECTRONIC" && id != null) {
        val warrantyMonths = rawJson["warrantyMonths"] as? Int ?: 12
        return Product.Electronic(id, name, warrantyMonths)
    } else if (type == "CLOTHING" && id != null) {
        val size = rawJson["size"] as? String ?: "All Size"
        return Product.Clothing(id, name, size)
    } else {
        return null
    }
}

fun checkout(product: Product) {
    val id = when (product) {
        is Product.Electronic -> {product.id}
        is Product.Clothing -> {product.id}
    }
    val transid = JavaPaymentService.processPayment(id)!!
    println("Transaction ID: $transid")
    when (product) {
        is Product.Electronic -> {println("${product.name}(Warranty ${product.warrantyMonths})")}
        is Product.Clothing -> {println("${product.name} (Size ${product.size})")}
    }
}