fun main() {
    print("Enter temperature in Celsius: ")
    val celsius = readLine()!!.toDouble()

    val fahrenheit = (celsius * 9 / 5) + 32
    println("$celsius °C = $fahrenheit °F")

    print("Enter temperature in Fahrenheit: ")
    val fahr = readLine()!!.toDouble()

    val cel = (fahr - 32) * 5 / 9
    println("$fahr °F = $cel °C")
}