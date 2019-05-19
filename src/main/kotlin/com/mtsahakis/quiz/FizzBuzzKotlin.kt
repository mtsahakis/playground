package com.mtsahakis.quiz

fun process(input: Int): String {
    return when {
        input % 15 == 0 -> "FizzBuzzJava"
        input % 5 == 0 -> "Fizz"
        input % 3 == 0 -> "Buzz"
        else -> input.toString()
    }
}