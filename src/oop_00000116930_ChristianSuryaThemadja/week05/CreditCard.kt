package oop_00000116930_ChristianSuryaThemadja.week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Credit Card ${accountName} berhasil digunakan.")
        } else if (usedAmount > limit) {
            println("Maaf ${accountName}, limit anda sudah terpenuhi.")
        } else {
            println("Gagal menggunakan Credit Card karena error.")
        }
    }
}