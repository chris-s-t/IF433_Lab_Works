package oop_00000116930_ChristianSuryaThemadja.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}