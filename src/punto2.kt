//punto 2

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age <= 12 -> 15
        age in 13..60 && isMonday -> 25
        age in 13..60 -> 30
        age >= 61 && age <= 100 -> 20
        else -> -1
    }
}
