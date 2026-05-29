fun reverse(num: Int) : Int {
    var n = num
    var rev = 0
    while (n != 0) {
        val digit = n % 10
        rev = rev*10 + digit
        n = n / 10
    }
    return rev
}

fun main() {
    val num = readln().toInt()
    println(reverse(num))
}