
// Punto 1

fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(notifications: Int) {
    if (notifications < 100) {
        println("You have $notifications notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
