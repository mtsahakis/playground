package com.mtsahakis.udemy.basics

fun main(args: Array<String>) {
    print("Enter your name: ")
    val input = readLine()
    val enteredName = !input.isNullOrBlank()
    val message = if (enteredName) {
        "Hi $input"
    } else {
        "Hi anonymous user"
    }
    println(message)
}