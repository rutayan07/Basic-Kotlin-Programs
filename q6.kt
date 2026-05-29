fun main() {
    val num = readln().toInt()
    var mul = 1
    for (i in 1..num) {
        mul = mul * i
    }
    println("Factorial of $num is $mul")
}