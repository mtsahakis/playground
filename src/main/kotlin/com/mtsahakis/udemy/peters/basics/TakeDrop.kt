package com.mtsahakis.udemy.peters.basics

fun main() {
    val mySequence = generateSequence(0) {
        val result = it + 10
        println("Calculating $result")
        result
    }

    val firstBatch = mySequence.take(10).toList()
    println(firstBatch)
    val secondBatch = mySequence.take(20).toList()
    println(secondBatch)

}