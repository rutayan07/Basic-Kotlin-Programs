fun largest(a: Int, b: Int, c: Int) : Int {
    return maxOf(a,b,c)
}

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(largest(a,b,c))
}