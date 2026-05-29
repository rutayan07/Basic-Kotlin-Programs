fun main() {
    var num = readln().toInt()
    var count = 0

    while(num != 0) {
        num /= 10
        count++
    }

    println("Digits = $count")
}