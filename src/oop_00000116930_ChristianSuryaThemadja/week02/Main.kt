package oop_00000116930_ChristianSuryaThemadja.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Pilih API ---")
    println("1. API PMB UMN")
    println("2. API LIBRARY UMN")

    val api = scanner.nextInt()
    scanner.nextLine()

    if (api == 1) {
        println("--- APLIKASI PMB UMN ---")

        print("Masukkan Nama: ")
        val name  = scanner.nextLine()

        print("Masukkan NIM (Wajib 5 Karakter): ")
        val nim = scanner.next()

        scanner.nextLine()

        if (nim.length != 5) {
            println("ERROR: Pendaftaran dibatalkan. NIM harus 5 Karakter!")
        } else {

            print("Pilih Jalur (1. Reguler, 2. Umum): ")
            val type = scanner.nextInt()
            scanner.nextLine()

            if (type == 1) {
                print("Masukkan Jurusan: ")
                val major = scanner.nextLine()

                val s1 = Student(name, nim, major)
                println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
            } else if (type == 2) {
                val s2 = Student(name, nim)
                println("Terdaftar di ${s2.major} dengan GPA awal ${s2.gpa}")
            } else {
                print("Pilihan ngawur, pendaftaran batal!")
            }

        }
    } else if (api == 2) {
        println("--- APLIKASI LIBRARY UMN ---")

        print("Masukkan Judul: ")
        val bookTitle  = scanner.nextLine()

        print("Masukkan Peminjam: ")
        val borrower = scanner.nextLine()

        print("Masukkan Lama Peminjaman: ")
        var loanDuration = scanner.nextInt()

        scanner.nextLine()

        if (loanDuration < 1) {
            println("ERROR: Lama Peminjaman tidak bisa minus! Otomatis menjadi 1 hari.")
            loanDuration = 1
        }

        val loan = Loan(bookTitle, borrower, loanDuration)
        println("Buku dengan judul $bookTitle yang dipinjam oleh $borrower selama $loanDuration hari terkena denda sebesar ${loan.calculateFine()} Rupiah.")
    } else {
        print("Pilihan ngawur, masuk api batal!")
    }
}