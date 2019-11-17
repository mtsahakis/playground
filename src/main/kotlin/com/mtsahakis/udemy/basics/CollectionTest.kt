package com.mtsahakis.udemy.basics

import kotlin.random.Random

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()

    for (i in 1..100) {
        list.add(Random.nextInt(1, 100))
    }

    var index = 0
    while (index < list.size && list[index] > 10) {
        println(list[index])
        index++
    }
}