package com.mtsahakis.arrays

fun findMissingMultipleNumbersWithDuplicates(arr: IntArray) {

    // { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 }

    val register = IntArray(arr.size)
    for (num in arr) {
        register[num] = 1
    }

    for (i in 1 until arr.size) {
        if (register[i] == 0) {
            println(i)
        }
    }
}

fun main() {
    findMissingMultipleNumbersWithDuplicates(intArrayOf(1, 1, 2, 3, 5, 5, 7, 9, 9, 9))
}