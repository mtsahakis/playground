package com.mtsahakis.udemy.peters.basics

fun main(args: Array<String>) {
    val together = concat(listOf("Kotlin", "Java", "Scala"), ": ")
    println(together)
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)