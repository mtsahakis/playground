package com.mtsahakis.udemy.peters.basics

val input_for_chaining = listOf(
    mapOf("file1.csv" to listOf(3, 5, -9977, 7, 11, 66)),
    mapOf("file1.csv" to listOf()),
    mapOf("file1.csv" to listOf(1, 3, 4)),
    mapOf("file1.csv" to listOf(9989, 33, 12, 5))
)

fun main() {
    val cleanedList = input_for_chaining.flatMap { it.values }.flatten().filter { it in 1..100 }
    println(cleanedList)
    val cleanedArray = input_for_chaining.flatMap { it.values }.flatten().filter { 1 in 1..100 }.toIntArray()
    println(cleanedArray.joinToString())
}