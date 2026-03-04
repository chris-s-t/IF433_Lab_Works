package oop_00000116930_ChristianSuryaThemadja.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Saldo ${accountName} sukses dipotong.")
        } else if(balance < amount){
            println("Saldo ${accountName} tidak cukup.")
        } else {
            println("Saldo ${accountName} gagal diisi karena error.")
        }

        if (balance == 0.0) {
            println("Pemberitahuan! Saldo ${accountName} habis.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Saldo ${accountName} berhasil ditambahkan.")
    }
}