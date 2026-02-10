package oop_00000116930_ChristianSuryaThemadja.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Pilih API/GAME ---")
    println("1. API PMB UMN")
    println("2. API LIBRARY UMN")
    println("3. GAME MINI RPG BATTLE")

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
    } else if (api == 3) {
        println("--- GAME MINI RPG BATTLE ---")

        print("Masukkan Nama Hero: ")
        val name  = scanner.nextLine()

        print("Masukkan Damage Hero: ")
        val baseDamage = scanner.nextInt()
        scanner.nextLine()

        var enemyHP = 100
        val hero = Hero(name = name, baseDamage = baseDamage)

        while (hero.isAlive() && enemyHP > 0) {
            println("Pilih Aksi: ")
            println("1. Serang")
            println("2. Kabur")

            val pilihan = scanner.nextInt()

            scanner.nextLine()

            if (pilihan == 1) {
                enemyHP -= baseDamage
                hero.attack(targetName = "Enemy")
                if (enemyHP < 0) enemyHP = 0
                println("Enemy HP: ${enemyHP + baseDamage} > $enemyHP (-${baseDamage})")
                if (enemyHP > 0) {
                    val enemyDamage = (10..20).random()
                    hero.takeDamage(enemyDamage)
                    println("Musuh menyerang balik! HP Hero: ${hero.hp + enemyDamage} > ${hero.hp} (-${enemyDamage})")
                }
            } else if (pilihan == 2) {
                println("Hero Kabur!")
                break
            } else {
                println("Pilihan ngawur, aksi tidak terdefinisi oleh Game Master!")
                break
            }
        }

        if (hero.hp > enemyHP) {
            println("Hero $name memenangkan pertarungan! Sisa HP: ${hero.hp}")
        } else if (hero.hp < enemyHP) {
            println("Enemy memenangkan pertarungan! Sisa HP $enemyHP")
        } else {
            println("Gak ada yang menang! Tamat kan saja lah...")
        }
    } else {
        print("Pilihan ngawur, masuk api batal!")
    }
}