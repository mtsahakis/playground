package com.mtsahakis.performance

fun averageOnIntList() {
    val list = List(1_000_000) { it }
    list.average()
}

fun averageOnIntArray() {
    val array = IntArray(1_000_000) { it }
    array.average()
}