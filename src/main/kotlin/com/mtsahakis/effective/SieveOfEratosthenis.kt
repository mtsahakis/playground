package com.mtsahakis.effective

fun main() {
    primesWithList()
}

fun primesWithList() {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val first = numbers.first()
        primes.add(first)
        numbers = numbers.filter { it % first != 0 }
        println("current numbers: $numbers")
    }
    println("primes: $primes")
}