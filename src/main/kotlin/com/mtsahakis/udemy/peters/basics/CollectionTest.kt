package com.mtsahakis.udemy.peters.basics

import kotlin.random.Random

fun main() {
    val list = mutableListOf<Int>()

    for (i in 1..100) {
        list.add(Random.nextInt(1, 100))
    }

    var index = 0
    while (index < list.size && list[index] > 10) {
        println(list[index])
        index++
    }

    // get the last value from a map
    val map: MutableMap<Int, String> = mutableMapOf()
    map[1] = "One"
    val iterator = map.iterator()
    var last = iterator.next()
    while (iterator.hasNext()) {
        last = iterator.next()
    }
    println(last)
}