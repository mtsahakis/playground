package com.mtsahakis.udemy.peters.basics

import kotlin.system.measureTimeMillis

fun main() {

    val veryLongList = (1..9999999L).toList()

    var sum = 0L
    val ms = measureTimeMillis {
        sum = veryLongList
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()
    }
    println("ms: $ms sum: $sum")

    var lazySum = 0L
    val msLazy = measureTimeMillis {
        lazySum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()
    }
    println("msLazy: $msLazy lazySum: $lazySum")

    val myList = (1..100).toList()
}

