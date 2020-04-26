package com.mtsahakis.udemy.peters.basics

fun main() {

    val timesTwo = { x: Int -> x * 2 }

    val add = { x: Int, y: Int -> x + y }

    val list = (1..100).toList()

    println(list.filter { x -> x % 2 == 0 })

    println(list.filter { it % 2 == 0 })

    println(list.filter { it.even() })

    println(list.filter(::isEven))

}

fun isEven(x: Int) = x % 2 == 0

fun Int.even() = this % 2 == 0