package com.mtsahakis.strings

inline fun isPalindrome(str: String, reverse: (String) -> String) = str == reverse(str)

fun reverseIterative(str: String): String {
    val charArray = str.toCharArray()
    for (index in 0 until charArray.size / 2) {
        var ch = charArray[index]
        charArray[index] = charArray[charArray.size - 1 - index]
        charArray[charArray.size - 1 - index] = ch
    }
    return String(charArray)
}

fun reverseRecursion(str: String): String {
    if (str.isEmpty()) return str
    return str.last() + reverseRecursion(str.substring(0 until str.length - 1))
}

fun main() {
    println(isPalindrome("I am manos") { reverseIterative(it) })
    println(isPalindrome("aabaa") { reverseIterative(it) })
    println(isPalindrome("acbca") { reverseIterative(it) })

    println(isPalindrome("I am manos") { reverseRecursion(it) })
    println(isPalindrome("aabaa") { reverseRecursion(it) })
    println(isPalindrome("acbca") { reverseRecursion(it) })
}