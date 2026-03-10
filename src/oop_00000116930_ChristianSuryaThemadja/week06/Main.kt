package oop_00000116930_ChristianSuryaThemadja.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = SmartWatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = GoPay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val SmartLamp1 = "Ruang Tamu"
    val SmartSpeaker1 = "Google Nest Dapur"
    val SmartCCTV1 = "Ezviz Garasi"

    val hub = SmartHomeHub()
    hub.addDevice(SmartLamp("1", SmartLamp1))
    hub.addDevice(SmartSpeaker("1", SmartSpeaker1))
    hub.addDevice(SmartCCTV("1", SmartCCTV1))

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}