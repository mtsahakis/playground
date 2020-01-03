package com.mtsahakis.udemy.peters.basics

fun main() {
    val possiblePrimesAfterTwo = generateSequence(3) { it + 2 } // 3,5,7,9
    val primes = generateSequence(2 to possiblePrimesAfterTwo) {
        val possiblePrime = it.second.first()
        val possiblePrimes = it.second.filter { it % possiblePrime != 0 }
        possiblePrime to possiblePrimes
    }.map { it.first }

    println(primes.take(100).toList())
}