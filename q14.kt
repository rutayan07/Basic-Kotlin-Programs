fun main() {
    val n = readln().toInt()

    for(num in 2..n) {
        var isPrime = true

        for(i in 2 until num) {
            if(num % i == 0) {
                isPrime = false
                break
            }
        }

        if(isPrime) {
            print("$num ")
        }
    }
}