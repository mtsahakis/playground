package com.mtsahakis.quiz

fun printMultiples(num: Int) {
    check(num > 0) { "Invalid argument: $num" }
    for (i in 1..num) {
        when {
            i % 6 == 0 -> println("$i divides by six")
            i % 3 == 0 -> println("$i divides by three")
            i % 2 == 0 -> println("$i divides by two")
            else -> println("$i")
        }
    }
}

fun main() {
    printMultiples(10)
//    printMultiples(20)
//    printMultiples(30)
//    printMultiples(0)
//    printMultiples(1)
}