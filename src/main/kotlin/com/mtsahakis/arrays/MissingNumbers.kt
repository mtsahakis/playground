package com.mtsahakis.arrays

/**
 * 1..N
 */
fun findMissingNumbers(arr: IntArray): IntArray {
    // first we sort the array
    arr.sort()
    val first = arr.first()
    val last = arr.last()
    val result = IntArray(last - 1)

    // case the array does not start with one
    var index = 0
    if (first != 1) {
        for (i in 1 until first) {
            result[index] = i
            index++
        }
    }

    // the rest
    for (i in 0 until arr.size - 1) {
        val difference = arr[i + 1] - arr[i]
        if (difference > 1) {
            val start = arr[i] + 1
            val end = arr[i + 1]
            for (i in start until end) {
                result[index] = i
                index++
            }
        }
    }

    return result.filter { it != 0 }.toIntArray()
}

fun main() {
    println(findMissingNumbers(intArrayOf(2, 3)).contentToString())
    println(findMissingNumbers(intArrayOf(5, 3)).contentToString())
    println(findMissingNumbers(intArrayOf(1, 3)).contentToString())
    println(findMissingNumbers(intArrayOf(13, 12)).contentToString())
}