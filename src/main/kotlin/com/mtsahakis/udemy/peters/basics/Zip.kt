package com.mtsahakis.udemy.peters.basics

fun main() {
    val list = listOf("Hi", "There", "Manos", "Kotlin")
    val result = list.zip(list.map { it.contains('t') })
    println(result)
}