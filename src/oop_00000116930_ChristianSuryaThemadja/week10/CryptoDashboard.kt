package oop_00000116930_ChristianSuryaThemadja.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 5.0))
    coinRepo.add(Coin("ETH", 20.0))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== Response Setiap Koin ===")
    response.data.forEach { Coin ->
        println("Nama: ${Coin.name}, Saldo: ${Coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX1", 250.0))
    txRepo.add(Transaction("TX2", 500.0))
    txRepo.add(Transaction("TX3", 750.0))

    val responseTransaction = ApiResponse("200 OK", txRepo.getAll())

    println("\n=== Response Setiap Transaksi ===")
    responseTransaction.data.forEach { tx ->
        println("ID: ${tx.id}, Saldo: ${tx.amount}")
    }
}