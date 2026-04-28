package oop_00000116930_ChristianSuryaThemadja.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 5.0))
    coinRepo.add(Coin("ETH", 20.0))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
}