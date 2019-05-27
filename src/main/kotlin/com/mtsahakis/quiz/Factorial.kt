package com.mtsahakis.quiz

fun iterativeFactorialFor(num: Int): Int {
    if (num < 0) {
        throw IllegalArgumentException("factorial input cannot be negative")
    }

    var result = 1

    for (i in 1..num) {
        result *= i
    }

    return result
}

fun iterativeFactorialWhile(num: Int): Int {
    if (num < 0) {
        throw java.lang.IllegalArgumentException("factorial input cannot be negative")
    }

    var result = 1
    var i = 1

    while (i <= num) {
        result *= i
        i++
    }

    return result
}

fun recursiveFactorial(num: Int): Int {
    if (num < 0) {
        throw java.lang.IllegalArgumentException("factorial input cannot be negative")
    }

    if (num == 0 || num == 1) {
        return 1
    }

    return num * recursiveFactorial(num - 1)
}