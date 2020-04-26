package com.mtsahakis.arrays

fun findMissingNumberNoDuplicates(arr: IntArray, high: Int): Int {
    val expectedSum = (1..high).sum()
    val actualSum = arr.sum()
    return expectedSum - actualSum
}

fun main() {
    println(findMissingNumberNoDuplicates(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 10))
}