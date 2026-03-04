package oop_00000116930_ChristianSuryaThemadja.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("------------------------")
    println("\n=== Pembantu Perhitungan Matematika ===")

    val PembantuMatematika = MathHelper()
    println("Sisi x Sisi = 10 x 10 => ${PembantuMatematika.hitungLuas(10)}")
    println("Panjang x Lebar = 10 x 5 => ${PembantuMatematika.hitungLuas(10, 5)}")
    println("Pi * Jari-Jari^2 = 3.14 * (5.5)^2 => ${PembantuMatematika.hitungLuas(5.5)}")

    println("------------------------")
    println("\n=== Sistem Pembayaran ===")

    val DompetDigital = EWallet("Kevin", 50000.0)
    val KartuKredit = CreditCard("Adam", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(DompetDigital, KartuKredit)

    for (pembayaran in daftarPembayaran) {
        if (pembayaran is EWallet) {
            pembayaran.topUp(50000.0)
        }
        pembayaran.processPayment(75000.0)
    }
}