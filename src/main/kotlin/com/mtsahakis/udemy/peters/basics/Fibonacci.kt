package com.mtsahakis.udemy.peters.basics

val fibonnaci = sequence {
    yield(1)
    var first = 0
    var second = 1
    while (true) {
        var sum = first + second
        yield(sum)
        first = second
        second = sum
    }
}

fun fibonnaci(num: Int): Int {
    if (num == 0) return 0
    if (num == 1) return 1
    return fibonnaci(num - 1) + fibonnaci(num - 2)
}

val factorial = sequence {
    yield(1)
    var result = 1
    var count = 1
    while (true) {
        result *= count
        yield(result)
        count++
    }
}

fun factorial(num: Int) : Int {
    if (num == 0) return 1
    return num * factorial(num - 1)
}

fun main() {
    fibonnaci.take(10).forEach { println(it) }
    println("#######################")
    println("fibonnaci result: " + fibonnaci(6))
    println("#######################")
    println("factorial result: " + factorial(4))
    factorial.take(10).forEach { println(it) }

}