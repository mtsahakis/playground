package com.mtsahakis.arrays

fun main() {
    val doubleArr = doubleArrayOf(1.0, 2.0)
    println(doubleArr.contentToString())

    listOf(doubleArr)

    val copy = doubleArr.copyOf(3)
    println(copy.contentToString())
}
