fun palindrome(num: Int) : Int {
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
    val a = palindrome(num)
    if (num == a) println("Palindrome")
    else println("Not Palindrome")
}