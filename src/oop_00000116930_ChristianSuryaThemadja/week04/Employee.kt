package oop_00000116930_ChristianSuryaThemadja.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return ((baseSalary) - (baseSalary*0.01)).toInt()
    }
}