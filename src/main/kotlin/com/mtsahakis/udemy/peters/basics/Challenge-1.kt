package com.mtsahakis.udemy.peters.basics

val data = mapOf(
    "users1.csv" to listOf(32, 45, 17, -1, 34),
    "users2.csv" to listOf(19, -1, 67, 22),
    "users3.csv" to listOf(),
    "users4.csv" to listOf(56, 32, 18, 44)
)

fun main() {
    averageAge()
    faultyFiles()
    faultyEntries()
}

fun averageAge() = data.values.flatten().filter { it >= 0 }.average()

fun faultyFiles() = data.filter { it.value.any { it < 0 } }.map { it.key }

fun faultyEntries() = data.flatMap { it.value }.filter { it < 0 }.size

