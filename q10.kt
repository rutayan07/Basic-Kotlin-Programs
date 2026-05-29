fun check(ch: Char) {
    when(ch.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> println("Vowel")
        else -> println("Consonant")
    }
}

fun main() {
    check('e')
}