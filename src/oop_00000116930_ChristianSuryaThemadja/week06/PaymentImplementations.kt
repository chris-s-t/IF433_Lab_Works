package oop_00000116930_ChristianSuryaThemadja.week06

class GoPay: PaymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via GoPay Server") }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}