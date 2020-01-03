package com.mtsahakis.udemy.peters.basics

inline fun performOperation(str: String, operation: (String) -> String) : String {
    return operation(str)
}

fun main() {
    val result = performOperation("Hi") { it.toUpperCase() }
    println(result)
}