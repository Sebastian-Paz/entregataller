//punto 3

fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius -> celsius * 9/5 + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin -> kelvin - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit -> (fahrenheit - 32) * 5/9 + 273.15 }
}

fun printFinalTemperature(
    initialTemperature: Double,
    initialUnit: String,
    finalUnit: String,
    conversion: (Double) -> Double
) {
    val finalTemperature = conversion(initialTemperature)
    println("$initialTemperature degrees $initialUnit is %.2f degrees $finalUnit.".format(finalTemperature))
}
