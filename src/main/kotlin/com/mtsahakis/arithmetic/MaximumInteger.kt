package com.mtsahakis.arithmetic


fun maxInt(num: Int) {
    val arr = num.toString().chars().map { c -> c.minus('0'.toInt()) }.toArray()
    arr.sortDescending()
    println(arr.toList())
}

fun main() {
    maxInt(123456)
}