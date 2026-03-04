package oop_00000116930_ChristianSuryaThemadja.week05

class MathHelper {
    fun hitungLuas(sisi: Int): Int {
        // s * s
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        // p * l
        return panjang * lebar
    }

    fun hitungLuas(jarijari: Double): Double {
        // pi * jarijari^2
        return 3.14 * jarijari * jarijari
    }
}