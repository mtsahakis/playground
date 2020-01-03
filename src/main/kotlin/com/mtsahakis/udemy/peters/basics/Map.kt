package com.mtsahakis.udemy.peters.basics

fun main() {

    // map
    val list = (1..100).toList()
    println(list)
    val double = list.map { it * 2 }
    println(double)
    val average = list.average()
    val averageList = list.map { it - average }
    println(averageList)

    // flat map
    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )
    val notFlattened = nestedList.flatMap { it.sortedDescending() }
    println(notFlattened)
}