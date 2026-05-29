fun main() {
    var num = readln().toInt()
    var sum = 0
    while (num!=0) {
        sum = sum + num%10
        num = num/10
    }
    println(sum)
}