package oop_00000116930_ChristianSuryaThemadja.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("BYD", 4, 10)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Manager ---")
    val myManager = Manager("Sugeng", 1000000)
    myManager.work()
    println("Bonus Gaji Manager sebesar ${myManager.calculateBonus()}")

    println("\n--- Developer ---")
    val myDeveloper = Developer("Juling", 1500000, "Kotlin")
    myDeveloper.work()
    println("Bonus Gaji Developer sebesar ${myDeveloper.calculateBonus()}")
}